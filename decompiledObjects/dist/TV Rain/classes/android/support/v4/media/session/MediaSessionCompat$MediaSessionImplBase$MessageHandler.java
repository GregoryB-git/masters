package android.support.v4.media.session;

import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.MediaSessionManager.RemoteUserInfo;
import java.util.List;

class MediaSessionCompat$MediaSessionImplBase$MessageHandler
  extends Handler
{
  private static final int KEYCODE_MEDIA_PAUSE = 127;
  private static final int KEYCODE_MEDIA_PLAY = 126;
  private static final int MSG_ADD_QUEUE_ITEM = 25;
  private static final int MSG_ADD_QUEUE_ITEM_AT = 26;
  private static final int MSG_ADJUST_VOLUME = 2;
  private static final int MSG_COMMAND = 1;
  private static final int MSG_CUSTOM_ACTION = 20;
  private static final int MSG_FAST_FORWARD = 16;
  private static final int MSG_MEDIA_BUTTON = 21;
  private static final int MSG_NEXT = 14;
  private static final int MSG_PAUSE = 12;
  private static final int MSG_PLAY = 7;
  private static final int MSG_PLAY_MEDIA_ID = 8;
  private static final int MSG_PLAY_SEARCH = 9;
  private static final int MSG_PLAY_URI = 10;
  private static final int MSG_PREPARE = 3;
  private static final int MSG_PREPARE_MEDIA_ID = 4;
  private static final int MSG_PREPARE_SEARCH = 5;
  private static final int MSG_PREPARE_URI = 6;
  private static final int MSG_PREVIOUS = 15;
  private static final int MSG_RATE = 19;
  private static final int MSG_RATE_EXTRA = 31;
  private static final int MSG_REMOVE_QUEUE_ITEM = 27;
  private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
  private static final int MSG_REWIND = 17;
  private static final int MSG_SEEK_TO = 18;
  private static final int MSG_SET_CAPTIONING_ENABLED = 29;
  private static final int MSG_SET_PLAYBACK_SPEED = 32;
  private static final int MSG_SET_REPEAT_MODE = 23;
  private static final int MSG_SET_SHUFFLE_MODE = 30;
  private static final int MSG_SET_VOLUME = 22;
  private static final int MSG_SKIP_TO_ITEM = 11;
  private static final int MSG_STOP = 13;
  
  public MediaSessionCompat$MediaSessionImplBase$MessageHandler(MediaSessionCompat.MediaSessionImplBase paramMediaSessionImplBase, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  private void onMediaButtonEvent(KeyEvent paramKeyEvent, MediaSessionCompat.Callback paramCallback)
  {
    if ((paramKeyEvent != null) && (paramKeyEvent.getAction() == 0))
    {
      PlaybackStateCompat localPlaybackStateCompat = this$0.mState;
      long l;
      if (localPlaybackStateCompat == null) {
        l = 0L;
      } else {
        l = localPlaybackStateCompat.getActions();
      }
      int i = paramKeyEvent.getKeyCode();
      if (i != 79)
      {
        if (i != 126) {
          if (i == 127) {}
        }
        switch (i)
        {
        default: 
          break;
        case 90: 
          if ((l & 0x40) == 0L) {
            break;
          }
          paramCallback.onFastForward();
          break;
        case 89: 
          if ((l & 0x8) == 0L) {
            break;
          }
          paramCallback.onRewind();
          break;
        case 88: 
          if ((l & 0x10) == 0L) {
            break;
          }
          paramCallback.onSkipToPrevious();
          break;
        case 87: 
          if ((l & 0x20) == 0L) {
            break;
          }
          paramCallback.onSkipToNext();
          break;
        case 86: 
          if ((l & 1L) == 0L) {
            break;
          }
          paramCallback.onStop();
          break;
          if ((l & 0x2) == 0L) {
            break;
          }
          paramCallback.onPause();
          break;
          if ((l & 0x4) == 0L) {
            break;
          }
          paramCallback.onPlay();
          break;
        }
      }
      else
      {
        Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
      }
    }
  }
  
  public void handleMessage(Message paramMessage)
  {
    MediaSessionCompat.Callback localCallback = this$0.mCallback;
    if (localCallback == null) {
      return;
    }
    Object localObject = paramMessage.getData();
    MediaSessionCompat.ensureClassLoader((Bundle)localObject);
    this$0.setCurrentControllerInfo(new MediaSessionManager.RemoteUserInfo(((BaseBundle)localObject).getString("data_calling_pkg"), ((BaseBundle)localObject).getInt("data_calling_pid"), ((BaseBundle)localObject).getInt("data_calling_uid")));
    localObject = ((Bundle)localObject).getBundle("data_extras");
    MediaSessionCompat.ensureClassLoader((Bundle)localObject);
    try
    {
      switch (what)
      {
      case 24: 
      default: 
        break;
      case 32: 
        localCallback.onSetPlaybackSpeed(((Float)obj).floatValue());
        break;
      case 31: 
        localCallback.onSetRating((RatingCompat)obj, (Bundle)localObject);
        break;
      case 30: 
        localCallback.onSetShuffleMode(arg1);
        break;
      case 29: 
        localCallback.onSetCaptioningEnabled(((Boolean)obj).booleanValue());
        break;
      case 28: 
        localObject = this$0.mQueue;
        if (localObject != null)
        {
          int i = arg1;
          if ((i >= 0) && (i < ((List)localObject).size())) {
            paramMessage = (MediaSessionCompat.QueueItem)this$0.mQueue.get(arg1);
          } else {
            paramMessage = null;
          }
          if (paramMessage != null) {
            localCallback.onRemoveQueueItem(paramMessage.getDescription());
          }
        }
        break;
      case 27: 
        localCallback.onRemoveQueueItem((MediaDescriptionCompat)obj);
        break;
      case 26: 
        localCallback.onAddQueueItem((MediaDescriptionCompat)obj, arg1);
        break;
      case 25: 
        localCallback.onAddQueueItem((MediaDescriptionCompat)obj);
        break;
      case 23: 
        localCallback.onSetRepeatMode(arg1);
        break;
      case 22: 
        this$0.setVolumeTo(arg1, 0);
        break;
      case 21: 
        localObject = (KeyEvent)obj;
        paramMessage = new android/content/Intent;
        paramMessage.<init>("android.intent.action.MEDIA_BUTTON");
        paramMessage.putExtra("android.intent.extra.KEY_EVENT", (Parcelable)localObject);
        if (!localCallback.onMediaButtonEvent(paramMessage)) {
          onMediaButtonEvent((KeyEvent)localObject, localCallback);
        }
        break;
      case 20: 
        localCallback.onCustomAction((String)obj, (Bundle)localObject);
        break;
      case 19: 
        localCallback.onSetRating((RatingCompat)obj);
        break;
      case 18: 
        localCallback.onSeekTo(((Long)obj).longValue());
        break;
      case 17: 
        localCallback.onRewind();
        break;
      case 16: 
        localCallback.onFastForward();
        break;
      case 15: 
        localCallback.onSkipToPrevious();
        break;
      case 14: 
        localCallback.onSkipToNext();
        break;
      case 13: 
        localCallback.onStop();
        break;
      case 12: 
        localCallback.onPause();
        break;
      case 11: 
        localCallback.onSkipToQueueItem(((Long)obj).longValue());
        break;
      case 10: 
        localCallback.onPlayFromUri((Uri)obj, (Bundle)localObject);
        break;
      case 9: 
        localCallback.onPlayFromSearch((String)obj, (Bundle)localObject);
        break;
      case 8: 
        localCallback.onPlayFromMediaId((String)obj, (Bundle)localObject);
        break;
      case 7: 
        localCallback.onPlay();
        break;
      case 6: 
        localCallback.onPrepareFromUri((Uri)obj, (Bundle)localObject);
        break;
      case 5: 
        localCallback.onPrepareFromSearch((String)obj, (Bundle)localObject);
        break;
      case 4: 
        localCallback.onPrepareFromMediaId((String)obj, (Bundle)localObject);
        break;
      case 3: 
        localCallback.onPrepare();
        break;
      case 2: 
        this$0.adjustVolume(arg1, 0);
        break;
      case 1: 
        paramMessage = (MediaSessionCompat.MediaSessionImplBase.Command)obj;
        localCallback.onCommand(command, extras, stub);
      }
      return;
    }
    finally
    {
      this$0.setCurrentControllerInfo(null);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.MessageHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */