package it.linksmt.springboot.demo.mycoolapp.rest;

import it.linksmt.springboot.demo.mycoolapp.test.TestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //manage url routes
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello() {
        TestController provider = new TestController();
        return provider.sayHello(coachName);
    }

    // public String sayHello() {
    //     return "Hello World";
    // }

    @GetMapping("/daily")
    public String sayStuKez() {
        return "just a new string on new endpoint";
    }

    @GetMapping("/team")
    public String getTeamName() {
        return "Team: " + teamName;
    }
    @GetMapping("/coach")
    public String getCoachName() {
        return "Coach: " + coachName;
    }
}
