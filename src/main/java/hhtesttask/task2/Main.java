package hhtesttask.task2;
  
public class Main {

	public static void main(String[] args) {
		Car ford = new Ford();
		
		Travel travel = new Travel(ford);
		travel.doTravel();
		
		travel.setCar(new Opel());
		travel.doTravel();
		
		travel.setCar(new Mazda());
		travel.doTravel();
		
		// Изменим методs расчета амортизации и стоимости ремонта для форда
		ford.setCalcAmortization(new NonlinearMethodAmortization(1, 1));
		ford.setCalcRepair(new RepairCostMethod(150));
		travel.setCar(ford);
		travel.doTravel();
	}

}
