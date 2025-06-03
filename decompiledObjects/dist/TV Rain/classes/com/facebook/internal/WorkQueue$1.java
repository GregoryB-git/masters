package com.facebook.internal;

class WorkQueue$1
  implements Runnable
{
  public WorkQueue$1(WorkQueue paramWorkQueue, WorkQueue.WorkNode paramWorkNode) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 32	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield 21	com/facebook/internal/WorkQueue$1:val$node	Lcom/facebook/internal/WorkQueue$WorkNode;
    //   12: invokevirtual 38	com/facebook/internal/WorkQueue$WorkNode:getCallback	()Ljava/lang/Runnable;
    //   15: invokeinterface 40 1 0
    //   20: aload_0
    //   21: getfield 19	com/facebook/internal/WorkQueue$1:this$0	Lcom/facebook/internal/WorkQueue;
    //   24: aload_0
    //   25: getfield 21	com/facebook/internal/WorkQueue$1:val$node	Lcom/facebook/internal/WorkQueue$WorkNode;
    //   28: invokestatic 43	com/facebook/internal/WorkQueue:access$000	(Lcom/facebook/internal/WorkQueue;Lcom/facebook/internal/WorkQueue$WorkNode;)V
    //   31: return
    //   32: astore_1
    //   33: aload_0
    //   34: getfield 19	com/facebook/internal/WorkQueue$1:this$0	Lcom/facebook/internal/WorkQueue;
    //   37: aload_0
    //   38: getfield 21	com/facebook/internal/WorkQueue$1:val$node	Lcom/facebook/internal/WorkQueue$WorkNode;
    //   41: invokestatic 43	com/facebook/internal/WorkQueue:access$000	(Lcom/facebook/internal/WorkQueue;Lcom/facebook/internal/WorkQueue$WorkNode;)V
    //   44: aload_1
    //   45: athrow
    //   46: astore_1
    //   47: aload_1
    //   48: aload_0
    //   49: invokestatic 47	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   52: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	1
    //   32	13	1	localObject	Object
    //   46	2	1	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   8	20	32	finally
    //   20	31	46	finally
    //   33	46	46	finally
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.WorkQueue.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */