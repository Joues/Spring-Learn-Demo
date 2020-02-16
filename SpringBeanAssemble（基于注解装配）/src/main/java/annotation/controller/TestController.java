package annotation.controller;

import annotation.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    @Autowired
    private TestService testService;

    public void save() {
        testService.save();
        System.out.println("testController save");
    }
}
