//
//
//
//

public class Rational {

    ////////////Instance vars//////////////
    private int _numerator;
    private int _denominator;


    ///////////Default Constructor/////////
    public Rational() {
	_numerator = 0;
	_denominator = 0;
    }

    //////Overriden Constructor/////
    public Rational( int num, int den) {
	if (den == 0) {
	    System.out.println("Invalid denominator");
	    _numerator =0;
	    _denominator = 0;
	}
	_numerator = num;
	_denominator = den;
    }

    public String toString() {
	return "" + _numerator + "/" + _denominator;
    }

    public double floatValue() {
	double x = _numeratpr/_denominator;
	return x;
    }

    public void multiply(Rational x) {
	_numerator *= x._numerator;
	_denominator *= x._denominator;
    }

    public void divide(Rational x) {
	_numerator /= x._denominator;
	_denominator *= x._numerator;
    }
}
