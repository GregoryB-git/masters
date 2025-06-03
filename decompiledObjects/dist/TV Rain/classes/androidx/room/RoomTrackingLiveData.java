package androidx.room;

import android.annotation.SuppressLint;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.executor.TaskExecutor;
import androidx.lifecycle.LiveData;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

class RoomTrackingLiveData<T>
  extends LiveData<T>
{
  public final Callable<T> mComputeFunction;
  public final AtomicBoolean mComputing = new AtomicBoolean(false);
  private final InvalidationLiveDataContainer mContainer;
  public final RoomDatabase mDatabase;
  public final boolean mInTransaction;
  public final AtomicBoolean mInvalid = new AtomicBoolean(true);
  public final Runnable mInvalidationRunnable = new Runnable()
  {
    @MainThread
    public void run()
    {
      boolean bool = hasActiveObservers();
      if ((mInvalid.compareAndSet(false, true)) && (bool)) {
        getQueryExecutor().execute(mRefreshRunnable);
      }
    }
  };
  public final InvalidationTracker.Observer mObserver;
  public final Runnable mRefreshRunnable = new Runnable()
  {
    @WorkerThread
    public void run()
    {
      if (mRegisteredObserver.compareAndSet(false, true)) {
        mDatabase.getInvalidationTracker().addWeakObserver(mObserver);
      }
      int i;
      do
      {
        if (mComputing.compareAndSet(false, true))
        {
          Object localObject1 = null;
          i = 0;
          try
          {
            for (;;)
            {
              boolean bool = mInvalid.compareAndSet(true, false);
              if (bool) {
                try
                {
                  localObject1 = mComputeFunction.call();
                  i = 1;
                }
                catch (Exception localException)
                {
                  localObject1 = new java/lang/RuntimeException;
                  ((RuntimeException)localObject1).<init>("Exception while computing database live data.", localException);
                  throw ((Throwable)localObject1);
                }
              }
            }
            if (i != 0) {
              RoomTrackingLiveData.access$000(RoomTrackingLiveData.this, localObject1);
            }
          }
          finally
          {
            mComputing.set(false);
          }
        }
        i = 0;
      } while ((i != 0) && (mInvalid.get()));
    }
  };
  public final AtomicBoolean mRegisteredObserver = new AtomicBoolean(false);
  
  @SuppressLint({"RestrictedApi"})
  public RoomTrackingLiveData(RoomDatabase paramRoomDatabase, InvalidationLiveDataContainer paramInvalidationLiveDataContainer, boolean paramBoolean, Callable<T> paramCallable, String[] paramArrayOfString)
  {
    mDatabase = paramRoomDatabase;
    mInTransaction = paramBoolean;
    mComputeFunction = paramCallable;
    mContainer = paramInvalidationLiveDataContainer;
    mObserver = new InvalidationTracker.Observer(paramArrayOfString)
    {
      public void onInvalidated(@NonNull Set<String> paramAnonymousSet)
      {
        ArchTaskExecutor.getInstance().executeOnMainThread(mInvalidationRunnable);
      }
    };
  }
  
  public Executor getQueryExecutor()
  {
    if (mInTransaction) {
      return mDatabase.getTransactionExecutor();
    }
    return mDatabase.getQueryExecutor();
  }
  
  public void onActive()
  {
    super.onActive();
    mContainer.onActive(this);
    getQueryExecutor().execute(mRefreshRunnable);
  }
  
  public void onInactive()
  {
    super.onInactive();
    mContainer.onInactive(this);
  }
}

/* Location:
 * Qualified Name:     androidx.room.RoomTrackingLiveData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */