public boolean endOther(String a, String b) {
  if(a.length() < b.length()){
    String temp = a;
    a = b;
    b = temp;
  }
    if(a.toLowerCase().substring(a.length()-b.length()).equals(b.toLowerCase())){
      return true;
    }
      return false;
  

}
