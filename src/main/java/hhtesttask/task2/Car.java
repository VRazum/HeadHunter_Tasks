package hhtesttask.task2;

public abstract class Car {
	private Amortization amortization;
	private RepairCost repairCost;
	
	public Car(Amortization amortization, RepairCost repair) {
		this.amortization = amortization;
		this.repairCost = repair;
	}
	
	public void setCalcAmortization(Amortization amortization) {
		this.amortization = amortization;
	}
	
	public void setCalcRepair(RepairCost repair) {
		this.repairCost = repair;
	}
	
	public double calcAmortization() {
		return amortization.calculate();
	}
	
	public double calcRepair() {
		return repairCost.calculate();
	}
}
