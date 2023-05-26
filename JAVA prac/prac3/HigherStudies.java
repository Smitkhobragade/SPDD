public class HigherStudies extends Student {
  String degname,collname,exname;
  double addmno,exscore;

  HigherStudies(String name1, String gender1, String dept1, double cgpa1,String degname1,String collname1,String exname1,double admno1,double exscore1) {
    super(name1, gender1, dept1, cgpa1);
    degname = degname1;
    collname = collname1;
    exname = exname1;
    addmno = admno1;
    exscore = exscore1;
  }

  void display(){
    super.display();
    System.out.println("\n---------------\nDegree name: "+degname+"\nCollege Name: "+collname+"\nAdmission no: "+addmno+"\nExam name: "+exname+"\nExam Score: "+exscore);
  }
  
}
