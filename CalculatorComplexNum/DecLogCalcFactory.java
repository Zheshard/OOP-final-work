package CalculatorComplexNum;

public class DecLogCalcFactory implements ICalculableFactory {
	private iLoggable logger;

	public DecLogCalcFactory(Logger logger) {
		this.logger = logger;
	}

	public iCalculable create(ComplexNumber primaryArg) {
		return new DecLogCalc(new CalculatorComplexNum(primaryArg), logger);
	}
}
