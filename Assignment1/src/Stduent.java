import java.math.BigDecimal;

public class Stduent {

    public static void main(String[] args) {
        double x = 0.00102 + 0.00102 + 0.00102;
        BigDecimal x1 = new BigDecimal("0.00102");
        BigDecimal x2 = new BigDecimal("0.00102");
        BigDecimal x3 = new BigDecimal("0.00102");
        System.out.println(x1.add(x2).add(x3));

    }

}
