package x5;

import x6.b;

public final class e
{
  public final a a;
  public final a b;
  public final int c;
  public final boolean d;
  
  public e() {}
  
  public e(a parama1, a parama2, int paramInt)
  {
    a = parama1;
    b = parama2;
    c = paramInt;
    boolean bool;
    if (parama1 == parama2) {
      bool = true;
    } else {
      bool = false;
    }
    d = bool;
  }
  
  public static final class a
  {
    public final e.b[] a;
    
    public a(e.b... paramVarArgs)
    {
      a = paramVarArgs;
    }
  }
  
  public static final class b
  {
    public final int a;
    public final int b;
    public final float[] c;
    public final float[] d;
    
    public b(int paramInt1, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int paramInt2)
    {
      a = paramInt1;
      boolean bool;
      if (paramArrayOfFloat1.length * 2L == paramArrayOfFloat2.length * 3L) {
        bool = true;
      } else {
        bool = false;
      }
      b.q(bool);
      c = paramArrayOfFloat1;
      d = paramArrayOfFloat2;
      b = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     x5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */