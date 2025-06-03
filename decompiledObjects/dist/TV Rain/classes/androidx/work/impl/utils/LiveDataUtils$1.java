package androidx.work.impl.utils;

import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

class LiveDataUtils$1
  implements Observer<In>
{
  public Out mCurrentOutput = null;
  
  public LiveDataUtils$1(TaskExecutor paramTaskExecutor, Object paramObject, Function paramFunction, MediatorLiveData paramMediatorLiveData) {}
  
  public void onChanged(@Nullable final In paramIn)
  {
    val$workTaskExecutor.executeOnBackgroundThread(new Runnable()
    {
      public void run()
      {
        synchronized (val$lock)
        {
          Object localObject2 = val$mappingMethod.apply(paramIn);
          LiveDataUtils.1 local1 = LiveDataUtils.1.this;
          Object localObject4 = mCurrentOutput;
          if ((localObject4 == null) && (localObject2 != null))
          {
            mCurrentOutput = localObject2;
            val$outputLiveData.postValue(localObject2);
          }
          else if ((localObject4 != null) && (!localObject4.equals(localObject2)))
          {
            local1 = LiveDataUtils.1.this;
            mCurrentOutput = localObject2;
            val$outputLiveData.postValue(localObject2);
          }
          return;
        }
      }
    });
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.LiveDataUtils.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */