// (16/04/2024, 22:36)
// QUESTION: ROUND A NUMBER UP TO TWO PLACE IN JAVA.
package Java_Concept;

public class Q11roundNumber {
    public static void main(String[] args) {

        float num = 1.34567f;
        // 1.34567 * 100 = 134.567 => 135 => 1.35
        float answer = (float) (Math.round(num * 100.0) / 100.0);
        System.out.println(answer); // 1.35

    }
}
