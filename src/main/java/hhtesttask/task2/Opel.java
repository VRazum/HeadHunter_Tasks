package hhtesttask.task2;

public class Opel extends Car{

	public Opel() {
		super(new NonlinearMethodAmortization(10, 3),
			  new RepairCostMethod(200));	
	}
}
