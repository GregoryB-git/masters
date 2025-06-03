package R2;

import A2.n;
import java.util.Map;

public final class i2
  implements Runnable
{
  public final e2 o;
  public final int p;
  public final Throwable q;
  public final byte[] r;
  public final String s;
  public final Map t;
  
  public i2(String paramString, e2 parame2, int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte, Map paramMap)
  {
    n.i(parame2);
    o = parame2;
    p = paramInt;
    q = paramThrowable;
    r = paramArrayOfByte;
    s = paramString;
    t = paramMap;
  }
  
  public final void run()
  {
    o.a(s, p, q, r, t);
  }
}

/* Location:
 * Qualified Name:     R2.i2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */