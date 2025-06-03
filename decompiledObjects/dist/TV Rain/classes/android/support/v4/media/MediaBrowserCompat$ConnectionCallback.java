package android.support.v4.media;

import android.media.browse.MediaBrowser.ConnectionCallback;
import androidx.annotation.RequiresApi;

public class MediaBrowserCompat$ConnectionCallback
{
  public final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new ConnectionCallbackApi21();
  public ConnectionCallbackInternal mConnectionCallbackInternal;
  
  public void onConnected() {}
  
  public void onConnectionFailed() {}
  
  public void onConnectionSuspended() {}
  
  public void setInternalConnectionCallback(ConnectionCallbackInternal paramConnectionCallbackInternal)
  {
    mConnectionCallbackInternal = paramConnectionCallbackInternal;
  }
  
  @RequiresApi(21)
  public class ConnectionCallbackApi21
    extends MediaBrowser.ConnectionCallback
  {
    public ConnectionCallbackApi21() {}
    
    public void onConnected()
    {
      MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal localConnectionCallbackInternal = mConnectionCallbackInternal;
      if (localConnectionCallbackInternal != null) {
        localConnectionCallbackInternal.onConnected();
      }
      MediaBrowserCompat.ConnectionCallback.this.onConnected();
    }
    
    public void onConnectionFailed()
    {
      MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal localConnectionCallbackInternal = mConnectionCallbackInternal;
      if (localConnectionCallbackInternal != null) {
        localConnectionCallbackInternal.onConnectionFailed();
      }
      MediaBrowserCompat.ConnectionCallback.this.onConnectionFailed();
    }
    
    public void onConnectionSuspended()
    {
      MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal localConnectionCallbackInternal = mConnectionCallbackInternal;
      if (localConnectionCallbackInternal != null) {
        localConnectionCallbackInternal.onConnectionSuspended();
      }
      MediaBrowserCompat.ConnectionCallback.this.onConnectionSuspended();
    }
  }
  
  public static abstract interface ConnectionCallbackInternal
  {
    public abstract void onConnected();
    
    public abstract void onConnectionFailed();
    
    public abstract void onConnectionSuspended();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.ConnectionCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */