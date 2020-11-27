package codeup3108;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 데이터 개수

		sc.nextLine();

		List<Student> students = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			String stdInfo = sc.nextLine();
			char c = stdInfo.charAt(0);
			int no = Integer.parseInt(stdInfo.split(" ")[1]);
			String name = stdInfo.split(" ")[2];

			students.add(new Student(c, no, name));

		}
		sc.close();

		System.out.println(students);

	} // main()

} // Main
