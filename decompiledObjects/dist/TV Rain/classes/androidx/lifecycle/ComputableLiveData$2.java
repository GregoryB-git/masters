package androidx.lifecycle;

import androidx.annotation.WorkerThread;
import java.util.concurrent.atomic.AtomicBoolean;

class ComputableLiveData$2
  implements Runnable
{
  public ComputableLiveData$2(ComputableLiveData paramComputableLiveData) {}
  
  @WorkerThread
  public void run()
  {
    int i;
    do
    {
      Object localObject1 = this$0.mComputing;
      i = 0;
      if (((AtomicBoolean)localObject1).compareAndSet(false, true))
      {
        localObject1 = null;
        i = 0;
        try
        {
          while (this$0.mInvalid.compareAndSet(true, false))
          {
            localObject1 = this$0.compute();
            i = 1;
          }
          if (i != 0) {
            this$0.mLiveData.postValue(localObject1);
          }
        }
        finally
        {
          this$0.mComputing.set(false);
        }
      }
    } while ((i != 0) && (this$0.mInvalid.get()));
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ComputableLiveData.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */