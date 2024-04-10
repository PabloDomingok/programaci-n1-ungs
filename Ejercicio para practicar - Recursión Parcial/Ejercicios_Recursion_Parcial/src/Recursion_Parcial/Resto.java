package Recursion_Parcial;

public class Resto {
	
	public static String resto(String s) {
		String r="";
		for(int i =1; i<s.length();i++) {
			r+=s.charAt(i);
		}
		return r;
	}

}
