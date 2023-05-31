package CalculatorComplexNum;

import java.util.Scanner;

/**
 * Класс для взаимодействия с пользователем и вывода результатов вычислений в
 * консоль
 */
public class ViewCalculator {

	/* фабрика калькуляторов */
	private ICalculableFactory calculableFactory;

	/**
	 * Конструктор
	 * 
	 * @param calculableFactory
	 */
	public ViewCalculator(ICalculableFactory calculableFactory) {
		this.calculableFactory = calculableFactory;
	}

	/**
	 * Метод запуска работы калькулятора и взаимодействия с пользователем
	 */
	public void run() {
		while (true) {

			/* создание экземпляра комплексного числа и ввод комплексного числа */
			Double reFirstNum = promptDouble("Введите вещественную часть первого комплексного числа: ");
			Double imFirstNum = promptDouble("Введите мнимую часть первого комплексного числа: ");
			ComplexNumber primaryArg = new ComplexNumber(reFirstNum, imFirstNum);

			/* создать калькулятор */
			iCalculable calculator = calculableFactory.create(primaryArg);

			while (true) {
				String cmd = prompt("Введите команду (*, / , +, -, =) : ");

				/*
				 * Вызов функций математических операций, в зависимости от введенного мат
				 * оператора
				 */
				if (cmd.equals("*")) {
					calculator.multi(getSecondArg());
					continue;
				}
				if (cmd.equals("/")) {
					calculator.div(getSecondArg());
					continue;
				}
				if (cmd.equals("+")) {
					calculator.sum(getSecondArg());
					continue;
				}
				if (cmd.equals("-")) {
					calculator.sub(getSecondArg());
					continue;
				}
				if (cmd.equals("=")) {
					ComplexNumber result = calculator.getResult();
					System.out.println(String.format("Результат %s\n", result));
					break;
				}
			}
			String cmd = prompt("Еще посчитать (Y/N)?");
			if (cmd.equals("Y")) {
				continue;
			}
			break;
		}
	}

	/**
	 * Метод ввода математической операции
	 * 
	 * @param message сообщение приглашения на ввод
	 * @return возврат введенной математической операции
	 */
	private String prompt(String message) {
		Scanner in = new Scanner(System.in);
		System.out.print(message);
		return in.nextLine();
	}

	/**
	 * Метод считвания данных из консоли
	 * 
	 * @param message сообщение приглашения на ввод
	 * @return возврат введенного значения
	 */
	private Double promptDouble(String message) {
		Scanner in = new Scanner(System.in);
		System.out.print(message);
		return Double.parseDouble(in.nextLine());
	}

	/**
	 * Метод создания экземпляра класса ComplexNumber и ввода второго комплексного
	 * числа
	 * 
	 * @return возврат комлпексного числа
	 */
	private ComplexNumber getSecondArg() {
		Double reSecondNum = promptDouble("Введите вещественную часть второго комплексного числа: ");
		Double imSecondNum = promptDouble("Введите мнимую часть второго комплексного числа: ");
		return new ComplexNumber(reSecondNum, imSecondNum);
	}
}
