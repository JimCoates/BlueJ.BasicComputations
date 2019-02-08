 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger b = new BigInteger("1");
        
        for (int i = 2; i <= value; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }
        
       
        return b;
    }

}
