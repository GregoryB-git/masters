package g1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.a;
import android.text.TextUtils;
import android.util.Log;

public final class c$n
  extends Handler
{
  public final c.k a;
  
  public c$n(c paramc)
  {
    a = new c.k(paramc);
  }
  
  public final void a(Runnable paramRunnable)
  {
    if (Thread.currentThread() == getLooper().getThread()) {
      paramRunnable.run();
    } else {
      post(paramRunnable);
    }
  }
  
  public final void handleMessage(Message paramMessage)
  {
    Object localObject1 = paramMessage.getData();
    Object localObject2;
    Object localObject3;
    Object localObject4;
    int i;
    int j;
    switch (what)
    {
    default: 
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Unhandled message: ");
      ((StringBuilder)localObject1).append(paramMessage);
      ((StringBuilder)localObject1).append("\n  Service version: ");
      ((StringBuilder)localObject1).append(2);
      ((StringBuilder)localObject1).append("\n  Client version: ");
      ((StringBuilder)localObject1).append(arg1);
      Log.w("MBServiceCompat", ((StringBuilder)localObject1).toString());
      break;
    case 9: 
      localObject2 = ((Bundle)localObject1).getBundle("data_custom_action_extras");
      MediaSessionCompat.a((Bundle)localObject2);
      localObject3 = a;
      localObject4 = ((BaseBundle)localObject1).getString("data_custom_action");
      localObject1 = (a)((Bundle)localObject1).getParcelable("data_result_receiver");
      paramMessage = new c.m(replyTo);
      localObject3.getClass();
      if ((!TextUtils.isEmpty((CharSequence)localObject4)) && (localObject1 != null)) {
        a.e.a(new s((c.k)localObject3, paramMessage, (String)localObject4, (Bundle)localObject2, (a)localObject1));
      }
      break;
    case 8: 
      localObject4 = ((Bundle)localObject1).getBundle("data_search_extras");
      MediaSessionCompat.a((Bundle)localObject4);
      localObject3 = a;
      localObject2 = ((BaseBundle)localObject1).getString("data_search_query");
      localObject1 = (a)((Bundle)localObject1).getParcelable("data_result_receiver");
      paramMessage = new c.m(replyTo);
      localObject3.getClass();
      if ((!TextUtils.isEmpty((CharSequence)localObject2)) && (localObject1 != null)) {
        a.e.a(new r((c.k)localObject3, paramMessage, (String)localObject2, (Bundle)localObject4, (a)localObject1));
      }
      break;
    case 7: 
      localObject1 = a;
      paramMessage = new c.m(replyTo);
      a.e.a(new q((c.k)localObject1, paramMessage));
      break;
    case 6: 
      localObject4 = ((Bundle)localObject1).getBundle("data_root_hints");
      MediaSessionCompat.a((Bundle)localObject4);
      localObject2 = a;
      localObject3 = new c.m(replyTo);
      paramMessage = ((BaseBundle)localObject1).getString("data_package_name");
      i = ((BaseBundle)localObject1).getInt("data_calling_pid");
      j = ((BaseBundle)localObject1).getInt("data_calling_uid");
      a.e.a(new p(j, i, (Bundle)localObject4, (c.k)localObject2, (c.m)localObject3, paramMessage));
      break;
    case 5: 
      localObject4 = a;
      localObject2 = ((BaseBundle)localObject1).getString("data_media_item_id");
      localObject1 = (a)((Bundle)localObject1).getParcelable("data_result_receiver");
      paramMessage = new c.m(replyTo);
      localObject4.getClass();
      if ((!TextUtils.isEmpty((CharSequence)localObject2)) && (localObject1 != null)) {
        a.e.a(new o((c.k)localObject4, paramMessage, (String)localObject2, (a)localObject1));
      }
      break;
    case 4: 
      localObject2 = a;
      localObject4 = ((BaseBundle)localObject1).getString("data_media_item_id");
      localObject1 = ((Bundle)localObject1).getBinder("data_callback_token");
      paramMessage = new c.m(replyTo);
      a.e.a(new n((c.k)localObject2, paramMessage, (String)localObject4, (IBinder)localObject1));
      break;
    case 3: 
      localObject2 = ((Bundle)localObject1).getBundle("data_options");
      MediaSessionCompat.a((Bundle)localObject2);
      localObject3 = a;
      localObject4 = ((BaseBundle)localObject1).getString("data_media_item_id");
      localObject1 = ((Bundle)localObject1).getBinder("data_callback_token");
      paramMessage = new c.m(replyTo);
      a.e.a(new m((c.k)localObject3, paramMessage, (String)localObject4, (IBinder)localObject1, (Bundle)localObject2));
      break;
    case 2: 
      localObject1 = a;
      paramMessage = new c.m(replyTo);
      a.e.a(new l((c.k)localObject1, paramMessage));
      break;
    case 1: 
      localObject3 = ((Bundle)localObject1).getBundle("data_root_hints");
      MediaSessionCompat.a((Bundle)localObject3);
      localObject4 = a;
      localObject2 = ((BaseBundle)localObject1).getString("data_package_name");
      int k = ((BaseBundle)localObject1).getInt("data_calling_pid");
      int m = ((BaseBundle)localObject1).getInt("data_calling_uid");
      paramMessage = new c.m(replyTo);
      localObject1 = a;
      int n = 0;
      if (localObject2 == null)
      {
        localObject1.getClass();
        i = n;
      }
      else
      {
        localObject1 = ((Context)localObject1).getPackageManager().getPackagesForUid(m);
        int i1 = localObject1.length;
        for (j = 0;; j++)
        {
          i = n;
          if (j >= i1) {
            break;
          }
          if (localObject1[j].equals(localObject2))
          {
            i = 1;
            break;
          }
        }
      }
      if (i != 0)
      {
        a.e.a(new k(k, m, (Bundle)localObject3, (c.k)localObject4, paramMessage, (String)localObject2));
      }
      else
      {
        paramMessage = new StringBuilder();
        paramMessage.append("Package/uid mismatch: uid=");
        paramMessage.append(m);
        paramMessage.append(" package=");
        paramMessage.append((String)localObject2);
        throw new IllegalArgumentException(paramMessage.toString());
      }
      break;
    }
  }
  
  public final boolean sendMessageAtTime(Message paramMessage, long paramLong)
  {
    Bundle localBundle = paramMessage.getData();
    localBundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
    localBundle.putInt("data_calling_uid", Binder.getCallingUid());
    int i = Binder.getCallingPid();
    if (i > 0) {}
    for (;;)
    {
      localBundle.putInt("data_calling_pid", i);
      break;
      if (localBundle.containsKey("data_calling_pid")) {
        break;
      }
      i = -1;
    }
    return super.sendMessageAtTime(paramMessage, paramLong);
  }
}

/* Location:
 * Qualified Name:     g1.c.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */