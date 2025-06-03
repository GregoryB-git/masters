package androidx.lifecycle;

import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;

final class Transformations$1
  implements Observer<X>
{
  public Transformations$1(MediatorLiveData paramMediatorLiveData, Function paramFunction) {}
  
  public void onChanged(@Nullable X paramX)
  {
    val$result.setValue(val$mapFunction.apply(paramX));
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.Transformations.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */