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

public final class MediaBrowserCompat$b
  extends Handler
{
  public final WeakReference<MediaBrowserCompat.g> a;
  public WeakReference<Messenger> b;
  
  public MediaBrowserCompat$b(MediaBrowserCompat.g paramg)
  {
    a = new WeakReference(paramg);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    Object localObject1 = b;
    if ((localObject1 != null) && (((Reference)localObject1).get() != null) && (a.get() != null))
    {
      Bundle localBundle = paramMessage.getData();
      MediaSessionCompat.a(localBundle);
      localObject1 = (MediaBrowserCompat.g)a.get();
      Messenger localMessenger = (Messenger)b.get();
      try
      {
        int i = what;
        Object localObject2;
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
              localObject2 = localBundle.getBundle("data_options");
              MediaSessionCompat.a((Bundle)localObject2);
              MediaSessionCompat.a(localBundle.getBundle("data_notify_children_changed_options"));
              String str = localBundle.getString("data_media_item_id");
              localBundle.getParcelableArrayList("data_media_item_list");
              ((MediaBrowserCompat.g)localObject1).c(localMessenger, str, (Bundle)localObject2);
            }
          }
          else {
            ((MediaBrowserCompat.g)localObject1).a();
          }
        }
        else
        {
          MediaSessionCompat.a(localBundle.getBundle("data_root_hints"));
          localBundle.getString("data_media_item_id");
          localObject2 = (MediaSessionCompat.Token)localBundle.getParcelable("data_media_session_token");
          ((MediaBrowserCompat.g)localObject1).b();
        }
      }
      catch (BadParcelableException localBadParcelableException)
      {
        Log.e("MediaBrowserCompat", "Could not unparcel the data.");
        if (what == 1) {
          ((MediaBrowserCompat.g)localObject1).a();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */