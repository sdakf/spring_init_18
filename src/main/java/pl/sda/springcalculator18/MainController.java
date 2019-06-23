package pl.sda.springcalculator18;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {


    @RequestMapping("/")
    public String ok(@RequestParam(required = false) String name) {
        return name == null ? "Nie podałeś imienia" : ("Hello " + name);
    }

    @RequestMapping("/json")
    public List<String> ok() {
        List<String> objects = new ArrayList<>();
        objects.add("1");
        objects.add("2");
        objects.add("3");
        return objects;
    }
}
