package androidx.room;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;

class MultiInstanceInvalidationService$2
  extends IMultiInstanceInvalidationService.Stub
{
  public MultiInstanceInvalidationService$2(MultiInstanceInvalidationService paramMultiInstanceInvalidationService) {}
  
  public void broadcastInvalidation(int paramInt, String[] paramArrayOfString)
  {
    synchronized (this$0.mCallbackList)
    {
      String str1 = (String)this$0.mClientNames.get(Integer.valueOf(paramInt));
      if (str1 == null)
      {
        Log.w("ROOM", "Remote invalidation client ID not registered");
        return;
      }
      int i = this$0.mCallbackList.beginBroadcast();
      int j = 0;
      while (j < i) {
        try
        {
          int k = ((Integer)this$0.mCallbackList.getBroadcastCookie(j)).intValue();
          String str2 = (String)this$0.mClientNames.get(Integer.valueOf(k));
          if (paramInt != k)
          {
            boolean bool = str1.equals(str2);
            if (bool) {
              try
              {
                ((IMultiInstanceInvalidationCallback)this$0.mCallbackList.getBroadcastItem(j)).onInvalidation(paramArrayOfString);
              }
              catch (RemoteException localRemoteException)
              {
                Log.w("ROOM", "Error invoking a remote callback", localRemoteException);
              }
            }
          }
          j++;
        }
        finally
        {
          this$0.mCallbackList.finishBroadcast();
        }
      }
      this$0.mCallbackList.finishBroadcast();
      return;
    }
  }
  
  public int registerCallback(IMultiInstanceInvalidationCallback paramIMultiInstanceInvalidationCallback, String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    synchronized (this$0.mCallbackList)
    {
      MultiInstanceInvalidationService localMultiInstanceInvalidationService = this$0;
      int i = mMaxClientId + 1;
      mMaxClientId = i;
      if (mCallbackList.register(paramIMultiInstanceInvalidationCallback, Integer.valueOf(i)))
      {
        this$0.mClientNames.put(Integer.valueOf(i), paramString);
        return i;
      }
      paramIMultiInstanceInvalidationCallback = this$0;
      mMaxClientId -= 1;
      return 0;
    }
  }
  
  public void unregisterCallback(IMultiInstanceInvalidationCallback paramIMultiInstanceInvalidationCallback, int paramInt)
  {
    synchronized (this$0.mCallbackList)
    {
      this$0.mCallbackList.unregister(paramIMultiInstanceInvalidationCallback);
      this$0.mClientNames.remove(Integer.valueOf(paramInt));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationService.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */