package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.HashMap;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MultiInstanceInvalidationService
  extends Service
{
  private final IMultiInstanceInvalidationService.Stub mBinder = new IMultiInstanceInvalidationService.Stub()
  {
    public void broadcastInvalidation(int paramAnonymousInt, String[] paramAnonymousArrayOfString)
    {
      synchronized (mCallbackList)
      {
        String str1 = (String)mClientNames.get(Integer.valueOf(paramAnonymousInt));
        if (str1 == null)
        {
          Log.w("ROOM", "Remote invalidation client ID not registered");
          return;
        }
        int i = mCallbackList.beginBroadcast();
        int j = 0;
        while (j < i) {
          try
          {
            int k = ((Integer)mCallbackList.getBroadcastCookie(j)).intValue();
            String str2 = (String)mClientNames.get(Integer.valueOf(k));
            if (paramAnonymousInt != k)
            {
              boolean bool = str1.equals(str2);
              if (bool) {
                try
                {
                  ((IMultiInstanceInvalidationCallback)mCallbackList.getBroadcastItem(j)).onInvalidation(paramAnonymousArrayOfString);
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
            mCallbackList.finishBroadcast();
          }
        }
        mCallbackList.finishBroadcast();
        return;
      }
    }
    
    public int registerCallback(IMultiInstanceInvalidationCallback paramAnonymousIMultiInstanceInvalidationCallback, String paramAnonymousString)
    {
      if (paramAnonymousString == null) {
        return 0;
      }
      synchronized (mCallbackList)
      {
        MultiInstanceInvalidationService localMultiInstanceInvalidationService = MultiInstanceInvalidationService.this;
        int i = mMaxClientId + 1;
        mMaxClientId = i;
        if (mCallbackList.register(paramAnonymousIMultiInstanceInvalidationCallback, Integer.valueOf(i)))
        {
          mClientNames.put(Integer.valueOf(i), paramAnonymousString);
          return i;
        }
        paramAnonymousIMultiInstanceInvalidationCallback = MultiInstanceInvalidationService.this;
        mMaxClientId -= 1;
        return 0;
      }
    }
    
    public void unregisterCallback(IMultiInstanceInvalidationCallback paramAnonymousIMultiInstanceInvalidationCallback, int paramAnonymousInt)
    {
      synchronized (mCallbackList)
      {
        mCallbackList.unregister(paramAnonymousIMultiInstanceInvalidationCallback);
        mClientNames.remove(Integer.valueOf(paramAnonymousInt));
        return;
      }
    }
  };
  public final RemoteCallbackList<IMultiInstanceInvalidationCallback> mCallbackList = new RemoteCallbackList()
  {
    public void onCallbackDied(IMultiInstanceInvalidationCallback paramAnonymousIMultiInstanceInvalidationCallback, Object paramAnonymousObject)
    {
      mClientNames.remove(Integer.valueOf(((Integer)paramAnonymousObject).intValue()));
    }
  };
  public final HashMap<Integer, String> mClientNames = new HashMap();
  public int mMaxClientId = 0;
  
  @Nullable
  public IBinder onBind(Intent paramIntent)
  {
    return mBinder;
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */