package A0;

import d0.J;
import d0.q;
import java.util.List;

public abstract class n$i
{
  public final int o;
  public final J p;
  public final int q;
  public final q r;
  
  public n$i(int paramInt1, J paramJ, int paramInt2)
  {
    o = paramInt1;
    p = paramJ;
    q = paramInt2;
    r = paramJ.a(paramInt2);
  }
  
  public abstract int c();
  
  public abstract boolean e(i parami);
  
  public static abstract interface a
  {
    public abstract List a(int paramInt, J paramJ, int[] paramArrayOfInt);
  }
}

/* Location:
 * Qualified Name:     A0.n.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */