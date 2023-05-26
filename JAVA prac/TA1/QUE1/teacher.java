// package TA1.QUE1;

public class teacher extends person{
  double salary;
  String qualification;
  int exp;
  teacher(String name, String dob, String qualification1, int exp1){
    super(name, dob);
    qualification = qualification1;
    exp = exp1;
    salary = calculateSalary();
  }

  double calculateSalary(){
    double base=0;
    if(qualification.equals("PG")){
      base = 60000;
    }
    else if(qualification.equals("PHD")){
      base = 80000;
    }
    return base + (exp*2000);
  }

  void display(){
    System.out.println("--------Teacher--------");
    System.out.println("Name : "+name);
    System.out.println("DOB : "+dob);
    System.out.println("Age : "+calculateAge());
    // calculateAge();
    System.out.println("Qualification : "+qualification);
    System.out.println("Experience : "+exp);
    System.out.println("Salaray : "+salary);
  }
  
}
