package a5;

import android.net.Uri;
import e0.d;
import f;
import java.util.Arrays;
import r3.j;
import v3.g;
import v5.e0;
import x6.b;

public final class a
  implements g
{
  public static final a o = new a(new a[0], 0L, -9223372036854775807L, 0);
  public static final a p;
  public static final String q = e0.E(1);
  public static final String r = e0.E(2);
  public static final String s = e0.E(3);
  public static final String t = e0.E(4);
  public static final j u = new j(13);
  public final Object a = null;
  public final int b;
  public final long c;
  public final long d;
  public final int e;
  public final a[] f;
  
  static
  {
    a locala = new a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
    int[] arrayOfInt = e;
    int i = arrayOfInt.length;
    int j = Math.max(0, i);
    arrayOfInt = Arrays.copyOf(arrayOfInt, j);
    Arrays.fill(arrayOfInt, i, j, 0);
    long[] arrayOfLong = f;
    j = arrayOfLong.length;
    i = Math.max(0, j);
    arrayOfLong = Arrays.copyOf(arrayOfLong, i);
    Arrays.fill(arrayOfLong, j, i, -9223372036854775807L);
    Uri[] arrayOfUri = (Uri[])Arrays.copyOf(d, 0);
    p = new a(a, 0, c, arrayOfInt, arrayOfUri, arrayOfLong, o, p);
  }
  
  public a(a[] paramArrayOfa, long paramLong1, long paramLong2, int paramInt)
  {
    c = paramLong1;
    d = paramLong2;
    b = (paramArrayOfa.length + paramInt);
    f = paramArrayOfa;
    e = paramInt;
  }
  
  public final a a(int paramInt)
  {
    int i = e;
    a locala;
    if (paramInt < i) {
      locala = p;
    } else {
      locala = f[(paramInt - i)];
    }
    return locala;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      if ((!e0.a(a, a)) || (b != b) || (c != c) || (d != d) || (e != e) || (!Arrays.equals(f, f))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = b;
    Object localObject = a;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    return ((((i * 31 + j) * 31 + (int)c) * 31 + (int)d) * 31 + e) * 31 + Arrays.hashCode(f);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("AdPlaybackState(adsId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", adResumePositionUs=");
    localStringBuilder.append(c);
    localStringBuilder.append(", adGroups=[");
    for (int i = 0; i < f.length; i++)
    {
      localStringBuilder.append("adGroup(timeUs=");
      localStringBuilder.append(f[i].a);
      localStringBuilder.append(", ads=[");
      for (int j = 0; j < f[i].e.length; j++)
      {
        localStringBuilder.append("ad(state=");
        int k = f[i].e[j];
        int m;
        if (k != 0)
        {
          if (k != 1)
          {
            if (k != 2)
            {
              if (k != 3)
              {
                if (k != 4)
                {
                  k = 63;
                  m = k;
                }
                else
                {
                  k = 33;
                  m = k;
                }
              }
              else
              {
                k = 80;
                m = k;
              }
            }
            else
            {
              k = 83;
              m = k;
            }
          }
          else
          {
            k = 82;
            m = k;
          }
        }
        else
        {
          k = 95;
          m = k;
        }
        localStringBuilder.append(m);
        localStringBuilder.append(", durationUs=");
        localStringBuilder.append(f[i].f[j]);
        localStringBuilder.append(')');
        if (j < f[i].e.length - 1) {
          localStringBuilder.append(", ");
        }
      }
      localStringBuilder.append("])");
      if (i < f.length - 1) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append("])");
    return localStringBuilder.toString();
  }
  
  public static final class a
    implements g
  {
    public static final String q = e0.E(0);
    public static final String r = e0.E(1);
    public static final String s = e0.E(2);
    public static final String t = e0.E(3);
    public static final String u = e0.E(4);
    public static final String v = e0.E(5);
    public static final String w = e0.E(6);
    public static final String x = e0.E(7);
    public static final d y = new d(16);
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final int[] e;
    public final long[] f;
    public final long o;
    public final boolean p;
    
    public a(long paramLong1, int paramInt1, int paramInt2, int[] paramArrayOfInt, Uri[] paramArrayOfUri, long[] paramArrayOfLong, long paramLong2, boolean paramBoolean)
    {
      boolean bool;
      if (paramArrayOfInt.length == paramArrayOfUri.length) {
        bool = true;
      } else {
        bool = false;
      }
      b.q(bool);
      a = paramLong1;
      b = paramInt1;
      c = paramInt2;
      e = paramArrayOfInt;
      d = paramArrayOfUri;
      f = paramArrayOfLong;
      o = paramLong2;
      p = paramBoolean;
    }
    
    public final int a(int paramInt)
    {
      
      for (;;)
      {
        int[] arrayOfInt = e;
        if ((paramInt >= arrayOfInt.length) || (p)) {
          break;
        }
        int i = arrayOfInt[paramInt];
        if ((i == 0) || (i == 1)) {
          break;
        }
        paramInt++;
      }
      return paramInt;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (a.class == paramObject.getClass()))
      {
        paramObject = (a)paramObject;
        if ((a != a) || (b != b) || (c != c) || (!Arrays.equals(d, d)) || (!Arrays.equals(e, e)) || (!Arrays.equals(f, f)) || (o != o) || (p != p)) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      int i = b;
      int j = c;
      long l = a;
      int k = (int)(l ^ l >>> 32);
      int m = Arrays.hashCode(d);
      int n = Arrays.hashCode(e);
      int i1 = Arrays.hashCode(f);
      l = o;
      return ((i1 + (n + (((i * 31 + j) * 31 + k) * 31 + m) * 31) * 31) * 31 + (int)(l ^ l >>> 32)) * 31 + p;
    }
  }
}

/* Location:
 * Qualified Name:     a5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */