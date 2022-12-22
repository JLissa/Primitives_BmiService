public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
//        int weight = 60;
//        double height = 1.70;
//        double bmi = service.calculate(weight, height);
        double bmi = service.calculate(60, 1.70);
        System.out.println("Ваш индекс массы: " + bmi);

        bmi = service.calculate(50, 1.80);
        System.out.println("Ваш индекс массы: " + bmi);

        bmi = service.calculate(100, 1.90);
        System.out.println("Ваш индекс массы: " + bmi);
    }
}

