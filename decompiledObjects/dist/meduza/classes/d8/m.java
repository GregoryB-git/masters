package d8;

import c9.c;
import c9.d;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public final class m
  implements d, c
{
  public final HashMap a = new HashMap();
  public ArrayDeque b = new ArrayDeque();
  public final Executor c;
  
  public m(Executor paramExecutor)
  {
    c = paramExecutor;
  }
  
  public final void a(aa.m paramm)
  {
    d(c, paramm);
  }
  
  /* Error */
  public final void b(c9.a<?> parama)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 42	java/lang/Object:getClass	()Ljava/lang/Class;
    //   4: pop
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 29	d8/m:b	Ljava/util/ArrayDeque;
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull +12 -> 25
    //   16: aload_2
    //   17: aload_1
    //   18: invokevirtual 46	java/util/ArrayDeque:add	(Ljava/lang/Object;)Z
    //   21: pop
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_0
    //   28: monitorenter
    //   29: aload_0
    //   30: getfield 24	d8/m:a	Ljava/util/HashMap;
    //   33: aload_1
    //   34: getfield 51	c9/a:a	Ljava/lang/Class;
    //   37: invokevirtual 55	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   40: checkcast 57	java/util/Map
    //   43: astore_2
    //   44: aload_2
    //   45: ifnonnull +10 -> 55
    //   48: invokestatic 63	java/util/Collections:emptySet	()Ljava/util/Set;
    //   51: astore_2
    //   52: goto +10 -> 62
    //   55: aload_2
    //   56: invokeinterface 66 1 0
    //   61: astore_2
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_2
    //   65: invokeinterface 72 1 0
    //   70: astore_2
    //   71: aload_2
    //   72: invokeinterface 78 1 0
    //   77: ifeq +41 -> 118
    //   80: aload_2
    //   81: invokeinterface 82 1 0
    //   86: checkcast 84	java/util/Map$Entry
    //   89: astore_3
    //   90: aload_3
    //   91: invokeinterface 87 1 0
    //   96: checkcast 89	java/util/concurrent/Executor
    //   99: new 91	g/q
    //   102: dup
    //   103: bipush 11
    //   105: aload_3
    //   106: aload_1
    //   107: invokespecial 94	g/q:<init>	(ILjava/lang/Object;Ljava/lang/Object;)V
    //   110: invokeinterface 98 2 0
    //   115: goto -44 -> 71
    //   118: return
    //   119: astore_1
    //   120: aload_0
    //   121: monitorexit
    //   122: aload_1
    //   123: athrow
    //   124: astore_1
    //   125: aload_0
    //   126: monitorexit
    //   127: aload_1
    //   128: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	this	m
    //   0	129	1	parama	c9.a<?>
    //   11	70	2	localObject	Object
    //   89	17	3	localEntry	java.util.Map.Entry
    // Exception table:
    //   from	to	target	type
    //   29	44	119	finally
    //   48	52	119	finally
    //   55	62	119	finally
    //   7	12	124	finally
    //   16	24	124	finally
    //   25	27	124	finally
    //   125	127	124	finally
  }
  
  public final void c(c9.b paramb)
  {
    try
    {
      paramb.getClass();
      boolean bool = a.containsKey(u7.b.class);
      if (!bool) {
        return;
      }
      ConcurrentHashMap localConcurrentHashMap = (ConcurrentHashMap)a.get(u7.b.class);
      localConcurrentHashMap.remove(paramb);
      if (localConcurrentHashMap.isEmpty()) {
        a.remove(u7.b.class);
      }
      return;
    }
    finally {}
  }
  
  public final void d(Executor paramExecutor, c9.b paramb)
  {
    try
    {
      paramExecutor.getClass();
      if (!a.containsKey(u7.b.class))
      {
        HashMap localHashMap = a;
        ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
        localConcurrentHashMap.<init>();
        localHashMap.put(u7.b.class, localConcurrentHashMap);
      }
      ((ConcurrentHashMap)a.get(u7.b.class)).put(paramb, paramExecutor);
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     d8.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */