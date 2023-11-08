package threadExam;

public class CleanRunnableEmp implements Runnable {
	
	Room room;
	
	public CleanRunnableEmp(Room room) {
		this.room = room;
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			room.cleanRoom();
		}
	}
}
