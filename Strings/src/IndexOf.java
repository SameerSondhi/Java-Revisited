public class IndexOf {
    public static void main(String[] args) {
        String myText = "four score and seven years ago";
        System.out.println(myText.indexOf("seven"));

        String myText2 = "ABCDEFGABCDEFG";
        System.out.println(myText2.indexOf(65));

        System.out.println(myText2.lastIndexOf("A"));
        System.out.println(myText2.indexOf("A", 2));

        String phoneNumber = "(234) 333-5551";

        // Find area code, exchange and line number
//        String areaCode = phoneNumber.substring(1,4);;
//        String exchange = phoneNumber.substring(6, 9);;
//        String lineNumber = phoneNumber.substring(10,phoneNumber.length());;
//        System.out.format("%s\n %s\n %s\n", areaCode, exchange, lineNumber);

        String areaCode = parseAreaCode(phoneNumber);
        String exchange = parseExchange(phoneNumber);
        String lineNumber = parseLineNumber(phoneNumber);

        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);
    }

    public static String parseAreaCode(String phoneNumber){
        int openParens = phoneNumber.indexOf('(');
        int closedParens = phoneNumber.indexOf(')');
        return phoneNumber.substring(openParens+1, closedParens);
    }

    public static String parseExchange(String phoneNumber){
        int whiteSpace = phoneNumber.indexOf(" ");
        int dash = phoneNumber.indexOf('-');
        return phoneNumber.substring(whiteSpace+1, dash);
    }

    public static String parseLineNumber(String phoneNumber) {
        int dash = phoneNumber.indexOf('-');
        return phoneNumber.substring(dash + 1);
    }
}
