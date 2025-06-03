package p0;

import X2.a0;
import X2.g0;
import X2.v;
import X2.y;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import d0.m.b;
import d0.q;
import d0.z;
import g0.M;
import g0.a;
import g0.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import l0.y1;

public class h
  implements x
{
  public final UUID b;
  public final F.c c;
  public final Q d;
  public final HashMap e;
  public final boolean f;
  public final int[] g;
  public final boolean h;
  public final g i;
  public final B0.m j;
  public final h k;
  public final long l;
  public final List m;
  public final Set n;
  public final Set o;
  public int p;
  public F q;
  public g r;
  public g s;
  public Looper t;
  public Handler u;
  public int v;
  public byte[] w;
  public y1 x;
  public volatile d y;
  
  public h(UUID paramUUID, F.c paramc, Q paramQ, HashMap paramHashMap, boolean paramBoolean1, int[] paramArrayOfInt, boolean paramBoolean2, B0.m paramm, long paramLong)
  {
    a.e(paramUUID);
    a.b(d0.g.b.equals(paramUUID) ^ true, "Use C.CLEARKEY_UUID instead");
    b = paramUUID;
    c = paramc;
    d = paramQ;
    e = paramHashMap;
    f = paramBoolean1;
    g = paramArrayOfInt;
    h = paramBoolean2;
    j = paramm;
    i = new g();
    k = new h(null);
    v = 0;
    m = new ArrayList();
    n = a0.h();
    o = a0.h();
    l = paramLong;
  }
  
  public static boolean u(n paramn)
  {
    int i1 = paramn.getState();
    boolean bool = false;
    if (i1 != 1) {
      return false;
    }
    paramn = ((n.a)a.e(paramn.g())).getCause();
    if (((paramn instanceof ResourceBusyException)) || (B.c(paramn))) {
      bool = true;
    }
    return bool;
  }
  
  public static List y(d0.m paramm, UUID paramUUID, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList(r);
    for (int i1 = 0; i1 < r; i1++)
    {
      m.b localb = paramm.e(i1);
      if (((localb.d(paramUUID)) || ((d0.g.c.equals(paramUUID)) && (localb.d(d0.g.b)))) && ((s != null) || (paramBoolean))) {
        localArrayList.add(localb);
      }
    }
    return localArrayList;
  }
  
  public final n A(int paramInt, boolean paramBoolean)
  {
    Object localObject = (F)a.e(q);
    if (((((F)localObject).k() != 2) || (!G.d)) && (M.H0(g, paramInt) != -1) && (((F)localObject).k() != 1))
    {
      localObject = r;
      if (localObject == null)
      {
        localObject = x(v.Y(), true, null, paramBoolean);
        m.add(localObject);
        r = ((g)localObject);
      }
      else
      {
        ((g)localObject).a(null);
      }
      return r;
    }
    return null;
  }
  
  public final void B(Looper paramLooper)
  {
    if (y == null) {
      y = new d(paramLooper);
    }
  }
  
  public final void C()
  {
    if ((q != null) && (p == 0) && (m.isEmpty()) && (n.isEmpty()))
    {
      ((F)a.e(q)).release();
      q = null;
    }
  }
  
  public final void D()
  {
    g0 localg0 = y.T(o).q();
    while (localg0.hasNext()) {
      ((n)localg0.next()).e(null);
    }
  }
  
  public final void E()
  {
    g0 localg0 = y.T(n).q();
    while (localg0.hasNext()) {
      ((f)localg0.next()).release();
    }
  }
  
  public void F(int paramInt, byte[] paramArrayOfByte)
  {
    a.f(m.isEmpty());
    if ((paramInt == 1) || (paramInt == 3)) {
      a.e(paramArrayOfByte);
    }
    v = paramInt;
    w = paramArrayOfByte;
  }
  
  public final void G(n paramn, v.a parama)
  {
    paramn.e(parama);
    if (l != -9223372036854775807L) {
      paramn.e(null);
    }
  }
  
  public final void H(boolean paramBoolean)
  {
    if ((paramBoolean) && (t == null))
    {
      o.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
    }
    else if (Thread.currentThread() != ((Looper)a.e(t)).getThread())
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: ");
      localStringBuilder.append(Thread.currentThread().getName());
      localStringBuilder.append("\nExpected thread: ");
      localStringBuilder.append(t.getThread().getName());
      o.i("DefaultDrmSessionMgr", localStringBuilder.toString(), new IllegalStateException());
    }
  }
  
  public void a(Looper paramLooper, y1 paramy1)
  {
    z(paramLooper);
    x = paramy1;
  }
  
  public int b(q paramq)
  {
    int i1 = 0;
    H(false);
    int i2 = ((F)a.e(q)).k();
    d0.m localm = r;
    if (localm == null)
    {
      int i3 = z.k(n);
      if (M.H0(g, i3) != -1) {
        i1 = i2;
      }
      return i1;
    }
    if (!v(localm)) {
      i2 = 1;
    }
    return i2;
  }
  
  public n c(v.a parama, q paramq)
  {
    boolean bool = false;
    H(false);
    if (p > 0) {
      bool = true;
    }
    a.f(bool);
    a.h(t);
    return t(t, parama, paramq, true);
  }
  
  public x.b d(v.a parama, q paramq)
  {
    boolean bool;
    if (p > 0) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    a.h(t);
    parama = new f(parama);
    parama.c(paramq);
    return parama;
  }
  
  public final void g()
  {
    H(true);
    int i1 = p;
    p = (i1 + 1);
    if (i1 != 0) {
      return;
    }
    if (q == null)
    {
      F localF = c.a(b);
      q = localF;
      localF.a(new c(null));
    }
    else if (l != -9223372036854775807L)
    {
      for (i1 = 0; i1 < m.size(); i1++) {
        ((g)m.get(i1)).a(null);
      }
    }
  }
  
  public final void release()
  {
    H(true);
    int i1 = p - 1;
    p = i1;
    if (i1 != 0) {
      return;
    }
    if (l != -9223372036854775807L)
    {
      ArrayList localArrayList = new ArrayList(m);
      for (i1 = 0; i1 < localArrayList.size(); i1++) {
        ((g)localArrayList.get(i1)).e(null);
      }
    }
    E();
    C();
  }
  
  public final n t(Looper paramLooper, v.a parama, q paramq, boolean paramBoolean)
  {
    B(paramLooper);
    paramLooper = r;
    if (paramLooper == null) {
      return A(z.k(n), paramBoolean);
    }
    paramq = w;
    Object localObject = null;
    if (paramq == null)
    {
      paramLooper = y((d0.m)a.e(paramLooper), b, false);
      paramq = paramLooper;
      if (paramLooper.isEmpty())
      {
        paramLooper = new e(b, null);
        o.d("DefaultDrmSessionMgr", "DRM error", paramLooper);
        if (parama != null) {
          parama.l(paramLooper);
        }
        return new D(new n.a(paramLooper, 6003));
      }
    }
    else
    {
      paramq = null;
    }
    if (!f)
    {
      paramLooper = s;
    }
    else
    {
      Iterator localIterator = m.iterator();
      do
      {
        paramLooper = (Looper)localObject;
        if (!localIterator.hasNext()) {
          break;
        }
        paramLooper = (g)localIterator.next();
      } while (!M.c(a, paramq));
    }
    if (paramLooper == null)
    {
      paramLooper = x(paramq, false, parama, paramBoolean);
      if (!f) {
        s = paramLooper;
      }
      m.add(paramLooper);
    }
    else
    {
      paramLooper.a(parama);
    }
    return paramLooper;
  }
  
  public final boolean v(d0.m paramm)
  {
    Object localObject = w;
    boolean bool = true;
    if (localObject != null) {
      return true;
    }
    if (y(paramm, b, true).isEmpty()) {
      if ((r == 1) && (paramm.e(0).d(d0.g.b)))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
        ((StringBuilder)localObject).append(b);
        o.h("DefaultDrmSessionMgr", ((StringBuilder)localObject).toString());
      }
      else
      {
        return false;
      }
    }
    paramm = q;
    if ((paramm != null) && (!"cenc".equals(paramm)))
    {
      if ("cbcs".equals(paramm))
      {
        if (M.a < 25) {
          bool = false;
        }
        return bool;
      }
      return (!"cbc1".equals(paramm)) && (!"cens".equals(paramm));
    }
    return true;
  }
  
  public final g w(List paramList, boolean paramBoolean, v.a parama)
  {
    a.e(q);
    boolean bool = h;
    paramList = new g(b, q, i, k, paramList, v, bool | paramBoolean, paramBoolean, w, e, d, (Looper)a.e(t), j, (y1)a.e(x));
    paramList.a(parama);
    if (l != -9223372036854775807L) {
      paramList.a(null);
    }
    return paramList;
  }
  
  public final g x(List paramList, boolean paramBoolean1, v.a parama, boolean paramBoolean2)
  {
    Object localObject1 = w(paramList, paramBoolean1, parama);
    Object localObject2 = localObject1;
    if (u((n)localObject1))
    {
      localObject2 = localObject1;
      if (!o.isEmpty())
      {
        D();
        G((n)localObject1, parama);
        localObject2 = w(paramList, paramBoolean1, parama);
      }
    }
    localObject1 = localObject2;
    if (u((n)localObject2))
    {
      localObject1 = localObject2;
      if (paramBoolean2)
      {
        localObject1 = localObject2;
        if (!n.isEmpty())
        {
          E();
          if (!o.isEmpty()) {
            D();
          }
          G((n)localObject2, parama);
          localObject1 = w(paramList, paramBoolean1, parama);
        }
      }
    }
    return (g)localObject1;
  }
  
  public final void z(Looper paramLooper)
  {
    Object localObject;
    try
    {
      localObject = t;
      if (localObject == null)
      {
        t = paramLooper;
        localObject = new android/os/Handler;
        ((Handler)localObject).<init>(paramLooper);
        u = ((Handler)localObject);
      }
    }
    finally
    {
      break label64;
    }
    boolean bool;
    if (localObject == paramLooper) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    a.e(u);
    return;
    label64:
    throw paramLooper;
  }
  
  public static final class b
  {
    public final HashMap a = new HashMap();
    public UUID b = d0.g.d;
    public F.c c = N.d;
    public boolean d;
    public int[] e = new int[0];
    public boolean f = true;
    public B0.m g = new B0.k();
    public long h = 300000L;
    
    public h a(Q paramQ)
    {
      return new h(b, c, paramQ, a, d, e, f, g, h, null);
    }
    
    public b b(B0.m paramm)
    {
      g = ((B0.m)a.e(paramm));
      return this;
    }
    
    public b c(boolean paramBoolean)
    {
      d = paramBoolean;
      return this;
    }
    
    public b d(boolean paramBoolean)
    {
      f = paramBoolean;
      return this;
    }
    
    public b e(int... paramVarArgs)
    {
      int i = paramVarArgs.length;
      for (int j = 0; j < i; j++)
      {
        int k = paramVarArgs[j];
        boolean bool1 = true;
        boolean bool2 = bool1;
        if (k != 2) {
          if (k == 1) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
        }
        a.a(bool2);
      }
      e = ((int[])paramVarArgs.clone());
      return this;
    }
    
    public b f(UUID paramUUID, F.c paramc)
    {
      b = ((UUID)a.e(paramUUID));
      c = ((F.c)a.e(paramc));
      return this;
    }
  }
  
  public class c
    implements F.b
  {
    public c() {}
    
    public void a(F paramF, byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
    {
      ((h.d)a.e(y)).obtainMessage(paramInt1, paramArrayOfByte1).sendToTarget();
    }
  }
  
  public class d
    extends Handler
  {
    public d(Looper paramLooper)
    {
      super();
    }
    
    public void handleMessage(Message paramMessage)
    {
      byte[] arrayOfByte = (byte[])obj;
      if (arrayOfByte == null) {
        return;
      }
      Iterator localIterator = h.m(h.this).iterator();
      while (localIterator.hasNext())
      {
        g localg = (g)localIterator.next();
        if (localg.t(arrayOfByte)) {
          localg.B(what);
        }
      }
    }
  }
  
  public static final class e
    extends Exception
  {
    public e(UUID paramUUID)
    {
      super();
    }
  }
  
  public class f
    implements x.b
  {
    public final v.a b;
    public n c;
    public boolean d;
    
    public f(v.a parama)
    {
      b = parama;
    }
    
    public void c(q paramq)
    {
      ((Handler)a.e(h.p(h.this))).post(new i(this, paramq));
    }
    
    public void release()
    {
      M.S0((Handler)a.e(h.p(h.this)), new j(this));
    }
  }
  
  public class g
    implements g.a
  {
    public final Set a = new HashSet();
    public g b;
    
    public g() {}
    
    public void a(g paramg)
    {
      a.add(paramg);
      if (b != null) {
        return;
      }
      b = paramg;
      paramg.H();
    }
    
    public void b()
    {
      b = null;
      Object localObject = v.U(a);
      a.clear();
      localObject = ((v)localObject).q();
      while (((Iterator)localObject).hasNext()) {
        ((g)((Iterator)localObject).next()).C();
      }
    }
    
    public void c(Exception paramException, boolean paramBoolean)
    {
      b = null;
      Object localObject = v.U(a);
      a.clear();
      localObject = ((v)localObject).q();
      while (((Iterator)localObject).hasNext()) {
        ((g)((Iterator)localObject).next()).D(paramException, paramBoolean);
      }
    }
    
    public void d(g paramg)
    {
      a.remove(paramg);
      if (b == paramg)
      {
        b = null;
        if (!a.isEmpty())
        {
          paramg = (g)a.iterator().next();
          b = paramg;
          paramg.H();
        }
      }
    }
  }
  
  public class h
    implements g.b
  {
    public h() {}
    
    public void a(g paramg, int paramInt)
    {
      if (h.n(h.this) != -9223372036854775807L)
      {
        h.o(h.this).remove(paramg);
        ((Handler)a.e(h.p(h.this))).removeCallbacksAndMessages(paramg);
      }
    }
    
    public void b(g paramg, int paramInt)
    {
      if ((paramInt == 1) && (h.q(h.this) > 0) && (h.n(h.this) != -9223372036854775807L))
      {
        h.o(h.this).add(paramg);
        ((Handler)a.e(h.p(h.this))).postAtTime(new k(paramg), paramg, SystemClock.uptimeMillis() + h.n(h.this));
      }
      else if (paramInt == 0)
      {
        h.m(h.this).remove(paramg);
        if (h.r(h.this) == paramg) {
          h.s(h.this, null);
        }
        if (h.e(h.this) == paramg) {
          h.f(h.this, null);
        }
        h.h(h.this).d(paramg);
        if (h.n(h.this) != -9223372036854775807L)
        {
          ((Handler)a.e(h.p(h.this))).removeCallbacksAndMessages(paramg);
          h.o(h.this).remove(paramg);
        }
      }
      h.i(h.this);
    }
  }
}

/* Location:
 * Qualified Name:     p0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */