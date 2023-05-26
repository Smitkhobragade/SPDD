// package prac5;

public class studentException extends Exception{
  String str;
  studentException(String s){
    str = s;
  }
  String displayException(){
    String str1 = "Exception : ( "+str+" ) ";
    return str1;
  }
}
