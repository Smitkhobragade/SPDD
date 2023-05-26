// package TA1.QUE1;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter; 

public class person {
  String name;
  String dob;
  person(String name1,String dob1){
    name = name1;
    dob = dob1;
  }

  int calculateAge(){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
    LocalDate dateofb = LocalDate.parse(dob, formatter);
    LocalDate curr = LocalDate.now();
    Period s =  Period.between(dateofb, curr);
    int s1 = s.getYears();
    // System.out.println("AGE IS : "+s1);
    return s1;
  }

  void displayperson(){
    System.out.println("--------Person--------");
    System.out.println("Name : "+name);
    System.out.println("DOB : "+dob);
    System.out.println("Age is : "+calculateAge());
  }


}
