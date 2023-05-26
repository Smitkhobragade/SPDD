public class Placement extends Student {
  protected String indname;
  protected double annp;
  protected int jlno;

  Placement(String name1, String gender1, String dept1, double cgpa1,String indname1,double annp1,int jlno1){
    super(name1, gender1, dept1, cgpa1);
    indname = indname1;
    annp = annp1;
    jlno = jlno1;
  }

  void display(){
    super.display();
    System.out.println("-----------\nIndustry Name: "+indname+"\nAnnual Package: "+annp+"\nJoining letter number : "+jlno);
  }
}
