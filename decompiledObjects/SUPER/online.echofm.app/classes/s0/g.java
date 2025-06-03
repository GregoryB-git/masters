package s0;

import android.graphics.Bitmap;
import d0.q;
import g0.F;
import j0.i;
import j0.j;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import k0.Z0;
import k0.n;
import k0.v0;
import x0.x.b;

public class g
  extends n
{
  public final c.a F;
  public final i G;
  public final ArrayDeque H;
  public boolean I;
  public boolean J;
  public a K;
  public long L;
  public long M;
  public int N;
  public int O;
  public q P;
  public c Q;
  public i R;
  public e S;
  public Bitmap T;
  public boolean U;
  public b V;
  public b W;
  public int X;
  
  public g(c.a parama, e parame)
  {
    super(4);
    F = parama;
    S = l0(parame);
    G = i.F();
    K = a.c;
    H = new ArrayDeque();
    M = -9223372036854775807L;
    L = -9223372036854775807L;
    N = 0;
    O = 1;
  }
  
  public static e l0(e parame)
  {
    e locale = parame;
    if (parame == null) {
      locale = e.a;
    }
    return locale;
  }
  
  private void q0(long paramLong)
  {
    L = paramLong;
    while ((!H.isEmpty()) && (paramLong >= H.peek()).a)) {
      K = ((a)H.removeFirst());
    }
  }
  
  public void T()
  {
    P = null;
    K = a.c;
    H.clear();
    s0();
    S.b();
  }
  
  public void U(boolean paramBoolean1, boolean paramBoolean2)
  {
    O = paramBoolean2;
  }
  
  public void W(long paramLong, boolean paramBoolean)
  {
    o0(1);
    J = false;
    I = false;
    T = null;
    V = null;
    W = null;
    U = false;
    R = null;
    c localc = Q;
    if (localc != null) {
      localc.flush();
    }
    H.clear();
  }
  
  public void X()
  {
    s0();
  }
  
  public void Z()
  {
    s0();
    o0(1);
  }
  
  public int a(q paramq)
  {
    return F.a(paramq);
  }
  
  public boolean c()
  {
    return J;
  }
  
  public void c0(q[] paramArrayOfq, long paramLong1, long paramLong2, x.b paramb)
  {
    super.c0(paramArrayOfq, paramLong1, paramLong2, paramb);
    if (K.b != -9223372036854775807L) {
      if (H.isEmpty())
      {
        long l = M;
        if (l != -9223372036854775807L)
        {
          paramLong1 = L;
          if ((paramLong1 != -9223372036854775807L) && (paramLong1 >= l)) {}
        }
      }
      else
      {
        H.add(new a(M, paramLong2));
        return;
      }
    }
    K = new a(-9223372036854775807L, paramLong2);
  }
  
  public String d()
  {
    return "ImageRenderer";
  }
  
  public boolean e()
  {
    int i = O;
    boolean bool;
    if ((i != 3) && ((i != 0) || (!U))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void f(long paramLong1, long paramLong2)
  {
    if (J) {
      return;
    }
    if (P == null)
    {
      v0 localv0 = N();
      G.m();
      int i = e0(localv0, G, 2);
      if (i == -5)
      {
        P = ((q)g0.a.h(b));
        m0();
      }
      else
      {
        if (i == -4)
        {
          g0.a.f(G.p());
          I = true;
          J = true;
        }
        return;
      }
    }
    try
    {
      F.a("drainAndFeedDecoder");
      while (j0(paramLong1, paramLong2)) {}
      while (k0(paramLong1)) {}
      F.b();
      return;
    }
    catch (d locald)
    {
      throw J(locald, null, 4003);
    }
  }
  
  public final boolean h0(q paramq)
  {
    int i = F.a(paramq);
    boolean bool;
    if ((i != Z0.a(4)) && (i != Z0.a(3))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final Bitmap i0(int paramInt)
  {
    g0.a.h(T);
    int i = T.getWidth() / hP)).I;
    int j = T.getHeight() / hP)).J;
    int k = P.I;
    int m = paramInt / k;
    return Bitmap.createBitmap(T, paramInt % k * i, m * j, i, j);
  }
  
  public final boolean j0(long paramLong1, long paramLong2)
  {
    if ((T != null) && (V == null)) {
      return false;
    }
    if ((O == 0) && (getState() != 2)) {
      return false;
    }
    Object localObject;
    if (T == null)
    {
      g0.a.h(Q);
      localObject = Q.a();
      if (localObject == null) {
        return false;
      }
      if (((f)g0.a.h(localObject)).p())
      {
        if (N == 3)
        {
          s0();
          g0.a.h(P);
          m0();
        }
        else
        {
          ((f)g0.a.h(localObject)).x();
          if (H.isEmpty()) {
            J = true;
          }
        }
        return false;
      }
      g0.a.i(s, "Non-EOS buffer came back from the decoder without bitmap.");
      T = s;
      ((f)g0.a.h(localObject)).x();
    }
    if ((U) && (T != null) && (V != null))
    {
      g0.a.h(P);
      localObject = P;
      int i = I;
      if (((i != 1) || (J != 1)) && (i != -1) && (J != -1)) {
        i = 1;
      } else {
        i = 0;
      }
      if (!V.d())
      {
        b localb = V;
        if (i != 0) {
          localObject = i0(localb.c());
        } else {
          localObject = (Bitmap)g0.a.h(T);
        }
        localb.e((Bitmap)localObject);
      }
      if (!r0(paramLong1, paramLong2, (Bitmap)g0.a.h(V.b()), V.a())) {
        return false;
      }
      q0(((b)g0.a.h(V)).a());
      O = 3;
      if ((i == 0) || (((b)g0.a.h(V)).c() == hP)).J * hP)).I - 1)) {
        T = null;
      }
      V = W;
      W = null;
      return true;
    }
    return false;
  }
  
  public final boolean k0(long paramLong)
  {
    if ((U) && (V != null)) {
      return false;
    }
    v0 localv0 = N();
    Object localObject = Q;
    if ((localObject != null) && (N != 3) && (!I))
    {
      if (R == null)
      {
        localObject = (i)((j0.g)localObject).f();
        R = ((i)localObject);
        if (localObject == null) {
          return false;
        }
      }
      if (N == 2)
      {
        g0.a.h(R);
        R.w(4);
        ((c)g0.a.h(Q)).b(R);
        R = null;
        N = 3;
        return false;
      }
      int i = e0(localv0, R, 0);
      if (i != -5)
      {
        if (i != -4)
        {
          if (i == -3) {
            return false;
          }
          throw new IllegalStateException();
        }
        R.C();
        if ((((ByteBuffer)g0.a.h(R.r)).remaining() <= 0) && (!((i)g0.a.h(R)).p())) {
          i = 0;
        } else {
          i = 1;
        }
        if (i != 0)
        {
          ((c)g0.a.h(Q)).b((i)g0.a.h(R));
          X = 0;
        }
        p0(paramLong, (i)g0.a.h(R));
        if (((i)g0.a.h(R)).p())
        {
          I = true;
          R = null;
          return false;
        }
        M = Math.max(M, hR)).t);
        if (i != 0) {
          R = null;
        } else {
          ((i)g0.a.h(R)).m();
        }
        return U ^ true;
      }
      P = ((q)g0.a.h(b));
      N = 2;
      return true;
    }
    return false;
  }
  
  public final void m0()
  {
    if (h0(P))
    {
      c localc = Q;
      if (localc != null) {
        localc.release();
      }
      Q = F.b();
      return;
    }
    throw J(new d("Provided decoder factory can't create decoder for format."), P, 4005);
  }
  
  public final boolean n0(b paramb)
  {
    int i = hP)).I;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i != -1)
    {
      bool2 = bool1;
      if (P.J != -1) {
        if (paramb.c() == hP)).J * P.I - 1) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
    }
    return bool2;
  }
  
  public final void o0(int paramInt)
  {
    O = Math.min(O, paramInt);
  }
  
  public final void p0(long paramLong, i parami)
  {
    boolean bool1 = parami.p();
    boolean bool2 = true;
    if (bool1)
    {
      U = true;
      return;
    }
    parami = new b(X, t);
    W = parami;
    X += 1;
    if (!U)
    {
      long l = parami.a();
      int i;
      if ((l - 30000L <= paramLong) && (paramLong <= 30000L + l)) {
        i = 1;
      } else {
        i = 0;
      }
      parami = V;
      int j;
      if ((parami != null) && (parami.a() <= paramLong) && (paramLong < l)) {
        j = 1;
      } else {
        j = 0;
      }
      boolean bool3 = n0((b)g0.a.h(W));
      bool1 = bool2;
      if (i == 0)
      {
        bool1 = bool2;
        if (j == 0) {
          if (bool3) {
            bool1 = bool2;
          } else {
            bool1 = false;
          }
        }
      }
      U = bool1;
      if ((j != 0) && (i == 0)) {
        return;
      }
    }
    V = W;
    W = null;
  }
  
  public boolean r0(long paramLong1, long paramLong2, Bitmap paramBitmap, long paramLong3)
  {
    if ((!u0()) && (paramLong3 - paramLong1 >= 30000L)) {
      return false;
    }
    S.a(paramLong3 - K.b, paramBitmap);
    return true;
  }
  
  public final void s0()
  {
    R = null;
    N = 0;
    M = -9223372036854775807L;
    c localc = Q;
    if (localc != null)
    {
      localc.release();
      Q = null;
    }
  }
  
  public void t(int paramInt, Object paramObject)
  {
    if (paramInt != 15)
    {
      super.t(paramInt, paramObject);
    }
    else
    {
      if ((paramObject instanceof e)) {
        paramObject = (e)paramObject;
      } else {
        paramObject = null;
      }
      t0((e)paramObject);
    }
  }
  
  public final void t0(e parame)
  {
    S = l0(parame);
  }
  
  public final boolean u0()
  {
    boolean bool;
    if (getState() == 2) {
      bool = true;
    } else {
      bool = false;
    }
    int i = O;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 3) {
          return false;
        }
        throw new IllegalStateException();
      }
      return true;
    }
    return bool;
  }
  
  public static final class a
  {
    public static final a c = new a(-9223372036854775807L, -9223372036854775807L);
    public final long a;
    public final long b;
    
    public a(long paramLong1, long paramLong2)
    {
      a = paramLong1;
      b = paramLong2;
    }
  }
  
  public static class b
  {
    public final int a;
    public final long b;
    public Bitmap c;
    
    public b(int paramInt, long paramLong)
    {
      a = paramInt;
      b = paramLong;
    }
    
    public long a()
    {
      return b;
    }
    
    public Bitmap b()
    {
      return c;
    }
    
    public int c()
    {
      return a;
    }
    
    public boolean d()
    {
      boolean bool;
      if (c != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void e(Bitmap paramBitmap)
    {
      c = paramBitmap;
    }
  }
}

/* Location:
 * Qualified Name:     s0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */