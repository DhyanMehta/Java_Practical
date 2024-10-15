public class Practical_39 {
    class GenericSorter {
        public static <T extends Comparable<T>> void sort(T[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i].compareTo(array[j]) > 0) {
                        T temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    
        public static void main(String[] args) {
            Integer[] numbers = {3, 1, 4, 1, 5, 9};
            sort(numbers);
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
        }
    }
    
}   
