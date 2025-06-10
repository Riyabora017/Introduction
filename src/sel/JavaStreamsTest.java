package sel;

import java.util.ArrayList;

public class JavaStreamsTest {

	public void regular() {
		ArrayList<String> name =new ArrayList();
		name.add("Riyu");
		name.add("Shivi");
		name.add("Aadit");
		name.add("vihu");
		name.add("Aarvi");
		int count=0;
		for(int i=0;i<name.size();i++) {
			String actual=name.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println("count");
	}
	

}
