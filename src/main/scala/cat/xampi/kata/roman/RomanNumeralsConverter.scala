package cat.xampi.kata.roman

object RomanNumeralsConverter {

  def toRoman(arabic: Int): String = {
    val romanDigits = Map(
      1 -> "I", 5 -> "V",
      10 -> "X", 50 -> "L",
      100 -> "C", 500 -> "D",
      1000 -> "M",
      4 -> "IV", 9 -> "IX",
      40 -> "XL", 90 -> "XC",
      400 -> "CD", 900 -> "CM")
    
    def conversion(position: Int) (initialSymbol: String, middleSymbol: String, endSymbol: String): String = {
      val digit = arabic % (10*position) / position match {
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
      digit
    } 
    
    conversion(1000)("M", "?", "?") + conversion(100)("C", "D", "M") + conversion(10)("X", "L", "C") + conversion(1)("I", "V", "X")
    
  }
}