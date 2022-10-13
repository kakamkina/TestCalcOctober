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


        StringsAndNumbers.firstCheck(a);
        StringsAndNumbers.secondCheck(c);

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

    public static String stringSummation(String a, String c) {
        String aWithoutQuotes = StringsAndNumbers.deleteQuotes(a);
        String cWithoutQuotes = StringsAndNumbers.deleteQuotes(c);
        String result = aWithoutQuotes + cWithoutQuotes;
        return result;
    }

    //string to int

    //сюда воткнуть исключение
    public static String numberSummation(String a, String c) {
        if(StringsAndNumbers.stringTypeA(c) == true){

        }
        else {
            String result = a + c;
            return result;
        }
        return a;
    }

    public static String multiplication(String a, String c){
        String aWithoutQuotes = StringsAndNumbers.deleteQuotes(a);
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
        try {
            String aWithoutQuotes = StringsAndNumbers.deleteQuotes(a);
            int cNumber = Integer.parseInt(c);
            int length = aWithoutQuotes.length();
            int lengthResult = length / cNumber;
            String result = aWithoutQuotes.substring(0, lengthResult);
            return result;
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        // ничего не возвращается, тк завершает работу
        return a;
    }

    //вычитание
    // надо убирать ковычки при всех операциях
    public static String subtraction(String a, String c){
        String aWithoutQuotes = StringsAndNumbers.deleteQuotes(a);
        String cWithoutQuotes = StringsAndNumbers.deleteQuotes(c);

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
    public static boolean stringTypeA(String a) {
        boolean string;

        if (a.contains("\"")) {
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

    public static String deleteQuotes(String a) {
        if (a.contains("1 2 3 4 5 6 7 8 9 0")) {
            return a;
        } else {
            // если это номер то ничего не делать, если строка то...
            String aWithoutQuotes = a.replaceAll("\"", "");
            return aWithoutQuotes;
        }
    }

    public static void stringLength(String a) {
        String aWithoutQuotes = StringsAndNumbers.deleteQuotes(a);
        if (aWithoutQuotes.length() > 10) {
            System.exit(0);
        }
    }

    //сюда воткнуть исключение
    public static void firstCheck(String a) {
        if (a.contains("\"")){
            String aWithoutQuotes = StringsAndNumbers.deleteQuotes(a);
                   if (aWithoutQuotes.length() > 10) {
                       System.exit(0);
                   }
        }

//        else {
//            try {
//                int number = Integer.parseInt(a);
//            }
//            catch (Exception e){
//                System.exit(0);
//            }


//            if (number > 0 && number < 10)
//        }
//        }

//
//               if (a.contains("\"")) {
//                   String aWithoutQuotes = StringsAndNumbers.deleteQuotes(a);
//                   if (aWithoutQuotes.length() > 10) {
////                       System.exit(0);
//                   }
//
//               }
//               else {
//                   try {
//                       if(a.contains("1")){
//
//                       }
//                   }
//                   catch (Exception e){
//                       System.exit(0);
//                   }
//
//               }
           }


    public static void secondCheck(String a) {
        if (a.contains("\"")) {
            String aWithoutQuotes = StringsAndNumbers.deleteQuotes(a);
            if (aWithoutQuotes.length() > 10) {
                System.exit(0);
            }
        } else {
            if (a.contains("1 2 3 4 5 6 7 8 9 0")) {
            } else {
                System.exit(0);
            }
        }


//    public static boolean stringLengthA(String a) {
//        boolean stringLengthA;
//        try {
//            if (a.length() < 10 ){
//                stringLengthA = true;
//            }
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//
//        return 0;
//    }

//    public static boolean numberType(String a){
//        boolean number;
//        if (a.contains("1 2 3 4 5 6 7 8 9 0")){
//            number = true;
//        }
//        else {
//            number = false;
//        }
//        return number;
//    }
//    public static void resultLength() {
//    }
//}

        class Actions {

            public static void mainActions(String b) {

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
    }
}


