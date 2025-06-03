package x5;

import x6.b;

public final class e$b
{
  public final int a;
  public final int b;
  public final float[] c;
  public final float[] d;
  
  public e$b(int paramInt1, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int paramInt2)
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

/* Location:
 * Qualified Name:     x5.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */