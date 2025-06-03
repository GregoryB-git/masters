package r6;

import V5.n;
import V5.n.a;
import V5.t;
import Z5.h;
import g6.p;
import g6.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import p6.P0;
import u6.C;
import u6.D;
import u6.E;
import u6.F;
import u6.x;
import x6.a;

public class b
  implements d
{
  public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");
  public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");
  public static final AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");
  public static final AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");
  public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");
  public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");
  public static final AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");
  public static final AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");
  public static final AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
  private volatile Object _closeCause;
  public final int b;
  private volatile long bufferEnd;
  private volatile Object bufferEndSegment;
  public final g6.l c;
  private volatile Object closeHandler;
  private volatile long completedExpandBuffersAndPauseFlag;
  public final q d;
  private volatile Object receiveSegment;
  private volatile long receivers;
  private volatile Object sendSegment;
  private volatile long sendersAndCloseStatus;
  
  public b(int paramInt, g6.l paraml)
  {
    b = paramInt;
    c = paraml;
    if (paramInt >= 0)
    {
      bufferEnd = c.t(paramInt);
      completedExpandBuffersAndPauseFlag = D();
      i locali = new i(0L, null, this, 3);
      sendSegment = locali;
      receiveSegment = locali;
      if (U())
      {
        locali = c.n();
        Intrinsics.c(locali, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
      }
      bufferEndSegment = locali;
      if (paraml != null) {
        paraml = new b(this);
      } else {
        paraml = null;
      }
      d = paraml;
      _closeCause = c.l();
      return;
    }
    paraml = new StringBuilder();
    paraml.append("Invalid channel capacity: ");
    paraml.append(paramInt);
    paraml.append(", should be >=0");
    throw new IllegalArgumentException(paraml.toString().toString());
  }
  
  public final i A(long paramLong1, i parami, long paramLong2)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = k;
    p localp = (p)c.y();
    Object localObject = u6.d.c(parami, paramLong1, localp);
    if (!D.c(localObject))
    {
      C localC1 = D.b(localObject);
      for (;;)
      {
        localC2 = (C)localAtomicReferenceFieldUpdater.get(this);
        if (q >= q) {
          break label121;
        }
        if (!localC1.q()) {
          break;
        }
        if (u.b.a(localAtomicReferenceFieldUpdater, this, localC2, localC1))
        {
          if (!localC2.m()) {
            break label121;
          }
          localC2.k();
          break label121;
        }
        if (localC1.m()) {
          localC1.k();
        }
      }
    }
    label121:
    boolean bool = D.c(localObject);
    C localC2 = null;
    if (bool)
    {
      x();
      Z(paramLong1, parami);
    }
    long l1;
    int n;
    do
    {
      L(this, 0L, 1, null);
      parami = localC2;
      break;
      parami = (i)D.b(localObject);
      l1 = q;
      if (l1 <= paramLong1) {
        break;
      }
      localObject = g;
      n = c.b;
    } while (!((AtomicLongFieldUpdater)localObject).compareAndSet(this, paramLong2 + 1L, n * l1));
    K(q * n - paramLong2);
    parami = localC2;
    return parami;
  }
  
  public final i B(long paramLong, i parami)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = j;
    p localp = (p)c.y();
    Object localObject = u6.d.c(parami, paramLong, localp);
    if (!D.c(localObject))
    {
      C localC1 = D.b(localObject);
      for (;;)
      {
        C localC2 = (C)localAtomicReferenceFieldUpdater.get(this);
        if (q >= q) {
          break label121;
        }
        if (!localC1.q()) {
          break;
        }
        if (u.b.a(localAtomicReferenceFieldUpdater, this, localC2, localC1))
        {
          if (!localC2.m()) {
            break label121;
          }
          localC2.k();
          break label121;
        }
        if (localC1.m()) {
          localC1.k();
        }
      }
    }
    label121:
    boolean bool = D.c(localObject);
    localp = null;
    if (bool)
    {
      x();
      localObject = localp;
      if (q * c.b >= I()) {}
    }
    else
    {
      for (;;)
      {
        parami.b();
        localObject = localp;
        break label334;
        parami = (i)D.b(localObject);
        if ((!U()) && (paramLong <= D() / c.b))
        {
          localAtomicReferenceFieldUpdater = k;
          for (;;)
          {
            localObject = (C)localAtomicReferenceFieldUpdater.get(this);
            if ((q >= q) || (!parami.q())) {
              break;
            }
            if (u.b.a(localAtomicReferenceFieldUpdater, this, localObject, parami))
            {
              if (!((C)localObject).m()) {
                break;
              }
              ((u6.e)localObject).k();
              break;
            }
            if (parami.m()) {
              parami.k();
            }
          }
        }
        long l1 = q;
        if (l1 <= paramLong) {
          break;
        }
        int n = c.b;
        v0(l1 * n);
        localObject = localp;
        if (q * n >= I()) {
          break label334;
        }
      }
      localObject = parami;
    }
    label334:
    return (i)localObject;
  }
  
  public final i C(long paramLong, i parami)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = i;
    p localp = (p)c.y();
    Object localObject = u6.d.c(parami, paramLong, localp);
    if (!D.c(localObject))
    {
      localC1 = D.b(localObject);
      for (;;)
      {
        C localC2 = (C)localAtomicReferenceFieldUpdater.get(this);
        if (q >= q) {
          break label121;
        }
        if (!localC1.q()) {
          break;
        }
        if (u.b.a(localAtomicReferenceFieldUpdater, this, localC2, localC1))
        {
          if (!localC2.m()) {
            break label121;
          }
          localC2.k();
          break label121;
        }
        if (localC1.m()) {
          localC1.k();
        }
      }
    }
    label121:
    boolean bool = D.c(localObject);
    C localC1 = null;
    if (bool)
    {
      x();
      localObject = localC1;
      if (q * c.b >= G()) {}
    }
    else
    {
      for (;;)
      {
        parami.b();
        localObject = localC1;
        break label235;
        parami = (i)D.b(localObject);
        long l1 = q;
        if (l1 <= paramLong) {
          break;
        }
        int n = c.b;
        w0(l1 * n);
        localObject = localC1;
        if (q * n >= G()) {
          break label235;
        }
      }
      localObject = parami;
    }
    label235:
    return (i)localObject;
  }
  
  public final long D()
  {
    return g.get(this);
  }
  
  public final Throwable E()
  {
    return (Throwable)l.get(this);
  }
  
  public final Throwable F()
  {
    Throwable localThrowable = E();
    Object localObject = localThrowable;
    if (localThrowable == null) {
      localObject = new j("Channel was closed");
    }
    return (Throwable)localObject;
  }
  
  public final long G()
  {
    return f.get(this);
  }
  
  public final Throwable H()
  {
    Throwable localThrowable = E();
    Object localObject = localThrowable;
    if (localThrowable == null) {
      localObject = new k("Channel was closed");
    }
    return (Throwable)localObject;
  }
  
  public final long I()
  {
    return e.get(this) & 0xFFFFFFFFFFFFFFF;
  }
  
  public final boolean J()
  {
    for (;;)
    {
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = j;
      i locali1 = (i)localAtomicReferenceFieldUpdater.get(this);
      long l1 = G();
      if (I() <= l1) {
        return false;
      }
      int n = c.b;
      long l2 = l1 / n;
      i locali2 = locali1;
      if (q != l2)
      {
        locali1 = B(l2, locali1);
        locali2 = locali1;
        if (locali1 == null)
        {
          if (getq >= l2) {
            continue;
          }
          return false;
        }
      }
      locali2.b();
      if (N(locali2, (int)(l1 % n), l1)) {
        return true;
      }
      f.compareAndSet(this, l1, l1 + 1L);
    }
  }
  
  public final void K(long paramLong)
  {
    while (((h.addAndGet(this, paramLong) & 0x4000000000000000) != 0L) && ((h.get(this) & 0x4000000000000000) != 0L)) {}
  }
  
  public final void M()
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = m;
    Object localObject1;
    do
    {
      localObject1 = localAtomicReferenceFieldUpdater.get(this);
      if (localObject1 == null) {
        localObject2 = c.d();
      } else {
        localObject2 = c.e();
      }
    } while (!u.b.a(localAtomicReferenceFieldUpdater, this, localObject1, localObject2));
    if (localObject1 == null) {
      return;
    }
    Object localObject2 = (g6.l)y.b(localObject1, 1);
    ((g6.l)localObject1).invoke(E());
  }
  
  public final boolean N(i parami, int paramInt, long paramLong)
  {
    Object localObject;
    do
    {
      localObject = parami.w(paramInt);
      boolean bool = false;
      if ((localObject != null) && (localObject != c.k()))
      {
        if (localObject == c.d) {
          return true;
        }
        if (localObject == c.j()) {
          return false;
        }
        if (localObject == c.z()) {
          return false;
        }
        if (localObject == c.f()) {
          return false;
        }
        if (localObject == c.o()) {
          return false;
        }
        if (localObject == c.p()) {
          return true;
        }
        if (localObject == c.q()) {
          return false;
        }
        if (paramLong == G()) {
          bool = true;
        }
        return bool;
      }
    } while (!parami.r(paramInt, localObject, c.o()));
    z();
    return false;
  }
  
  public final boolean O(long paramLong, boolean paramBoolean)
  {
    int n = (int)(paramLong >> 60);
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (n != 0)
    {
      bool2 = bool1;
      if (n != 1)
      {
        if (n != 2) {
          if (n == 3) {
            v(paramLong & 0xFFFFFFFFFFFFFFF);
          }
        }
        do
        {
          do
          {
            bool2 = true;
            break;
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("unexpected close status: ");
            localStringBuilder.append(n);
            throw new IllegalStateException(localStringBuilder.toString().toString());
            w(paramLong & 0xFFFFFFFFFFFFFFF);
          } while (!paramBoolean);
          bool2 = bool1;
        } while (!J());
      }
    }
    return bool2;
  }
  
  public boolean P()
  {
    return Q(e.get(this));
  }
  
  public final boolean Q(long paramLong)
  {
    return O(paramLong, true);
  }
  
  public boolean R()
  {
    return S(e.get(this));
  }
  
  public final boolean S(long paramLong)
  {
    return O(paramLong, false);
  }
  
  public boolean T()
  {
    return false;
  }
  
  public final boolean U()
  {
    long l1 = D();
    boolean bool;
    if ((l1 != 0L) && (l1 != Long.MAX_VALUE)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final long V(i parami)
  {
    Object localObject;
    do
    {
      for (int n = c.b - 1; -1 < n; n--)
      {
        long l1 = q * c.b + n;
        if (l1 < G()) {
          return -1L;
        }
        do
        {
          localObject = parami.w(n);
          if ((localObject != null) && (localObject != c.k()))
          {
            if (localObject != c.d) {
              break;
            }
            return l1;
          }
        } while (!parami.r(n, localObject, c.z()));
        parami.p();
      }
      localObject = (i)parami.g();
      parami = (i)localObject;
    } while (localObject != null);
    return -1L;
  }
  
  public final void W()
  {
    AtomicLongFieldUpdater localAtomicLongFieldUpdater = e;
    long l1;
    do
    {
      l1 = localAtomicLongFieldUpdater.get(this);
    } while (((int)(l1 >> 60) == 0) && (!localAtomicLongFieldUpdater.compareAndSet(this, l1, c.b(0xFFFFFFFFFFFFFFF & l1, 1))));
  }
  
  public final void X()
  {
    AtomicLongFieldUpdater localAtomicLongFieldUpdater = e;
    long l1;
    do
    {
      l1 = localAtomicLongFieldUpdater.get(this);
    } while (!localAtomicLongFieldUpdater.compareAndSet(this, l1, c.b(0xFFFFFFFFFFFFFFF & l1, 3)));
  }
  
  public final void Y()
  {
    AtomicLongFieldUpdater localAtomicLongFieldUpdater = e;
    long l1;
    long l2;
    do
    {
      l1 = localAtomicLongFieldUpdater.get(this);
      int n = (int)(l1 >> 60);
      if (n != 0)
      {
        if (n != 1) {
          return;
        }
        l2 = l1 & 0xFFFFFFFFFFFFFFF;
      }
      for (n = 3;; n = 2)
      {
        l2 = c.b(l2, n);
        break;
        l2 = l1 & 0xFFFFFFFFFFFFFFF;
      }
    } while (!localAtomicLongFieldUpdater.compareAndSet(this, l1, l2));
  }
  
  public final void Z(long paramLong, i parami)
  {
    i locali;
    for (;;)
    {
      locali = parami;
      if (q >= paramLong) {
        break;
      }
      locali = (i)parami.e();
      if (locali == null)
      {
        locali = parami;
        break;
      }
      parami = locali;
    }
    while (locali.h())
    {
      parami = (i)locali.e();
      if (parami == null) {
        break;
      }
      locali = parami;
    }
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = k;
    for (;;)
    {
      parami = (C)localAtomicReferenceFieldUpdater.get(this);
      if (q < q)
      {
        if (!locali.q()) {
          break;
        }
        if (!u.b.a(localAtomicReferenceFieldUpdater, this, parami, locali)) {
          break label134;
        }
        if (parami.m()) {
          parami.k();
        }
      }
      return;
      label134:
      if (locali.m()) {
        locali.k();
      }
    }
  }
  
  public Object a(X5.d paramd)
  {
    return g0(this, paramd);
  }
  
  public void a0() {}
  
  public boolean b(Throwable paramThrowable)
  {
    return u(paramThrowable, false);
  }
  
  public final void b0(p6.l paraml)
  {
    n.a locala = n.o;
    paraml.resumeWith(n.a(V5.o.a(F())));
  }
  
  public Object c()
  {
    long l1 = f.get(this);
    long l2 = e.get(this);
    if (Q(l2)) {
      return g.a.a(E());
    }
    if (l1 >= (l2 & 0xFFFFFFFFFFFFFFF)) {
      return g.a.b();
    }
    F localF = c.i();
    Object localObject1 = (i)h().get(this);
    Object localObject2;
    for (;;)
    {
      if (P())
      {
        localObject1 = g.a.a(E());
        break label278;
      }
      l2 = i().getAndIncrement(this);
      int n = c.b;
      l1 = l2 / n;
      n = (int)(l2 % n);
      if (q != l1)
      {
        localObject2 = e(this, l1, (i)localObject1);
        if (localObject2 == null) {
          continue;
        }
        localObject1 = localObject2;
      }
      localObject2 = p(this, (i)localObject1, n, l2, localF);
      if (localObject2 == c.r())
      {
        if ((localF instanceof P0)) {
          localObject2 = (P0)localF;
        } else {
          localObject2 = null;
        }
        if (localObject2 != null) {
          n(this, (P0)localObject2, (i)localObject1, n);
        }
        x0(l2);
        ((C)localObject1).p();
        localObject1 = g.a.b();
        break label278;
      }
      if (localObject2 != c.h()) {
        break;
      }
      if (l2 < I()) {
        ((u6.e)localObject1).b();
      }
    }
    if (localObject2 != c.s())
    {
      ((u6.e)localObject1).b();
      localObject1 = g.a.c(localObject2);
      label278:
      return localObject1;
    }
    throw new IllegalStateException("unexpected".toString());
  }
  
  public void c0() {}
  
  public Object d(Object paramObject)
  {
    if (m0(e.get(this))) {
      return g.a.b();
    }
    F localF = c.j();
    Object localObject = (i)j().get(this);
    long l2;
    boolean bool;
    int n;
    int i1;
    i locali;
    do
    {
      long l1 = k().getAndIncrement(this);
      l2 = l1 & 0xFFFFFFFFFFFFFFF;
      bool = l(this, l1);
      n = c.b;
      l1 = l2 / n;
      i1 = (int)(l2 % n);
      if (q == l1) {
        break label132;
      }
      locali = f(this, l1, (i)localObject);
      if (locali != null) {
        break;
      }
    } while (!bool);
    for (;;)
    {
      return g.a.a(H());
      localObject = locali;
      label132:
      n = q(this, (i)localObject, i1, paramObject, l2, localF, bool);
      if (n == 0) {
        break label290;
      }
      if (n == 1) {
        break label277;
      }
      if (n != 2)
      {
        if (n != 3)
        {
          if (n != 4)
          {
            if (n == 5) {
              ((u6.e)localObject).b();
            }
            break;
          }
          if (l2 >= G()) {
            continue;
          }
          ((u6.e)localObject).b();
          continue;
        }
        throw new IllegalStateException("unexpected".toString());
      }
      if (!bool) {
        break label234;
      }
      ((C)localObject).p();
    }
    label234:
    if ((localF instanceof P0)) {
      paramObject = (P0)localF;
    } else {
      paramObject = null;
    }
    if (paramObject != null) {
      o(this, (P0)paramObject, (i)localObject, i1);
    }
    ((C)localObject).p();
    return g.a.b();
    for (;;)
    {
      label277:
      paramObject = g.a.c(t.a);
      break;
      label290:
      ((u6.e)localObject).b();
    }
    return paramObject;
  }
  
  public void d0() {}
  
  public final void e0(P0 paramP0, i parami, int paramInt)
  {
    d0();
    paramP0.a(parami, paramInt);
  }
  
  public final void f0(P0 paramP0, i parami, int paramInt)
  {
    paramP0.a(parami, paramInt + c.b);
  }
  
  public final Object h0(i parami, int paramInt, long paramLong, X5.d paramd)
  {
    p6.m localm = p6.o.b(Y5.b.b(paramd));
    Object localObject1;
    try
    {
      localObject1 = p(this, parami, paramInt, paramLong, localm);
      if (localObject1 == c.r()) {
        n(this, localm, parami, paramInt);
      }
    }
    finally
    {
      break label373;
    }
    Object localObject2 = c.h();
    Object localObject3 = null;
    g6.l locall = null;
    if (localObject1 == localObject2)
    {
      if (paramLong < I()) {
        parami.b();
      }
      localObject2 = (i)h().get(this);
      for (;;)
      {
        if (P())
        {
          m(this, localm);
          break label353;
        }
        paramLong = i().getAndIncrement(this);
        paramInt = c.b;
        long l1 = paramLong / paramInt;
        paramInt = (int)(paramLong % paramInt);
        parami = (i)localObject2;
        if (q != l1)
        {
          parami = e(this, l1, (i)localObject2);
          if (parami == null) {}
        }
        else
        {
          localObject1 = p(this, parami, paramInt, paramLong, localm);
          if (localObject1 == c.r())
          {
            localObject2 = locall;
            if ((localm instanceof P0)) {
              localObject2 = localm;
            }
            if (localObject2 == null) {
              break label353;
            }
            n(this, (P0)localObject2, parami, paramInt);
            break label353;
          }
          if (localObject1 != c.h()) {
            break;
          }
          localObject2 = parami;
          if (paramLong < I())
          {
            parami.b();
            localObject2 = parami;
          }
        }
      }
      if (localObject1 != c.s())
      {
        parami.b();
        locall = c;
        localObject2 = localObject1;
        parami = (i)localObject3;
        if (locall != null)
        {
          parami = x.a(locall, localObject1, localm.getContext());
          localObject2 = localObject1;
        }
      }
    }
    for (;;)
    {
      localm.j(localObject2, parami);
      break;
      parami = new java/lang/IllegalStateException;
      parami.<init>("unexpected".toString());
      throw parami;
      parami.b();
      locall = c;
      localObject2 = localObject1;
      parami = (i)localObject3;
      if (locall != null)
      {
        parami = x.a(locall, localObject1, localm.getContext());
        localObject2 = localObject1;
      }
    }
    label353:
    parami = localm.w();
    if (parami == Y5.b.c()) {
      h.c(paramd);
    }
    return parami;
    label373:
    localm.I();
    throw parami;
  }
  
  public final void i0(i parami)
  {
    g6.l locall = c;
    Object localObject1 = null;
    Object localObject2 = u6.l.b(null, 1, null);
    Object localObject3 = parami;
    int n;
    Object localObject4;
    label130:
    label316:
    i locali;
    do
    {
      n = c.b - 1;
      localObject4 = localObject2;
      parami = (i)localObject1;
      while (-1 < n)
      {
        long l1 = q * c.b + n;
        do
        {
          localObject2 = ((i)localObject3).w(n);
          if (localObject2 == c.f()) {
            break label347;
          }
          if (localObject2 != c.d) {
            break;
          }
          if (l1 < G()) {
            break label347;
          }
        } while (!((i)localObject3).r(n, localObject2, c.z()));
        localObject2 = parami;
        localObject1 = localObject4;
        if (locall != null)
        {
          localObject2 = x.c(locall, ((i)localObject3).v(n), parami);
          localObject1 = localObject4;
        }
        ((i)localObject3).s(n);
        localObject4 = localObject1;
        parami = (i)localObject2;
        for (;;)
        {
          ((C)localObject3).p();
          break label316;
          if ((localObject2 != c.k()) && (localObject2 != null))
          {
            if ((!(localObject2 instanceof P0)) && (!(localObject2 instanceof o)))
            {
              if ((localObject2 == c.p()) || (localObject2 == c.q())) {
                break label347;
              }
              if (localObject2 == c.p()) {
                break;
              }
              break label316;
            }
            if (l1 < G()) {
              break label347;
            }
            if ((localObject2 instanceof o)) {
              localObject1 = a;
            } else {
              localObject1 = (P0)localObject2;
            }
            if (!((i)localObject3).r(n, localObject2, c.z())) {
              break;
            }
            localObject2 = parami;
            if (locall != null) {
              localObject2 = x.c(locall, ((i)localObject3).v(n), parami);
            }
            localObject1 = u6.l.c(localObject4, localObject1);
            break label130;
          }
          if (!((i)localObject3).r(n, localObject2, c.z())) {
            break;
          }
        }
        n--;
      }
      locali = (i)((u6.e)localObject3).g();
      localObject1 = parami;
      localObject2 = localObject4;
      localObject3 = locali;
    } while (locali != null);
    label347:
    if (localObject4 != null) {
      if (!(localObject4 instanceof ArrayList))
      {
        k0((P0)localObject4);
      }
      else
      {
        Intrinsics.c(localObject4, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        localObject4 = (ArrayList)localObject4;
        for (n = ((ArrayList)localObject4).size() - 1; -1 < n; n--) {
          k0((P0)((ArrayList)localObject4).get(n));
        }
      }
    }
    if (parami == null) {
      return;
    }
    throw parami;
  }
  
  public e iterator()
  {
    return new a();
  }
  
  public final void j0(P0 paramP0)
  {
    l0(paramP0, true);
  }
  
  public final void k0(P0 paramP0)
  {
    l0(paramP0, false);
  }
  
  public final void l0(P0 paramP0, boolean paramBoolean)
  {
    if ((paramP0 instanceof p6.l))
    {
      localObject = (X5.d)paramP0;
      paramP0 = n.o;
      if (paramBoolean) {
        paramP0 = F();
      } else {
        paramP0 = H();
      }
      ((X5.d)localObject).resumeWith(n.a(V5.o.a(paramP0)));
    }
    else
    {
      if (!(paramP0 instanceof a)) {
        break label64;
      }
      ((a)paramP0).j();
    }
    return;
    label64:
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Unexpected waiter: ");
    ((StringBuilder)localObject).append(paramP0);
    throw new IllegalStateException(((StringBuilder)localObject).toString().toString());
  }
  
  public final boolean m0(long paramLong)
  {
    if (S(paramLong)) {
      return false;
    }
    return r(paramLong & 0xFFFFFFFFFFFFFFF) ^ true;
  }
  
  public final boolean n0(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if ((paramObject1 instanceof a))
    {
      Intrinsics.c(paramObject1, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
      bool = ((a)paramObject1).i(paramObject2);
    }
    else
    {
      if (!(paramObject1 instanceof p6.l)) {
        break label83;
      }
      Intrinsics.c(paramObject1, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
      p6.l locall = (p6.l)paramObject1;
      paramObject1 = c;
      if (paramObject1 != null) {
        paramObject1 = x.a((g6.l)paramObject1, paramObject2, locall.getContext());
      } else {
        paramObject1 = null;
      }
      bool = c.u(locall, paramObject2, (g6.l)paramObject1);
    }
    return bool;
    label83:
    paramObject2 = new StringBuilder();
    ((StringBuilder)paramObject2).append("Unexpected receiver type: ");
    ((StringBuilder)paramObject2).append(paramObject1);
    throw new IllegalStateException(((StringBuilder)paramObject2).toString().toString());
  }
  
  public final boolean o0(Object paramObject, i parami, int paramInt)
  {
    if ((paramObject instanceof p6.l))
    {
      Intrinsics.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
      return c.C((p6.l)paramObject, t.a, null, 2, null);
    }
    parami = new StringBuilder();
    parami.append("Unexpected waiter: ");
    parami.append(paramObject);
    throw new IllegalStateException(parami.toString().toString());
  }
  
  public final boolean p0(i parami, int paramInt, long paramLong)
  {
    Object localObject = parami.w(paramInt);
    if (((localObject instanceof P0)) && (paramLong >= f.get(this)) && (parami.r(paramInt, localObject, c.p())))
    {
      boolean bool;
      if (o0(localObject, parami, paramInt))
      {
        parami.A(paramInt, c.d);
        bool = true;
      }
      else
      {
        parami.A(paramInt, c.j());
        parami.x(paramInt, false);
        bool = false;
      }
      return bool;
    }
    return q0(parami, paramInt, paramLong);
  }
  
  public final boolean q0(i parami, int paramInt, long paramLong)
  {
    Object localObject;
    label113:
    do
    {
      do
      {
        boolean bool2;
        do
        {
          do
          {
            localObject = parami.w(paramInt);
            boolean bool1 = localObject instanceof P0;
            bool2 = false;
            if (!bool1) {
              break label113;
            }
            if (paramLong >= f.get(this)) {
              break;
            }
          } while (!parami.r(paramInt, localObject, new o((P0)localObject)));
          return true;
        } while (!parami.r(paramInt, localObject, c.p()));
        if (o0(localObject, parami, paramInt))
        {
          parami.A(paramInt, c.d);
          bool2 = true;
        }
        else
        {
          parami.A(paramInt, c.j());
          parami.x(paramInt, false);
        }
        return bool2;
        if (localObject == c.j()) {
          return false;
        }
        if (localObject != null) {
          break;
        }
      } while (!parami.r(paramInt, localObject, c.k()));
      return true;
      if (localObject == c.d) {
        return true;
      }
      if ((localObject == c.o()) || (localObject == c.f()) || (localObject == c.i())) {
        break;
      }
      if (localObject == c.z()) {
        return true;
      }
    } while (localObject == c.q());
    parami = new StringBuilder();
    parami.append("Unexpected cell state: ");
    parami.append(localObject);
    throw new IllegalStateException(parami.toString().toString());
    return true;
  }
  
  public final boolean r(long paramLong)
  {
    boolean bool;
    if ((paramLong >= D()) && (paramLong >= G() + b)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final Object r0(i parami, int paramInt, long paramLong, Object paramObject)
  {
    Object localObject = parami.w(paramInt);
    if (localObject == null)
    {
      if (paramLong >= (e.get(this) & 0xFFFFFFFFFFFFFFF))
      {
        if (paramObject == null) {
          return c.s();
        }
        if (parami.r(paramInt, localObject, paramObject))
        {
          z();
          return c.r();
        }
      }
    }
    else if ((localObject == c.d) && (parami.r(paramInt, localObject, c.f())))
    {
      z();
      return parami.y(paramInt);
    }
    return s0(parami, paramInt, paramLong, paramObject);
  }
  
  public final void s(i parami, long paramLong)
  {
    Object localObject1 = u6.l.b(null, 1, null);
    i locali = parami;
    parami = (i)localObject1;
    int n;
    for (;;)
    {
      localObject1 = parami;
      if (locali == null) {
        break;
      }
      n = c.b - 1;
      while (-1 < n)
      {
        localObject1 = parami;
        if (q * c.b + n < paramLong) {
          break label212;
        }
        Object localObject2;
        label167:
        do
        {
          do
          {
            localObject2 = locali.w(n);
            if ((localObject2 == null) || (localObject2 == c.k())) {
              break label167;
            }
            if (!(localObject2 instanceof o)) {
              break;
            }
          } while (!locali.r(n, localObject2, c.z()));
          for (localObject1 = a;; localObject1 = localObject2)
          {
            localObject1 = u6.l.c(parami, localObject1);
            locali.x(n, true);
            break label190;
            localObject1 = parami;
            if (!(localObject2 instanceof P0)) {
              break label190;
            }
            if (!locali.r(n, localObject2, c.z())) {
              break;
            }
          }
        } while (!locali.r(n, localObject2, c.z()));
        locali.p();
        localObject1 = parami;
        label190:
        n--;
        parami = (i)localObject1;
      }
      locali = (i)locali.g();
    }
    label212:
    if (localObject1 != null) {
      if (!(localObject1 instanceof ArrayList))
      {
        j0((P0)localObject1);
      }
      else
      {
        Intrinsics.c(localObject1, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        parami = (ArrayList)localObject1;
        for (n = parami.size() - 1; -1 < n; n--) {
          j0((P0)parami.get(n));
        }
      }
    }
  }
  
  public final Object s0(i parami, int paramInt, long paramLong, Object paramObject)
  {
    Object localObject;
    label202:
    do
    {
      do
      {
        do
        {
          do
          {
            localObject = parami.w(paramInt);
            if ((localObject == null) || (localObject == c.k())) {
              break label202;
            }
            if (localObject != c.d) {
              break;
            }
          } while (!parami.r(paramInt, localObject, c.f()));
          z();
          return parami.y(paramInt);
          if (localObject == c.j()) {
            return c.h();
          }
          if (localObject == c.o()) {
            return c.h();
          }
          if (localObject == c.z())
          {
            z();
            return c.h();
          }
        } while ((localObject == c.p()) || (!parami.r(paramInt, localObject, c.q())));
        boolean bool = localObject instanceof o;
        paramObject = localObject;
        if (bool) {
          paramObject = a;
        }
        if (o0(paramObject, parami, paramInt))
        {
          parami.A(paramInt, c.f());
          z();
          parami = parami.y(paramInt);
        }
        else
        {
          parami.A(paramInt, c.j());
          parami.x(paramInt, false);
          if (bool) {
            z();
          }
          parami = c.h();
        }
        return parami;
        if (paramLong >= (e.get(this) & 0xFFFFFFFFFFFFFFF)) {
          break;
        }
      } while (!parami.r(paramInt, localObject, c.o()));
      z();
      return c.h();
      if (paramObject == null) {
        return c.s();
      }
    } while (!parami.r(paramInt, localObject, paramObject));
    z();
    return c.r();
  }
  
  public final i t()
  {
    Object localObject1 = k.get(this);
    Object localObject2 = (i)i.get(this);
    Object localObject3 = localObject1;
    if (q > q) {
      localObject3 = localObject2;
    }
    localObject1 = (i)j.get(this);
    localObject2 = localObject3;
    if (q > q) {
      localObject2 = localObject1;
    }
    return (i)u6.d.b((u6.e)localObject2);
  }
  
  public final int t0(i parami, int paramInt, Object paramObject1, long paramLong, Object paramObject2, boolean paramBoolean)
  {
    parami.B(paramInt, paramObject1);
    if (paramBoolean) {
      return u0(parami, paramInt, paramObject1, paramLong, paramObject2, paramBoolean);
    }
    Object localObject = parami.w(paramInt);
    if (localObject == null)
    {
      if (r(paramLong))
      {
        if (parami.r(paramInt, null, c.d)) {
          return 1;
        }
      }
      else
      {
        if (paramObject2 == null) {
          return 3;
        }
        if (parami.r(paramInt, null, paramObject2)) {
          return 2;
        }
      }
    }
    else if ((localObject instanceof P0))
    {
      parami.s(paramInt);
      if (n0(localObject, paramObject1))
      {
        parami.A(paramInt, c.f());
        c0();
        paramInt = 0;
      }
      else
      {
        if (parami.t(paramInt, c.i()) != c.i()) {
          parami.x(paramInt, true);
        }
        paramInt = 5;
      }
      return paramInt;
    }
    return u0(parami, paramInt, paramObject1, paramLong, paramObject2, paramBoolean);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int n = (int)(e.get(this) >> 60);
    if (n != 2)
    {
      if (n != 3) {}
    }
    else {
      for (localObject1 = "cancelled,";; localObject1 = "closed,")
      {
        localStringBuilder.append((String)localObject1);
        break;
      }
    }
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("capacity=");
    ((StringBuilder)localObject1).append(b);
    ((StringBuilder)localObject1).append(',');
    localStringBuilder.append(((StringBuilder)localObject1).toString());
    localStringBuilder.append("data=[");
    Object localObject2 = (Iterable)W5.m.i(new i[] { j.get(this), i.get(this), k.get(this) });
    localObject1 = new ArrayList();
    Object localObject3 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = ((Iterator)localObject3).next();
      if ((i)localObject2 != c.n()) {
        ((Collection)localObject1).add(localObject2);
      }
    }
    Object localObject4 = ((Iterable)localObject1).iterator();
    if (((Iterator)localObject4).hasNext())
    {
      localObject2 = ((Iterator)localObject4).next();
      long l1;
      if (!((Iterator)localObject4).hasNext())
      {
        localObject1 = localObject2;
      }
      else
      {
        l1 = q;
        do
        {
          localObject3 = ((Iterator)localObject4).next();
          l2 = q;
          localObject1 = localObject2;
          l3 = l1;
          if (l1 > l2)
          {
            localObject1 = localObject3;
            l3 = l2;
          }
          localObject2 = localObject1;
          l1 = l3;
        } while (((Iterator)localObject4).hasNext());
      }
      localObject2 = (i)localObject1;
      long l2 = G();
      long l3 = I();
      for (;;)
      {
        int i1 = c.b;
        for (n = 0; n < i1; n++)
        {
          l1 = q * c.b + n;
          boolean bool1 = l1 < l3;
          if ((!bool1) && (l1 >= l2)) {
            break label739;
          }
          localObject1 = ((i)localObject2).w(n);
          localObject3 = ((i)localObject2).v(n);
          if ((localObject1 instanceof p6.l))
          {
            boolean bool2 = l1 < l2;
            if ((bool2) && (!bool1)) {
              localObject1 = "receive";
            } else if ((bool1) && (!bool2)) {
              localObject1 = "send";
            } else {
              localObject1 = "cont";
            }
          }
          else if ((localObject1 instanceof o))
          {
            localObject4 = new StringBuilder();
            ((StringBuilder)localObject4).append("EB(");
            ((StringBuilder)localObject4).append(localObject1);
            ((StringBuilder)localObject4).append(')');
            localObject1 = ((StringBuilder)localObject4).toString();
          }
          else if ((Intrinsics.a(localObject1, c.q())) || (Intrinsics.a(localObject1, c.p())))
          {
            localObject1 = "resuming_sender";
          }
          else
          {
            if ((localObject1 == null) || (Intrinsics.a(localObject1, c.k())) || (Intrinsics.a(localObject1, c.f())) || (Intrinsics.a(localObject1, c.o())) || (Intrinsics.a(localObject1, c.i())) || (Intrinsics.a(localObject1, c.j())) || (Intrinsics.a(localObject1, c.z()))) {
              continue;
            }
            localObject1 = localObject1.toString();
          }
          if (localObject3 != null)
          {
            localObject4 = new StringBuilder();
            ((StringBuilder)localObject4).append('(');
            ((StringBuilder)localObject4).append((String)localObject1);
            ((StringBuilder)localObject4).append(',');
            ((StringBuilder)localObject4).append(localObject3);
            ((StringBuilder)localObject4).append("),");
          }
          for (localObject1 = ((StringBuilder)localObject4).toString();; localObject1 = ((StringBuilder)localObject3).toString())
          {
            localStringBuilder.append((String)localObject1);
            break;
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append((String)localObject1);
            ((StringBuilder)localObject3).append(',');
          }
        }
        localObject2 = (i)((u6.e)localObject2).e();
        if (localObject2 == null)
        {
          label739:
          if (kotlin.text.i.h0(localStringBuilder) == ',') {
            Intrinsics.checkNotNullExpressionValue(localStringBuilder.deleteCharAt(localStringBuilder.length() - 1), "this.deleteCharAt(index)");
          }
          localStringBuilder.append("]");
          return localStringBuilder.toString();
        }
      }
    }
    throw new NoSuchElementException();
  }
  
  public boolean u(Throwable paramThrowable, boolean paramBoolean)
  {
    if (paramBoolean) {
      W();
    }
    boolean bool = u.b.a(l, this, c.l(), paramThrowable);
    if (paramBoolean) {
      X();
    } else {
      Y();
    }
    x();
    a0();
    if (bool) {
      M();
    }
    return bool;
  }
  
  public final int u0(i parami, int paramInt, Object paramObject1, long paramLong, Object paramObject2, boolean paramBoolean)
  {
    Object localObject;
    int n;
    label88:
    do
    {
      do
      {
        do
        {
          do
          {
            localObject = parami.w(paramInt);
            n = 0;
            if (localObject != null) {
              break label88;
            }
            if ((!r(paramLong)) || (paramBoolean)) {
              break;
            }
          } while (!parami.r(paramInt, null, c.d));
          return 1;
          if (!paramBoolean) {
            break;
          }
        } while (!parami.r(paramInt, null, c.j()));
        parami.x(paramInt, false);
        return 4;
        if (paramObject2 == null) {
          return 3;
        }
      } while (!parami.r(paramInt, null, paramObject2));
      return 2;
      if (localObject != c.k()) {
        break;
      }
    } while (!parami.r(paramInt, localObject, c.d));
    return 1;
    if (localObject == c.i())
    {
      parami.s(paramInt);
      return 5;
    }
    if (localObject == c.o())
    {
      parami.s(paramInt);
      return 5;
    }
    paramObject2 = c.z();
    parami.s(paramInt);
    if (localObject == paramObject2)
    {
      x();
      return 4;
    }
    paramObject2 = localObject;
    if ((localObject instanceof o)) {
      paramObject2 = a;
    }
    if (n0(paramObject2, paramObject1))
    {
      parami.A(paramInt, c.f());
      c0();
      paramInt = n;
    }
    else
    {
      if (parami.t(paramInt, c.i()) != c.i()) {
        parami.x(paramInt, true);
      }
      paramInt = 5;
    }
    return paramInt;
  }
  
  public final void v(long paramLong)
  {
    i0(w(paramLong));
  }
  
  public final void v0(long paramLong)
  {
    AtomicLongFieldUpdater localAtomicLongFieldUpdater = f;
    long l1;
    do
    {
      l1 = localAtomicLongFieldUpdater.get(this);
      if (l1 >= paramLong) {
        return;
      }
    } while (!f.compareAndSet(this, l1, paramLong));
  }
  
  public final i w(long paramLong)
  {
    i locali = t();
    if (T())
    {
      long l1 = V(locali);
      if (l1 != -1L) {
        y(l1);
      }
    }
    s(locali, paramLong);
    return locali;
  }
  
  public final void w0(long paramLong)
  {
    AtomicLongFieldUpdater localAtomicLongFieldUpdater = e;
    long l1;
    long l2;
    do
    {
      l1 = localAtomicLongFieldUpdater.get(this);
      l2 = 0xFFFFFFFFFFFFFFF & l1;
      if (l2 >= paramLong) {
        return;
      }
      l2 = c.b(l2, (int)(l1 >> 60));
    } while (!e.compareAndSet(this, l1, l2));
  }
  
  public final void x()
  {
    R();
  }
  
  public final void x0(long paramLong)
  {
    if (U()) {
      return;
    }
    while (D() <= paramLong) {}
    int n = c.g();
    for (int i1 = 0; i1 < n; i1++)
    {
      paramLong = D();
      if ((paramLong == (0x3FFFFFFFFFFFFFFF & h.get(this))) && (paramLong == D())) {
        return;
      }
    }
    AtomicLongFieldUpdater localAtomicLongFieldUpdater = h;
    do
    {
      paramLong = localAtomicLongFieldUpdater.get(this);
    } while (!localAtomicLongFieldUpdater.compareAndSet(this, paramLong, c.a(paramLong & 0x3FFFFFFFFFFFFFFF, true)));
    for (;;)
    {
      long l1 = D();
      localAtomicLongFieldUpdater = h;
      long l2 = localAtomicLongFieldUpdater.get(this);
      paramLong = l2 & 0x3FFFFFFFFFFFFFFF;
      if ((0x4000000000000000 & l2) != 0L) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if ((l1 == paramLong) && (l1 == D()))
      {
        do
        {
          paramLong = localAtomicLongFieldUpdater.get(this);
        } while (!localAtomicLongFieldUpdater.compareAndSet(this, paramLong, c.a(paramLong & 0x3FFFFFFFFFFFFFFF, false)));
        return;
      }
      if (i1 == 0) {
        localAtomicLongFieldUpdater.compareAndSet(this, l2, c.a(paramLong, true));
      }
    }
  }
  
  public final void y(long paramLong)
  {
    Object localObject1 = (i)j.get(this);
    for (;;)
    {
      Object localObject2 = f;
      long l1 = ((AtomicLongFieldUpdater)localObject2).get(this);
      if (paramLong < Math.max(b + l1, D())) {
        return;
      }
      if (((AtomicLongFieldUpdater)localObject2).compareAndSet(this, l1, l1 + 1L))
      {
        int n = c.b;
        long l2 = l1 / n;
        n = (int)(l1 % n);
        localObject2 = localObject1;
        if (q != l2)
        {
          localObject2 = B(l2, (i)localObject1);
          if (localObject2 == null) {}
        }
        else
        {
          Object localObject3 = r0((i)localObject2, n, l1, null);
          if (localObject3 == c.h())
          {
            localObject1 = localObject2;
            if (l1 < I())
            {
              ((u6.e)localObject2).b();
              localObject1 = localObject2;
            }
          }
          else
          {
            ((u6.e)localObject2).b();
            g6.l locall = c;
            localObject1 = localObject2;
            if (locall != null)
            {
              localObject1 = x.d(locall, localObject3, null, 2, null);
              if (localObject1 != null) {
                break;
              }
              localObject1 = localObject2;
            }
          }
        }
      }
    }
    throw ((Throwable)localObject1);
  }
  
  public final void z()
  {
    if (U()) {
      return;
    }
    Object localObject1 = (i)k.get(this);
    boolean bool;
    do
    {
      long l1;
      int n;
      Object localObject2;
      do
      {
        l1 = g.getAndIncrement(this);
        n = c.b;
        long l2 = l1 / n;
        long l3 = I();
        long l4 = q;
        if (l3 <= l1)
        {
          if ((l4 < l2) && (((u6.e)localObject1).e() != null)) {
            Z(l2, (i)localObject1);
          }
          L(this, 0L, 1, null);
          return;
        }
        localObject2 = localObject1;
        if (l4 == l2) {
          break;
        }
        localObject2 = A(l2, (i)localObject1, l1);
      } while (localObject2 == null);
      bool = p0((i)localObject2, (int)(l1 % n), l1);
      L(this, 0L, 1, null);
      localObject1 = localObject2;
    } while (!bool);
  }
  
  public final class a
    implements e, P0
  {
    public Object o = c.m();
    public p6.m p;
    
    public a() {}
    
    public void a(C paramC, int paramInt)
    {
      p6.m localm = p;
      if (localm != null) {
        localm.a(paramC, paramInt);
      }
    }
    
    public Object b(X5.d paramd)
    {
      b localb = b.this;
      Object localObject1 = (i)b.h().get(localb);
      if (localb.P()) {}
      for (boolean bool = g();; bool = true)
      {
        paramd = Z5.b.a(bool);
        break label182;
        long l1 = b.i().getAndIncrement(localb);
        int i = c.b;
        long l2 = l1 / i;
        i = (int)(l1 % i);
        if (q != l2)
        {
          localObject2 = b.e(localb, l2, (i)localObject1);
          if (localObject2 == null) {
            break;
          }
          localObject1 = localObject2;
        }
        Object localObject2 = b.p(localb, (i)localObject1, i, l1, null);
        if (localObject2 == c.r()) {
          break label184;
        }
        if (localObject2 == c.h())
        {
          if (l1 < localb.I()) {
            ((u6.e)localObject1).b();
          }
          break;
        }
        if (localObject2 == c.s()) {
          return f((i)localObject1, i, l1, paramd);
        }
        ((u6.e)localObject1).b();
        o = localObject2;
      }
      label182:
      return paramd;
      label184:
      throw new IllegalStateException("unreachable".toString());
    }
    
    public final Object f(i parami, int paramInt, long paramLong, X5.d paramd)
    {
      Object localObject1 = b.this;
      p6.m localm = p6.o.b(Y5.b.b(paramd));
      Object localObject2;
      try
      {
        d(this, localm);
        localObject2 = b.p((b)localObject1, parami, paramInt, paramLong, this);
        if (localObject2 == c.r()) {
          b.n((b)localObject1, this, parami, paramInt);
        }
      }
      finally
      {
        break label401;
      }
      Object localObject3 = c.h();
      Object localObject4 = null;
      Boolean localBoolean;
      if (localObject2 == localObject3)
      {
        if (paramLong < ((b)localObject1).I()) {
          parami.b();
        }
        localObject3 = (i)b.h().get(localObject1);
        for (;;)
        {
          if (((b)localObject1).P())
          {
            c(this);
            break label381;
          }
          paramLong = b.i().getAndIncrement(localObject1);
          paramInt = c.b;
          long l = paramLong / paramInt;
          paramInt = (int)(paramLong % paramInt);
          parami = (i)localObject3;
          if (q != l)
          {
            parami = b.e((b)localObject1, l, (i)localObject3);
            if (parami == null) {}
          }
          else
          {
            localObject2 = b.p((b)localObject1, parami, paramInt, paramLong, this);
            if (localObject2 == c.r())
            {
              b.n((b)localObject1, this, parami, paramInt);
              break label381;
            }
            if (localObject2 != c.h()) {
              break;
            }
            localObject3 = parami;
            if (paramLong < ((b)localObject1).I())
            {
              parami.b();
              localObject3 = parami;
            }
          }
        }
        if (localObject2 != c.s())
        {
          parami.b();
          e(this, localObject2);
          d(this, null);
          localBoolean = Z5.b.a(true);
          localObject1 = c;
          parami = (i)localObject4;
          localObject3 = localBoolean;
          if (localObject1 != null)
          {
            parami = x.a((g6.l)localObject1, localObject2, localm.getContext());
            localObject3 = localBoolean;
          }
        }
      }
      for (;;)
      {
        localm.j(localObject3, parami);
        break;
        parami = new java/lang/IllegalStateException;
        parami.<init>("unexpected".toString());
        throw parami;
        parami.b();
        e(this, localObject2);
        d(this, null);
        localBoolean = Z5.b.a(true);
        localObject1 = c;
        parami = (i)localObject4;
        localObject3 = localBoolean;
        if (localObject1 != null)
        {
          parami = x.a((g6.l)localObject1, localObject2, localm.getContext());
          localObject3 = localBoolean;
        }
      }
      label381:
      parami = localm.w();
      if (parami == Y5.b.c()) {
        h.c(paramd);
      }
      return parami;
      label401:
      localm.I();
      throw parami;
    }
    
    public final boolean g()
    {
      o = c.z();
      Throwable localThrowable = E();
      if (localThrowable == null) {
        return false;
      }
      throw E.a(localThrowable);
    }
    
    public final void h()
    {
      p6.m localm = p;
      Intrinsics.b(localm);
      p = null;
      o = c.z();
      Throwable localThrowable = E();
      if (localThrowable == null) {
        localObject = n.o;
      }
      for (Object localObject = Boolean.FALSE;; localObject = V5.o.a(localThrowable))
      {
        localm.resumeWith(n.a(localObject));
        break;
        localObject = n.o;
      }
    }
    
    public final boolean i(Object paramObject)
    {
      p6.m localm = p;
      Intrinsics.b(localm);
      g6.l locall1 = null;
      p = null;
      o = paramObject;
      Boolean localBoolean = Boolean.TRUE;
      g6.l locall2 = c;
      if (locall2 != null) {
        locall1 = x.a(locall2, paramObject, localm.getContext());
      }
      return c.u(localm, localBoolean, locall1);
    }
    
    public final void j()
    {
      p6.m localm = p;
      Intrinsics.b(localm);
      p = null;
      o = c.z();
      Object localObject = E();
      if (localObject == null) {
        localObject = n.o;
      }
      for (localObject = Boolean.FALSE;; localObject = V5.o.a((Throwable)localObject))
      {
        localm.resumeWith(n.a(localObject));
        break;
        n.a locala = n.o;
      }
    }
    
    public Object next()
    {
      Object localObject = o;
      if (localObject != c.m())
      {
        o = c.m();
        if (localObject != c.z()) {
          return localObject;
        }
        throw E.a(b.g(b.this));
      }
      throw new IllegalStateException("`hasNext()` has not been invoked".toString());
    }
  }
  
  public static final class b
    extends kotlin.jvm.internal.l
    implements q
  {
    public b(b paramb)
    {
      super();
    }
    
    public final g6.l a(a parama, Object paramObject1, Object paramObject2)
    {
      return new a(paramObject2, o, parama);
    }
    
    public static final class a
      extends kotlin.jvm.internal.l
      implements g6.l
    {
      public a(Object paramObject, b paramb, a parama)
      {
        super();
      }
      
      public final void a(Throwable paramThrowable)
      {
        if (o == c.z()) {
          return;
        }
        paramThrowable = p.c;
        throw null;
      }
    }
  }
}

/* Location:
 * Qualified Name:     r6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */