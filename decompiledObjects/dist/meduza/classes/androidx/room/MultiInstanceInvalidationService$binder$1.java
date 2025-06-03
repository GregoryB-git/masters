package androidx.room;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import ec.i;
import java.util.LinkedHashMap;
import java.util.Map;
import rb.h;

public final class MultiInstanceInvalidationService$binder$1
  extends IMultiInstanceInvalidationService.Stub
{
  public MultiInstanceInvalidationService$binder$1(MultiInstanceInvalidationService paramMultiInstanceInvalidationService) {}
  
  public final int B0(IMultiInstanceInvalidationCallback paramIMultiInstanceInvalidationCallback, String paramString)
  {
    i.e(paramIMultiInstanceInvalidationCallback, "callback");
    int i = 0;
    if (paramString == null) {
      return 0;
    }
    MultiInstanceInvalidationService localMultiInstanceInvalidationService = a;
    synchronized (c)
    {
      int j = a + 1;
      a = j;
      if (c.register(paramIMultiInstanceInvalidationCallback, Integer.valueOf(j)))
      {
        b.put(Integer.valueOf(j), paramString);
      }
      else
      {
        a -= 1;
        j = i;
      }
      return j;
    }
  }
  
  public final void K2(int paramInt, String[] paramArrayOfString)
  {
    i.e(paramArrayOfString, "tables");
    MultiInstanceInvalidationService localMultiInstanceInvalidationService = a;
    synchronized (c)
    {
      String str = (String)b.get(Integer.valueOf(paramInt));
      if (str == null)
      {
        Log.w("ROOM", "Remote invalidation client ID not registered");
        return;
      }
      int i = c.beginBroadcast();
      int j = 0;
      while (j < i) {
        try
        {
          Object localObject = c.getBroadcastCookie(j);
          i.c(localObject, "null cannot be cast to non-null type kotlin.Int");
          int k = ((Integer)localObject).intValue();
          localObject = (String)b.get(Integer.valueOf(k));
          if (paramInt != k)
          {
            boolean bool = i.a(str, localObject);
            if (bool) {
              try
              {
                ((IMultiInstanceInvalidationCallback)c.getBroadcastItem(j)).j0(paramArrayOfString);
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
          c.finishBroadcast();
        }
      }
      c.finishBroadcast();
      paramArrayOfString = h.a;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationService.binder.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */