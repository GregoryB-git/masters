package androidx.lifecycle;

import java.util.concurrent.Executor;

class ComputableLiveData$1
  extends LiveData<T>
{
  public ComputableLiveData$1(ComputableLiveData paramComputableLiveData) {}
  
  public void onActive()
  {
    ComputableLiveData localComputableLiveData = this$0;
    mExecutor.execute(mRefreshRunnable);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ComputableLiveData.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */