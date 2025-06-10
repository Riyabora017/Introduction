package sel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Corejavabrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {1,2,3,4,5,6,7,8,9,10};
for(int i=1;i<arr.length;i++) {
	if(arr[i]%2==0){
System.out.println(arr[i]);
}
}
System.out.println("******************");
List<String> a= new ArrayList<String>();
a.add("rahul");
a.add("shivi");
a.add("Aadit");
System.out.println(a.get(2));
for(int i=0;i<a.size();i++) {
	System.out.println(a.get(i));
}
System.out.println("******************");
for(String val:a) {
	System.out.println(val);
}
System.out.println(a.contains("shivi"));//a.contains check item present or not

String[] names = {"RUHI","Aayush","aradhya","vyom"};
List<String> namesArrayList = Arrays.asList(names);
namesArrayList.contains("vyom");
System.out.println("******************");
for(int i=0;i<namesArrayList.size();i++) {
	System.out.println(namesArrayList.get(i));
}
	}
}

	