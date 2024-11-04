package OBJAndClass_Demo;

public class AccessModifiresDemo {
	private int a = 20;
	protected String namString = "Sumit";
	
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
	public static void main(String [] args) {
		AccessModifiresDemo objAccessModifiresDemo = new AccessModifiresDemo();
		objAccessModifiresDemo.setA(20);
		int b = objAccessModifiresDemo.getA();
		System.out.println("Value of a: "+b);
	}
}
