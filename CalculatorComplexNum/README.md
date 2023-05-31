# Задание:

* Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и
деление). 
* Применить при создании программы архитектурные паттерны, добавить
логирование калькулятора. 
* Соблюдать принципы SOLID, паттерны проектирования. 
* Можно выбрать другой язык программирования, например C# или Python, если выбран язык, отличный от JAVA, то необходимо написать документ, каким образом можно запустить приложение (что необходимо установить, каким образом запускать и т.п.)
___

1. Интерфейс iComplexNumber определяет методы для работы с комплексными числами.
2. Класс ComplexNumber реализует интерфейс iComplexNumber.
3. Класс CalculatorComplexNum, имплементирующий интерфейс iCalculable, содержит реализацию математических операций над комплексными числами.
4. Создание экземпляра класса реализовано с помощью паттерна "Фабричный метод" в классе CalculableFactory.
5. Для добавления логирования действий пользователя применен паттерн "Декоратор". Класс DecLogCalcFacrory создает объект класса DecLogCalc, который реализует вычисление и с помощью класса Logger осуществляет запись в лог-файл.
