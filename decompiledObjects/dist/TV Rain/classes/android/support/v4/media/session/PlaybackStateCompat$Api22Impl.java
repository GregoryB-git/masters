package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.media.session.PlaybackState.Builder;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(22)
class PlaybackStateCompat$Api22Impl
{
  @DoNotInline
  public static Bundle getExtras(PlaybackState paramPlaybackState)
  {
    return paramPlaybackState.getExtras();
  }
  
  @DoNotInline
  public static void setExtras(PlaybackState.Builder paramBuilder, Bundle paramBundle)
  {
    paramBuilder.setExtras(paramBundle);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat.Api22Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */