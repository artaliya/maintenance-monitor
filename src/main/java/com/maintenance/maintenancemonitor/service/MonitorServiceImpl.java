package com.maintenance.maintenancemonitor.service;

import com.maintenance.maintenancemonitor.dao.Storage;
import org.springframework.stereotype.Service;

@Service
public class MonitorServiceImpl implements MonitorService {

    @Override
    public void resetMessage() {
        Storage.setMessage("");
    }

    @Override
    public String getMessage() {
        return Storage.getMessage();
    }

    @Override
    public void setMessage(String message) {
        Storage.setMessage(message);
    }
}
