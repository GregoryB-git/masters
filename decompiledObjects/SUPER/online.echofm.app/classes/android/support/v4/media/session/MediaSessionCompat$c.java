package android.support.v4.media.session;

import a0.f;
import a0.o;
import android.app.PendingIntent;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

public abstract interface MediaSessionCompat$c
{
  public abstract boolean a();
  
  public abstract MediaSessionCompat.Token b();
  
  public abstract void c(int paramInt);
  
  public abstract void d(f paramf);
  
  public abstract void e(List paramList);
  
  public abstract PlaybackStateCompat f();
  
  public abstract void g(boolean paramBoolean);
  
  public abstract String h();
  
  public abstract void i(int paramInt);
  
  public abstract void j(PendingIntent paramPendingIntent);
  
  public abstract void k(boolean paramBoolean);
  
  public abstract void l(PlaybackStateCompat paramPlaybackStateCompat);
  
  public abstract void m(MediaSessionCompat.b paramb, Handler paramHandler);
  
  public abstract void n(int paramInt);
  
  public abstract MediaSessionCompat.b o();
  
  public abstract void p(MediaMetadataCompat paramMediaMetadataCompat);
  
  public abstract void q(PendingIntent paramPendingIntent);
  
  public abstract void r(o paramo);
  
  public abstract void release();
  
  public abstract void s(int paramInt);
  
  public abstract f t();
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */