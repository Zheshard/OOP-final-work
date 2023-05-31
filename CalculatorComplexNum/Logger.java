package CalculatorComplexNum;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Класс Logger - для логирования действий в лог-файл
 */
public class Logger implements iLoggable {

	@Override
	public void log(String message) {
		// System.out.println(message);
		try (FileWriter writer = new FileWriter("log.txt", true)) {
			writer.append(message);
			writer.append('\n');
			writer.flush();
		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		}
	}

}
