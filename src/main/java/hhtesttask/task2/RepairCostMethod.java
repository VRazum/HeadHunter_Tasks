package hhtesttask.task2;

/**
 * Класс для одного из методов расчета стоимости ремонта автомобиля
 * Для того, чтобы упростить задачу, будем просто задавать
 * значение стоимости ремонта автомобиля в конструкторе.
 *
 */
public class RepairCostMethod implements RepairCost{
	private double repairCost;
	
	public RepairCostMethod(double repairCost) {
		this.repairCost = repairCost;
	}
	
	public double calculate() {
		return repairCost;
	}

}
