public class SevenNine {
    public void run() {
        for (int i = 1; i <= 50; i = i + 1) {
            if (i % 7 == 0 && i % 9 == 0) {
                System.out.println("SevenNine " + i);
            } else if (i % 7 == 0) {
                System.out.println("Seven: " + i);
            } else if (i % 9 == 0) {
                System.out.println("Nine: " + i);
            }else {
                System.out.println(i);
            }
        }
    }
}
