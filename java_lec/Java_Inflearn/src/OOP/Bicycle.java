package OOP;

public class Bicycle {

	String color;
	int price;
	
	public Bicycle() {
		System.out.println("Bicycle constructor - I");
	}//������(constructor) - (Ŭ������ ȣ��ɶ� ���� ���� ����Ǵ� �κ�)
	
	public Bicycle(String c, int p) {
		System.out.println("Bicycle constructor - II");
		
		color = c;
		price = p;
	}
	
	public void info() {
		System.out.println("-- info --");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
}