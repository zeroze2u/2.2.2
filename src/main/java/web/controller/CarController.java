package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.serviceCar;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final serviceCar serviceCars;

    public CarController(serviceCar serviceCars){
        this.serviceCars = serviceCars;
    }

    @GetMapping()
    public String showCars(@RequestParam(name = "count", required = false)Integer count, ModelMap model) {
        if(count == null){
            model.addAttribute("cars",serviceCars.getCarsList());
        }else{
            model.addAttribute("cars",serviceCars.getCarsCount(count));
        }
        return "cars";
    }
}
