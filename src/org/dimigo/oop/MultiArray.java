package org.dimigo.oop;

public class MultiArray {

    public static void main(String[] args) {

        String[][] strArr = {
                {"C", "JAVA", "PHP"},
                {"C#", "Python"},
        };

        System.out.println(strArr);

        String[][] strArr2 = new String[][]{
                {"C", "JAVA", "PHP"},
                {"C#", "Python"},
        };

        System.out.println(strArr2);

        String[][] strArr3 = {
                new String[] {"C", "JAVA"}
        };

        System.out.println(strArr3);

        String[][] strArr4 = new String[][]{
                new String[] {"C", "JAVA", "PHP"},
                new String[]{"C#", "Python"},
        };

        System.out.println(strArr4);

        String strArr5[][] = new String[][] {
                new String[] {"C", "Java"}
        };

        System.out.println(strArr5[0][1]);

        String name = "Yes Yes";
        System.out.println(name);
    }

}
