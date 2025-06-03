package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class MediaBrowserCompat$a
  extends Handler
{
  public final WeakReference a;
  public WeakReference b;
  
  public MediaBrowserCompat$a(MediaBrowserCompat.g paramg)
  {
    a = new WeakReference(paramg);
  }
  
  public void a(Messenger paramMessenger)
  {
    b = new WeakReference(paramMessenger);
  }
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject1 = b;
    if ((localObject1 != null) && (((Reference)localObject1).get() != null) && (a.get() != null))
    {
      Object localObject2 = paramMessage.getData();
      MediaSessionCompat.a((Bundle)localObject2);
      MediaBrowserCompat.g localg = (MediaBrowserCompat.g)a.get();
      localObject1 = (Messenger)b.get();
      try
      {
        int i = what;
        Bundle localBundle2;
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              ((StringBuilder)localObject2).append("Unhandled message: ");
              ((StringBuilder)localObject2).append(paramMessage);
              ((StringBuilder)localObject2).append("\n  Client version: ");
              ((StringBuilder)localObject2).append(1);
              ((StringBuilder)localObject2).append("\n  Service version: ");
              ((StringBuilder)localObject2).append(arg1);
              Log.w("MediaBrowserCompat", ((StringBuilder)localObject2).toString());
            }
            else
            {
              Bundle localBundle1 = ((Bundle)localObject2).getBundle("data_options");
              MediaSessionCompat.a(localBundle1);
              localBundle2 = ((Bundle)localObject2).getBundle("data_notify_children_changed_options");
              MediaSessionCompat.a(localBundle2);
              localg.h((Messenger)localObject1, ((BaseBundle)localObject2).getString("data_media_item_id"), ((Bundle)localObject2).getParcelableArrayList("data_media_item_list"), localBundle1, localBundle2);
            }
          }
          else {
            localg.d((Messenger)localObject1);
          }
        }
        else
        {
          localBundle2 = ((Bundle)localObject2).getBundle("data_root_hints");
          MediaSessionCompat.a(localBundle2);
          localg.e((Messenger)localObject1, ((BaseBundle)localObject2).getString("data_media_item_id"), (MediaSessionCompat.Token)((Bundle)localObject2).getParcelable("data_media_session_token"), localBundle2);
        }
      }
      catch (BadParcelableException localBadParcelableException)
      {
        Log.e("MediaBrowserCompat", "Could not unparcel the data.");
        if (what == 1) {
          localg.d((Messenger)localObject1);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */