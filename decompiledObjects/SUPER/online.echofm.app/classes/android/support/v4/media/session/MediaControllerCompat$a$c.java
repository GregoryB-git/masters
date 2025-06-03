package android.support.v4.media.session;

import android.os.Bundle;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class MediaControllerCompat$a$c
  extends a.a
{
  public final WeakReference b;
  
  public MediaControllerCompat$a$c(MediaControllerCompat.a parama)
  {
    b = new WeakReference(parama);
  }
  
  public void J0(boolean paramBoolean)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)b.get();
    if (locala != null) {
      locala.m(11, Boolean.valueOf(paramBoolean), null);
    }
  }
  
  public void Q0(PlaybackStateCompat paramPlaybackStateCompat)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)b.get();
    if (locala != null) {
      locala.m(2, paramPlaybackStateCompat, null);
    }
  }
  
  public void d0(int paramInt)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)b.get();
    if (locala != null) {
      locala.m(12, Integer.valueOf(paramInt), null);
    }
  }
  
  public void f0()
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)b.get();
    if (locala != null) {
      locala.m(13, null, null);
    }
  }
  
  public void m(int paramInt)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)b.get();
    if (locala != null) {
      locala.m(9, Integer.valueOf(paramInt), null);
    }
  }
  
  public void t(String paramString, Bundle paramBundle)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)b.get();
    if (locala != null) {
      locala.m(1, paramString, paramBundle);
    }
  }
  
  public void w(boolean paramBoolean) {}
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */