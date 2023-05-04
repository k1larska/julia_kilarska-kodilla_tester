import java.util.Random;
public class RandomNumbers {
        private int sum;
        private int min;
        private int max;

        public RandomNumbers() {
            sum = 0;
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
        }

        public void generateNumbers() {
            Random random = new Random();

            while (sum <= 5000) {
                int number = random.nextInt(31);
                sum += number;
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generateNumbers();
        System.out.println("Najmniejsza wylosowana liczba: " + randomNumbers.getMin());
        System.out.println("Największa wylosowana liczba: " + randomNumbers.getMax());
    }

}
