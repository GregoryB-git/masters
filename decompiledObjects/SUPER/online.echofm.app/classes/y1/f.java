package y1;

import O1.a.a;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class f
{
  public final HashMap a = new HashMap();
  
  public final void a(a parama, e parame)
  {
    try
    {
      Intrinsics.checkNotNullParameter(parama, "accessTokenAppIdPair");
      Intrinsics.checkNotNullParameter(parame, "appEvent");
      parama = e(parama);
      if (parama != null) {
        parama.a(parame);
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public final void b(G paramG)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnonnull +6 -> 9
    //   6: aload_0
    //   7: monitorexit
    //   8: return
    //   9: aload_1
    //   10: invokevirtual 43	y1/G:b	()Ljava/util/Set;
    //   13: invokeinterface 49 1 0
    //   18: astore_1
    //   19: aload_1
    //   20: invokeinterface 55 1 0
    //   25: ifeq +75 -> 100
    //   28: aload_1
    //   29: invokeinterface 59 1 0
    //   34: checkcast 61	java/util/Map$Entry
    //   37: astore_2
    //   38: aload_0
    //   39: aload_2
    //   40: invokeinterface 64 1 0
    //   45: checkcast 66	y1/a
    //   48: invokevirtual 31	y1/f:e	(Ly1/a;)Ly1/H;
    //   51: astore_3
    //   52: aload_3
    //   53: ifnull -34 -> 19
    //   56: aload_2
    //   57: invokeinterface 69 1 0
    //   62: checkcast 71	java/util/List
    //   65: invokeinterface 72 1 0
    //   70: astore_2
    //   71: aload_2
    //   72: invokeinterface 55 1 0
    //   77: ifeq -58 -> 19
    //   80: aload_3
    //   81: aload_2
    //   82: invokeinterface 59 1 0
    //   87: checkcast 74	y1/e
    //   90: invokevirtual 36	y1/H:a	(Ly1/e;)V
    //   93: goto -22 -> 71
    //   96: astore_1
    //   97: goto +6 -> 103
    //   100: aload_0
    //   101: monitorexit
    //   102: return
    //   103: aload_0
    //   104: monitorexit
    //   105: aload_1
    //   106: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	f
    //   0	107	1	paramG	G
    //   37	45	2	localObject	Object
    //   51	30	3	localH	H
    // Exception table:
    //   from	to	target	type
    //   9	19	96	finally
    //   19	52	96	finally
    //   56	71	96	finally
    //   71	93	96	finally
  }
  
  public final H c(a parama)
  {
    try
    {
      Intrinsics.checkNotNullParameter(parama, "accessTokenAppIdPair");
      parama = (H)a.get(parama);
      return parama;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  /* Error */
  public final int d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 15	y1/f:a	Ljava/util/HashMap;
    //   6: invokevirtual 85	java/util/HashMap:values	()Ljava/util/Collection;
    //   9: invokeinterface 88 1 0
    //   14: astore_1
    //   15: iconst_0
    //   16: istore_2
    //   17: aload_1
    //   18: invokeinterface 55 1 0
    //   23: ifeq +27 -> 50
    //   26: aload_1
    //   27: invokeinterface 59 1 0
    //   32: checkcast 33	y1/H
    //   35: invokevirtual 90	y1/H:c	()I
    //   38: istore_3
    //   39: iload_2
    //   40: iload_3
    //   41: iadd
    //   42: istore_2
    //   43: goto -26 -> 17
    //   46: astore_1
    //   47: goto +7 -> 54
    //   50: aload_0
    //   51: monitorexit
    //   52: iload_2
    //   53: ireturn
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_1
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	this	f
    //   14	13	1	localIterator	java.util.Iterator
    //   46	11	1	localObject	Object
    //   16	37	2	i	int
    //   38	4	3	j	int
    // Exception table:
    //   from	to	target	type
    //   2	15	46	finally
    //   17	39	46	finally
  }
  
  public final H e(a parama)
  {
    H localH2;
    try
    {
      H localH1 = (H)a.get(parama);
      localH2 = localH1;
      if (localH1 == null)
      {
        Context localContext = B.l();
        O1.a locala = O1.a.f.e(localContext);
        localH2 = localH1;
        if (locala != null)
        {
          localH2 = new y1/H;
          localH2.<init>(locala, p.b.d(localContext));
        }
      }
    }
    finally
    {
      break label91;
    }
    if (localH2 == null) {
      return null;
    }
    a.put(parama, localH2);
    return localH2;
    label91:
    throw parama;
  }
  
  public final Set f()
  {
    try
    {
      Set localSet = a.keySet();
      Intrinsics.checkNotNullExpressionValue(localSet, "stateMap.keys");
      return localSet;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     y1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */