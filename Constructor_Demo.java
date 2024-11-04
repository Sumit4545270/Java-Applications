/**
 * 
 */
package OBJAndClass_Demo;

/**
 * @author Admin
 *
 */
public class Constructor_Demo {
	
	String str;
	int roll;
	
	public Constructor_Demo(String string, int roll_no) {
		// TODO Auto-generated constructor stub
		 this.str = string;
		this.roll = roll_no;
	}
		
	public static void main(String [] args) {
		Constructor_Demo objConstructor_Demo = new Constructor_Demo("Sumit", 66);
		System.out.println("String Name: "+objConstructor_Demo.str);
		System.out.println("Roll Number: "+objConstructor_Demo.roll);
		
	}

}
