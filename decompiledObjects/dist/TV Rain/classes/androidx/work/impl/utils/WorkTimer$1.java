package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import z2;

class WorkTimer$1
  implements ThreadFactory
{
  private int mThreadsCreated = 0;
  
  public WorkTimer$1(WorkTimer paramWorkTimer) {}
  
  public Thread newThread(@NonNull Runnable paramRunnable)
  {
    paramRunnable = Executors.defaultThreadFactory().newThread(paramRunnable);
    StringBuilder localStringBuilder = z2.t("WorkManager-WorkTimer-thread-");
    localStringBuilder.append(mThreadsCreated);
    paramRunnable.setName(localStringBuilder.toString());
    mThreadsCreated += 1;
    return paramRunnable;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.WorkTimer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */