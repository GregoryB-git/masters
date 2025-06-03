package u6;

import X5.d;
import X5.g;
import Z5.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import p6.A;
import p6.M;
import p6.U;
import p6.m;
import u.b;

public final class j
  extends U
  implements e, d
{
  public static final AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_reusableCancellableContinuation");
  private volatile Object _reusableCancellableContinuation;
  public final p6.F r;
  public final d s;
  public Object t;
  public final Object u;
  
  public j(p6.F paramF, d paramd)
  {
    super(-1);
    r = paramF;
    s = paramd;
    t = k.a();
    u = J.b(getContext());
  }
  
  public void b(Object paramObject, Throwable paramThrowable)
  {
    if ((paramObject instanceof A)) {
      b.invoke(paramThrowable);
    }
  }
  
  public d c()
  {
    return this;
  }
  
  public e getCallerFrame()
  {
    Object localObject = s;
    if ((localObject instanceof e)) {
      localObject = (e)localObject;
    } else {
      localObject = null;
    }
    return (e)localObject;
  }
  
  public g getContext()
  {
    return s.getContext();
  }
  
  public Object i()
  {
    Object localObject = t;
    t = k.a();
    return localObject;
  }
  
  public final void k()
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = v;
    while (localAtomicReferenceFieldUpdater.get(this) == k.b) {}
  }
  
  public final m l()
  {
    Object localObject1 = v;
    Object localObject2;
    do
    {
      do
      {
        localObject2 = ((AtomicReferenceFieldUpdater)localObject1).get(this);
        if (localObject2 == null)
        {
          v.set(this, k.b);
          return null;
        }
        if (!(localObject2 instanceof m)) {
          break;
        }
      } while (!b.a(v, this, localObject2, k.b));
      return (m)localObject2;
    } while ((localObject2 == k.b) || ((localObject2 instanceof Throwable)));
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Inconsistent state ");
    ((StringBuilder)localObject1).append(localObject2);
    throw new IllegalStateException(((StringBuilder)localObject1).toString().toString());
  }
  
  public final m m()
  {
    Object localObject = v.get(this);
    if ((localObject instanceof m)) {
      localObject = (m)localObject;
    } else {
      localObject = null;
    }
    return (m)localObject;
  }
  
  public final boolean n()
  {
    boolean bool;
    if (v.get(this) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean q(Throwable paramThrowable)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = v;
    Object localObject;
    do
    {
      F localF;
      do
      {
        localObject = localAtomicReferenceFieldUpdater.get(this);
        localF = k.b;
        if (!Intrinsics.a(localObject, localF)) {
          break;
        }
      } while (!b.a(v, this, localF, paramThrowable));
      return true;
      if ((localObject instanceof Throwable)) {
        return true;
      }
    } while (!b.a(v, this, localObject, null));
    return false;
  }
  
  public final void r()
  {
    k();
    m localm = m();
    if (localm != null) {
      localm.r();
    }
  }
  
  /* Error */
  public void resumeWith(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 41	u6/j:s	LX5/d;
    //   4: invokeinterface 78 1 0
    //   9: astore_2
    //   10: aload_1
    //   11: aconst_null
    //   12: iconst_1
    //   13: aconst_null
    //   14: invokestatic 149	p6/D:d	(Ljava/lang/Object;Lg6/l;ILjava/lang/Object;)Ljava/lang/Object;
    //   17: astore_3
    //   18: aload_0
    //   19: getfield 39	u6/j:r	Lp6/F;
    //   22: aload_2
    //   23: invokevirtual 155	p6/F:F	(LX5/g;)Z
    //   26: ifeq +25 -> 51
    //   29: aload_0
    //   30: aload_3
    //   31: putfield 49	u6/j:t	Ljava/lang/Object;
    //   34: aload_0
    //   35: iconst_0
    //   36: putfield 158	p6/U:q	I
    //   39: aload_0
    //   40: getfield 39	u6/j:r	Lp6/F;
    //   43: aload_2
    //   44: aload_0
    //   45: invokevirtual 162	p6/F:E	(LX5/g;Ljava/lang/Runnable;)V
    //   48: goto +117 -> 165
    //   51: getstatic 167	p6/L0:a	Lp6/L0;
    //   54: invokevirtual 170	p6/L0:b	()Lp6/a0;
    //   57: astore_2
    //   58: aload_2
    //   59: invokevirtual 175	p6/a0:O	()Z
    //   62: ifeq +21 -> 83
    //   65: aload_0
    //   66: aload_3
    //   67: putfield 49	u6/j:t	Ljava/lang/Object;
    //   70: aload_0
    //   71: iconst_0
    //   72: putfield 158	p6/U:q	I
    //   75: aload_2
    //   76: aload_0
    //   77: invokevirtual 179	p6/a0:K	(Lp6/U;)V
    //   80: goto +85 -> 165
    //   83: aload_2
    //   84: iconst_1
    //   85: invokevirtual 183	p6/a0:M	(Z)V
    //   88: aload_0
    //   89: invokevirtual 53	u6/j:getContext	()LX5/g;
    //   92: astore 4
    //   94: aload 4
    //   96: aload_0
    //   97: getfield 61	u6/j:u	Ljava/lang/Object;
    //   100: invokestatic 186	u6/J:c	(LX5/g;Ljava/lang/Object;)Ljava/lang/Object;
    //   103: astore_3
    //   104: aload_0
    //   105: getfield 41	u6/j:s	LX5/d;
    //   108: aload_1
    //   109: invokeinterface 188 2 0
    //   114: getstatic 193	V5/t:a	LV5/t;
    //   117: astore_1
    //   118: aload 4
    //   120: aload_3
    //   121: invokestatic 196	u6/J:a	(LX5/g;Ljava/lang/Object;)V
    //   124: aload_2
    //   125: invokevirtual 199	p6/a0:R	()Z
    //   128: istore 5
    //   130: iload 5
    //   132: ifne -8 -> 124
    //   135: aload_2
    //   136: iconst_1
    //   137: invokevirtual 202	p6/a0:H	(Z)V
    //   140: goto +25 -> 165
    //   143: astore_1
    //   144: goto +12 -> 156
    //   147: astore_1
    //   148: aload 4
    //   150: aload_3
    //   151: invokestatic 196	u6/J:a	(LX5/g;Ljava/lang/Object;)V
    //   154: aload_1
    //   155: athrow
    //   156: aload_0
    //   157: aload_1
    //   158: aconst_null
    //   159: invokevirtual 206	p6/U:h	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   162: goto -27 -> 135
    //   165: return
    //   166: astore_1
    //   167: aload_2
    //   168: iconst_1
    //   169: invokevirtual 202	p6/a0:H	(Z)V
    //   172: aload_1
    //   173: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	174	0	this	j
    //   0	174	1	paramObject	Object
    //   9	159	2	localObject1	Object
    //   17	134	3	localObject2	Object
    //   92	57	4	localg	g
    //   128	3	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   88	104	143	finally
    //   118	124	143	finally
    //   124	130	143	finally
    //   148	156	143	finally
    //   104	118	147	finally
    //   156	162	166	finally
  }
  
  public final Throwable s(p6.l paraml)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = v;
    Object localObject;
    F localF;
    do
    {
      localObject = localAtomicReferenceFieldUpdater.get(this);
      localF = k.b;
      if (localObject != localF) {
        break;
      }
    } while (!b.a(v, this, localF, paraml));
    return null;
    if ((localObject instanceof Throwable))
    {
      if (b.a(v, this, localObject, null)) {
        return (Throwable)localObject;
      }
      throw new IllegalArgumentException("Failed requirement.".toString());
    }
    paraml = new StringBuilder();
    paraml.append("Inconsistent state ");
    paraml.append(localObject);
    throw new IllegalStateException(paraml.toString().toString());
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DispatchedContinuation[");
    localStringBuilder.append(r);
    localStringBuilder.append(", ");
    localStringBuilder.append(M.c(s));
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     u6.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */