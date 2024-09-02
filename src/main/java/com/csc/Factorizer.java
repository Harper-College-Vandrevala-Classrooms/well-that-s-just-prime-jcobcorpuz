package com.csc;

public class Factorizer {
  public String prime_factors(int number) {
    String factors = "";

    if(number <= 1){
      return null;
    }

    while (number % 2 == 0){
      factors += "2,";
      number /= 2;
    }

    for (int i = 3; i <= Math.sqrt(number); i += 2){
      while (number % i == 0){
        factors += i + ",";
        number /= i;
      }
    }

    if(number > 2){
      factors += number + ",";
    }
    return factors.substring(0, factors.length() - 1);
  }
}
