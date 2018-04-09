
 package minmaxprumer;
 
import java.util.Scanner;
 
public class MinMaxPrumer {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in, "CP1250");
        //uložené min, max, průměr
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int pocet = 1, soucet = 0;
        // nekonečná smyčka
        while (true) {
            System.out.println("vlož "+pocet+". číslo: ");
            //vstup od uživatele (z klávesnice) do proměnné vstup
          int vstup = sc.nextInt();
          //když vložím nulu, přerušíme smyčku (program)
          if (vstup == 0) break;
          soucet = soucet + vstup;
          //když vložené číslo je menší, než min, zapamatuje ho
          if (vstup < min) min = vstup;
          if (vstup > max) max = vstup;
            System.out.println("nejmenší zatím vložené: "+min);
            System.out.println("největší zatím vložené: "+max);
            System.out.println("průměr: "+((float) soucet/pocet));
            pocet++;
        }
    }   
}
