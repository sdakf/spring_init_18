package pl.sda.springcalculator18;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Collectors;

@Controller
public class CalculatorController {

    @Autowired
    private MessageWrapperRepository repository;

    @RequestMapping("/calculate") //requesty na taki url zostana przechwycone tutaj
    public String calculate(@RequestParam(required = false) String inputText, Model model) {
//        "2+ 3"
        if (inputText != null) {
            repository.save(new MessageWrapper(inputText));
            String[] split = inputText.split("\\D+");

            String firstValue = split[0];
            String secondValue = split[1];
            Long result = Long.parseLong(firstValue) + Long.parseLong(secondValue);
            model.addAttribute("yyy", result);
            model.addAttribute("results", repository.findAll());
        }
        return "calculatorForm"; //zostanie wyswietlony html o takiej nazwie
    }
}
