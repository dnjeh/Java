package kr.ac.kw._20230531;

public class EngHelloExam20 extends GreetingExam20 {
    public String name = "Mr.Hong";

    public void sayHello() {
        System.out.println(name + " Nice to meet you");
    }

    public void test() {
        System.out.print(super.name);
        super.sayHello();
    }
    public static void main(String[] args) {
        EngHelloExam20 eng = new EngHelloExam20();
        eng.sayHello();
        eng.test();
    }
}
