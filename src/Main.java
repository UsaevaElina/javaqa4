import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        int moneyOnBank = 100;
        int moneyAdd = 11200;

        int bonusModificator = 100;

        if (moneyAdd > 1000) {
            int bonus = moneyAdd / bonusModificator;
            System.out.println("Итоговая сумма :" + (moneyOnBank + moneyAdd + bonus));
            System.out.println("Бонус :" + bonus);
        } else {
            System.out.println("Итоговая сумма :" + (moneyOnBank + moneyAdd));

        }
    }
}