package d0;

import android.net.Uri;
import g0.M;
import g0.a;
import java.util.Arrays;

public final class a$a
{
  public static final String j = M.w0(0);
  public static final String k = M.w0(1);
  public static final String l = M.w0(2);
  public static final String m = M.w0(3);
  public static final String n = M.w0(4);
  public static final String o = M.w0(5);
  public static final String p = M.w0(6);
  public static final String q = M.w0(7);
  public static final String r = M.w0(8);
  public final long a;
  public final int b;
  public final int c;
  public final Uri[] d;
  public final u[] e;
  public final int[] f;
  public final long[] g;
  public final long h;
  public final boolean i;
  
  public a$a(long paramLong)
  {
    this(paramLong, -1, -1, new int[0], new u[0], new long[0], 0L, false);
  }
  
  public a$a(long paramLong1, int paramInt1, int paramInt2, int[] paramArrayOfInt, u[] paramArrayOfu, long[] paramArrayOfLong, long paramLong2, boolean paramBoolean)
  {
    int i1 = paramArrayOfInt.length;
    int i2 = paramArrayOfu.length;
    int i3 = 0;
    boolean bool;
    if (i1 == i2) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    a = paramLong1;
    b = paramInt1;
    c = paramInt2;
    f = paramArrayOfInt;
    e = paramArrayOfu;
    g = paramArrayOfLong;
    h = paramLong2;
    i = paramBoolean;
    d = new Uri[paramArrayOfu.length];
    for (paramInt1 = i3;; paramInt1++)
    {
      paramArrayOfLong = d;
      if (paramInt1 >= paramArrayOfLong.length) {
        break;
      }
      paramArrayOfInt = paramArrayOfu[paramInt1];
      if (paramArrayOfInt == null) {
        paramArrayOfInt = null;
      } else {
        paramArrayOfInt = eb)).a;
      }
      paramArrayOfLong[paramInt1] = paramArrayOfInt;
    }
  }
  
  public static long[] b(long[] paramArrayOfLong, int paramInt)
  {
    int i1 = paramArrayOfLong.length;
    paramInt = Math.max(paramInt, i1);
    paramArrayOfLong = Arrays.copyOf(paramArrayOfLong, paramInt);
    Arrays.fill(paramArrayOfLong, i1, paramInt, -9223372036854775807L);
    return paramArrayOfLong;
  }
  
  public static int[] c(int[] paramArrayOfInt, int paramInt)
  {
    int i1 = paramArrayOfInt.length;
    paramInt = Math.max(paramInt, i1);
    paramArrayOfInt = Arrays.copyOf(paramArrayOfInt, paramInt);
    Arrays.fill(paramArrayOfInt, i1, paramInt, 0);
    return paramArrayOfInt;
  }
  
  public int d()
  {
    return e(-1);
  }
  
  public int e(int paramInt)
  {
    
    for (;;)
    {
      int[] arrayOfInt = f;
      if ((paramInt >= arrayOfInt.length) || (i)) {
        break;
      }
      int i1 = arrayOfInt[paramInt];
      if ((i1 == 0) || (i1 == 1)) {
        break;
      }
      paramInt++;
    }
    return paramInt;
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
      if ((a != a) || (b != b) || (c != c) || (!Arrays.equals(e, e)) || (!Arrays.equals(f, f)) || (!Arrays.equals(g, g)) || (h != h) || (i != i)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public boolean f()
  {
    if (b == -1) {
      return true;
    }
    int i1 = 0;
    while (i1 < b)
    {
      int i2 = f[i1];
      if ((i2 != 0) && (i2 != 1)) {
        i1++;
      } else {
        return true;
      }
    }
    return false;
  }
  
  public final boolean g()
  {
    boolean bool;
    if ((i) && (a == Long.MIN_VALUE) && (b == -1)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean h()
  {
    boolean bool;
    if ((b != -1) && (d() >= b)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int i1 = b;
    int i2 = c;
    long l1 = a;
    int i3 = (int)(l1 ^ l1 >>> 32);
    int i4 = Arrays.hashCode(e);
    int i5 = Arrays.hashCode(f);
    int i6 = Arrays.hashCode(g);
    l1 = h;
    return ((((((i1 * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + (int)(l1 ^ l1 >>> 32)) * 31 + i;
  }
  
  public a i(int paramInt)
  {
    int[] arrayOfInt = c(f, paramInt);
    long[] arrayOfLong = b(g, paramInt);
    u[] arrayOfu = (u[])Arrays.copyOf(e, paramInt);
    return new a(a, paramInt, c, arrayOfInt, arrayOfu, arrayOfLong, h, i);
  }
}

/* Location:
 * Qualified Name:     d0.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */