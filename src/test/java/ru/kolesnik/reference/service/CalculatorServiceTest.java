package ru.kolesnik.reference.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = CalculatorService.class)
public class CalculatorServiceTest {

  @Autowired
  public CalculatorService calculatorService;

  @Test
  void testSum() {
    long a = 2;
    long b = 2;
    long expected = 4;
    assertThat(calculatorService.sum(a, b)).isEqualTo(expected);
  }
}
