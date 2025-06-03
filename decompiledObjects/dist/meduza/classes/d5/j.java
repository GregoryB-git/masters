package d5;

import android.net.Uri;
import c5.c;
import d2.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o7.t;
import v3.i0;
import v5.e0;

public abstract class j
{
  public final i0 a;
  public final t<b> b;
  public final long c;
  public final List<e> d;
  public final List<e> e;
  public final List<e> f;
  public final i o;
  
  public j() {}
  
  public j(i0 parami0, t paramt, k paramk, ArrayList paramArrayList, List paramList1, List paramList2)
  {
    x6.b.q(paramt.isEmpty() ^ true);
    a = parami0;
    b = t.p(paramt);
    d = Collections.unmodifiableList(paramArrayList);
    e = paramList1;
    f = paramList2;
    o = paramk.a(this);
    c = e0.O(c, 1000000L, b);
  }
  
  public abstract String c();
  
  public abstract c l();
  
  public abstract i m();
  
  public static final class a
    extends j
    implements c
  {
    public final k.a p;
    
    public a(long paramLong, i0 parami0, t paramt, k.a parama, ArrayList paramArrayList, List paramList1, List paramList2)
    {
      super(paramt, parama, paramArrayList, paramList1, paramList2);
      p = parama;
    }
    
    public final long a(long paramLong)
    {
      return p.g(paramLong);
    }
    
    public final long b(long paramLong1, long paramLong2)
    {
      return p.e(paramLong1, paramLong2);
    }
    
    public final String c()
    {
      return null;
    }
    
    public final long d(long paramLong1, long paramLong2)
    {
      return p.c(paramLong1, paramLong2);
    }
    
    public final long e(long paramLong1, long paramLong2)
    {
      k.a locala = p;
      if (f != null)
      {
        paramLong1 = -9223372036854775807L;
      }
      else
      {
        long l = locala.c(paramLong1, paramLong2);
        l = locala.b(paramLong1, paramLong2) + l;
        paramLong2 = locala.g(l);
        paramLong1 = locala.e(l, paramLong1) + paramLong2 - i;
      }
      return paramLong1;
    }
    
    public final i f(long paramLong)
    {
      return p.h(paramLong, this);
    }
    
    public final long g(long paramLong1, long paramLong2)
    {
      return p.f(paramLong1, paramLong2);
    }
    
    public final boolean h()
    {
      return p.i();
    }
    
    public final long i()
    {
      return p.d;
    }
    
    public final long j(long paramLong)
    {
      return p.d(paramLong);
    }
    
    public final long k(long paramLong1, long paramLong2)
    {
      return p.b(paramLong1, paramLong2);
    }
    
    public final c l()
    {
      return this;
    }
    
    public final i m()
    {
      return null;
    }
  }
  
  public static final class b
    extends j
  {
    public final String p;
    public final i q;
    public final h0 r;
    
    public b(long paramLong, i0 parami0, t paramt, k.e parame, ArrayList paramArrayList, List paramList1, List paramList2)
    {
      super(paramt, parame, paramArrayList, paramList1, paramList2);
      Uri.parse(get0a);
      paramLong = e;
      paramt = null;
      if (paramLong <= 0L) {
        parami0 = null;
      } else {
        parami0 = new i(d, paramLong, null);
      }
      q = parami0;
      p = null;
      if (parami0 != null) {
        parami0 = paramt;
      } else {
        parami0 = new h0(new i(0L, -1L, null), 2);
      }
      r = parami0;
    }
    
    public final String c()
    {
      return p;
    }
    
    public final c l()
    {
      return r;
    }
    
    public final i m()
    {
      return q;
    }
  }
}

/* Location:
 * Qualified Name:     d5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */