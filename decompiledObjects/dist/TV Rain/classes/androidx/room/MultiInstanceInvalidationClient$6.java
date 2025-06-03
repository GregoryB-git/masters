package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

class MultiInstanceInvalidationClient$6
  extends InvalidationTracker.Observer
{
  public MultiInstanceInvalidationClient$6(MultiInstanceInvalidationClient paramMultiInstanceInvalidationClient, String[] paramArrayOfString)
  {
    super(paramArrayOfString);
  }
  
  public boolean isRemote()
  {
    return true;
  }
  
  public void onInvalidated(@NonNull Set<String> paramSet)
  {
    if (this$0.mStopped.get()) {
      return;
    }
    try
    {
      MultiInstanceInvalidationClient localMultiInstanceInvalidationClient = this$0;
      IMultiInstanceInvalidationService localIMultiInstanceInvalidationService = mService;
      if (localIMultiInstanceInvalidationService != null) {
        localIMultiInstanceInvalidationService.broadcastInvalidation(mClientId, (String[])paramSet.toArray(new String[0]));
      }
    }
    catch (RemoteException paramSet)
    {
      Log.w("ROOM", "Cannot broadcast invalidation", paramSet);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationClient.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */