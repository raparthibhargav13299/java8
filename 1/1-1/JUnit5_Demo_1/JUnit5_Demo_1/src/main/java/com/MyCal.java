package com;

public class MyCal {
    public static int add(String num) {
        if (num.isEmpty()) {
            return 0;
        }
        int numReturn = 0;
        String numberArray[] = num.split(",");
        for (String i : numberArray) {
            numReturn += Integer.parseInt(i);
        }
        return numReturn;
    }

    public static int addd(String num) {
        if (num.isEmpty()) {
            return 0;
        }
        int numReturn = 0;
        String numberArray[] = num.split("/");
        for (String i : numberArray) {
            numReturn += Integer.parseInt(i);
        }
        return numReturn;
    }

    public static int ad(int num)
    {
        try
        {

            if (num < 0)
                throw new Exception("Number is negative");
            else
                throw new Exception("Number is positive");
        }
        catch (Exception m)
        {
            System.out.println(m);
        }
        return num;
    }
}
