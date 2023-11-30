public class CicloFor {
    public void run() {
        System.out.println("Hello world!");

        for (int i = 1; i <= 100; i = i + 1) {
            if (i % 3 == 0 && i % 5 ==0){
                System.out.println("fizzbuzz: "+i);
            } else if (i % 3 ==0) {
                System.out.println("fizz: "+ i);
            } else if (i % 5 ==0) {
                System.out.println("buzz: "+ i);

            } else {
                System.out.println(i);
            }

            }

    }
}
