package androidx.media;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import java.util.ArrayList;
import java.util.List;

class MediaBrowserServiceCompat$ServiceCallbacksCompat
  implements MediaBrowserServiceCompat.ServiceCallbacks
{
  public final Messenger mCallbacks;
  
  public MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger paramMessenger)
  {
    mCallbacks = paramMessenger;
  }
  
  private void sendRequest(int paramInt, Bundle paramBundle)
    throws RemoteException
  {
    Message localMessage = Message.obtain();
    what = paramInt;
    arg1 = 2;
    localMessage.setData(paramBundle);
    mCallbacks.send(localMessage);
  }
  
  public IBinder asBinder()
  {
    return mCallbacks.getBinder();
  }
  
  public void onConnect(String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle)
    throws RemoteException
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localBundle.putInt("extra_service_version", 2);
    paramBundle = new Bundle();
    paramBundle.putString("data_media_item_id", paramString);
    paramBundle.putParcelable("data_media_session_token", paramToken);
    paramBundle.putBundle("data_root_hints", localBundle);
    sendRequest(1, paramBundle);
  }
  
  public void onConnectFailed()
    throws RemoteException
  {
    sendRequest(2, null);
  }
  
  public void onLoadChildren(String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle1, Bundle paramBundle2)
    throws RemoteException
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("data_media_item_id", paramString);
    localBundle.putBundle("data_options", paramBundle1);
    localBundle.putBundle("data_notify_children_changed_options", paramBundle2);
    if (paramList != null)
    {
      if ((paramList instanceof ArrayList)) {
        paramString = (ArrayList)paramList;
      } else {
        paramString = new ArrayList(paramList);
      }
      localBundle.putParcelableArrayList("data_media_item_list", paramString);
    }
    sendRequest(3, localBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.ServiceCallbacksCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */