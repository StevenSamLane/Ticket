public class Main {
    public static void main(String[] args) {

        int ticketCost = 22222; // Стоимость билета
        int milesPerRub = 20; // Количество рублей для одной бонусной мили

        // Рассчитываем количество бонусных миль
        int bonusMiles = ticketCost / milesPerRub;

        // Выводим результат на экран
        System.out.println("За купленный билет начислено " + bonusMiles + " миль");
    }
}