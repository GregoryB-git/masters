package android.support.v4.media.session;

import android.media.Rating;
import android.media.session.MediaController.TransportControls;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class MediaControllerCompat$TransportControlsApi21
  extends MediaControllerCompat.TransportControls
{
  public final MediaController.TransportControls mControlsFwk;
  
  public MediaControllerCompat$TransportControlsApi21(MediaController.TransportControls paramTransportControls)
  {
    mControlsFwk = paramTransportControls;
  }
  
  public void fastForward()
  {
    mControlsFwk.fastForward();
  }
  
  public void pause()
  {
    mControlsFwk.pause();
  }
  
  public void play()
  {
    mControlsFwk.play();
  }
  
  public void playFromMediaId(String paramString, Bundle paramBundle)
  {
    mControlsFwk.playFromMediaId(paramString, paramBundle);
  }
  
  public void playFromSearch(String paramString, Bundle paramBundle)
  {
    mControlsFwk.playFromSearch(paramString, paramBundle);
  }
  
  public void playFromUri(Uri paramUri, Bundle paramBundle)
  {
    if ((paramUri != null) && (!Uri.EMPTY.equals(paramUri)))
    {
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", paramUri);
      localBundle.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", paramBundle);
      sendCustomAction("android.support.v4.media.session.action.PLAY_FROM_URI", localBundle);
      return;
    }
    throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
  }
  
  public void prepare()
  {
    sendCustomAction("android.support.v4.media.session.action.PREPARE", null);
  }
  
  public void prepareFromMediaId(String paramString, Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", paramString);
    localBundle.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", paramBundle);
    sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", localBundle);
  }
  
  public void prepareFromSearch(String paramString, Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", paramString);
    localBundle.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", paramBundle);
    sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", localBundle);
  }
  
  public void prepareFromUri(Uri paramUri, Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", paramUri);
    localBundle.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", paramBundle);
    sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_URI", localBundle);
  }
  
  public void rewind()
  {
    mControlsFwk.rewind();
  }
  
  public void seekTo(long paramLong)
  {
    mControlsFwk.seekTo(paramLong);
  }
  
  public void sendCustomAction(PlaybackStateCompat.CustomAction paramCustomAction, Bundle paramBundle)
  {
    MediaControllerCompat.validateCustomAction(paramCustomAction.getAction(), paramBundle);
    mControlsFwk.sendCustomAction(paramCustomAction.getAction(), paramBundle);
  }
  
  public void sendCustomAction(String paramString, Bundle paramBundle)
  {
    MediaControllerCompat.validateCustomAction(paramString, paramBundle);
    mControlsFwk.sendCustomAction(paramString, paramBundle);
  }
  
  public void setCaptioningEnabled(boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED", paramBoolean);
    sendCustomAction("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED", localBundle);
  }
  
  public void setPlaybackSpeed(float paramFloat)
  {
    if (paramFloat != 0.0F)
    {
      Bundle localBundle = new Bundle();
      localBundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", paramFloat);
      sendCustomAction("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", localBundle);
      return;
    }
    throw new IllegalArgumentException("speed must not be zero");
  }
  
  public void setRating(RatingCompat paramRatingCompat)
  {
    MediaController.TransportControls localTransportControls = mControlsFwk;
    if (paramRatingCompat != null) {
      paramRatingCompat = (Rating)paramRatingCompat.getRating();
    } else {
      paramRatingCompat = null;
    }
    localTransportControls.setRating(paramRatingCompat);
  }
  
  public void setRating(RatingCompat paramRatingCompat, Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("android.support.v4.media.session.action.ARGUMENT_RATING", paramRatingCompat);
    localBundle.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", paramBundle);
    sendCustomAction("android.support.v4.media.session.action.SET_RATING", localBundle);
  }
  
  public void setRepeatMode(int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", paramInt);
    sendCustomAction("android.support.v4.media.session.action.SET_REPEAT_MODE", localBundle);
  }
  
  public void setShuffleMode(int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", paramInt);
    sendCustomAction("android.support.v4.media.session.action.SET_SHUFFLE_MODE", localBundle);
  }
  
  public void skipToNext()
  {
    mControlsFwk.skipToNext();
  }
  
  public void skipToPrevious()
  {
    mControlsFwk.skipToPrevious();
  }
  
  public void skipToQueueItem(long paramLong)
  {
    mControlsFwk.skipToQueueItem(paramLong);
  }
  
  public void stop()
  {
    mControlsFwk.stop();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */