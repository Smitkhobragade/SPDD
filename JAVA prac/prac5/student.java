// package prac5;

public class student {
  String name,erno,psswd;
  double cgpa;

  void initalise_std(String name1, double cgpa1, String erno1, String password) throws studentException{
    name = name1;

    if((cgpa1<0)||(cgpa1>10)){
      throw new studentException("Invalid CGPA");
    }else{
      cgpa = cgpa1;
    }

    String degree = erno1.substring(0, 2);
    int year = Integer.parseInt(erno1.substring(2, 4));
    String branch = erno1.substring(4, 7);
    int rollno = Integer.parseInt(erno1.substring(7, 10));

    if(erno1.length() != 10){
      throw new studentException("Invalid Length");
    }

    if(!(degree.equals("BE"))){
      throw new studentException("Invalid Degree");
    }

    if(!(year>=20 && year<=23)){
      throw new studentException("Invalid Year");
    }

    if(!((branch.equals("CSU")) || (branch.equals("ENU")) || (branch.equals("EEU")) || (branch.equals("ECU")))){
      throw new studentException("Invalid Branch");
    }

    if(!(rollno>1 && rollno<=250)){
      throw new studentException("Invalid Roll no");
    }else{
      erno = erno1;
    }

    // Password Section
    if(password.length()<8){
      throw new studentException("Invalid PASSWORD length");
    }

    // char[] ps = new char[password.length()];
    // for(int i=0; i<password.length(); i++){
    //   ps[i] = password.charAt(i);
    // }

    int small = 0,capital = 0,num = 0,special = 0;

    for(int i = 0; i<password.length();i++){
      if(password.charAt(i)<='z' && password.charAt(i)>='a'){
        small++;
      }
      if(password.charAt(i)<='Z' && password.charAt(i)>='A'){
        capital++;
      }
      if(password.charAt(i)<='9' && password.charAt(i)>='0'){
        num++;
      }
      if(password.charAt(i)=='!' || password.charAt(i)=='$' || password.charAt(i)=='%' || password.charAt(i)=='*' || password.charAt(i)=='&'){
        special++;
      }
    }

    if(small == 0){
      throw new studentException("PSSWD -> No Small letter");
    }else if(capital == 0){
      throw new studentException("PSSWD -> No Capital letter");
    }else if(num == 0){
      throw new studentException("PSSWD -> No Numbers");
    }else if(special == 0){
      throw new studentException("PSSWD -> No Special letter");
    }else{
      psswd = password;
    }
    
  }

  void display(){
    System.out.println("----Information----");
    System.out.println("NAME : "+name);
    System.out.println("CGPA : "+cgpa);
    System.out.println("ENROLLMENT NO. : "+erno);
    System.out.println("PASSWORD : "+psswd);
  }
  
}
