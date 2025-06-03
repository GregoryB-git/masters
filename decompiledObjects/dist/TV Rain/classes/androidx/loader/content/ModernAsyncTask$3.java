package androidx.loader.content;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class ModernAsyncTask$3
  extends FutureTask<Result>
{
  public ModernAsyncTask$3(ModernAsyncTask paramModernAsyncTask, Callable paramCallable)
  {
    super(paramCallable);
  }
  
  /* Error */
  public void done()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 30	java/util/concurrent/FutureTask:get	()Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield 15	androidx/loader/content/ModernAsyncTask$3:this$0	Landroidx/loader/content/ModernAsyncTask;
    //   9: aload_1
    //   10: invokevirtual 34	androidx/loader/content/ModernAsyncTask:postResultIfNotInvoked	(Ljava/lang/Object;)V
    //   13: goto +50 -> 63
    //   16: astore_1
    //   17: new 36	java/lang/RuntimeException
    //   20: dup
    //   21: ldc 38
    //   23: aload_1
    //   24: invokespecial 41	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   27: athrow
    //   28: astore_1
    //   29: aload_0
    //   30: getfield 15	androidx/loader/content/ModernAsyncTask$3:this$0	Landroidx/loader/content/ModernAsyncTask;
    //   33: aconst_null
    //   34: invokevirtual 34	androidx/loader/content/ModernAsyncTask:postResultIfNotInvoked	(Ljava/lang/Object;)V
    //   37: goto +26 -> 63
    //   40: astore_1
    //   41: new 36	java/lang/RuntimeException
    //   44: dup
    //   45: ldc 38
    //   47: aload_1
    //   48: invokevirtual 47	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   51: invokespecial 41	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   54: athrow
    //   55: astore_1
    //   56: ldc 49
    //   58: aload_1
    //   59: invokestatic 55	android/util/Log:w	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   62: pop
    //   63: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	3
    //   4	6	1	localObject	Object
    //   16	8	1	localThrowable	Throwable
    //   28	1	1	localCancellationException	java.util.concurrent.CancellationException
    //   40	8	1	localExecutionException	java.util.concurrent.ExecutionException
    //   55	4	1	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   0	13	16	finally
    //   0	13	28	java/util/concurrent/CancellationException
    //   0	13	40	java/util/concurrent/ExecutionException
    //   0	13	55	java/lang/InterruptedException
  }
}

/* Location:
 * Qualified Name:     androidx.loader.content.ModernAsyncTask.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */