package r5;

import b5.n;
import java.util.List;

public abstract interface h
  extends k
{
  public abstract void e();
  
  public abstract void g();
  
  public abstract void h();
  
  public abstract int i();
  
  public abstract void j(long paramLong1, long paramLong2, List paramList, n[] paramArrayOfn);
  
  public abstract boolean k(int paramInt, long paramLong);
  
  public abstract boolean l(int paramInt, long paramLong);
  
  public abstract void m();
  
  public abstract int n(long paramLong, List<? extends b5.m> paramList);
  
  public abstract int o();
  
  public abstract v3.i0 p();
  
  public abstract int q();
  
  public abstract void r(float paramFloat);
  
  public abstract Object s();
  
  public abstract void t();
  
  public abstract void u();
  
  public static final class a
  {
    public final z4.i0 a;
    public final int[] b;
    public final int c;
    
    public a() {}
    
    public a(int paramInt, z4.i0 parami0, int[] paramArrayOfInt)
    {
      if (paramArrayOfInt.length == 0) {
        v5.m.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
      }
      a = parami0;
      b = paramArrayOfInt;
      c = paramInt;
    }
  }
  
  public static abstract interface b {}
}

/* Location:
 * Qualified Name:     r5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */