public class productmaximizer {

   

    public static void Maximizer (int[] array) {
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0;  i < array.length; i++) {
            int num = array[i];

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }

            else if (num != largest && num > secondLargest) {
                secondLargest = num;
            }

        }

        System.out.println(largest + " " + secondLargest + " " + largest*secondLargest); 

    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 6, 10, 2, 9, 4};
        Maximizer(numbers);
    }
}
