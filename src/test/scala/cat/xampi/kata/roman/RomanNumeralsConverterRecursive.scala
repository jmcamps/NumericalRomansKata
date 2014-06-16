package cat.xampi.kata.roman

import org.scalatest._
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class RomanNumeralsConverterRecursiveSpec extends FlatSpec with ShouldMatchers {
  "1" should "be I" in {
    RomanNumeralsConverter toRomanRecursive 1 should be === "I"
  }
  
  "2" should "be II" in {
    RomanNumeralsConverter toRomanRecursive 2 should be === "II"
  }
  
  "3" should "be III" in { 
    RomanNumeralsConverter toRomanRecursive 3 should be === "III"
  }
  
  "4" should "be IV" in {
    RomanNumeralsConverter toRomanRecursive 4 should be === "IV" 
  }
  
  "5" should "be V" in {
    RomanNumeralsConverter toRomanRecursive 5 should be === "V" 
  }
  "6" should "be VI" in {
    RomanNumeralsConverter toRomanRecursive 6 should be === "VI" 
  }
  "7" should "be VII" in {
    RomanNumeralsConverter toRomanRecursive 7 should be === "VII" 
  }
  "8" should "be VIII" in {
    RomanNumeralsConverter toRomanRecursive 8 should be === "VIII" 
  }
  "9" should "be IX" in {
    RomanNumeralsConverter toRomanRecursive 9 should be === "IX" 
  }
  "10" should "be X" in {
    RomanNumeralsConverter toRomanRecursive 10 should be === "X" 
  }
  
 "11" should "be XI" in {
    RomanNumeralsConverter toRomanRecursive 11 should be === "XI" 
  }
 
 "12" should "be XII" in {
    RomanNumeralsConverter toRomanRecursive 12 should be === "XII" 
  }
 
 "16" should "be XVI" in { 
    RomanNumeralsConverter toRomanRecursive 16 should be === "XVI" 
  }
 
 "19" should "be XIX" in {
    RomanNumeralsConverter toRomanRecursive 19 should be === "XIX" 
  }
 
 "40" should "be XL" in {
    RomanNumeralsConverter toRoman 40 should be === "XL" 
  }
 
 "946" should "be CMXLVI" in {
    RomanNumeralsConverter toRomanRecursive 946 should be === "CMXLVI" 
  }
 
 "3497" should "be MMMCDXCVII" in {
    RomanNumeralsConverter toRomanRecursive 3497 should be === "MMMCDXCVII" 
  }
}