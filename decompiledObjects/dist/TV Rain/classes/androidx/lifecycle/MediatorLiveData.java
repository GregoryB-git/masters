package androidx.lifecycle;

import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MediatorLiveData<T>
  extends MutableLiveData<T>
{
  private SafeIterableMap<LiveData<?>, Source<?>> mSources = new SafeIterableMap();
  
  @MainThread
  public <S> void addSource(@NonNull LiveData<S> paramLiveData, @NonNull Observer<? super S> paramObserver)
  {
    Source localSource = new Source(paramLiveData, paramObserver);
    paramLiveData = (Source)mSources.putIfAbsent(paramLiveData, localSource);
    if ((paramLiveData != null) && (mObserver != paramObserver)) {
      throw new IllegalArgumentException("This source was already added with the different observer");
    }
    if (paramLiveData != null) {
      return;
    }
    if (hasActiveObservers()) {
      localSource.plug();
    }
  }
  
  @CallSuper
  public void onActive()
  {
    Iterator localIterator = mSources.iterator();
    while (localIterator.hasNext()) {
      ((Source)((Map.Entry)localIterator.next()).getValue()).plug();
    }
  }
  
  @CallSuper
  public void onInactive()
  {
    Iterator localIterator = mSources.iterator();
    while (localIterator.hasNext()) {
      ((Source)((Map.Entry)localIterator.next()).getValue()).unplug();
    }
  }
  
  @MainThread
  public <S> void removeSource(@NonNull LiveData<S> paramLiveData)
  {
    paramLiveData = (Source)mSources.remove(paramLiveData);
    if (paramLiveData != null) {
      paramLiveData.unplug();
    }
  }
  
  public static class Source<V>
    implements Observer<V>
  {
    public final LiveData<V> mLiveData;
    public final Observer<? super V> mObserver;
    public int mVersion = -1;
    
    public Source(LiveData<V> paramLiveData, Observer<? super V> paramObserver)
    {
      mLiveData = paramLiveData;
      mObserver = paramObserver;
    }
    
    public void onChanged(@Nullable V paramV)
    {
      if (mVersion != mLiveData.getVersion())
      {
        mVersion = mLiveData.getVersion();
        mObserver.onChanged(paramV);
      }
    }
    
    public void plug()
    {
      mLiveData.observeForever(this);
    }
    
    public void unplug()
    {
      mLiveData.removeObserver(this);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.MediatorLiveData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */