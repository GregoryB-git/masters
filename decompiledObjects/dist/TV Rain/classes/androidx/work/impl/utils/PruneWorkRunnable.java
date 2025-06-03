package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Operation;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.WorkManagerImpl;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class PruneWorkRunnable
  implements Runnable
{
  private final OperationImpl mOperation;
  private final WorkManagerImpl mWorkManagerImpl;
  
  public PruneWorkRunnable(WorkManagerImpl paramWorkManagerImpl)
  {
    mWorkManagerImpl = paramWorkManagerImpl;
    mOperation = new OperationImpl();
  }
  
  public Operation getOperation()
  {
    return mOperation;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 21	androidx/work/impl/utils/PruneWorkRunnable:mWorkManagerImpl	Landroidx/work/impl/WorkManagerImpl;
    //   4: invokevirtual 36	androidx/work/impl/WorkManagerImpl:getWorkDatabase	()Landroidx/work/impl/WorkDatabase;
    //   7: invokevirtual 42	androidx/work/impl/WorkDatabase:workSpecDao	()Landroidx/work/impl/model/WorkSpecDao;
    //   10: invokeinterface 47 1 0
    //   15: aload_0
    //   16: getfield 26	androidx/work/impl/utils/PruneWorkRunnable:mOperation	Landroidx/work/impl/OperationImpl;
    //   19: getstatic 53	androidx/work/Operation:SUCCESS	Landroidx/work/Operation$State$SUCCESS;
    //   22: invokevirtual 57	androidx/work/impl/OperationImpl:setState	(Landroidx/work/Operation$State;)V
    //   25: goto +19 -> 44
    //   28: astore_1
    //   29: aload_0
    //   30: getfield 26	androidx/work/impl/utils/PruneWorkRunnable:mOperation	Landroidx/work/impl/OperationImpl;
    //   33: new 59	androidx/work/Operation$State$FAILURE
    //   36: dup
    //   37: aload_1
    //   38: invokespecial 62	androidx/work/Operation$State$FAILURE:<init>	(Ljava/lang/Throwable;)V
    //   41: invokevirtual 57	androidx/work/impl/OperationImpl:setState	(Landroidx/work/Operation$State;)V
    //   44: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	PruneWorkRunnable
    //   28	10	1	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	25	28	finally
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.PruneWorkRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */