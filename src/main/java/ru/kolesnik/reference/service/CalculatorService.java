package ru.kolesnik.reference.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

  public long sum(long a, long b) {
    return a + b;
  }
}
