package kr.ac.kw._20230712;

public class ShipExam extends Ship {
	String ship;
	int p, l;
	
	public ShipExam(String ship, int p, int l) {
		this.ship = ship;
		this.p = p;
		this.l = l;
	}
	
	public String getShip() {
		return ship;
	}
	
	public int Passenger() {
		return p;
	}
	
	public int Luggage() {
		return l;
	}
	
	public static void main(String[] args) {
		ShipExam s1 = new ShipExam("거북선", 10, 10);
		
		System.out.println("배 이름 : " + s1.getShip());
		System.out.println("최대 탑승 인원 : " + s1.Passenger() + "명");
		System.out.println("최대 적재량 : " + s1.Luggage() + "kg");
	}
}
