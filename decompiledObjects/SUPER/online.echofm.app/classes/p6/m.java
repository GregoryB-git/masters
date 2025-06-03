package p6;

import X5.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import u6.C;
import u6.F;

public class m
  extends U
  implements l, Z5.e, P0
{
  public static final AtomicIntegerFieldUpdater t = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex");
  public static final AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
  public static final AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle");
  private volatile int _decisionAndIndex;
  private volatile Object _parentHandle;
  private volatile Object _state;
  public final X5.d r;
  public final g s;
  
  public m(X5.d paramd, int paramInt)
  {
    super(paramInt);
    r = paramd;
    s = paramd.getContext();
    _decisionAndIndex = 536870911;
    _state = d.o;
  }
  
  private final boolean D()
  {
    if (V.c(q))
    {
      X5.d locald = r;
      Intrinsics.c(locald, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
      if (((u6.j)locald).n()) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public final X A()
  {
    Object localObject = (q0)getContext().b(q0.n);
    if (localObject == null) {
      return null;
    }
    localObject = q0.a.d((q0)localObject, true, false, new q(this), 2, null);
    u.b.a(v, this, null, localObject);
    return (X)localObject;
  }
  
  public final void B(Object paramObject)
  {
    Object localObject1 = u;
    Object localObject2;
    y localy;
    do
    {
      do
      {
        for (;;)
        {
          localObject2 = ((AtomicReferenceFieldUpdater)localObject1).get(this);
          if ((localObject2 instanceof d))
          {
            if (!u.b.a(u, this, localObject2, paramObject)) {}
          }
          else
          {
            if ((!(localObject2 instanceof j)) && (!(localObject2 instanceof C))) {
              break;
            }
            F(paramObject, localObject2);
          }
        }
        boolean bool = localObject2 instanceof z;
        if (bool)
        {
          localObject1 = (z)localObject2;
          if (!((z)localObject1).b()) {
            F(paramObject, localObject2);
          }
          if ((localObject2 instanceof p))
          {
            localObject2 = null;
            if (!bool) {
              localObject1 = null;
            }
            if (localObject1 != null) {
              localObject2 = a;
            }
            if ((paramObject instanceof j))
            {
              l((j)paramObject, (Throwable)localObject2);
            }
            else
            {
              Intrinsics.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
              n((C)paramObject, (Throwable)localObject2);
            }
          }
          return;
        }
        if (!(localObject2 instanceof y)) {
          break;
        }
        localy = (y)localObject2;
        if (b != null) {
          F(paramObject, localObject2);
        }
        if ((paramObject instanceof C)) {
          return;
        }
        Intrinsics.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
        j localj = (j)paramObject;
        if (localy.c())
        {
          l(localj, e);
          return;
        }
        localy = y.b(localy, null, localj, null, null, null, 29, null);
      } while (!u.b.a(u, this, localObject2, localy));
      return;
      if ((paramObject instanceof C)) {
        return;
      }
      Intrinsics.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
      localy = new y(localObject2, (j)paramObject, null, null, null, 28, null);
    } while (!u.b.a(u, this, localObject2, localy));
  }
  
  public boolean C()
  {
    return x() instanceof E0 ^ true;
  }
  
  public final j E(g6.l paraml)
  {
    if ((paraml instanceof j)) {
      paraml = (j)paraml;
    } else {
      paraml = new n0(paraml);
    }
    return paraml;
  }
  
  public final void F(Object paramObject1, Object paramObject2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("It's prohibited to register multiple handlers, tried to register ");
    localStringBuilder.append(paramObject1);
    localStringBuilder.append(", already has ");
    localStringBuilder.append(paramObject2);
    throw new IllegalStateException(localStringBuilder.toString().toString());
  }
  
  public String G()
  {
    return "CancellableContinuation";
  }
  
  public final void H(Throwable paramThrowable)
  {
    if (q(paramThrowable)) {
      return;
    }
    o(paramThrowable);
    s();
  }
  
  public final void I()
  {
    Object localObject = r;
    if ((localObject instanceof u6.j)) {
      localObject = (u6.j)localObject;
    } else {
      localObject = null;
    }
    if (localObject != null)
    {
      localObject = ((u6.j)localObject).s(this);
      if (localObject != null)
      {
        r();
        o((Throwable)localObject);
      }
    }
  }
  
  public final boolean J()
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = u;
    Object localObject = localAtomicReferenceFieldUpdater.get(this);
    if (((localObject instanceof y)) && (d != null))
    {
      r();
      return false;
    }
    t.set(this, 536870911);
    localAtomicReferenceFieldUpdater.set(this, d.o);
    return true;
  }
  
  public final void K(Object paramObject, int paramInt, g6.l paraml)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = u;
    Object localObject1;
    Object localObject2;
    do
    {
      localObject1 = localAtomicReferenceFieldUpdater.get(this);
      if (!(localObject1 instanceof E0)) {
        break;
      }
      localObject2 = M((E0)localObject1, paramObject, paramInt, paraml, null);
    } while (!u.b.a(u, this, localObject1, localObject2));
    s();
    t(paramInt);
    return;
    if ((localObject1 instanceof p))
    {
      localObject1 = (p)localObject1;
      if (((p)localObject1).c())
      {
        if (paraml != null) {
          m(paraml, a);
        }
        return;
      }
    }
    k(paramObject);
    throw new V5.e();
  }
  
  public final Object M(E0 paramE0, Object paramObject1, int paramInt, g6.l paraml, Object paramObject2)
  {
    Object localObject;
    if ((paramObject1 instanceof z))
    {
      localObject = paramObject1;
    }
    else if ((!V.b(paramInt)) && (paramObject2 == null))
    {
      localObject = paramObject1;
    }
    else if ((paraml == null) && (!(paramE0 instanceof j)))
    {
      localObject = paramObject1;
      if (paramObject2 == null) {}
    }
    else
    {
      if ((paramE0 instanceof j)) {}
      for (paramE0 = (j)paramE0;; paramE0 = null) {
        break;
      }
      localObject = new y(paramObject1, paramE0, paraml, paramObject2, null, 16, null);
    }
    return localObject;
  }
  
  public final boolean N()
  {
    AtomicIntegerFieldUpdater localAtomicIntegerFieldUpdater = t;
    int i;
    do
    {
      i = localAtomicIntegerFieldUpdater.get(this);
      int j = i >> 29;
      if (j != 0)
      {
        if (j == 1) {
          return false;
        }
        throw new IllegalStateException("Already resumed".toString());
      }
    } while (!t.compareAndSet(this, i, 1073741824 + (0x1FFFFFFF & i)));
    return true;
  }
  
  public final F O(Object paramObject1, Object paramObject2, g6.l paraml)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = u;
    Object localObject1;
    Object localObject2;
    do
    {
      localObject1 = localAtomicReferenceFieldUpdater.get(this);
      if (!(localObject1 instanceof E0)) {
        break;
      }
      localObject2 = M((E0)localObject1, paramObject1, q, paraml, paramObject2);
    } while (!u.b.a(u, this, localObject1, localObject2));
    s();
    return n.a;
    boolean bool = localObject1 instanceof y;
    paraml = null;
    paramObject1 = paraml;
    if (bool)
    {
      paramObject1 = paraml;
      if (paramObject2 != null)
      {
        paramObject1 = paraml;
        if (d == paramObject2) {
          paramObject1 = n.a;
        }
      }
    }
    return (F)paramObject1;
  }
  
  public final boolean P()
  {
    AtomicIntegerFieldUpdater localAtomicIntegerFieldUpdater = t;
    int i;
    do
    {
      i = localAtomicIntegerFieldUpdater.get(this);
      int j = i >> 29;
      if (j != 0)
      {
        if (j == 2) {
          return false;
        }
        throw new IllegalStateException("Already suspended".toString());
      }
    } while (!t.compareAndSet(this, i, 536870912 + (0x1FFFFFFF & i)));
    return true;
  }
  
  public void a(C paramC, int paramInt)
  {
    AtomicIntegerFieldUpdater localAtomicIntegerFieldUpdater = t;
    int i;
    do
    {
      i = localAtomicIntegerFieldUpdater.get(this);
      if ((i & 0x1FFFFFFF) != 536870911) {
        break;
      }
    } while (!localAtomicIntegerFieldUpdater.compareAndSet(this, i, (i >> 29 << 29) + paramInt));
    B(paramC);
    return;
    throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
  }
  
  public void b(Object paramObject, Throwable paramThrowable)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = u;
    Object localObject;
    label100:
    do
    {
      y localy;
      do
      {
        localObject = localAtomicReferenceFieldUpdater.get(this);
        if ((localObject instanceof E0)) {
          break label129;
        }
        if ((localObject instanceof z)) {
          return;
        }
        if (!(localObject instanceof y)) {
          break label100;
        }
        paramObject = (y)localObject;
        if (!(((y)paramObject).c() ^ true)) {
          break;
        }
        localy = y.b((y)paramObject, null, null, null, null, paramThrowable, 15, null);
      } while (!u.b.a(u, this, localObject, localy));
      ((y)paramObject).d(this, paramThrowable);
      return;
      throw new IllegalStateException("Must be called at most once".toString());
    } while (!u.b.a(u, this, localObject, new y(localObject, null, null, null, paramThrowable, 14, null)));
    return;
    label129:
    throw new IllegalStateException("Not completed".toString());
  }
  
  public final X5.d c()
  {
    return r;
  }
  
  public void d(g6.l paraml)
  {
    B(E(paraml));
  }
  
  public Throwable e(Object paramObject)
  {
    paramObject = super.e(paramObject);
    if (paramObject == null) {
      paramObject = null;
    }
    return (Throwable)paramObject;
  }
  
  public Object f(Object paramObject)
  {
    Object localObject = paramObject;
    if ((paramObject instanceof y)) {
      localObject = a;
    }
    return localObject;
  }
  
  public Object g(Object paramObject1, Object paramObject2, g6.l paraml)
  {
    return O(paramObject1, paramObject2, paraml);
  }
  
  public Z5.e getCallerFrame()
  {
    Object localObject = r;
    if ((localObject instanceof Z5.e)) {
      localObject = (Z5.e)localObject;
    } else {
      localObject = null;
    }
    return (Z5.e)localObject;
  }
  
  public g getContext()
  {
    return s;
  }
  
  public Object i()
  {
    return x();
  }
  
  public void j(Object paramObject, g6.l paraml)
  {
    K(paramObject, q, paraml);
  }
  
  public final Void k(Object paramObject)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Already resumed, but proposed with update ");
    localStringBuilder.append(paramObject);
    throw new IllegalStateException(localStringBuilder.toString().toString());
  }
  
  /* Error */
  public final void l(j paramj, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: invokevirtual 334	p6/k:a	(Ljava/lang/Throwable;)V
    //   5: goto +47 -> 52
    //   8: astore_1
    //   9: aload_0
    //   10: invokevirtual 114	p6/m:getContext	()LX5/g;
    //   13: astore_3
    //   14: new 208	java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial 210	java/lang/StringBuilder:<init>	()V
    //   21: astore_2
    //   22: aload_2
    //   23: ldc_w 336
    //   26: invokevirtual 216	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: pop
    //   30: aload_2
    //   31: aload_0
    //   32: invokevirtual 219	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload_3
    //   37: new 338	p6/C
    //   40: dup
    //   41: aload_2
    //   42: invokevirtual 227	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   45: aload_1
    //   46: invokespecial 341	p6/C:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   49: invokestatic 346	p6/H:a	(LX5/g;Ljava/lang/Throwable;)V
    //   52: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	m
    //   0	53	1	paramj	j
    //   0	53	2	paramThrowable	Throwable
    //   13	24	3	localg	g
    // Exception table:
    //   from	to	target	type
    //   0	5	8	finally
  }
  
  /* Error */
  public final void m(g6.l paraml, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: invokeinterface 351 2 0
    //   7: pop
    //   8: goto +47 -> 55
    //   11: astore_2
    //   12: aload_0
    //   13: invokevirtual 114	p6/m:getContext	()LX5/g;
    //   16: astore_1
    //   17: new 208	java/lang/StringBuilder
    //   20: dup
    //   21: invokespecial 210	java/lang/StringBuilder:<init>	()V
    //   24: astore_3
    //   25: aload_3
    //   26: ldc_w 353
    //   29: invokevirtual 216	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: pop
    //   33: aload_3
    //   34: aload_0
    //   35: invokevirtual 219	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   38: pop
    //   39: aload_1
    //   40: new 338	p6/C
    //   43: dup
    //   44: aload_3
    //   45: invokevirtual 227	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: aload_2
    //   49: invokespecial 341	p6/C:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   52: invokestatic 346	p6/H:a	(LX5/g;Ljava/lang/Throwable;)V
    //   55: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	m
    //   0	56	1	paraml	g6.l
    //   0	56	2	paramThrowable	Throwable
    //   24	21	3	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   0	8	11	finally
  }
  
  /* Error */
  public final void n(C paramC, Throwable paramThrowable)
  {
    // Byte code:
    //   0: getstatic 35	p6/m:t	Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    //   3: aload_0
    //   4: invokevirtual 279	java/util/concurrent/atomic/AtomicIntegerFieldUpdater:get	(Ljava/lang/Object;)I
    //   7: ldc 65
    //   9: iand
    //   10: istore_3
    //   11: iload_3
    //   12: ldc 65
    //   14: if_icmpeq +63 -> 77
    //   17: aload_1
    //   18: iload_3
    //   19: aload_2
    //   20: aload_0
    //   21: invokevirtual 114	p6/m:getContext	()LX5/g;
    //   24: invokevirtual 356	u6/C:o	(ILjava/lang/Throwable;LX5/g;)V
    //   27: goto +49 -> 76
    //   30: astore 4
    //   32: aload_0
    //   33: invokevirtual 114	p6/m:getContext	()LX5/g;
    //   36: astore_2
    //   37: new 208	java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial 210	java/lang/StringBuilder:<init>	()V
    //   44: astore_1
    //   45: aload_1
    //   46: ldc_w 336
    //   49: invokevirtual 216	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload_1
    //   54: aload_0
    //   55: invokevirtual 219	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: aload_2
    //   60: new 338	p6/C
    //   63: dup
    //   64: aload_1
    //   65: invokevirtual 227	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   68: aload 4
    //   70: invokespecial 341	p6/C:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   73: invokestatic 346	p6/H:a	(LX5/g;Ljava/lang/Throwable;)V
    //   76: return
    //   77: new 223	java/lang/IllegalStateException
    //   80: dup
    //   81: ldc_w 358
    //   84: invokevirtual 228	java/lang/Object:toString	()Ljava/lang/String;
    //   87: invokespecial 229	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	m
    //   0	91	1	paramC	C
    //   0	91	2	paramThrowable	Throwable
    //   10	9	3	i	int
    //   30	39	4	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   17	27	30	finally
  }
  
  public boolean o(Throwable paramThrowable)
  {
    Object localObject1 = u;
    Object localObject2;
    p localp;
    do
    {
      localObject2 = ((AtomicReferenceFieldUpdater)localObject1).get(this);
      boolean bool1 = localObject2 instanceof E0;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      if (((localObject2 instanceof j)) || ((localObject2 instanceof C))) {
        bool2 = true;
      }
      localp = new p(this, paramThrowable, bool2);
    } while (!u.b.a(u, this, localObject2, localp));
    localObject1 = (E0)localObject2;
    if ((localObject1 instanceof j)) {
      l((j)localObject2, paramThrowable);
    } else if ((localObject1 instanceof C)) {
      n((C)localObject2, paramThrowable);
    }
    s();
    t(q);
    return true;
  }
  
  public void p(Object paramObject)
  {
    t(q);
  }
  
  public final boolean q(Throwable paramThrowable)
  {
    if (!D()) {
      return false;
    }
    X5.d locald = r;
    Intrinsics.c(locald, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
    return ((u6.j)locald).q(paramThrowable);
  }
  
  public final void r()
  {
    X localX = v();
    if (localX == null) {
      return;
    }
    localX.b();
    v.set(this, D0.o);
  }
  
  public void resumeWith(Object paramObject)
  {
    L(this, D.c(paramObject, this), q, null, 4, null);
  }
  
  public final void s()
  {
    if (!D()) {
      r();
    }
  }
  
  public final void t(int paramInt)
  {
    if (N()) {
      return;
    }
    V.a(this, paramInt);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(G());
    localStringBuilder.append('(');
    localStringBuilder.append(M.c(r));
    localStringBuilder.append("){");
    localStringBuilder.append(y());
    localStringBuilder.append("}@");
    localStringBuilder.append(M.b(this));
    return localStringBuilder.toString();
  }
  
  public Throwable u(q0 paramq0)
  {
    return paramq0.s();
  }
  
  public final X v()
  {
    return (X)v.get(this);
  }
  
  public final Object w()
  {
    boolean bool = D();
    if (P())
    {
      if (v() == null) {
        A();
      }
      if (bool) {
        I();
      }
      return Y5.b.c();
    }
    if (bool) {
      I();
    }
    Object localObject1 = x();
    if (!(localObject1 instanceof z))
    {
      if (V.b(q))
      {
        Object localObject2 = (q0)getContext().b(q0.n);
        if ((localObject2 != null) && (!((q0)localObject2).a()))
        {
          localObject2 = ((q0)localObject2).s();
          b(localObject1, (Throwable)localObject2);
          throw ((Throwable)localObject2);
        }
      }
      return f(localObject1);
    }
    throw a;
  }
  
  public final Object x()
  {
    return u.get(this);
  }
  
  public final String y()
  {
    Object localObject = x();
    if ((localObject instanceof E0)) {
      localObject = "Active";
    } else if ((localObject instanceof p)) {
      localObject = "Cancelled";
    } else {
      localObject = "Completed";
    }
    return (String)localObject;
  }
  
  public void z()
  {
    X localX = A();
    if (localX == null) {
      return;
    }
    if (C())
    {
      localX.b();
      v.set(this, D0.o);
    }
  }
}

/* Location:
 * Qualified Name:     p6.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */