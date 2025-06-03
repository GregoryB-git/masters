package sc;

import dc.l;
import f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.g0;
import nc.p0;
import nc.v;
import ub.e;
import ub.h;
import wb.d;

public final class g<T>
  extends p0<T>
  implements d, e<T>
{
  public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation");
  private volatile Object _reusableCancellableContinuation;
  public final nc.a0 d;
  public final e<T> e;
  public Object f;
  public final Object o;
  
  public g(nc.a0 parama0, e<? super T> parame)
  {
    super(-1);
    d = parama0;
    e = parame;
    f = b.a0.Y;
    o = w.b(getContext());
  }
  
  public final void a(Object paramObject, CancellationException paramCancellationException)
  {
    if ((paramObject instanceof v)) {
      b.invoke(paramCancellationException);
    }
  }
  
  public final e<T> d()
  {
    return this;
  }
  
  public final d getCallerFrame()
  {
    Object localObject = e;
    if ((localObject instanceof d)) {
      localObject = (d)localObject;
    } else {
      localObject = null;
    }
    return (d)localObject;
  }
  
  public final h getContext()
  {
    return e.getContext();
  }
  
  public final Object k()
  {
    Object localObject = f;
    f = b.a0.Y;
    return localObject;
  }
  
  /* Error */
  public final void resumeWith(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 43	sc/g:e	Lub/e;
    //   4: invokeinterface 83 1 0
    //   9: astore_2
    //   10: aload_1
    //   11: invokestatic 92	rb/e:a	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   14: astore_3
    //   15: aload_3
    //   16: ifnonnull +8 -> 24
    //   19: aload_1
    //   20: astore_3
    //   21: goto +13 -> 34
    //   24: new 94	nc/u
    //   27: dup
    //   28: aload_3
    //   29: iconst_0
    //   30: invokespecial 97	nc/u:<init>	(Ljava/lang/Throwable;Z)V
    //   33: astore_3
    //   34: aload_0
    //   35: getfield 41	sc/g:d	Lnc/a0;
    //   38: invokevirtual 103	nc/a0:B0	()Z
    //   41: ifeq +25 -> 66
    //   44: aload_0
    //   45: aload_3
    //   46: putfield 51	sc/g:f	Ljava/lang/Object;
    //   49: aload_0
    //   50: iconst_0
    //   51: putfield 107	nc/p0:c	I
    //   54: aload_0
    //   55: getfield 41	sc/g:d	Lnc/a0;
    //   58: aload_2
    //   59: aload_0
    //   60: invokevirtual 111	nc/a0:z0	(Lub/h;Ljava/lang/Runnable;)V
    //   63: goto +104 -> 167
    //   66: invokestatic 116	nc/c2:a	()Lnc/x0;
    //   69: astore_2
    //   70: aload_2
    //   71: invokevirtual 121	nc/x0:F0	()Z
    //   74: ifeq +21 -> 95
    //   77: aload_0
    //   78: aload_3
    //   79: putfield 51	sc/g:f	Ljava/lang/Object;
    //   82: aload_0
    //   83: iconst_0
    //   84: putfield 107	nc/p0:c	I
    //   87: aload_2
    //   88: aload_0
    //   89: invokevirtual 125	nc/x0:D0	(Lnc/p0;)V
    //   92: goto +75 -> 167
    //   95: aload_2
    //   96: iconst_1
    //   97: invokevirtual 129	nc/x0:E0	(Z)V
    //   100: aload_0
    //   101: invokevirtual 55	sc/g:getContext	()Lub/h;
    //   104: astore 4
    //   106: aload 4
    //   108: aload_0
    //   109: getfield 63	sc/g:o	Ljava/lang/Object;
    //   112: invokestatic 132	sc/w:c	(Lub/h;Ljava/lang/Object;)Ljava/lang/Object;
    //   115: astore_3
    //   116: aload_0
    //   117: getfield 43	sc/g:e	Lub/e;
    //   120: aload_1
    //   121: invokeinterface 134 2 0
    //   126: getstatic 139	rb/h:a	Lrb/h;
    //   129: astore_1
    //   130: aload 4
    //   132: aload_3
    //   133: invokestatic 142	sc/w:a	(Lub/h;Ljava/lang/Object;)V
    //   136: aload_2
    //   137: invokevirtual 145	nc/x0:H0	()Z
    //   140: ifne -4 -> 136
    //   143: goto +19 -> 162
    //   146: astore_1
    //   147: aload 4
    //   149: aload_3
    //   150: invokestatic 142	sc/w:a	(Lub/h;Ljava/lang/Object;)V
    //   153: aload_1
    //   154: athrow
    //   155: astore_1
    //   156: aload_0
    //   157: aload_1
    //   158: aconst_null
    //   159: invokevirtual 149	nc/p0:i	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   162: aload_2
    //   163: iconst_1
    //   164: invokevirtual 152	nc/x0:C0	(Z)V
    //   167: return
    //   168: astore_1
    //   169: aload_2
    //   170: iconst_1
    //   171: invokevirtual 152	nc/x0:C0	(Z)V
    //   174: aload_1
    //   175: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	this	g
    //   0	176	1	paramObject	Object
    //   9	161	2	localObject1	Object
    //   14	136	3	localObject2	Object
    //   104	44	4	localh	h
    // Exception table:
    //   from	to	target	type
    //   116	130	146	finally
    //   100	116	155	finally
    //   130	136	155	finally
    //   136	143	155	finally
    //   147	155	155	finally
    //   156	162	168	finally
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("DispatchedContinuation[");
    localStringBuilder.append(d);
    localStringBuilder.append(", ");
    localStringBuilder.append(g0.c(e));
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     sc.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */