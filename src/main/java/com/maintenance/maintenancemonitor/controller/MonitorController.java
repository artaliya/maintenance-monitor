package com.maintenance.maintenancemonitor.controller;

import com.maintenance.maintenancemonitor.service.MonitorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class MonitorController {
    private final MonitorService monitorService;

    @GetMapping("/message")
    public String getMessage() {

        return monitorService.getMessage();
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
