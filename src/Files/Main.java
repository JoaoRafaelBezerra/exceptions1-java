package Files;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;



public class Main {

	public static void main(String[] args) {//Map
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,8,9,0);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("MAria","Fernando","Xabude");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(2, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(5).toArray()));
	}

	
}

