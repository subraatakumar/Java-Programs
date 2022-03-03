public class countHi {
	
	public int countHi(String str) {
		int result=0;
		String searchString = "hi";
		// Operation here
		for(int i=0; i<str.length()-1; i++) {
			//System.out.println(str.substring(i,i+2));
			if(str.substring(i,i+2).equals(searchString)) {
				result++;
			}
		}
		
		
		return result;
		
	}	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		countHi obj1 = new countHi();
		System.out.println(obj1.countHi("abc hi ho"));
		System.out.println(obj1.countHi("ABChi hi"));
		System.out.println(obj1.countHi("hihi"));

	}

}
