package com.tns.generic;

	import java.util.ArrayList;

	public class ArralistDemo<T> {

		public static void main(String []args) {
			ArralistDemo<Integer> t1=new ArralistDemo<Integer>();
			
			
			ArralistDemo<String> t2=new ArralistDemo<String>();
			
			
			/*Array
			  String[] A=new String[500];
			  A[0]="Avantika";
			  A[1]="Rangini";
			  A[2]=45;*/
			 
			
	          ArrayList<String>  s=new ArrayList<String>();
	             s.add("Avantika");
	             s.add("Damini");
//	             s.add(45);
			
	             String employee1= (String)s.get(0);
			
	             String employee2= (String)s.get(1);
			
	             String employee3= (String)s.get(2);
			
//		    ArrayList l=new ArrayList(); //Growable in nature
//	      l.add("A");
//	      l.add(1000);
//	      l.add(4.5);
//			l.add(null);
//			l.remove(2);
			
//		    l.add(2,"M");
//		    l.add("N");
//	      System.out.println(l);
			
		}
}
