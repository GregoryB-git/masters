package android.support.v4.media;

import android.media.browse.MediaBrowser.ConnectionCallback;

public abstract class MediaBrowserCompat$b
{
  public final MediaBrowser.ConnectionCallback a = new a();
  public b b;
  
  public abstract void a();
  
  public abstract void b();
  
  public abstract void c();
  
  public void d(b paramb)
  {
    b = paramb;
  }
  
  public class a
    extends MediaBrowser.ConnectionCallback
  {
    public a() {}
    
    public void onConnected()
    {
      MediaBrowserCompat.b.b localb = b;
      if (localb != null) {
        localb.f();
      }
      a();
    }
    
    public void onConnectionFailed()
    {
      MediaBrowserCompat.b.b localb = b;
      if (localb != null) {
        localb.g();
      }
      b();
    }
    
    public void onConnectionSuspended()
    {
      MediaBrowserCompat.b.b localb = b;
      if (localb != null) {
        localb.i();
      }
      c();
    }
  }
  
  public static abstract interface b
  {
    public abstract void f();
    
    public abstract void g();
    
    public abstract void i();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */