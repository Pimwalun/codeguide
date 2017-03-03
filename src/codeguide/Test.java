package codeguide;

/**
 * This class is example to calculate area and perimeter for geometry.
 * @author Pimwalun Witchawanitchanun
 *
 */
public class Test {
	//TODO Write java.doc correctly. 
	//TODO Modify code to complete  by DRY.
	//TODO Create the layout is easy to read.
	
    private static void TestAreaCircle()
    {
        String area = "The area is ";
        double c = 2*3.14*2*2; 
        System.out.println(area+c);
        String perimeter = "The perimeter is ";
        double c2 = 2*3.14*2;
        System.out.println(perimeter+c2);
    }
 
    private static void TestQuadrilateral()
    {
        String area = "The area is ";
        double r = 2*3;
        System.out.println(area+r);
        String perimeter = "The perimeter is ";
        double r2 = 2*(2+3);
        System.out.println(perimeter+r2);
    }
 
    private static void TestEquilateralTriangle()
    {
    	String area = "The area is ";
        double t = 1.0/2*6*3;
        System.out.println(area+t);
        String perimeter = "The perimeter is ";
        double t2 = 3*3;
        System.out.println(perimeter+t2);
    }
    
    public static void main(String[] args) {
		Test.TestAreaCircle();
		Test.TestEquilateralTriangle();
		Test.TestQuadrilateral();
	}
}
