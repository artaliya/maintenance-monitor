package com.maintenance.maintenancemonitor.controller;

import com.maintenance.maintenancemonitor.dao.MessageDto;
import com.maintenance.maintenancemonitor.service.MonitorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping
@RequiredArgsConstructor
public class MonitorController {
    private final MonitorService monitorService;

    @GetMapping("/message")
    public ResponseEntity<MessageDto> getMessage() {
        return new ResponseEntity<>(
                new MessageDto(monitorService.getMessage()), HttpStatus.OK);
    }

    @PostMapping("/resetMessage")
    public ResponseEntity<String> resetMessage() {
        monitorService.resetMessage();
        return ResponseEntity.ok("The message is reset");
    }

    @PostMapping("/message")
    public ResponseEntity<String> setMessage(@RequestParam("message") String message) {
        monitorService.setMessage(message);
        return ResponseEntity.ok("The message is set");
    }
}
