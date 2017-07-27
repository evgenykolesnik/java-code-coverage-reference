package ru.kolesnik.reference.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.kolesnik.reference.service.CalculatorService;

@RestController
public class CalculatorController {

  @Autowired
  private CalculatorService calculatorService;

  @RequestMapping("/sum")
  public Long sum(@RequestParam Long a, @RequestParam Long b) {
    return calculatorService.sum(a, b);
  }
}
