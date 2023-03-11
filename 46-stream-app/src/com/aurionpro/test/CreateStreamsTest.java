package com.aurionpro.test;

import java.nio.file.attribute.AclEntry.Builder;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamsTest {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(10,20,30,40);
//		stream.forEach((n)->System.out.println(n));
		//forEach is a terminal Operation
		stream.forEach(System.out::println);
		
		System.out.println();
		
		
		Stream<String> stringStream = Stream.of("Krutika","Rasika","Komal");
		stringStream.forEach(System.out::println);
		
		System.out.println();
		List<String> players = Arrays.asList("Krutika","Sheetal","Komal");
		
//		List<String> collect = players.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
//		
//		System.out.println(collect);
		
//		List<String> playersUpper = new ArrayList<String>();
		
		players.stream().forEach(System.out::println);
		
//		for(int i=0;i<players.size();i++) {
//			
//			playersUpper.add(players.get(i).toUpperCase());
//		}
//		
//		System.out.println(playersUpper);
		
		Stream<String> javaStream = Stream.generate(()->"Java").limit(4);
		
		javaStream.forEach(System.out::println);
		
		Stream<Integer> numberStream = Stream.iterate(1, n->n+10).limit(5);
		numberStream.forEach(System.out::println);
		
		Stream.Builder<String> builder = Stream.builder();
		
		Stream<String> build = builder.add("Krutika")
									.add("Rasika")
									
									.build();
		
		build.forEach(System.out::println);
		
	}

}
