public class Enterprenuership extends Student {
  String compname,sector;
  double noemp,annturn;

  Enterprenuership(String name1, String gender1, String dept1, double cgpa1,String compname1,String sector1,double noemp1,double annturn1) {
    super(name1, gender1, dept1, cgpa1);
    compname = compname1;
    sector = sector1;
    noemp = noemp1;
    annturn = annturn1;
  }

  void display(){
    super.display();
    System.out.println("\n------------\nCompany Name: "+compname+"\nSector : "+sector+"\nNo of employees: "+noemp+"\nAnnual Turnover: "+annturn);
  }
  
}
