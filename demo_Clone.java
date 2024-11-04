package inheritance_java;

class demo_Clone implements Cloneable{
	protected int length;
	protected int bridth;
	
	public demo_Clone(int length, int bridth) {
		this.length = length;
		this.bridth = bridth;
	}
	
	public String tostring() {
		return "Length: " + length + "Bridth: " + bridth;
	}
	
	public static void main(String[] args) {
		
		try {
			demo_Clone rectangle1 = new demo_Clone(20, 40);
			demo_Clone rectangle2 = (demo_Clone) rectangle1.clone();
			
			System.out.println("Before Clone: ");
			System.out.println(rectangle1.tostring());
			System.out.println(rectangle2.tostring());
			
			rectangle2.length = 30;
			rectangle2.bridth = 60;
			
			System.out.println("After Clone: ");
			System.out.println(rectangle1.tostring());
			System.out.println(rectangle2.tostring());
		}
		catch (CloneNotSupportedException ce) {
			// TODO: handle exception
			System.out.println(ce);
		}
	}
}
