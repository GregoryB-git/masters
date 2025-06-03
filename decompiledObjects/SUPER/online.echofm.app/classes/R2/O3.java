package R2;

import java.util.concurrent.atomic.AtomicReference;

public final class O3
  implements Runnable
{
  public O3(C3 paramC3, AtomicReference paramAtomicReference) {}
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 16	R2/O3:o	Ljava/util/concurrent/atomic/AtomicReference;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 16	R2/O3:o	Ljava/util/concurrent/atomic/AtomicReference;
    //   11: aload_0
    //   12: getfield 14	R2/O3:p	LR2/C3;
    //   15: invokevirtual 27	R2/m3:f	()LR2/g;
    //   18: aload_0
    //   19: getfield 14	R2/O3:p	LR2/C3;
    //   22: invokevirtual 32	R2/G1:p	()LR2/S1;
    //   25: invokevirtual 38	R2/S1:F	()Ljava/lang/String;
    //   28: invokevirtual 44	R2/g:J	(Ljava/lang/String;)Z
    //   31: invokestatic 50	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   34: invokevirtual 56	java/util/concurrent/atomic/AtomicReference:set	(Ljava/lang/Object;)V
    //   37: aload_0
    //   38: getfield 16	R2/O3:o	Ljava/util/concurrent/atomic/AtomicReference;
    //   41: invokevirtual 59	java/lang/Object:notify	()V
    //   44: aload_1
    //   45: monitorexit
    //   46: return
    //   47: astore_2
    //   48: goto +13 -> 61
    //   51: astore_2
    //   52: aload_0
    //   53: getfield 16	R2/O3:o	Ljava/util/concurrent/atomic/AtomicReference;
    //   56: invokevirtual 59	java/lang/Object:notify	()V
    //   59: aload_2
    //   60: athrow
    //   61: aload_1
    //   62: monitorexit
    //   63: aload_2
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	O3
    //   4	58	1	localAtomicReference	AtomicReference
    //   47	1	2	localObject1	Object
    //   51	13	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   37	46	47	finally
    //   52	61	47	finally
    //   61	63	47	finally
    //   7	37	51	finally
  }
}

/* Location:
 * Qualified Name:     R2.O3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */