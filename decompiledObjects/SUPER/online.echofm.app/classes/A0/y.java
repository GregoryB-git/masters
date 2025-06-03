package A0;

import d0.I;
import d0.J;
import d0.q;
import g0.o;
import java.util.List;
import x0.x.b;
import y0.n;

public abstract interface y
  extends B
{
  public abstract void g();
  
  public abstract void h(boolean paramBoolean);
  
  public abstract boolean i(int paramInt, long paramLong);
  
  public abstract void j();
  
  public abstract int k(long paramLong, List paramList);
  
  public abstract int l();
  
  public abstract q m();
  
  public abstract int n();
  
  public abstract int o();
  
  public abstract boolean p(int paramInt, long paramLong);
  
  public abstract boolean q(long paramLong, y0.e parame, List paramList);
  
  public abstract void r(float paramFloat);
  
  public abstract Object s();
  
  public abstract void t();
  
  public abstract void u();
  
  public abstract void v(long paramLong1, long paramLong2, long paramLong3, List paramList, n[] paramArrayOfn);
  
  public static final class a
  {
    public final J a;
    public final int[] b;
    public final int c;
    
    public a(J paramJ, int... paramVarArgs)
    {
      this(paramJ, paramVarArgs, 0);
    }
    
    public a(J paramJ, int[] paramArrayOfInt, int paramInt)
    {
      if (paramArrayOfInt.length == 0) {
        o.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
      }
      a = paramJ;
      b = paramArrayOfInt;
      c = paramInt;
    }
  }
  
  public static abstract interface b
  {
    public abstract y[] a(y.a[] paramArrayOfa, B0.e parame, x.b paramb, I paramI);
  }
}

/* Location:
 * Qualified Name:     A0.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */