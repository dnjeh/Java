package threadExam;

public class ThreadExam {
	
	public static void main(String[] args) {
		Room room = new Room();
		//2. 단 둘이서.. 
		CleanThreadEmp thread1 = new CleanThreadEmp(room);
		CleanRunnableEmp cr = new CleanRunnableEmp(room);
		Thread thread = new Thread(cr);
		thread1.start();
		thread.start();
		
		//1. 나 홀로 청소
		//cleanByBoss();
	}
	
	private static void cleanByBoss() {
		for(int i=1;i<=10;i+=2) {
			System.out.println("아이경 사장이 " + i + "번 방 청소합니다.");
		}
	}
}

