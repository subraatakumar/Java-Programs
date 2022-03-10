public String middleTwo(String str) {
  if(str.length() <=2) {
    return str;
  }
  return str.substring(str.length()/2-1,str.length()/2+1);
}
