package Exception_Handler;

public class Exception_Handler_getStackStrace {
	public static void main(String[] args) {
		try {
			int Arr[] = new int[3];
			for(int i = 0; i < Arr[4]; i++) {
				Arr[i] = 5*i;
				System.out.println("Here is an index "+i+" with element: "+Arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException ai) {
			StackTraceElement stackTraceElement[] = ai.getStackTrace();
			for(StackTraceElement stackTraceElement2 : stackTraceElement) {
				System.out.println("Class Name: "+stackTraceElement2.getClassName());
				System.out.println("Method Name: "+stackTraceElement2.getMethodName());
				System.out.println("File Name: "+stackTraceElement2.getFileName());
				System.out.println("Line Name: "+ stackTraceElement2.getLineNumber());
				System.out.println("Class Loder Name: "+stackTraceElement2.getClassLoaderName());
				System.out.println("Module Name: "+stackTraceElement2.getModuleName());
				System.out.println("Module Version: "+stackTraceElement2.getModuleVersion());
				System.out.println("Class: "+stackTraceElement2.getClass());
			}
		}
	}
}
