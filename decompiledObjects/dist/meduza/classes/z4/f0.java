package z4;

import android.net.Uri;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import l3.l;
import r5.h;
import t5.l0;
import v3.i0.a;
import v3.n1;
import v3.o0;
import v3.o0.a;
import v5.e0;
import z3.g;

public final class f0
  extends a
{
  public static final v3.i0 r;
  public static final o0 s;
  public static final byte[] t = new byte[e0.w(2, 2) * 1024];
  public final long p;
  public final o0 q;
  
  static
  {
    Object localObject = new i0.a();
    k = "audio/raw";
    x = 2;
    y = 44100;
    z = 2;
    localObject = ((i0.a)localObject).a();
    r = (v3.i0)localObject;
    o0.a locala = new o0.a();
    a = "SilenceMediaSource";
    b = Uri.EMPTY;
    c = t;
    s = locala.a();
  }
  
  public f0(long paramLong, o0 paramo0)
  {
    boolean bool;
    if (paramLong >= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.q(bool);
    p = paramLong;
    q = paramo0;
  }
  
  public final o0 f()
  {
    return q;
  }
  
  public final void g(r paramr) {}
  
  public final void h() {}
  
  public final r o(t.b paramb, t5.b paramb1, long paramLong)
  {
    return new a(p);
  }
  
  public final void t(l0 paraml0)
  {
    v(new g0(p, true, false, q));
  }
  
  public final void w() {}
  
  public static final class a
    implements r
  {
    public static final j0 c = new j0(new i0[] { new i0("", new v3.i0[] { f0.r }) });
    public final long a;
    public final ArrayList<c0> b;
    
    public a(long paramLong)
    {
      a = paramLong;
      b = new ArrayList();
    }
    
    public final long c()
    {
      return Long.MIN_VALUE;
    }
    
    public final boolean d(long paramLong)
    {
      return false;
    }
    
    public final long e(long paramLong, n1 paramn1)
    {
      return e0.j(paramLong, 0L, a);
    }
    
    public final long g()
    {
      return Long.MIN_VALUE;
    }
    
    public final void h(long paramLong) {}
    
    public final long i(h[] paramArrayOfh, boolean[] paramArrayOfBoolean1, c0[] paramArrayOfc0, boolean[] paramArrayOfBoolean2, long paramLong)
    {
      paramLong = e0.j(paramLong, 0L, a);
      for (int i = 0; i < paramArrayOfh.length; i++)
      {
        Object localObject = paramArrayOfc0[i];
        if ((localObject != null) && ((paramArrayOfh[i] == null) || (paramArrayOfBoolean1[i] == 0)))
        {
          b.remove(localObject);
          paramArrayOfc0[i] = null;
        }
        if ((paramArrayOfc0[i] == null) && (paramArrayOfh[i] != null))
        {
          localObject = new f0.b(a);
          ((f0.b)localObject).c(paramLong);
          b.add(localObject);
          paramArrayOfc0[i] = localObject;
          paramArrayOfBoolean2[i] = true;
        }
      }
      return paramLong;
    }
    
    public final boolean isLoading()
    {
      return false;
    }
    
    public final void j() {}
    
    public final long l(long paramLong)
    {
      paramLong = e0.j(paramLong, 0L, a);
      for (int i = 0; i < b.size(); i++) {
        ((f0.b)b.get(i)).c(paramLong);
      }
      return paramLong;
    }
    
    public final void n(r.a parama, long paramLong)
    {
      parama.b(this);
    }
    
    public final long o()
    {
      return -9223372036854775807L;
    }
    
    public final j0 q()
    {
      return c;
    }
    
    public final void s(long paramLong, boolean paramBoolean) {}
  }
  
  public static final class b
    implements c0
  {
    public final long a;
    public boolean b;
    public long c;
    
    public b(long paramLong)
    {
      v3.i0 locali0 = f0.r;
      paramLong = paramLong * 44100L / 1000000L;
      a = (e0.w(2, 2) * paramLong);
      c(0L);
    }
    
    public final void a() {}
    
    public final boolean b()
    {
      return true;
    }
    
    public final void c(long paramLong)
    {
      v3.i0 locali0 = f0.r;
      paramLong = paramLong * 44100L / 1000000L;
      c = e0.j(e0.w(2, 2) * paramLong, 0L, a);
    }
    
    public final int m(long paramLong)
    {
      long l = c;
      c(paramLong);
      return (int)((c - l) / f0.t.length);
    }
    
    public final int r(l paraml, g paramg, int paramInt)
    {
      if ((b) && ((paramInt & 0x2) == 0))
      {
        long l1 = a;
        long l2 = c;
        l1 -= l2;
        if (l1 == 0L)
        {
          paramg.l(4);
          return -4;
        }
        paraml = f0.r;
        e = (l2 / e0.w(2, 2) * 1000000L / 44100L);
        paramg.l(1);
        paraml = f0.t;
        int i = (int)Math.min(paraml.length, l1);
        if ((paramInt & 0x4) == 0)
        {
          paramg.q(i);
          c.put(paraml, 0, i);
        }
        if ((paramInt & 0x1) == 0) {
          c += i;
        }
        return -4;
      }
      b = f0.r;
      b = true;
      return -5;
    }
  }
}

/* Location:
 * Qualified Name:     z4.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */