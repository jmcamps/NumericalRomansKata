package cat.xampi.kata.roman

import org.scalatest._
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class RomanNumeralsConverterSpec extends FlatSpec with ShouldMatchers {
  "1" should "be I" in {
    RomanNumeralsConverter toRoman 1 should be === "I"
  }
  
  "2" should "be II" in {
    RomanNumeralsConverter toRoman 2 should be === "II"
  }
  
  "3" should "be III" in {
    RomanNumeralsConverter toRoman 3 should be === "III"
  }
  
  "4" should "be IV" in {
    RomanNumeralsConverter toRoman 4 should be === "IV" 
  }
  
  "5" should "be V" in {
    RomanNumeralsConverter toRoman 5 should be === "V" 
  }
  "6" should "be VI" in {
    RomanNumeralsConverter toRoman 6 should be === "VI" 
  }
  "7" should "be VII" in {
    RomanNumeralsConverter toRoman 7 should be === "VII" 
  }
  "8" should "be VIII" in {
    RomanNumeralsConverter toRoman 8 should be === "VIII" 
  }
  "9" should "be IX" in {
    RomanNumeralsConverter toRoman 9 should be === "IX" 
  }
  "10" should "be X" in {
    RomanNumeralsConverter toRoman 10 should be === "X" 
  }
  
 "11" should "be XI" in {
    RomanNumeralsConverter toRoman 11 should be === "XI" 
  }
 
 "12" should "be XII" in {
    RomanNumeralsConverter toRoman 12 should be === "XII" 
  }
 
 "16" should "be XVI" in {
    RomanNumeralsConverter toRoman 16 should be === "XVI" 
  }
 
 "19" should "be XIX" in {
    RomanNumeralsConverter toRoman 19 should be === "XIX" 
  }
 
 "40" should "be XL" in {
    RomanNumeralsConverter toRoman 40 should be === "XL" 
  }
 
 "946" should "be CMXLVI" in {
    RomanNumeralsConverter toRoman 946 should be === "CMXLVI" 
  }
 
 "3497" should "be MMMCDXCVII" in {
    RomanNumeralsConverter toRoman 3497 should be === "MMMCDXCVII" 
  }
}
