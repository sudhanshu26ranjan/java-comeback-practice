package practice;

public class LambdaBasic {
    Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("Running...");
        }
    };

    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println(".");
        };
    }
}
