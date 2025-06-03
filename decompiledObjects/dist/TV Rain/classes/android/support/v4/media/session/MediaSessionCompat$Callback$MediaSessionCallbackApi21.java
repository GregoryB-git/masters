package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession.Callback;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IInterface;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.core.app.BundleCompat;
import androidx.media.MediaSessionManager.RemoteUserInfo;
import androidx.versionedparcelable.ParcelUtils;
import java.lang.ref.Reference;
import java.util.List;

@RequiresApi(21)
class MediaSessionCompat$Callback$MediaSessionCallbackApi21
  extends MediaSession.Callback
{
  public MediaSessionCompat$Callback$MediaSessionCallbackApi21(MediaSessionCompat.Callback paramCallback) {}
  
  private void clearCurrentControllerInfo(MediaSessionCompat.MediaSessionImpl paramMediaSessionImpl)
  {
    paramMediaSessionImpl.setCurrentControllerInfo(null);
  }
  
  private MediaSessionCompat.MediaSessionImplApi21 getSessionImplIfCallbackIsSet()
  {
    synchronized (this$0.mLock)
    {
      MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = (MediaSessionCompat.MediaSessionImplApi21)this$0.mSessionImpl.get();
      if ((localMediaSessionImplApi21 == null) || (this$0 != localMediaSessionImplApi21.getCallback())) {
        localMediaSessionImplApi21 = null;
      }
      return localMediaSessionImplApi21;
    }
  }
  
  private void setCurrentControllerInfo(MediaSessionCompat.MediaSessionImpl paramMediaSessionImpl)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return;
    }
    String str1 = paramMediaSessionImpl.getCallingPackage();
    String str2 = str1;
    if (TextUtils.isEmpty(str1)) {
      str2 = "android.media.session.MediaController";
    }
    paramMediaSessionImpl.setCurrentControllerInfo(new MediaSessionManager.RemoteUserInfo(str2, -1, -1));
  }
  
  public void onCommand(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver)
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    MediaSessionCompat.ensureClassLoader(paramBundle);
    setCurrentControllerInfo(localMediaSessionImplApi21);
    try
    {
      boolean bool = paramString.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER");
      MediaSessionCompat.Token localToken = null;
      Object localObject = null;
      if (bool)
      {
        paramBundle = new android/os/Bundle;
        paramBundle.<init>();
        localToken = localMediaSessionImplApi21.getSessionToken();
        paramString = localToken.getExtraBinder();
        if (paramString == null) {
          paramString = (String)localObject;
        } else {
          paramString = paramString.asBinder();
        }
        BundleCompat.putBinder(paramBundle, "android.support.v4.media.session.EXTRA_BINDER", paramString);
        ParcelUtils.putVersionedParcelable(paramBundle, "android.support.v4.media.session.SESSION_TOKEN2", localToken.getSession2Token());
        paramResultReceiver.send(0, paramBundle);
      }
      else
      {
        bool = paramString.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM");
        if (bool)
        {
          this$0.onAddQueueItem((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
        }
        else
        {
          bool = paramString.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT");
          if (bool) {
            this$0.onAddQueueItem((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
          } else if (paramString.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
            this$0.onRemoveQueueItem((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
          } else if (paramString.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"))
          {
            if (mQueue != null)
            {
              int i = paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
              paramString = localToken;
              if (i >= 0)
              {
                paramString = localToken;
                if (i < mQueue.size()) {
                  paramString = (MediaSessionCompat.QueueItem)mQueue.get(i);
                }
              }
              if (paramString != null) {
                this$0.onRemoveQueueItem(paramString.getDescription());
              }
            }
          }
          else {
            this$0.onCommand(paramString, paramBundle, paramResultReceiver);
          }
        }
      }
    }
    catch (BadParcelableException paramString)
    {
      Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
    }
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  public void onCustomAction(String paramString, Bundle paramBundle)
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    MediaSessionCompat.ensureClassLoader(paramBundle);
    setCurrentControllerInfo(localMediaSessionImplApi21);
    try
    {
      boolean bool = paramString.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
      if (bool)
      {
        paramString = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
        paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
        MediaSessionCompat.ensureClassLoader(paramBundle);
        this$0.onPlayFromUri(paramString, paramBundle);
      }
      else if (paramString.equals("android.support.v4.media.session.action.PREPARE"))
      {
        this$0.onPrepare();
      }
      else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"))
      {
        paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
        paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
        MediaSessionCompat.ensureClassLoader(paramBundle);
        this$0.onPrepareFromMediaId(paramString, paramBundle);
      }
      else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH"))
      {
        paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
        paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
        MediaSessionCompat.ensureClassLoader(paramBundle);
        this$0.onPrepareFromSearch(paramString, paramBundle);
      }
      else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_URI"))
      {
        paramString = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
        paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
        MediaSessionCompat.ensureClassLoader(paramBundle);
        this$0.onPrepareFromUri(paramString, paramBundle);
      }
      else if (paramString.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"))
      {
        bool = paramBundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
        this$0.onSetCaptioningEnabled(bool);
      }
      else
      {
        int i;
        if (paramString.equals("android.support.v4.media.session.action.SET_REPEAT_MODE"))
        {
          i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
          this$0.onSetRepeatMode(i);
        }
        else if (paramString.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE"))
        {
          i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
          this$0.onSetShuffleMode(i);
        }
        else if (paramString.equals("android.support.v4.media.session.action.SET_RATING"))
        {
          paramString = (RatingCompat)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
          paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
          MediaSessionCompat.ensureClassLoader(paramBundle);
          this$0.onSetRating(paramString, paramBundle);
        }
        else if (paramString.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED"))
        {
          float f = paramBundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0F);
          this$0.onSetPlaybackSpeed(f);
        }
        else
        {
          this$0.onCustomAction(paramString, paramBundle);
        }
      }
    }
    catch (BadParcelableException paramString)
    {
      Log.e("MediaSessionCompat", "Could not unparcel the data.");
    }
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  public void onFastForward()
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onFastForward();
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  public boolean onMediaButtonEvent(Intent paramIntent)
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    boolean bool1 = false;
    if (localMediaSessionImplApi21 == null) {
      return false;
    }
    setCurrentControllerInfo(localMediaSessionImplApi21);
    boolean bool2 = this$0.onMediaButtonEvent(paramIntent);
    clearCurrentControllerInfo(localMediaSessionImplApi21);
    if ((bool2) || (super.onMediaButtonEvent(paramIntent))) {
      bool1 = true;
    }
    return bool1;
  }
  
  public void onPause()
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onPause();
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  public void onPlay()
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onPlay();
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  public void onPlayFromMediaId(String paramString, Bundle paramBundle)
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    MediaSessionCompat.ensureClassLoader(paramBundle);
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onPlayFromMediaId(paramString, paramBundle);
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  public void onPlayFromSearch(String paramString, Bundle paramBundle)
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    MediaSessionCompat.ensureClassLoader(paramBundle);
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onPlayFromSearch(paramString, paramBundle);
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  @RequiresApi(23)
  public void onPlayFromUri(Uri paramUri, Bundle paramBundle)
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    MediaSessionCompat.ensureClassLoader(paramBundle);
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onPlayFromUri(paramUri, paramBundle);
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  @RequiresApi(24)
  public void onPrepare()
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onPrepare();
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  @RequiresApi(24)
  public void onPrepareFromMediaId(String paramString, Bundle paramBundle)
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    MediaSessionCompat.ensureClassLoader(paramBundle);
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onPrepareFromMediaId(paramString, paramBundle);
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  @RequiresApi(24)
  public void onPrepareFromSearch(String paramString, Bundle paramBundle)
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    MediaSessionCompat.ensureClassLoader(paramBundle);
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onPrepareFromSearch(paramString, paramBundle);
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  @RequiresApi(24)
  public void onPrepareFromUri(Uri paramUri, Bundle paramBundle)
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    MediaSessionCompat.ensureClassLoader(paramBundle);
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onPrepareFromUri(paramUri, paramBundle);
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  public void onRewind()
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onRewind();
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  public void onSeekTo(long paramLong)
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onSeekTo(paramLong);
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  @RequiresApi(29)
  public void onSetPlaybackSpeed(float paramFloat)
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onSetPlaybackSpeed(paramFloat);
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  public void onSetRating(Rating paramRating)
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onSetRating(RatingCompat.fromRating(paramRating));
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  public void onSetRating(Rating paramRating, Bundle paramBundle) {}
  
  public void onSkipToNext()
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onSkipToNext();
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  public void onSkipToPrevious()
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onSkipToPrevious();
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  public void onSkipToQueueItem(long paramLong)
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onSkipToQueueItem(paramLong);
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
  
  public void onStop()
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
    if (localMediaSessionImplApi21 == null) {
      return;
    }
    setCurrentControllerInfo(localMediaSessionImplApi21);
    this$0.onStop();
    clearCurrentControllerInfo(localMediaSessionImplApi21);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.Callback.MediaSessionCallbackApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */