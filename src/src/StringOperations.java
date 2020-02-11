package src;

import java.util.Scanner;

public class StringOperations {
    public StringOperations() {
        String text = new Constsants().getTextExample();
        strings = text.split(" ");
    }

    private String[] strings;

    /* Znajdź najdłuższy oraz najkrótszy wyraz. Wskaż ich miejsce (kolejność) w ciągu.
Jeżeli więcej niż jedno słowo posiada taką samą długość, za najkrótsze / najdłuższe
należy uznać ostatnie z nich.*/

    public void printStringOfTheMaxLength() {
        int length = 0;
        String string = "";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() >= length) {
                string = strings[i];
                length = strings[i].length();
            }
        }
        System.out.println(string);
    }

    public void printStringOfTheMinLength() {
        int length = Integer.MAX_VALUE;
        String string = "";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() <= length) {
                string = strings[i];
                length = strings[i].length();
            }
        }
        System.out.println(string);
    }

    /* Wyświetl najkrótsze i najdłuższe słowo – jeśli w ciągu występuje więcej słów
o długości najkrótszego lub najdłuższego słowa – wyświetl wszystkie.*/

    public void printAllStringsOfTheMaxLength() {
        int length = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() >= length) {
                System.out.println(strings[i]);
                length = strings[i].length();
            }
        }
    }

    public void printAllStringsOfTheMinLength() {
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() <= length) {
                System.out.println(strings[i]);
                length = strings[i].length();
            }
        }
    }
/*
• Wyświetl wszystkie słowa z zamienionym jednym znakiem (użytkownik musi określić
znak do zmiany oraz znak, na który należy zmienić) wykorzystaj pętlę for – each.
• Wszystkie zadania powinny być zrealizowane przez oddzielne metody w klasie
o dowolnej nazwie.*/

    public void replaceAllStrings() {
        String input, output;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the character you want to replace:");
        input = scanner.nextLine();
        System.out.println("Type the character you want to replace to:");
        output = scanner.nextLine();
        for (String s : strings) {
            if (s == input) {
                s = output;
            }
        }
    }

    public void checkPassword(){
        String userWord = new Constsants().PASSWORD;
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int licznik = 0;
        for (int i = 0; i <= userWord.length()-1; i++)
        {
            if(string.toUpperCase().charAt(i) != userWord.toUpperCase().charAt(i)) {
                System.out.println("Zły znak. Jest " + userWord.toUpperCase().charAt(i) + "mialo byc " + string.toLowerCase().charAt(i));
                licznik ++;
            }
            }
        if(licznik == 0) System.out.println("Hasło poprawne");
        else System.out.println("wykryto " + licznik + " bledy");
        }

    }