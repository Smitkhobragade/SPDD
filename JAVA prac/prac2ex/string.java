public class string {
  char[] s;
  int l;
  string(int len){
    l = len;
    s = new char[l];
  }
  string(String st){
    l = st.length();
    s = new char[l];

    for(int i = 0;i<l;i++){
      s[i]=st.charAt(i);
    }
  }

  void display(){
    for (int i = 0; i < l; i++) {
      System.out.printf(s[i]+" ");
    }
    System.out.println("");
  }

  void displayrev(){
    for (int i = l-1; i >= 0; i--) {
      System.out.printf(s[i]+" ");
    }
    System.out.println("");
  }

  void checkstr(string a, string b){
    if(a.l == b.l){
      for(int i =0 ;i < a.l ; i++){
        if(a.s[i] != b.s[i]){
          System.out.println("00");
          return;
        }
      }
      System.out.println("11");

    }
    else{
      System.out.println("00");
    }
  }

  string contatenate(string a, string b){
    string c = new string(a.l + b.l);
    for(int i = 0;i<(a.l);i++){
      c.s[i] = a.s[i];
    }
    for(int i = a.l;i<(b.l);i++){
      c.s[i] = b.s[i];
    }
    return c;
  }



}


