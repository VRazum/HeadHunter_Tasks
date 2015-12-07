package hhtesttask.task2;

public class Ford extends Car{

	public Ford() {
		super(new NonlinearMethodAmortization(5, 5),
				new RepairCostMethod(100));	
	}
}
