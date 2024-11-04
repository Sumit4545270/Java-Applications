package inheritance_java;
class Shape1 {
	int roll;
	String nm;
	
	 public void setmethod(int roll, String nm) {
		 this.roll = roll;
		 this.nm = nm;
	 }
	 
	 public void getmethod() {
		 System.out.println("Roll Number: "+roll);
		 System.out.println("Name: "+nm );
	 }
}
class types_Of_Shape extends Shape1{
	public String type;
	
	public void settpmethod(int roll, String nm, String type) {
		setmethod(roll, nm);
		this.type = type;
	}
	public void gettpmethod() {
		getmethod();
		System.out.println("Type of Shape: "+type);
	}
}
class Shape{
	public static void main(String [] args) {
		Shape1 sh = new Shape1();
		types_Of_Shape tpShape =new types_Of_Shape();
		//Shape shmShape = new Shape();
		
		sh.setmethod(66, "Ractangle");
		sh.getmethod();
		
		tpShape.settpmethod(67, "Name", "Circle");
		tpShape.gettpmethod();		
	}
}