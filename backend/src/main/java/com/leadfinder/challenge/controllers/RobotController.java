package com.leadfinder.challenge.controllers;

import com.leadfinder.challenge.services.IRobotService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RobotController {

    final IRobotService _robotService;

    public RobotController(IRobotService robotService) {
        this._robotService = robotService;
    }

    @PostMapping("/mars/{command}")
    public ResponseEntity mars(@PathVariable String command) {
        this._robotService.setX(0);
        this._robotService.setY(0);
        this._robotService.setDirection('N');
        if(this._robotService.validateCommands(command) == false) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid command.");
        }
        try{
        String coordinates = this._robotService.handleCoords(command);
        return ResponseEntity.status(HttpStatus.OK).body(coordinates);
        } catch(Error err) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid moviments.");
        }
    }
}
