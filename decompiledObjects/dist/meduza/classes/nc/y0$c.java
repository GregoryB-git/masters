package nc;

import d2.h0;
import f;
import p2.m0;
import rb.h;
import sc.x;
import sc.y;

public abstract class y0$c
  implements Runnable, Comparable<c>, t0, y
{
  private volatile Object _heap;
  public long a;
  public int b;
  
  public y0$c(long paramLong)
  {
    a = paramLong;
    b = -1;
  }
  
  public final int compareTo(Object paramObject)
  {
    paramObject = (c)paramObject;
    boolean bool = a - a < 0L;
    int i;
    if (bool) {
      bool = true;
    } else if (bool) {
      i = -1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public final void dispose()
  {
    try
    {
      Object localObject1 = _heap;
      h0 localh0 = m0.r;
      if (localObject1 == localh0) {
        return;
      }
      boolean bool = localObject1 instanceof y0.d;
      x localx = null;
      if (bool) {
        localObject1 = (y0.d)localObject1;
      } else {
        localObject1 = null;
      }
      if (localObject1 != null) {
        try
        {
          Object localObject4 = _heap;
          if ((localObject4 instanceof x)) {
            localx = (x)localObject4;
          }
          if (localx != null) {
            ((x)localObject1).c(b);
          }
        }
        finally {}
      }
      _heap = localh0;
      localObject1 = h.a;
      return;
    }
    finally {}
  }
  
  public final void f(y0.d paramd)
  {
    int i;
    if (_heap != m0.r) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      _heap = paramd;
      return;
    }
    throw new IllegalArgumentException("Failed requirement.".toString());
  }
  
  /* Error */
  public final int h(long paramLong, y0.d paramd, y0 paramy0)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 37	nc/y0$c:_heap	Ljava/lang/Object;
    //   6: astore 5
    //   8: getstatic 43	p2/m0:r	Ld2/h0;
    //   11: astore 6
    //   13: iconst_0
    //   14: istore 7
    //   16: aload 5
    //   18: aload 6
    //   20: if_acmpne +9 -> 29
    //   23: iconst_2
    //   24: istore 7
    //   26: goto +131 -> 157
    //   29: aload_3
    //   30: monitorenter
    //   31: aload_3
    //   32: getfield 73	sc/x:a	[Lsc/y;
    //   35: astore 5
    //   37: aload 5
    //   39: ifnull +12 -> 51
    //   42: aload 5
    //   44: iconst_0
    //   45: aaload
    //   46: astore 5
    //   48: goto +6 -> 54
    //   51: aconst_null
    //   52: astore 5
    //   54: aload 5
    //   56: checkcast 2	nc/y0$c
    //   59: astore 5
    //   61: aload 4
    //   63: invokestatic 77	nc/y0:K0	(Lnc/y0;)Z
    //   66: istore 8
    //   68: iload 8
    //   70: ifeq +9 -> 79
    //   73: aload_3
    //   74: monitorexit
    //   75: aload_0
    //   76: monitorexit
    //   77: iconst_1
    //   78: ireturn
    //   79: aload 5
    //   81: ifnonnull +6 -> 87
    //   84: goto +36 -> 120
    //   87: aload 5
    //   89: getfield 29	nc/y0$c:a	J
    //   92: lstore 9
    //   94: lload 9
    //   96: lload_1
    //   97: lsub
    //   98: lconst_0
    //   99: lcmp
    //   100: iflt +6 -> 106
    //   103: goto +6 -> 109
    //   106: lload 9
    //   108: lstore_1
    //   109: lload_1
    //   110: aload_3
    //   111: getfield 79	nc/y0$d:c	J
    //   114: lsub
    //   115: lconst_0
    //   116: lcmp
    //   117: ifle +8 -> 125
    //   120: aload_3
    //   121: lload_1
    //   122: putfield 79	nc/y0$d:c	J
    //   125: aload_0
    //   126: getfield 29	nc/y0$c:a	J
    //   129: lstore 9
    //   131: aload_3
    //   132: getfield 79	nc/y0$d:c	J
    //   135: lstore_1
    //   136: lload 9
    //   138: lload_1
    //   139: lsub
    //   140: lconst_0
    //   141: lcmp
    //   142: ifge +8 -> 150
    //   145: aload_0
    //   146: lload_1
    //   147: putfield 29	nc/y0$c:a	J
    //   150: aload_3
    //   151: aload_0
    //   152: invokevirtual 82	sc/x:a	(Lnc/y0$c;)V
    //   155: aload_3
    //   156: monitorexit
    //   157: aload_0
    //   158: monitorexit
    //   159: iload 7
    //   161: ireturn
    //   162: astore 4
    //   164: aload_3
    //   165: monitorexit
    //   166: aload 4
    //   168: athrow
    //   169: astore_3
    //   170: aload_0
    //   171: monitorexit
    //   172: aload_3
    //   173: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	174	0	this	c
    //   0	174	1	paramLong	long
    //   0	174	3	paramd	y0.d
    //   0	174	4	paramy0	y0
    //   6	82	5	localObject	Object
    //   11	8	6	localh0	h0
    //   14	146	7	i	int
    //   66	3	8	bool	boolean
    //   92	45	9	l	long
    // Exception table:
    //   from	to	target	type
    //   31	37	162	finally
    //   54	68	162	finally
    //   87	94	162	finally
    //   109	120	162	finally
    //   120	125	162	finally
    //   125	136	162	finally
    //   145	150	162	finally
    //   150	155	162	finally
    //   2	13	169	finally
    //   29	31	169	finally
    //   73	75	169	finally
    //   155	157	169	finally
    //   164	169	169	finally
  }
  
  public final void setIndex(int paramInt)
  {
    b = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("Delayed[nanos=");
    localStringBuilder.append(a);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     nc.y0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */