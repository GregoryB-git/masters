package z0;

import X2.v;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import c1.l;
import c1.m;
import c1.p;
import d0.z;
import g0.M;
import g0.o;
import j0.j;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Objects;
import k0.Z0;
import k0.n;
import k0.v0;
import x0.x.b;

public final class i
  extends n
  implements Handler.Callback
{
  public final c1.b F;
  public final j0.i G;
  public a H;
  public final g I;
  public boolean J;
  public int K;
  public l L;
  public p M;
  public c1.q N;
  public c1.q O;
  public int P;
  public final Handler Q;
  public final h R;
  public final v0 S;
  public boolean T;
  public boolean U;
  public d0.q V;
  public long W;
  public long X;
  public long Y;
  public boolean Z;
  
  public i(h paramh, Looper paramLooper)
  {
    this(paramh, paramLooper, g.a);
  }
  
  public i(h paramh, Looper paramLooper, g paramg)
  {
    super(3);
    R = ((h)g0.a.e(paramh));
    if (paramLooper == null) {
      paramh = null;
    } else {
      paramh = M.z(paramLooper, this);
    }
    Q = paramh;
    I = paramg;
    F = new c1.b();
    G = new j0.i(1);
    S = new v0();
    Y = -9223372036854775807L;
    W = -9223372036854775807L;
    X = -9223372036854775807L;
    Z = false;
  }
  
  private long l0(long paramLong)
  {
    boolean bool1 = false;
    if (paramLong != -9223372036854775807L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    g0.a.f(bool2);
    boolean bool2 = bool1;
    if (W != -9223372036854775807L) {
      bool2 = true;
    }
    g0.a.f(bool2);
    return paramLong - W;
  }
  
  public static boolean p0(d0.q paramq)
  {
    return Objects.equals(n, "application/x-media3-cues");
  }
  
  public void T()
  {
    V = null;
    Y = -9223372036854775807L;
    i0();
    W = -9223372036854775807L;
    X = -9223372036854775807L;
    if (L != null) {
      s0();
    }
  }
  
  public void W(long paramLong, boolean paramBoolean)
  {
    X = paramLong;
    Object localObject = H;
    if (localObject != null) {
      ((a)localObject).clear();
    }
    i0();
    T = false;
    U = false;
    Y = -9223372036854775807L;
    localObject = V;
    if ((localObject != null) && (!p0((d0.q)localObject))) {
      if (K != 0)
      {
        v0();
      }
      else
      {
        r0();
        localObject = (l)g0.a.e(L);
        ((j0.g)localObject).flush();
        ((j0.g)localObject).c(P());
      }
    }
  }
  
  public int a(d0.q paramq)
  {
    int i;
    if ((!p0(paramq)) && (!I.a(paramq)))
    {
      if (z.r(n)) {}
      for (i = 1;; i = 0) {
        return Z0.a(i);
      }
    }
    if (K == 0) {
      i = 4;
    } else {
      i = 2;
    }
    return Z0.a(i);
  }
  
  public boolean c()
  {
    return U;
  }
  
  public void c0(d0.q[] paramArrayOfq, long paramLong1, long paramLong2, x.b paramb)
  {
    W = paramLong2;
    paramArrayOfq = paramArrayOfq[0];
    V = paramArrayOfq;
    if (!p0(paramArrayOfq))
    {
      h0();
      if (L != null) {
        K = 1;
      } else {
        n0();
      }
    }
    else
    {
      if (V.H == 1) {
        paramArrayOfq = new e();
      } else {
        paramArrayOfq = new f();
      }
      H = paramArrayOfq;
    }
  }
  
  public String d()
  {
    return "TextRenderer";
  }
  
  public boolean e()
  {
    return true;
  }
  
  public void f(long paramLong1, long paramLong2)
  {
    if (A())
    {
      paramLong2 = Y;
      if ((paramLong2 != -9223372036854775807L) && (paramLong1 >= paramLong2))
      {
        r0();
        U = true;
      }
    }
    if (U) {
      return;
    }
    if (p0((d0.q)g0.a.e(V)))
    {
      g0.a.e(H);
      t0(paramLong1);
    }
    else
    {
      h0();
      u0(paramLong1);
    }
  }
  
  public final void h0()
  {
    boolean bool;
    if ((!Z) && (!Objects.equals(V.n, "application/cea-608")) && (!Objects.equals(V.n, "application/x-mp4-cea-608")) && (!Objects.equals(V.n, "application/cea-708"))) {
      bool = false;
    } else {
      bool = true;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Legacy decoding is disabled, can't handle ");
    localStringBuilder.append(V.n);
    localStringBuilder.append(" samples (expected ");
    localStringBuilder.append("application/x-media3-cues");
    localStringBuilder.append(").");
    g0.a.g(bool, localStringBuilder.toString());
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (what == 1)
    {
      o0((f0.b)obj);
      return true;
    }
    throw new IllegalStateException();
  }
  
  public final void i0()
  {
    x0(new f0.b(v.Y(), l0(X)));
  }
  
  public final long j0(long paramLong)
  {
    int i = N.c(paramLong);
    if ((i != 0) && (N.j() != 0))
    {
      if (i == -1)
      {
        c1.q localq = N;
        paramLong = localq.e(localq.j() - 1);
      }
      else
      {
        paramLong = N.e(i - 1);
      }
      return paramLong;
    }
    return N.p;
  }
  
  public final long k0()
  {
    int i = P;
    long l = Long.MAX_VALUE;
    if (i == -1) {
      return Long.MAX_VALUE;
    }
    g0.a.e(N);
    if (P < N.j()) {
      l = N.e(P);
    }
    return l;
  }
  
  public final void m0(m paramm)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Subtitle decoding failed. streamFormat=");
    localStringBuilder.append(V);
    o.d("TextRenderer", localStringBuilder.toString(), paramm);
    i0();
    v0();
  }
  
  public final void n0()
  {
    J = true;
    l locall = I.b((d0.q)g0.a.e(V));
    L = locall;
    locall.c(P());
  }
  
  public final void o0(f0.b paramb)
  {
    R.k(a);
    R.r(paramb);
  }
  
  public final boolean q0(long paramLong)
  {
    if (T) {
      return false;
    }
    if (e0(S, G, 0) != -4) {
      return false;
    }
    if (G.p())
    {
      T = true;
      return false;
    }
    G.C();
    Object localObject = (ByteBuffer)g0.a.e(G.r);
    localObject = F.a(G.t, ((ByteBuffer)localObject).array(), ((ByteBuffer)localObject).arrayOffset(), ((Buffer)localObject).limit());
    G.m();
    return H.c((c1.e)localObject, paramLong);
  }
  
  public final void r0()
  {
    M = null;
    P = -1;
    c1.q localq = N;
    if (localq != null)
    {
      localq.x();
      N = null;
    }
    localq = O;
    if (localq != null)
    {
      localq.x();
      O = null;
    }
  }
  
  public final void s0()
  {
    r0();
    ((l)g0.a.e(L)).release();
    L = null;
    K = 0;
  }
  
  public final void t0(long paramLong)
  {
    boolean bool1 = q0(paramLong);
    long l = H.b(X);
    boolean bool2 = l < Long.MIN_VALUE;
    if ((!bool2) && (T) && (!bool1)) {
      U = true;
    }
    if (((bool2) && (l <= paramLong)) || (bool1))
    {
      v localv = H.a(paramLong);
      l = H.d(paramLong);
      x0(new f0.b(localv, l0(l)));
      H.e(l);
    }
    X = paramLong;
  }
  
  public final void u0(long paramLong)
  {
    X = paramLong;
    if (O == null)
    {
      ((l)g0.a.e(L)).d(paramLong);
      try
      {
        O = ((c1.q)((l)g0.a.e(L)).a());
      }
      catch (m localm1)
      {
        m0(localm1);
        return;
      }
    }
    if (getState() != 2) {
      return;
    }
    long l;
    if (N != null)
    {
      l = k0();
      for (i = 0; l <= paramLong; i = 1)
      {
        P += 1;
        l = k0();
      }
    }
    int i = 0;
    Object localObject1 = O;
    Object localObject2;
    if (localObject1 != null) {
      if (((j0.a)localObject1).p())
      {
        if ((i == 0) && (k0() == Long.MAX_VALUE)) {
          if (K == 2)
          {
            v0();
          }
          else
          {
            r0();
            U = true;
          }
        }
      }
      else if (p <= paramLong)
      {
        localObject2 = N;
        if (localObject2 != null) {
          ((j)localObject2).x();
        }
        P = ((c1.q)localObject1).c(paramLong);
        N = ((c1.q)localObject1);
        O = null;
        break label228;
      }
    }
    if (i != 0)
    {
      label228:
      g0.a.e(N);
      l = l0(j0(paramLong));
      x0(new f0.b(N.h(paramLong), l));
    }
    if (K == 2) {
      return;
    }
    do
    {
      for (;;)
      {
        try
        {
          if (T) {
            return;
          }
          localObject2 = M;
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = (p)((l)g0.a.e(L)).f();
            if (localObject1 == null) {
              return;
            }
            M = ((p)localObject1);
          }
        }
        catch (m localm2)
        {
          break label495;
        }
        if (K == 1)
        {
          localm2.w(4);
          ((l)g0.a.e(L)).e(localm2);
          M = null;
          K = 2;
          return;
        }
        i = e0(S, localm2, 0);
        if (i != -4) {
          break;
        }
        if (localm2.p())
        {
          T = true;
          J = false;
        }
        else
        {
          localObject2 = S.b;
          if (localObject2 == null) {
            return;
          }
          x = s;
          localm2.C();
          J &= (localm2.s() ^ true);
        }
        if (!J)
        {
          ((l)g0.a.e(L)).e(localm2);
          M = null;
        }
      }
    } while (i != -3);
    return;
    label495:
    m0(localm2);
  }
  
  public final void v0()
  {
    s0();
    n0();
  }
  
  public void w0(long paramLong)
  {
    g0.a.f(A());
    Y = paramLong;
  }
  
  public final void x0(f0.b paramb)
  {
    Handler localHandler = Q;
    if (localHandler != null) {
      localHandler.obtainMessage(1, paramb).sendToTarget();
    } else {
      o0(paramb);
    }
  }
}

/* Location:
 * Qualified Name:     z0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */