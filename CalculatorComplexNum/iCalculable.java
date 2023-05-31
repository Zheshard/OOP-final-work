package CalculatorComplexNum;

/**
 * Интерфейс определяющий методы для вычисления мат операций
 */
public interface iCalculable {
	iCalculable sum(ComplexNumber arg);

	iCalculable sub(ComplexNumber arg);

	iCalculable multi(ComplexNumber arg);

	iCalculable div(ComplexNumber arg);

	ComplexNumber getResult();
}
