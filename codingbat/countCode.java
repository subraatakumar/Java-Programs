public int countCode(String str) {
  int result=0;
		String searchString = "code";
		for(int i=0; i<str.length()-3; i++) {
			if(str.substring(i,i+2).equals("co") && str.substring(i+3,i+4).equals("e")) {
				result++;
			}
		}
		return result;
		
}
