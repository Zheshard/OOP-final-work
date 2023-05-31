package CalculatorComplexNum;

/**
 * Интерфейс, определяющий метод создания объекта калькулятор
 */
public interface ICalculableFactory {
	iCalculable create(ComplexNumber primaryArg);
}
