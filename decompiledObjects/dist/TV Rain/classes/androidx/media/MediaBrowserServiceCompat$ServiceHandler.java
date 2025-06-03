package androidx.media;

import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import androidx.core.app.BundleCompat;

final class MediaBrowserServiceCompat$ServiceHandler
  extends Handler
{
  private final MediaBrowserServiceCompat.ServiceBinderImpl mServiceBinderImpl;
  
  public MediaBrowserServiceCompat$ServiceHandler(MediaBrowserServiceCompat paramMediaBrowserServiceCompat)
  {
    mServiceBinderImpl = new MediaBrowserServiceCompat.ServiceBinderImpl(paramMediaBrowserServiceCompat);
  }
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject = paramMessage.getData();
    Bundle localBundle;
    switch (what)
    {
    default: 
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Unhandled message: ");
      ((StringBuilder)localObject).append(paramMessage);
      ((StringBuilder)localObject).append("\n  Service version: ");
      ((StringBuilder)localObject).append(2);
      ((StringBuilder)localObject).append("\n  Client version: ");
      ((StringBuilder)localObject).append(arg1);
      Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
      break;
    case 9: 
      localBundle = ((Bundle)localObject).getBundle("data_custom_action_extras");
      MediaSessionCompat.ensureClassLoader(localBundle);
      mServiceBinderImpl.sendCustomAction(((BaseBundle)localObject).getString("data_custom_action"), localBundle, (ResultReceiver)((Bundle)localObject).getParcelable("data_result_receiver"), new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
      break;
    case 8: 
      localBundle = ((Bundle)localObject).getBundle("data_search_extras");
      MediaSessionCompat.ensureClassLoader(localBundle);
      mServiceBinderImpl.search(((BaseBundle)localObject).getString("data_search_query"), localBundle, (ResultReceiver)((Bundle)localObject).getParcelable("data_result_receiver"), new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
      break;
    case 7: 
      mServiceBinderImpl.unregisterCallbacks(new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
      break;
    case 6: 
      localBundle = ((Bundle)localObject).getBundle("data_root_hints");
      MediaSessionCompat.ensureClassLoader(localBundle);
      mServiceBinderImpl.registerCallbacks(new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo), ((BaseBundle)localObject).getString("data_package_name"), ((BaseBundle)localObject).getInt("data_calling_pid"), ((BaseBundle)localObject).getInt("data_calling_uid"), localBundle);
      break;
    case 5: 
      mServiceBinderImpl.getMediaItem(((BaseBundle)localObject).getString("data_media_item_id"), (ResultReceiver)((Bundle)localObject).getParcelable("data_result_receiver"), new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
      break;
    case 4: 
      mServiceBinderImpl.removeSubscription(((BaseBundle)localObject).getString("data_media_item_id"), BundleCompat.getBinder((Bundle)localObject, "data_callback_token"), new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
      break;
    case 3: 
      localBundle = ((Bundle)localObject).getBundle("data_options");
      MediaSessionCompat.ensureClassLoader(localBundle);
      mServiceBinderImpl.addSubscription(((BaseBundle)localObject).getString("data_media_item_id"), BundleCompat.getBinder((Bundle)localObject, "data_callback_token"), localBundle, new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
      break;
    case 2: 
      mServiceBinderImpl.disconnect(new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
      break;
    case 1: 
      localBundle = ((Bundle)localObject).getBundle("data_root_hints");
      MediaSessionCompat.ensureClassLoader(localBundle);
      mServiceBinderImpl.connect(((BaseBundle)localObject).getString("data_package_name"), ((BaseBundle)localObject).getInt("data_calling_pid"), ((BaseBundle)localObject).getInt("data_calling_uid"), localBundle, new MediaBrowserServiceCompat.ServiceCallbacksCompat(replyTo));
    }
  }
  
  public void postOrRun(Runnable paramRunnable)
  {
    if (Thread.currentThread() == getLooper().getThread()) {
      paramRunnable.run();
    } else {
      post(paramRunnable);
    }
  }
  
  public boolean sendMessageAtTime(Message paramMessage, long paramLong)
  {
    Bundle localBundle = paramMessage.getData();
    localBundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
    localBundle.putInt("data_calling_uid", Binder.getCallingUid());
    int i = Binder.getCallingPid();
    if (i > 0) {
      localBundle.putInt("data_calling_pid", i);
    } else if (!localBundle.containsKey("data_calling_pid")) {
      localBundle.putInt("data_calling_pid", -1);
    }
    return super.sendMessageAtTime(paramMessage, paramLong);
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.ServiceHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */