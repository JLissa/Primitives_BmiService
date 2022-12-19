public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 60;
        double height = 1.70;
        double bmi = service.calculate(weight, height);
        System.out.println("Ваш индекс массы: " + bmi);
    }
}









//        int price = 50;
//        int oneMileBonus = 20;
//        int miles;
//
//        if (price > oneMileBonus) {
//            amountMileBonus = price / oneMileBonus;
//            System.out.println(miles);
//        }

