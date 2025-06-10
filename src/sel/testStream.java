package sel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testStream {
	@Test
	public void regular() {
		ArrayList <String>names = new ArrayList();
		names.add("Riya");
		names.add("Aadit");
		names.add("shivi");
		names.add("Aarav");
		names.add("Pihu");
		int count=0;
		for(int i=0;i<names.size();i++) {
			String actual= names.get(i);
			
			if(actual.startsWith("A")) {
				count++;
				System.out.println(actual);
				}
			}
		System.out.println("*****************************");
		System.out.println(count);
	

}
	//stream,filter
	@Test
	public void streamFilter() {
		ArrayList <String>names = new ArrayList();
		names.add("Riya");
		names.add("Aadit");
		names.add("Rashivi");
		names.add("Aarav");
		names.add("Ruhi");
		Long C=names.stream().filter(s->s.startsWith("R")).count();
		System.out.println(C);
		Long d=Stream.of("Riya","Aadit","Rashivi","Aarav","Ruhi").filter(s->
		{
			s.startsWith("R");
			return true;
		
				}).count();
		System.out.println(d);
		//print all names of ArrayList
//		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	//map
	@Test
	public void streamMap() {
		ArrayList <String>names = new ArrayList();
		names.add("Riya");
		names.add("Rashivi");
		names.add("Aarav");
		
		//print length of names>4with Uppercase
		Stream.of("Riya","Aadit","Rashivi","Aarav","Ruhi").filter(s->s.endsWith("i")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("*************************************");
		List<String> names1=Arrays.asList("Rahi","Aadit","Yash","Anaya","Zeeva");
		names1.stream().filter(s->s.length()>3).sorted().forEach(s->System.out.println(s));
		System.out.println("*************************************");
		//merge stream
		Stream<String>newStream = Stream.concat(names.stream(), names1.stream());
//		newStream.sorted().forEach(s->System.out.println(s)); 
		//any match method
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Yash"));
		System.out.println(flag);
		Assert.assertTrue(flag);
			
	}
	//collect method
	public void streamCollect() {
	List<String>ls=Stream.of("Riya","Aadit","Rashivi","Aarav","Ruhi").filter(s->s.endsWith("i")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
	System.out.println(ls.get(0));
	

		//print unique no.
		//sort array,take 3rd index

	List<Integer>values=Arrays.asList(3,2,4,5,9,3,8,2,4);
//	values.stream().distinct().forEach(s->System.out.println(s));
	List<Integer> li=values.stream().sorted().distinct().collect(Collectors.toList());
	System.out.println(li.get(2));
	}
	   public static void main(String[] args) {
	        testStream ts = new testStream();
	        ts.regular();
	        ts.streamFilter();
	        ts.streamMap();
	        ts.streamCollect();
	       
}}