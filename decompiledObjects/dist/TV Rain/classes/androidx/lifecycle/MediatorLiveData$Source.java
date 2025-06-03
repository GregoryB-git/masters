package androidx.lifecycle;

import androidx.annotation.Nullable;

class MediatorLiveData$Source<V>
  implements Observer<V>
{
  public final LiveData<V> mLiveData;
  public final Observer<? super V> mObserver;
  public int mVersion = -1;
  
  public MediatorLiveData$Source(LiveData<V> paramLiveData, Observer<? super V> paramObserver)
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

/* Location:
 * Qualified Name:     androidx.lifecycle.MediatorLiveData.Source
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */