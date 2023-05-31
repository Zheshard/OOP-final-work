package CalculatorComplexNum;

/**
 * Класс содержащий реализацию мат операций над комплексными числами
 */
public final class CalculatorComplexNum implements iCalculable {

	/* исходное комплексное число (первое введенное) */
	private ComplexNumber primaryArg;

	public CalculatorComplexNum(ComplexNumber primaryArg) {
		this.primaryArg = primaryArg;
	}

	@Override
	public iCalculable sum(ComplexNumber arg) {
		Double a1 = primaryArg.getRe();
		Double b1 = primaryArg.getIm();
		Double a2 = arg.getRe();
		Double b2 = arg.getIm();
		Double realPart = a1 + a2;
		Double imPart = b1 + b2;
		primaryArg.setRe(realPart);
		primaryArg.setIm(imPart);
		return this;
	}

	@Override
	public iCalculable div(ComplexNumber arg) {
		Double a1 = primaryArg.getRe();
		Double b1 = primaryArg.getIm();
		Double a2 = arg.getRe();
		Double b2 = arg.getIm();
		Double realPart = ((a1 * a2) + (b1 * b2)) / (Math.pow(a2, 2) + Math.pow(b2, 2));
		Double imPart = ((a2 * b1) - (a1 * b2)) / (Math.pow(a2, 2) + Math.pow(b2, 2));
		primaryArg.setRe(realPart);
		primaryArg.setIm(imPart);
		return this;
	}

	@Override
	public iCalculable sub(ComplexNumber arg) {
		Double a1 = primaryArg.getRe();
		Double b1 = primaryArg.getIm();
		Double a2 = arg.getRe();
		Double b2 = arg.getIm();
		Double realPart = a1 - a2;
		Double imPart = b1 - b2;
		primaryArg.setRe(realPart);
		primaryArg.setIm(imPart);
		return this;
	}

	@Override
	public iCalculable multi(ComplexNumber arg) {
		Double a1 = primaryArg.getRe();
		Double b1 = primaryArg.getIm();
		Double a2 = arg.getRe();
		Double b2 = arg.getIm();
		Double realPart = ((a1 * a2) - (b1 * b2));
		Double imPart = ((a1 * b2) + (a2 * b1));
		primaryArg.setRe(realPart);
		primaryArg.setIm(imPart);
		return this;
	}

	@Override
	public ComplexNumber getResult() {
		return primaryArg;
	}
}
