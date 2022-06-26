package com.maintenance.maintenancemonitor.dao;

public class Storage {
    private static String message = "";

    public static String getMessage() {
        return message;
    }

    public static void setMessage(String message) {
        Storage.message = message;
    }
}
