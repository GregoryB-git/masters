package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession.Callback;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.core.app.BundleCompat;
import androidx.media.MediaSessionManager.RemoteUserInfo;
import androidx.versionedparcelable.ParcelUtils;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class MediaSessionCompat$Callback
{
  public final MediaSession.Callback mCallbackFwk = new MediaSessionCallbackApi21();
  @GuardedBy("mLock")
  public CallbackHandler mCallbackHandler;
  public final Object mLock = new Object();
  private boolean mMediaPlayPausePendingOnHandler;
  @GuardedBy("mLock")
  public WeakReference<MediaSessionCompat.MediaSessionImpl> mSessionImpl = new WeakReference(null);
  
  public void handleMediaPlayPauseIfPendingOnHandler(MediaSessionCompat.MediaSessionImpl paramMediaSessionImpl, Handler paramHandler)
  {
    if (!mMediaPlayPausePendingOnHandler) {
      return;
    }
    int i = 0;
    mMediaPlayPausePendingOnHandler = false;
    paramHandler.removeMessages(1);
    paramMediaSessionImpl = paramMediaSessionImpl.getPlaybackState();
    long l;
    if (paramMediaSessionImpl == null) {
      l = 0L;
    } else {
      l = paramMediaSessionImpl.getActions();
    }
    int j;
    if ((paramMediaSessionImpl != null) && (paramMediaSessionImpl.getState() == 3)) {
      j = 1;
    } else {
      j = 0;
    }
    int k;
    if ((0x204 & l) != 0L) {
      k = 1;
    } else {
      k = 0;
    }
    if ((l & 0x202) != 0L) {
      i = 1;
    }
    if ((j != 0) && (i != 0)) {
      onPause();
    } else if ((j == 0) && (k != 0)) {
      onPlay();
    }
  }
  
  public void onAddQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat) {}
  
  public void onAddQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt) {}
  
  public void onCommand(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver) {}
  
  public void onCustomAction(String paramString, Bundle paramBundle) {}
  
  public void onFastForward() {}
  
  public boolean onMediaButtonEvent(Intent paramIntent)
  {
    if (Build.VERSION.SDK_INT >= 27) {
      return false;
    }
    synchronized (mLock)
    {
      MediaSessionCompat.MediaSessionImpl localMediaSessionImpl = (MediaSessionCompat.MediaSessionImpl)mSessionImpl.get();
      CallbackHandler localCallbackHandler = mCallbackHandler;
      if ((localMediaSessionImpl != null) && (localCallbackHandler != null))
      {
        paramIntent = (KeyEvent)paramIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if ((paramIntent != null) && (paramIntent.getAction() == 0))
        {
          ??? = localMediaSessionImpl.getCurrentControllerInfo();
          int i = paramIntent.getKeyCode();
          if ((i != 79) && (i != 85))
          {
            handleMediaPlayPauseIfPendingOnHandler(localMediaSessionImpl, localCallbackHandler);
            return false;
          }
          if (paramIntent.getRepeatCount() == 0)
          {
            if (mMediaPlayPausePendingOnHandler)
            {
              localCallbackHandler.removeMessages(1);
              mMediaPlayPausePendingOnHandler = false;
              paramIntent = localMediaSessionImpl.getPlaybackState();
              long l;
              if (paramIntent == null) {
                l = 0L;
              } else {
                l = paramIntent.getActions();
              }
              if ((l & 0x20) != 0L) {
                onSkipToNext();
              }
            }
            else
            {
              mMediaPlayPausePendingOnHandler = true;
              localCallbackHandler.sendMessageDelayed(localCallbackHandler.obtainMessage(1, ???), ViewConfiguration.getDoubleTapTimeout());
            }
          }
          else {
            handleMediaPlayPauseIfPendingOnHandler(localMediaSessionImpl, localCallbackHandler);
          }
          return true;
        }
      }
      return false;
    }
  }
  
  public void onPause() {}
  
  public void onPlay() {}
  
  public void onPlayFromMediaId(String paramString, Bundle paramBundle) {}
  
  public void onPlayFromSearch(String paramString, Bundle paramBundle) {}
  
  public void onPlayFromUri(Uri paramUri, Bundle paramBundle) {}
  
  public void onPrepare() {}
  
  public void onPrepareFromMediaId(String paramString, Bundle paramBundle) {}
  
  public void onPrepareFromSearch(String paramString, Bundle paramBundle) {}
  
  public void onPrepareFromUri(Uri paramUri, Bundle paramBundle) {}
  
  public void onRemoveQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat) {}
  
  @Deprecated
  public void onRemoveQueueItemAt(int paramInt) {}
  
  public void onRewind() {}
  
  public void onSeekTo(long paramLong) {}
  
  public void onSetCaptioningEnabled(boolean paramBoolean) {}
  
  public void onSetPlaybackSpeed(float paramFloat) {}
  
  public void onSetRating(RatingCompat paramRatingCompat) {}
  
  public void onSetRating(RatingCompat paramRatingCompat, Bundle paramBundle) {}
  
  public void onSetRepeatMode(int paramInt) {}
  
  public void onSetShuffleMode(int paramInt) {}
  
  public void onSkipToNext() {}
  
  public void onSkipToPrevious() {}
  
  public void onSkipToQueueItem(long paramLong) {}
  
  public void onStop() {}
  
  public void setSessionImpl(MediaSessionCompat.MediaSessionImpl paramMediaSessionImpl, Handler paramHandler)
  {
    synchronized (mLock)
    {
      Object localObject2 = new java/lang/ref/WeakReference;
      ((WeakReference)localObject2).<init>(paramMediaSessionImpl);
      mSessionImpl = ((WeakReference)localObject2);
      localObject2 = mCallbackHandler;
      Object localObject3 = null;
      if (localObject2 != null) {
        ((Handler)localObject2).removeCallbacksAndMessages(null);
      }
      localObject2 = localObject3;
      if (paramMediaSessionImpl != null) {
        if (paramHandler == null) {
          localObject2 = localObject3;
        } else {
          localObject2 = new CallbackHandler(paramHandler.getLooper());
        }
      }
      mCallbackHandler = ((CallbackHandler)localObject2);
      return;
    }
  }
  
  public class CallbackHandler
    extends Handler
  {
    private static final int MSG_MEDIA_PLAY_PAUSE_KEY_DOUBLE_TAP_TIMEOUT = 1;
    
    public CallbackHandler(Looper paramLooper)
    {
      super();
    }
    
    public void handleMessage(Message paramMessage)
    {
      if (what == 1) {
        synchronized (mLock)
        {
          MediaSessionCompat.MediaSessionImpl localMediaSessionImpl = (MediaSessionCompat.MediaSessionImpl)mSessionImpl.get();
          MediaSessionCompat.Callback localCallback = MediaSessionCompat.Callback.this;
          CallbackHandler localCallbackHandler = mCallbackHandler;
          if ((localMediaSessionImpl != null) && (localCallback == localMediaSessionImpl.getCallback()) && (localCallbackHandler != null))
          {
            localMediaSessionImpl.setCurrentControllerInfo((MediaSessionManager.RemoteUserInfo)obj);
            handleMediaPlayPauseIfPendingOnHandler(localMediaSessionImpl, localCallbackHandler);
            localMediaSessionImpl.setCurrentControllerInfo(null);
          }
          else {}
        }
      }
    }
  }
  
  @RequiresApi(21)
  public class MediaSessionCallbackApi21
    extends MediaSession.Callback
  {
    public MediaSessionCallbackApi21() {}
    
    private void clearCurrentControllerInfo(MediaSessionCompat.MediaSessionImpl paramMediaSessionImpl)
    {
      paramMediaSessionImpl.setCurrentControllerInfo(null);
    }
    
    private MediaSessionCompat.MediaSessionImplApi21 getSessionImplIfCallbackIsSet()
    {
      synchronized (mLock)
      {
        MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = (MediaSessionCompat.MediaSessionImplApi21)mSessionImpl.get();
        if ((localMediaSessionImplApi21 == null) || (MediaSessionCompat.Callback.this != localMediaSessionImplApi21.getCallback())) {
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
            onAddQueueItem((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
          }
          else
          {
            bool = paramString.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT");
            if (bool) {
              onAddQueueItem((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
            } else if (paramString.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
              onRemoveQueueItem((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
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
                  onRemoveQueueItem(paramString.getDescription());
                }
              }
            }
            else {
              MediaSessionCompat.Callback.this.onCommand(paramString, paramBundle, paramResultReceiver);
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
          MediaSessionCompat.Callback.this.onPlayFromUri(paramString, paramBundle);
        }
        else if (paramString.equals("android.support.v4.media.session.action.PREPARE"))
        {
          MediaSessionCompat.Callback.this.onPrepare();
        }
        else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"))
        {
          paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
          paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
          MediaSessionCompat.ensureClassLoader(paramBundle);
          MediaSessionCompat.Callback.this.onPrepareFromMediaId(paramString, paramBundle);
        }
        else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH"))
        {
          paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
          paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
          MediaSessionCompat.ensureClassLoader(paramBundle);
          MediaSessionCompat.Callback.this.onPrepareFromSearch(paramString, paramBundle);
        }
        else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_URI"))
        {
          paramString = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
          paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
          MediaSessionCompat.ensureClassLoader(paramBundle);
          MediaSessionCompat.Callback.this.onPrepareFromUri(paramString, paramBundle);
        }
        else if (paramString.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"))
        {
          bool = paramBundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
          onSetCaptioningEnabled(bool);
        }
        else
        {
          int i;
          if (paramString.equals("android.support.v4.media.session.action.SET_REPEAT_MODE"))
          {
            i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
            onSetRepeatMode(i);
          }
          else if (paramString.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE"))
          {
            i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
            onSetShuffleMode(i);
          }
          else if (paramString.equals("android.support.v4.media.session.action.SET_RATING"))
          {
            paramString = (RatingCompat)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
            paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
            MediaSessionCompat.ensureClassLoader(paramBundle);
            onSetRating(paramString, paramBundle);
          }
          else if (paramString.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED"))
          {
            float f = paramBundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0F);
            MediaSessionCompat.Callback.this.onSetPlaybackSpeed(f);
          }
          else
          {
            MediaSessionCompat.Callback.this.onCustomAction(paramString, paramBundle);
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
      MediaSessionCompat.Callback.this.onFastForward();
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
      boolean bool2 = MediaSessionCompat.Callback.this.onMediaButtonEvent(paramIntent);
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
      MediaSessionCompat.Callback.this.onPause();
      clearCurrentControllerInfo(localMediaSessionImplApi21);
    }
    
    public void onPlay()
    {
      MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
      if (localMediaSessionImplApi21 == null) {
        return;
      }
      setCurrentControllerInfo(localMediaSessionImplApi21);
      MediaSessionCompat.Callback.this.onPlay();
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
      MediaSessionCompat.Callback.this.onPlayFromMediaId(paramString, paramBundle);
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
      MediaSessionCompat.Callback.this.onPlayFromSearch(paramString, paramBundle);
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
      MediaSessionCompat.Callback.this.onPlayFromUri(paramUri, paramBundle);
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
      MediaSessionCompat.Callback.this.onPrepare();
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
      MediaSessionCompat.Callback.this.onPrepareFromMediaId(paramString, paramBundle);
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
      MediaSessionCompat.Callback.this.onPrepareFromSearch(paramString, paramBundle);
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
      MediaSessionCompat.Callback.this.onPrepareFromUri(paramUri, paramBundle);
      clearCurrentControllerInfo(localMediaSessionImplApi21);
    }
    
    public void onRewind()
    {
      MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
      if (localMediaSessionImplApi21 == null) {
        return;
      }
      setCurrentControllerInfo(localMediaSessionImplApi21);
      MediaSessionCompat.Callback.this.onRewind();
      clearCurrentControllerInfo(localMediaSessionImplApi21);
    }
    
    public void onSeekTo(long paramLong)
    {
      MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
      if (localMediaSessionImplApi21 == null) {
        return;
      }
      setCurrentControllerInfo(localMediaSessionImplApi21);
      MediaSessionCompat.Callback.this.onSeekTo(paramLong);
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
      MediaSessionCompat.Callback.this.onSetPlaybackSpeed(paramFloat);
      clearCurrentControllerInfo(localMediaSessionImplApi21);
    }
    
    public void onSetRating(Rating paramRating)
    {
      MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
      if (localMediaSessionImplApi21 == null) {
        return;
      }
      setCurrentControllerInfo(localMediaSessionImplApi21);
      onSetRating(RatingCompat.fromRating(paramRating));
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
      MediaSessionCompat.Callback.this.onSkipToNext();
      clearCurrentControllerInfo(localMediaSessionImplApi21);
    }
    
    public void onSkipToPrevious()
    {
      MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
      if (localMediaSessionImplApi21 == null) {
        return;
      }
      setCurrentControllerInfo(localMediaSessionImplApi21);
      MediaSessionCompat.Callback.this.onSkipToPrevious();
      clearCurrentControllerInfo(localMediaSessionImplApi21);
    }
    
    public void onSkipToQueueItem(long paramLong)
    {
      MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
      if (localMediaSessionImplApi21 == null) {
        return;
      }
      setCurrentControllerInfo(localMediaSessionImplApi21);
      MediaSessionCompat.Callback.this.onSkipToQueueItem(paramLong);
      clearCurrentControllerInfo(localMediaSessionImplApi21);
    }
    
    public void onStop()
    {
      MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = getSessionImplIfCallbackIsSet();
      if (localMediaSessionImplApi21 == null) {
        return;
      }
      setCurrentControllerInfo(localMediaSessionImplApi21);
      MediaSessionCompat.Callback.this.onStop();
      clearCurrentControllerInfo(localMediaSessionImplApi21);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */