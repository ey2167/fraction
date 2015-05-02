import java.io.Serializable;


public class Fraction implements Serializable {
	
        private int numerator;
        private int denominator;
        private static char slash = '/' ;


		public int getNumerator() {
			return numerator;
		}
		public void setNumerator(int numerator) {
			this.numerator = numerator;
		}
		public int getDenominator() {
			return denominator;
		}
		public void setDenominator(int denominator) {
			this.denominator = denominator;
		}
		public char getSlash() {
			return slash;
		}
		public static void setSlash(char slash) {
			Fraction.slash = slash;
		}}
