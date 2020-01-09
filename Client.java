package creational.Builder._03;

public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		IBuilder carBuilder = new Car();
		IBuilder motorBuilder = new MotorCycle();
		
		director.build(carBuilder);
		Product car = carBuilder.getVehicle();
		car.show();
		
		director.build(motorBuilder);
		Product motor = motorBuilder.getVehicle();
		motor.show();
	}
}
