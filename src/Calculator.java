import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a, b, c;
        String[] data = bufferedReader.readLine().split(" ");
        a = data[0];
        b = data[1];
        c = data[2];

        StringsAndNumbers.firstCheck(a);
        StringsAndNumbers.firstCheck(c);

        switch (b) {
            case ("+"):
                if (StringsAndNumbers.stringTypeA(a) == true) {
                    System.out.println(Calculation.stringSummation(a, c));
                } else {
                    System.out.println(Calculation.numberSummation(a, c));
                }

                break;
            case ("-"):
                System.out.println(Calculation.subtraction(a, c));
                break;
            case ("*"):
                System.out.println(Calculation.multiplication(a, c));
                break;
            case ("/"):
                System.out.println(Calculation.division(a, c));
                break;
            default:
                throw new Exception("При вводе пользователем выражения, не соответствующего одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.");
        }

    }
}

class Calculation {

    public static String stringSummation(String a, String c) {
        String aWithoutQuotes = StringsAndNumbers.deleteQuotes(a);
        String cWithoutQuotes = StringsAndNumbers.deleteQuotes(c);
        String result = aWithoutQuotes + cWithoutQuotes;
        return result;
    }

    //string to int
    public static String numberSummation(String a, String c) throws Exception {
        if (StringsAndNumbers.stringTypeA(c) == true) {
            throw new Exception("При вводе пользователем выражения вроде 3 + \"hello\", калькулятор должен выбросить исключение и прекратить свою работу.");
        }
        else {
            String result = a + c;
            return result;
        }
    }

    public static String multiplication(String a, String c) {
        String aWithoutQuotes = StringsAndNumbers.deleteQuotes(a);
        StringBuilder stringBuilder = new StringBuilder();
        int cNumber = Integer.parseInt(c);
        for (int i = 0; i < cNumber; i++) {
            //сложить строки
            stringBuilder.append(aWithoutQuotes);
        }
        //преобразовать стрингбилдер в строку
        String result = stringBuilder.toString();
        if (result.length() > 40) {
            //WithoutQuotes.substring(0, lengthResult);
            result = result.substring(0, 40) + "...";
        }
        return result;
    }

    //деление, убрала кавычки
    public static String division(String a, String c) {
        try {
            String aWithoutQuotes = StringsAndNumbers.deleteQuotes(a);
            int cNumber = Integer.parseInt(c);
            int length = aWithoutQuotes.length();
            int lengthResult = length / cNumber;
            String result = aWithoutQuotes.substring(0, lengthResult);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        // ничего не возвращается, тк завершает работу
        return a;
    }

    //вычитание
    public static String subtraction(String a, String c) {
        String aWithoutQuotes = StringsAndNumbers.deleteQuotes(a);
        String cWithoutQuotes = StringsAndNumbers.deleteQuotes(c);
        String result;
        if (aWithoutQuotes.contains(cWithoutQuotes)) {
            result = aWithoutQuotes.replace(cWithoutQuotes, "");
        } else {
            result = aWithoutQuotes;
        }
        return result;
    }
}

class StringsAndNumbers {

    //определяю тип - строка или число
    public static boolean stringTypeA(String a) {
        boolean string;

        if (a.contains("\"")) {
            string = true;
        } else {
            string = false;
        }
        return string;
    }

    public static String deleteQuotes(String a) {
        if (!a.contains("\"")) {
            return a;
        } else {
            // если это номер то ничего не делать, если строка то...
            String aWithoutQuotes = a.replaceAll("\"", "");
            return aWithoutQuotes;
        }
    }

    public static void stringLength(String a) throws Exception {
        String aWithoutQuotes = StringsAndNumbers.deleteQuotes(a);
        if (aWithoutQuotes.length() > 10) {
            throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. И строки длинной не более 10 символов");
        }
    }

    public static void firstCheck(String a) throws Exception {
        if (a.contains("\"")) {
            String aWithoutQuotes = StringsAndNumbers.deleteQuotes(a);
            if (aWithoutQuotes.length() < 10) {
            } else {
                throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. И строки длинной не более 10 символов");
            }

        }
        if (!a.contains("\"")) {
            int number = Integer.parseInt(a);
            if (number < 0 || number > 10) {
                throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. И строки длинной не более 10 символов");
            }
        }

    }

}


