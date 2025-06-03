package b5;

import android.util.SparseArray;
import c4.g;
import c4.j;
import c4.s;
import c4.t;
import c4.v;
import c4.v.a;
import e0.e;
import v3.i0;
import v5.e0;
import v5.u;
import x6.b;

public final class d
  implements j, f
{
  public static final s r = new s();
  public final c4.h a;
  public final int b;
  public final i0 c;
  public final SparseArray<a> d;
  public boolean e;
  public f.a f;
  public long o;
  public t p;
  public i0[] q;
  
  static
  {
    new e(15);
  }
  
  public d(c4.h paramh, int paramInt, i0 parami0)
  {
    a = paramh;
    b = paramInt;
    c = parami0;
    d = new SparseArray();
  }
  
  public final void a(f.a parama, long paramLong1, long paramLong2)
  {
    f = parama;
    o = paramLong2;
    if (!e)
    {
      a.b(this);
      if (paramLong1 != -9223372036854775807L) {
        a.f(0L, paramLong1);
      }
      e = true;
    }
    else
    {
      c4.h localh = a;
      long l = paramLong1;
      if (paramLong1 == -9223372036854775807L) {
        l = 0L;
      }
      localh.f(0L, l);
      for (int i = 0; i < d.size(); i++) {
        ((a)d.valueAt(i)).f(parama, paramLong2);
      }
    }
  }
  
  public final void m()
  {
    i0[] arrayOfi0 = new i0[d.size()];
    for (int i = 0; i < d.size(); i++)
    {
      i0 locali0 = d.valueAt(i)).d;
      b.K(locali0);
      arrayOfi0[i] = locali0;
    }
    q = arrayOfi0;
  }
  
  public final v r(int paramInt1, int paramInt2)
  {
    a locala = (a)d.get(paramInt1);
    Object localObject = locala;
    if (locala == null)
    {
      boolean bool;
      if (q == null) {
        bool = true;
      } else {
        bool = false;
      }
      b.H(bool);
      if (paramInt2 == b) {
        localObject = c;
      } else {
        localObject = null;
      }
      localObject = new a(paramInt1, paramInt2, (i0)localObject);
      ((a)localObject).f(f, o);
      d.put(paramInt1, localObject);
    }
    return (v)localObject;
  }
  
  public final void t(t paramt)
  {
    p = paramt;
  }
  
  public static final class a
    implements v
  {
    public final int a;
    public final i0 b;
    public final g c;
    public i0 d;
    public v e;
    public long f;
    
    public a(int paramInt1, int paramInt2, i0 parami0)
    {
      a = paramInt2;
      b = parami0;
      c = new g();
    }
    
    public final void a(int paramInt, u paramu)
    {
      v localv = e;
      int i = e0.a;
      localv.b(paramInt, paramu);
    }
    
    public final void b(int paramInt, u paramu)
    {
      a(paramInt, paramu);
    }
    
    public final void c(long paramLong, int paramInt1, int paramInt2, int paramInt3, v.a parama)
    {
      long l = f;
      if ((l != -9223372036854775807L) && (paramLong >= l)) {
        e = c;
      }
      v localv = e;
      int i = e0.a;
      localv.c(paramLong, paramInt1, paramInt2, paramInt3, parama);
    }
    
    public final void d(i0 parami0)
    {
      i0 locali01 = b;
      i0 locali02 = parami0;
      if (locali01 != null) {
        locali02 = parami0.d(locali01);
      }
      d = locali02;
      parami0 = e;
      int i = e0.a;
      parami0.d(locali02);
    }
    
    public final int e(t5.h paramh, int paramInt, boolean paramBoolean)
    {
      return g(paramh, paramInt, paramBoolean);
    }
    
    public final void f(f.a parama, long paramLong)
    {
      if (parama == null)
      {
        e = c;
        return;
      }
      f = paramLong;
      int i = a;
      parama = ((c)parama).a(i);
      e = parama;
      i0 locali0 = d;
      if (locali0 != null) {
        parama.d(locali0);
      }
    }
    
    public final int g(t5.h paramh, int paramInt, boolean paramBoolean)
    {
      v localv = e;
      int i = e0.a;
      return localv.e(paramh, paramInt, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     b5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */