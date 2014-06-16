package cat.xampi.kata.roman

object RomanNumeralsConverter {

  def toRoman(arabic: Int): String = {
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