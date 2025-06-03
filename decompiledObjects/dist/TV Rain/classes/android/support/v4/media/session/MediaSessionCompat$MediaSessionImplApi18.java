package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.media.RemoteControlClient.OnPlaybackPositionUpdateListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.versionedparcelable.VersionedParcelable;

@RequiresApi(18)
class MediaSessionCompat$MediaSessionImplApi18
  extends MediaSessionCompat.MediaSessionImplBase
{
  private static boolean sIsMbrPendingIntentSupported = true;
  
  public MediaSessionCompat$MediaSessionImplApi18(Context paramContext, String paramString, ComponentName paramComponentName, PendingIntent paramPendingIntent, VersionedParcelable paramVersionedParcelable, Bundle paramBundle)
  {
    super(paramContext, paramString, paramComponentName, paramPendingIntent, paramVersionedParcelable, paramBundle);
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

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */