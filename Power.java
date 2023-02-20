public class Power {
    public static int power(int x, int y) {
        // to store power 
        int power = 1;

        while(y != 0) {
            power *= x;
            y--;
        }

        // returing power
        return power;
    }
}