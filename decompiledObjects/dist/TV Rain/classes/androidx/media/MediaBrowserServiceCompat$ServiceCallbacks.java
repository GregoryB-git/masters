package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import java.util.List;

abstract interface MediaBrowserServiceCompat$ServiceCallbacks
{
  public abstract IBinder asBinder();
  
  public abstract void onConnect(String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void onConnectFailed()
    throws RemoteException;
  
  public abstract void onLoadChildren(String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle1, Bundle paramBundle2)
    throws RemoteException;
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */