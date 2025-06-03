package x0;

import B0.b;
import android.net.Uri;
import d0.J;
import d0.q;
import d0.q.b;
import d0.u;
import d0.u.c;
import g0.M;
import j0.i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import k0.d1;
import k0.v0;
import k0.y0;

public final class U
  extends a
{
  public static final q j;
  public static final u k;
  public static final byte[] l = new byte[M.g0(2, 2) * 1024];
  public final long h;
  public u i;
  
  static
  {
    q localq = new q.b().o0("audio/raw").N(2).p0(44100).i0(2).K();
    j = localq;
    k = new u.c().b("SilenceMediaSource").e(Uri.EMPTY).c(n).a();
  }
  
  public U(long paramLong, u paramu)
  {
    boolean bool;
    if (paramLong >= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    h = paramLong;
    i = paramu;
  }
  
  public static long H(long paramLong)
  {
    paramLong = paramLong * 44100L / 1000000L;
    return M.g0(2, 2) * paramLong;
  }
  
  public static long I(long paramLong)
  {
    return paramLong / M.g0(2, 2) * 1000000L / 44100L;
  }
  
  public void B() {}
  
  public u a()
  {
    try
    {
      u localu = i;
      return localu;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void e(v paramv) {}
  
  public v f(x.b paramb, b paramb1, long paramLong)
  {
    return new c(h);
  }
  
  public void h() {}
  
  public void l(u paramu)
  {
    try
    {
      i = paramu;
      return;
    }
    finally
    {
      paramu = finally;
      throw paramu;
    }
  }
  
  public void z(i0.y paramy)
  {
    A(new V(h, true, false, false, null, a()));
  }
  
  public static final class b
  {
    public long a;
    public Object b;
    
    public U a()
    {
      boolean bool;
      if (a > 0L) {
        bool = true;
      } else {
        bool = false;
      }
      g0.a.f(bool);
      return new U(a, U.C().a().d(b).a(), null);
    }
    
    public b b(long paramLong)
    {
      a = paramLong;
      return this;
    }
    
    public b c(Object paramObject)
    {
      b = paramObject;
      return this;
    }
  }
  
  public static final class c
    implements v
  {
    public static final Z q = new Z(new J[] { new J(new q[] { U.D() }) });
    public final long o;
    public final ArrayList p;
    
    public c(long paramLong)
    {
      o = paramLong;
      p = new ArrayList();
    }
    
    public final long a(long paramLong)
    {
      return M.q(paramLong, 0L, o);
    }
    
    public boolean b()
    {
      return false;
    }
    
    public long c()
    {
      return Long.MIN_VALUE;
    }
    
    public long d(long paramLong, d1 paramd1)
    {
      return a(paramLong);
    }
    
    public long f()
    {
      return Long.MIN_VALUE;
    }
    
    public boolean g(y0 paramy0)
    {
      return false;
    }
    
    public void h(long paramLong) {}
    
    public long i(A0.y[] paramArrayOfy, boolean[] paramArrayOfBoolean1, Q[] paramArrayOfQ, boolean[] paramArrayOfBoolean2, long paramLong)
    {
      paramLong = a(paramLong);
      for (int i = 0; i < paramArrayOfy.length; i++)
      {
        Object localObject = paramArrayOfQ[i];
        if ((localObject != null) && ((paramArrayOfy[i] == null) || (paramArrayOfBoolean1[i] == 0)))
        {
          p.remove(localObject);
          paramArrayOfQ[i] = null;
        }
        if ((paramArrayOfQ[i] == null) && (paramArrayOfy[i] != null))
        {
          localObject = new U.d(o);
          ((U.d)localObject).b(paramLong);
          p.add(localObject);
          paramArrayOfQ[i] = localObject;
          paramArrayOfBoolean2[i] = true;
        }
      }
      return paramLong;
    }
    
    public long l()
    {
      return -9223372036854775807L;
    }
    
    public Z n()
    {
      return q;
    }
    
    public void p() {}
    
    public void q(long paramLong, boolean paramBoolean) {}
    
    public long s(long paramLong)
    {
      paramLong = a(paramLong);
      for (int i = 0; i < p.size(); i++) {
        ((U.d)p.get(i)).b(paramLong);
      }
      return paramLong;
    }
    
    public void u(v.a parama, long paramLong)
    {
      parama.k(this);
    }
  }
  
  public static final class d
    implements Q
  {
    public final long o;
    public boolean p;
    public long q;
    
    public d(long paramLong)
    {
      o = U.E(paramLong);
      b(0L);
    }
    
    public void a() {}
    
    public void b(long paramLong)
    {
      q = M.q(U.E(paramLong), 0L, o);
    }
    
    public boolean e()
    {
      return true;
    }
    
    public int j(v0 paramv0, i parami, int paramInt)
    {
      if ((p) && ((paramInt & 0x2) == 0))
      {
        long l1 = o;
        long l2 = q;
        l1 -= l2;
        if (l1 == 0L)
        {
          parami.l(4);
          return -4;
        }
        t = U.F(l2);
        parami.l(1);
        int i = (int)Math.min(U.G().length, l1);
        if ((paramInt & 0x4) == 0)
        {
          parami.z(i);
          r.put(U.G(), 0, i);
        }
        if ((paramInt & 0x1) == 0) {
          q += i;
        }
        return -4;
      }
      b = U.D();
      p = true;
      return -5;
    }
    
    public int m(long paramLong)
    {
      long l = q;
      b(paramLong);
      return (int)((q - l) / U.G().length);
    }
  }
}

/* Location:
 * Qualified Name:     x0.U
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */