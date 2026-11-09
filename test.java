public class test {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;
        double score = 89.55;

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d years%n", age);
        System.out.printf("Score: %.2f%n", score);
        System.out.printf("Summary: %s is %d years old & scored %.2f points.%n", name, age, score);
    }
}
