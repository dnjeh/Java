package threadExam;

public class CleanThreadEmp extends Thread {
	
	Room room;
	
	public CleanThreadEmp(Room room) {
		this.room = room;
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			room.cleanRoom();
		}
		super.run();
	}
}
