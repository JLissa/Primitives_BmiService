public class BmiService {
    public double calculate(int w, double h) {
        double bmi;
        bmi = w / (h * h);
        return bmi;
    }
}


