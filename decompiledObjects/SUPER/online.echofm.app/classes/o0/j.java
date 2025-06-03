package o0;

import X2.v;
import android.net.Uri;
import d0.q;
import g0.a;
import java.util.Collections;
import java.util.List;
import n0.g;

public abstract class j
{
  public final long a;
  public final q b;
  public final v c;
  public final long d;
  public final List e;
  public final List f;
  public final List g;
  public final i h;
  
  public j(long paramLong, q paramq, List paramList1, k paramk, List paramList2, List paramList3, List paramList4)
  {
    a.a(paramList1.isEmpty() ^ true);
    a = paramLong;
    b = paramq;
    c = v.U(paramList1);
    if (paramList2 == null) {
      paramq = Collections.emptyList();
    } else {
      paramq = Collections.unmodifiableList(paramList2);
    }
    e = paramq;
    f = paramList3;
    g = paramList4;
    h = paramk.a(this);
    d = paramk.b();
  }
  
  public static j o(long paramLong, q paramq, List paramList1, k paramk, List paramList2, List paramList3, List paramList4, String paramString)
  {
    if ((paramk instanceof k.e)) {
      return new c(paramLong, paramq, paramList1, (k.e)paramk, paramList2, paramList3, paramList4, paramString, -1L);
    }
    if ((paramk instanceof k.a)) {
      return new b(paramLong, paramq, paramList1, (k.a)paramk, paramList2, paramList3, paramList4);
    }
    throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
  }
  
  public abstract String k();
  
  public abstract g l();
  
  public abstract i m();
  
  public i n()
  {
    return h;
  }
  
  public static class b
    extends j
    implements g
  {
    public final k.a i;
    
    public b(long paramLong, q paramq, List paramList1, k.a parama, List paramList2, List paramList3, List paramList4)
    {
      super(paramq, paramList1, parama, paramList2, paramList3, paramList4, null);
      i = parama;
    }
    
    public long a(long paramLong1, long paramLong2)
    {
      return i.i(paramLong1, paramLong2);
    }
    
    public long b(long paramLong1, long paramLong2)
    {
      return i.h(paramLong1, paramLong2);
    }
    
    public long c(long paramLong)
    {
      return i.j(paramLong);
    }
    
    public long d(long paramLong1, long paramLong2)
    {
      return i.d(paramLong1, paramLong2);
    }
    
    public long e(long paramLong1, long paramLong2)
    {
      return i.f(paramLong1, paramLong2);
    }
    
    public i f(long paramLong)
    {
      return i.k(this, paramLong);
    }
    
    public boolean g()
    {
      return i.l();
    }
    
    public long h()
    {
      return i.e();
    }
    
    public long i(long paramLong)
    {
      return i.g(paramLong);
    }
    
    public long j(long paramLong1, long paramLong2)
    {
      return i.c(paramLong1, paramLong2);
    }
    
    public String k()
    {
      return null;
    }
    
    public g l()
    {
      return this;
    }
    
    public i m()
    {
      return null;
    }
  }
  
  public static class c
    extends j
  {
    public final Uri i;
    public final long j;
    public final String k;
    public final i l;
    public final m m;
    
    public c(long paramLong1, q paramq, List paramList1, k.e parame, List paramList2, List paramList3, List paramList4, String paramString, long paramLong2)
    {
      super(paramq, paramList1, parame, paramList2, paramList3, paramList4, null);
      i = Uri.parse(get0a);
      paramq = parame.c();
      l = paramq;
      k = paramString;
      j = paramLong2;
      if (paramq != null) {
        paramq = null;
      } else {
        paramq = new m(new i(null, 0L, paramLong2));
      }
      m = paramq;
    }
    
    public String k()
    {
      return k;
    }
    
    public g l()
    {
      return m;
    }
    
    public i m()
    {
      return l;
    }
  }
}

/* Location:
 * Qualified Name:     o0.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */