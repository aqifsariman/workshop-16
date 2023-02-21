package ibf2022.ssf.day16.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.json.Json;
import jakarta.json.JsonObject;

@RestController
@RequestMapping(path = "/rsvp", produces = MediaType.APPLICATION_JSON_VALUE)
public class RSVPController {
    private Logger logger = Logger.getLogger(RSVPController.class.getName());

    // ! IMPORTANT !
    // POST /rsvp
    // Content-Type: application/x-www-form-urencoded
    // Accept: appplication/json

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<String> postAsForm(@RequestBody MultiValueMap<String, String> form) {

        String name = form.getFirst("name");
        Boolean attendingInBoolean = Boolean.parseBoolean(form.getFirst("attending"));

        logger.log(Level.INFO, ">>> Name: %s, Attending: %b".formatted(name, attendingInBoolean));

        // 201 Created
        // Content-Type: application/json
        //
        // {"message": "Received <name> RSVP", "attending": true/false} send back
        JsonObject payload = Json.createObjectBuilder().add("message", "Received %s RSVP".formatted(name))
                .add("attending", attendingInBoolean)
                .build();
        return ResponseEntity
                .status(201)
                .body(payload.toString());
    }

}
