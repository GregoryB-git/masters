package androidx.lifecycle;

import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;

final class Transformations$2
  implements Observer<X>
{
  public LiveData<Y> mSource;
  
  public Transformations$2(Function paramFunction, MediatorLiveData paramMediatorLiveData) {}
  
  public void onChanged(@Nullable X paramX)
  {
    paramX = (LiveData)val$switchMapFunction.apply(paramX);
    LiveData localLiveData = mSource;
    if (localLiveData == paramX) {
      return;
    }
    if (localLiveData != null) {
      val$result.removeSource(localLiveData);
    }
    mSource = paramX;
    if (paramX != null) {
      val$result.addSource(paramX, new Observer()
      {
        public void onChanged(@Nullable Y paramAnonymousY)
        {
          val$result.setValue(paramAnonymousY);
        }
      });
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.Transformations.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */