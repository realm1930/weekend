package be.vdab.weekend.controllers;

import be.vdab.weekend.services.WeekendService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

@Controller
@RequestMapping("/")
public class IndexController {
    private final WeekendService weekendService;

    public IndexController(WeekendService weekendService) {
        this.weekendService = weekendService;
    }

    @GetMapping
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView(
                "index","isWeekend",weekendService.isWeekend()
        );
        return modelAndView;
    }
}
