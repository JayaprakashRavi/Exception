package org.Test;

public class exc { 

public static void main(String[] args) {
int t	=0;
    try {
		t= number();
	} catch (Exception e) {
		System.out.println(e);
	}
    System.out.println(t);
    
}
public static int number()throws Exception {
	System.out.println("outer class");
	return 6/0;
	
}
    
    
}






