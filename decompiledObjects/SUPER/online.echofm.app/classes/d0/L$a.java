package d0;

import g0.M;
import java.util.Arrays;

public final class L$a
{
  public static final String f = M.w0(0);
  public static final String g = M.w0(1);
  public static final String h = M.w0(3);
  public static final String i = M.w0(4);
  public final int a;
  public final J b;
  public final boolean c;
  public final int[] d;
  public final boolean[] e;
  
  public L$a(J paramJ, boolean paramBoolean, int[] paramArrayOfInt, boolean[] paramArrayOfBoolean)
  {
    int j = a;
    a = j;
    int k = paramArrayOfInt.length;
    boolean bool1 = false;
    if ((j == k) && (j == paramArrayOfBoolean.length)) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    g0.a.a(bool2);
    b = paramJ;
    boolean bool2 = bool1;
    if (paramBoolean)
    {
      bool2 = bool1;
      if (j > 1) {
        bool2 = true;
      }
    }
    c = bool2;
    d = ((int[])paramArrayOfInt.clone());
    e = ((boolean[])paramArrayOfBoolean.clone());
  }
  
  public J a()
  {
    return b;
  }
  
  public q b(int paramInt)
  {
    return b.a(paramInt);
  }
  
  public int c()
  {
    return b.c;
  }
  
  public boolean d()
  {
    return a3.a.b(e, true);
  }
  
  public boolean e(int paramInt)
  {
    return e[paramInt];
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      if ((c != c) || (!b.equals(b)) || (!Arrays.equals(d, d)) || (!Arrays.equals(e, e))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((b.hashCode() * 31 + c) * 31 + Arrays.hashCode(d)) * 31 + Arrays.hashCode(e);
  }
}

/* Location:
 * Qualified Name:     d0.L.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */