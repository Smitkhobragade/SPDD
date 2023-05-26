public class FixedDepositAccount extends BankAccount {
  double Lockedinperiod,lp;
  FixedDepositAccount(String Name,int Aadhar, double year1, double amt1){
    super(Name, Aadhar, 0);
    Lockedinperiod = year1;
    lp = Lockedinperiod;
    if(Lockedinperiod > 0){
      if(Lockedinperiod > 1 && Lockedinperiod < 2){
        roi = 0.06;
      }else if(Lockedinperiod > 2 && Lockedinperiod < 5){
        roi = 0.065;
      }
      else{
        roi = 0.07;
      }
      System.out.println("ROI IS : "+roi);
    }else{
      System.out.println("Locked in Period is too less for interest");
    }
    bal = amt1;
  }

  void updateInterest(){
    // System.out.println("eNTERES IN 2ND INTEREST");
    if(state){
      bal = bal + (bal * roi * lp);
      System.out.println("Balance is now : "+bal);
    }
    else{
      System.out.println("ACCOUNT Has Been closed");
    }
    
  }

  double closeAccount(double yearc){
    if(yearc < Lockedinperiod){
      lp = yearc;
      System.out.println("FD closed before Time period");
      updateInterest();
      bal = bal - bal * 0.05;
    }
    else{
      System.out.println("FD Closed");
      updateInterest();
    }
    state = false;
    System.out.println("Balance is now : "+bal);
    return bal;
  }
}
