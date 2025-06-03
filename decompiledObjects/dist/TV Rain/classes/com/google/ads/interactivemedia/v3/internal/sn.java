package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

public abstract class sn
  implements sy
{
  public final int a;
  public final int[] b;
  private final od c;
  private final bw[] d;
  private final long[] e;
  private int f;
  
  public sn(od paramod, int... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    boolean bool;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    }
    rp.c(bool);
    c = ((od)rp.a(paramod));
    i = paramVarArgs.length;
    a = i;
    d = new bw[i];
    for (i = 0; i < paramVarArgs.length; i++) {
      d[i] = paramod.a(paramVarArgs[i]);
    }
    Arrays.sort(d, new sq((byte)0));
    b = new int[a];
    for (i = j;; i++)
    {
      j = a;
      if (i >= j) {
        break;
      }
      b[i] = paramod.a(d[i]);
    }
    e = new long[j];
  }
  
  public int a(long paramLong, List<? extends ow> paramList)
  {
    return paramList.size();
  }
  
  public final int a(bw parambw)
  {
    for (int i = 0; i < a; i++) {
      if (d[i] == parambw) {
        return i;
      }
    }
    return -1;
  }
  
  public final bw a(int paramInt)
  {
    return d[paramInt];
  }
  
  public void a(float paramFloat) {}
  
  public final void a(long paramLong1, long paramLong2, long paramLong3) {}
  
  public void a(long paramLong1, long paramLong2, long paramLong3, List paramList, oz[] paramArrayOfoz)
  {
    rp.a(this, paramLong1, paramLong2, paramLong3);
  }
  
  public final boolean a(int paramInt, long paramLong)
  {
    long l = SystemClock.elapsedRealtime();
    boolean bool = b(paramInt, l);
    for (int i = 0; (i < a) && (!bool); i++) {
      if ((i != paramInt) && (!b(i, l))) {
        bool = true;
      } else {
        bool = false;
      }
    }
    if (!bool) {
      return false;
    }
    long[] arrayOfLong = e;
    arrayOfLong[paramInt] = Math.max(arrayOfLong[paramInt], wl.b(l, paramLong, Long.MAX_VALUE));
    return true;
  }
  
  public final int b(int paramInt)
  {
    return b[paramInt];
  }
  
  public final boolean b(int paramInt, long paramLong)
  {
    return e[paramInt] > paramLong;
  }
  
  public final int c(int paramInt)
  {
    for (int i = 0; i < a; i++) {
      if (b[i] == paramInt) {
        return i;
      }
    }
    return -1;
  }
  
  public void d() {}
  
  public final void e() {}
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (sn)paramObject;
      if ((c == c) && (Arrays.equals(b, b))) {
        return true;
      }
    }
    return false;
  }
  
  public final od f()
  {
    return c;
  }
  
  public final int g()
  {
    return b.length;
  }
  
  public final bw h()
  {
    return d[a()];
  }
  
  public int hashCode()
  {
    if (f == 0)
    {
      int i = System.identityHashCode(c);
      f = (Arrays.hashCode(b) + i * 31);
    }
    return f;
  }
  
  public final int i()
  {
    return b[a()];
  }
  
  public final void j() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.sn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */