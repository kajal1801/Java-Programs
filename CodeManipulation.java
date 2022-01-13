import java.util.*; 
import java.io.*;

class CodeManipulation {

  public static String CodelandUsernameValidation(String str) {
    int len = str.length();
    int p = 0;
    if(len<4 || len>25){
      return "false";
    }
    if(!Character.isLetter(str.charAt(0))){
      return "false";
    }
    if(str.charAt(len-1) == '_'){
      return "false";
    }
    for(int i = 0; i < len;i++){
      if(Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i)) || str.charAt(i) == '_'){
        continue;
      }
      return "false";
    }
    return "true";
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(CodelandUsernameValidation(s.nextLine())); 
  }

}