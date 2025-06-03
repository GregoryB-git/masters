package androidx.work.impl;

import androidx.work.impl.utils.futures.SettableFuture;

class WorkerWrapper$2
  implements Runnable
{
  public WorkerWrapper$2(WorkerWrapper paramWorkerWrapper, SettableFuture paramSettableFuture, String paramString) {}
  
  /* Error */
  @android.annotation.SuppressLint({"SyntheticAccessor"})
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	androidx/work/impl/WorkerWrapper$2:val$future	Landroidx/work/impl/utils/futures/SettableFuture;
    //   4: invokevirtual 44	androidx/work/impl/utils/futures/AbstractFuture:get	()Ljava/lang/Object;
    //   7: checkcast 46	androidx/work/ListenableWorker$Result
    //   10: astore_1
    //   11: aload_1
    //   12: ifnonnull +41 -> 53
    //   15: invokestatic 51	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   18: getstatic 54	androidx/work/impl/WorkerWrapper:TAG	Ljava/lang/String;
    //   21: ldc 56
    //   23: iconst_1
    //   24: anewarray 4	java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_0
    //   30: getfield 21	androidx/work/impl/WorkerWrapper$2:this$0	Landroidx/work/impl/WorkerWrapper;
    //   33: getfield 60	androidx/work/impl/WorkerWrapper:mWorkSpec	Landroidx/work/impl/model/WorkSpec;
    //   36: getfield 65	androidx/work/impl/model/WorkSpec:workerClassName	Ljava/lang/String;
    //   39: aastore
    //   40: invokestatic 71	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   43: iconst_0
    //   44: anewarray 73	java/lang/Throwable
    //   47: invokevirtual 77	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   50: goto +132 -> 182
    //   53: invokestatic 51	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   56: getstatic 54	androidx/work/impl/WorkerWrapper:TAG	Ljava/lang/String;
    //   59: ldc 79
    //   61: iconst_2
    //   62: anewarray 4	java/lang/Object
    //   65: dup
    //   66: iconst_0
    //   67: aload_0
    //   68: getfield 21	androidx/work/impl/WorkerWrapper$2:this$0	Landroidx/work/impl/WorkerWrapper;
    //   71: getfield 60	androidx/work/impl/WorkerWrapper:mWorkSpec	Landroidx/work/impl/model/WorkSpec;
    //   74: getfield 65	androidx/work/impl/model/WorkSpec:workerClassName	Ljava/lang/String;
    //   77: aastore
    //   78: dup
    //   79: iconst_1
    //   80: aload_1
    //   81: aastore
    //   82: invokestatic 71	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   85: iconst_0
    //   86: anewarray 73	java/lang/Throwable
    //   89: invokevirtual 82	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   92: aload_0
    //   93: getfield 21	androidx/work/impl/WorkerWrapper$2:this$0	Landroidx/work/impl/WorkerWrapper;
    //   96: aload_1
    //   97: putfield 86	androidx/work/impl/WorkerWrapper:mResult	Landroidx/work/ListenableWorker$Result;
    //   100: goto +82 -> 182
    //   103: astore_1
    //   104: goto +86 -> 190
    //   107: astore_1
    //   108: goto +4 -> 112
    //   111: astore_1
    //   112: invokestatic 51	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   115: getstatic 54	androidx/work/impl/WorkerWrapper:TAG	Ljava/lang/String;
    //   118: ldc 88
    //   120: iconst_1
    //   121: anewarray 4	java/lang/Object
    //   124: dup
    //   125: iconst_0
    //   126: aload_0
    //   127: getfield 25	androidx/work/impl/WorkerWrapper$2:val$workDescription	Ljava/lang/String;
    //   130: aastore
    //   131: invokestatic 71	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   134: iconst_1
    //   135: anewarray 73	java/lang/Throwable
    //   138: dup
    //   139: iconst_0
    //   140: aload_1
    //   141: aastore
    //   142: invokevirtual 77	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   145: goto +37 -> 182
    //   148: astore_1
    //   149: invokestatic 51	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   152: getstatic 54	androidx/work/impl/WorkerWrapper:TAG	Ljava/lang/String;
    //   155: ldc 90
    //   157: iconst_1
    //   158: anewarray 4	java/lang/Object
    //   161: dup
    //   162: iconst_0
    //   163: aload_0
    //   164: getfield 25	androidx/work/impl/WorkerWrapper$2:val$workDescription	Ljava/lang/String;
    //   167: aastore
    //   168: invokestatic 71	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   171: iconst_1
    //   172: anewarray 73	java/lang/Throwable
    //   175: dup
    //   176: iconst_0
    //   177: aload_1
    //   178: aastore
    //   179: invokevirtual 93	androidx/work/Logger:info	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   182: aload_0
    //   183: getfield 21	androidx/work/impl/WorkerWrapper$2:this$0	Landroidx/work/impl/WorkerWrapper;
    //   186: invokevirtual 96	androidx/work/impl/WorkerWrapper:onWorkFinished	()V
    //   189: return
    //   190: aload_0
    //   191: getfield 21	androidx/work/impl/WorkerWrapper$2:this$0	Landroidx/work/impl/WorkerWrapper;
    //   194: invokevirtual 96	androidx/work/impl/WorkerWrapper:onWorkFinished	()V
    //   197: aload_1
    //   198: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	199	0	this	2
    //   10	87	1	localResult	androidx.work.ListenableWorker.Result
    //   103	1	1	localObject	Object
    //   107	1	1	localExecutionException	java.util.concurrent.ExecutionException
    //   111	30	1	localInterruptedException	InterruptedException
    //   148	50	1	localCancellationException	java.util.concurrent.CancellationException
    // Exception table:
    //   from	to	target	type
    //   0	11	103	finally
    //   15	50	103	finally
    //   53	100	103	finally
    //   112	145	103	finally
    //   149	182	103	finally
    //   0	11	107	java/util/concurrent/ExecutionException
    //   15	50	107	java/util/concurrent/ExecutionException
    //   53	100	107	java/util/concurrent/ExecutionException
    //   0	11	111	java/lang/InterruptedException
    //   15	50	111	java/lang/InterruptedException
    //   53	100	111	java/lang/InterruptedException
    //   0	11	148	java/util/concurrent/CancellationException
    //   15	50	148	java/util/concurrent/CancellationException
    //   53	100	148	java/util/concurrent/CancellationException
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkerWrapper.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */