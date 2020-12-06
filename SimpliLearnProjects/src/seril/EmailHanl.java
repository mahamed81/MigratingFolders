package seril;

import java.awt.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailHanl {

	
//	public static final String regex = "^([A-Za-z0-9])@(.+)$";
	
	public static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";


	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		
		
		list.add("hass#gmail.com");
		list.add("hass.@gmail.com");
		
		Pattern p= Pattern.compile(regex);
		
		for(String val: list) {
			
			Matcher ma = p.matcher(val);
			System.out.println(" The email Addre " + val + " is "  + (ma.matches() ?  "  valud" : "invalid"));
		}

	}

}
