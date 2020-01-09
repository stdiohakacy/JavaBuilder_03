package creational.Builder._03;

public interface IBuilder {
	void buildBody();

	void insertWheels();

	void addHeadlights();

	Product getVehicle();
}

class Car implements IBuilder {
	private Product product = new Product();

	@Override
	public void buildBody() {
		product.add("This is body of car!");
	}

	@Override
	public void insertWheels() {
		product.add("4 wheels area added!");
	}

	@Override
	public void addHeadlights() {
		product.add("2 headlights are added!");
	}

	@Override
	public Product getVehicle() {
		return product;
	}
}

class MotorCycle implements IBuilder {
	private Product product = new Product();

	@Override
	public void buildBody() {
		product.add("This is body of motor");
	}

	@Override
	public void insertWheels() {
		product.add("2 wheels area added!!!");
	}

	@Override
	public void addHeadlights() {
		product.add("2 wheels area added!!!");
	}

	@Override
	public Product getVehicle() {
		return product;
	}

}