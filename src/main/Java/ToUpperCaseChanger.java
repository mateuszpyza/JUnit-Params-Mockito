public class ToUpperCaseChanger {
    public static String changeToUpperCase(String text){
        if(text!=null&&text!="") {
            return text.toUpperCase();
        }else {throw new RuntimeException("Input data problems.");}
    }
}
