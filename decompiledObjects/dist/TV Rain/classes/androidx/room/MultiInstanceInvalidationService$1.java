package androidx.room;

import android.os.RemoteCallbackList;
import java.util.HashMap;

class MultiInstanceInvalidationService$1
  extends RemoteCallbackList<IMultiInstanceInvalidationCallback>
{
  public MultiInstanceInvalidationService$1(MultiInstanceInvalidationService paramMultiInstanceInvalidationService) {}
  
  public void onCallbackDied(IMultiInstanceInvalidationCallback paramIMultiInstanceInvalidationCallback, Object paramObject)
  {
    this$0.mClientNames.remove(Integer.valueOf(((Integer)paramObject).intValue()));
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationService.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */