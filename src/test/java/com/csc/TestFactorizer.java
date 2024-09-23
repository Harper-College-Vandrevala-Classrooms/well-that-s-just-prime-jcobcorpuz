package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

  Factorizer factorizer;

  @BeforeEach
  void setUp() {
    factorizer = new Factorizer();
  }

  @Test
  public void testNine() {
    assertEquals("3,3", factorizer.prime_factors(9));
  }

  @Test
  public void testTen() {
    assertEquals("2,5", factorizer.prime_factors(10));
  }

  @Test
  public void testThirteen() {
    assertEquals("13", factorizer.prime_factors(13));
  }

  @Test
  public void testHundredAndOne() {
    assertEquals("101", factorizer.prime_factors(101));
  }

  @Test
  public void testHundred() {
    assertEquals("2,2,5,5", factorizer.prime_factors(100));
  }

  @Test
  public void testFortyNine() {
    assertEquals("7,7", factorizer.prime_factors(49));
  }

  @Test
  public void testFifty() {
    assertEquals("2,5,5", factorizer.prime_factors(50));
  }

  @Test
  public void testZero() {
    assertNull(null, factorizer.prime_factors(0));
  }

  @Test
  public void testOne() {
      assertNull(null, factorizer.prime_factors(1));
  }

  @Test
  public void testNegative() {
    assertNull(null, factorizer.prime_factors(-7));
  }

  @Test
  public void testThirtySixOverTwelve(){
    assertEquals("3/1", factorizer.reduce(36,12));
  }

  @Test
  public void testTwelveOverTwelve(){
    assertEquals("1/1", factorizer.reduce(12,12));
  }

  @Test
  public void testTwelveOverFourteen(){
    assertEquals("6/7", factorizer.reduce(12,14));
  }

  @Test
  public void testTwelveOverThirtySeven(){
    assertEquals("12/37", factorizer.reduce(12,37));
  }

  @Test
  public void TestReduceWithZeroDenominator(){
    assertEquals("Undefined", factorizer.reduce(12,0));
  }
}
