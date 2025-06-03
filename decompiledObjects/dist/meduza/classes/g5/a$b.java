package g5;

import java.util.List;
import v3.i0;

public final class a$b
{
  public final int a;
  public final String b;
  public final long c;
  public final String d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  public final String i;
  public final i0[] j;
  public final int k;
  public final String l;
  public final String m;
  public final List<Long> n;
  public final long[] o;
  public final long p;
  
  public a$b() {}
  
  public a$b(String paramString1, String paramString2, int paramInt1, String paramString3, long paramLong1, String paramString4, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString5, i0[] paramArrayOfi0, List<Long> paramList, long[] paramArrayOfLong, long paramLong2)
  {
    l = paramString1;
    m = paramString2;
    a = paramInt1;
    b = paramString3;
    c = paramLong1;
    d = paramString4;
    e = paramInt2;
    f = paramInt3;
    g = paramInt4;
    h = paramInt5;
    i = paramString5;
    j = paramArrayOfi0;
    n = paramList;
    o = paramArrayOfLong;
    p = paramLong2;
    k = paramList.size();
  }
  
  public final b a(i0[] paramArrayOfi0)
  {
    return new b(l, m, a, b, c, d, e, f, g, h, i, paramArrayOfi0, n, o, p);
  }
  
  public final long b(int paramInt)
  {
    long l1;
    if (paramInt == k - 1)
    {
      l1 = p;
    }
    else
    {
      long[] arrayOfLong = o;
      l1 = arrayOfLong[(paramInt + 1)] - arrayOfLong[paramInt];
    }
    return l1;
  }
}

/* Location:
 * Qualified Name:     g5.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */