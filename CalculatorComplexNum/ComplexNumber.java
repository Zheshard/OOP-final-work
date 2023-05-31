package CalculatorComplexNum;

/**
 * Класс реализующий методы работы с комлпексными числами
 */
public class ComplexNumber implements iComplexNum {

	/* вещественная часть */
	private Double real;
	/* мнимая часть */
	private Double imaginary;

	/**
	 * Конструктор
	 * 
	 * @param real      вещественная часть
	 * @param imaginary мнимая часть
	 */
	public ComplexNumber(Double real, Double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	@Override
	public double getIm() {
		return this.imaginary;
	}

	@Override
	public double getRe() {
		return this.real;
	}

	@Override
	public void setIm(Double imaginary) {
		this.imaginary = imaginary;
	}

	@Override
	public void setRe(Double real) {
		this.real = real;
	}

	public String toString() {
		String re = this.real + "";
		String im = "";
		if (this.imaginary < 0)
			im = this.imaginary + "i";
		else
			im = "+" + this.imaginary + "i";
		return re + im;
	}

}
