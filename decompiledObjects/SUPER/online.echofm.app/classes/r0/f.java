package r0;

import X2.B;
import X2.v;
import X2.w;
import android.net.Uri;
import d0.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class f
  extends h
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
  public final m q;
  public final List r;
  public final List s;
  public final Map t;
  public final long u;
  public final f v;
  
  public f(int paramInt1, String paramString, List paramList1, long paramLong1, boolean paramBoolean1, long paramLong2, boolean paramBoolean2, int paramInt2, long paramLong3, int paramInt3, long paramLong4, long paramLong5, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, m paramm, List paramList2, List paramList3, f paramf, Map paramMap)
  {
    super(paramString, paramList1, paramBoolean3);
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
    q = paramm;
    r = v.U(paramList2);
    s = v.U(paramList3);
    t = w.c(paramMap);
    if (!paramList3.isEmpty()) {}
    for (paramString = (b)B.d(paramList3);; paramString = (d)B.d(paramList2))
    {
      u = (s + q);
      break label168;
      if (paramList2.isEmpty()) {
        break;
      }
    }
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
    v = paramf;
  }
  
  public f b(List paramList)
  {
    return this;
  }
  
  public f c(long paramLong, int paramInt)
  {
    return new f(d, a, b, e, g, paramLong, true, paramInt, k, l, m, n, c, o, p, q, r, s, v, t);
  }
  
  public f d()
  {
    if (o) {
      return this;
    }
    return new f(d, a, b, e, g, h, i, j, k, l, m, n, c, true, p, q, r, s, v, t);
  }
  
  public long e()
  {
    return h + u;
  }
  
  public boolean f(f paramf)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = bool1;
    if (paramf != null)
    {
      long l1 = k;
      long l2 = k;
      if (l1 > l2)
      {
        bool3 = bool1;
      }
      else
      {
        if (l1 < l2) {
          return false;
        }
        int i1 = r.size() - r.size();
        if (i1 != 0)
        {
          if (i1 > 0) {
            bool3 = bool2;
          } else {
            bool3 = false;
          }
          return bool3;
        }
        i1 = s.size();
        int i2 = s.size();
        bool3 = bool1;
        if (i1 <= i2) {
          if ((i1 == i2) && (o) && (!o)) {
            bool3 = bool1;
          } else {
            bool3 = false;
          }
        }
      }
    }
    return bool3;
  }
  
  public static final class b
    extends f.e
  {
    public final boolean A;
    public final boolean z;
    
    public b(String paramString1, f.d paramd, long paramLong1, int paramInt, long paramLong2, m paramm, String paramString2, String paramString3, long paramLong3, long paramLong4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      super(paramd, paramLong1, paramInt, paramLong2, paramm, paramString2, paramString3, paramLong3, paramLong4, paramBoolean1, null);
      z = paramBoolean2;
      A = paramBoolean3;
    }
    
    public b e(long paramLong, int paramInt)
    {
      return new b(o, p, q, paramInt, paramLong, t, u, v, w, x, y, z, A);
    }
  }
  
  public static final class c
  {
    public final Uri a;
    public final long b;
    public final int c;
    
    public c(Uri paramUri, long paramLong, int paramInt)
    {
      a = paramUri;
      b = paramLong;
      c = paramInt;
    }
  }
  
  public static final class d
    extends f.e
  {
    public final List A;
    public final String z;
    
    public d(String paramString1, long paramLong1, long paramLong2, String paramString2, String paramString3)
    {
      this(paramString1, null, "", 0L, -1, -9223372036854775807L, null, paramString2, paramString3, paramLong1, paramLong2, false, v.Y());
    }
    
    public d(String paramString1, d paramd, String paramString2, long paramLong1, int paramInt, long paramLong2, m paramm, String paramString3, String paramString4, long paramLong3, long paramLong4, boolean paramBoolean, List paramList)
    {
      super(paramd, paramLong1, paramInt, paramLong2, paramm, paramString3, paramString4, paramLong3, paramLong4, paramBoolean, null);
      z = paramString2;
      A = v.U(paramList);
    }
    
    public d e(long paramLong, int paramInt)
    {
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      long l = paramLong;
      while (i < A.size())
      {
        f.b localb = (f.b)A.get(i);
        localArrayList.add(localb.e(l, paramInt));
        l += q;
        i++;
      }
      return new d(o, p, z, q, paramInt, paramLong, t, u, v, w, x, y, localArrayList);
    }
  }
  
  public static abstract class e
    implements Comparable
  {
    public final String o;
    public final f.d p;
    public final long q;
    public final int r;
    public final long s;
    public final m t;
    public final String u;
    public final String v;
    public final long w;
    public final long x;
    public final boolean y;
    
    public e(String paramString1, f.d paramd, long paramLong1, int paramInt, long paramLong2, m paramm, String paramString2, String paramString3, long paramLong3, long paramLong4, boolean paramBoolean)
    {
      o = paramString1;
      p = paramd;
      q = paramLong1;
      r = paramInt;
      s = paramLong2;
      t = paramm;
      u = paramString2;
      v = paramString3;
      w = paramLong3;
      x = paramLong4;
      y = paramBoolean;
    }
    
    public int c(Long paramLong)
    {
      int i;
      if (s > paramLong.longValue()) {
        i = 1;
      } else if (s < paramLong.longValue()) {
        i = -1;
      } else {
        i = 0;
      }
      return i;
    }
  }
  
  public static final class f
  {
    public final long a;
    public final boolean b;
    public final long c;
    public final long d;
    public final boolean e;
    
    public f(long paramLong1, boolean paramBoolean1, long paramLong2, long paramLong3, boolean paramBoolean2)
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
 * Qualified Name:     r0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */