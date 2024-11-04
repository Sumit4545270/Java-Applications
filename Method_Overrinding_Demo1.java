package inheritance_java;

public class Method_Overrinding_Demo1 {
	public static void main(String[] args) {
		Base b = new Derrived();
		
		b.printing_method();
	}
}
class Base{
	public void printing_method(){
		System.out.println("Method From Base Class");
	}
}
class Derrived extends Base{
	public void printing_method(){
		super.printing_method();//referes to the base class in Derrived class
		System.out.println("Method From Derived Class");
	}
}