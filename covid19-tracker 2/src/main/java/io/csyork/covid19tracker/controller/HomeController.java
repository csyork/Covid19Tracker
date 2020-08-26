package io.csyork.covid19tracker.controller;

import io.csyork.covid19tracker.model.LocationStats;
import io.csyork.covid19tracker.service.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> stats = coronaVirusDataService.getStats();
        int totalCasesReported = stats.stream().mapToInt(stat -> stat.getLatestTotal()).sum();
        model.addAttribute("locationStats",coronaVirusDataService.getStats());
        model.addAttribute("totalCasesReported", totalCasesReported);


        return "home";
    }
}
