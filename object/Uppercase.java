package object;

public class Uppercase {

	public static void main(String[] args) {
	    String message = "bad days buid better days";
	    char[] charArray = message.toCharArray();
	    boolean foundSpace = true;
	    for(int i = 0; i < charArray.length; i++) {
	    if(Character.isLetter(charArray[i])) {
	    if(foundSpace) {
	    charArray[i] = Character.toUpperCase(charArray[i]);
        foundSpace = false;
	    }
	}
	      else {
	          foundSpace = true;
	  }
}
	    message = String.valueOf(charArray);
	    System.out.println("Message: " + message);
	}
}
