package org.junit;

public class Try {

public static void main(String[] args) {
	

String a="charan";

String b = "chettry";

//if (!(a.equals(b))) {
//	System.out.println(a);
//	
//}else {3
//	System.out.println(b);
//}
//String rePlaceString= a.replace("charan", "hjguhgu");
//System.out.println(rePlaceString);
//String rePlaceString1= b.replace("chettry", "charan");
//System.out.println(rePlaceString1);

a=a+b;
System.out.println(a);
a=a.substring(b.length());
b=a.substring(0, a.length()-b.length());
System.out.println(b);
System.out.println(a);
System.out.println(b);

b=a+b;
System.out.println(b);
a=b.substring(a.length());
System.out.println(a);
b=b.substring(0, b.length()-a.length());
System.out.println(b);



}


}
