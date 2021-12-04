public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(60.2, 1.70);
        System.out.println("Ваш индекс массы тела " + bmi + " кг/м2");
    }
}
