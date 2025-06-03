package androidx.work.impl;

import androidx.work.impl.utils.PreferenceUtils;
import androidx.work.impl.utils.futures.SettableFuture;

class WorkManagerImpl$1
  implements Runnable
{
  public WorkManagerImpl$1(WorkManagerImpl paramWorkManagerImpl, SettableFuture paramSettableFuture, PreferenceUtils paramPreferenceUtils) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	androidx/work/impl/WorkManagerImpl$1:val$future	Landroidx/work/impl/utils/futures/SettableFuture;
    //   4: aload_0
    //   5: getfield 25	androidx/work/impl/WorkManagerImpl$1:val$preferenceUtils	Landroidx/work/impl/utils/PreferenceUtils;
    //   8: invokevirtual 35	androidx/work/impl/utils/PreferenceUtils:getLastCancelAllTimeMillis	()J
    //   11: invokestatic 41	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   14: invokevirtual 47	androidx/work/impl/utils/futures/SettableFuture:set	(Ljava/lang/Object;)Z
    //   17: pop
    //   18: goto +13 -> 31
    //   21: astore_1
    //   22: aload_0
    //   23: getfield 23	androidx/work/impl/WorkManagerImpl$1:val$future	Landroidx/work/impl/utils/futures/SettableFuture;
    //   26: aload_1
    //   27: invokevirtual 51	androidx/work/impl/utils/futures/SettableFuture:setException	(Ljava/lang/Throwable;)Z
    //   30: pop
    //   31: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	32	0	this	1
    //   21	6	1	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	18	21	finally
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkManagerImpl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */