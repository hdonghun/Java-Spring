package day7_추상클래스_템플릿메서드패턴;

public class ManualCar extends Car{

	
	@Override
	public void drive() {
		System.out.println("사람이 운전 합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("장애물 앞에서 브레이크를 밟아서 정지합니다.");
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}
	
}
