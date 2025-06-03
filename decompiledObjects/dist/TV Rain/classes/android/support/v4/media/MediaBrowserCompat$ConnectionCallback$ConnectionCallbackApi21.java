package android.support.v4.media;

import android.media.browse.MediaBrowser.ConnectionCallback;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class MediaBrowserCompat$ConnectionCallback$ConnectionCallbackApi21
  extends MediaBrowser.ConnectionCallback
{
  public MediaBrowserCompat$ConnectionCallback$ConnectionCallbackApi21(MediaBrowserCompat.ConnectionCallback paramConnectionCallback) {}
  
  public void onConnected()
  {
    MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal localConnectionCallbackInternal = this$0.mConnectionCallbackInternal;
    if (localConnectionCallbackInternal != null) {
      localConnectionCallbackInternal.onConnected();
    }
    this$0.onConnected();
  }
  
  public void onConnectionFailed()
  {
    MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal localConnectionCallbackInternal = this$0.mConnectionCallbackInternal;
    if (localConnectionCallbackInternal != null) {
      localConnectionCallbackInternal.onConnectionFailed();
    }
    this$0.onConnectionFailed();
  }
  
  public void onConnectionSuspended()
  {
    MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal localConnectionCallbackInternal = this$0.mConnectionCallbackInternal;
    if (localConnectionCallbackInternal != null) {
      localConnectionCallbackInternal.onConnectionSuspended();
    }
    this$0.onConnectionSuspended();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */