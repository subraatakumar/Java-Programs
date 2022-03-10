public String withouEnd2(String str) {
  int x = str.length();
  if(str.length() <= 1){ return "";}
  
  return str.substring(1).substring(0,str.length()-2)   ;
}
