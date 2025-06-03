package g1;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import f;
import r.h;

public final class k
  implements Runnable
{
  public k(int paramInt1, int paramInt2, Bundle paramBundle, c.k paramk, c.m paramm, String paramString) {}
  
  public final void run()
  {
    IBinder localIBinder = ((c.m)a).a();
    f.a.d.remove(localIBinder);
    Object localObject1 = new c.c(f.a, b, c, d, a);
    f.a.getClass();
    f = f.a.b(e);
    f.a.getClass();
    Object localObject2;
    if (f == null)
    {
      StringBuilder localStringBuilder1 = f.l("No root for client ");
      localStringBuilder1.append(b);
      localStringBuilder1.append(" from service ");
      localStringBuilder1.append(k.class.getName());
      Log.i("MBServiceCompat", localStringBuilder1.toString());
      try
      {
        ((c.m)a).c(2, null);
      }
      catch (RemoteException localRemoteException1)
      {
        localObject2 = f.l("Calling onConnectFailed() failed. Ignoring. pkg=");
        ((StringBuilder)localObject2).append(b);
        Log.w("MBServiceCompat", ((StringBuilder)localObject2).toString());
      }
    }
    else
    {
      try
      {
        f.a.d.put(localIBinder, localObject1);
        localIBinder.linkToDeath((IBinder.DeathRecipient)localObject1, 0);
        MediaSessionCompat.Token localToken = f.a.f;
        if (localToken != null)
        {
          localObject2 = a;
          localObject1 = f;
          String str = a;
          localObject1 = b;
          c.m localm = (c.m)localObject2;
          localm.getClass();
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = new android/os/Bundle;
            ((Bundle)localObject2).<init>();
          }
          ((BaseBundle)localObject2).putInt("extra_service_version", 2);
          localObject1 = new android/os/Bundle;
          ((Bundle)localObject1).<init>();
          ((BaseBundle)localObject1).putString("data_media_item_id", str);
          ((Bundle)localObject1).putParcelable("data_media_session_token", localToken);
          ((Bundle)localObject1).putBundle("data_root_hints", (Bundle)localObject2);
          localm.c(1, (Bundle)localObject1);
        }
      }
      catch (RemoteException localRemoteException2)
      {
        StringBuilder localStringBuilder2 = f.l("Calling onConnect() failed. Dropping client. pkg=");
        localStringBuilder2.append(b);
        Log.w("MBServiceCompat", localStringBuilder2.toString());
        f.a.d.remove(localIBinder);
      }
    }
  }
}

/* Location:
 * Qualified Name:     g1.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */