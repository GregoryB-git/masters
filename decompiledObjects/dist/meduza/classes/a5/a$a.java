package a5;

import android.net.Uri;
import e0.d;
import java.util.Arrays;
import v3.g;
import v5.e0;
import x6.b;

public final class a$a
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
  
  public a$a(long paramLong1, int paramInt1, int paramInt2, int[] paramArrayOfInt, Uri[] paramArrayOfUri, long[] paramArrayOfLong, long paramLong2, boolean paramBoolean)
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

/* Location:
 * Qualified Name:     a5.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */