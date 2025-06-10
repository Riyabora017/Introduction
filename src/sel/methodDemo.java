package sel;
public class methodDemo {
	
	public String getUserData()
	{	
		 System.out.println("youhello");
		 return "youhello";
		
	}

public String getData(){	
	 System.out.println("hello");
	 return "hello";
	}
public static String getdata() {
	System.out.println("yuvi");
	return "yuvi";
}



	public static void main(String[] args) {
		methodDemo d =new methodDemo();
		String name = d.getData();
		System.out.println(name);
		
		methodDemo d2 =new methodDemo();
		String name2 = d2.getUserData();
		System.out.println(name2);
		getdata();

	}

}