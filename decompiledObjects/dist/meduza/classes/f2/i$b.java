package f2;

import dc.a;
import ec.j;
import java.math.BigInteger;

public final class i$b
  extends j
  implements a<BigInteger>
{
  public i$b(i parami)
  {
    super(0);
  }
  
  public final Object invoke()
  {
    return BigInteger.valueOf(a.a).shiftLeft(32).or(BigInteger.valueOf(a.b)).shiftLeft(32).or(BigInteger.valueOf(a.c));
  }
}

/* Location:
 * Qualified Name:     f2.i.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */