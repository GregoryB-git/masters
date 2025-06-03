package A0;

import android.os.SystemClock;
import d0.J;
import d0.q;
import g0.M;
import g0.a;
import java.util.Arrays;
import java.util.List;

public abstract class c
  implements y
{
  public final J a;
  public final int b;
  public final int[] c;
  public final int d;
  public final q[] e;
  public final long[] f;
  public int g;
  
  public c(J paramJ, int... paramVarArgs)
  {
    this(paramJ, paramVarArgs, 0);
  }
  
  public c(J paramJ, int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt.length;
    int j = 0;
    boolean bool;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    d = paramInt;
    a = ((J)a.e(paramJ));
    paramInt = paramArrayOfInt.length;
    b = paramInt;
    e = new q[paramInt];
    for (paramInt = 0; paramInt < paramArrayOfInt.length; paramInt++) {
      e[paramInt] = paramJ.a(paramArrayOfInt[paramInt]);
    }
    Arrays.sort(e, new b());
    c = new int[b];
    for (paramInt = j;; paramInt++)
    {
      j = b;
      if (paramInt >= j) {
        break;
      }
      c[paramInt] = paramJ.b(e[paramInt]);
    }
    f = new long[j];
  }
  
  public final int a(q paramq)
  {
    for (int i = 0; i < b; i++) {
      if (e[i] == paramq) {
        return i;
      }
    }
    return -1;
  }
  
  public final q b(int paramInt)
  {
    return e[paramInt];
  }
  
  public final int c(int paramInt)
  {
    return c[paramInt];
  }
  
  public final J d()
  {
    return a;
  }
  
  public final int e(int paramInt)
  {
    for (int i = 0; i < b; i++) {
      if (c[i] == paramInt) {
        return i;
      }
    }
    return -1;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (c)paramObject;
      if ((!a.equals(a)) || (!Arrays.equals(c, c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public void g() {}
  
  public int hashCode()
  {
    if (g == 0) {
      g = (System.identityHashCode(a) * 31 + Arrays.hashCode(c));
    }
    return g;
  }
  
  public boolean i(int paramInt, long paramLong)
  {
    boolean bool;
    if (f[paramInt] > paramLong) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void j() {}
  
  public int k(long paramLong, List paramList)
  {
    return paramList.size();
  }
  
  public final int l()
  {
    return c[o()];
  }
  
  public final int length()
  {
    return c.length;
  }
  
  public final q m()
  {
    return e[o()];
  }
  
  public boolean p(int paramInt, long paramLong)
  {
    long l = SystemClock.elapsedRealtime();
    boolean bool = i(paramInt, l);
    for (int i = 0; (i < b) && (!bool); i++) {
      if ((i != paramInt) && (!i(i, l))) {
        bool = true;
      } else {
        bool = false;
      }
    }
    if (!bool) {
      return false;
    }
    long[] arrayOfLong = f;
    arrayOfLong[paramInt] = Math.max(arrayOfLong[paramInt], M.b(l, paramLong, Long.MAX_VALUE));
    return true;
  }
  
  public void r(float paramFloat) {}
}

/* Location:
 * Qualified Name:     A0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */