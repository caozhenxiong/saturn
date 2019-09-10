import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        String val = "0.72229222222";
        BigDecimal bigDecimal = new BigDecimal(val).setScale(4, BigDecimal.ROUND_DOWN);
        System.out.println(bigDecimal);
    }
}
