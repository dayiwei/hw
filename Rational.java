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
	return _numerator + "/" + _denominator;
    }

    public double floatValue() {
	double x = _numerator/_denominator;
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

    /////////Phase II/////////////

    public void add (Rational x) {
	_numerator *= x._denominator;
	_numerator += x._numerator * _denominator;
	_denominator *= x._denominator;

    }

    public void subtract (Rational x) {
	_numerator *= x._denominator;
	_numerator -= x._numerator * _denominator;
	_denominator *= x._denominator;

    }

    public int gcd() {
	    
	int remainder = Math.max(_numerator,_denominator)%Math.min(_numerator,_denominator);
	int oldremainder = Math.min(_numerator,_denominator);
	while (remainder != 0) {
	    oldremainder = remainder;
	    remainder = Math.min(_numerator,_denominator)%remainder;

	}
	return oldremainder;
    }

    public void reduce() {
	_numerator /= gcd();
	_denominator /= gcd();
    }

    //////Phase III///////

    public static int gcd(int num, int den) {
	int remainder = Math.max(num,den)%Math.min(num,den);
	int oldremainder = Math.min(num,den);
	while (remainder != 0) {
	    oldremainder = remainder;
	    remainder = Math.min(num,den)%remainder;

	}
	return oldremainder;
    }

    public int compareTo(Rational x) {
	if (_numerator/_denominator == x._numerator/x._denominator)
	    return 0;
	else if (_numerator/_denominator >= x._numerator/x._denominator)
	    return 1;
	else 
	    return -1;
    }

    public static void main(String[] args) {

	Rational a = new Rational();
	Rational x = new Rational(3 ,5);

	System.out.println("Default Rational: " + a);
	System.out.println("\nRational(3, 5): " + x);

	Rational r = new Rational(2,3); //Stores the rational number 2/3
	Rational s = new Rational(1,2); //Stores the rational number 1/2
	Rational t = new Rational(4,18); //Stores the rational number 4/18
	System.out.println("r: "+r
			   + "\ns: "+s
			   + "\nt: "+t);
	r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2 
	System.out.println("r + s: " + r);
	t.reduce(); //Changes t to 2/9
	System.out.println("t reduced: " + t);
	

	System.out.println("gcd(10,24): " + gcd(10,24));
	System.out.println("r.compareTo(s): " + r.compareTo(s));
	System.out.println("s.compareTo(r): " + s.compareTo(r));
	System.out.println("t.compareTo(t): " + t.compareTo(t));
    }
}
