package V2;

import java.util.concurrent.Callable;

public final class L
  implements Runnable
{
  public L(K paramK, Callable paramCallable) {}
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	V2/L:o	LV2/K;
    //   4: aload_0
    //   5: getfield 16	V2/L:p	Ljava/util/concurrent/Callable;
    //   8: invokeinterface 29 1 0
    //   13: invokevirtual 35	V2/K:r	(Ljava/lang/Object;)V
    //   16: return
    //   17: astore_1
    //   18: goto +7 -> 25
    //   21: astore_1
    //   22: goto +19 -> 41
    //   25: aload_0
    //   26: getfield 14	V2/L:o	LV2/K;
    //   29: new 37	java/lang/RuntimeException
    //   32: dup
    //   33: aload_1
    //   34: invokespecial 40	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   37: invokevirtual 44	V2/K:q	(Ljava/lang/Exception;)V
    //   40: return
    //   41: aload_0
    //   42: getfield 14	V2/L:o	LV2/K;
    //   45: aload_1
    //   46: invokevirtual 44	V2/K:q	(Ljava/lang/Exception;)V
    //   49: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	this	L
    //   17	1	1	localObject	Object
    //   21	25	1	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	16	17	finally
    //   0	16	21	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     V2.L
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */