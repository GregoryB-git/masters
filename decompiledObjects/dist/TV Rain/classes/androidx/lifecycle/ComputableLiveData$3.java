package androidx.lifecycle;

import androidx.annotation.MainThread;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

class ComputableLiveData$3
  implements Runnable
{
  public ComputableLiveData$3(ComputableLiveData paramComputableLiveData) {}
  
  @MainThread
  public void run()
  {
    boolean bool = this$0.mLiveData.hasActiveObservers();
    if ((this$0.mInvalid.compareAndSet(false, true)) && (bool))
    {
      ComputableLiveData localComputableLiveData = this$0;
      mExecutor.execute(mRefreshRunnable);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ComputableLiveData.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */