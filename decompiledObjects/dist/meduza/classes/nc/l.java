package nc;

import d2.h0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.m0;
import sc.g;
import vb.a;
import wb.d;

public class l<T>
  extends p0<T>
  implements k<T>, d, i2
{
  public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decisionAndIndex");
  public static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state");
  public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_parentHandle");
  private volatile int _decisionAndIndex;
  private volatile Object _parentHandle;
  private volatile Object _state;
  public final ub.e<T> d;
  public final ub.h e;
  
  public l(int paramInt, ub.e parame)
  {
    super(paramInt);
    d = parame;
    e = parame.getContext();
    _decisionAndIndex = 536870911;
    _state = b.a;
  }
  
  public static Object C(v1 paramv1, Object paramObject, int paramInt, dc.l paraml)
  {
    if (!(paramObject instanceof u))
    {
      int i = 1;
      int j = i;
      if (paramInt != 1) {
        if (paramInt == 2) {
          j = i;
        } else {
          j = 0;
        }
      }
      if ((j != 0) && ((paraml != null) || ((paramv1 instanceof i))))
      {
        if ((paramv1 instanceof i)) {
          paramv1 = (i)paramv1;
        } else {
          paramv1 = null;
        }
        paramObject = new t(paramObject, paramv1, paraml, null, 16);
      }
    }
    return paramObject;
  }
  
  public static void y(Object paramObject1, Object paramObject2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("It's prohibited to register multiple handlers, tried to register ");
    localStringBuilder.append(paramObject1);
    localStringBuilder.append(", already has ");
    localStringBuilder.append(paramObject2);
    throw new IllegalStateException(localStringBuilder.toString().toString());
  }
  
  public final void A()
  {
    Object localObject1 = d;
    boolean bool = localObject1 instanceof g;
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater1 = null;
    if (bool) {
      localObject1 = (g)localObject1;
    } else {
      localObject1 = null;
    }
    if (localObject1 != null)
    {
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater2 = g.p;
      Object localObject2;
      int i;
      int j;
      do
      {
        localObject2 = localAtomicReferenceFieldUpdater2.get(localObject1);
        h0 localh0 = b.a0.Z;
        i = 0;
        j = 0;
        if (localObject2 != localh0) {
          break;
        }
        localObject2 = g.p;
        do
        {
          if (((AtomicReferenceFieldUpdater)localObject2).compareAndSet(localObject1, localh0, this))
          {
            j = 1;
            break;
          }
        } while (((AtomicReferenceFieldUpdater)localObject2).get(localObject1) == localh0);
      } while (j == 0);
      localObject1 = localAtomicReferenceFieldUpdater1;
      if ((localObject2 instanceof Throwable))
      {
        localAtomicReferenceFieldUpdater1 = g.p;
        do
        {
          if (localAtomicReferenceFieldUpdater1.compareAndSet(localObject1, localObject2, null))
          {
            j = 1;
            break;
          }
        } while (localAtomicReferenceFieldUpdater1.get(localObject1) == localObject2);
        j = i;
        if (j != 0)
        {
          localObject1 = (Throwable)localObject2;
          if (localObject1 != null)
          {
            p();
            cancel((Throwable)localObject1);
          }
        }
        else
        {
          throw new IllegalArgumentException("Failed requirement.".toString());
        }
      }
      else
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Inconsistent state ");
        ((StringBuilder)localObject1).append(localObject2);
        throw new IllegalStateException(((StringBuilder)localObject1).toString().toString());
      }
    }
  }
  
  public final void B(Object paramObject, int paramInt, dc.l<? super Throwable, rb.h> paraml)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = o;
    Object localObject1;
    int i;
    Object localObject3;
    do
    {
      localObject1 = localAtomicReferenceFieldUpdater.get(this);
      boolean bool = localObject1 instanceof v1;
      i = 0;
      if (!bool) {
        break;
      }
      Object localObject2 = C((v1)localObject1, paramObject, paramInt, paraml);
      localObject3 = o;
      do
      {
        if (((AtomicReferenceFieldUpdater)localObject3).compareAndSet(this, localObject1, localObject2))
        {
          i = 1;
          break;
        }
      } while (((AtomicReferenceFieldUpdater)localObject3).get(this) == localObject1);
    } while (i == 0);
    if (!x()) {
      p();
    }
    q(paramInt);
    return;
    if ((localObject1 instanceof m))
    {
      localObject3 = (m)localObject1;
      localObject3.getClass();
      if (m.c.compareAndSet(localObject3, 0, 1))
      {
        if (paraml != null) {
          m(paraml, a);
        }
        return;
      }
    }
    paraml = new StringBuilder();
    paraml.append("Already resumed, but proposed with update ");
    paraml.append(paramObject);
    throw new IllegalStateException(paraml.toString().toString());
  }
  
  public final h0 D(Object paramObject, dc.l paraml)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater1 = o;
    Object localObject1;
    int i;
    do
    {
      localObject1 = localAtomicReferenceFieldUpdater1.get(this);
      if (!(localObject1 instanceof v1)) {
        break;
      }
      Object localObject2 = C((v1)localObject1, paramObject, c, paraml);
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater2 = o;
      do
      {
        if (localAtomicReferenceFieldUpdater2.compareAndSet(this, localObject1, localObject2))
        {
          i = 1;
          break;
        }
      } while (localAtomicReferenceFieldUpdater2.get(this) == localObject1);
      i = 0;
    } while (i == 0);
    if (!x()) {
      p();
    }
    return m0.q;
    boolean bool = localObject1 instanceof t;
    return null;
  }
  
  public final void a(Object paramObject, CancellationException paramCancellationException)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater1 = o;
    int i;
    label171:
    do
    {
      do
      {
        paramObject = localAtomicReferenceFieldUpdater1.get(this);
        if ((paramObject instanceof v1)) {
          break label225;
        }
        if ((paramObject instanceof u)) {
          return;
        }
        boolean bool = paramObject instanceof t;
        i = 1;
        int j = 1;
        if (!bool) {
          break label171;
        }
        localt = (t)paramObject;
        if (e != null) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i ^ 0x1) == 0) {
          break;
        }
        localObject = t.a(localt, null, paramCancellationException, 15);
        AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater2 = o;
        do
        {
          if (localAtomicReferenceFieldUpdater2.compareAndSet(this, paramObject, localObject))
          {
            i = j;
            break;
          }
        } while (localAtomicReferenceFieldUpdater2.get(this) == paramObject);
        i = 0;
      } while (i == 0);
      paramObject = b;
      if (paramObject != null) {
        l((i)paramObject, paramCancellationException);
      }
      paramObject = c;
      if (paramObject != null) {
        m((dc.l)paramObject, paramCancellationException);
      }
      return;
      throw new IllegalStateException("Must be called at most once".toString());
      Object localObject = o;
      t localt = new t(paramObject, null, null, paramCancellationException, 14);
      while (!((AtomicReferenceFieldUpdater)localObject).compareAndSet(this, paramObject, localt)) {
        if (((AtomicReferenceFieldUpdater)localObject).get(this) != paramObject) {
          i = 0;
        }
      }
    } while (i == 0);
    return;
    label225:
    throw new IllegalStateException("Not completed".toString());
  }
  
  public final void b(T paramT, dc.l<? super Throwable, rb.h> paraml)
  {
    B(paramT, c, paraml);
  }
  
  public final void c(sc.t<?> paramt, int paramInt)
  {
    AtomicIntegerFieldUpdater localAtomicIntegerFieldUpdater = f;
    int i;
    do
    {
      i = localAtomicIntegerFieldUpdater.get(this);
      int j;
      if ((i & 0x1FFFFFFF) == 536870911) {
        j = 1;
      } else {
        j = 0;
      }
      if (j == 0) {
        break;
      }
    } while (!localAtomicIntegerFieldUpdater.compareAndSet(this, i, (i >> 29 << 29) + paramInt));
    w(paramt);
    return;
    throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
  }
  
  public final boolean cancel(Throwable paramThrowable)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater1 = o;
    Object localObject1;
    int i;
    do
    {
      localObject1 = localAtomicReferenceFieldUpdater1.get(this);
      boolean bool = localObject1 instanceof v1;
      i = 0;
      if (!bool) {
        return false;
      }
      if ((!(localObject1 instanceof i)) && (!(localObject1 instanceof sc.t))) {
        bool = false;
      } else {
        bool = true;
      }
      localObject2 = new m(this, paramThrowable, bool);
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater2 = o;
      do
      {
        if (localAtomicReferenceFieldUpdater2.compareAndSet(this, localObject1, localObject2))
        {
          i = 1;
          break;
        }
      } while (localAtomicReferenceFieldUpdater2.get(this) == localObject1);
    } while (i == 0);
    Object localObject2 = (v1)localObject1;
    if ((localObject2 instanceof i)) {
      l((i)localObject1, paramThrowable);
    } else if ((localObject2 instanceof sc.t)) {
      o((sc.t)localObject1, paramThrowable);
    }
    if (!x()) {
      p();
    }
    q(c);
    return true;
  }
  
  public final ub.e<T> d()
  {
    return d;
  }
  
  public final h0 e(Throwable paramThrowable)
  {
    return D(new u(paramThrowable, false), null);
  }
  
  public final Throwable f(Object paramObject)
  {
    paramObject = super.f(paramObject);
    if (paramObject == null) {
      paramObject = null;
    }
    return (Throwable)paramObject;
  }
  
  public final <T> T g(Object paramObject)
  {
    Object localObject = paramObject;
    if ((paramObject instanceof t)) {
      localObject = a;
    }
    return (T)localObject;
  }
  
  public final d getCallerFrame()
  {
    Object localObject = d;
    if ((localObject instanceof d)) {
      localObject = (d)localObject;
    } else {
      localObject = null;
    }
    return (d)localObject;
  }
  
  public final ub.h getContext()
  {
    return e;
  }
  
  public final void h(a0 parama0, rb.h paramh)
  {
    Object localObject = d;
    if ((localObject instanceof g)) {
      localObject = (g)localObject;
    } else {
      localObject = null;
    }
    if (localObject != null) {
      localObject = d;
    } else {
      localObject = null;
    }
    int i;
    if (localObject == parama0) {
      i = 4;
    } else {
      i = c;
    }
    B(paramh, i, null);
  }
  
  public final h0 j(Object paramObject, dc.l paraml)
  {
    return D(paramObject, paraml);
  }
  
  public final Object k()
  {
    return o.get(this);
  }
  
  /* Error */
  public final void l(i parami, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: invokevirtual 266	nc/j:h	(Ljava/lang/Throwable;)V
    //   5: goto +47 -> 52
    //   8: astore_2
    //   9: aload_0
    //   10: getfield 66	nc/l:e	Lub/h;
    //   13: astore_3
    //   14: new 92	java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   21: astore_1
    //   22: aload_1
    //   23: ldc_w 268
    //   26: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: pop
    //   30: aload_1
    //   31: aload_0
    //   32: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload_3
    //   37: new 270	n7/w
    //   40: dup
    //   41: aload_1
    //   42: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   45: aload_2
    //   46: invokespecial 273	n7/w:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   49: invokestatic 278	nc/c0:a	(Lub/h;Ljava/lang/Throwable;)V
    //   52: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	l
    //   0	53	1	parami	i
    //   0	53	2	paramThrowable	Throwable
    //   13	24	3	localh	ub.h
    // Exception table:
    //   from	to	target	type
    //   0	5	8	finally
  }
  
  /* Error */
  public final void m(dc.l<? super Throwable, rb.h> paraml, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: invokeinterface 283 2 0
    //   7: pop
    //   8: goto +47 -> 55
    //   11: astore_1
    //   12: aload_0
    //   13: getfield 66	nc/l:e	Lub/h;
    //   16: astore_3
    //   17: new 92	java/lang/StringBuilder
    //   20: dup
    //   21: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   24: astore_2
    //   25: aload_2
    //   26: ldc_w 285
    //   29: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: pop
    //   33: aload_2
    //   34: aload_0
    //   35: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   38: pop
    //   39: aload_3
    //   40: new 270	n7/w
    //   43: dup
    //   44: aload_2
    //   45: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: aload_1
    //   49: invokespecial 273	n7/w:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   52: invokestatic 278	nc/c0:a	(Lub/h;Ljava/lang/Throwable;)V
    //   55: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	l
    //   0	56	1	paraml	dc.l<? super Throwable, rb.h>
    //   0	56	2	paramThrowable	Throwable
    //   16	24	3	localh	ub.h
    // Exception table:
    //   from	to	target	type
    //   0	8	11	finally
  }
  
  public final void n(Object paramObject)
  {
    q(c);
  }
  
  /* Error */
  public final void o(sc.t<?> paramt, Throwable paramThrowable)
  {
    // Byte code:
    //   0: getstatic 37	nc/l:f	Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    //   3: aload_0
    //   4: invokevirtual 221	java/util/concurrent/atomic/AtomicIntegerFieldUpdater:get	(Ljava/lang/Object;)I
    //   7: ldc 67
    //   9: iand
    //   10: istore_3
    //   11: iload_3
    //   12: ldc 67
    //   14: if_icmpeq +9 -> 23
    //   17: iconst_1
    //   18: istore 4
    //   20: goto +6 -> 26
    //   23: iconst_0
    //   24: istore 4
    //   26: iload 4
    //   28: ifeq +62 -> 90
    //   31: aload_1
    //   32: iload_3
    //   33: aload_0
    //   34: getfield 66	nc/l:e	Lub/h;
    //   37: invokevirtual 290	sc/t:g	(ILub/h;)V
    //   40: goto +49 -> 89
    //   43: astore_1
    //   44: aload_0
    //   45: getfield 66	nc/l:e	Lub/h;
    //   48: astore 5
    //   50: new 92	java/lang/StringBuilder
    //   53: dup
    //   54: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   57: astore_2
    //   58: aload_2
    //   59: ldc_w 268
    //   62: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: pop
    //   66: aload_2
    //   67: aload_0
    //   68: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload 5
    //   74: new 270	n7/w
    //   77: dup
    //   78: aload_2
    //   79: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: aload_1
    //   83: invokespecial 273	n7/w:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   86: invokestatic 278	nc/c0:a	(Lub/h;Ljava/lang/Throwable;)V
    //   89: return
    //   90: new 107	java/lang/IllegalStateException
    //   93: dup
    //   94: ldc_w 292
    //   97: invokevirtual 112	java/lang/Object:toString	()Ljava/lang/String;
    //   100: invokespecial 115	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	l
    //   0	104	1	paramt	sc.t<?>
    //   0	104	2	paramThrowable	Throwable
    //   10	23	3	i	int
    //   18	9	4	j	int
    //   48	25	5	localh	ub.h
    // Exception table:
    //   from	to	target	type
    //   31	40	43	finally
  }
  
  public final void p()
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = p;
    t0 localt0 = (t0)localAtomicReferenceFieldUpdater.get(this);
    if (localt0 == null) {
      return;
    }
    localt0.dispose();
    localAtomicReferenceFieldUpdater.set(this, u1.a);
  }
  
  public final void q(int paramInt)
  {
    Object localObject1 = f;
    int i;
    int k;
    do
    {
      i = ((AtomicIntegerFieldUpdater)localObject1).get(this);
      j = i >> 29;
      k = 0;
      if (j != 0)
      {
        if (j == 1)
        {
          j = 0;
          break;
        }
        throw new IllegalStateException("Already resumed".toString());
      }
    } while (!f.compareAndSet(this, i, (0x1FFFFFFF & i) + 1073741824));
    int j = 1;
    if (j != 0) {
      return;
    }
    Object localObject2 = d;
    boolean bool;
    if (paramInt == 4) {
      bool = true;
    } else {
      bool = false;
    }
    if ((!bool) && ((localObject2 instanceof g)))
    {
      if ((paramInt != 1) && (paramInt != 2)) {
        paramInt = 0;
      } else {
        paramInt = 1;
      }
      i = c;
      if (i != 1)
      {
        j = k;
        if (i != 2) {}
      }
      else
      {
        j = 1;
      }
      if (paramInt == j)
      {
        localObject1 = d;
        localObject2 = ((ub.e)localObject2).getContext();
        if (((a0)localObject1).B0())
        {
          ((a0)localObject1).z0((ub.h)localObject2, this);
          return;
        }
        localObject1 = c2.a();
        if (((x0)localObject1).F0())
        {
          ((x0)localObject1).D0(this);
          return;
        }
        ((x0)localObject1).E0(true);
        try
        {
          m0.Z(this, d, true);
          for (;;)
          {
            bool = ((x0)localObject1).H0();
            if (!bool) {
              break;
            }
          }
        }
        finally {}
      }
    }
    try
    {
      i(localThrowable, null);
      ((x0)localObject1).C0(true);
    }
    finally
    {
      ((x0)localObject1).C0(true);
    }
  }
  
  public Throwable r(o1 paramo1)
  {
    return paramo1.getCancellationException();
  }
  
  public final void resumeWith(Object paramObject)
  {
    Throwable localThrowable = rb.e.a(paramObject);
    if (localThrowable != null) {
      paramObject = new u(localThrowable, false);
    }
    B(paramObject, c, null);
  }
  
  public final Object s()
  {
    boolean bool = x();
    Object localObject1 = f;
    int j;
    int k;
    do
    {
      i = ((AtomicIntegerFieldUpdater)localObject1).get(this);
      j = i >> 29;
      k = 0;
      if (j != 0)
      {
        if (j == 2)
        {
          i = 0;
          break;
        }
        throw new IllegalStateException("Already suspended".toString());
      }
    } while (!f.compareAndSet(this, i, (0x1FFFFFFF & i) + 536870912));
    int i = 1;
    if (i != 0)
    {
      if ((t0)p.get(this) == null) {
        u();
      }
      if (bool) {
        A();
      }
      return a.a;
    }
    if (bool) {
      A();
    }
    localObject1 = o.get(this);
    if (!(localObject1 instanceof u))
    {
      j = c;
      if (j != 1)
      {
        i = k;
        if (j != 2) {}
      }
      else
      {
        i = 1;
      }
      if (i != 0)
      {
        Object localObject2 = (j1)e.get(j1.b.a);
        if ((localObject2 != null) && (!((j1)localObject2).isActive()))
        {
          localObject2 = ((j1)localObject2).getCancellationException();
          a(localObject1, (CancellationException)localObject2);
          throw ((Throwable)localObject2);
        }
      }
      return g(localObject1);
    }
    throw a;
  }
  
  public final void t()
  {
    t0 localt0 = u();
    if (localt0 == null) {
      return;
    }
    if ((o.get(this) instanceof v1 ^ true))
    {
      localt0.dispose();
      p.set(this, u1.a);
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(z());
    localStringBuilder.append('(');
    localStringBuilder.append(g0.c(d));
    localStringBuilder.append("){");
    Object localObject = o.get(this);
    if ((localObject instanceof v1)) {
      localObject = "Active";
    } else if ((localObject instanceof m)) {
      localObject = "Cancelled";
    } else {
      localObject = "Completed";
    }
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("}@");
    localStringBuilder.append(g0.b(this));
    return localStringBuilder.toString();
  }
  
  public final t0 u()
  {
    Object localObject = (j1)e.get(j1.b.a);
    if (localObject == null) {
      return null;
    }
    localObject = j1.a.a((j1)localObject, true, new n(this), 2);
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = p;
    while ((!localAtomicReferenceFieldUpdater.compareAndSet(this, null, localObject)) && (localAtomicReferenceFieldUpdater.get(this) == null)) {}
    return (t0)localObject;
  }
  
  public final void v(dc.l<? super Throwable, rb.h> paraml)
  {
    if ((paraml instanceof i)) {
      paraml = (i)paraml;
    } else {
      paraml = new h(paraml, 1);
    }
    w(paraml);
  }
  
  public final void w(Object paramObject)
  {
    Object localObject1 = o;
    Object localObject2;
    int k;
    label339:
    do
    {
      int j;
      do
      {
        int i;
        do
        {
          localObject2 = ((AtomicReferenceFieldUpdater)localObject1).get(this);
          bool = localObject2 instanceof b;
          i = 1;
          j = 1;
          k = 1;
          if (!bool) {
            break;
          }
          localObject3 = o;
          while (!((AtomicReferenceFieldUpdater)localObject3).compareAndSet(this, localObject2, paramObject)) {
            if (((AtomicReferenceFieldUpdater)localObject3).get(this) != localObject2) {
              k = 0;
            }
          }
        } while (k == 0);
        return;
        if ((localObject2 instanceof i)) {
          bool = true;
        } else {
          bool = localObject2 instanceof sc.t;
        }
        localObject3 = null;
        if (bool) {
          break label415;
        }
        boolean bool = localObject2 instanceof u;
        if (bool)
        {
          localObject1 = (u)localObject2;
          localObject1.getClass();
          if (u.b.compareAndSet(localObject1, 0, 1))
          {
            if ((localObject2 instanceof m))
            {
              if (!bool) {
                localObject1 = null;
              }
              if (localObject1 != null) {
                localObject3 = a;
              }
              if ((paramObject instanceof i))
              {
                l((i)paramObject, (Throwable)localObject3);
              }
              else
              {
                ec.i.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                o((sc.t)paramObject, (Throwable)localObject3);
              }
            }
            return;
          }
          y(paramObject, localObject2);
          throw null;
        }
        if (!(localObject2 instanceof t)) {
          break label339;
        }
        localObject4 = (t)localObject2;
        if (b != null) {
          break;
        }
        if ((paramObject instanceof sc.t)) {
          return;
        }
        ec.i.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
        i locali = (i)paramObject;
        localObject3 = e;
        if (localObject3 != null) {
          k = 1;
        } else {
          k = 0;
        }
        if (k != 0)
        {
          l(locali, (Throwable)localObject3);
          return;
        }
        localObject3 = t.a((t)localObject4, locali, null, 29);
        localObject4 = o;
        do
        {
          if (((AtomicReferenceFieldUpdater)localObject4).compareAndSet(this, localObject2, localObject3))
          {
            k = i;
            break;
          }
        } while (((AtomicReferenceFieldUpdater)localObject4).get(this) == localObject2);
        k = 0;
      } while (k == 0);
      return;
      y(paramObject, localObject2);
      throw null;
      if ((paramObject instanceof sc.t)) {
        return;
      }
      ec.i.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
      Object localObject4 = new t(localObject2, (i)paramObject, null, null, 28);
      Object localObject3 = o;
      do
      {
        if (((AtomicReferenceFieldUpdater)localObject3).compareAndSet(this, localObject2, localObject4))
        {
          k = j;
          break;
        }
      } while (((AtomicReferenceFieldUpdater)localObject3).get(this) == localObject2);
      k = 0;
    } while (k == 0);
    return;
    label415:
    y(paramObject, localObject2);
    throw null;
  }
  
  public final boolean x()
  {
    int i = c;
    boolean bool = true;
    if (i == 2) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      Object localObject = d;
      ec.i.c(localObject, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
      localObject = (g)localObject;
      if (g.p.get(localObject) != null) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public String z()
  {
    return "CancellableContinuation";
  }
}

/* Location:
 * Qualified Name:     nc.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */