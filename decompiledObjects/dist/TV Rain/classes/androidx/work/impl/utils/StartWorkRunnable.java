package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class StartWorkRunnable
  implements Runnable
{
  private WorkerParameters.RuntimeExtras mRuntimeExtras;
  private WorkManagerImpl mWorkManagerImpl;
  private String mWorkSpecId;
  
  public StartWorkRunnable(WorkManagerImpl paramWorkManagerImpl, String paramString, WorkerParameters.RuntimeExtras paramRuntimeExtras)
  {
    mWorkManagerImpl = paramWorkManagerImpl;
    mWorkSpecId = paramString;
    mRuntimeExtras = paramRuntimeExtras;
  }
  
  public void run()
  {
    mWorkManagerImpl.getProcessor().startWork(mWorkSpecId, mRuntimeExtras);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.StartWorkRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */