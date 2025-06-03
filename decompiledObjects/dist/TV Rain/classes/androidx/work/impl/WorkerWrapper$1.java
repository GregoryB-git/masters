package androidx.work.impl;

import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

class WorkerWrapper$1
  implements Runnable
{
  public WorkerWrapper$1(WorkerWrapper paramWorkerWrapper, ListenableFuture paramListenableFuture, SettableFuture paramSettableFuture) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	androidx/work/impl/WorkerWrapper$1:val$runExpedited	Lcom/google/common/util/concurrent/ListenableFuture;
    //   4: invokeinterface 35 1 0
    //   9: pop
    //   10: invokestatic 40	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   13: getstatic 44	androidx/work/impl/WorkerWrapper:TAG	Ljava/lang/String;
    //   16: ldc 46
    //   18: iconst_1
    //   19: anewarray 4	java/lang/Object
    //   22: dup
    //   23: iconst_0
    //   24: aload_0
    //   25: getfield 21	androidx/work/impl/WorkerWrapper$1:this$0	Landroidx/work/impl/WorkerWrapper;
    //   28: getfield 50	androidx/work/impl/WorkerWrapper:mWorkSpec	Landroidx/work/impl/model/WorkSpec;
    //   31: getfield 55	androidx/work/impl/model/WorkSpec:workerClassName	Ljava/lang/String;
    //   34: aastore
    //   35: invokestatic 61	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   38: iconst_0
    //   39: anewarray 63	java/lang/Throwable
    //   42: invokevirtual 67	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   45: aload_0
    //   46: getfield 21	androidx/work/impl/WorkerWrapper$1:this$0	Landroidx/work/impl/WorkerWrapper;
    //   49: astore_1
    //   50: aload_1
    //   51: aload_1
    //   52: getfield 71	androidx/work/impl/WorkerWrapper:mWorker	Landroidx/work/ListenableWorker;
    //   55: invokevirtual 77	androidx/work/ListenableWorker:startWork	()Lcom/google/common/util/concurrent/ListenableFuture;
    //   58: putfield 80	androidx/work/impl/WorkerWrapper:mInnerFuture	Lcom/google/common/util/concurrent/ListenableFuture;
    //   61: aload_0
    //   62: getfield 25	androidx/work/impl/WorkerWrapper$1:val$future	Landroidx/work/impl/utils/futures/SettableFuture;
    //   65: aload_0
    //   66: getfield 21	androidx/work/impl/WorkerWrapper$1:this$0	Landroidx/work/impl/WorkerWrapper;
    //   69: getfield 80	androidx/work/impl/WorkerWrapper:mInnerFuture	Lcom/google/common/util/concurrent/ListenableFuture;
    //   72: invokevirtual 86	androidx/work/impl/utils/futures/SettableFuture:setFuture	(Lcom/google/common/util/concurrent/ListenableFuture;)Z
    //   75: pop
    //   76: goto +13 -> 89
    //   79: astore_1
    //   80: aload_0
    //   81: getfield 25	androidx/work/impl/WorkerWrapper$1:val$future	Landroidx/work/impl/utils/futures/SettableFuture;
    //   84: aload_1
    //   85: invokevirtual 90	androidx/work/impl/utils/futures/SettableFuture:setException	(Ljava/lang/Throwable;)Z
    //   88: pop
    //   89: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	1
    //   49	3	1	localWorkerWrapper	WorkerWrapper
    //   79	6	1	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	76	79	finally
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkerWrapper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */