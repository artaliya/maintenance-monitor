package com.maintenance.maintenancemonitor;

import com.maintenance.maintenancemonitor.service.MonitorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MonitorServiceImplTest {

    @Autowired
    private MonitorService monitorService;

    @Test
    void contextLoads() {
        assertThat(monitorService).isNotNull();

    }

    @Test
    void setMessageTest() {
        String expected = "Test name";

        monitorService.setMessage(expected);
        String actual = monitorService.getMessage();

        assertEquals(expected, actual);
    }

    @Test
    void getMessageTest() {
        String expected = "";

        monitorService.setMessage(expected);
        String actual = monitorService.getMessage();

        assertEquals(expected, actual);
    }

    @Test
    void resetMessageTest() {
        String newName = "New Name";
        String expected = "";

        monitorService.setMessage(newName);
        monitorService.resetMessage();

        String actual = monitorService.getMessage();

        assertEquals(expected, actual);
    }
}
