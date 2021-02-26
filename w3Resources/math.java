package w3Resources;

public class math {
    public static void main(String[] args) {

        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));
        
        int randomNum = (int) (Math.random() * 101);
        System.out.println(randomNum); // 0 to 100
    }
}
