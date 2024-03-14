//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int amout = 200;
        int replenish = 1000;
        int balance = amout + replenish;


        int bonus = replenish / 100;
        if (replenish < 1001) {
            bonus = 0;
        }

        if (replenish > 1000) {
            bonus = bonus;
        }


        System.out.println("Итоговая сумма = " + (balance + bonus));
    }
}