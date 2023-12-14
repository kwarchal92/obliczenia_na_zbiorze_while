package obliczenia_na_zbiorze_while;

import java.util.Random;

public class Obliczenia {

    public static void main(String[] args)
    {
        int ilosc_liczb = 5, i = 1;
        double liczba, suma = 0, min, max;

        System.out.println("Program losuje 5 liczb, znajduje max i min wylosowane, oraz oblicza srednia z wylosowanych liczb.");

        Random r =new Random();
        min = Math.round(100 * (r.nextDouble()));
        System.out.println();
        System.out.print("wylosowano liczby: \t"+ min +"\t");
        max = min;
        suma += max;

        while (i <= ilosc_liczb - 1)
        {
            liczba = Math.round(100 * (r.nextDouble()));
            System.out.print(liczba +"\t");

            if (max < liczba) max = liczba;
            if (liczba < min) min = liczba;

            suma += liczba;
            i++;
        }

        System.out.print("\nMax to: " + max + "\nMin to: " + min + "\nSrednia liczb: " + suma/ilosc_liczb + ".") ;


    }
}
