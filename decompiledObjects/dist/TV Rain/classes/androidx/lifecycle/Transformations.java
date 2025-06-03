package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;

public class Transformations
{
  @MainThread
  @NonNull
  public static <X> LiveData<X> distinctUntilChanged(@NonNull LiveData<X> paramLiveData)
  {
    MediatorLiveData localMediatorLiveData = new MediatorLiveData();
    localMediatorLiveData.addSource(paramLiveData, new Observer()
    {
      public boolean mFirstTime = true;
      
      public void onChanged(X paramAnonymousX)
      {
        Object localObject = val$outputLiveData.getValue();
        if ((mFirstTime) || ((localObject == null) && (paramAnonymousX != null)) || ((localObject != null) && (!localObject.equals(paramAnonymousX))))
        {
          mFirstTime = false;
          val$outputLiveData.setValue(paramAnonymousX);
        }
      }
    });
    return localMediatorLiveData;
  }
  
  @MainThread
  @NonNull
  public static <X, Y> LiveData<Y> map(@NonNull LiveData<X> paramLiveData, @NonNull final Function<X, Y> paramFunction)
  {
    MediatorLiveData localMediatorLiveData = new MediatorLiveData();
    localMediatorLiveData.addSource(paramLiveData, new Observer()
    {
      public void onChanged(@Nullable X paramAnonymousX)
      {
        val$result.setValue(paramFunction.apply(paramAnonymousX));
      }
    });
    return localMediatorLiveData;
  }
  
  @MainThread
  @NonNull
  public static <X, Y> LiveData<Y> switchMap(@NonNull LiveData<X> paramLiveData, @NonNull Function<X, LiveData<Y>> paramFunction)
  {
    final MediatorLiveData localMediatorLiveData = new MediatorLiveData();
    localMediatorLiveData.addSource(paramLiveData, new Observer()
    {
      public LiveData<Y> mSource;
      
      public void onChanged(@Nullable X paramAnonymousX)
      {
        paramAnonymousX = (LiveData)val$switchMapFunction.apply(paramAnonymousX);
        LiveData localLiveData = mSource;
        if (localLiveData == paramAnonymousX) {
          return;
        }
        if (localLiveData != null) {
          localMediatorLiveData.removeSource(localLiveData);
        }
        mSource = paramAnonymousX;
        if (paramAnonymousX != null) {
          localMediatorLiveData.addSource(paramAnonymousX, new Observer()
          {
            public void onChanged(@Nullable Y paramAnonymous2Y)
            {
              val$result.setValue(paramAnonymous2Y);
            }
          });
        }
      }
    });
    return localMediatorLiveData;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.Transformations
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */