package android.support.v4.media;

import android.media.browse.MediaBrowser.ConnectionCallback;

public class MediaBrowserCompat$b$a
  extends MediaBrowser.ConnectionCallback
{
  public MediaBrowserCompat$b$a(MediaBrowserCompat.b paramb) {}
  
  public void onConnected()
  {
    MediaBrowserCompat.b.b localb = a.b;
    if (localb != null) {
      localb.f();
    }
    a.a();
  }
  
  public void onConnectionFailed()
  {
    MediaBrowserCompat.b.b localb = a.b;
    if (localb != null) {
      localb.g();
    }
    a.b();
  }
  
  public void onConnectionSuspended()
  {
    MediaBrowserCompat.b.b localb = a.b;
    if (localb != null) {
      localb.i();
    }
    a.c();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */