package android.support.v4.media.session;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class MediaControllerCompat$a$c
  extends IMediaControllerCallback.Stub
{
  public final WeakReference<MediaControllerCompat.a> a;
  
  public MediaControllerCompat$a$c(MediaControllerCompat.a parama)
  {
    a = new WeakReference(parama);
  }
  
  public final void X2(PlaybackStateCompat paramPlaybackStateCompat)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
    if (locala != null) {
      locala.a(2, paramPlaybackStateCompat, null);
    }
  }
  
  public final void f1(boolean paramBoolean)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
    if (locala != null) {
      locala.a(11, Boolean.valueOf(paramBoolean), null);
    }
  }
  
  public final void g2(int paramInt)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
    if (locala != null) {
      locala.a(12, Integer.valueOf(paramInt), null);
    }
  }
  
  public final void q(int paramInt)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
    if (locala != null) {
      locala.a(9, Integer.valueOf(paramInt), null);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */