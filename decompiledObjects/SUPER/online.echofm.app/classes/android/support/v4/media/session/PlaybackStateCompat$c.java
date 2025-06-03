package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.media.session.PlaybackState.Builder;
import android.os.Bundle;

public abstract class PlaybackStateCompat$c
{
  public static Bundle a(PlaybackState paramPlaybackState)
  {
    return paramPlaybackState.getExtras();
  }
  
  public static void b(PlaybackState.Builder paramBuilder, Bundle paramBundle)
  {
    paramBuilder.setExtras(paramBundle);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */