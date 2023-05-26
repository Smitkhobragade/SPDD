public class Main {
  public static void main(String[] args) {
    SavingAccount a = new SavingAccount("Shreyash", 123456);
    a.display();
    a.deposit(10000);
    a.withdraw(10);
    // a.updateInterest();
    a.closeAccount();
    // a.updateInterest();
    a.deposit(1000);

    SavingAccount a1 = new SavingAccount("Sujyot", 1223344);
    a1.display();
    a1.deposit(36000);
    a1.withdraw(1000);
    a1.updateInterest();
    a1.closeAccount();
    a1.display();

    FixedDepositAccount a2 = new FixedDepositAccount("Saurabh", 223344, 7, 10000);
    a2.display();
    a2.closeAccount(2);
    a2.updateInterest();

    FixedDepositAccount a3 = new FixedDepositAccount("Sahil", 687422, 4, 120000);
    a3.display();
    a3.closeAccount();
    a3.updateInterest();

  }
}
