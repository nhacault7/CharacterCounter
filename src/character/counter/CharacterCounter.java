package character.counter;

/**
 * CharacterCounter.java -
 *
 * @author Nicholas Hacault
 * @since 27-Feb-2019
 */
public class CharacterCounter {

    static final int MIN = 1;
    static final int MAX = 20;
    static int storeMin = 0;

    static int[] array = new int[5];

    public static void main(String[] args) {
        initialize();
        run();
    }

    private static int random(int low, int high) {
        double seed = Math.random();
        double h = (double) high;
        double l = (double) low;
        double number = (h - l + 1) * seed + l;
        int answer = (int) number;
        return answer;
    }

    private static void fillArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random(MIN, MAX);
        }
    }

    private static void initialize() {
        fillArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void run() {        
        for (int i = 0; i < array.length; i++) {
           storeMin = findMin(array[i]);
        }
        System.out.println(storeMin);
    }

    private static int findMin(int number) {
        if (storeMin == 0) return number;
        if (number < storeMin) return number;
        
        return storeMin ;
    }

}
