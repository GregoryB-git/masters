package androidx.room;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import ec.i;
import java.util.Map;

public final class MultiInstanceInvalidationService$a
  extends RemoteCallbackList<IMultiInstanceInvalidationCallback>
{
  public MultiInstanceInvalidationService$a(MultiInstanceInvalidationService paramMultiInstanceInvalidationService) {}
  
  public final void onCallbackDied(IInterface paramIInterface, Object paramObject)
  {
    i.e((IMultiInstanceInvalidationCallback)paramIInterface, "callback");
    i.e(paramObject, "cookie");
    a.b.remove((Integer)paramObject);
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationService.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */