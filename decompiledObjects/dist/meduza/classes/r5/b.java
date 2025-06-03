package r5;

import android.os.SystemClock;
import b5.m;
import java.util.Arrays;
import java.util.List;
import v4.d;
import v5.e0;

public abstract class b
  implements h
{
  public final z4.i0 a;
  public final int b;
  public final int[] c;
  public final v3.i0[] d;
  public final long[] e;
  public int f;
  
  public b(z4.i0 parami0, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int j = 0;
    boolean bool;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.H(bool);
    parami0.getClass();
    a = parami0;
    i = paramArrayOfInt.length;
    b = i;
    d = new v3.i0[i];
    for (i = 0; i < paramArrayOfInt.length; i++)
    {
      v3.i0[] arrayOfi0 = d;
      int k = paramArrayOfInt[i];
      arrayOfi0[i] = d[k];
    }
    Arrays.sort(d, new d(2));
    c = new int[b];
    for (i = j;; i++)
    {
      j = b;
      if (i >= j) {
        break;
      }
      c[i] = parami0.a(d[i]);
    }
    e = new long[j];
  }
  
  public final z4.i0 a()
  {
    return a;
  }
  
  public final v3.i0 b(int paramInt)
  {
    return d[paramInt];
  }
  
  public final int c(int paramInt)
  {
    return c[paramInt];
  }
  
  public final int d(v3.i0 parami0)
  {
    for (int i = 0; i < b; i++) {
      if (d[i] == parami0) {
        return i;
      }
    }
    return -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      if ((a != a) || (!Arrays.equals(c, c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int f(int paramInt)
  {
    for (int i = 0; i < b; i++) {
      if (c[i] == paramInt) {
        return i;
      }
    }
    return -1;
  }
  
  public void g() {}
  
  public final int hashCode()
  {
    if (f == 0)
    {
      int i = System.identityHashCode(a);
      f = (Arrays.hashCode(c) + i * 31);
    }
    return f;
  }
  
  public final boolean k(int paramInt, long paramLong)
  {
    long l1 = SystemClock.elapsedRealtime();
    boolean bool = l(paramInt, l1);
    for (int i = 0; (i < b) && (!bool); i++) {
      if ((i != paramInt) && (!l(i, l1))) {
        bool = true;
      } else {
        bool = false;
      }
    }
    if (!bool) {
      return false;
    }
    long[] arrayOfLong = e;
    long l2 = arrayOfLong[paramInt];
    i = e0.a;
    long l3 = l1 + paramLong;
    long l4 = l3;
    if (((paramLong ^ l3) & (l1 ^ l3)) < 0L) {
      l4 = Long.MAX_VALUE;
    }
    arrayOfLong[paramInt] = Math.max(l2, l4);
    return true;
  }
  
  public final boolean l(int paramInt, long paramLong)
  {
    boolean bool;
    if (e[paramInt] > paramLong) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int length()
  {
    return c.length;
  }
  
  public void m() {}
  
  public int n(long paramLong, List<? extends m> paramList)
  {
    return paramList.size();
  }
  
  public final int o()
  {
    return c[i()];
  }
  
  public final v3.i0 p()
  {
    return d[i()];
  }
  
  public void r(float paramFloat) {}
}

/* Location:
 * Qualified Name:     r5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */