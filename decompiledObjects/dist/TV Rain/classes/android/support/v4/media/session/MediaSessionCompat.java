package android.support.v4.media.session;

import a3;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes.Builder;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.MediaMetadataEditor;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.RemoteControlClient.MetadataEditor;
import android.media.RemoteControlClient.OnMetadataUpdateListener;
import android.media.RemoteControlClient.OnPlaybackPositionUpdateListener;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.MediaSession.Callback;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.MediaMetadataCompat.Builder;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.BundleCompat;
import androidx.media.MediaSessionManager.RemoteUserInfo;
import androidx.media.VolumeProviderCompat;
import androidx.media.VolumeProviderCompat.Callback;
import androidx.media.session.MediaButtonReceiver;
import androidx.versionedparcelable.ParcelUtils;
import androidx.versionedparcelable.VersionedParcelable;
import e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import z2;

public class MediaSessionCompat
{
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_ARGUMENT_PLAYBACK_SPEED = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
  public static final String ACTION_FLAG_AS_INAPPROPRIATE = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
  public static final String ACTION_FOLLOW = "android.support.v4.media.session.action.FOLLOW";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_PREPARE = "android.support.v4.media.session.action.PREPARE";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_PREPARE_FROM_MEDIA_ID = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_PREPARE_FROM_SEARCH = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_PREPARE_FROM_URI = "android.support.v4.media.session.action.PREPARE_FROM_URI";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_SET_CAPTIONING_ENABLED = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_SET_PLAYBACK_SPEED = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_SET_RATING = "android.support.v4.media.session.action.SET_RATING";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_SET_REPEAT_MODE = "android.support.v4.media.session.action.SET_REPEAT_MODE";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String ACTION_SET_SHUFFLE_MODE = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
  public static final String ACTION_SKIP_AD = "android.support.v4.media.session.action.SKIP_AD";
  public static final String ACTION_UNFOLLOW = "android.support.v4.media.session.action.UNFOLLOW";
  public static final String ARGUMENT_MEDIA_ATTRIBUTE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
  public static final String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
  private static final String DATA_CALLING_PACKAGE = "data_calling_pkg";
  private static final String DATA_CALLING_PID = "data_calling_pid";
  private static final String DATA_CALLING_UID = "data_calling_uid";
  private static final String DATA_EXTRAS = "data_extras";
  @Deprecated
  public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
  public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;
  @Deprecated
  public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String KEY_EXTRA_BINDER = "android.support.v4.media.session.EXTRA_BINDER";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String KEY_SESSION2_TOKEN = "android.support.v4.media.session.SESSION_TOKEN2";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String KEY_TOKEN = "android.support.v4.media.session.TOKEN";
  private static final int MAX_BITMAP_SIZE_IN_DP = 320;
  public static final int MEDIA_ATTRIBUTE_ALBUM = 1;
  public static final int MEDIA_ATTRIBUTE_ARTIST = 0;
  public static final int MEDIA_ATTRIBUTE_PLAYLIST = 2;
  public static final String TAG = "MediaSessionCompat";
  public static int sMaxBitmapSize;
  private final ArrayList<OnActiveChangeListener> mActiveListeners = new ArrayList();
  private final MediaControllerCompat mController;
  private final MediaSessionImpl mImpl;
  
  private MediaSessionCompat(Context paramContext, MediaSessionImpl paramMediaSessionImpl)
  {
    mImpl = paramMediaSessionImpl;
    mController = new MediaControllerCompat(paramContext, this);
  }
  
  public MediaSessionCompat(@NonNull Context paramContext, @NonNull String paramString)
  {
    this(paramContext, paramString, null, null);
  }
  
  public MediaSessionCompat(@NonNull Context paramContext, @NonNull String paramString, @Nullable ComponentName paramComponentName, @Nullable PendingIntent paramPendingIntent)
  {
    this(paramContext, paramString, paramComponentName, paramPendingIntent, null);
  }
  
  public MediaSessionCompat(@NonNull Context paramContext, @NonNull String paramString, @Nullable ComponentName paramComponentName, @Nullable PendingIntent paramPendingIntent, @Nullable Bundle paramBundle)
  {
    this(paramContext, paramString, paramComponentName, paramPendingIntent, paramBundle, null);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public MediaSessionCompat(@NonNull Context paramContext, @NonNull String paramString, @Nullable ComponentName paramComponentName, @Nullable PendingIntent paramPendingIntent, @Nullable Bundle paramBundle, @Nullable VersionedParcelable paramVersionedParcelable)
  {
    if (paramContext != null)
    {
      if (!TextUtils.isEmpty(paramString))
      {
        ComponentName localComponentName = paramComponentName;
        if (paramComponentName == null)
        {
          paramComponentName = MediaButtonReceiver.getMediaButtonReceiverComponent(paramContext);
          localComponentName = paramComponentName;
          if (paramComponentName == null)
          {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            localComponentName = paramComponentName;
          }
        }
        paramComponentName = paramPendingIntent;
        if (localComponentName != null)
        {
          paramComponentName = paramPendingIntent;
          if (paramPendingIntent == null)
          {
            paramComponentName = new Intent("android.intent.action.MEDIA_BUTTON");
            paramComponentName.setComponent(localComponentName);
            if (Build.VERSION.SDK_INT >= 31) {
              i = 33554432;
            } else {
              i = 0;
            }
            paramComponentName = PendingIntent.getBroadcast(paramContext, 0, paramComponentName, i);
          }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
          mImpl = new MediaSessionImplApi29(paramContext, paramString, paramVersionedParcelable, paramBundle);
        } else if (i >= 28) {
          mImpl = new MediaSessionImplApi28(paramContext, paramString, paramVersionedParcelable, paramBundle);
        } else {
          mImpl = new MediaSessionImplApi22(paramContext, paramString, paramVersionedParcelable, paramBundle);
        }
        if (Looper.myLooper() != null) {
          paramString = Looper.myLooper();
        } else {
          paramString = Looper.getMainLooper();
        }
        paramString = new Handler(paramString);
        setCallback(new Callback() {}, paramString);
        mImpl.setMediaButtonReceiver(paramComponentName);
        mController = new MediaControllerCompat(paramContext, this);
        if (sMaxBitmapSize == 0) {
          sMaxBitmapSize = (int)(TypedValue.applyDimension(1, 320.0F, paramContext.getResources().getDisplayMetrics()) + 0.5F);
        }
        return;
      }
      throw new IllegalArgumentException("tag must not be null or empty");
    }
    throw new IllegalArgumentException("context must not be null");
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static void ensureClassLoader(@Nullable Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
    }
  }
  
  public static MediaSessionCompat fromMediaSession(Context paramContext, Object paramObject)
  {
    int i = Build.VERSION.SDK_INT;
    if ((paramContext != null) && (paramObject != null))
    {
      if (i >= 29) {
        paramObject = new MediaSessionImplApi29(paramObject);
      } else if (i >= 28) {
        paramObject = new MediaSessionImplApi28(paramObject);
      } else {
        paramObject = new MediaSessionImplApi21(paramObject);
      }
      return new MediaSessionCompat(paramContext, (MediaSessionImpl)paramObject);
    }
    return null;
  }
  
  public static PlaybackStateCompat getStateWithUpdatedPosition(PlaybackStateCompat paramPlaybackStateCompat, MediaMetadataCompat paramMediaMetadataCompat)
  {
    PlaybackStateCompat localPlaybackStateCompat = paramPlaybackStateCompat;
    if (paramPlaybackStateCompat != null)
    {
      long l1 = paramPlaybackStateCompat.getPosition();
      long l2 = -1L;
      if (l1 == -1L)
      {
        localPlaybackStateCompat = paramPlaybackStateCompat;
      }
      else if ((paramPlaybackStateCompat.getState() != 3) && (paramPlaybackStateCompat.getState() != 4))
      {
        localPlaybackStateCompat = paramPlaybackStateCompat;
        if (paramPlaybackStateCompat.getState() != 5) {}
      }
      else
      {
        l1 = paramPlaybackStateCompat.getLastPositionUpdateTime();
        localPlaybackStateCompat = paramPlaybackStateCompat;
        if (l1 > 0L)
        {
          long l3 = SystemClock.elapsedRealtime();
          l1 = (paramPlaybackStateCompat.getPlaybackSpeed() * (float)(l3 - l1));
          long l4 = paramPlaybackStateCompat.getPosition() + l1;
          l1 = l2;
          if (paramMediaMetadataCompat != null)
          {
            l1 = l2;
            if (paramMediaMetadataCompat.containsKey("android.media.metadata.DURATION")) {
              l1 = paramMediaMetadataCompat.getLong("android.media.metadata.DURATION");
            }
          }
          if ((l1 < 0L) || (l4 <= l1)) {
            if (l4 < 0L) {
              l1 = 0L;
            } else {
              l1 = l4;
            }
          }
          localPlaybackStateCompat = new PlaybackStateCompat.Builder(paramPlaybackStateCompat).setState(paramPlaybackStateCompat.getState(), l1, paramPlaybackStateCompat.getPlaybackSpeed(), l3).build();
        }
      }
    }
    return localPlaybackStateCompat;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static Bundle unparcelWithClassLoader(@Nullable Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    ensureClassLoader(paramBundle);
    try
    {
      paramBundle.isEmpty();
      return paramBundle;
    }
    catch (BadParcelableException paramBundle)
    {
      Log.e("MediaSessionCompat", "Could not unparcel the data.");
    }
    return null;
  }
  
  public void addOnActiveChangeListener(OnActiveChangeListener paramOnActiveChangeListener)
  {
    if (paramOnActiveChangeListener != null)
    {
      mActiveListeners.add(paramOnActiveChangeListener);
      return;
    }
    throw new IllegalArgumentException("Listener may not be null");
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public String getCallingPackage()
  {
    return mImpl.getCallingPackage();
  }
  
  public MediaControllerCompat getController()
  {
    return mController;
  }
  
  @NonNull
  public final MediaSessionManager.RemoteUserInfo getCurrentControllerInfo()
  {
    return mImpl.getCurrentControllerInfo();
  }
  
  public Object getMediaSession()
  {
    return mImpl.getMediaSession();
  }
  
  public Object getRemoteControlClient()
  {
    return mImpl.getRemoteControlClient();
  }
  
  public Token getSessionToken()
  {
    return mImpl.getSessionToken();
  }
  
  public boolean isActive()
  {
    return mImpl.isActive();
  }
  
  public void release()
  {
    mImpl.release();
  }
  
  public void removeOnActiveChangeListener(OnActiveChangeListener paramOnActiveChangeListener)
  {
    if (paramOnActiveChangeListener != null)
    {
      mActiveListeners.remove(paramOnActiveChangeListener);
      return;
    }
    throw new IllegalArgumentException("Listener may not be null");
  }
  
  public void sendSessionEvent(String paramString, Bundle paramBundle)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      mImpl.sendSessionEvent(paramString, paramBundle);
      return;
    }
    throw new IllegalArgumentException("event cannot be null or empty");
  }
  
  public void setActive(boolean paramBoolean)
  {
    mImpl.setActive(paramBoolean);
    Iterator localIterator = mActiveListeners.iterator();
    while (localIterator.hasNext()) {
      ((OnActiveChangeListener)localIterator.next()).onActiveChanged();
    }
  }
  
  public void setCallback(Callback paramCallback)
  {
    setCallback(paramCallback, null);
  }
  
  public void setCallback(Callback paramCallback, Handler paramHandler)
  {
    if (paramCallback == null)
    {
      mImpl.setCallback(null, null);
    }
    else
    {
      MediaSessionImpl localMediaSessionImpl = mImpl;
      if (paramHandler == null) {
        paramHandler = new Handler();
      }
      localMediaSessionImpl.setCallback(paramCallback, paramHandler);
    }
  }
  
  public void setCaptioningEnabled(boolean paramBoolean)
  {
    mImpl.setCaptioningEnabled(paramBoolean);
  }
  
  public void setExtras(Bundle paramBundle)
  {
    mImpl.setExtras(paramBundle);
  }
  
  public void setFlags(int paramInt)
  {
    mImpl.setFlags(paramInt);
  }
  
  public void setMediaButtonReceiver(PendingIntent paramPendingIntent)
  {
    mImpl.setMediaButtonReceiver(paramPendingIntent);
  }
  
  public void setMetadata(MediaMetadataCompat paramMediaMetadataCompat)
  {
    mImpl.setMetadata(paramMediaMetadataCompat);
  }
  
  public void setPlaybackState(PlaybackStateCompat paramPlaybackStateCompat)
  {
    mImpl.setPlaybackState(paramPlaybackStateCompat);
  }
  
  public void setPlaybackToLocal(int paramInt)
  {
    mImpl.setPlaybackToLocal(paramInt);
  }
  
  public void setPlaybackToRemote(VolumeProviderCompat paramVolumeProviderCompat)
  {
    if (paramVolumeProviderCompat != null)
    {
      mImpl.setPlaybackToRemote(paramVolumeProviderCompat);
      return;
    }
    throw new IllegalArgumentException("volumeProvider may not be null!");
  }
  
  public void setQueue(List<QueueItem> paramList)
  {
    if (paramList != null)
    {
      HashSet localHashSet = new HashSet();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        QueueItem localQueueItem = (QueueItem)localIterator.next();
        if (localQueueItem != null)
        {
          if (localHashSet.contains(Long.valueOf(localQueueItem.getQueueId())))
          {
            StringBuilder localStringBuilder = z2.t("Found duplicate queue id: ");
            localStringBuilder.append(localQueueItem.getQueueId());
            Log.e("MediaSessionCompat", localStringBuilder.toString(), new IllegalArgumentException("id of each queue item should be unique"));
          }
          localHashSet.add(Long.valueOf(localQueueItem.getQueueId()));
        }
        else
        {
          throw new IllegalArgumentException("queue shouldn't have null items");
        }
      }
    }
    mImpl.setQueue(paramList);
  }
  
  public void setQueueTitle(CharSequence paramCharSequence)
  {
    mImpl.setQueueTitle(paramCharSequence);
  }
  
  public void setRatingType(int paramInt)
  {
    mImpl.setRatingType(paramInt);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setRegistrationCallback(@Nullable RegistrationCallback paramRegistrationCallback, @NonNull Handler paramHandler)
  {
    mImpl.setRegistrationCallback(paramRegistrationCallback, paramHandler);
  }
  
  public void setRepeatMode(int paramInt)
  {
    mImpl.setRepeatMode(paramInt);
  }
  
  public void setSessionActivity(PendingIntent paramPendingIntent)
  {
    mImpl.setSessionActivity(paramPendingIntent);
  }
  
  public void setShuffleMode(int paramInt)
  {
    mImpl.setShuffleMode(paramInt);
  }
  
  public static abstract class Callback
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
  
  public static abstract interface MediaSessionImpl
  {
    public abstract MediaSessionCompat.Callback getCallback();
    
    public abstract String getCallingPackage();
    
    public abstract MediaSessionManager.RemoteUserInfo getCurrentControllerInfo();
    
    public abstract Object getMediaSession();
    
    public abstract PlaybackStateCompat getPlaybackState();
    
    public abstract Object getRemoteControlClient();
    
    public abstract MediaSessionCompat.Token getSessionToken();
    
    public abstract boolean isActive();
    
    public abstract void release();
    
    public abstract void sendSessionEvent(String paramString, Bundle paramBundle);
    
    public abstract void setActive(boolean paramBoolean);
    
    public abstract void setCallback(MediaSessionCompat.Callback paramCallback, Handler paramHandler);
    
    public abstract void setCaptioningEnabled(boolean paramBoolean);
    
    public abstract void setCurrentControllerInfo(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo);
    
    public abstract void setExtras(Bundle paramBundle);
    
    public abstract void setFlags(int paramInt);
    
    public abstract void setMediaButtonReceiver(PendingIntent paramPendingIntent);
    
    public abstract void setMetadata(MediaMetadataCompat paramMediaMetadataCompat);
    
    public abstract void setPlaybackState(PlaybackStateCompat paramPlaybackStateCompat);
    
    public abstract void setPlaybackToLocal(int paramInt);
    
    public abstract void setPlaybackToRemote(VolumeProviderCompat paramVolumeProviderCompat);
    
    public abstract void setQueue(List<MediaSessionCompat.QueueItem> paramList);
    
    public abstract void setQueueTitle(CharSequence paramCharSequence);
    
    public abstract void setRatingType(int paramInt);
    
    public abstract void setRegistrationCallback(@Nullable MediaSessionCompat.RegistrationCallback paramRegistrationCallback, @NonNull Handler paramHandler);
    
    public abstract void setRepeatMode(int paramInt);
    
    public abstract void setSessionActivity(PendingIntent paramPendingIntent);
    
    public abstract void setShuffleMode(int paramInt);
  }
  
  @RequiresApi(18)
  public static class MediaSessionImplApi18
    extends MediaSessionCompat.MediaSessionImplBase
  {
    private static boolean sIsMbrPendingIntentSupported = true;
    
    public MediaSessionImplApi18(Context paramContext, String paramString, ComponentName paramComponentName, PendingIntent paramPendingIntent, VersionedParcelable paramVersionedParcelable, Bundle paramBundle)
    {
      super(paramString, paramComponentName, paramPendingIntent, paramVersionedParcelable, paramBundle);
    }
    
    public int getRccTransportControlFlagsFromActions(long paramLong)
    {
      int i = super.getRccTransportControlFlagsFromActions(paramLong);
      int j = i;
      if ((paramLong & 0x100) != 0L) {
        j = i | 0x100;
      }
      return j;
    }
    
    public void registerMediaButtonEventReceiver(PendingIntent paramPendingIntent, ComponentName paramComponentName)
    {
      if (sIsMbrPendingIntentSupported) {
        try
        {
          mAudioManager.registerMediaButtonEventReceiver(paramPendingIntent);
        }
        catch (NullPointerException localNullPointerException)
        {
          Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
          sIsMbrPendingIntentSupported = false;
        }
      }
      if (!sIsMbrPendingIntentSupported) {
        super.registerMediaButtonEventReceiver(paramPendingIntent, paramComponentName);
      }
    }
    
    public void setCallback(MediaSessionCompat.Callback paramCallback, Handler paramHandler)
    {
      super.setCallback(paramCallback, paramHandler);
      if (paramCallback == null)
      {
        mRcc.setPlaybackPositionUpdateListener(null);
      }
      else
      {
        paramCallback = new RemoteControlClient.OnPlaybackPositionUpdateListener()
        {
          public void onPlaybackPositionUpdate(long paramAnonymousLong)
          {
            postToHandler(18, -1, -1, Long.valueOf(paramAnonymousLong), null);
          }
        };
        mRcc.setPlaybackPositionUpdateListener(paramCallback);
      }
    }
    
    public void setRccState(PlaybackStateCompat paramPlaybackStateCompat)
    {
      long l1 = paramPlaybackStateCompat.getPosition();
      float f = paramPlaybackStateCompat.getPlaybackSpeed();
      long l2 = paramPlaybackStateCompat.getLastPositionUpdateTime();
      long l3 = SystemClock.elapsedRealtime();
      long l4 = l1;
      if (paramPlaybackStateCompat.getState() == 3)
      {
        long l5 = 0L;
        l4 = l1;
        if (l1 > 0L)
        {
          l4 = l5;
          if (l2 > 0L)
          {
            l5 = l3 - l2;
            l4 = l5;
            if (f > 0.0F)
            {
              l4 = l5;
              if (f != 1.0F) {
                l4 = ((float)l5 * f);
              }
            }
          }
          l4 = l1 + l4;
        }
      }
      mRcc.setPlaybackState(getRccStateFromState(paramPlaybackStateCompat.getState()), l4, f);
    }
    
    public void unregisterMediaButtonEventReceiver(PendingIntent paramPendingIntent, ComponentName paramComponentName)
    {
      if (sIsMbrPendingIntentSupported) {
        mAudioManager.unregisterMediaButtonEventReceiver(paramPendingIntent);
      } else {
        super.unregisterMediaButtonEventReceiver(paramPendingIntent, paramComponentName);
      }
    }
  }
  
  @RequiresApi(19)
  public static class MediaSessionImplApi19
    extends MediaSessionCompat.MediaSessionImplApi18
  {
    public MediaSessionImplApi19(Context paramContext, String paramString, ComponentName paramComponentName, PendingIntent paramPendingIntent, VersionedParcelable paramVersionedParcelable, Bundle paramBundle)
    {
      super(paramString, paramComponentName, paramPendingIntent, paramVersionedParcelable, paramBundle);
    }
    
    public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle paramBundle)
    {
      RemoteControlClient.MetadataEditor localMetadataEditor = super.buildRccMetadata(paramBundle);
      PlaybackStateCompat localPlaybackStateCompat = mState;
      long l;
      if (localPlaybackStateCompat == null) {
        l = 0L;
      } else {
        l = localPlaybackStateCompat.getActions();
      }
      if ((l & 0x80) != 0L) {
        localMetadataEditor.addEditableKey(268435457);
      }
      if (paramBundle == null) {
        return localMetadataEditor;
      }
      if (paramBundle.containsKey("android.media.metadata.YEAR")) {
        localMetadataEditor.putLong(8, paramBundle.getLong("android.media.metadata.YEAR"));
      }
      if (paramBundle.containsKey("android.media.metadata.RATING")) {
        localMetadataEditor.putObject(101, paramBundle.getParcelable("android.media.metadata.RATING"));
      }
      if (paramBundle.containsKey("android.media.metadata.USER_RATING")) {
        localMetadataEditor.putObject(268435457, paramBundle.getParcelable("android.media.metadata.USER_RATING"));
      }
      return localMetadataEditor;
    }
    
    public int getRccTransportControlFlagsFromActions(long paramLong)
    {
      int i = super.getRccTransportControlFlagsFromActions(paramLong);
      int j = i;
      if ((paramLong & 0x80) != 0L) {
        j = i | 0x200;
      }
      return j;
    }
    
    public void setCallback(MediaSessionCompat.Callback paramCallback, Handler paramHandler)
    {
      super.setCallback(paramCallback, paramHandler);
      if (paramCallback == null)
      {
        mRcc.setMetadataUpdateListener(null);
      }
      else
      {
        paramCallback = new RemoteControlClient.OnMetadataUpdateListener()
        {
          public void onMetadataUpdate(int paramAnonymousInt, Object paramAnonymousObject)
          {
            if ((paramAnonymousInt == 268435457) && ((paramAnonymousObject instanceof Rating))) {
              postToHandler(19, -1, -1, RatingCompat.fromRating(paramAnonymousObject), null);
            }
          }
        };
        mRcc.setMetadataUpdateListener(paramCallback);
      }
    }
  }
  
  @RequiresApi(21)
  public static class MediaSessionImplApi21
    implements MediaSessionCompat.MediaSessionImpl
  {
    @GuardedBy("mLock")
    public MediaSessionCompat.Callback mCallback;
    public boolean mCaptioningEnabled;
    public boolean mDestroyed = false;
    public final RemoteCallbackList<IMediaControllerCallback> mExtraControllerCallbacks = new RemoteCallbackList();
    public final Object mLock = new Object();
    public MediaMetadataCompat mMetadata;
    public PlaybackStateCompat mPlaybackState;
    public List<MediaSessionCompat.QueueItem> mQueue;
    public int mRatingType;
    @GuardedBy("mLock")
    public MediaSessionCompat.RegistrationCallbackHandler mRegistrationCallbackHandler;
    @GuardedBy("mLock")
    public MediaSessionManager.RemoteUserInfo mRemoteUserInfo;
    public int mRepeatMode;
    public final MediaSession mSessionFwk;
    public Bundle mSessionInfo;
    public int mShuffleMode;
    public final MediaSessionCompat.Token mToken;
    
    public MediaSessionImplApi21(Context paramContext, String paramString, VersionedParcelable paramVersionedParcelable, Bundle paramBundle)
    {
      paramContext = createFwkMediaSession(paramContext, paramString, paramBundle);
      mSessionFwk = paramContext;
      mToken = new MediaSessionCompat.Token(paramContext.getSessionToken(), new ExtraSession(), paramVersionedParcelable);
      mSessionInfo = paramBundle;
      setFlags(3);
    }
    
    public MediaSessionImplApi21(Object paramObject)
    {
      if ((paramObject instanceof MediaSession))
      {
        paramObject = (MediaSession)paramObject;
        mSessionFwk = ((MediaSession)paramObject);
        mToken = new MediaSessionCompat.Token(((MediaSession)paramObject).getSessionToken(), new ExtraSession());
        mSessionInfo = null;
        setFlags(3);
        return;
      }
      throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
    }
    
    public MediaSession createFwkMediaSession(Context paramContext, String paramString, Bundle paramBundle)
    {
      return new MediaSession(paramContext, paramString);
    }
    
    public MediaSessionCompat.Callback getCallback()
    {
      synchronized (mLock)
      {
        MediaSessionCompat.Callback localCallback = mCallback;
        return localCallback;
      }
    }
    
    public String getCallingPackage()
    {
      try
      {
        String str = (String)mSessionFwk.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mSessionFwk, new Object[0]);
        return str;
      }
      catch (Exception localException)
      {
        Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", localException);
      }
      return null;
    }
    
    public MediaSessionManager.RemoteUserInfo getCurrentControllerInfo()
    {
      synchronized (mLock)
      {
        MediaSessionManager.RemoteUserInfo localRemoteUserInfo = mRemoteUserInfo;
        return localRemoteUserInfo;
      }
    }
    
    public Object getMediaSession()
    {
      return mSessionFwk;
    }
    
    public PlaybackStateCompat getPlaybackState()
    {
      return mPlaybackState;
    }
    
    public Object getRemoteControlClient()
    {
      return null;
    }
    
    public MediaSessionCompat.Token getSessionToken()
    {
      return mToken;
    }
    
    public boolean isActive()
    {
      return mSessionFwk.isActive();
    }
    
    public void release()
    {
      mDestroyed = true;
      mExtraControllerCallbacks.kill();
      if (Build.VERSION.SDK_INT == 27) {
        try
        {
          Object localObject = mSessionFwk.getClass().getDeclaredField("mCallback");
          ((AccessibleObject)localObject).setAccessible(true);
          localObject = (Handler)((Field)localObject).get(mSessionFwk);
          if (localObject != null) {
            ((Handler)localObject).removeCallbacksAndMessages(null);
          }
        }
        catch (Exception localException)
        {
          Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", localException);
        }
      }
      mSessionFwk.setCallback(null);
      mSessionFwk.release();
    }
    
    public void sendSessionEvent(String paramString, Bundle paramBundle)
    {
      mSessionFwk.sendSessionEvent(paramString, paramBundle);
    }
    
    public void setActive(boolean paramBoolean)
    {
      mSessionFwk.setActive(paramBoolean);
    }
    
    public void setCallback(MediaSessionCompat.Callback paramCallback, Handler paramHandler)
    {
      synchronized (mLock)
      {
        mCallback = paramCallback;
        MediaSession localMediaSession = mSessionFwk;
        MediaSession.Callback localCallback;
        if (paramCallback == null) {
          localCallback = null;
        } else {
          localCallback = mCallbackFwk;
        }
        localMediaSession.setCallback(localCallback, paramHandler);
        if (paramCallback != null) {
          paramCallback.setSessionImpl(this, paramHandler);
        }
        return;
      }
    }
    
    public void setCaptioningEnabled(boolean paramBoolean)
    {
      if (mCaptioningEnabled != paramBoolean) {
        mCaptioningEnabled = paramBoolean;
      }
      for (;;)
      {
        int i;
        IMediaControllerCallback localIMediaControllerCallback;
        synchronized (mLock)
        {
          i = mExtraControllerCallbacks.beginBroadcast() - 1;
          if (i >= 0) {
            localIMediaControllerCallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
          }
        }
        try
        {
          localIMediaControllerCallback.onCaptioningEnabledChanged(paramBoolean);
          i--;
          continue;
          mExtraControllerCallbacks.finishBroadcast();
          break label80;
          localObject2 = finally;
          throw ((Throwable)localObject2);
          label80:
          return;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    }
    
    public void setCurrentControllerInfo(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
    {
      synchronized (mLock)
      {
        mRemoteUserInfo = paramRemoteUserInfo;
        return;
      }
    }
    
    public void setExtras(Bundle paramBundle)
    {
      mSessionFwk.setExtras(paramBundle);
    }
    
    @SuppressLint({"WrongConstant"})
    public void setFlags(int paramInt)
    {
      mSessionFwk.setFlags(paramInt | 0x1 | 0x2);
    }
    
    public void setMediaButtonReceiver(PendingIntent paramPendingIntent)
    {
      mSessionFwk.setMediaButtonReceiver(paramPendingIntent);
    }
    
    public void setMetadata(MediaMetadataCompat paramMediaMetadataCompat)
    {
      mMetadata = paramMediaMetadataCompat;
      MediaSession localMediaSession = mSessionFwk;
      if (paramMediaMetadataCompat == null) {
        paramMediaMetadataCompat = null;
      } else {
        paramMediaMetadataCompat = (MediaMetadata)paramMediaMetadataCompat.getMediaMetadata();
      }
      localMediaSession.setMetadata(paramMediaMetadataCompat);
    }
    
    public void setPlaybackState(PlaybackStateCompat paramPlaybackStateCompat)
    {
      mPlaybackState = paramPlaybackStateCompat;
      for (;;)
      {
        int i;
        IMediaControllerCallback localIMediaControllerCallback;
        synchronized (mLock)
        {
          i = mExtraControllerCallbacks.beginBroadcast() - 1;
          if (i >= 0) {
            localIMediaControllerCallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
          }
        }
        try
        {
          localIMediaControllerCallback.onPlaybackStateChanged(paramPlaybackStateCompat);
          i--;
          continue;
          mExtraControllerCallbacks.finishBroadcast();
          ??? = mSessionFwk;
          if (paramPlaybackStateCompat == null) {
            paramPlaybackStateCompat = null;
          } else {
            paramPlaybackStateCompat = (PlaybackState)paramPlaybackStateCompat.getPlaybackState();
          }
          ((MediaSession)???).setPlaybackState(paramPlaybackStateCompat);
          return;
          paramPlaybackStateCompat = finally;
          throw paramPlaybackStateCompat;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    }
    
    public void setPlaybackToLocal(int paramInt)
    {
      AudioAttributes.Builder localBuilder = new AudioAttributes.Builder();
      localBuilder.setLegacyStreamType(paramInt);
      mSessionFwk.setPlaybackToLocal(localBuilder.build());
    }
    
    public void setPlaybackToRemote(VolumeProviderCompat paramVolumeProviderCompat)
    {
      mSessionFwk.setPlaybackToRemote((VolumeProvider)paramVolumeProviderCompat.getVolumeProvider());
    }
    
    public void setQueue(List<MediaSessionCompat.QueueItem> paramList)
    {
      mQueue = paramList;
      if (paramList == null)
      {
        mSessionFwk.setQueue(null);
        return;
      }
      ArrayList localArrayList = new ArrayList(paramList.size());
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        localArrayList.add((MediaSession.QueueItem)((MediaSessionCompat.QueueItem)paramList.next()).getQueueItem());
      }
      mSessionFwk.setQueue(localArrayList);
    }
    
    public void setQueueTitle(CharSequence paramCharSequence)
    {
      mSessionFwk.setQueueTitle(paramCharSequence);
    }
    
    public void setRatingType(int paramInt)
    {
      mRatingType = paramInt;
    }
    
    public void setRegistrationCallback(@Nullable MediaSessionCompat.RegistrationCallback paramRegistrationCallback, @NonNull Handler paramHandler)
    {
      synchronized (mLock)
      {
        MediaSessionCompat.RegistrationCallbackHandler localRegistrationCallbackHandler = mRegistrationCallbackHandler;
        if (localRegistrationCallbackHandler != null) {
          localRegistrationCallbackHandler.removeCallbacksAndMessages(null);
        }
        if (paramRegistrationCallback != null)
        {
          localRegistrationCallbackHandler = new android/support/v4/media/session/MediaSessionCompat$RegistrationCallbackHandler;
          localRegistrationCallbackHandler.<init>(paramHandler.getLooper(), paramRegistrationCallback);
          mRegistrationCallbackHandler = localRegistrationCallbackHandler;
        }
        else
        {
          mRegistrationCallbackHandler = null;
        }
        return;
      }
    }
    
    public void setRepeatMode(int paramInt)
    {
      if (mRepeatMode != paramInt) {
        mRepeatMode = paramInt;
      }
      for (;;)
      {
        int i;
        IMediaControllerCallback localIMediaControllerCallback;
        synchronized (mLock)
        {
          i = mExtraControllerCallbacks.beginBroadcast() - 1;
          if (i >= 0) {
            localIMediaControllerCallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
          }
        }
        try
        {
          localIMediaControllerCallback.onRepeatModeChanged(paramInt);
          i--;
          continue;
          mExtraControllerCallbacks.finishBroadcast();
          break label80;
          localObject2 = finally;
          throw ((Throwable)localObject2);
          label80:
          return;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    }
    
    public void setSessionActivity(PendingIntent paramPendingIntent)
    {
      mSessionFwk.setSessionActivity(paramPendingIntent);
    }
    
    public void setShuffleMode(int paramInt)
    {
      if (mShuffleMode != paramInt) {
        mShuffleMode = paramInt;
      }
      for (;;)
      {
        int i;
        IMediaControllerCallback localIMediaControllerCallback;
        synchronized (mLock)
        {
          i = mExtraControllerCallbacks.beginBroadcast() - 1;
          if (i >= 0) {
            localIMediaControllerCallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
          }
        }
        try
        {
          localIMediaControllerCallback.onShuffleModeChanged(paramInt);
          i--;
          continue;
          mExtraControllerCallbacks.finishBroadcast();
          break label80;
          localObject2 = finally;
          throw ((Throwable)localObject2);
          label80:
          return;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    }
    
    public class ExtraSession
      extends IMediaSession.Stub
    {
      public ExtraSession() {}
      
      public void addQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
      {
        throw new AssertionError();
      }
      
      public void addQueueItemAt(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
      {
        throw new AssertionError();
      }
      
      public void adjustVolume(int paramInt1, int paramInt2, String paramString)
      {
        throw new AssertionError();
      }
      
      public void fastForward()
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public Bundle getExtras()
      {
        throw new AssertionError();
      }
      
      public long getFlags()
      {
        throw new AssertionError();
      }
      
      public PendingIntent getLaunchPendingIntent()
      {
        throw new AssertionError();
      }
      
      public MediaMetadataCompat getMetadata()
      {
        throw new AssertionError();
      }
      
      public String getPackageName()
      {
        throw new AssertionError();
      }
      
      public PlaybackStateCompat getPlaybackState()
      {
        MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = MediaSessionCompat.MediaSessionImplApi21.this;
        return MediaSessionCompat.getStateWithUpdatedPosition(mPlaybackState, mMetadata);
      }
      
      public List<MediaSessionCompat.QueueItem> getQueue()
      {
        return null;
      }
      
      public CharSequence getQueueTitle()
      {
        throw new AssertionError();
      }
      
      public int getRatingType()
      {
        return mRatingType;
      }
      
      public int getRepeatMode()
      {
        return mRepeatMode;
      }
      
      public Bundle getSessionInfo()
      {
        Bundle localBundle;
        if (mSessionInfo == null) {
          localBundle = null;
        } else {
          localBundle = new Bundle(mSessionInfo);
        }
        return localBundle;
      }
      
      public int getShuffleMode()
      {
        return mShuffleMode;
      }
      
      public String getTag()
      {
        throw new AssertionError();
      }
      
      public ParcelableVolumeInfo getVolumeAttributes()
      {
        throw new AssertionError();
      }
      
      public boolean isCaptioningEnabled()
      {
        return mCaptioningEnabled;
      }
      
      public boolean isShuffleModeEnabledRemoved()
      {
        return false;
      }
      
      public boolean isTransportControlEnabled()
      {
        throw new AssertionError();
      }
      
      public void next()
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void pause()
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void play()
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void playFromMediaId(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void playFromSearch(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void playFromUri(Uri paramUri, Bundle paramBundle)
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void prepare()
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void prepareFromMediaId(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void prepareFromSearch(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void prepareFromUri(Uri paramUri, Bundle paramBundle)
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void previous()
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void rate(RatingCompat paramRatingCompat)
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void rateWithExtras(RatingCompat paramRatingCompat, Bundle paramBundle)
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void registerCallbackListener(IMediaControllerCallback arg1)
      {
        if (mDestroyed) {
          return;
        }
        int i = Binder.getCallingPid();
        int j = Binder.getCallingUid();
        Object localObject1 = new MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", i, j);
        mExtraControllerCallbacks.register(???, localObject1);
        synchronized (mLock)
        {
          localObject1 = mRegistrationCallbackHandler;
          if (localObject1 != null) {
            ((MediaSessionCompat.RegistrationCallbackHandler)localObject1).postCallbackRegistered(i, j);
          }
          return;
        }
      }
      
      public void removeQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
      {
        throw new AssertionError();
      }
      
      public void removeQueueItemAt(int paramInt)
      {
        throw new AssertionError();
      }
      
      public void rewind()
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void seekTo(long paramLong)
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void sendCommand(String paramString, Bundle paramBundle, MediaSessionCompat.ResultReceiverWrapper paramResultReceiverWrapper)
      {
        throw new AssertionError();
      }
      
      public void sendCustomAction(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public boolean sendMediaButton(KeyEvent paramKeyEvent)
      {
        throw new AssertionError();
      }
      
      public void setCaptioningEnabled(boolean paramBoolean)
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void setPlaybackSpeed(float paramFloat)
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void setRepeatMode(int paramInt)
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void setShuffleMode(int paramInt)
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void setShuffleModeEnabledRemoved(boolean paramBoolean)
        throws RemoteException
      {}
      
      public void setVolumeTo(int paramInt1, int paramInt2, String paramString)
      {
        throw new AssertionError();
      }
      
      public void skipToQueueItem(long paramLong)
      {
        throw new AssertionError();
      }
      
      public void stop()
        throws RemoteException
      {
        throw new AssertionError();
      }
      
      public void unregisterCallbackListener(IMediaControllerCallback arg1)
      {
        mExtraControllerCallbacks.unregister(???);
        int i = Binder.getCallingPid();
        int j = Binder.getCallingUid();
        synchronized (mLock)
        {
          MediaSessionCompat.RegistrationCallbackHandler localRegistrationCallbackHandler = mRegistrationCallbackHandler;
          if (localRegistrationCallbackHandler != null) {
            localRegistrationCallbackHandler.postCallbackUnregistered(i, j);
          }
          return;
        }
      }
    }
  }
  
  @RequiresApi(22)
  public static class MediaSessionImplApi22
    extends MediaSessionCompat.MediaSessionImplApi21
  {
    public MediaSessionImplApi22(Context paramContext, String paramString, VersionedParcelable paramVersionedParcelable, Bundle paramBundle)
    {
      super(paramString, paramVersionedParcelable, paramBundle);
    }
    
    public MediaSessionImplApi22(Object paramObject)
    {
      super();
    }
    
    public void setRatingType(int paramInt)
    {
      mSessionFwk.setRatingType(paramInt);
    }
  }
  
  @RequiresApi(28)
  public static class MediaSessionImplApi28
    extends MediaSessionCompat.MediaSessionImplApi22
  {
    public MediaSessionImplApi28(Context paramContext, String paramString, VersionedParcelable paramVersionedParcelable, Bundle paramBundle)
    {
      super(paramString, paramVersionedParcelable, paramBundle);
    }
    
    public MediaSessionImplApi28(Object paramObject)
    {
      super();
    }
    
    @NonNull
    public final MediaSessionManager.RemoteUserInfo getCurrentControllerInfo()
    {
      return new MediaSessionManager.RemoteUserInfo(a3.h(mSessionFwk));
    }
    
    public void setCurrentControllerInfo(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo) {}
  }
  
  @RequiresApi(29)
  public static class MediaSessionImplApi29
    extends MediaSessionCompat.MediaSessionImplApi28
  {
    public MediaSessionImplApi29(Context paramContext, String paramString, VersionedParcelable paramVersionedParcelable, Bundle paramBundle)
    {
      super(paramString, paramVersionedParcelable, paramBundle);
    }
    
    public MediaSessionImplApi29(Object paramObject)
    {
      super();
      mSessionInfo = e.f(((MediaSession)paramObject).getController());
    }
    
    public MediaSession createFwkMediaSession(Context paramContext, String paramString, Bundle paramBundle)
    {
      return new MediaSession(paramContext, paramString, paramBundle);
    }
  }
  
  public static class MediaSessionImplBase
    implements MediaSessionCompat.MediaSessionImpl
  {
    public static final int RCC_PLAYSTATE_NONE = 0;
    public final AudioManager mAudioManager;
    public volatile MediaSessionCompat.Callback mCallback;
    public boolean mCaptioningEnabled;
    private final Context mContext;
    public final RemoteCallbackList<IMediaControllerCallback> mControllerCallbacks = new RemoteCallbackList();
    public boolean mDestroyed = false;
    public Bundle mExtras;
    public int mFlags = 3;
    private MessageHandler mHandler;
    public boolean mIsActive = false;
    public int mLocalStream;
    public final Object mLock = new Object();
    private final ComponentName mMediaButtonReceiverComponentName;
    private final PendingIntent mMediaButtonReceiverIntent;
    public MediaMetadataCompat mMetadata;
    public final String mPackageName;
    public List<MediaSessionCompat.QueueItem> mQueue;
    public CharSequence mQueueTitle;
    public int mRatingType;
    public final RemoteControlClient mRcc;
    public MediaSessionCompat.RegistrationCallbackHandler mRegistrationCallbackHandler;
    private MediaSessionManager.RemoteUserInfo mRemoteUserInfo;
    public int mRepeatMode;
    public PendingIntent mSessionActivity;
    public final Bundle mSessionInfo;
    public int mShuffleMode;
    public PlaybackStateCompat mState;
    private final MediaSessionStub mStub;
    public final String mTag;
    private final MediaSessionCompat.Token mToken;
    private VolumeProviderCompat.Callback mVolumeCallback = new VolumeProviderCompat.Callback()
    {
      public void onVolumeChanged(VolumeProviderCompat paramAnonymousVolumeProviderCompat)
      {
        if (mVolumeProvider != paramAnonymousVolumeProviderCompat) {
          return;
        }
        MediaSessionCompat.MediaSessionImplBase localMediaSessionImplBase = MediaSessionCompat.MediaSessionImplBase.this;
        paramAnonymousVolumeProviderCompat = new ParcelableVolumeInfo(mVolumeType, mLocalStream, paramAnonymousVolumeProviderCompat.getVolumeControl(), paramAnonymousVolumeProviderCompat.getMaxVolume(), paramAnonymousVolumeProviderCompat.getCurrentVolume());
        sendVolumeInfoChanged(paramAnonymousVolumeProviderCompat);
      }
    };
    public VolumeProviderCompat mVolumeProvider;
    public int mVolumeType;
    
    public MediaSessionImplBase(Context paramContext, String paramString, ComponentName paramComponentName, PendingIntent paramPendingIntent, VersionedParcelable paramVersionedParcelable, Bundle paramBundle)
    {
      if (paramComponentName != null)
      {
        mContext = paramContext;
        mPackageName = paramContext.getPackageName();
        mSessionInfo = paramBundle;
        mAudioManager = ((AudioManager)paramContext.getSystemService("audio"));
        mTag = paramString;
        mMediaButtonReceiverComponentName = paramComponentName;
        mMediaButtonReceiverIntent = paramPendingIntent;
        paramContext = new MediaSessionStub();
        mStub = paramContext;
        mToken = new MediaSessionCompat.Token(paramContext, null, paramVersionedParcelable);
        mRatingType = 0;
        mVolumeType = 1;
        mLocalStream = 3;
        mRcc = new RemoteControlClient(paramPendingIntent);
        return;
      }
      throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
    }
    
    private void sendCaptioningEnabled(boolean paramBoolean)
    {
      for (;;)
      {
        int i;
        IMediaControllerCallback localIMediaControllerCallback;
        synchronized (mLock)
        {
          i = mControllerCallbacks.beginBroadcast() - 1;
          if (i >= 0) {
            localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
          }
        }
        try
        {
          localIMediaControllerCallback.onCaptioningEnabledChanged(paramBoolean);
          i--;
          continue;
          mControllerCallbacks.finishBroadcast();
          return;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    }
    
    private void sendEvent(String paramString, Bundle paramBundle)
    {
      for (;;)
      {
        int i;
        IMediaControllerCallback localIMediaControllerCallback;
        synchronized (mLock)
        {
          i = mControllerCallbacks.beginBroadcast() - 1;
          if (i >= 0) {
            localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
          }
        }
        try
        {
          localIMediaControllerCallback.onEvent(paramString, paramBundle);
          i--;
          continue;
          mControllerCallbacks.finishBroadcast();
          return;
          paramString = finally;
          throw paramString;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    }
    
    private void sendExtras(Bundle paramBundle)
    {
      for (;;)
      {
        int i;
        IMediaControllerCallback localIMediaControllerCallback;
        synchronized (mLock)
        {
          i = mControllerCallbacks.beginBroadcast() - 1;
          if (i >= 0) {
            localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
          }
        }
        try
        {
          localIMediaControllerCallback.onExtrasChanged(paramBundle);
          i--;
          continue;
          mControllerCallbacks.finishBroadcast();
          return;
          paramBundle = finally;
          throw paramBundle;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    }
    
    private void sendMetadata(MediaMetadataCompat paramMediaMetadataCompat)
    {
      for (;;)
      {
        int i;
        IMediaControllerCallback localIMediaControllerCallback;
        synchronized (mLock)
        {
          i = mControllerCallbacks.beginBroadcast() - 1;
          if (i >= 0) {
            localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
          }
        }
        try
        {
          localIMediaControllerCallback.onMetadataChanged(paramMediaMetadataCompat);
          i--;
          continue;
          mControllerCallbacks.finishBroadcast();
          return;
          paramMediaMetadataCompat = finally;
          throw paramMediaMetadataCompat;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    }
    
    private void sendQueue(List<MediaSessionCompat.QueueItem> paramList)
    {
      for (;;)
      {
        int i;
        IMediaControllerCallback localIMediaControllerCallback;
        synchronized (mLock)
        {
          i = mControllerCallbacks.beginBroadcast() - 1;
          if (i >= 0) {
            localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
          }
        }
        try
        {
          localIMediaControllerCallback.onQueueChanged(paramList);
          i--;
          continue;
          mControllerCallbacks.finishBroadcast();
          return;
          paramList = finally;
          throw paramList;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    }
    
    private void sendQueueTitle(CharSequence paramCharSequence)
    {
      for (;;)
      {
        int i;
        IMediaControllerCallback localIMediaControllerCallback;
        synchronized (mLock)
        {
          i = mControllerCallbacks.beginBroadcast() - 1;
          if (i >= 0) {
            localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
          }
        }
        try
        {
          localIMediaControllerCallback.onQueueTitleChanged(paramCharSequence);
          i--;
          continue;
          mControllerCallbacks.finishBroadcast();
          return;
          paramCharSequence = finally;
          throw paramCharSequence;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    }
    
    private void sendRepeatMode(int paramInt)
    {
      for (;;)
      {
        int i;
        IMediaControllerCallback localIMediaControllerCallback;
        synchronized (mLock)
        {
          i = mControllerCallbacks.beginBroadcast() - 1;
          if (i >= 0) {
            localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
          }
        }
        try
        {
          localIMediaControllerCallback.onRepeatModeChanged(paramInt);
          i--;
          continue;
          mControllerCallbacks.finishBroadcast();
          return;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    }
    
    private void sendSessionDestroyed()
    {
      for (;;)
      {
        int i;
        IMediaControllerCallback localIMediaControllerCallback;
        synchronized (mLock)
        {
          i = mControllerCallbacks.beginBroadcast() - 1;
          if (i >= 0) {
            localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
          }
        }
        try
        {
          localIMediaControllerCallback.onSessionDestroyed();
          i--;
          continue;
          mControllerCallbacks.finishBroadcast();
          mControllerCallbacks.kill();
          return;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    }
    
    private void sendShuffleMode(int paramInt)
    {
      for (;;)
      {
        int i;
        IMediaControllerCallback localIMediaControllerCallback;
        synchronized (mLock)
        {
          i = mControllerCallbacks.beginBroadcast() - 1;
          if (i >= 0) {
            localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
          }
        }
        try
        {
          localIMediaControllerCallback.onShuffleModeChanged(paramInt);
          i--;
          continue;
          mControllerCallbacks.finishBroadcast();
          return;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    }
    
    private void sendState(PlaybackStateCompat paramPlaybackStateCompat)
    {
      for (;;)
      {
        int i;
        IMediaControllerCallback localIMediaControllerCallback;
        synchronized (mLock)
        {
          i = mControllerCallbacks.beginBroadcast() - 1;
          if (i >= 0) {
            localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
          }
        }
        try
        {
          localIMediaControllerCallback.onPlaybackStateChanged(paramPlaybackStateCompat);
          i--;
          continue;
          mControllerCallbacks.finishBroadcast();
          return;
          paramPlaybackStateCompat = finally;
          throw paramPlaybackStateCompat;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    }
    
    public void adjustVolume(int paramInt1, int paramInt2)
    {
      if (mVolumeType == 2)
      {
        VolumeProviderCompat localVolumeProviderCompat = mVolumeProvider;
        if (localVolumeProviderCompat != null) {
          localVolumeProviderCompat.onAdjustVolume(paramInt1);
        }
      }
      else
      {
        mAudioManager.adjustStreamVolume(mLocalStream, paramInt1, paramInt2);
      }
    }
    
    public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle paramBundle)
    {
      RemoteControlClient.MetadataEditor localMetadataEditor = mRcc.editMetadata(true);
      if (paramBundle == null) {
        return localMetadataEditor;
      }
      Bitmap localBitmap1;
      Bitmap localBitmap2;
      if (paramBundle.containsKey("android.media.metadata.ART"))
      {
        localBitmap1 = (Bitmap)paramBundle.getParcelable("android.media.metadata.ART");
        localBitmap2 = localBitmap1;
        if (localBitmap1 != null) {
          localBitmap2 = localBitmap1.copy(localBitmap1.getConfig(), false);
        }
        localMetadataEditor.putBitmap(100, localBitmap2);
      }
      else if (paramBundle.containsKey("android.media.metadata.ALBUM_ART"))
      {
        localBitmap1 = (Bitmap)paramBundle.getParcelable("android.media.metadata.ALBUM_ART");
        localBitmap2 = localBitmap1;
        if (localBitmap1 != null) {
          localBitmap2 = localBitmap1.copy(localBitmap1.getConfig(), false);
        }
        localMetadataEditor.putBitmap(100, localBitmap2);
      }
      if (paramBundle.containsKey("android.media.metadata.ALBUM")) {
        localMetadataEditor.putString(1, paramBundle.getString("android.media.metadata.ALBUM"));
      }
      if (paramBundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
        localMetadataEditor.putString(13, paramBundle.getString("android.media.metadata.ALBUM_ARTIST"));
      }
      if (paramBundle.containsKey("android.media.metadata.ARTIST")) {
        localMetadataEditor.putString(2, paramBundle.getString("android.media.metadata.ARTIST"));
      }
      if (paramBundle.containsKey("android.media.metadata.AUTHOR")) {
        localMetadataEditor.putString(3, paramBundle.getString("android.media.metadata.AUTHOR"));
      }
      if (paramBundle.containsKey("android.media.metadata.COMPILATION")) {
        localMetadataEditor.putString(15, paramBundle.getString("android.media.metadata.COMPILATION"));
      }
      if (paramBundle.containsKey("android.media.metadata.COMPOSER")) {
        localMetadataEditor.putString(4, paramBundle.getString("android.media.metadata.COMPOSER"));
      }
      if (paramBundle.containsKey("android.media.metadata.DATE")) {
        localMetadataEditor.putString(5, paramBundle.getString("android.media.metadata.DATE"));
      }
      if (paramBundle.containsKey("android.media.metadata.DISC_NUMBER")) {
        localMetadataEditor.putLong(14, paramBundle.getLong("android.media.metadata.DISC_NUMBER"));
      }
      if (paramBundle.containsKey("android.media.metadata.DURATION")) {
        localMetadataEditor.putLong(9, paramBundle.getLong("android.media.metadata.DURATION"));
      }
      if (paramBundle.containsKey("android.media.metadata.GENRE")) {
        localMetadataEditor.putString(6, paramBundle.getString("android.media.metadata.GENRE"));
      }
      if (paramBundle.containsKey("android.media.metadata.TITLE")) {
        localMetadataEditor.putString(7, paramBundle.getString("android.media.metadata.TITLE"));
      }
      if (paramBundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
        localMetadataEditor.putLong(0, paramBundle.getLong("android.media.metadata.TRACK_NUMBER"));
      }
      if (paramBundle.containsKey("android.media.metadata.WRITER")) {
        localMetadataEditor.putString(11, paramBundle.getString("android.media.metadata.WRITER"));
      }
      return localMetadataEditor;
    }
    
    public MediaSessionCompat.Callback getCallback()
    {
      synchronized (mLock)
      {
        MediaSessionCompat.Callback localCallback = mCallback;
        return localCallback;
      }
    }
    
    public String getCallingPackage()
    {
      return null;
    }
    
    public MediaSessionManager.RemoteUserInfo getCurrentControllerInfo()
    {
      synchronized (mLock)
      {
        MediaSessionManager.RemoteUserInfo localRemoteUserInfo = mRemoteUserInfo;
        return localRemoteUserInfo;
      }
    }
    
    public Object getMediaSession()
    {
      return null;
    }
    
    public String getPackageNameForUid(int paramInt)
    {
      String str1 = mContext.getPackageManager().getNameForUid(paramInt);
      String str2 = str1;
      if (TextUtils.isEmpty(str1)) {
        str2 = "android.media.session.MediaController";
      }
      return str2;
    }
    
    public PlaybackStateCompat getPlaybackState()
    {
      synchronized (mLock)
      {
        PlaybackStateCompat localPlaybackStateCompat = mState;
        return localPlaybackStateCompat;
      }
    }
    
    public int getRccStateFromState(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return -1;
      case 10: 
      case 11: 
        return 6;
      case 9: 
        return 7;
      case 7: 
        return 9;
      case 6: 
      case 8: 
        return 8;
      case 5: 
        return 5;
      case 4: 
        return 4;
      case 3: 
        return 3;
      case 2: 
        return 2;
      case 1: 
        return 1;
      }
      return 0;
    }
    
    public int getRccTransportControlFlagsFromActions(long paramLong)
    {
      if ((1L & paramLong) != 0L) {
        i = 32;
      } else {
        i = 0;
      }
      int j = i;
      if ((0x2 & paramLong) != 0L) {
        j = i | 0x10;
      }
      int k = j;
      if ((0x4 & paramLong) != 0L) {
        k = j | 0x4;
      }
      int i = k;
      if ((0x8 & paramLong) != 0L) {
        i = k | 0x2;
      }
      j = i;
      if ((0x10 & paramLong) != 0L) {
        j = i | 0x1;
      }
      i = j;
      if ((0x20 & paramLong) != 0L) {
        i = j | 0x80;
      }
      j = i;
      if ((0x40 & paramLong) != 0L) {
        j = i | 0x40;
      }
      i = j;
      if ((paramLong & 0x200) != 0L) {
        i = j | 0x8;
      }
      return i;
    }
    
    public Object getRemoteControlClient()
    {
      return null;
    }
    
    public MediaSessionCompat.Token getSessionToken()
    {
      return mToken;
    }
    
    public boolean isActive()
    {
      return mIsActive;
    }
    
    public void postToHandler(int paramInt1, int paramInt2, int paramInt3, Object paramObject, Bundle paramBundle)
    {
      synchronized (mLock)
      {
        Object localObject2 = mHandler;
        if (localObject2 != null)
        {
          localObject2 = ((Handler)localObject2).obtainMessage(paramInt1, paramInt2, paramInt3, paramObject);
          paramObject = new android/os/Bundle;
          ((Bundle)paramObject).<init>();
          paramInt1 = Binder.getCallingUid();
          ((BaseBundle)paramObject).putInt("data_calling_uid", paramInt1);
          ((BaseBundle)paramObject).putString("data_calling_pkg", getPackageNameForUid(paramInt1));
          paramInt1 = Binder.getCallingPid();
          if (paramInt1 > 0) {
            ((BaseBundle)paramObject).putInt("data_calling_pid", paramInt1);
          } else {
            ((BaseBundle)paramObject).putInt("data_calling_pid", -1);
          }
          if (paramBundle != null) {
            ((Bundle)paramObject).putBundle("data_extras", paramBundle);
          }
          ((Message)localObject2).setData((Bundle)paramObject);
          ((Message)localObject2).sendToTarget();
        }
        return;
      }
    }
    
    public void registerMediaButtonEventReceiver(PendingIntent paramPendingIntent, ComponentName paramComponentName)
    {
      mAudioManager.registerMediaButtonEventReceiver(paramComponentName);
    }
    
    public void release()
    {
      mIsActive = false;
      mDestroyed = true;
      updateMbrAndRcc();
      sendSessionDestroyed();
      setCallback(null, null);
    }
    
    public void sendSessionEvent(String paramString, Bundle paramBundle)
    {
      sendEvent(paramString, paramBundle);
    }
    
    public void sendVolumeInfoChanged(ParcelableVolumeInfo paramParcelableVolumeInfo)
    {
      for (;;)
      {
        int i;
        IMediaControllerCallback localIMediaControllerCallback;
        synchronized (mLock)
        {
          i = mControllerCallbacks.beginBroadcast() - 1;
          if (i >= 0) {
            localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
          }
        }
        try
        {
          localIMediaControllerCallback.onVolumeInfoChanged(paramParcelableVolumeInfo);
          i--;
          continue;
          mControllerCallbacks.finishBroadcast();
          return;
          paramParcelableVolumeInfo = finally;
          throw paramParcelableVolumeInfo;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    }
    
    public void setActive(boolean paramBoolean)
    {
      if (paramBoolean == mIsActive) {
        return;
      }
      mIsActive = paramBoolean;
      updateMbrAndRcc();
    }
    
    public void setCallback(MediaSessionCompat.Callback paramCallback, Handler paramHandler)
    {
      synchronized (mLock)
      {
        MessageHandler localMessageHandler = mHandler;
        if (localMessageHandler != null) {
          localMessageHandler.removeCallbacksAndMessages(null);
        }
        if ((paramCallback != null) && (paramHandler != null)) {
          localMessageHandler = new MessageHandler(paramHandler.getLooper());
        } else {
          localMessageHandler = null;
        }
        mHandler = localMessageHandler;
        if ((mCallback != paramCallback) && (mCallback != null)) {
          mCallback.setSessionImpl(null, null);
        }
        mCallback = paramCallback;
        if (mCallback != null) {
          mCallback.setSessionImpl(this, paramHandler);
        }
        return;
      }
    }
    
    public void setCaptioningEnabled(boolean paramBoolean)
    {
      if (mCaptioningEnabled != paramBoolean)
      {
        mCaptioningEnabled = paramBoolean;
        sendCaptioningEnabled(paramBoolean);
      }
    }
    
    public void setCurrentControllerInfo(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
    {
      synchronized (mLock)
      {
        mRemoteUserInfo = paramRemoteUserInfo;
        return;
      }
    }
    
    public void setExtras(Bundle paramBundle)
    {
      mExtras = paramBundle;
      sendExtras(paramBundle);
    }
    
    public void setFlags(int paramInt)
    {
      synchronized (mLock)
      {
        mFlags = (paramInt | 0x1 | 0x2);
        return;
      }
    }
    
    public void setMediaButtonReceiver(PendingIntent paramPendingIntent) {}
    
    public void setMetadata(MediaMetadataCompat arg1)
    {
      MediaMetadataCompat localMediaMetadataCompat = ???;
      if (??? != null) {
        localMediaMetadataCompat = new MediaMetadataCompat.Builder(???, MediaSessionCompat.sMaxBitmapSize).build();
      }
      synchronized (mLock)
      {
        mMetadata = localMediaMetadataCompat;
        sendMetadata(localMediaMetadataCompat);
        if (!mIsActive) {
          return;
        }
        if (localMediaMetadataCompat == null) {
          ??? = null;
        } else {
          ??? = localMediaMetadataCompat.getBundle();
        }
        buildRccMetadata(???).apply();
        return;
      }
    }
    
    public void setPlaybackState(PlaybackStateCompat paramPlaybackStateCompat)
    {
      synchronized (mLock)
      {
        mState = paramPlaybackStateCompat;
        sendState(paramPlaybackStateCompat);
        if (!mIsActive) {
          return;
        }
        if (paramPlaybackStateCompat == null)
        {
          mRcc.setPlaybackState(0);
          mRcc.setTransportControlFlags(0);
        }
        else
        {
          setRccState(paramPlaybackStateCompat);
          mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(paramPlaybackStateCompat.getActions()));
        }
        return;
      }
    }
    
    public void setPlaybackToLocal(int paramInt)
    {
      VolumeProviderCompat localVolumeProviderCompat = mVolumeProvider;
      if (localVolumeProviderCompat != null) {
        localVolumeProviderCompat.setCallback(null);
      }
      mLocalStream = paramInt;
      mVolumeType = 1;
      int i = mVolumeType;
      paramInt = mLocalStream;
      sendVolumeInfoChanged(new ParcelableVolumeInfo(i, paramInt, 2, mAudioManager.getStreamMaxVolume(paramInt), mAudioManager.getStreamVolume(mLocalStream)));
    }
    
    public void setPlaybackToRemote(VolumeProviderCompat paramVolumeProviderCompat)
    {
      if (paramVolumeProviderCompat != null)
      {
        VolumeProviderCompat localVolumeProviderCompat = mVolumeProvider;
        if (localVolumeProviderCompat != null) {
          localVolumeProviderCompat.setCallback(null);
        }
        mVolumeType = 2;
        mVolumeProvider = paramVolumeProviderCompat;
        sendVolumeInfoChanged(new ParcelableVolumeInfo(mVolumeType, mLocalStream, mVolumeProvider.getVolumeControl(), mVolumeProvider.getMaxVolume(), mVolumeProvider.getCurrentVolume()));
        paramVolumeProviderCompat.setCallback(mVolumeCallback);
        return;
      }
      throw new IllegalArgumentException("volumeProvider may not be null");
    }
    
    public void setQueue(List<MediaSessionCompat.QueueItem> paramList)
    {
      mQueue = paramList;
      sendQueue(paramList);
    }
    
    public void setQueueTitle(CharSequence paramCharSequence)
    {
      mQueueTitle = paramCharSequence;
      sendQueueTitle(paramCharSequence);
    }
    
    public void setRatingType(int paramInt)
    {
      mRatingType = paramInt;
    }
    
    public void setRccState(PlaybackStateCompat paramPlaybackStateCompat)
    {
      mRcc.setPlaybackState(getRccStateFromState(paramPlaybackStateCompat.getState()));
    }
    
    public void setRegistrationCallback(@Nullable MediaSessionCompat.RegistrationCallback paramRegistrationCallback, @NonNull Handler paramHandler)
    {
      synchronized (mLock)
      {
        MediaSessionCompat.RegistrationCallbackHandler localRegistrationCallbackHandler = mRegistrationCallbackHandler;
        if (localRegistrationCallbackHandler != null) {
          localRegistrationCallbackHandler.removeCallbacksAndMessages(null);
        }
        if (paramRegistrationCallback != null)
        {
          localRegistrationCallbackHandler = new android/support/v4/media/session/MediaSessionCompat$RegistrationCallbackHandler;
          localRegistrationCallbackHandler.<init>(paramHandler.getLooper(), paramRegistrationCallback);
          mRegistrationCallbackHandler = localRegistrationCallbackHandler;
        }
        else
        {
          mRegistrationCallbackHandler = null;
        }
        return;
      }
    }
    
    public void setRepeatMode(int paramInt)
    {
      if (mRepeatMode != paramInt)
      {
        mRepeatMode = paramInt;
        sendRepeatMode(paramInt);
      }
    }
    
    public void setSessionActivity(PendingIntent paramPendingIntent)
    {
      synchronized (mLock)
      {
        mSessionActivity = paramPendingIntent;
        return;
      }
    }
    
    public void setShuffleMode(int paramInt)
    {
      if (mShuffleMode != paramInt)
      {
        mShuffleMode = paramInt;
        sendShuffleMode(paramInt);
      }
    }
    
    public void setVolumeTo(int paramInt1, int paramInt2)
    {
      if (mVolumeType == 2)
      {
        VolumeProviderCompat localVolumeProviderCompat = mVolumeProvider;
        if (localVolumeProviderCompat != null) {
          localVolumeProviderCompat.onSetVolumeTo(paramInt1);
        }
      }
      else
      {
        mAudioManager.setStreamVolume(mLocalStream, paramInt1, paramInt2);
      }
    }
    
    public void unregisterMediaButtonEventReceiver(PendingIntent paramPendingIntent, ComponentName paramComponentName)
    {
      mAudioManager.unregisterMediaButtonEventReceiver(paramComponentName);
    }
    
    public void updateMbrAndRcc()
    {
      if (mIsActive)
      {
        registerMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
        mAudioManager.registerRemoteControlClient(mRcc);
        setMetadata(mMetadata);
        setPlaybackState(mState);
      }
      else
      {
        unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
        mRcc.setPlaybackState(0);
        mAudioManager.unregisterRemoteControlClient(mRcc);
      }
    }
    
    public static final class Command
    {
      public final String command;
      public final Bundle extras;
      public final ResultReceiver stub;
      
      public Command(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver)
      {
        command = paramString;
        extras = paramBundle;
        stub = paramResultReceiver;
      }
    }
    
    public class MediaSessionStub
      extends IMediaSession.Stub
    {
      public MediaSessionStub() {}
      
      public void addQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
      {
        postToHandler(25, paramMediaDescriptionCompat);
      }
      
      public void addQueueItemAt(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
      {
        postToHandler(26, paramMediaDescriptionCompat, paramInt);
      }
      
      public void adjustVolume(int paramInt1, int paramInt2, String paramString)
      {
        adjustVolume(paramInt1, paramInt2);
      }
      
      public void fastForward()
        throws RemoteException
      {
        postToHandler(16);
      }
      
      public Bundle getExtras()
      {
        synchronized (mLock)
        {
          Bundle localBundle = mExtras;
          return localBundle;
        }
      }
      
      public long getFlags()
      {
        synchronized (mLock)
        {
          long l = mFlags;
          return l;
        }
      }
      
      public PendingIntent getLaunchPendingIntent()
      {
        synchronized (mLock)
        {
          PendingIntent localPendingIntent = mSessionActivity;
          return localPendingIntent;
        }
      }
      
      public MediaMetadataCompat getMetadata()
      {
        return mMetadata;
      }
      
      public String getPackageName()
      {
        return mPackageName;
      }
      
      public PlaybackStateCompat getPlaybackState()
      {
        synchronized (mLock)
        {
          Object localObject2 = MediaSessionCompat.MediaSessionImplBase.this;
          PlaybackStateCompat localPlaybackStateCompat = mState;
          localObject2 = mMetadata;
          return MediaSessionCompat.getStateWithUpdatedPosition(localPlaybackStateCompat, (MediaMetadataCompat)localObject2);
        }
      }
      
      public List<MediaSessionCompat.QueueItem> getQueue()
      {
        synchronized (mLock)
        {
          List localList = mQueue;
          return localList;
        }
      }
      
      public CharSequence getQueueTitle()
      {
        return mQueueTitle;
      }
      
      public int getRatingType()
      {
        return mRatingType;
      }
      
      public int getRepeatMode()
      {
        return mRepeatMode;
      }
      
      public Bundle getSessionInfo()
      {
        Bundle localBundle;
        if (mSessionInfo == null) {
          localBundle = null;
        } else {
          localBundle = new Bundle(mSessionInfo);
        }
        return localBundle;
      }
      
      public int getShuffleMode()
      {
        return mShuffleMode;
      }
      
      public String getTag()
      {
        return mTag;
      }
      
      public ParcelableVolumeInfo getVolumeAttributes()
      {
        synchronized (mLock)
        {
          MediaSessionCompat.MediaSessionImplBase localMediaSessionImplBase = MediaSessionCompat.MediaSessionImplBase.this;
          int i = mVolumeType;
          int j = mLocalStream;
          VolumeProviderCompat localVolumeProviderCompat = mVolumeProvider;
          int k = 2;
          int m;
          int n;
          if (i == 2)
          {
            k = localVolumeProviderCompat.getVolumeControl();
            m = localVolumeProviderCompat.getMaxVolume();
            n = localVolumeProviderCompat.getCurrentVolume();
          }
          else
          {
            m = mAudioManager.getStreamMaxVolume(j);
            n = mAudioManager.getStreamVolume(j);
          }
          return new ParcelableVolumeInfo(i, j, k, m, n);
        }
      }
      
      public boolean isCaptioningEnabled()
      {
        return mCaptioningEnabled;
      }
      
      public boolean isShuffleModeEnabledRemoved()
      {
        return false;
      }
      
      public boolean isTransportControlEnabled()
      {
        return true;
      }
      
      public void next()
        throws RemoteException
      {
        postToHandler(14);
      }
      
      public void pause()
        throws RemoteException
      {
        postToHandler(12);
      }
      
      public void play()
        throws RemoteException
      {
        postToHandler(7);
      }
      
      public void playFromMediaId(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        postToHandler(8, paramString, paramBundle);
      }
      
      public void playFromSearch(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        postToHandler(9, paramString, paramBundle);
      }
      
      public void playFromUri(Uri paramUri, Bundle paramBundle)
        throws RemoteException
      {
        postToHandler(10, paramUri, paramBundle);
      }
      
      public void postToHandler(int paramInt)
      {
        postToHandler(paramInt, 0, 0, null, null);
      }
      
      public void postToHandler(int paramInt1, int paramInt2)
      {
        postToHandler(paramInt1, paramInt2, 0, null, null);
      }
      
      public void postToHandler(int paramInt1, int paramInt2, int paramInt3)
      {
        postToHandler(paramInt1, paramInt2, paramInt3, null, null);
      }
      
      public void postToHandler(int paramInt, Object paramObject)
      {
        postToHandler(paramInt, 0, 0, paramObject, null);
      }
      
      public void postToHandler(int paramInt1, Object paramObject, int paramInt2)
      {
        postToHandler(paramInt1, paramInt2, 0, paramObject, null);
      }
      
      public void postToHandler(int paramInt, Object paramObject, Bundle paramBundle)
      {
        postToHandler(paramInt, 0, 0, paramObject, paramBundle);
      }
      
      public void prepare()
        throws RemoteException
      {
        postToHandler(3);
      }
      
      public void prepareFromMediaId(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        postToHandler(4, paramString, paramBundle);
      }
      
      public void prepareFromSearch(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        postToHandler(5, paramString, paramBundle);
      }
      
      public void prepareFromUri(Uri paramUri, Bundle paramBundle)
        throws RemoteException
      {
        postToHandler(6, paramUri, paramBundle);
      }
      
      public void previous()
        throws RemoteException
      {
        postToHandler(15);
      }
      
      public void rate(RatingCompat paramRatingCompat)
        throws RemoteException
      {
        postToHandler(19, paramRatingCompat);
      }
      
      public void rateWithExtras(RatingCompat paramRatingCompat, Bundle paramBundle)
        throws RemoteException
      {
        postToHandler(31, paramRatingCompat, paramBundle);
      }
      
      public void registerCallbackListener(IMediaControllerCallback arg1)
      {
        if (mDestroyed) {}
        try
        {
          ???.onSessionDestroyed();
          return;
          int i = Binder.getCallingPid();
          int j = Binder.getCallingUid();
          Object localObject1 = new MediaSessionManager.RemoteUserInfo(getPackageNameForUid(j), i, j);
          mControllerCallbacks.register(???, localObject1);
          synchronized (mLock)
          {
            localObject1 = mRegistrationCallbackHandler;
            if (localObject1 != null) {
              ((MediaSessionCompat.RegistrationCallbackHandler)localObject1).postCallbackRegistered(i, j);
            }
            return;
          }
        }
        catch (Exception ???)
        {
          for (;;) {}
        }
      }
      
      public void removeQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
      {
        postToHandler(27, paramMediaDescriptionCompat);
      }
      
      public void removeQueueItemAt(int paramInt)
      {
        postToHandler(28, paramInt);
      }
      
      public void rewind()
        throws RemoteException
      {
        postToHandler(17);
      }
      
      public void seekTo(long paramLong)
        throws RemoteException
      {
        postToHandler(18, Long.valueOf(paramLong));
      }
      
      public void sendCommand(String paramString, Bundle paramBundle, MediaSessionCompat.ResultReceiverWrapper paramResultReceiverWrapper)
      {
        if (paramResultReceiverWrapper == null) {
          paramResultReceiverWrapper = null;
        } else {
          paramResultReceiverWrapper = mResultReceiver;
        }
        postToHandler(1, new MediaSessionCompat.MediaSessionImplBase.Command(paramString, paramBundle, paramResultReceiverWrapper));
      }
      
      public void sendCustomAction(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        postToHandler(20, paramString, paramBundle);
      }
      
      public boolean sendMediaButton(KeyEvent paramKeyEvent)
      {
        postToHandler(21, paramKeyEvent);
        return true;
      }
      
      public void setCaptioningEnabled(boolean paramBoolean)
        throws RemoteException
      {
        postToHandler(29, Boolean.valueOf(paramBoolean));
      }
      
      public void setPlaybackSpeed(float paramFloat)
        throws RemoteException
      {
        postToHandler(32, Float.valueOf(paramFloat));
      }
      
      public void setRepeatMode(int paramInt)
        throws RemoteException
      {
        postToHandler(23, paramInt);
      }
      
      public void setShuffleMode(int paramInt)
        throws RemoteException
      {
        postToHandler(30, paramInt);
      }
      
      public void setShuffleModeEnabledRemoved(boolean paramBoolean)
        throws RemoteException
      {}
      
      public void setVolumeTo(int paramInt1, int paramInt2, String paramString)
      {
        setVolumeTo(paramInt1, paramInt2);
      }
      
      public void skipToQueueItem(long paramLong)
      {
        postToHandler(11, Long.valueOf(paramLong));
      }
      
      public void stop()
        throws RemoteException
      {
        postToHandler(13);
      }
      
      public void unregisterCallbackListener(IMediaControllerCallback arg1)
      {
        mControllerCallbacks.unregister(???);
        int i = Binder.getCallingPid();
        int j = Binder.getCallingUid();
        synchronized (mLock)
        {
          MediaSessionCompat.RegistrationCallbackHandler localRegistrationCallbackHandler = mRegistrationCallbackHandler;
          if (localRegistrationCallbackHandler != null) {
            localRegistrationCallbackHandler.postCallbackUnregistered(i, j);
          }
          return;
        }
      }
    }
    
    public class MessageHandler
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
      
      public MessageHandler(Looper paramLooper)
      {
        super();
      }
      
      private void onMediaButtonEvent(KeyEvent paramKeyEvent, MediaSessionCompat.Callback paramCallback)
      {
        if ((paramKeyEvent != null) && (paramKeyEvent.getAction() == 0))
        {
          PlaybackStateCompat localPlaybackStateCompat = mState;
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
        MediaSessionCompat.Callback localCallback = mCallback;
        if (localCallback == null) {
          return;
        }
        Object localObject = paramMessage.getData();
        MediaSessionCompat.ensureClassLoader((Bundle)localObject);
        setCurrentControllerInfo(new MediaSessionManager.RemoteUserInfo(((BaseBundle)localObject).getString("data_calling_pkg"), ((BaseBundle)localObject).getInt("data_calling_pid"), ((BaseBundle)localObject).getInt("data_calling_uid")));
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
            localObject = mQueue;
            if (localObject != null)
            {
              int i = arg1;
              if ((i >= 0) && (i < ((List)localObject).size())) {
                paramMessage = (MediaSessionCompat.QueueItem)mQueue.get(arg1);
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
            setVolumeTo(arg1, 0);
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
            adjustVolume(arg1, 0);
            break;
          case 1: 
            paramMessage = (MediaSessionCompat.MediaSessionImplBase.Command)obj;
            localCallback.onCommand(command, extras, stub);
          }
          return;
        }
        finally
        {
          setCurrentControllerInfo(null);
        }
      }
    }
  }
  
  public static abstract interface OnActiveChangeListener
  {
    public abstract void onActiveChanged();
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static final class QueueItem
    implements Parcelable
  {
    public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator()
    {
      public MediaSessionCompat.QueueItem createFromParcel(Parcel paramAnonymousParcel)
      {
        return new MediaSessionCompat.QueueItem(paramAnonymousParcel);
      }
      
      public MediaSessionCompat.QueueItem[] newArray(int paramAnonymousInt)
      {
        return new MediaSessionCompat.QueueItem[paramAnonymousInt];
      }
    };
    public static final int UNKNOWN_ID = -1;
    private final MediaDescriptionCompat mDescription;
    private final long mId;
    private MediaSession.QueueItem mItemFwk;
    
    private QueueItem(MediaSession.QueueItem paramQueueItem, MediaDescriptionCompat paramMediaDescriptionCompat, long paramLong)
    {
      if (paramMediaDescriptionCompat != null)
      {
        if (paramLong != -1L)
        {
          mDescription = paramMediaDescriptionCompat;
          mId = paramLong;
          mItemFwk = paramQueueItem;
          return;
        }
        throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
      }
      throw new IllegalArgumentException("Description cannot be null");
    }
    
    public QueueItem(Parcel paramParcel)
    {
      mDescription = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
      mId = paramParcel.readLong();
    }
    
    public QueueItem(MediaDescriptionCompat paramMediaDescriptionCompat, long paramLong)
    {
      this(null, paramMediaDescriptionCompat, paramLong);
    }
    
    public static QueueItem fromQueueItem(Object paramObject)
    {
      if (paramObject != null)
      {
        paramObject = (MediaSession.QueueItem)paramObject;
        return new QueueItem((MediaSession.QueueItem)paramObject, MediaDescriptionCompat.fromMediaDescription(Api21Impl.getDescription((MediaSession.QueueItem)paramObject)), Api21Impl.getQueueId((MediaSession.QueueItem)paramObject));
      }
      return null;
    }
    
    public static List<QueueItem> fromQueueItemList(List<?> paramList)
    {
      if (paramList != null)
      {
        ArrayList localArrayList = new ArrayList(paramList.size());
        paramList = paramList.iterator();
        while (paramList.hasNext()) {
          localArrayList.add(fromQueueItem(paramList.next()));
        }
        return localArrayList;
      }
      return null;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public MediaDescriptionCompat getDescription()
    {
      return mDescription;
    }
    
    public long getQueueId()
    {
      return mId;
    }
    
    public Object getQueueItem()
    {
      MediaSession.QueueItem localQueueItem1 = mItemFwk;
      MediaSession.QueueItem localQueueItem2 = localQueueItem1;
      if (localQueueItem1 == null)
      {
        localQueueItem2 = Api21Impl.createQueueItem((MediaDescription)mDescription.getMediaDescription(), mId);
        mItemFwk = localQueueItem2;
      }
      return localQueueItem2;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("MediaSession.QueueItem {Description=");
      localStringBuilder.append(mDescription);
      localStringBuilder.append(", Id=");
      return z2.r(localStringBuilder, mId, " }");
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      mDescription.writeToParcel(paramParcel, paramInt);
      paramParcel.writeLong(mId);
    }
    
    @RequiresApi(21)
    public static class Api21Impl
    {
      @DoNotInline
      public static MediaSession.QueueItem createQueueItem(MediaDescription paramMediaDescription, long paramLong)
      {
        return new MediaSession.QueueItem(paramMediaDescription, paramLong);
      }
      
      @DoNotInline
      public static MediaDescription getDescription(MediaSession.QueueItem paramQueueItem)
      {
        return paramQueueItem.getDescription();
      }
      
      @DoNotInline
      public static long getQueueId(MediaSession.QueueItem paramQueueItem)
      {
        return paramQueueItem.getQueueId();
      }
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static abstract interface RegistrationCallback
  {
    public abstract void onCallbackRegistered(int paramInt1, int paramInt2);
    
    public abstract void onCallbackUnregistered(int paramInt1, int paramInt2);
  }
  
  public static final class RegistrationCallbackHandler
    extends Handler
  {
    private static final int MSG_CALLBACK_REGISTERED = 1001;
    private static final int MSG_CALLBACK_UNREGISTERED = 1002;
    private final MediaSessionCompat.RegistrationCallback mCallback;
    
    public RegistrationCallbackHandler(@NonNull Looper paramLooper, @NonNull MediaSessionCompat.RegistrationCallback paramRegistrationCallback)
    {
      super();
      mCallback = paramRegistrationCallback;
    }
    
    public void handleMessage(@NonNull Message paramMessage)
    {
      super.handleMessage(paramMessage);
      int i = what;
      if (i != 1001)
      {
        if (i == 1002) {
          mCallback.onCallbackUnregistered(arg1, arg2);
        }
      }
      else {
        mCallback.onCallbackRegistered(arg1, arg2);
      }
    }
    
    public void postCallbackRegistered(int paramInt1, int paramInt2)
    {
      obtainMessage(1001, paramInt1, paramInt2).sendToTarget();
    }
    
    public void postCallbackUnregistered(int paramInt1, int paramInt2)
    {
      obtainMessage(1002, paramInt1, paramInt2).sendToTarget();
    }
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static final class ResultReceiverWrapper
    implements Parcelable
  {
    public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator()
    {
      public MediaSessionCompat.ResultReceiverWrapper createFromParcel(Parcel paramAnonymousParcel)
      {
        return new MediaSessionCompat.ResultReceiverWrapper(paramAnonymousParcel);
      }
      
      public MediaSessionCompat.ResultReceiverWrapper[] newArray(int paramAnonymousInt)
      {
        return new MediaSessionCompat.ResultReceiverWrapper[paramAnonymousInt];
      }
    };
    public ResultReceiver mResultReceiver;
    
    public ResultReceiverWrapper(Parcel paramParcel)
    {
      mResultReceiver = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
    }
    
    public ResultReceiverWrapper(@NonNull ResultReceiver paramResultReceiver)
    {
      mResultReceiver = paramResultReceiver;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      mResultReceiver.writeToParcel(paramParcel, paramInt);
    }
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static final class Token
    implements Parcelable
  {
    public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator()
    {
      public MediaSessionCompat.Token createFromParcel(Parcel paramAnonymousParcel)
      {
        return new MediaSessionCompat.Token(paramAnonymousParcel.readParcelable(null));
      }
      
      public MediaSessionCompat.Token[] newArray(int paramAnonymousInt)
      {
        return new MediaSessionCompat.Token[paramAnonymousInt];
      }
    };
    @GuardedBy("mLock")
    private IMediaSession mExtraBinder;
    private final Object mInner;
    private final Object mLock = new Object();
    @GuardedBy("mLock")
    private VersionedParcelable mSession2Token;
    
    public Token(Object paramObject)
    {
      this(paramObject, null, null);
    }
    
    public Token(Object paramObject, IMediaSession paramIMediaSession)
    {
      this(paramObject, paramIMediaSession, null);
    }
    
    public Token(Object paramObject, IMediaSession paramIMediaSession, VersionedParcelable paramVersionedParcelable)
    {
      mInner = paramObject;
      mExtraBinder = paramIMediaSession;
      mSession2Token = paramVersionedParcelable;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Token fromBundle(Bundle paramBundle)
    {
      Object localObject = null;
      if (paramBundle == null) {
        return null;
      }
      paramBundle.setClassLoader(Token.class.getClassLoader());
      IMediaSession localIMediaSession = IMediaSession.Stub.asInterface(BundleCompat.getBinder(paramBundle, "android.support.v4.media.session.EXTRA_BINDER"));
      VersionedParcelable localVersionedParcelable = ParcelUtils.getVersionedParcelable(paramBundle, "android.support.v4.media.session.SESSION_TOKEN2");
      paramBundle = (Token)paramBundle.getParcelable("android.support.v4.media.session.TOKEN");
      if (paramBundle == null) {
        paramBundle = (Bundle)localObject;
      } else {
        paramBundle = new Token(mInner, localIMediaSession, localVersionedParcelable);
      }
      return paramBundle;
    }
    
    public static Token fromToken(Object paramObject)
    {
      return fromToken(paramObject, null);
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static Token fromToken(Object paramObject, IMediaSession paramIMediaSession)
    {
      if (paramObject != null)
      {
        if ((paramObject instanceof MediaSession.Token)) {
          return new Token(paramObject, paramIMediaSession);
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
      }
      return null;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof Token)) {
        return false;
      }
      Object localObject = (Token)paramObject;
      paramObject = mInner;
      if (paramObject == null)
      {
        if (mInner != null) {
          bool = false;
        }
        return bool;
      }
      localObject = mInner;
      if (localObject == null) {
        return false;
      }
      return paramObject.equals(localObject);
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public IMediaSession getExtraBinder()
    {
      synchronized (mLock)
      {
        IMediaSession localIMediaSession = mExtraBinder;
        return localIMediaSession;
      }
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public VersionedParcelable getSession2Token()
    {
      synchronized (mLock)
      {
        VersionedParcelable localVersionedParcelable = mSession2Token;
        return localVersionedParcelable;
      }
    }
    
    public Object getToken()
    {
      return mInner;
    }
    
    public int hashCode()
    {
      Object localObject = mInner;
      if (localObject == null) {
        return 0;
      }
      return localObject.hashCode();
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void setExtraBinder(IMediaSession paramIMediaSession)
    {
      synchronized (mLock)
      {
        mExtraBinder = paramIMediaSession;
        return;
      }
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSession2Token(VersionedParcelable paramVersionedParcelable)
    {
      synchronized (mLock)
      {
        mSession2Token = paramVersionedParcelable;
        return;
      }
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Bundle toBundle()
    {
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("android.support.v4.media.session.TOKEN", this);
      synchronized (mLock)
      {
        Object localObject3 = mExtraBinder;
        if (localObject3 != null) {
          BundleCompat.putBinder(localBundle, "android.support.v4.media.session.EXTRA_BINDER", ((IInterface)localObject3).asBinder());
        }
        localObject3 = mSession2Token;
        if (localObject3 != null) {
          ParcelUtils.putVersionedParcelable(localBundle, "android.support.v4.media.session.SESSION_TOKEN2", (VersionedParcelable)localObject3);
        }
        return localBundle;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeParcelable((Parcelable)mInner, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */