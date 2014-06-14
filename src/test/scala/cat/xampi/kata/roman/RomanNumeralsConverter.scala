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
}
