package B3;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import r4.b;

public class y
  implements b
{
  public volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());
  public volatile Set b = null;
  
  public y(Collection paramCollection)
  {
    a.addAll(paramCollection);
  }
  
  public static y b(Collection paramCollection)
  {
    return new y((Set)paramCollection);
  }
  
  public void a(b paramb)
  {
    for (;;)
    {
      try
      {
        if (b == null)
        {
          localSet = a;
          localSet.add(paramb);
        }
      }
      finally
      {
        break;
      }
      Set localSet = b;
      paramb = paramb.get();
    }
    return;
    throw paramb;
  }
  
  public Set c()
  {
    if (b == null)
    {
      try
      {
        if (b == null)
        {
          ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
          localConcurrentHashMap.<init>();
          b = Collections.newSetFromMap(localConcurrentHashMap);
          d();
        }
      }
      finally
      {
        break label48;
      }
      break label52;
      label48:
      throw ((Throwable)localObject);
    }
    label52:
    return Collections.unmodifiableSet(b);
  }
  
  /* Error */
  public final void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 27	B3/y:a	Ljava/util/Set;
    //   6: invokeinterface 59 1 0
    //   11: astore_1
    //   12: aload_1
    //   13: invokeinterface 65 1 0
    //   18: ifeq +36 -> 54
    //   21: aload_1
    //   22: invokeinterface 68 1 0
    //   27: checkcast 6	r4/b
    //   30: astore_2
    //   31: aload_0
    //   32: getfield 16	B3/y:b	Ljava/util/Set;
    //   35: aload_2
    //   36: invokeinterface 46 1 0
    //   41: invokeinterface 42 2 0
    //   46: pop
    //   47: goto -35 -> 12
    //   50: astore_2
    //   51: goto +11 -> 62
    //   54: aload_0
    //   55: aconst_null
    //   56: putfield 27	B3/y:a	Ljava/util/Set;
    //   59: aload_0
    //   60: monitorexit
    //   61: return
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_2
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	y
    //   11	11	1	localIterator	java.util.Iterator
    //   30	6	2	localb	b
    //   50	15	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	12	50	finally
    //   12	47	50	finally
    //   54	59	50	finally
  }
}

/* Location:
 * Qualified Name:     B3.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */