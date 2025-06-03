package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class LiveDataUtils
{
  public static <In, Out> LiveData<Out> dedupedMappedLiveDataFor(@NonNull LiveData<In> paramLiveData, @NonNull final Function<In, Out> paramFunction, @NonNull TaskExecutor paramTaskExecutor)
  {
    final Object localObject = new Object();
    final MediatorLiveData localMediatorLiveData = new MediatorLiveData();
    localMediatorLiveData.addSource(paramLiveData, new Observer()
    {
      public Out mCurrentOutput = null;
      
      public void onChanged(@Nullable final In paramAnonymousIn)
      {
        executeOnBackgroundThread(new Runnable()
        {
          public void run()
          {
            synchronized (val$lock)
            {
              Object localObject2 = val$mappingMethod.apply(paramAnonymousIn);
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
    });
    return localMediatorLiveData;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.LiveDataUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */