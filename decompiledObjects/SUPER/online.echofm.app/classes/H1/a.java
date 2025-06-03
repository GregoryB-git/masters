package H1;

import W5.g;
import kotlin.jvm.internal.Intrinsics;

public final class a
{
  public static final a d = new a(null);
  public int[] a;
  public int b;
  public float[] c;
  
  public a(int[] paramArrayOfInt)
  {
    a = paramArrayOfInt;
    int i = a.a(d, paramArrayOfInt);
    b = i;
    c = new float[i];
  }
  
  public final float[] a()
  {
    return c;
  }
  
  public final int b(int paramInt)
  {
    return a[paramInt];
  }
  
  public final int c()
  {
    return a.length;
  }
  
  public final void d(int[] paramArrayOfInt)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfInt, "shape");
    a = paramArrayOfInt;
    int i = a.a(d, paramArrayOfInt);
    paramArrayOfInt = new float[i];
    System.arraycopy(c, 0, paramArrayOfInt, 0, Math.min(b, i));
    c = paramArrayOfInt;
    b = i;
  }
  
  public static final class a
  {
    public final int b(int[] paramArrayOfInt)
    {
      if (paramArrayOfInt.length != 0)
      {
        int i = paramArrayOfInt[0];
        int j = g.j(paramArrayOfInt);
        int k = 1;
        int m = i;
        if (1 <= j) {
          for (;;)
          {
            i *= paramArrayOfInt[k];
            m = i;
            if (k == j) {
              break;
            }
            k++;
          }
        }
        return m;
      }
      throw new UnsupportedOperationException("Empty array can't be reduced.");
    }
  }
}

/* Location:
 * Qualified Name:     H1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */