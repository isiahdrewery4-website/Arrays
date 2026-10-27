public class ArrayStatistics {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 12;
        numbers[1] = 25;
        numbers[2] = 8;
        numbers[3] = 40;
        numbers[4] = 15;

        int sum = 0;
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];

            if (numbers[index] > largest) {
                largest = numbers[index];
            }

            if (numbers[index] < smallest) {
                smallest = numbers[index];
            }
        }

        double average = (double) sum / numbers.length;

        System.out.println("Largest value: " + largest);
        System.out.println("Smallest value: " + smallest);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
