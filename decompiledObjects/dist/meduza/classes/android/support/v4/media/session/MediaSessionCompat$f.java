package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;

public final class MediaSessionCompat$f
  extends MediaSessionCompat.e
{
  public MediaSessionCompat$f(Context paramContext, String paramString)
  {
    super(paramContext, paramString);
  }
  
  public final MediaSession e(Context paramContext, String paramString)
  {
    return new MediaSession(paramContext, paramString, null);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */