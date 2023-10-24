package udemyjava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class demoJava8Udemy {

	public static void printAllNumbers(List<Integer> a) {
		System.out.println("even numbers");
		a.stream().filter(r -> r % 2 == 0).forEach(System.out::println);
	}

	public static void printAllOddnumbers(List<Integer> b) {
		System.out.println("odd numbers");
		b.stream().filter(r -> r % 2 != 0).map(p->p*p).forEach(System.out::println);

	}
	
	public static void printAllCourses(List<String> c) {
      System.out.println("Courses");
      c.stream().forEach(System.out::println);
	}

	public static void printStartWithS(List<String> c) {
	      System.out.println("Courses with s");
	      c.stream().filter(r->r.contains("suma")).forEach(System.out::println);
		}
	public static int printSum(List<Integer> c) {
	      System.out.println("sum");
	      return (c.stream().reduce(0,(x,y)->x>y?x:y));
		}
	
	public static int printMin(List<Integer> c) {
	      System.out.println("min value when there is -ve numbers so we do not use 0 ");
	      return (c.stream().reduce(Integer.MAX_VALUE,(x,y)->x>y?y:x));
		}
	
	public static void printParameterized(List<Integer> c,Function<Integer, Integer> function) {
	      System.out.println("parameterixed ");
	       c.stream().map(x->x*x).forEach(System.out::println);
	      
		}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllNumbers(Arrays.asList(12, 7, 8, 9, 5, 4, 5));
		printAllOddnumbers(Arrays.asList(12, 7, 8, 9, 5, 4, 5));
		printAllCourses(Arrays.asList("suma","kavya","sandhiya"));
		printStartWithS(Arrays.asList("suma","kavya","sandhiya suma"));
		int a=printSum(Arrays.asList(12, 7, 8, 9, 5, 4, 5));
		System.out.println(a);
		int b=printMin(Arrays.asList(12, 7, 8, 9, 5, 4, 5));
		System.out.println(b);
		 printParameterized(Arrays.asList(12, 7, 8, 9, 5, 4, 5),x->x*x);

}
}
