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
import androidx.annotation.NonNull;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class MediaBrowserCompat$CallbackHandler
  extends Handler
{
  private final WeakReference<MediaBrowserCompat.MediaBrowserServiceCallbackImpl> mCallbackImplRef;
  private WeakReference<Messenger> mCallbacksMessengerRef;
  
  public MediaBrowserCompat$CallbackHandler(MediaBrowserCompat.MediaBrowserServiceCallbackImpl paramMediaBrowserServiceCallbackImpl)
  {
    mCallbackImplRef = new WeakReference(paramMediaBrowserServiceCallbackImpl);
  }
  
  public void handleMessage(@NonNull Message paramMessage)
  {
    Object localObject1 = mCallbacksMessengerRef;
    if ((localObject1 != null) && (((Reference)localObject1).get() != null) && (mCallbackImplRef.get() != null))
    {
      Object localObject2 = paramMessage.getData();
      MediaSessionCompat.ensureClassLoader((Bundle)localObject2);
      localObject1 = (MediaBrowserCompat.MediaBrowserServiceCallbackImpl)mCallbackImplRef.get();
      Messenger localMessenger = (Messenger)mCallbacksMessengerRef.get();
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
              MediaSessionCompat.ensureClassLoader(localBundle1);
              localBundle2 = ((Bundle)localObject2).getBundle("data_notify_children_changed_options");
              MediaSessionCompat.ensureClassLoader(localBundle2);
              ((MediaBrowserCompat.MediaBrowserServiceCallbackImpl)localObject1).onLoadChildren(localMessenger, ((BaseBundle)localObject2).getString("data_media_item_id"), ((Bundle)localObject2).getParcelableArrayList("data_media_item_list"), localBundle1, localBundle2);
            }
          }
          else {
            ((MediaBrowserCompat.MediaBrowserServiceCallbackImpl)localObject1).onConnectionFailed(localMessenger);
          }
        }
        else
        {
          localBundle2 = ((Bundle)localObject2).getBundle("data_root_hints");
          MediaSessionCompat.ensureClassLoader(localBundle2);
          ((MediaBrowserCompat.MediaBrowserServiceCallbackImpl)localObject1).onServiceConnected(localMessenger, ((BaseBundle)localObject2).getString("data_media_item_id"), (MediaSessionCompat.Token)((Bundle)localObject2).getParcelable("data_media_session_token"), localBundle2);
        }
      }
      catch (BadParcelableException localBadParcelableException)
      {
        Log.e("MediaBrowserCompat", "Could not unparcel the data.");
        if (what == 1) {
          ((MediaBrowserCompat.MediaBrowserServiceCallbackImpl)localObject1).onConnectionFailed(localMessenger);
        }
      }
    }
  }
  
  public void setCallbacksMessenger(Messenger paramMessenger)
  {
    mCallbacksMessengerRef = new WeakReference(paramMessenger);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.CallbackHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */