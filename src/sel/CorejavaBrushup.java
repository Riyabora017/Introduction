package sel;

public class CorejavaBrushup {
public static void main(String[]args) {
	int mynum = 245;
	String dream = "Aadit+riya = Aadya";
	char letter = 'a';
	boolean myCard = true;
		
	System.out.println("mynum: " + mynum);
	System.out.println("dream: " + dream);
	System.out.println("letter: " + letter);
	System.out.println("myCard: " + myCard);
	
	System.out.println("*********************");
//	int arr[]= {10,22,33,54,65};
	int[]arr = new int[5];
	System.out.println(arr[0]=20);
	System.out.println(	arr[1]=34);
	System.out.println(arr[2]=45);
	System.out.println(arr[3]=56);
	System.out.println(arr[4]=61);
			//	System.out.println(arr[0]);
//	System.out.println(arr[1]);
//	System.out.println(arr[2]);
//	System.out.println(arr[3]);
//	System.out.println(arr[4]);
	System.out.println("*********************");
	for(int i=0;i<arr.length;i++) {
		if (arr[i]%2==0) {
		System.out.println(arr[i]+2);
		}else {
			System.out.println(arr[i]-5);
	}
	}
	 System.out.println("******************");
 String[] name={"shivin","Aashya","Ruhi"};
 for(int i=0;i<name.length;i++) {
 System.out.println(name[i]);
 }
 

 System.out.println("******************");
//for each loop
	for (String s:name)
	{
		System.out.println(s);	
	}
	
	
	
	
	
	
	
}
}