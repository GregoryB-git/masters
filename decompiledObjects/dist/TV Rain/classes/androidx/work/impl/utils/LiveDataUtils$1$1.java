package androidx.work.impl.utils;

import androidx.arch.core.util.Function;
import androidx.lifecycle.MutableLiveData;

class LiveDataUtils$1$1
  implements Runnable
{
  public LiveDataUtils$1$1(LiveDataUtils.1 param1, Object paramObject) {}
  
  public void run()
  {
    synchronized (this$0.val$lock)
    {
      Object localObject2 = this$0.val$mappingMethod.apply(val$input);
      LiveDataUtils.1 local1 = this$0;
      Object localObject4 = mCurrentOutput;
      if ((localObject4 == null) && (localObject2 != null))
      {
        mCurrentOutput = localObject2;
        val$outputLiveData.postValue(localObject2);
      }
      else if ((localObject4 != null) && (!localObject4.equals(localObject2)))
      {
        local1 = this$0;
        mCurrentOutput = localObject2;
        val$outputLiveData.postValue(localObject2);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.LiveDataUtils.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */