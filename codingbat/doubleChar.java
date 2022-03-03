public class doubleChar {

	public String doubleChar(String s) {
		String result="";
		for(int i=0; i< s.length(); i++) {
			//System.out.println(s.charAt(i));
			result = result + s.charAt(i)+s.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubleChar obj1 = new doubleChar();
		System.out.println(obj1.doubleChar("The"));
		System.out.println(obj1.doubleChar("AAbb"));
		System.out.println(obj1.doubleChar("Hi-There"));

	}

}
