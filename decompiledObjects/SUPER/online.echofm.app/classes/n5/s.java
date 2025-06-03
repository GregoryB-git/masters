package n5;

import java.util.AbstractList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class s
  implements q
{
  public final String a;
  public final int b;
  public final int c;
  public final LinkedList d = new LinkedList();
  public final Set e = new HashSet();
  public final Set f = new HashSet();
  public final Map g = new HashMap();
  
  public s(String paramString, int paramInt1, int paramInt2)
  {
    a = paramString;
    b = paramInt1;
    c = paramInt2;
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 33	n5/s:e	Ljava/util/Set;
    //   6: invokeinterface 57 1 0
    //   11: astore_1
    //   12: aload_1
    //   13: invokeinterface 63 1 0
    //   18: ifeq +22 -> 40
    //   21: aload_1
    //   22: invokeinterface 67 1 0
    //   27: checkcast 69	n5/o
    //   30: invokevirtual 71	n5/o:f	()V
    //   33: goto -21 -> 12
    //   36: astore_1
    //   37: goto +40 -> 77
    //   40: aload_0
    //   41: getfield 35	n5/s:f	Ljava/util/Set;
    //   44: invokeinterface 57 1 0
    //   49: astore_1
    //   50: aload_1
    //   51: invokeinterface 63 1 0
    //   56: ifeq +18 -> 74
    //   59: aload_1
    //   60: invokeinterface 67 1 0
    //   65: checkcast 69	n5/o
    //   68: invokevirtual 71	n5/o:f	()V
    //   71: goto -21 -> 50
    //   74: aload_0
    //   75: monitorexit
    //   76: return
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	s
    //   11	11	1	localIterator1	Iterator
    //   36	1	1	localObject	Object
    //   49	31	1	localIterator2	Iterator
    // Exception table:
    //   from	to	target	type
    //   2	12	36	finally
    //   12	33	36	finally
    //   40	50	36	finally
    //   50	71	36	finally
  }
  
  /* Error */
  public void c(m paramm)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 28	n5/s:d	Ljava/util/LinkedList;
    //   6: aload_1
    //   7: invokevirtual 82	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   10: pop
    //   11: new 30	java/util/HashSet
    //   14: astore_1
    //   15: aload_1
    //   16: aload_0
    //   17: getfield 33	n5/s:e	Ljava/util/Set;
    //   20: invokespecial 85	java/util/HashSet:<init>	(Ljava/util/Collection;)V
    //   23: aload_1
    //   24: invokeinterface 57 1 0
    //   29: astore_1
    //   30: aload_1
    //   31: invokeinterface 63 1 0
    //   36: ifeq +23 -> 59
    //   39: aload_0
    //   40: aload_1
    //   41: invokeinterface 67 1 0
    //   46: checkcast 69	n5/o
    //   49: invokevirtual 88	n5/s:i	(Ln5/o;)V
    //   52: goto -22 -> 30
    //   55: astore_1
    //   56: goto +6 -> 62
    //   59: aload_0
    //   60: monitorexit
    //   61: return
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	s
    //   0	66	1	paramm	m
    // Exception table:
    //   from	to	target	type
    //   2	30	55	finally
    //   30	52	55	finally
  }
  
  public o e(String paramString, int paramInt)
  {
    return new o(paramString, paramInt);
  }
  
  public final m f(o paramo)
  {
    ListIterator localListIterator;
    o localo;
    m localm;
    do
    {
      try
      {
        localListIterator = d.listIterator();
        boolean bool = localListIterator.hasNext();
        localo = null;
        if (!bool) {
          break;
        }
        localm = (m)localListIterator.next();
        if (localm.a() != null) {
          localo = (o)g.get(localm.a());
        }
      }
      finally
      {
        break label98;
      }
    } while ((localo != null) && (localo != paramo));
    localListIterator.remove();
    return localm;
    return null;
    label98:
    throw paramo;
  }
  
  public final void h(o paramo)
  {
    HashSet localHashSet;
    try
    {
      localHashSet = new java/util/HashSet;
      localHashSet.<init>(e);
      f.remove(paramo);
      e.add(paramo);
      if ((!paramo.b()) && (paramo.d() != null)) {
        g.remove(paramo.d());
      }
    }
    finally
    {
      break label111;
    }
    i(paramo);
    paramo = localHashSet.iterator();
    while (paramo.hasNext()) {
      i((o)paramo.next());
    }
    return;
    label111:
    throw paramo;
  }
  
  public final void i(o paramo)
  {
    m localm;
    try
    {
      localm = f(paramo);
      if (localm == null) {
        break label68;
      }
      f.add(paramo);
      e.remove(paramo);
      if (localm.a() != null) {
        g.put(localm.a(), paramo);
      }
    }
    finally
    {
      break label71;
    }
    paramo.e(localm);
    label68:
    return;
    label71:
    throw paramo;
  }
  
  /* Error */
  public void start()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_0
    //   3: istore_1
    //   4: iload_1
    //   5: aload_0
    //   6: getfield 44	n5/s:b	I
    //   9: if_icmpge +75 -> 84
    //   12: new 140	java/lang/StringBuilder
    //   15: astore_2
    //   16: aload_2
    //   17: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   20: aload_2
    //   21: aload_0
    //   22: getfield 42	n5/s:a	Ljava/lang/String;
    //   25: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: pop
    //   29: aload_2
    //   30: iload_1
    //   31: invokevirtual 148	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   34: pop
    //   35: aload_0
    //   36: aload_2
    //   37: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: aload_0
    //   41: getfield 46	n5/s:c	I
    //   44: invokevirtual 154	n5/s:e	(Ljava/lang/String;I)Ln5/o;
    //   47: astore_3
    //   48: new 156	n5/r
    //   51: astore_2
    //   52: aload_2
    //   53: aload_0
    //   54: aload_3
    //   55: invokespecial 158	n5/r:<init>	(Ln5/s;Ln5/o;)V
    //   58: aload_3
    //   59: aload_2
    //   60: invokevirtual 161	n5/o:g	(Ljava/lang/Runnable;)V
    //   63: aload_0
    //   64: getfield 33	n5/s:e	Ljava/util/Set;
    //   67: aload_3
    //   68: invokeinterface 123 2 0
    //   73: pop
    //   74: iinc 1 1
    //   77: goto -73 -> 4
    //   80: astore_2
    //   81: goto +6 -> 87
    //   84: aload_0
    //   85: monitorexit
    //   86: return
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_2
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	s
    //   3	72	1	i	int
    //   15	45	2	localObject1	Object
    //   80	10	2	localObject2	Object
    //   47	21	3	localo	o
    // Exception table:
    //   from	to	target	type
    //   4	74	80	finally
  }
}

/* Location:
 * Qualified Name:     n5.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */