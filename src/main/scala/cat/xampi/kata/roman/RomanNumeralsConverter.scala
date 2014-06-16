package cat.xampi.kata.roman

object RomanNumeralsConverter {

  /**
   * TDD version
   */
  sealed trait Factor { def factor: Int }
  case object UNIT_FACTOR extends Factor { val factor = 1 }
  case object DECIMAL_FACTOR extends Factor { val factor = 10 }
  case object HUNDRED_FACTOR extends Factor { val factor = 100 }
  case object THOUSAND_FACTOR extends Factor { val factor = 1000 }

  def toRoman(arabic: Int): String = {
    def convertUnitFragment: String = conversion(UNIT_FACTOR)("I", "V", "X")
    def convertDecimalFragment: String = conversion(DECIMAL_FACTOR)("X", "L", "C")
    def convertHundredFragment: String = conversion(HUNDRED_FACTOR)("C", "D", "M")
    def convertThousandFragment: String = conversion(THOUSAND_FACTOR)("M", "?", "?")

    def conversion(position: Factor)(initialSymbol: String, middleSymbol: String, endSymbol: String): String = {
      def digitToRomanString(digit: Int): String = {
        digit match {
          case 0 => ""
          case 1 => initialSymbol
          case 2 => initialSymbol + initialSymbol
          case 3 => initialSymbol + initialSymbol + initialSymbol
          case 4 => initialSymbol + middleSymbol
          case 5 => middleSymbol
          case 6 => middleSymbol + initialSymbol
          case 7 => middleSymbol + initialSymbol + initialSymbol
          case 8 => middleSymbol + initialSymbol + initialSymbol + initialSymbol
          case 9 => initialSymbol + endSymbol
        }
      }

      def calculateDigit: Int = {
        val FACTOR = 10
        arabic % (FACTOR * position.factor) / position.factor
      };
      digitToRomanString(calculateDigit)
    }

    convertThousandFragment + convertHundredFragment + convertDecimalFragment + convertUnitFragment

  }

  /**
   * Recursive version
   */
  def toRomanRecursive(number: Int): String = {
    def toRomanNumerals(number: Int, digits: List[(String, Int)]): String = digits match {
      case Nil => ""
      case h :: t => h._1 * (number / h._2) + toRomanNumerals(number % h._2, t)
    }

    toRomanNumerals(number, List(("M", 1000), ("CM", 900), ("D", 500), ("CD", 400), ("C", 100), ("XC", 90),
      ("L", 50), ("XL", 40), ("X", 10), ("IX", 9), ("V", 5), ("IV", 4), ("I", 1)))
  }
}