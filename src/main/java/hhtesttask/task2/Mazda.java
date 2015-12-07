package hhtesttask.task2;

public class Mazda extends Car {

	public Mazda() {
		super(new NonlinearMethodAmortization(15, 5), 
				new RepairCostMethod(150));
	}

}
