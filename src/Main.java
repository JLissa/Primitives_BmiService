public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 60;
        double height = 1.70;
        double bmi = service.calculate(weight, height);
        System.out.println("Ваш индекс массы: " + bmi);
    }
}

