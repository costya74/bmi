public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float bmi = service.calculator(80, 180);
        System.out.println("Индекс массы тела, составляет " + bmi);
    }
}

