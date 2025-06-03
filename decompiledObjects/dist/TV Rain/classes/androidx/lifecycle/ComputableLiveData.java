package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.executor.TaskExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class ComputableLiveData<T>
{
  public final AtomicBoolean mComputing = new AtomicBoolean(false);
  public final Executor mExecutor;
  public final AtomicBoolean mInvalid = new AtomicBoolean(true);
  @VisibleForTesting
  public final Runnable mInvalidationRunnable = new Runnable()
  {
    @MainThread
    public void run()
    {
      boolean bool = mLiveData.hasActiveObservers();
      if ((mInvalid.compareAndSet(false, true)) && (bool))
      {
        ComputableLiveData localComputableLiveData = ComputableLiveData.this;
        mExecutor.execute(mRefreshRunnable);
      }
    }
  };
  public final LiveData<T> mLiveData;
  @VisibleForTesting
  public final Runnable mRefreshRunnable = new Runnable()
  {
    @WorkerThread
    public void run()
    {
      int i;
      do
      {
        Object localObject1 = mComputing;
        i = 0;
        if (((AtomicBoolean)localObject1).compareAndSet(false, true))
        {
          localObject1 = null;
          i = 0;
          try
          {
            while (mInvalid.compareAndSet(true, false))
            {
              localObject1 = compute();
              i = 1;
            }
            if (i != 0) {
              mLiveData.postValue(localObject1);
            }
          }
          finally
          {
            mComputing.set(false);
          }
        }
      } while ((i != 0) && (mInvalid.get()));
    }
  };
  
  public ComputableLiveData()
  {
    this(ArchTaskExecutor.getIOThreadExecutor());
  }
  
  public ComputableLiveData(@NonNull Executor paramExecutor)
  {
    mExecutor = paramExecutor;
    mLiveData = new LiveData()
    {
      public void onActive()
      {
        ComputableLiveData localComputableLiveData = ComputableLiveData.this;
        mExecutor.execute(mRefreshRunnable);
      }
    };
  }
  
  @WorkerThread
  public abstract T compute();
  
  @NonNull
  public LiveData<T> getLiveData()
  {
    return mLiveData;
  }
  
  public void invalidate()
  {
    ArchTaskExecutor.getInstance().executeOnMainThread(mInvalidationRunnable);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ComputableLiveData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */