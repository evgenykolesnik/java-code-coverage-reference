package ru.kolesnik.reference.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CalculatorService.class)
public class CalculatorServiceTest {

  @Autowired
  private CalculatorService calculatorService;

  @Test
  public void testSum() {
    long a = 2;
    long b = 2;
    long expected = 4;
    assertThat(calculatorService.sum(a, b)).isEqualTo(expected);
  }
}
