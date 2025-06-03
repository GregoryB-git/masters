package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import java.util.Map;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class WorkTimer$WorkTimerRunnable
  implements Runnable
{
  public static final String TAG = "WrkTimerRunnable";
  private final String mWorkSpecId;
  private final WorkTimer mWorkTimer;
  
  public WorkTimer$WorkTimerRunnable(@NonNull WorkTimer paramWorkTimer, @NonNull String paramString)
  {
    mWorkTimer = paramWorkTimer;
    mWorkSpecId = paramString;
  }
  
  public void run()
  {
    synchronized (mWorkTimer.mLock)
    {
      if ((WorkTimerRunnable)mWorkTimer.mTimerMap.remove(mWorkSpecId) != null)
      {
        WorkTimer.TimeLimitExceededListener localTimeLimitExceededListener = (WorkTimer.TimeLimitExceededListener)mWorkTimer.mListeners.remove(mWorkSpecId);
        if (localTimeLimitExceededListener != null) {
          localTimeLimitExceededListener.onTimeLimitExceeded(mWorkSpecId);
        }
      }
      else
      {
        Logger.get().debug("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[] { mWorkSpecId }), new Throwable[0]);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.WorkTimer.WorkTimerRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */