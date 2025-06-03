package androidx.room;

import android.os.RemoteException;
import android.util.Log;

class MultiInstanceInvalidationClient$3
  implements Runnable
{
  public MultiInstanceInvalidationClient$3(MultiInstanceInvalidationClient paramMultiInstanceInvalidationClient) {}
  
  public void run()
  {
    try
    {
      MultiInstanceInvalidationClient localMultiInstanceInvalidationClient = this$0;
      Object localObject = mService;
      if (localObject != null)
      {
        mClientId = ((IMultiInstanceInvalidationService)localObject).registerCallback(mCallback, mName);
        localObject = this$0;
        mInvalidationTracker.addObserver(mObserver);
      }
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("ROOM", "Cannot register multi-instance invalidation callback", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationClient.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */