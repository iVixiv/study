package day1.mc;

public class R extends Person implements Monster{

	@Override
	public void Boom() {
	
	}

	@Override
	public void fly() {
		System.out.println("R½´»á·É");
	}

	@Override
	public void live() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setHp(int hp) {
		// TODO Auto-generated method stub
		
	}
	

	public void eat() {
		System.out.println("R½´Òª³Ô¼¦ºÐ");
	}
	
	public void eat(String food) {
		System.out.println("R½´Òª³Ô¼¦ºÐºÍ"+food);
	}



}
