package kr.ac.kw._20230614.Exam1;

public class Book {
	private int no;
	private String name;
	private int count;
	private int borrow;
	private static final String Library = "로봇도서관";
	private static int bookCnt;
	
	public Book() {
		bookCnt++;
	}
	
	public Book(int no, String name) {
		this();
		this.no = no;
		this.name = name;
	}

	public Book(int no, String name, int count) {
		this(no, name);
		this.count = count;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getBorrow() {
		return borrow;
	}
	public void setBorrow(int borrow) {
		this.borrow = borrow;
	}
	public static int getBookCnt() {
		return bookCnt;
	}
	public static String getLibrary() {
		return Library;
	}
	public void printInfo() {
		System.out.printf("번호:%d 도서명:%s 도서개수:%d 대여개수:%d\n", no, name, count, borrow);
	}
	public void borrowBook(int cnt) {
		if(count<cnt) {
			System.out.printf("%d번 도서 %d권 대출 실패\n", no, cnt);
		}
		else {
			count-=cnt;
			borrow+=cnt;
			System.out.printf("%d번 도서 %d권 대출 성공\n", no, cnt);
		}
	}
	public void returnBook(int cnt) {
		if(borrow<cnt) {
			System.out.printf("%d번 도서 %d권 반납 실패\n", no, cnt);
		}
		else {
			count+=cnt;
			borrow-=cnt;
			System.out.printf("%d번 도서 %d권 반납 성공\n", no, cnt);
		}
	}
}
