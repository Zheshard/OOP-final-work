package CalculatorComplexNum;

import java.util.Date;

/**
 * Декоратор, добавляющий функционал логгирования
 */
public class DecLogCalc implements iCalculable {
	private CalculatorComplexNum decorated;
	private Logger logger;

	/**
	 * Конструктор с двумя параметрами
	 * 
	 * @param calculatorComplexNum - исходный класс калькулятора
	 * @param logger               - добавляемый функционал
	 */
	public DecLogCalc(CalculatorComplexNum calculatorComplexNum, iLoggable logger) {
		this.decorated = calculatorComplexNum;
		this.logger = (Logger) logger;
	}

	@Override
	public iCalculable sum(ComplexNumber arg) {
		ComplexNumber firstArg = (decorated).getResult();
		logger.log(
				String.format("%s: Первое значение калькулятора %s. Начало вызова метода sum с параметром %s", new Date(),
						firstArg, arg));
		iCalculable result = ((iCalculable) decorated).sum(arg);
		logger.log(String.format("%s: Вызова метода sum произошел", new Date()));
		return this;
	}

	@Override
	public iCalculable multi(ComplexNumber arg) {
		ComplexNumber firstArg = (decorated).getResult();
		logger.log(
				String.format("%s: Первое значение калькулятора %s. Начало вызова метода multi с параметром %s", new Date(),
						firstArg,
						arg));
		iCalculable result = ((iCalculable) decorated).multi(arg);
		logger.log(String.format("%s: Вызова метода multi произошел", new Date()));
		return result;
	}

	@Override
	public ComplexNumber getResult() {
		ComplexNumber result = (decorated).getResult();
		logger.log(String.format("%s: Получение результата %s", new Date(), result));
		return result;
	}

	@Override
	public iCalculable div(ComplexNumber arg) {
		ComplexNumber firstArg = (decorated).getResult();
		logger.log(
				String.format("%s: Первое значение калькулятора %s. Начало вызова метода multi с параметром %s", new Date(),
						firstArg,
						arg));
		iCalculable result = ((iCalculable) decorated).div(arg);
		logger.log(String.format("%s: Вызова метода div произошел", new Date()));
		return result;
	}

	@Override
	public iCalculable sub(ComplexNumber arg) {
		ComplexNumber firstArg = (decorated).getResult();
		logger.log(
				String.format("%s: Первое значение калькулятора %s. Начало вызова метода multi с параметром %s", new Date(),
						firstArg,
						arg));
		iCalculable result = ((iCalculable) decorated).sub(arg);
		logger.log(String.format("%s: Вызова метода sub произошел", new Date()));
		return result;
	}
}
