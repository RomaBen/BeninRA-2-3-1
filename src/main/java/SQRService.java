public class SQRService {
    int calculate(int startOfRange, int endOfRange) {
        int counter = 0, iPowed;
        for (int i = 10; i < 100; i++) {
           iPowed = (int) Math.pow(i, 2);
            if (iPowed >= startOfRange && iPowed <= endOfRange)
                counter++;
        }
        return counter;
    }
}
