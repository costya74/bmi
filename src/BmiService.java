public class BmiService {
    public float calculator(float massa, float height) {

        float bmi = massa / ((height / 100) * (height / 100));
        return bmi;

    }
}
