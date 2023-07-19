//Реализовать геомертическую прогрессию

public class TestGeometricProgression {
    public static void main(String[] args) {
        calculationGeometricProgression(1, 3, 3);
    }

    public static void calculationGeometricProgression(int first, int n, int denominator) {
        for (int i = 1; i <= n; i++){
            first*=denominator;
            System.out.println(first);
        }
    }
}
