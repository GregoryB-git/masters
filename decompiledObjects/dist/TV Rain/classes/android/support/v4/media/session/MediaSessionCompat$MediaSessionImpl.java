package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media.MediaSessionManager.RemoteUserInfo;
import androidx.media.VolumeProviderCompat;
import java.util.List;

abstract interface MediaSessionCompat$MediaSessionImpl
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

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */