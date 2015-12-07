package hhtesttask.task2;

/**
 * Класс для нелинейного метода расчета амортизации.
 * Понятно, что амортизация должна как-то расчитываться, а потом умножаться на
 * коэффициент амортизации. Но с целью упрощения задачи, будем просто задавать
 * значение амортизации в конструкторе.
 */
public class NonlinearMethodAmortization implements Amortization{
	private double coeffAmortization;
	private double аmortization;
	
	public NonlinearMethodAmortization(double coeffAmortization, double аmortization) {
		this.coeffAmortization = coeffAmortization;
		this.аmortization = аmortization;
	}
	
	public double calculate() {
		return аmortization * coeffAmortization;
	}

}
