import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a, b, c;
        String[] data = bufferedReader.readLine().split(" ");
        a = data[0];
        b = data[1];
        c = data[2];
//        StringsAndNumbers.stringType(a);

        switch(b)
        {
            case ("+"):
                if(StringsAndNumbers.stringTypeA(a) == true){
                    System.out.println(Calculation.stringSummation(a, c));
                }
                else {
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

        }

        }
}
class Calculation {
//    String a, c;

    public static String stringSummation(String a, String c) {
        String aWithoutQuotes = a.replaceAll("'", "");
        String cWithoutQuotes = c.replaceAll("'", "");
        String result = aWithoutQuotes + cWithoutQuotes;
        return result;
    }

    //string to int
    public static String numberSummation(String a, String c) {

        String result = a + c;
        return result;
    }

    public static String multiplication(String a, String c){
        String aWithoutQuotes = a.replaceAll("'", "");
        StringBuilder stringBuilder = new StringBuilder();
        int cNumber = Integer.parseInt(c);
        for(int i=0;i<cNumber;i++){
            //сложить строки
            stringBuilder.append(aWithoutQuotes);
        }
        //преобразовать стрингбилдер в строку
        String result = stringBuilder.toString();
        return result;
    }

    //деление, убрала кавычки
    public static String division(String a, String c){
        String aWithoutQuotes = a.replaceAll("'", "");
        int cNumber = Integer.parseInt(c);

        int length = aWithoutQuotes.length();
        int lengthResult = length/cNumber;
        String result = aWithoutQuotes.substring(0, lengthResult);
        return result;
    }

    //вычитание
    // надо убирать ковычки при всех операциях
    public static String subtraction(String a, String c){
        String aWithoutQuotes = a.replaceAll("'", "");
        String cWithoutQuotes = c.replaceAll("'", "");
        if (a.contains(cWithoutQuotes)){
            int lengthResult = aWithoutQuotes.length() - cWithoutQuotes.length();
            String result = aWithoutQuotes.substring(0, lengthResult);
            return result;
        }
        else {
            String result = aWithoutQuotes;
            return result;
        }
    }
}
class StringsAndNumbers {

    //определяю тип - строка или число
    public static boolean stringTypeA (String a) {
        boolean string;

        if (a.contains("'")) {
            string = true;
        } else {
            string = false;
        }
        return string;
    }

//    public static void stringTypeC(String c) {
//        boolean string;
//        boolean number;
//
//        if (c.contains("""
//               """)) {
//            string = true;
//        } else number = true;
//    }

    public static boolean stringLengthA(String a) {
        boolean stringLengthA;
        if (a.length() > 10){
            stringLengthA = false;
            }
        else {
            stringLengthA = true;
        }
        return stringLengthA;
    }

    public static boolean numberType(String a){

        if(a.contains()){}
    }
    public static void resultLength() {
    }
}

class Actions {

    public static void mainActions(String b){

//        switch(b)
//        {
//            case ("+"):
////                if(StringsAndNumbers.stringTypeA(a).number == true)
//                break;
//            case ("-"):
//                Calculation.subtraction(a, c);
//                break;
//            case ("*"):
////                Код1;
//                break;
//            case ("/"):
////                Код1;
//                break;

//        }
    }

}



