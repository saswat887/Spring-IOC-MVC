package pack1;

public class Calculator {
	private int a;
	private int b;
	
	public Calculator(double a, double b) {
		System.out.println("Double Contructor Called");
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("A=="+a);
		System.out.println("B=="+b);
		System.out.println("Sum ="+(a+b));
	}
	
	public Calculator(int a, int b) {
		System.out.println("Int Contructor Called");
		this.a = a;
		this.b = b;
		System.out.println("A=="+a);
		System.out.println("B=="+b);
		System.out.println("Sum ="+(a+b));
	}
	public Calculator(String a, String b) {
		System.out.println("String Contructor Called");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("A=="+a);
		System.out.println("B=="+b);
		System.out.println("Sum ="+(a+b));
	}
	public Calculator()
	{
		System.out.println("Default Constructor");
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	

}
