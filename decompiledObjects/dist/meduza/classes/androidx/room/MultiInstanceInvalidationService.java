package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import ec.i;
import java.util.LinkedHashMap;
import java.util.Map;
import rb.h;

public final class MultiInstanceInvalidationService
  extends Service
{
  public int a;
  public final LinkedHashMap b = new LinkedHashMap();
  public final a c = new a(this);
  public final binder.1 d = new IMultiInstanceInvalidationService.Stub()
  {
    public final int B0(IMultiInstanceInvalidationCallback paramAnonymousIMultiInstanceInvalidationCallback, String paramAnonymousString)
    {
      i.e(paramAnonymousIMultiInstanceInvalidationCallback, "callback");
      int i = 0;
      if (paramAnonymousString == null) {
        return 0;
      }
      MultiInstanceInvalidationService localMultiInstanceInvalidationService = a;
      synchronized (c)
      {
        int j = a + 1;
        a = j;
        if (c.register(paramAnonymousIMultiInstanceInvalidationCallback, Integer.valueOf(j)))
        {
          b.put(Integer.valueOf(j), paramAnonymousString);
        }
        else
        {
          a -= 1;
          j = i;
        }
        return j;
      }
    }
    
    public final void K2(int paramAnonymousInt, String[] paramAnonymousArrayOfString)
    {
      i.e(paramAnonymousArrayOfString, "tables");
      MultiInstanceInvalidationService localMultiInstanceInvalidationService = a;
      synchronized (c)
      {
        String str = (String)b.get(Integer.valueOf(paramAnonymousInt));
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
            if (paramAnonymousInt != k)
            {
              boolean bool = i.a(str, localObject);
              if (bool) {
                try
                {
                  ((IMultiInstanceInvalidationCallback)c.getBroadcastItem(j)).j0(paramAnonymousArrayOfString);
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
        paramAnonymousArrayOfString = h.a;
        return;
      }
    }
  };
  
  public final IBinder onBind(Intent paramIntent)
  {
    i.e(paramIntent, "intent");
    return d;
  }
  
  public static final class a
    extends RemoteCallbackList<IMultiInstanceInvalidationCallback>
  {
    public a(MultiInstanceInvalidationService paramMultiInstanceInvalidationService) {}
    
    public final void onCallbackDied(IInterface paramIInterface, Object paramObject)
    {
      i.e((IMultiInstanceInvalidationCallback)paramIInterface, "callback");
      i.e(paramObject, "cookie");
      a.b.remove((Integer)paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */