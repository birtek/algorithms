package codingBat;

public class String1 {

    public String firstHalf(String str) {
        int index = str.length() / 2;
        return str.substring(0, index);
    }

    public String withoutEnd(String str) {
        int index = str.length() - 1;
        return str.substring(1, index);
    }

    public String comboString(String a, String b) {
        if(a.length()>b.length()){
            return b+a+b;
        }
        return a+b+a;
    }

    public String nonStart(String a, String b) {
       return a.substring(1,a.length())+b.substring(1,b.length());
    }

    public String left2(String str) {
       String twoFirstChars = str.substring(0,2);
       return str.substring(2,str.length())+twoFirstChars;
    }

    public String right2(String str) {

        int numberCharsInWordWitoutLastTwo = str.length() - 2;
        String twoLastChars = str.substring(numberCharsInWordWitoutLastTwo,str.length());
        return twoLastChars+str.substring(0, numberCharsInWordWitoutLastTwo);
    }

    public String theEnd(String str, boolean front) {
        if(front){
            return str.substring(0,1);
        }
        return str.substring(str.length()-1,str.length());
    }

    public String withouEnd2(String str) {
        if(str.length()<2){
            return "";
        }
        return str.substring(1,str.length()-1);
    }

    public String middleTwo(String str) {
        int middle = str.length()/2;
        return str.substring(middle-1,middle+1);
    }


}
