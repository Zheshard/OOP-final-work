package CalculatorComplexNum;

/**
 * Программа "Калькулятор комплексных чисел", реализующая выполнение сложения,
 * вычитания, деления и умножения.
 */
public class Main {
	public static void main(String[] args) {
		ICalculableFactory calculableFactory = new DecLogCalcFactory(new Logger());
		ViewCalculator view = new ViewCalculator(calculableFactory);
		view.run();
	}
}
