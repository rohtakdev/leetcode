package com.poorak.String;

/**
 * Validate if a given string is numeric.

Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
Note: It is intended for the problem statement to be ambiguous. 
You should gather all requirements up front before implementing one.

 * @author poorak
 *
 */
public class ValidNumber {
	
     
     
    boolean valid(String str){
    	char[] s = str.toCharArray();
        int i=0;
        boolean e =false; // check if 'e' exists
        boolean dot=false; // check if '.' exists
        boolean dig =false;
         
        while (i<s.length-1){
            if (i==0){ // a number can start with +, -, .
                if (s[i]<'0' || s[i]>'9'){ // if is 0-9 continue
                    if (s[i]=='+' || s[i]=='-' || s[i]=='.'|| s[i]==' '){
                        if (s.length==1){return false;} // only +, - , . is not a number
                        if (s[i]=='.'){dot=true;}
                    }
                    else {return false;}
                }else{dig=true;}
                i++;continue;
            }
            if (i>0){
                switch (s[i]){
                    case 'e': // e cannot follow +,-
                        if ( e==false && s[i-1]!='+' && s[i-1]!='-' && dig && i!=s.length-1) {
                            e = true;
                        }else{
                            return false;
                        }
                        break;
                   case 'E': // e cannot follow +,-
                        if ( e==false && s[i-1]!='+' && s[i-1]!='-' && dig && i!=s.length-1) {
                            e = true;
                        }else{
                            return false;
                        }
                        break;
                   case '+': // + can only occur before e
                        if (s[i-1]=='e' || s[i-1]=='E'){}else{return false;}
                        break;
                   case '-': // - can only occur before e
                        if (s[i-1]=='e' || s[i-1]=='E'){}else{return false;}
                        break;
                   case '.': // . can only occur once and cannot occure after e
                        if (dot==false && e==false){dot=true;}else{return false;}
                        break;
                   default:  // only 0-9 can be valid numbers
                        if (s[i]<'0'||s[i]>'9'){return false;}
                        else{dig = true;}
                        break;
            } 
                i++;continue;
            }
        }
         
        //last dig can only be 0-9, or ., when it is . there is no . and e before
        if (s[s.length-1]>='0' && s[s.length-1]<='9'){return true;}
        if (s[s.length-1]=='.' && s.length ==1) {return false;}       
        if (s[s.length-1]=='.' && !dot && !e && s[s.length-2]>='0' && s[s.length-1]<='9') {return true;}       
        return false;
    }
    boolean isNumber(String s) {
  
        String s1 = s.trim(); 
        if (s1.length()==0){return false;} // if null string, return false;
        return valid(s1);
    }

}
