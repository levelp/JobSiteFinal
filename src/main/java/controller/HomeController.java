package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
        return "hello";
    }

    @RequestMapping(value = "/add")
    public String add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return "hello";
    }

    @RequestMapping(value = "/add")
    public String add1(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return "hello";
    }

}
