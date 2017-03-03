#codeguide

##1.Don't Repeat Yourself
Don't Repeat Yourself (DRY) is perhaps one of the most fundamental. The principle was formulated by Andy Hunt and Dave Thomas in The Pragmatic Programmer, and underlies many other well-known software development best practices and design patterns. The developer who learns to recognize duplication, and understands how to eliminate it through appropriate practice and proper abstraction, can produce much cleaner code than one who continuously infects the application with unnecessary repetition.

	Example
	public class Vehicle {
 
	public void Car() {
		System.out.println("Start");
		System.out.println("Ride car now");
	}
 
	public void Bike() {
		System.out.println("Start");
		System.out.println("Ride bike now");
	}
	
	}
	
   DRY
   
	public class Vehicle {
    
	public void Car() {
		startVehicle();
		System.out.println("Ride car now");
	}
 
	public void Bike() {
		startVehicle();
		System.out.println("Ride bike now");
	}
	public void startVehicle() {
		System.out.println("Start");
	}

##2.Meaningful Names
###Use Intention-Revealing Names
It is easy to say that names should reveal intent. What we want to impress upon you is that
we are serious about this.

The name of a variable, function, or class, should answer all the big questions. It
should tell you why it exists, what it does, and how it is used.

	Example
	String n; / Student name
	
We should choose a name that specifies what is being measured and the unit of that measurement.Variable should be start with a lowercase.

	Example
	String studentName;
	
Variable constant should be use all capital letter.

	Example
	MAX_VALUE,DEFAULD_CURRENCY
	
Package name must be lowercase but class names should be start with capital letter.If name is an acronym can use all uppercase name.

	Example
	Bad package:
	package Animal
	Good package:
	package animal
	Acronym package:
	package URL
###Class Names
Avoid words like '''Manager''', Processor, Data, or Info in the name of a class. A class name should not be a verb
###Method Names
Methods should have verb or verb phrase names like postPayment, deletePage, or save

	Example
	setName(Type param);
	grtName();

##3.Write java.doc and Comment
When we come back to read the code we can understand that how this class and Method work.
	
	Example
	/**
     * A coin with given value and currency.
     * @param value is value of coin.
     * @param currency is currency of coin.
     */
    public Coin(double value, String currency) {
    	super(value, currency);
    } 
	
##Useful references:
Clean Code by Robert Martin. : http://ricardogeek.com/docs/clean_code.pdf
Sun's Java Coding Standard and is based on the experience of many programmers.
Steve Smith : http://programmer.97things.oreilly.com/wiki/index.php/Don't_Repeat_Yourself
Prasad Kharkar : http://www.thejavageek.com/2015/04/10/dont-repeat-yourself-principle/