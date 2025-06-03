package androidx.lifecycle;

class LiveData$AlwaysActiveObserver
  extends LiveData<T>.ObserverWrapper
{
  public LiveData$AlwaysActiveObserver(Observer<? super T> paramObserver)
  {
    super(paramObserver, localObserver);
  }
  
  public boolean shouldBeActive()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LiveData.AlwaysActiveObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */