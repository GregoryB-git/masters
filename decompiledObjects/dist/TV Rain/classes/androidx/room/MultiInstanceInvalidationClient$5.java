package androidx.room;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;

class MultiInstanceInvalidationClient$5
  implements Runnable
{
  public MultiInstanceInvalidationClient$5(MultiInstanceInvalidationClient paramMultiInstanceInvalidationClient) {}
  
  public void run()
  {
    MultiInstanceInvalidationClient localMultiInstanceInvalidationClient1 = this$0;
    mInvalidationTracker.removeObserver(mObserver);
    try
    {
      localMultiInstanceInvalidationClient1 = this$0;
      IMultiInstanceInvalidationService localIMultiInstanceInvalidationService = mService;
      if (localIMultiInstanceInvalidationService != null) {
        localIMultiInstanceInvalidationService.unregisterCallback(mCallback, mClientId);
      }
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", localRemoteException);
    }
    MultiInstanceInvalidationClient localMultiInstanceInvalidationClient2 = this$0;
    mAppContext.unbindService(mServiceConnection);
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationClient.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */