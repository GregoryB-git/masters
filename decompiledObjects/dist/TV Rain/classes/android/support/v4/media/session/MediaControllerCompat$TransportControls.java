package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;

public abstract class MediaControllerCompat$TransportControls
{
  @Deprecated
  public static final String EXTRA_LEGACY_STREAM_TYPE = "android.media.session.extra.LEGACY_STREAM_TYPE";
  
  public abstract void fastForward();
  
  public abstract void pause();
  
  public abstract void play();
  
  public abstract void playFromMediaId(String paramString, Bundle paramBundle);
  
  public abstract void playFromSearch(String paramString, Bundle paramBundle);
  
  public abstract void playFromUri(Uri paramUri, Bundle paramBundle);
  
  public abstract void prepare();
  
  public abstract void prepareFromMediaId(String paramString, Bundle paramBundle);
  
  public abstract void prepareFromSearch(String paramString, Bundle paramBundle);
  
  public abstract void prepareFromUri(Uri paramUri, Bundle paramBundle);
  
  public abstract void rewind();
  
  public abstract void seekTo(long paramLong);
  
  public abstract void sendCustomAction(PlaybackStateCompat.CustomAction paramCustomAction, Bundle paramBundle);
  
  public abstract void sendCustomAction(String paramString, Bundle paramBundle);
  
  public abstract void setCaptioningEnabled(boolean paramBoolean);
  
  public void setPlaybackSpeed(float paramFloat) {}
  
  public abstract void setRating(RatingCompat paramRatingCompat);
  
  public abstract void setRating(RatingCompat paramRatingCompat, Bundle paramBundle);
  
  public abstract void setRepeatMode(int paramInt);
  
  public abstract void setShuffleMode(int paramInt);
  
  public abstract void skipToNext();
  
  public abstract void skipToPrevious();
  
  public abstract void skipToQueueItem(long paramLong);
  
  public abstract void stop();
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.TransportControls
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */