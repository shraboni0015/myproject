package arrayPacckage;
import java.util.ArrayList;
public class ArrayArrayList {
public static void main(String[] args) {
		                                                 
//		int[] array1 = new  int[5];
//		array1[0] = 20;
//		array1[1] = 30;
//		array1[2] = 40;
//		array1[3] = 50;
//		array1[4] = 60;
//		System.out.println(array1.length);
//	    System.out.println(array1.equals(2));
//	    System.out.println(array1[4]);
//	    int[] array2 = new  int[5];
//		array2[0] = 20;
//		array2[1] = 30;
//		array2[2] = 40;
//		array2[3] = 50;
//		array2[4] = 60;
//	    System.out.println(array1.equals(array2));
//	    
		// for(int a=0; a<=4; a++) {
			 //System.out.println(array1[a]);
		ArrayList<String> name = new ArrayList <String> ();
		name.add("monowara");
		name.add("sultana");
		name.add("nitu apu");
		name.add("himu apu");
		name.add("mynul vai");
		name.add("robi vai");
		//name.remove("himu apu");
	   // name.clear();
		System.out.println(name);
		ArrayList<String> name2 = new ArrayList <String> ();
		name2.add("monowara");
		name2.add("sultana");
		name2.add("nitu apu");
		name2.add("himu apu");
		name2.add("mynul vai");
		name2.add("robi vai");
		System.out.println(name.equals(name2));
	    System.out.println(name2.contains(name2));
		
		//name2.add("tahmid, uzzaman");
		System.out.println(name2.add("tahmid, uzzaman"));
		
		
		
		
	}

}
