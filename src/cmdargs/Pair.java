package cmdargs;

/**
 *
 * @author ΙΩΑΝΝΑ
 */
public class Pair <S,P>{
    private S sign;
    private P price;
           
    public Pair(S sign2,P price2)
    {
        this.sign=sign2;
        this.price=price2;
    }

    public Pair(S sign2)
    {
        this.sign=sign2;
    }
    
    public Pair(){
        
    }
    
    public S getSign() {
        return sign;
    }

    public void setSign(S sign) {
        this.sign = sign;
    }

    public P getPrice() {
        return price;
    }

    public void setPrice(P price) {
        this.price = price;
    }
}
