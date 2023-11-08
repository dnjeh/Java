package kr.ac.kw._20230614.Exam1;

public class BookMain {
	public static void main(String[] args) {
		System.out.println(Book.getLibrary()+"의 현재 도서는 "+Book.getBookCnt()+"권 입니다");
		System.out.println("******************************");
		Book CloudBread = new Book();
		Book WMpool = new Book(102, "수박수영장");
		Book DogPoop = new Book(103, "강아지똥", 15);
		CloudBread.setNo(101);
		CloudBread.setName("구름빵");
		CloudBread.setCount(10);
		CloudBread.setBorrow(0);
		WMpool.setCount(5);
		WMpool.setName("수박수영장");
		CloudBread.printInfo();
		WMpool.printInfo();
		DogPoop.printInfo();
		System.out.println("******************************");
		System.out.println(Book.getLibrary()+"의 현재 도서는 "+Book.getBookCnt()+"권 입니다");
		System.out.println("******************************");
		CloudBread.borrowBook(15);
		WMpool.returnBook(2);
		CloudBread.borrowBook(5);
		DogPoop.borrowBook(10);
		DogPoop.returnBook(5);
		System.out.println("******************************");
		CloudBread.printInfo();
		WMpool.printInfo();
		DogPoop.printInfo();
	}
}

