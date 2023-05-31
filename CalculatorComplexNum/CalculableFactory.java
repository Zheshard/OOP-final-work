package CalculatorComplexNum;

/**
 * Класс фабрика калькуляторов, создающий объект калькулятор
 */
public class CalculableFactory implements ICalculableFactory {
	public iCalculable create(ComplexNumber primaryArg) {
		return new CalculatorComplexNum(primaryArg);
	}
}
