package udemyjava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class courses {
	private String courseName;
	private int Ratings;
	private String category;

	public courses(String courseName, String category, int Ratings) {
		this.courseName = courseName;
		this.Ratings = Ratings;
		this.category = category;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getRatings() {
		return Ratings;
	}

	public void setRatings(int ratings) {
		Ratings = ratings;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "courses [courseName=" + courseName + ", Ratings=" + Ratings + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<courses> l = Arrays.asList(new courses("spring boot", "framework", 80),
				new courses("hibernate", "framework", 80), new courses("python", "language", 90),
				new courses("AWS", "cloud", 91));
		System.out.println(l.stream().allMatch(r -> r.getRatings() > 90));
		System.out.println(l.stream().noneMatch(r -> r.getRatings() < 80));
		System.out.println(l.stream().anyMatch(r -> r.getRatings() > 80));
		
		//Stream.iterate(new int[] {0,1}, n->new int[] {n[1],n[0]+n[1]}).limit(10).map(n->n[0]).forEach(System.out::println);
		int a=Stream.iterate(new int[] {0,1}, n->new int[] {n[1],n[0]+n[1]}).limit(10).map(n->n[0]).mapToInt(n->n).sum();
		System.out.println(a);

		Comparator<courses> c = Comparator.comparing(courses::getRatings);
		Comparator<courses> c1 = Comparator.comparing(courses::getRatings).reversed();
		Comparator<courses> c2 = Comparator.comparing(courses::getRatings).thenComparing(courses::getCourseName);

		System.out.println(l.stream().sorted(c).collect(Collectors.toList()));
		System.out.println(l.stream().sorted(c1).collect(Collectors.toList()));
		System.out.println(l.stream().sorted(c2).collect(Collectors.toList()));
		System.out.println(l.stream().sorted(c2).collect(Collectors.toList()));
		System.out.println(l.stream().sorted(c).limit(2).collect(Collectors.toList()));
		System.out.println(l.stream().sorted(c).skip(2).collect(Collectors.toList()));
		System.out.println(l.stream().filter(co -> co.getRatings() > 90).min(c));
		System.out.println(l.stream().filter(co -> co.getRatings() > 90).max(c));
		System.out.println(l.stream().filter(co -> co.getRatings() > 90).findFirst());
		System.out.println(l.stream().filter(co -> co.getRatings() > 100).findAny());
		System.out.println(l.stream().filter(co -> co.getRatings() >= 90).mapToInt(courses::getRatings).sum());
		System.out.println(l.stream().filter(co -> co.getRatings() >= 90).mapToInt(courses::getRatings).count());
		System.out.println(l.stream().filter(co -> co.getRatings() >= 90).mapToInt(courses::getRatings).average());
		System.out.println(l.stream().collect(Collectors.groupingBy(courses::getCategory)));
		System.out.println(l.stream().collect(Collectors.groupingBy(courses::getCategory, Collectors.counting())));
		System.out.println(l.stream().collect(Collectors.groupingBy(courses::getCategory,
				Collectors.maxBy(Comparator.comparing(courses::getRatings).reversed()))));
		System.out.println(l.stream().collect(Collectors.groupingBy(courses::getCategory,
				Collectors.mapping(courses::getRatings, Collectors.toList()))));
		System.out.println(l.stream().collect(Collectors.groupingBy(courses::getCategory,
				Collectors.mapping(courses::getRatings, Collectors.toList()))));
		
		
		
		
		
		
		
		
		
		

	}

}
