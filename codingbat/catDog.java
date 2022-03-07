
public class catDog {
	
	public boolean catDog(String str) {
		  // Calculation here
		  String cat = "cat";
		  int catNo = 0;
		  String dog = "dog";
		  int dogNo = 0;
		  int length = str.length();
		  int i=0;
		  String dogString = str;
		  while(length >= cat.length()) {
			  if(str.indexOf(cat) != -1) {
				  i = str.indexOf(cat);
				  str = str.substring(i+1);
				  length = str.length();
				  catNo++;
			  }else {
				  break;
			  }
		  }
		  i = 0;
		  str = dogString;
		  length = str.length();
		  while(length >= dog.length()) {
			  if(str.indexOf(dog) != -1) {
				  i = str.indexOf(dog);
				  str = str.substring(i+1);
				  length = str.length();
				  dogNo++;
			  }else {
				  break;
			  }
		  }
		  return catNo == dogNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		catDog obj1 = new catDog();
		System.out.println(obj1.catDog("catxdogxdogxcat"));
	}

}
