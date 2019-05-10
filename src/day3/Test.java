package day3;

public class Test {

	//继承只能继承一个
	//实现接口可以实现多个
	//‘单’继承多实现
	//封裝  不内部实现过程  只在乎接口的定义
	//接口实现
	//继承
	//重写和重载
	// http://www.runoob.com/java/java-polymorphism.html
	public static void main(String[] args) {
		Moblie apple = new Apple();
		Moblie xiaomi = new Xiaomi();
		apple.call();
		xiaomi.play();
	}

}
