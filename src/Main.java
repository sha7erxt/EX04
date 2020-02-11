import src.StringOperations;

public class Main {

    public static void main(String[] args) {
        StringOperations test = new StringOperations();
        test.printStringOfTheMinLength();
        test.printStringOfTheMaxLength();
        test.printAllStringsOfTheMinLength();
        test.printAllStringsOfTheMaxLength();
        test.checkPassword();
    }
}