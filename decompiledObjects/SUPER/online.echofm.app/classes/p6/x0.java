package p6;

import V5.a;
import X5.d;
import X5.g;
import X5.g.b;
import X5.g.c;
import Z5.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import u6.q;
import u6.q.a;
import u6.y;

public class x0
  implements q0, t, F0
{
  public static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_state");
  public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_parentHandle");
  private volatile Object _parentHandle;
  private volatile Object _state;
  
  public x0(boolean paramBoolean)
  {
    Z localZ;
    if (paramBoolean) {
      localZ = y0.c();
    } else {
      localZ = y0.d();
    }
    _state = localZ;
  }
  
  public final boolean A(final Object paramObject, C0 paramC0, w0 paramw0)
  {
    paramObject = new d(paramw0, this, paramObject);
    int i;
    do
    {
      i = paramC0.p().u(paramw0, paramC0, (q.a)paramObject);
      bool = true;
      if (i == 1) {
        break;
      }
    } while (i != 2);
    boolean bool = false;
    return bool;
  }
  
  public final String A0()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(l0());
    localStringBuilder.append('{');
    localStringBuilder.append(x0(b0()));
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final boolean B0(l0 paraml0, Object paramObject)
  {
    if (!u.b.a(o, this, paraml0, y0.g(paramObject))) {
      return false;
    }
    p0(null);
    q0(paramObject);
    P(paraml0, paramObject);
    return true;
  }
  
  public final boolean C0(l0 paraml0, Throwable paramThrowable)
  {
    C0 localC0 = Z(paraml0);
    if (localC0 == null) {
      return false;
    }
    c localc = new c(localC0, false, paramThrowable);
    if (!u.b.a(o, this, paraml0, localc)) {
      return false;
    }
    n0(localC0, paramThrowable);
    return true;
  }
  
  public final Object D0(Object paramObject1, Object paramObject2)
  {
    if (!(paramObject1 instanceof l0)) {
      return y0.a();
    }
    if ((((paramObject1 instanceof Z)) || ((paramObject1 instanceof w0))) && (!(paramObject1 instanceof s)) && (!(paramObject2 instanceof z)))
    {
      if (B0((l0)paramObject1, paramObject2)) {
        return paramObject2;
      }
      return y0.b();
    }
    return E0((l0)paramObject1, paramObject2);
  }
  
  public final void E(Throwable paramThrowable, List paramList)
  {
    if (paramList.size() <= 1) {
      return;
    }
    Set localSet = Collections.newSetFromMap(new IdentityHashMap(paramList.size()));
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Throwable localThrowable = (Throwable)paramList.next();
      if ((localThrowable != paramThrowable) && (localThrowable != paramThrowable) && (!(localThrowable instanceof CancellationException)) && (localSet.add(localThrowable))) {
        a.a(paramThrowable, localThrowable);
      }
    }
  }
  
  public final Object E0(l0 paraml0, Object paramObject)
  {
    C0 localC0 = Z(paraml0);
    if (localC0 == null) {
      return y0.b();
    }
    boolean bool = paraml0 instanceof c;
    V5.t localt = null;
    Object localObject1;
    if (bool) {
      localObject1 = (c)paraml0;
    } else {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new c(localC0, false, null);
    }
    u localu = new u();
    label251:
    try
    {
      if (((c)localObject2).h())
      {
        paraml0 = y0.a();
        return paraml0;
      }
    }
    finally
    {
      break label251;
      ((c)localObject2).k(true);
      if ((localObject2 != paraml0) && (!u.b.a(o, this, paraml0, localObject2)))
      {
        paraml0 = y0.b();
        return paraml0;
      }
      bool = ((c)localObject2).f();
      if ((paramObject instanceof z)) {
        localObject1 = (z)paramObject;
      } else {
        localObject1 = null;
      }
      if (localObject1 != null) {
        ((c)localObject2).b(a);
      }
      Throwable localThrowable = ((c)localObject2).e();
      localObject1 = localt;
      if ((true ^ bool)) {
        localObject1 = localThrowable;
      }
      o = localObject1;
      localt = V5.t.a;
      if (localObject1 != null) {
        n0(localC0, (Throwable)localObject1);
      }
      paraml0 = T(paraml0);
      if ((paraml0 != null) && (F0((c)localObject2, paraml0, paramObject))) {
        return y0.b;
      }
      return S((c)localObject2, paramObject);
    }
  }
  
  public void F(Object paramObject) {}
  
  public final boolean F0(c paramc, s params, Object paramObject)
  {
    s locals;
    do
    {
      if (q0.a.d(s, false, false, new b(this, paramc, params, paramObject), 1, null) != D0.o) {
        return true;
      }
      locals = m0(params);
      params = locals;
    } while (locals != null);
    return false;
  }
  
  public final Object G(d paramd)
  {
    Object localObject;
    do
    {
      localObject = b0();
      if (!(localObject instanceof l0))
      {
        if (!(localObject instanceof z)) {
          return y0.h(localObject);
        }
        throw a;
      }
    } while (w0(localObject) < 0);
    return H(paramd);
  }
  
  public final Object H(d paramd)
  {
    Object localObject = new a(Y5.b.b(paramd), this);
    ((m)localObject).z();
    o.a((l)localObject, e(new G0((m)localObject)));
    localObject = ((m)localObject).w();
    if (localObject == Y5.b.c()) {
      h.c(paramd);
    }
    return localObject;
  }
  
  public final boolean I(Throwable paramThrowable)
  {
    return J(paramThrowable);
  }
  
  public final boolean J(Object paramObject)
  {
    Object localObject1 = y0.a();
    boolean bool1 = Y();
    boolean bool2 = true;
    if (bool1)
    {
      localObject2 = L(paramObject);
      localObject1 = localObject2;
      if (localObject2 == y0.b) {
        return true;
      }
    }
    Object localObject2 = localObject1;
    if (localObject1 == y0.a()) {
      localObject2 = h0(paramObject);
    }
    if ((localObject2 != y0.a()) && (localObject2 != y0.b)) {
      if (localObject2 == y0.f()) {
        bool2 = false;
      } else {
        F(localObject2);
      }
    }
    return bool2;
  }
  
  public void K(Throwable paramThrowable)
  {
    J(paramThrowable);
  }
  
  public final Object L(Object paramObject)
  {
    Object localObject;
    do
    {
      localObject = b0();
      if ((!(localObject instanceof l0)) || (((localObject instanceof c)) && (((c)localObject).h()))) {
        break;
      }
      localObject = D0(localObject, new z(R(paramObject), false, 2, null));
    } while (localObject == y0.b());
    return localObject;
    return y0.a();
  }
  
  public final boolean M(Throwable paramThrowable)
  {
    boolean bool1 = g0();
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    boolean bool3 = paramThrowable instanceof CancellationException;
    r localr = a0();
    if ((localr != null) && (localr != D0.o))
    {
      bool1 = bool2;
      if (!localr.d(paramThrowable)) {
        if (bool3) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
      return bool1;
    }
    return bool3;
  }
  
  public String N()
  {
    return "Job was cancelled";
  }
  
  public boolean O(Throwable paramThrowable)
  {
    boolean bool1 = paramThrowable instanceof CancellationException;
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    if ((!J(paramThrowable)) || (!X())) {
      bool2 = false;
    }
    return bool2;
  }
  
  /* Error */
  public final void P(l0 paraml0, Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 372	p6/x0:a0	()Lp6/r;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull +16 -> 22
    //   9: aload_3
    //   10: invokeinterface 386 1 0
    //   15: aload_0
    //   16: getstatic 286	p6/D0:o	Lp6/D0;
    //   19: invokevirtual 390	p6/x0:v0	(Lp6/r;)V
    //   22: aload_2
    //   23: instanceof 171
    //   26: istore 4
    //   28: aconst_null
    //   29: astore 5
    //   31: iload 4
    //   33: ifeq +11 -> 44
    //   36: aload_2
    //   37: checkcast 171	p6/z
    //   40: astore_3
    //   41: goto +5 -> 46
    //   44: aconst_null
    //   45: astore_3
    //   46: aload 5
    //   48: astore_2
    //   49: aload_3
    //   50: ifnull +8 -> 58
    //   53: aload_3
    //   54: getfield 241	p6/z:a	Ljava/lang/Throwable;
    //   57: astore_2
    //   58: aload_1
    //   59: instanceof 167
    //   62: ifeq +70 -> 132
    //   65: aload_1
    //   66: checkcast 167	p6/w0
    //   69: aload_2
    //   70: invokevirtual 395	p6/B:v	(Ljava/lang/Throwable;)V
    //   73: goto +76 -> 149
    //   76: astore_2
    //   77: new 98	java/lang/StringBuilder
    //   80: dup
    //   81: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   84: astore_3
    //   85: aload_3
    //   86: ldc_w 397
    //   89: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: pop
    //   93: aload_3
    //   94: aload_1
    //   95: invokevirtual 400	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: aload_3
    //   100: ldc_w 402
    //   103: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload_3
    //   108: aload_0
    //   109: invokevirtual 400	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   112: pop
    //   113: aload_0
    //   114: new 404	p6/C
    //   117: dup
    //   118: aload_3
    //   119: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: aload_2
    //   123: invokespecial 407	p6/C:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   126: invokevirtual 410	p6/x0:d0	(Ljava/lang/Throwable;)V
    //   129: goto +20 -> 149
    //   132: aload_1
    //   133: invokeinterface 413 1 0
    //   138: astore_1
    //   139: aload_1
    //   140: ifnull +9 -> 149
    //   143: aload_0
    //   144: aload_1
    //   145: aload_2
    //   146: invokevirtual 416	p6/x0:o0	(Lp6/C0;Ljava/lang/Throwable;)V
    //   149: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	150	0	this	x0
    //   0	150	1	paraml0	l0
    //   0	150	2	paramObject	Object
    //   4	115	3	localObject1	Object
    //   26	6	4	bool	boolean
    //   29	18	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   65	73	76	finally
  }
  
  public final void Q(c paramc, s params, Object paramObject)
  {
    params = m0(params);
    if ((params != null) && (F0(paramc, params, paramObject))) {
      return;
    }
    F(S(paramc, paramObject));
  }
  
  public final Throwable R(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof Throwable)))
    {
      Throwable localThrowable = (Throwable)paramObject;
      paramObject = localThrowable;
      if (localThrowable == null) {
        paramObject = new r0(y(this), null, this);
      }
    }
    else
    {
      Intrinsics.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
      paramObject = ((F0)paramObject).q();
    }
    return (Throwable)paramObject;
  }
  
  public final Object S(c paramc, Object paramObject)
  {
    Object localObject;
    if ((paramObject instanceof z)) {
      localObject = (z)paramObject;
    } else {
      localObject = null;
    }
    if (localObject != null) {
      localObject = a;
    } else {
      localObject = null;
    }
    boolean bool;
    Throwable localThrowable;
    try
    {
      bool = paramc.f();
      List localList = paramc.j((Throwable)localObject);
      localThrowable = W(paramc, localList);
      if (localThrowable != null) {
        E(localThrowable, localList);
      }
    }
    finally
    {
      break label182;
    }
    if ((localThrowable != null) && (localThrowable != localObject)) {
      paramObject = new z(localThrowable, false, 2, null);
    }
    if ((localThrowable != null) && ((M(localThrowable)) || (c0(localThrowable))))
    {
      Intrinsics.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
      ((z)paramObject).b();
    }
    if (!bool) {
      p0(localThrowable);
    }
    q0(paramObject);
    u.b.a(o, this, paramc, y0.g(paramObject));
    P(paramc, paramObject);
    return paramObject;
    label182:
    throw ((Throwable)paramObject);
  }
  
  public final s T(l0 paraml0)
  {
    boolean bool = paraml0 instanceof s;
    Object localObject1 = null;
    Object localObject2;
    if (bool) {
      localObject2 = (s)paraml0;
    } else {
      localObject2 = null;
    }
    if (localObject2 == null)
    {
      localObject2 = paraml0.g();
      paraml0 = (l0)localObject1;
      if (localObject2 != null) {
        paraml0 = m0((q)localObject2);
      }
    }
    else
    {
      paraml0 = (l0)localObject2;
    }
    return paraml0;
  }
  
  public final Object U()
  {
    Object localObject = b0();
    if ((localObject instanceof l0 ^ true))
    {
      if (!(localObject instanceof z)) {
        return y0.h(localObject);
      }
      throw a;
    }
    throw new IllegalStateException("This job has not completed yet".toString());
  }
  
  public final Throwable V(Object paramObject)
  {
    boolean bool = paramObject instanceof z;
    Throwable localThrowable = null;
    if (bool) {
      paramObject = (z)paramObject;
    } else {
      paramObject = null;
    }
    if (paramObject != null) {
      localThrowable = a;
    }
    return localThrowable;
  }
  
  public final Throwable W(c paramc, List paramList)
  {
    boolean bool = paramList.isEmpty();
    Object localObject = null;
    if (bool)
    {
      if (paramc.f()) {
        return new r0(y(this), null, this);
      }
      return null;
    }
    Iterator localIterator = ((Iterable)paramList).iterator();
    do
    {
      paramc = (c)localObject;
      if (!localIterator.hasNext()) {
        break;
      }
      paramc = localIterator.next();
    } while (!((Throwable)paramc instanceof CancellationException ^ true));
    paramc = (Throwable)paramc;
    if (paramc != null) {
      return paramc;
    }
    return (Throwable)paramList.get(0);
  }
  
  public boolean X()
  {
    return true;
  }
  
  public boolean Y()
  {
    return false;
  }
  
  public final C0 Z(l0 paraml0)
  {
    C0 localC0 = paraml0.g();
    Object localObject = localC0;
    if (localC0 == null) {
      if ((paraml0 instanceof Z))
      {
        localObject = new C0();
      }
      else if ((paraml0 instanceof w0))
      {
        t0((w0)paraml0);
        localObject = null;
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("State should have list: ");
        ((StringBuilder)localObject).append(paraml0);
        throw new IllegalStateException(((StringBuilder)localObject).toString().toString());
      }
    }
    return (C0)localObject;
  }
  
  public boolean a()
  {
    Object localObject = b0();
    boolean bool;
    if (((localObject instanceof l0)) && (((l0)localObject).a())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final r a0()
  {
    return (r)p.get(this);
  }
  
  public g.b b(g.c paramc)
  {
    return q0.a.c(this, paramc);
  }
  
  public final Object b0()
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = o;
    for (;;)
    {
      Object localObject = localAtomicReferenceFieldUpdater.get(this);
      if (!(localObject instanceof y)) {
        return localObject;
      }
      ((y)localObject).a(this);
    }
  }
  
  public boolean c0(Throwable paramThrowable)
  {
    return false;
  }
  
  public void d0(Throwable paramThrowable)
  {
    throw paramThrowable;
  }
  
  public final X e(g6.l paraml)
  {
    return v(false, true, paraml);
  }
  
  public final void e0(q0 paramq0)
  {
    if (paramq0 == null)
    {
      v0(D0.o);
      return;
    }
    paramq0.start();
    paramq0 = paramq0.r(this);
    v0(paramq0);
    if (f0())
    {
      paramq0.b();
      v0(D0.o);
    }
  }
  
  public final boolean f0()
  {
    return b0() instanceof l0 ^ true;
  }
  
  public boolean g0()
  {
    return false;
  }
  
  public final g.c getKey()
  {
    return q0.n;
  }
  
  public q0 getParent()
  {
    Object localObject = a0();
    if (localObject != null) {
      localObject = ((r)localObject).getParent();
    } else {
      localObject = null;
    }
    return (q0)localObject;
  }
  
  public final Object h0(Object paramObject)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3;
    label132:
    Object localObject5;
    do
    {
      Object localObject4;
      do
      {
        localObject3 = b0();
        if ((localObject3 instanceof c)) {
          try
          {
            if (((c)localObject3).i())
            {
              paramObject = y0.f();
              return paramObject;
            }
          }
          finally
          {
            break label132;
            boolean bool = ((c)localObject3).f();
            if ((paramObject != null) || (!bool))
            {
              localObject4 = localObject2;
              if (localObject2 == null) {
                localObject4 = R(paramObject);
              }
              ((c)localObject3).b((Throwable)localObject4);
            }
            localObject2 = ((c)localObject3).e();
            paramObject = localObject1;
            if ((bool ^ true)) {
              paramObject = localObject2;
            }
            if (paramObject != null) {
              n0(((c)localObject3).g(), (Throwable)paramObject);
            }
            return y0.a();
          }
        }
        if (!(localObject3 instanceof l0)) {
          break label274;
        }
        localObject4 = localObject2;
        if (localObject2 == null) {
          localObject4 = R(paramObject);
        }
        localObject5 = (l0)localObject3;
        if (!((l0)localObject5).a()) {
          break;
        }
        localObject2 = localObject4;
      } while (!C0((l0)localObject5, (Throwable)localObject4));
      return y0.a();
      localObject5 = D0(localObject3, new z((Throwable)localObject4, false, 2, null));
      if (localObject5 == y0.a()) {
        break;
      }
      localObject2 = localObject4;
    } while (localObject5 == y0.b());
    return localObject5;
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("Cannot happen in ");
    ((StringBuilder)paramObject).append(localObject3);
    throw new IllegalStateException(((StringBuilder)paramObject).toString().toString());
    label274:
    return y0.f();
  }
  
  public final boolean i0(Object paramObject)
  {
    Object localObject;
    do
    {
      localObject = D0(b0(), paramObject);
      if (localObject == y0.a()) {
        return false;
      }
      if (localObject == y0.b) {
        return true;
      }
    } while (localObject == y0.b());
    F(localObject);
    return true;
  }
  
  public final Object j0(Object paramObject)
  {
    do
    {
      localObject = D0(b0(), paramObject);
      if (localObject == y0.a()) {
        break;
      }
    } while (localObject == y0.b());
    return localObject;
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Job ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" is already complete or completing, but is being completed with ");
    ((StringBuilder)localObject).append(paramObject);
    throw new IllegalStateException(((StringBuilder)localObject).toString(), V(paramObject));
  }
  
  public g k(g paramg)
  {
    return q0.a.f(this, paramg);
  }
  
  public final w0 k0(g6.l paraml, boolean paramBoolean)
  {
    Object localObject = null;
    s0 locals0 = null;
    if (paramBoolean)
    {
      if ((paraml instanceof s0)) {
        locals0 = (s0)paraml;
      }
      localObject = locals0;
      if (locals0 == null) {
        localObject = new o0(paraml);
      }
    }
    else
    {
      if ((paraml instanceof w0)) {
        localObject = (w0)paraml;
      }
      if (localObject == null) {
        localObject = new p0(paraml);
      }
    }
    ((w0)localObject).x(this);
    return (w0)localObject;
  }
  
  public String l0()
  {
    return M.a(this);
  }
  
  public final s m0(q paramq)
  {
    q localq;
    for (;;)
    {
      localq = paramq;
      if (!paramq.q()) {
        break;
      }
      paramq = paramq.p();
    }
    do
    {
      do
      {
        paramq = localq.o();
        localq = paramq;
      } while (paramq.q());
      if ((paramq instanceof s)) {
        return (s)paramq;
      }
      localq = paramq;
    } while (!(paramq instanceof C0));
    return null;
  }
  
  /* Error */
  public final void n0(C0 paramC0, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: invokevirtual 135	p6/x0:p0	(Ljava/lang/Throwable;)V
    //   5: aload_1
    //   6: invokevirtual 564	u6/q:n	()Ljava/lang/Object;
    //   9: astore_3
    //   10: aload_3
    //   11: ldc_w 566
    //   14: invokestatic 430	kotlin/jvm/internal/Intrinsics:c	(Ljava/lang/Object;Ljava/lang/String;)V
    //   17: aload_3
    //   18: checkcast 88	u6/q
    //   21: astore_3
    //   22: aconst_null
    //   23: astore 4
    //   25: aload_3
    //   26: aload_1
    //   27: invokestatic 569	kotlin/jvm/internal/Intrinsics:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   30: ifne +129 -> 159
    //   33: aload 4
    //   35: astore 5
    //   37: aload_3
    //   38: instanceof 542
    //   41: ifeq +106 -> 147
    //   44: aload_3
    //   45: checkcast 167	p6/w0
    //   48: astore 6
    //   50: aload 6
    //   52: aload_2
    //   53: invokevirtual 395	p6/B:v	(Ljava/lang/Throwable;)V
    //   56: aload 4
    //   58: astore 5
    //   60: goto +87 -> 147
    //   63: astore 5
    //   65: aload 4
    //   67: ifnull +17 -> 84
    //   70: aload 4
    //   72: aload 5
    //   74: invokestatic 226	V5/a:a	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   77: aload 4
    //   79: astore 5
    //   81: goto +66 -> 147
    //   84: new 98	java/lang/StringBuilder
    //   87: dup
    //   88: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   91: astore 4
    //   93: aload 4
    //   95: ldc_w 397
    //   98: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload 4
    //   104: aload 6
    //   106: invokevirtual 400	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   109: pop
    //   110: aload 4
    //   112: ldc_w 402
    //   115: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: pop
    //   119: aload 4
    //   121: aload_0
    //   122: invokevirtual 400	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: new 404	p6/C
    //   129: dup
    //   130: aload 4
    //   132: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: aload 5
    //   137: invokespecial 407	p6/C:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   140: astore 5
    //   142: getstatic 254	V5/t:a	LV5/t;
    //   145: astore 4
    //   147: aload_3
    //   148: invokevirtual 562	u6/q:o	()Lu6/q;
    //   151: astore_3
    //   152: aload 5
    //   154: astore 4
    //   156: goto -131 -> 25
    //   159: aload 4
    //   161: ifnull +9 -> 170
    //   164: aload_0
    //   165: aload 4
    //   167: invokevirtual 410	p6/x0:d0	(Ljava/lang/Throwable;)V
    //   170: aload_0
    //   171: aload_2
    //   172: invokevirtual 446	p6/x0:M	(Ljava/lang/Throwable;)Z
    //   175: pop
    //   176: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	this	x0
    //   0	177	1	paramC0	C0
    //   0	177	2	paramThrowable	Throwable
    //   9	143	3	localObject1	Object
    //   23	143	4	localObject2	Object
    //   35	24	5	localObject3	Object
    //   63	10	5	localThrowable	Throwable
    //   79	74	5	localObject4	Object
    //   48	57	6	localw0	w0
    // Exception table:
    //   from	to	target	type
    //   50	56	63	finally
  }
  
  /* Error */
  public final void o0(C0 paramC0, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 564	u6/q:n	()Ljava/lang/Object;
    //   4: astore_3
    //   5: aload_3
    //   6: ldc_w 566
    //   9: invokestatic 430	kotlin/jvm/internal/Intrinsics:c	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_3
    //   13: checkcast 88	u6/q
    //   16: astore_3
    //   17: aconst_null
    //   18: astore 4
    //   20: aload_3
    //   21: aload_1
    //   22: invokestatic 569	kotlin/jvm/internal/Intrinsics:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   25: ifne +129 -> 154
    //   28: aload 4
    //   30: astore 5
    //   32: aload_3
    //   33: instanceof 167
    //   36: ifeq +106 -> 142
    //   39: aload_3
    //   40: checkcast 167	p6/w0
    //   43: astore 6
    //   45: aload 6
    //   47: aload_2
    //   48: invokevirtual 395	p6/B:v	(Ljava/lang/Throwable;)V
    //   51: aload 4
    //   53: astore 5
    //   55: goto +87 -> 142
    //   58: astore 5
    //   60: aload 4
    //   62: ifnull +17 -> 79
    //   65: aload 4
    //   67: aload 5
    //   69: invokestatic 226	V5/a:a	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   72: aload 4
    //   74: astore 5
    //   76: goto +66 -> 142
    //   79: new 98	java/lang/StringBuilder
    //   82: dup
    //   83: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   86: astore 4
    //   88: aload 4
    //   90: ldc_w 397
    //   93: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload 4
    //   99: aload 6
    //   101: invokevirtual 400	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: aload 4
    //   107: ldc_w 402
    //   110: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload 4
    //   116: aload_0
    //   117: invokevirtual 400	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: new 404	p6/C
    //   124: dup
    //   125: aload 4
    //   127: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   130: aload 5
    //   132: invokespecial 407	p6/C:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   135: astore 5
    //   137: getstatic 254	V5/t:a	LV5/t;
    //   140: astore 4
    //   142: aload_3
    //   143: invokevirtual 562	u6/q:o	()Lu6/q;
    //   146: astore_3
    //   147: aload 5
    //   149: astore 4
    //   151: goto -131 -> 20
    //   154: aload 4
    //   156: ifnull +9 -> 165
    //   159: aload_0
    //   160: aload 4
    //   162: invokevirtual 410	p6/x0:d0	(Ljava/lang/Throwable;)V
    //   165: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	this	x0
    //   0	166	1	paramC0	C0
    //   0	166	2	paramThrowable	Throwable
    //   4	143	3	localObject1	Object
    //   18	143	4	localObject2	Object
    //   30	24	5	localObject3	Object
    //   58	10	5	localThrowable	Throwable
    //   74	74	5	localObject4	Object
    //   43	57	6	localw0	w0
    // Exception table:
    //   from	to	target	type
    //   45	51	58	finally
  }
  
  public void p0(Throwable paramThrowable) {}
  
  public CancellationException q()
  {
    Object localObject1 = b0();
    boolean bool = localObject1 instanceof c;
    Object localObject2 = null;
    if (bool)
    {
      localObject3 = ((c)localObject1).e();
    }
    else if ((localObject1 instanceof z))
    {
      localObject3 = a;
    }
    else
    {
      if ((localObject1 instanceof l0)) {
        break label123;
      }
      localObject3 = null;
    }
    if ((localObject3 instanceof CancellationException)) {
      localObject2 = (CancellationException)localObject3;
    }
    Object localObject4 = localObject2;
    if (localObject2 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Parent job is ");
      ((StringBuilder)localObject2).append(x0(localObject1));
      localObject4 = new r0(((StringBuilder)localObject2).toString(), (Throwable)localObject3, this);
    }
    return (CancellationException)localObject4;
    label123:
    Object localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append("Cannot be cancelling child in this state: ");
    ((StringBuilder)localObject3).append(localObject1);
    throw new IllegalStateException(((StringBuilder)localObject3).toString().toString());
  }
  
  public void q0(Object paramObject) {}
  
  public final r r(t paramt)
  {
    paramt = q0.a.d(this, true, false, new s(paramt), 2, null);
    Intrinsics.c(paramt, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    return (r)paramt;
  }
  
  public void r0() {}
  
  public final CancellationException s()
  {
    Object localObject = b0();
    if ((localObject instanceof c))
    {
      Throwable localThrowable = ((c)localObject).e();
      if (localThrowable != null)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(M.a(this));
        ((StringBuilder)localObject).append(" is cancelling");
        localObject = y0(localThrowable, ((StringBuilder)localObject).toString());
        if (localObject != null) {}
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Job is still new or active: ");
        ((StringBuilder)localObject).append(this);
        throw new IllegalStateException(((StringBuilder)localObject).toString().toString());
      }
    }
    else
    {
      if ((localObject instanceof l0)) {
        break label176;
      }
      if ((localObject instanceof z))
      {
        localObject = z0(this, a, null, 1, null);
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(M.a(this));
        ((StringBuilder)localObject).append(" has completed normally");
        localObject = new r0(((StringBuilder)localObject).toString(), null, this);
      }
    }
    return (CancellationException)localObject;
    label176:
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Job is still new or active: ");
    ((StringBuilder)localObject).append(this);
    throw new IllegalStateException(((StringBuilder)localObject).toString().toString());
  }
  
  public final void s0(Z paramZ)
  {
    Object localObject = new C0();
    if (!paramZ.a()) {
      localObject = new k0((C0)localObject);
    }
    u.b.a(o, this, paramZ, localObject);
  }
  
  public final boolean start()
  {
    int i;
    do
    {
      i = w0(b0());
      if (i == 0) {
        break;
      }
    } while (i != 1);
    return true;
    return false;
  }
  
  public final void t(F0 paramF0)
  {
    J(paramF0);
  }
  
  public final void t0(w0 paramw0)
  {
    paramw0.j(new C0());
    q localq = paramw0.o();
    u.b.a(o, this, paramw0, localq);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(A0());
    localStringBuilder.append('@');
    localStringBuilder.append(M.b(this));
    return localStringBuilder.toString();
  }
  
  public Object u(Object paramObject, g6.p paramp)
  {
    return q0.a.b(this, paramObject, paramp);
  }
  
  public final void u0(w0 paramw0)
  {
    Object localObject;
    do
    {
      localObject = b0();
      if (!(localObject instanceof w0)) {
        break;
      }
      if (localObject != paramw0) {
        return;
      }
    } while (!u.b.a(o, this, localObject, y0.c()));
    return;
    if (((localObject instanceof l0)) && (((l0)localObject).g() != null)) {
      paramw0.r();
    }
  }
  
  public final X v(boolean paramBoolean1, boolean paramBoolean2, g6.l paraml)
  {
    w0 localw0 = k0(paraml, paramBoolean1);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    C0 localC0;
    label240:
    label251:
    label256:
    do
    {
      Object localObject5;
      for (;;)
      {
        localObject1 = b0();
        if ((localObject1 instanceof Z))
        {
          localObject2 = (Z)localObject1;
          if (((Z)localObject2).a())
          {
            if (u.b.a(o, this, localObject1, localw0)) {
              return localw0;
            }
          }
          else {
            s0((Z)localObject2);
          }
        }
        else
        {
          boolean bool = localObject1 instanceof l0;
          localObject3 = null;
          Object localObject4 = null;
          if (!bool) {
            break label293;
          }
          localC0 = ((l0)localObject1).g();
          if (localC0 == null)
          {
            Intrinsics.c(localObject1, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
            t0((w0)localObject1);
          }
          else
          {
            localObject3 = D0.o;
            localObject5 = localObject4;
            localObject2 = localObject3;
            if (!paramBoolean1) {
              break label256;
            }
            localObject5 = localObject4;
            localObject2 = localObject3;
            if (!(localObject1 instanceof c)) {
              break label256;
            }
            try
            {
              localObject5 = ((c)localObject1).e();
              if (localObject5 != null)
              {
                localObject2 = localObject3;
                if (!(paraml instanceof s)) {
                  break label240;
                }
                localObject2 = localObject3;
                if (((c)localObject1).h()) {
                  break label240;
                }
              }
            }
            finally
            {
              break label251;
            }
            bool = A(localObject1, localC0, localw0);
            if (bool) {
              break;
            }
          }
        }
      }
      if (localObject5 == null) {
        return localw0;
      }
      localObject2 = localw0;
      localObject3 = V5.t.a;
      break label256;
      throw paraml;
      if (localObject5 != null)
      {
        if (paramBoolean2) {
          paraml.invoke(localObject5);
        }
        return (X)localObject2;
      }
    } while (!A(localObject1, localC0, localw0));
    return localw0;
    label293:
    if (paramBoolean2)
    {
      if ((localObject1 instanceof z)) {
        localObject2 = (z)localObject1;
      } else {
        localObject2 = null;
      }
      if (localObject2 != null) {
        localObject3 = a;
      }
      paraml.invoke(localObject3);
    }
    return D0.o;
  }
  
  public final void v0(r paramr)
  {
    p.set(this, paramr);
  }
  
  public void w(CancellationException paramCancellationException)
  {
    Object localObject = paramCancellationException;
    if (paramCancellationException == null) {
      localObject = new r0(y(this), null, this);
    }
    K((Throwable)localObject);
  }
  
  public final int w0(Object paramObject)
  {
    if ((paramObject instanceof Z))
    {
      if (((Z)paramObject).a()) {
        return 0;
      }
      if (!u.b.a(o, this, paramObject, y0.c())) {
        return -1;
      }
      r0();
      return 1;
    }
    if ((paramObject instanceof k0))
    {
      if (!u.b.a(o, this, paramObject, ((k0)paramObject).g())) {
        return -1;
      }
      r0();
      return 1;
    }
    return 0;
  }
  
  public g x(g.c paramc)
  {
    return q0.a.e(this, paramc);
  }
  
  public final String x0(Object paramObject)
  {
    boolean bool = paramObject instanceof c;
    String str = "Active";
    if (bool)
    {
      c localc = (c)paramObject;
      if (localc.f())
      {
        paramObject = "Cancelling";
      }
      else
      {
        paramObject = str;
        if (localc.h()) {
          paramObject = "Completing";
        }
      }
    }
    else if ((paramObject instanceof l0))
    {
      if (((l0)paramObject).a()) {
        paramObject = str;
      } else {
        paramObject = "New";
      }
    }
    else if ((paramObject instanceof z))
    {
      paramObject = "Cancelled";
    }
    else
    {
      paramObject = "Completed";
    }
    return (String)paramObject;
  }
  
  public final CancellationException y0(Throwable paramThrowable, String paramString)
  {
    Object localObject1;
    if ((paramThrowable instanceof CancellationException)) {
      localObject1 = (CancellationException)paramThrowable;
    } else {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject1 = paramString;
      if (paramString == null) {
        localObject1 = y(this);
      }
      localObject2 = new r0((String)localObject1, paramThrowable, this);
    }
    return (CancellationException)localObject2;
  }
  
  public static final class a
    extends m
  {
    public final x0 w;
    
    public a(d paramd, x0 paramx0)
    {
      super(1);
      w = paramx0;
    }
    
    public String G()
    {
      return "AwaitContinuation";
    }
    
    public Throwable u(q0 paramq0)
    {
      Object localObject = w.b0();
      if ((localObject instanceof x0.c))
      {
        Throwable localThrowable = ((x0.c)localObject).e();
        if (localThrowable != null) {
          return localThrowable;
        }
      }
      if ((localObject instanceof z)) {
        return a;
      }
      return paramq0.s();
    }
  }
  
  public static final class b
    extends w0
  {
    public final x0 s;
    public final x0.c t;
    public final s u;
    public final Object v;
    
    public b(x0 paramx0, x0.c paramc, s params, Object paramObject)
    {
      s = paramx0;
      t = paramc;
      u = params;
      v = paramObject;
    }
    
    public void v(Throwable paramThrowable)
    {
      x0.z(s, t, u, v);
    }
  }
  
  public static final class c
    implements l0
  {
    public static final AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");
    public static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");
    public static final AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting;
    private volatile Object _rootCause;
    public final C0 o;
    
    public c(C0 paramC0, boolean paramBoolean, Throwable paramThrowable)
    {
      o = paramC0;
      _isCompleting = paramBoolean;
      _rootCause = paramThrowable;
    }
    
    public boolean a()
    {
      boolean bool;
      if (e() == null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final void b(Throwable paramThrowable)
    {
      Object localObject = e();
      if (localObject == null)
      {
        m(paramThrowable);
        return;
      }
      if (paramThrowable == localObject) {
        return;
      }
      localObject = d();
      if (localObject == null)
      {
        l(paramThrowable);
      }
      else if ((localObject instanceof Throwable))
      {
        if (paramThrowable == localObject) {
          return;
        }
        ArrayList localArrayList = c();
        localArrayList.add(localObject);
        localArrayList.add(paramThrowable);
        l(localArrayList);
      }
      else
      {
        if (!(localObject instanceof ArrayList)) {
          break label93;
        }
        ((ArrayList)localObject).add(paramThrowable);
      }
      return;
      label93:
      paramThrowable = new StringBuilder();
      paramThrowable.append("State is ");
      paramThrowable.append(localObject);
      throw new IllegalStateException(paramThrowable.toString().toString());
    }
    
    public final ArrayList c()
    {
      return new ArrayList(4);
    }
    
    public final Object d()
    {
      return r.get(this);
    }
    
    public final Throwable e()
    {
      return (Throwable)q.get(this);
    }
    
    public final boolean f()
    {
      boolean bool;
      if (e() != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public C0 g()
    {
      return o;
    }
    
    public final boolean h()
    {
      boolean bool;
      if (p.get(this) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean i()
    {
      boolean bool;
      if (d() == y0.e()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final List j(Throwable paramThrowable)
    {
      Object localObject = d();
      ArrayList localArrayList;
      if (localObject == null)
      {
        localArrayList = c();
      }
      else if ((localObject instanceof Throwable))
      {
        localArrayList = c();
        localArrayList.add(localObject);
      }
      else
      {
        if (!(localObject instanceof ArrayList)) {
          break label92;
        }
        localArrayList = (ArrayList)localObject;
      }
      localObject = e();
      if (localObject != null) {
        localArrayList.add(0, localObject);
      }
      if ((paramThrowable != null) && (!Intrinsics.a(paramThrowable, localObject))) {
        localArrayList.add(paramThrowable);
      }
      l(y0.e());
      return localArrayList;
      label92:
      paramThrowable = new StringBuilder();
      paramThrowable.append("State is ");
      paramThrowable.append(localObject);
      throw new IllegalStateException(paramThrowable.toString().toString());
    }
    
    public final void k(boolean paramBoolean)
    {
      p.set(this, paramBoolean);
    }
    
    public final void l(Object paramObject)
    {
      r.set(this, paramObject);
    }
    
    public final void m(Throwable paramThrowable)
    {
      q.set(this, paramThrowable);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Finishing[cancelling=");
      localStringBuilder.append(f());
      localStringBuilder.append(", completing=");
      localStringBuilder.append(h());
      localStringBuilder.append(", rootCause=");
      localStringBuilder.append(e());
      localStringBuilder.append(", exceptions=");
      localStringBuilder.append(d());
      localStringBuilder.append(", list=");
      localStringBuilder.append(g());
      localStringBuilder.append(']');
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    extends q.a
  {
    public d(q paramq, x0 paramx0, Object paramObject)
    {
      super();
    }
    
    public Object f(q paramq)
    {
      if (jdField_this.b0() == paramObject) {
        paramq = null;
      } else {
        paramq = u6.p.a();
      }
      return paramq;
    }
  }
}

/* Location:
 * Qualified Name:     p6.x0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */