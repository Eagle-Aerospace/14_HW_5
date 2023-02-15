package com.example.a14_hw_05;

public class Algorithm {

    // отношение ускорения свободного падения на Земле
    private final double gEarth = 9.80665; // метров в секунду
    // отношение ускорения свободного падения на Земле к ускорению свободного падения на Марсе
    private final double gMars = 3.721; // метров в секунду
    
    // создание пустого конструктора
    public Algorithm() {
    }

    // метод вычисляющий абсолютную энергию по величине массы
    public long massFuelCalculation(String input) {

        /** Необходимо проверить корректность ввода массы груза, так как пользователь может ввести нецелое значение
         * Java понимает нецелые значения лишь с точкой, если пользователь введёт нецелое число с запятой, то возникнет ошибка
         * Данную ситуацию нужно отработать
         */
        // проверка корректности вводимого значения (с помощью метода contains(",") мы можем проверить есть ли в строке символ ",")
        if (input.contains(",")) { // если в вводимой строке есть запятая, то

            String inputMod = input.replace(",", "."); // то с помощью метода replace() мы поменяем её на точку

            // конвертирование входного значения из String в float с помощью метода Float.parseFloat()
            float inputFloat = Float.parseFloat(inputMod);

            // возврат вычисленного значения
            return (long) (inputFloat * gEarth * gEarth);

        } else {
            // конвертирование входного значения из String в float с помощью метода Long.parseLong()
            float inputFloat = Float.parseFloat(input);

            // возврат вычисленного значения
            return (long) (100 * inputFloat * gMars / gEarth);
        }
    }
}

