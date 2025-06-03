package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

class MediaControllerCompat$Callback$MessageHandler
  extends Handler
{
  private static final int MSG_DESTROYED = 8;
  private static final int MSG_EVENT = 1;
  private static final int MSG_SESSION_READY = 13;
  private static final int MSG_UPDATE_CAPTIONING_ENABLED = 11;
  private static final int MSG_UPDATE_EXTRAS = 7;
  private static final int MSG_UPDATE_METADATA = 3;
  private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
  private static final int MSG_UPDATE_QUEUE = 5;
  private static final int MSG_UPDATE_QUEUE_TITLE = 6;
  private static final int MSG_UPDATE_REPEAT_MODE = 9;
  private static final int MSG_UPDATE_SHUFFLE_MODE = 12;
  private static final int MSG_UPDATE_VOLUME = 4;
  public boolean mRegistered = false;
  
  public MediaControllerCompat$Callback$MessageHandler(MediaControllerCompat.Callback paramCallback, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (!mRegistered) {
      return;
    }
    switch (what)
    {
    case 10: 
    default: 
      break;
    case 13: 
      this$0.onSessionReady();
      break;
    case 12: 
      this$0.onShuffleModeChanged(((Integer)obj).intValue());
      break;
    case 11: 
      this$0.onCaptioningEnabledChanged(((Boolean)obj).booleanValue());
      break;
    case 9: 
      this$0.onRepeatModeChanged(((Integer)obj).intValue());
      break;
    case 8: 
      this$0.onSessionDestroyed();
      break;
    case 7: 
      paramMessage = (Bundle)obj;
      MediaSessionCompat.ensureClassLoader(paramMessage);
      this$0.onExtrasChanged(paramMessage);
      break;
    case 6: 
      this$0.onQueueTitleChanged((CharSequence)obj);
      break;
    case 5: 
      this$0.onQueueChanged((List)obj);
      break;
    case 4: 
      this$0.onAudioInfoChanged((MediaControllerCompat.PlaybackInfo)obj);
      break;
    case 3: 
      this$0.onMetadataChanged((MediaMetadataCompat)obj);
      break;
    case 2: 
      this$0.onPlaybackStateChanged((PlaybackStateCompat)obj);
      break;
    case 1: 
      Bundle localBundle = paramMessage.getData();
      MediaSessionCompat.ensureClassLoader(localBundle);
      this$0.onSessionEvent((String)obj, localBundle);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.Callback.MessageHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */