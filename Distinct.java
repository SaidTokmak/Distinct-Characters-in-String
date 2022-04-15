/*
* Copyright SaidTokmak 2022
*/

import java.util.*;

public class Distinct {

	/* if want to see debug, remove comment and add static method
	public static void main(String[] args) {
		 String distinctStr = getStringFromCharacterList(distinctCharacterInString("Hello World"));
		 System.out.println(distinctStr); if want to see debug, remove comment
	}*/

	public List<Character> distinctCharacterInString(String coins) {
	    List<Character> ch = new ArrayList<>(); //list of distinct character in string value
	    
	    for (int i=0;i<coins.length();i++) {
	        boolean has=false;  //firstly for each character represent not exist
	        for(int j=0;j<ch.size();j++){
	        	//if character already exits do nothing
	            if(ch.get(j) == coins.charAt(i)){
	                has = true;
	            }
	        }
	        //if has is false list not contain this character and add this character
	        if(!has){
	            ch.add(coins.charAt(i));
	        }
	    }

	    return ch;
	}

	public static String getStringFromCharacterList(List<Character> list) {    
	    StringBuilder builder = new StringBuilder(list.size());
	    
	    for(Character ch: list) {
	        builder.append(ch);
	    }

	    return builder.toString();
	}
}