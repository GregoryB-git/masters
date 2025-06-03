package v3;

import a5.a;
import a5.a.a;
import v5.e0;
import w3.v;

public final class r1$b
  implements g
{
  public static final String p = e0.E(0);
  public static final String q = e0.E(1);
  public static final String r = e0.E(2);
  public static final String s = e0.E(3);
  public static final String t = e0.E(4);
  public Object a;
  public Object b;
  public int c;
  public long d;
  public long e;
  public boolean f;
  public a o = a.o;
  
  static
  {
    new v(7);
  }
  
  public final long a(int paramInt1, int paramInt2)
  {
    a.a locala = o.a(paramInt1);
    long l;
    if (b != -1) {
      l = f[paramInt2];
    } else {
      l = -9223372036854775807L;
    }
    return l;
  }
  
  public final int b(long paramLong)
  {
    a locala = o;
    long l = d;
    locala.getClass();
    int i = -1;
    int j = i;
    if (paramLong != Long.MIN_VALUE) {
      if ((l != -9223372036854775807L) && (paramLong >= l))
      {
        j = i;
      }
      else
      {
        for (int k = e; k < b; k++) {
          if ((aa == Long.MIN_VALUE) || (aa > paramLong))
          {
            a.a locala1 = locala.a(k);
            if ((b != -1) && (locala1.a(-1) >= b)) {
              j = 0;
            } else {
              j = 1;
            }
            if (j != 0) {
              break;
            }
          }
        }
        j = i;
        if (k < b) {
          j = k;
        }
      }
    }
    return j;
  }
  
  public final int c(long paramLong)
  {
    Object localObject = o;
    long l1 = d;
    int i = b;
    int j = 1;
    i--;
    int k;
    while (i >= 0)
    {
      if (paramLong != Long.MIN_VALUE)
      {
        long l2 = aa;
        if (l2 == Long.MIN_VALUE ? (l1 == -9223372036854775807L) || (paramLong < l1) : paramLong < l2)
        {
          k = 1;
          break label94;
        }
      }
      k = 0;
      label94:
      if (k == 0) {
        break;
      }
      i--;
    }
    if (i >= 0)
    {
      localObject = ((a)localObject).a(i);
      int m;
      if (b == -1)
      {
        m = j;
      }
      else
      {
        for (k = 0; k < b; k++)
        {
          int n = e[k];
          m = j;
          if (n == 0) {
            break label184;
          }
          if (n == 1)
          {
            m = j;
            break label184;
          }
        }
        m = 0;
      }
      label184:
      if (m != 0) {}
    }
    else
    {
      i = -1;
    }
    return i;
  }
  
  public final long d(int paramInt)
  {
    return o.a(paramInt).a;
  }
  
  public final int e(int paramInt1, int paramInt2)
  {
    a.a locala = o.a(paramInt1);
    if (b != -1) {
      paramInt1 = e[paramInt2];
    } else {
      paramInt1 = 0;
    }
    return paramInt1;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b.class.equals(paramObject.getClass())))
    {
      paramObject = (b)paramObject;
      if ((!e0.a(a, a)) || (!e0.a(b, b)) || (c != c) || (d != d) || (e != e) || (f != f) || (!e0.a(o, o))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int f(int paramInt)
  {
    return o.a(paramInt).a(-1);
  }
  
  public final boolean g(int paramInt)
  {
    return o.a(paramInt).p;
  }
  
  public final void h(Object paramObject1, Object paramObject2, int paramInt, long paramLong1, long paramLong2, a parama, boolean paramBoolean)
  {
    a = paramObject1;
    b = paramObject2;
    c = paramInt;
    d = paramLong1;
    e = paramLong2;
    o = parama;
    f = paramBoolean;
  }
  
  public final int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = b;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    int k = c;
    long l = d;
    int m = (int)(l ^ l >>> 32);
    l = e;
    int n = (int)(l ^ l >>> 32);
    int i1 = f;
    return o.hashCode() + ((((((217 + j) * 31 + i) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31;
  }
}

/* Location:
 * Qualified Name:     v3.r1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */