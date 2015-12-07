package hhtesttask.task2;

import java.util.Random;

public class Travel {
	Car car;
    
	public Travel(Car car) {
		this.car = car;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void doTravel() {
		if (car != null) {
			double someLogic = car.calcRepair() * someInnerLogic();
			System.out.println(car.calcAmortization() + someLogic);
		}
	}
	
    private double someInnerLogic() {
      return new Random().nextDouble() + 1;
    }
}
