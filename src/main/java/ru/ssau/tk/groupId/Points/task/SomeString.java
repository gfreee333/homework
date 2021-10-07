package ru.ssau.tk.groupId.Points.task;

public class SomeString {

    public void lineOutput(String string) {
        for (int i = 0; i < string.length(); i++) {

            System.out.println(string.charAt(i));
        }
    }

    public void getStringBytes(String myString) {
        byte[] stringBytes = myString.getBytes();
        for (int bytes : stringBytes) {
            System.out.println(bytes);
        }
    }

    public void studyingCharacterEscaping() {
        int i = 0;
        System.out.println("Символ\t№" + ++i);
        System.out.println("Символ\b№" + ++i);
        System.out.println("Символ\n№" + ++i);
        System.out.println("Символ\r№" + ++i);
        System.out.println("Символ\'№" + ++i);
        System.out.println("Символ\"№" + ++i);
        System.out.println("Символ\\№" + ++i);
    }

    public boolean defferInRegister(String s1, String s2) {
        return s1.equalsIgnoreCase(s2) && !s1.equals(s2);
    }


    public void comparisonAndConclusion() {
        String s1 = "hello" + " world";
        String s2 = new String("hello world");
        System.out.println(s1 == s2);
        System.out.println(s2.equals(s1));
    }

    public boolean palindromeCheck(String myString) {
        String palindrome = new StringBuilder(myString).reverse().toString();
        return myString.equals(palindrome);
    }

    public int firstOccurrence(String s1, String s2) {
        return s1.indexOf(s2);
    }

    public int lineOccurrence(String s1, String s2) {
        return s1.indexOf(s2, s1.length() / 2);
    }

    public int lastOccurrenceFirstHalf(String s1, String s2) {
        return s1.lastIndexOf(s2, s1.length() / 2);
    }

    public static int theNumberOfLinesInTheArray(String[] strings, String prefix, String postfix) {
        int count = 0;
        for (String string : strings) {
            if (string.startsWith(prefix) & string.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("task 3.7: ");
        String string1 = "hello";
        String string2 = "el";
        SomeString strings = new SomeString();
        int first = strings.firstOccurrence(string1, string2);
        System.out.println(first);
        System.out.println("task 3.5: ");
        String s3 = "HELLO";
        String s4 = "hello";
        SomeString string = new SomeString();
        boolean res = string.defferInRegister(s3, s4);
        System.out.println(res);

        System.out.println("task 3.1");
        String s1 = "HELLO WORLD";
        String s2 = "привет мир";
        SomeString String = new SomeString();
        String.lineOutput(s1);
        System.out.println("new task 3.2: ");
        String.getStringBytes(s1);
        String.getStringBytes(s2);
        System.out.println("task 3.3: ");
        String.comparisonAndConclusion();
        System.out.println("Task 3.6: ");
        String.studyingCharacterEscaping();

    }

}
