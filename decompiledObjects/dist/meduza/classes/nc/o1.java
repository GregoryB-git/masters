package nc;

import d2.h0;
import ec.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kc.d;
import n7.w;
import p2.m0;
import sc.j;
import sc.j.a;
import ub.h.a;
import ub.h.b;
import ub.h.b.a;
import ub.h.c;

public class o1
  implements j1, q, w1
{
  public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(o1.class, Object.class, "_state");
  public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(o1.class, Object.class, "_parentHandle");
  private volatile Object _parentHandle;
  private volatile Object _state;
  
  public o1(boolean paramBoolean)
  {
    w0 localw0;
    if (paramBoolean) {
      localw0 = m0.z;
    } else {
      localw0 = m0.y;
    }
    _state = localw0;
  }
  
  public static p O(j paramj)
  {
    j localj;
    for (;;)
    {
      localj = paramj;
      if (!paramj.k()) {
        break;
      }
      paramj = paramj.j();
    }
    do
    {
      do
      {
        paramj = localj.i();
        localj = paramj;
      } while (paramj.k());
      if ((paramj instanceof p)) {
        return (p)paramj;
      }
      localj = paramj;
    } while (!(paramj instanceof t1));
    return null;
  }
  
  public static String V(Object paramObject)
  {
    if ((paramObject instanceof c))
    {
      paramObject = (c)paramObject;
      if (((c)paramObject).d()) {
        return "Cancelling";
      }
      if (((c)paramObject).e()) {
        return "Completing";
      }
    }
    else
    {
      if (!(paramObject instanceof f1)) {
        break label69;
      }
      if (!((f1)paramObject).isActive()) {
        break label63;
      }
    }
    return "Active";
    label63:
    return "New";
    label69:
    if ((paramObject instanceof u)) {
      paramObject = "Cancelled";
    } else {
      paramObject = "Completed";
    }
    return (String)paramObject;
  }
  
  public static CancellationException W(o1 paramo1, Throwable paramThrowable)
  {
    paramo1.getClass();
    CancellationException localCancellationException;
    if ((paramThrowable instanceof CancellationException)) {
      localCancellationException = (CancellationException)paramThrowable;
    } else {
      localCancellationException = null;
    }
    Object localObject = localCancellationException;
    if (localCancellationException == null) {
      localObject = new k1(paramo1.u(), paramThrowable, paramo1);
    }
    return (CancellationException)localObject;
  }
  
  public final Throwable A(c paramc, ArrayList paramArrayList)
  {
    boolean bool = paramArrayList.isEmpty();
    Object localObject1 = null;
    if (bool)
    {
      if (paramc.d()) {
        return new k1(u(), null, this);
      }
      return null;
    }
    Object localObject2 = paramArrayList.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      paramc = ((Iterator)localObject2).next();
      if (((Throwable)paramc instanceof CancellationException ^ true)) {
        break label80;
      }
    }
    paramc = null;
    label80:
    paramc = (Throwable)paramc;
    if (paramc != null) {
      return paramc;
    }
    localObject2 = (Throwable)paramArrayList.get(0);
    if ((localObject2 instanceof d2))
    {
      paramArrayList = paramArrayList.iterator();
      int i;
      do
      {
        paramc = (c)localObject1;
        if (!paramArrayList.hasNext()) {
          break;
        }
        paramc = paramArrayList.next();
        Throwable localThrowable = (Throwable)paramc;
        if ((localThrowable != localObject2) && ((localThrowable instanceof d2))) {
          i = 1;
        } else {
          i = 0;
        }
      } while (i == 0);
      paramc = (Throwable)paramc;
      if (paramc != null) {
        return paramc;
      }
    }
    return (Throwable)localObject2;
  }
  
  public boolean B()
  {
    return true;
  }
  
  public boolean D()
  {
    return this instanceof s;
  }
  
  public final t1 E(f1 paramf1)
  {
    t1 localt1 = paramf1.b();
    Object localObject = localt1;
    if (localt1 == null) {
      if ((paramf1 instanceof w0))
      {
        localObject = new t1();
      }
      else if ((paramf1 instanceof n1))
      {
        T((n1)paramf1);
        localObject = null;
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("State should have list: ");
        ((StringBuilder)localObject).append(paramf1);
        throw new IllegalStateException(((StringBuilder)localObject).toString().toString());
      }
    }
    return (t1)localObject;
  }
  
  public final Object F()
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = a;
    for (;;)
    {
      Object localObject = localAtomicReferenceFieldUpdater.get(this);
      if (!(localObject instanceof sc.p)) {
        return localObject;
      }
      ((sc.p)localObject).a(this);
    }
  }
  
  public boolean G(Throwable paramThrowable)
  {
    return false;
  }
  
  public void H(w paramw)
  {
    throw paramw;
  }
  
  public final void J(j1 paramj1)
  {
    if (paramj1 == null)
    {
      paramj1 = u1.a;
      b.set(this, paramj1);
      return;
    }
    paramj1.start();
    o localo = paramj1.attachChild(this);
    paramj1 = b;
    paramj1.set(this, localo);
    if (isCompleted())
    {
      localo.dispose();
      paramj1.set(this, u1.a);
    }
  }
  
  public boolean K()
  {
    return this instanceof f;
  }
  
  public final Object L(Object paramObject)
  {
    do
    {
      localObject = X(F(), paramObject);
      if (localObject == m0.t) {
        break;
      }
    } while (localObject == m0.v);
    return localObject;
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Job ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" is already complete or completing, but is being completed with ");
    ((StringBuilder)localObject).append(paramObject);
    String str = ((StringBuilder)localObject).toString();
    boolean bool = paramObject instanceof u;
    localObject = null;
    if (bool) {
      paramObject = (u)paramObject;
    } else {
      paramObject = null;
    }
    if (paramObject != null) {
      localObject = a;
    }
    throw new IllegalStateException(str, (Throwable)localObject);
  }
  
  public String N()
  {
    return getClass().getSimpleName();
  }
  
  /* Error */
  public final void P(t1 paramt1, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 271	sc/j:h	()Ljava/lang/Object;
    //   4: astore_3
    //   5: aload_3
    //   6: ldc_w 273
    //   9: invokestatic 278	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_3
    //   13: checkcast 69	sc/j
    //   16: astore_3
    //   17: aconst_null
    //   18: astore 4
    //   20: aload_3
    //   21: aload_1
    //   22: invokestatic 281	ec/i:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   25: ifne +129 -> 154
    //   28: aload 4
    //   30: astore 5
    //   32: aload_3
    //   33: instanceof 283
    //   36: ifeq +106 -> 142
    //   39: aload_3
    //   40: checkcast 170	nc/n1
    //   43: astore 5
    //   45: aload 5
    //   47: aload_2
    //   48: invokevirtual 289	nc/w:l	(Ljava/lang/Throwable;)V
    //   51: aload 4
    //   53: astore 5
    //   55: goto +87 -> 142
    //   58: astore 6
    //   60: aload 4
    //   62: ifnull +17 -> 79
    //   65: aload 4
    //   67: aload 6
    //   69: invokestatic 294	x6/b:e	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   72: aload 4
    //   74: astore 5
    //   76: goto +66 -> 142
    //   79: new 176	java/lang/StringBuilder
    //   82: dup
    //   83: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   86: astore 4
    //   88: aload 4
    //   90: ldc_w 296
    //   93: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload 4
    //   99: aload 5
    //   101: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: aload 4
    //   107: ldc_w 298
    //   110: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload 4
    //   116: aload_0
    //   117: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: new 300	n7/w
    //   124: dup
    //   125: aload 4
    //   127: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   130: aload 6
    //   132: invokespecial 301	n7/w:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   135: astore 5
    //   137: getstatic 306	rb/h:a	Lrb/h;
    //   140: astore 4
    //   142: aload_3
    //   143: invokevirtual 80	sc/j:i	()Lsc/j;
    //   146: astore_3
    //   147: aload 5
    //   149: astore 4
    //   151: goto -131 -> 20
    //   154: aload 4
    //   156: ifnull +9 -> 165
    //   159: aload_0
    //   160: aload 4
    //   162: invokevirtual 308	nc/o1:H	(Ln7/w;)V
    //   165: aload_0
    //   166: aload_2
    //   167: invokevirtual 310	nc/o1:t	(Ljava/lang/Throwable;)Z
    //   170: pop
    //   171: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	this	o1
    //   0	172	1	paramt1	t1
    //   0	172	2	paramThrowable	Throwable
    //   4	143	3	localObject1	Object
    //   18	143	4	localObject2	Object
    //   30	118	5	localObject3	Object
    //   58	73	6	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   45	51	58	finally
  }
  
  public void R(Object paramObject) {}
  
  public void S() {}
  
  public final void T(n1 paramn1)
  {
    Object localObject1 = new t1();
    paramn1.getClass();
    j.b.lazySet(localObject1, paramn1);
    j.a.lazySet(localObject1, paramn1);
    Object localObject2;
    int i;
    do
    {
      localObject2 = paramn1.h();
      i = 0;
      if (localObject2 != paramn1) {
        break;
      }
      localObject2 = j.a;
      do
      {
        if (((AtomicReferenceFieldUpdater)localObject2).compareAndSet(paramn1, paramn1, localObject1))
        {
          i = 1;
          break;
        }
      } while (((AtomicReferenceFieldUpdater)localObject2).get(paramn1) == paramn1);
    } while (i == 0);
    ((j)localObject1).e(paramn1);
    localObject1 = paramn1.i();
    while ((!((AtomicReferenceFieldUpdater)localObject2).compareAndSet(this, paramn1, localObject1)) && (((AtomicReferenceFieldUpdater)localObject2).get(this) == paramn1)) {}
  }
  
  public final int U(Object paramObject)
  {
    boolean bool = paramObject instanceof w0;
    int i = 0;
    int j = 0;
    Object localObject1;
    Object localObject2;
    if (bool)
    {
      if (a) {
        return 0;
      }
      localObject1 = a;
      localObject2 = m0.z;
      do
      {
        if (((AtomicReferenceFieldUpdater)localObject1).compareAndSet(this, paramObject, localObject2))
        {
          j = 1;
          break;
        }
      } while (((AtomicReferenceFieldUpdater)localObject1).get(this) == paramObject);
      if (j == 0) {
        return -1;
      }
      S();
      return 1;
    }
    if ((paramObject instanceof e1))
    {
      localObject2 = a;
      localObject1 = a;
      do
      {
        if (((AtomicReferenceFieldUpdater)localObject2).compareAndSet(this, paramObject, localObject1))
        {
          j = 1;
          break;
        }
      } while (((AtomicReferenceFieldUpdater)localObject2).get(this) == paramObject);
      j = i;
      if (j == 0) {
        return -1;
      }
      S();
      return 1;
    }
    return 0;
  }
  
  public final Object X(Object paramObject1, Object paramObject2)
  {
    if (!(paramObject1 instanceof f1)) {
      return m0.t;
    }
    boolean bool = paramObject1 instanceof w0;
    int i = 1;
    int j = 0;
    Object localObject1;
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater;
    if (((bool) || ((paramObject1 instanceof n1))) && (!(paramObject1 instanceof p)) && (!(paramObject2 instanceof u)))
    {
      localObject1 = (f1)paramObject1;
      localAtomicReferenceFieldUpdater = a;
      if ((paramObject2 instanceof f1)) {
        paramObject1 = new g1((f1)paramObject2);
      } else {
        paramObject1 = paramObject2;
      }
      do
      {
        if (localAtomicReferenceFieldUpdater.compareAndSet(this, localObject1, paramObject1))
        {
          j = 1;
          break;
        }
      } while (localAtomicReferenceFieldUpdater.get(this) == localObject1);
      j = 0;
      if (j == 0)
      {
        j = 0;
      }
      else
      {
        R(paramObject2);
        w((f1)localObject1, paramObject2);
        j = i;
      }
      if (j != 0) {
        return paramObject2;
      }
      return m0.v;
    }
    Object localObject2 = (f1)paramObject1;
    t1 localt1 = E((f1)localObject2);
    Object localObject3;
    if (localt1 == null)
    {
      paramObject1 = m0.v;
    }
    else
    {
      bool = localObject2 instanceof c;
      localAtomicReferenceFieldUpdater = null;
      if (bool) {
        paramObject1 = (c)localObject2;
      } else {
        paramObject1 = null;
      }
      localObject1 = paramObject1;
      if (paramObject1 == null) {
        localObject1 = new c(localt1, null);
      }
      localObject3 = new ec.s();
    }
    try
    {
      if (((c)localObject1).e())
      {
        paramObject1 = m0.t;
      }
      else
      {
        c.b.set(localObject1, 1);
        if (localObject1 == localObject2) {
          break label311;
        }
        paramObject1 = a;
        do
        {
          if (((AtomicReferenceFieldUpdater)paramObject1).compareAndSet(this, localObject2, localObject1))
          {
            j = 1;
            break;
          }
        } while (((AtomicReferenceFieldUpdater)paramObject1).get(this) == localObject2);
        if (j != 0) {
          break label311;
        }
        paramObject1 = m0.v;
      }
      break label474;
      label311:
      bool = ((c)localObject1).d();
      if ((paramObject2 instanceof u)) {
        paramObject1 = (u)paramObject2;
      } else {
        paramObject1 = null;
      }
      if (paramObject1 != null) {
        ((c)localObject1).a(a);
      }
      paramObject1 = ((c)localObject1).c();
      if (!Boolean.valueOf(true ^ bool).booleanValue()) {
        paramObject1 = null;
      }
      a = paramObject1;
      localObject3 = rb.h.a;
      if (paramObject1 != null) {
        P(localt1, (Throwable)paramObject1);
      }
      if ((localObject2 instanceof p)) {
        paramObject1 = (p)localObject2;
      } else {
        paramObject1 = null;
      }
      if (paramObject1 == null)
      {
        localObject2 = ((f1)localObject2).b();
        paramObject1 = localAtomicReferenceFieldUpdater;
        if (localObject2 != null) {
          paramObject1 = O((j)localObject2);
        }
      }
      if ((paramObject1 != null) && (Y((c)localObject1, (p)paramObject1, paramObject2))) {
        paramObject1 = m0.u;
      } else {
        paramObject1 = y((c)localObject1, paramObject2);
      }
      label474:
      return paramObject1;
    }
    finally {}
  }
  
  public final boolean Y(c paramc, p paramp, Object paramObject)
  {
    p localp;
    do
    {
      if (j1.a.a(e, false, new b(this, paramc, paramp, paramObject), 1) != u1.a) {
        return true;
      }
      localp = O(paramp);
      paramp = localp;
    } while (localp != null);
    return false;
  }
  
  public final o attachChild(q paramq)
  {
    paramq = j1.a.a(this, true, new p(paramq), 2);
    ec.i.c(paramq, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    return (o)paramq;
  }
  
  public void cancel(CancellationException paramCancellationException)
  {
    Object localObject = paramCancellationException;
    if (paramCancellationException == null) {
      localObject = new k1(u(), null, this);
    }
    s((CancellationException)localObject);
  }
  
  public final <R> R fold(R paramR, dc.p<? super R, ? super h.b, ? extends R> paramp)
  {
    ec.i.e(paramp, "operation");
    return (R)paramp.invoke(paramR, this);
  }
  
  public final void g(o1 paramo1)
  {
    r(paramo1);
  }
  
  public final <E extends h.b> E get(h.c<E> paramc)
  {
    return h.b.a.a(this, paramc);
  }
  
  public final CancellationException getCancellationException()
  {
    Object localObject = F();
    boolean bool = localObject instanceof c;
    CancellationException localCancellationException = null;
    if (bool)
    {
      Throwable localThrowable = ((c)localObject).c();
      if (localThrowable != null)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(getClass().getSimpleName());
        ((StringBuilder)localObject).append(" is cancelling");
        String str = ((StringBuilder)localObject).toString();
        if ((localThrowable instanceof CancellationException)) {
          localCancellationException = (CancellationException)localThrowable;
        }
        localObject = localCancellationException;
        if (localCancellationException == null)
        {
          localObject = str;
          if (str == null) {
            localObject = u();
          }
          localObject = new k1((String)localObject, localThrowable, this);
        }
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
      if ((localObject instanceof f1)) {
        break label222;
      }
      if ((localObject instanceof u))
      {
        localObject = W(this, a);
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(getClass().getSimpleName());
        ((StringBuilder)localObject).append(" has completed normally");
        localObject = new k1(((StringBuilder)localObject).toString(), null, this);
      }
    }
    return (CancellationException)localObject;
    label222:
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Job is still new or active: ");
    ((StringBuilder)localObject).append(this);
    throw new IllegalStateException(((StringBuilder)localObject).toString().toString());
  }
  
  public final kc.b<j1> getChildren()
  {
    return new kc.e(new g(null, this));
  }
  
  public final Throwable getCompletionExceptionOrNull()
  {
    Object localObject = F();
    if ((localObject instanceof f1 ^ true))
    {
      boolean bool = localObject instanceof u;
      Throwable localThrowable = null;
      if (bool) {
        localObject = (u)localObject;
      } else {
        localObject = null;
      }
      if (localObject != null) {
        localThrowable = a;
      }
      return localThrowable;
    }
    throw new IllegalStateException("This job has not completed yet".toString());
  }
  
  public final h.c<?> getKey()
  {
    return j1.b.a;
  }
  
  public final uc.a getOnJoin()
  {
    h localh = h.a;
    ec.i.c(localh, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
    v.a(3, localh);
    return new uc.b((r)this, localh);
  }
  
  public final j1 getParent()
  {
    Object localObject = (o)b.get(this);
    if (localObject != null) {
      localObject = ((o)localObject).getParent();
    } else {
      localObject = null;
    }
    return (j1)localObject;
  }
  
  public final t0 invokeOnCompletion(dc.l<? super Throwable, rb.h> paraml)
  {
    return invokeOnCompletion(false, true, paraml);
  }
  
  public final t0 invokeOnCompletion(boolean paramBoolean1, boolean paramBoolean2, dc.l<? super Throwable, rb.h> paraml)
  {
    Object localObject1 = null;
    Object localObject2;
    Object localObject3;
    if (paramBoolean1)
    {
      if ((paraml instanceof l1)) {
        localObject2 = (l1)paraml;
      } else {
        localObject2 = null;
      }
      localObject3 = localObject2;
      if (localObject2 == null) {
        localObject3 = new h1(paraml);
      }
    }
    else
    {
      if ((paraml instanceof n1)) {
        localObject3 = (n1)paraml;
      } else {
        localObject3 = null;
      }
      if (localObject3 == null) {
        localObject3 = new i1(paraml);
      }
    }
    d = this;
    Object localObject4;
    t1 localt1;
    do
    {
      Object localObject5;
      for (;;)
      {
        localObject4 = F();
        Object localObject6;
        if ((localObject4 instanceof w0))
        {
          localObject5 = (w0)localObject4;
          if (a)
          {
            localObject2 = a;
            do
            {
              if (((AtomicReferenceFieldUpdater)localObject2).compareAndSet(this, localObject4, localObject3))
              {
                i = 1;
                break;
              }
            } while (((AtomicReferenceFieldUpdater)localObject2).get(this) == localObject4);
            int i = 0;
            if (i == 0) {
              continue;
            }
            return (t0)localObject3;
          }
          localObject2 = new t1();
          if (!a) {
            localObject2 = new e1((t1)localObject2);
          }
          localObject6 = a;
          if (((AtomicReferenceFieldUpdater)localObject6).compareAndSet(this, localObject5, localObject2)) {
            continue;
          }
          if (((AtomicReferenceFieldUpdater)localObject6).get(this) == localObject5) {
            break;
          }
          continue;
        }
        if (!(localObject4 instanceof f1)) {
          break label441;
        }
        localt1 = ((f1)localObject4).b();
        if (localt1 == null)
        {
          ec.i.c(localObject4, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
          T((n1)localObject4);
        }
        else
        {
          localObject5 = u1.a;
          if ((paramBoolean1) && ((localObject4 instanceof c))) {
            try
            {
              localObject6 = ((c)localObject4).c();
              if (localObject6 != null)
              {
                localObject2 = localObject5;
                if ((paraml instanceof p))
                {
                  localObject2 = localObject5;
                  if (((c)localObject4).e()) {}
                }
              }
              else
              {
                boolean bool = o(localObject4, localt1, (n1)localObject3);
                if (!bool) {
                  continue;
                }
                if (localObject6 == null) {
                  return (t0)localObject3;
                }
                localObject2 = localObject3;
              }
              localObject5 = rb.h.a;
              localObject5 = localObject2;
              localObject2 = localObject6;
            }
            finally {}
          }
        }
      }
      localObject2 = null;
      if (localObject2 != null)
      {
        if (paramBoolean2) {
          paraml.invoke(localObject2);
        }
        return (t0)localObject5;
      }
    } while (!o(localObject4, localt1, (n1)localObject3));
    return (t0)localObject3;
    label441:
    if (paramBoolean2)
    {
      if ((localObject4 instanceof u)) {
        localObject3 = (u)localObject4;
      } else {
        localObject3 = null;
      }
      localObject2 = localObject1;
      if (localObject3 != null) {
        localObject2 = a;
      }
      paraml.invoke(localObject2);
    }
    return u1.a;
  }
  
  public boolean isActive()
  {
    Object localObject = F();
    boolean bool;
    if (((localObject instanceof f1)) && (((f1)localObject).isActive())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isCancelled()
  {
    Object localObject = F();
    boolean bool;
    if ((!(localObject instanceof u)) && ((!(localObject instanceof c)) || (!((c)localObject).d()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean isCompleted()
  {
    return F() instanceof f1 ^ true;
  }
  
  public final Object join(ub.e<? super rb.h> parame)
  {
    do
    {
      localObject = F();
      if (!(localObject instanceof f1))
      {
        i = 0;
        break;
      }
    } while (U(localObject) < 0);
    int i = 1;
    if (i == 0)
    {
      m0.C(parame.getContext());
      return rb.h.a;
    }
    parame = new l(1, m0.P(parame));
    parame.t();
    parame.v(new u0(invokeOnCompletion(new y1(parame))));
    parame = parame.s();
    Object localObject = vb.a.a;
    if (parame != localObject) {
      parame = rb.h.a;
    }
    if (parame == localObject) {
      return parame;
    }
    return rb.h.a;
  }
  
  public final CancellationException l0()
  {
    Object localObject1 = F();
    boolean bool = localObject1 instanceof c;
    Object localObject2 = null;
    if (bool)
    {
      localObject3 = ((c)localObject1).c();
    }
    else if ((localObject1 instanceof u))
    {
      localObject3 = a;
    }
    else
    {
      if ((localObject1 instanceof f1)) {
        break label113;
      }
      localObject3 = null;
    }
    if ((localObject3 instanceof CancellationException)) {
      localObject2 = (CancellationException)localObject3;
    }
    Object localObject4 = localObject2;
    if (localObject2 == null)
    {
      localObject2 = f.l("Parent job is ");
      ((StringBuilder)localObject2).append(V(localObject1));
      localObject4 = new k1(((StringBuilder)localObject2).toString(), (Throwable)localObject3, this);
    }
    return (CancellationException)localObject4;
    label113:
    Object localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append("Cannot be cancelling child in this state: ");
    ((StringBuilder)localObject3).append(localObject1);
    throw new IllegalStateException(((StringBuilder)localObject3).toString().toString());
  }
  
  public final ub.h minusKey(h.c<?> paramc)
  {
    return h.b.a.b(this, paramc);
  }
  
  public final boolean o(final Object paramObject, t1 paramt1, n1 paramn1)
  {
    f localf = new f(paramn1, this, paramObject);
    for (;;)
    {
      j localj = paramt1.j();
      j.b.lazySet(paramn1, localj);
      paramObject = j.a;
      ((AtomicReferenceFieldUpdater)paramObject).lazySet(paramn1, paramt1);
      c = paramt1;
      do
      {
        boolean bool1 = ((AtomicReferenceFieldUpdater)paramObject).compareAndSet(localj, paramt1, localf);
        bool2 = false;
        if (bool1)
        {
          i = 1;
          break;
        }
      } while (((AtomicReferenceFieldUpdater)paramObject).get(localj) == paramt1);
      int i = 0;
      if (i == 0) {
        i = 0;
      } else if (localf.a(localj) == null) {
        i = 1;
      } else {
        i = 2;
      }
      if (i == 1) {
        break;
      }
      if (i == 2) {
        break label129;
      }
    }
    boolean bool2 = true;
    label129:
    return bool2;
  }
  
  public void p(Object paramObject) {}
  
  public final j1 plus(j1 paramj1)
  {
    return paramj1;
  }
  
  public final ub.h plus(ub.h paramh)
  {
    ec.i.e(paramh, "context");
    return h.a.a(this, paramh);
  }
  
  public final Object q(ub.e<Object> parame)
  {
    do
    {
      localObject = F();
      if (!(localObject instanceof f1))
      {
        if (!(localObject instanceof u)) {
          return m0.f0(localObject);
        }
        throw a;
      }
    } while (U(localObject) < 0);
    parame = new a(m0.P(parame), this);
    parame.t();
    parame.v(new u0(invokeOnCompletion(new x1(parame))));
    parame = parame.s();
    Object localObject = vb.a.a;
    return parame;
  }
  
  public final boolean r(Object paramObject)
  {
    Object localObject1 = m0.t;
    boolean bool1 = D();
    boolean bool2 = true;
    if (bool1)
    {
      do
      {
        localObject1 = F();
        if ((!(localObject1 instanceof f1)) || (((localObject1 instanceof c)) && (((c)localObject1).e()))) {
          break;
        }
        localObject2 = X(localObject1, new u(x(paramObject), false));
      } while (localObject2 == m0.v);
      break label84;
      localObject2 = m0.t;
      label84:
      localObject1 = localObject2;
      if (localObject2 == m0.u) {
        return true;
      }
    }
    Object localObject2 = localObject1;
    if (localObject1 == m0.t)
    {
      Object localObject3 = null;
      localObject1 = null;
      Object localObject4;
      Object localObject5;
      label387:
      label402:
      do
      {
        int i;
        do
        {
          localObject4 = F();
          if ((localObject4 instanceof c)) {
            try
            {
              localObject2 = (c)localObject4;
              if (c.d.get(localObject2) == m0.x) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0)
              {
                paramObject = m0.w;
                break label488;
              }
              bool1 = ((c)localObject4).d();
              if ((paramObject != null) || (!bool1))
              {
                localObject2 = localObject1;
                if (localObject1 == null) {
                  localObject2 = x(paramObject);
                }
                ((c)localObject4).a((Throwable)localObject2);
              }
              localObject1 = ((c)localObject4).c();
              paramObject = localObject3;
              if ((bool1 ^ true)) {
                paramObject = localObject1;
              }
              if (paramObject == null) {
                break;
              }
              P(a, (Throwable)paramObject);
            }
            finally {}
          }
          if (!(localObject4 instanceof f1)) {
            break label484;
          }
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = x(paramObject);
          }
          localObject1 = (f1)localObject4;
          if (!((f1)localObject1).isActive()) {
            break label402;
          }
          localObject5 = E((f1)localObject1);
          if (localObject5 != null)
          {
            c localc = new c((t1)localObject5, (Throwable)localObject2);
            localObject4 = a;
            do
            {
              if (((AtomicReferenceFieldUpdater)localObject4).compareAndSet(this, localObject1, localc))
              {
                i = 1;
                break;
              }
            } while (((AtomicReferenceFieldUpdater)localObject4).get(this) == localObject1);
            i = 0;
            if (i != 0) {}
          }
          else
          {
            i = 0;
            break label387;
          }
          P((t1)localObject5, (Throwable)localObject2);
          i = 1;
          localObject1 = localObject2;
        } while (i == 0);
        paramObject = m0.t;
        break label488;
        localObject5 = X(localObject4, new u((Throwable)localObject2, false));
        if (localObject5 == m0.t) {
          break;
        }
        localObject1 = localObject2;
      } while (localObject5 == m0.v);
      localObject2 = localObject5;
      break label491;
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("Cannot happen in ");
      ((StringBuilder)paramObject).append(localObject4);
      throw new IllegalStateException(((StringBuilder)paramObject).toString().toString());
      label484:
      paramObject = m0.w;
      label488:
      localObject2 = paramObject;
    }
    label491:
    if ((localObject2 != m0.t) && (localObject2 != m0.u)) {
      if (localObject2 == m0.w) {
        bool2 = false;
      } else {
        p(localObject2);
      }
    }
    return bool2;
  }
  
  public void s(CancellationException paramCancellationException)
  {
    r(paramCancellationException);
  }
  
  public final boolean start()
  {
    int i;
    do
    {
      i = U(F());
      if (i == 0) {
        break;
      }
    } while (i != 1);
    return true;
    return false;
  }
  
  public final boolean t(Throwable paramThrowable)
  {
    boolean bool1 = K();
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    boolean bool3 = paramThrowable instanceof CancellationException;
    o localo = (o)b.get(this);
    if ((localo != null) && (localo != u1.a))
    {
      bool1 = bool2;
      if (!localo.g(paramThrowable)) {
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
  
  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(N());
    localStringBuilder2.append('{');
    localStringBuilder2.append(V(F()));
    localStringBuilder2.append('}');
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder1.append('@');
    localStringBuilder1.append(g0.b(this));
    return localStringBuilder1.toString();
  }
  
  public String u()
  {
    return "Job was cancelled";
  }
  
  public boolean v(Throwable paramThrowable)
  {
    boolean bool1 = paramThrowable instanceof CancellationException;
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    if ((!r(paramThrowable)) || (!B())) {
      bool2 = false;
    }
    return bool2;
  }
  
  /* Error */
  public final void w(f1 paramf1, Object paramObject)
  {
    // Byte code:
    //   0: getstatic 49	nc/o1:b	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   3: astore_3
    //   4: aload_3
    //   5: aload_0
    //   6: invokevirtual 199	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   9: checkcast 410	nc/o
    //   12: astore 4
    //   14: aload 4
    //   16: ifnull +18 -> 34
    //   19: aload 4
    //   21: invokeinterface 233 1 0
    //   26: aload_3
    //   27: aload_0
    //   28: getstatic 214	nc/u1:a	Lnc/u1;
    //   31: invokevirtual 218	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   34: aload_2
    //   35: instanceof 105
    //   38: istore 5
    //   40: aconst_null
    //   41: astore_3
    //   42: iload 5
    //   44: ifeq +11 -> 55
    //   47: aload_2
    //   48: checkcast 105	nc/u
    //   51: astore_2
    //   52: goto +5 -> 57
    //   55: aconst_null
    //   56: astore_2
    //   57: aload_2
    //   58: ifnull +11 -> 69
    //   61: aload_2
    //   62: getfield 257	nc/u:a	Ljava/lang/Throwable;
    //   65: astore_2
    //   66: goto +5 -> 71
    //   69: aconst_null
    //   70: astore_2
    //   71: aload_1
    //   72: instanceof 170
    //   75: ifeq +70 -> 145
    //   78: aload_1
    //   79: checkcast 170	nc/n1
    //   82: aload_2
    //   83: invokevirtual 289	nc/w:l	(Ljava/lang/Throwable;)V
    //   86: goto +221 -> 307
    //   89: astore_2
    //   90: new 176	java/lang/StringBuilder
    //   93: dup
    //   94: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   97: astore_3
    //   98: aload_3
    //   99: ldc_w 296
    //   102: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload_3
    //   107: aload_1
    //   108: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: aload_3
    //   113: ldc_w 298
    //   116: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: aload_3
    //   121: aload_0
    //   122: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: aload_0
    //   127: new 300	n7/w
    //   130: dup
    //   131: aload_3
    //   132: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: aload_2
    //   136: invokespecial 301	n7/w:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   139: invokevirtual 308	nc/o1:H	(Ln7/w;)V
    //   142: goto +165 -> 307
    //   145: aload_1
    //   146: invokeinterface 165 1 0
    //   151: astore 6
    //   153: aload 6
    //   155: ifnull +152 -> 307
    //   158: aload 6
    //   160: invokevirtual 271	sc/j:h	()Ljava/lang/Object;
    //   163: astore_1
    //   164: aload_1
    //   165: ldc_w 273
    //   168: invokestatic 278	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
    //   171: aload_1
    //   172: checkcast 69	sc/j
    //   175: astore_1
    //   176: aload_1
    //   177: aload 6
    //   179: invokestatic 281	ec/i:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   182: ifne +116 -> 298
    //   185: aload_3
    //   186: astore 4
    //   188: aload_1
    //   189: instanceof 170
    //   192: ifeq +95 -> 287
    //   195: aload_1
    //   196: checkcast 170	nc/n1
    //   199: astore 4
    //   201: aload 4
    //   203: aload_2
    //   204: invokevirtual 289	nc/w:l	(Ljava/lang/Throwable;)V
    //   207: aload_3
    //   208: astore 4
    //   210: goto +77 -> 287
    //   213: astore 7
    //   215: aload_3
    //   216: ifnull +15 -> 231
    //   219: aload_3
    //   220: aload 7
    //   222: invokestatic 294	x6/b:e	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   225: aload_3
    //   226: astore 4
    //   228: goto +59 -> 287
    //   231: new 176	java/lang/StringBuilder
    //   234: dup
    //   235: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   238: astore_3
    //   239: aload_3
    //   240: ldc_w 296
    //   243: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: pop
    //   247: aload_3
    //   248: aload 4
    //   250: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   253: pop
    //   254: aload_3
    //   255: ldc_w 298
    //   258: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: pop
    //   262: aload_3
    //   263: aload_0
    //   264: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   267: pop
    //   268: new 300	n7/w
    //   271: dup
    //   272: aload_3
    //   273: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   276: aload 7
    //   278: invokespecial 301	n7/w:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   281: astore 4
    //   283: getstatic 306	rb/h:a	Lrb/h;
    //   286: astore_3
    //   287: aload_1
    //   288: invokevirtual 80	sc/j:i	()Lsc/j;
    //   291: astore_1
    //   292: aload 4
    //   294: astore_3
    //   295: goto -119 -> 176
    //   298: aload_3
    //   299: ifnull +8 -> 307
    //   302: aload_0
    //   303: aload_3
    //   304: invokevirtual 308	nc/o1:H	(Ln7/w;)V
    //   307: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	308	0	this	o1
    //   0	308	1	paramf1	f1
    //   0	308	2	paramObject	Object
    //   3	301	3	localObject1	Object
    //   12	281	4	localObject2	Object
    //   38	5	5	bool	boolean
    //   151	27	6	localt1	t1
    //   213	64	7	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   78	86	89	finally
    //   201	207	213	finally
  }
  
  public final Throwable x(Object paramObject)
  {
    boolean bool;
    if (paramObject == null) {
      bool = true;
    } else {
      bool = paramObject instanceof Throwable;
    }
    if (bool)
    {
      Throwable localThrowable = (Throwable)paramObject;
      paramObject = localThrowable;
      if (localThrowable == null) {
        paramObject = new k1(u(), null, this);
      }
    }
    else
    {
      ec.i.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
      paramObject = ((w1)paramObject).l0();
    }
    return (Throwable)paramObject;
  }
  
  public final Object y(c paramc, Object paramObject)
  {
    boolean bool = paramObject instanceof u;
    Object localObject1 = null;
    Object localObject2;
    if (bool) {
      localObject2 = (u)paramObject;
    } else {
      localObject2 = null;
    }
    if (localObject2 != null) {
      localObject1 = a;
    }
    try
    {
      paramc.d();
      Object localObject3 = paramc.f((Throwable)localObject1);
      localObject2 = A(paramc, (ArrayList)localObject3);
      int i;
      if ((localObject2 != null) && (((List)localObject3).size() > 1))
      {
        i = ((List)localObject3).size();
        Object localObject4 = new java/util/IdentityHashMap;
        ((IdentityHashMap)localObject4).<init>(i);
        localObject4 = Collections.newSetFromMap((Map)localObject4);
        localObject3 = ((List)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          Throwable localThrowable = (Throwable)((Iterator)localObject3).next();
          if ((localThrowable != localObject2) && (localThrowable != localObject2) && (!(localThrowable instanceof CancellationException)) && (((Set)localObject4).add(localThrowable))) {
            x6.b.e((Throwable)localObject2, localThrowable);
          }
        }
      }
      if ((localObject2 != null) && (localObject2 != localObject1)) {
        paramObject = new u((Throwable)localObject2, false);
      }
      if (localObject2 != null)
      {
        if ((!t((Throwable)localObject2)) && (!G((Throwable)localObject2))) {
          i = 0;
        } else {
          i = 1;
        }
        if (i != 0)
        {
          ec.i.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
          localObject1 = (u)paramObject;
          u.b.compareAndSet(localObject1, 0, 1);
        }
      }
      R(paramObject);
      localObject2 = a;
      if ((paramObject instanceof f1)) {
        localObject1 = new g1((f1)paramObject);
      }
      while ((!((AtomicReferenceFieldUpdater)localObject2).compareAndSet(this, paramc, localObject1)) && (((AtomicReferenceFieldUpdater)localObject2).get(this) == paramc)) {}
      w(paramc, paramObject);
      return paramObject;
    }
    finally {}
  }
  
  public final Object z()
  {
    Object localObject = F();
    if ((localObject instanceof f1 ^ true))
    {
      if (!(localObject instanceof u)) {
        return m0.f0(localObject);
      }
      throw a;
    }
    throw new IllegalStateException("This job has not completed yet".toString());
  }
  
  public static final class a<T>
    extends l<T>
  {
    public final o1 q;
    
    public a(ub.e<? super T> parame, o1 paramo1)
    {
      super(parame);
      q = paramo1;
    }
    
    public final Throwable r(o1 paramo1)
    {
      Object localObject = q.F();
      if ((localObject instanceof o1.c))
      {
        Throwable localThrowable = ((o1.c)localObject).c();
        if (localThrowable != null) {
          return localThrowable;
        }
      }
      if ((localObject instanceof u)) {
        return a;
      }
      return paramo1.getCancellationException();
    }
    
    public final String z()
    {
      return "AwaitContinuation";
    }
  }
  
  public static final class b
    extends n1
  {
    public final o1 e;
    public final o1.c f;
    public final p o;
    public final Object p;
    
    public b(o1 paramo1, o1.c paramc, p paramp, Object paramObject)
    {
      e = paramo1;
      f = paramc;
      o = paramp;
      p = paramObject;
    }
    
    public final void l(Throwable paramThrowable)
    {
      o1 localo1 = e;
      o1.c localc = f;
      p localp = o;
      paramThrowable = p;
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = o1.a;
      localo1.getClass();
      localp = o1.O(localp);
      if ((localp == null) || (!localo1.Y(localc, localp, paramThrowable))) {
        localo1.p(localo1.y(localc, paramThrowable));
      }
    }
  }
  
  public static final class c
    implements f1
  {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting;
    private volatile Object _rootCause;
    public final t1 a;
    
    public c(t1 paramt1, Throwable paramThrowable)
    {
      a = paramt1;
      _isCompleting = 0;
      _rootCause = paramThrowable;
    }
    
    public final void a(Throwable paramThrowable)
    {
      Object localObject = c();
      if (localObject == null)
      {
        c.set(this, paramThrowable);
        return;
      }
      if (paramThrowable == localObject) {
        return;
      }
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = d;
      localObject = localAtomicReferenceFieldUpdater.get(this);
      if (localObject == null)
      {
        localAtomicReferenceFieldUpdater.set(this, paramThrowable);
      }
      else if ((localObject instanceof Throwable))
      {
        if (paramThrowable == localObject) {
          return;
        }
        ArrayList localArrayList = new ArrayList(4);
        localArrayList.add(localObject);
        localArrayList.add(paramThrowable);
        localAtomicReferenceFieldUpdater.set(this, localArrayList);
      }
      else
      {
        if (!(localObject instanceof ArrayList)) {
          break label111;
        }
        ((ArrayList)localObject).add(paramThrowable);
      }
      return;
      label111:
      paramThrowable = new StringBuilder();
      paramThrowable.append("State is ");
      paramThrowable.append(localObject);
      throw new IllegalStateException(paramThrowable.toString().toString());
    }
    
    public final t1 b()
    {
      return a;
    }
    
    public final Throwable c()
    {
      return (Throwable)c.get(this);
    }
    
    public final boolean d()
    {
      boolean bool;
      if (c() != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean e()
    {
      boolean bool;
      if (b.get(this) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final ArrayList f(Throwable paramThrowable)
    {
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = d;
      Object localObject = localAtomicReferenceFieldUpdater.get(this);
      ArrayList localArrayList;
      if (localObject == null)
      {
        localArrayList = new ArrayList(4);
      }
      else if ((localObject instanceof Throwable))
      {
        localArrayList = new ArrayList(4);
        localArrayList.add(localObject);
      }
      else
      {
        if (!(localObject instanceof ArrayList)) {
          break label113;
        }
        localArrayList = (ArrayList)localObject;
      }
      localObject = c();
      if (localObject != null) {
        localArrayList.add(0, localObject);
      }
      if ((paramThrowable != null) && (!ec.i.a(paramThrowable, localObject))) {
        localArrayList.add(paramThrowable);
      }
      localAtomicReferenceFieldUpdater.set(this, m0.x);
      return localArrayList;
      label113:
      paramThrowable = new StringBuilder();
      paramThrowable.append("State is ");
      paramThrowable.append(localObject);
      throw new IllegalStateException(paramThrowable.toString().toString());
    }
    
    public final boolean isActive()
    {
      boolean bool;
      if (c() == null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("Finishing[cancelling=");
      localStringBuilder.append(d());
      localStringBuilder.append(", completing=");
      localStringBuilder.append(e());
      localStringBuilder.append(", rootCause=");
      localStringBuilder.append(c());
      localStringBuilder.append(", exceptions=");
      localStringBuilder.append(d.get(this));
      localStringBuilder.append(", list=");
      localStringBuilder.append(a);
      localStringBuilder.append(']');
      return localStringBuilder.toString();
    }
  }
  
  public final class d
    extends n1
  {
    public final uc.f<?> e;
    
    public d()
    {
      uc.f localf;
      e = localf;
    }
    
    public final void l(Throwable paramThrowable)
    {
      paramThrowable = F();
      if (!(paramThrowable instanceof u)) {
        paramThrowable = m0.f0(paramThrowable);
      }
      e.e(o1.this, paramThrowable);
    }
  }
  
  public final class e
    extends n1
  {
    public final uc.f<?> e;
    
    public e()
    {
      uc.f localf;
      e = localf;
    }
    
    public final void l(Throwable paramThrowable)
    {
      e.e(o1.this, rb.h.a);
    }
  }
  
  public static final class f
    extends j.a
  {
    public f(j paramj, o1 paramo1, Object paramObject)
    {
      super();
    }
    
    public final h0 c(Object paramObject)
    {
      paramObject = (j)paramObject;
      int i;
      if (jdField_this.F() == paramObject) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        paramObject = null;
      } else {
        paramObject = m0.D;
      }
      return (h0)paramObject;
    }
  }
  
  @wb.e(c="kotlinx.coroutines.JobSupport$children$1", f="JobSupport.kt", l={956, 958}, m="invokeSuspend")
  public static final class g
    extends wb.h
    implements dc.p<d<? super j1>, ub.e<? super rb.h>, Object>
  {
    public sc.i b;
    public j c;
    public int d;
    
    public g(ub.e parame, o1 paramo1)
    {
      super();
    }
    
    public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
    {
      parame = new g(parame, jdField_this);
      e = paramObject;
      return parame;
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((g)create((d)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      vb.a locala = vb.a.a;
      int i = d;
      Object localObject1;
      Object localObject2;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      Object localObject6;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i == 2)
          {
            localObject1 = c;
            localObject2 = b;
            localObject3 = (d)e;
            rb.f.b(paramObject);
            localObject4 = this;
          }
          else
          {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          rb.f.b(paramObject);
          break label284;
        }
      }
      else
      {
        rb.f.b(paramObject);
        localObject5 = (d)e;
        paramObject = jdField_this.F();
        if ((paramObject instanceof p))
        {
          paramObject = e;
          d = 1;
          ((d)localObject5).a(paramObject, this);
          return locala;
        }
        if (!(paramObject instanceof f1)) {
          break label284;
        }
        localObject6 = ((f1)paramObject).b();
        if (localObject6 == null) {
          break label284;
        }
        paramObject = ((j)localObject6).h();
        ec.i.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        paramObject = (j)paramObject;
      }
      for (Object localObject7 = this; !ec.i.a(paramObject, localObject6); localObject7 = localObject4)
      {
        localObject1 = paramObject;
        localObject2 = localObject6;
        localObject3 = localObject5;
        localObject4 = localObject7;
        if ((paramObject instanceof p))
        {
          localObject2 = e;
          e = localObject5;
          b = ((sc.i)localObject6);
          c = ((j)paramObject);
          d = 2;
          ((d)localObject5).a(localObject2, (ub.e)localObject7);
          localObject1 = paramObject;
          localObject2 = localObject6;
          localObject3 = localObject5;
          localObject4 = localObject7;
          if (vb.a.a == locala) {
            return locala;
          }
        }
        paramObject = ((j)localObject1).i();
        localObject6 = localObject2;
        localObject5 = localObject3;
      }
      label284:
      return rb.h.a;
    }
  }
}

/* Location:
 * Qualified Name:     nc.o1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */