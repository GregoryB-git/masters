package d0;

import android.net.Uri;
import g0.M;
import java.util.Arrays;

public final class a
{
  public static final a g = new a(null, new a[0], 0L, -9223372036854775807L, 0);
  public static final a h = new a(0L).i(0);
  public static final String i = M.w0(1);
  public static final String j = M.w0(2);
  public static final String k = M.w0(3);
  public static final String l = M.w0(4);
  public final Object a;
  public final int b;
  public final long c;
  public final long d;
  public final int e;
  public final a[] f;
  
  public a(Object paramObject, a[] paramArrayOfa, long paramLong1, long paramLong2, int paramInt)
  {
    a = paramObject;
    c = paramLong1;
    d = paramLong2;
    b = (paramArrayOfa.length + paramInt);
    f = paramArrayOfa;
    e = paramInt;
  }
  
  public a a(int paramInt)
  {
    int m = e;
    a locala;
    if (paramInt < m) {
      locala = h;
    } else {
      locala = f[(paramInt - m)];
    }
    return locala;
  }
  
  public int b(long paramLong1, long paramLong2)
  {
    int m = -1;
    int n = m;
    if (paramLong1 != Long.MIN_VALUE) {
      if ((paramLong2 != -9223372036854775807L) && (paramLong1 >= paramLong2))
      {
        n = m;
      }
      else
      {
        for (int i1 = e; (i1 < b) && (((aa != Long.MIN_VALUE) && (aa <= paramLong1)) || (!a(i1).h())); i1++) {}
        n = m;
        if (i1 < b) {
          n = i1;
        }
      }
    }
    return n;
  }
  
  public int c(long paramLong1, long paramLong2)
  {
    int m = b - 1;
    m -= d(m);
    while ((m >= 0) && (e(paramLong1, paramLong2, m))) {
      m--;
    }
    if ((m < 0) || (!a(m).f())) {
      m = -1;
    }
    return m;
  }
  
  public boolean d(int paramInt)
  {
    int m = b;
    boolean bool = true;
    if ((paramInt != m - 1) || (!a.a(a(paramInt)))) {
      bool = false;
    }
    return bool;
  }
  
  public final boolean e(long paramLong1, long paramLong2, int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if (paramLong1 == Long.MIN_VALUE) {
      return false;
    }
    a locala = a(paramInt);
    long l1 = a;
    if (l1 == Long.MIN_VALUE)
    {
      if ((paramLong2 == -9223372036854775807L) || ((i) && (b == -1)) || (paramLong1 < paramLong2)) {
        bool2 = true;
      }
      return bool2;
    }
    bool2 = bool1;
    if (paramLong1 < l1) {
      bool2 = true;
    }
    return bool2;
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
      if ((!M.c(a, a)) || (b != b) || (c != c) || (d != d) || (e != e) || (!Arrays.equals(f, f))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int m = b;
    Object localObject = a;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = localObject.hashCode();
    }
    return ((((m * 31 + n) * 31 + (int)c) * 31 + (int)d) * 31 + e) * 31 + Arrays.hashCode(f);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AdPlaybackState(adsId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", adResumePositionUs=");
    localStringBuilder.append(c);
    localStringBuilder.append(", adGroups=[");
    for (int m = 0; m < f.length; m++)
    {
      localStringBuilder.append("adGroup(timeUs=");
      localStringBuilder.append(f[m].a);
      localStringBuilder.append(", ads=[");
      for (int n = 0; n < f[m].f.length; n++)
      {
        localStringBuilder.append("ad(state=");
        int i1 = f[m].f[n];
        int i2;
        if (i1 != 0) {
          if (i1 != 1) {
            if (i1 != 2) {
              if (i1 != 3) {
                if (i1 != 4)
                {
                  i1 = 63;
                  i2 = i1;
                }
              }
            }
          }
        }
        for (;;)
        {
          localStringBuilder.append(i2);
          break;
          i1 = 33;
          i2 = i1;
          continue;
          i1 = 80;
          i2 = i1;
          continue;
          i1 = 83;
          i2 = i1;
          continue;
          i1 = 82;
          i2 = i1;
          continue;
          i1 = 95;
          i2 = i1;
        }
        localStringBuilder.append(", durationUs=");
        localStringBuilder.append(f[m].g[n]);
        localStringBuilder.append(')');
        if (n < f[m].f.length - 1) {
          localStringBuilder.append(", ");
        }
      }
      localStringBuilder.append("])");
      if (m < f.length - 1) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append("])");
    return localStringBuilder.toString();
  }
  
  public static final class a
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
    
    public a(long paramLong)
    {
      this(paramLong, -1, -1, new int[0], new u[0], new long[0], 0L, false);
    }
    
    public a(long paramLong1, int paramInt1, int paramInt2, int[] paramArrayOfInt, u[] paramArrayOfu, long[] paramArrayOfLong, long paramLong2, boolean paramBoolean)
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
      g0.a.a(bool);
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
}

/* Location:
 * Qualified Name:     d0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */