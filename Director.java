package creational.Builder._03;

public class Director {
	IBuilder builder;
	
	public void build(IBuilder builder) {
		this.builder = builder;
		this.builder.buildBody();
		this.builder.insertWheels();
		this.builder.addHeadlights();
	}
}
