public class Student {
  protected String name,gender,dept;
  protected double cgpa;

  Student(String name1, String gender1, String dept1, double cgpa1){
    name = name1;
    gender = gender1;
    dept = dept1;
    cgpa = cgpa1;
  }

  void display(){
    System.out.println("\n----------------\nName:"+name+"\nGender: "+gender+"\nDept. : "+dept+"\nCGPA : "+cgpa+"\n");
  }
}
