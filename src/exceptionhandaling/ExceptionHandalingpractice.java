package exceptionhandaling;

public class ExceptionHandalingpractice {

	public static void main(String[] args) {
//		int[] array = new int [6];
//		System.out.println(array[8]);
//		
//		String s = null;
//		System.out.println(s.length());
//		
//		String st = "3456";
//		int a = Integer.parseInt(st);
//		System.out.println(a+2000);
	
		String a = "3.99";
		double b = Double.parseDouble(a);
		System.out.println(b);
		
		String c = "hello";
		Integer.parseInt(c);
		
		try {
			Integer.parseInt(c);
		}catch(Exception e) {
			e.printStackTrace();

	}

	}
}