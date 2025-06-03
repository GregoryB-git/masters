package f5;

import a4.d;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import o7.l0;
import o7.t;
import o7.t.b;
import o7.u;
import p2.m0;

public final class e
  extends g
{
  public final int d;
  public final long e;
  public final boolean f;
  public final boolean g;
  public final long h;
  public final boolean i;
  public final int j;
  public final long k;
  public final int l;
  public final long m;
  public final long n;
  public final boolean o;
  public final boolean p;
  public final d q;
  public final t r;
  public final t s;
  public final u t;
  public final long u;
  public final e v;
  
  public e(int paramInt1, String paramString, List<String> paramList, long paramLong1, boolean paramBoolean1, long paramLong2, boolean paramBoolean2, int paramInt2, long paramLong3, int paramInt3, long paramLong4, long paramLong5, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, d paramd, List<c> paramList1, List<a> paramList2, e parame, Map<Uri, b> paramMap)
  {
    super(paramString, paramList, paramBoolean3);
    d = paramInt1;
    h = paramLong2;
    g = paramBoolean1;
    i = paramBoolean2;
    j = paramInt2;
    k = paramLong3;
    l = paramInt3;
    m = paramLong4;
    n = paramLong5;
    o = paramBoolean4;
    p = paramBoolean5;
    q = paramd;
    r = t.p(paramList1);
    s = t.p(paramList2);
    t = u.b(paramMap);
    if (!paramList2.isEmpty())
    {
      paramString = (a)m0.K(paramList2);
    }
    else
    {
      if (paramList1.isEmpty()) {
        break label163;
      }
      paramString = (c)m0.K(paramList1);
    }
    u = (e + c);
    break label168;
    label163:
    u = 0L;
    label168:
    paramLong2 = -9223372036854775807L;
    if (paramLong1 != -9223372036854775807L)
    {
      paramLong2 = u;
      if (paramLong1 >= 0L) {
        paramLong2 = Math.min(paramLong2, paramLong1);
      } else {
        paramLong2 = Math.max(0L, paramLong2 + paramLong1);
      }
    }
    e = paramLong2;
    if (paramLong1 >= 0L) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    f = paramBoolean1;
    v = parame;
  }
  
  public final Object a(List paramList)
  {
    return this;
  }
  
  public static final class a
    extends e.d
  {
    public final boolean t;
    public final boolean u;
    
    public a(String paramString1, e.c paramc, long paramLong1, int paramInt, long paramLong2, d paramd, String paramString2, String paramString3, long paramLong3, long paramLong4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      super(paramc, paramLong1, paramInt, paramLong2, paramd, paramString2, paramString3, paramLong3, paramLong4, paramBoolean1);
      t = paramBoolean2;
      u = paramBoolean3;
    }
  }
  
  public static final class b
  {
    public final Uri a;
    public final long b;
    public final int c;
    
    public b(Uri paramUri, long paramLong, int paramInt)
    {
      a = paramUri;
      b = paramLong;
      c = paramInt;
    }
  }
  
  public static final class c
    extends e.d
  {
    public final String t;
    public final t u;
    
    public c(long paramLong1, long paramLong2, String paramString1, String paramString2, String paramString3)
    {
      this(paramString1, null, "", 0L, -1, -9223372036854775807L, null, paramString2, paramString3, paramLong1, paramLong2, false, l0.e);
    }
    
    public c(String paramString1, c paramc, String paramString2, long paramLong1, int paramInt, long paramLong2, d paramd, String paramString3, String paramString4, long paramLong3, long paramLong4, boolean paramBoolean, List<e.a> paramList)
    {
      super(paramc, paramLong1, paramInt, paramLong2, paramd, paramString3, paramString4, paramLong3, paramLong4, paramBoolean);
      t = paramString2;
      u = t.p(paramList);
    }
  }
  
  public static class d
    implements Comparable<Long>
  {
    public final String a;
    public final e.c b;
    public final long c;
    public final int d;
    public final long e;
    public final d f;
    public final String o;
    public final String p;
    public final long q;
    public final long r;
    public final boolean s;
    
    public d(String paramString1, e.c paramc, long paramLong1, int paramInt, long paramLong2, d paramd, String paramString2, String paramString3, long paramLong3, long paramLong4, boolean paramBoolean)
    {
      a = paramString1;
      b = paramc;
      c = paramLong1;
      d = paramInt;
      e = paramLong2;
      f = paramd;
      o = paramString2;
      p = paramString3;
      q = paramLong3;
      r = paramLong4;
      s = paramBoolean;
    }
    
    public final int compareTo(Object paramObject)
    {
      paramObject = (Long)paramObject;
      int i;
      if (e > ((Long)paramObject).longValue()) {
        i = 1;
      } else if (e < ((Long)paramObject).longValue()) {
        i = -1;
      } else {
        i = 0;
      }
      return i;
    }
  }
  
  public static final class e
  {
    public final long a;
    public final boolean b;
    public final long c;
    public final long d;
    public final boolean e;
    
    public e(long paramLong1, boolean paramBoolean1, long paramLong2, long paramLong3, boolean paramBoolean2)
    {
      a = paramLong1;
      b = paramBoolean1;
      c = paramLong2;
      d = paramLong3;
      e = paramBoolean2;
    }
  }
}

/* Location:
 * Qualified Name:     f5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */