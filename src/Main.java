import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        int money_on_bank = 100;
        int money_add = 300;

        int bonus_modificator = 100;


        if (money_add > 1000) {
            int bonus = money_add / bonus_modificator;
            System.out.println("Итоговая сумма :" + (money_on_bank + money_add + bonus));
            System.out.println("Бонус :" + bonus);
        } else {
            System.out.println("Итоговая сумма :" + (money_on_bank + money_add));

        }
    }
}