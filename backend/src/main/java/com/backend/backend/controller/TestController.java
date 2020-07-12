package com.backend.backend.controller;
import com.backend.backend.model.User_Profile;
import com.backend.backend.repository.UsersRepository;
import com.backend.backend.repository.User_ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Profiles;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.backend.backend.payload.ProfileResponce;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController

@RequestMapping("/api/test")
public class TestController {
    @Autowired
    UsersRepository userRepository;

    @Autowired
    User_ProfileRepository user_profileRepository;


    @GetMapping("/all")

    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('VOLUNTER') or hasRole('RESTAURENT')")
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("/volunter")
   @PreAuthorize("hasRole('VOLUNTER')")
    public String moderatorAccess() {
        return "Volunter";
    }

    @GetMapping("/restaurent")
    @PreAuthorize("hasRole('RESTAURENT')")
    public String restaurentAccess() {
        return "Restaurent Board.";
    }
    @GetMapping("/charity")
    @PreAuthorize("hasRole('CHARITY')")
    public String charityAccess() {
        return "Charity Board.";
    }
    @PostMapping("/addprofile")
    @PreAuthorize("hasRole('CHARITY')or hasRole('VOLUNTER') or hasRole('RESTAURENT')")
    public ResponseEntity<User_Profile> addProfile(@RequestBody User_Profile profile) {
        try {
            User_Profile _profile = user_profileRepository
                    .save(new User_Profile(profile.getUserid(), profile.getUser_role(), profile.getEmail(),profile.getZipcode(),profile.getOrganisation_name(),profile.getPhone_number(),profile.getStreat(),profile.getApt_number()));
            return new ResponseEntity<>(_profile, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
    @GetMapping("/profile/{id}")
    @PreAuthorize("hasRole('CHARITY')or hasRole('VOLUNTER') or hasRole('RESTAURENT')")
    public ResponseEntity<?> getTutorialById(@PathVariable("id") long id) {
        Optional<User_Profile> profiledata =  user_profileRepository.findByuserid(id);
        String msg ;
        if (profiledata.isPresent()) {
            return new ResponseEntity<>(profiledata.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>( "not found data",HttpStatus.OK);
        }
    }


}
