package kr.ac.kw._20230607;

public class CastingExam23 {
	public static void main(String[] args) {
		CarExam23 mycar, yourcar;
		BusExam23 mybus, yourbus;
		TruckExam23 mytruck, yourtruck;
		
		mycar = new CarExam23();
		mybus = new BusExam23();
		mytruck = new TruckExam23();
		
		System.out.println("[" + mycar.print() + "]");
		System.out.println("[" + mybus.print() + "]");
		System.out.println("[" + mytruck.print() + "]");
		
		yourcar = mybus;
		yourbus = (BusExam23)yourcar;
		System.out.println("[" + yourbus.print() + "]");
		yourcar = mytruck;
		yourtruck = (TruckExam23)yourcar;
		System.out.println("[" + yourtruck.print() + "]");
	}
}
