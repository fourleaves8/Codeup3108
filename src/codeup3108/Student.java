package codeup3108;

public class Student {
	private char c;
	private int no;
	private String name;

	public char getCode() {
		return c;
	}

	public void setCode(char c) {
		this.c = c;
	}

	public int getNo() {
		return no;
	}

	public void setNo(char no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(char c, int no, String name) {
		this.c = c;
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [c=" + c + ", no=" + no + ", name=" + name + "]";
	}

}
