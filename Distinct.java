import java.util.*;

public class Distinct {

	public static void main(String[] args) {
		distinctCharacterInString("Hello World");
	}

	public static List<Character> distinctCharacterInString(String coins) {
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
	    //System.out.println(ch); if want to see debug, remove comment
	    return ch;
	}
}