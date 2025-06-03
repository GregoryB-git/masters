package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import java.util.List;

public class IMediaSession$Default
  implements IMediaSession
{
  public void addQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
    throws RemoteException
  {}
  
  public void addQueueItemAt(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
    throws RemoteException
  {}
  
  public void adjustVolume(int paramInt1, int paramInt2, String paramString)
    throws RemoteException
  {}
  
  public IBinder asBinder()
  {
    return null;
  }
  
  public void fastForward()
    throws RemoteException
  {}
  
  public Bundle getExtras()
    throws RemoteException
  {
    return null;
  }
  
  public long getFlags()
    throws RemoteException
  {
    return 0L;
  }
  
  public PendingIntent getLaunchPendingIntent()
    throws RemoteException
  {
    return null;
  }
  
  public MediaMetadataCompat getMetadata()
    throws RemoteException
  {
    return null;
  }
  
  public String getPackageName()
    throws RemoteException
  {
    return null;
  }
  
  public PlaybackStateCompat getPlaybackState()
    throws RemoteException
  {
    return null;
  }
  
  public List<MediaSessionCompat.QueueItem> getQueue()
    throws RemoteException
  {
    return null;
  }
  
  public CharSequence getQueueTitle()
    throws RemoteException
  {
    return null;
  }
  
  public int getRatingType()
    throws RemoteException
  {
    return 0;
  }
  
  public int getRepeatMode()
    throws RemoteException
  {
    return 0;
  }
  
  public Bundle getSessionInfo()
    throws RemoteException
  {
    return null;
  }
  
  public int getShuffleMode()
    throws RemoteException
  {
    return 0;
  }
  
  public String getTag()
    throws RemoteException
  {
    return null;
  }
  
  public ParcelableVolumeInfo getVolumeAttributes()
    throws RemoteException
  {
    return null;
  }
  
  public boolean isCaptioningEnabled()
    throws RemoteException
  {
    return false;
  }
  
  public boolean isShuffleModeEnabledRemoved()
    throws RemoteException
  {
    return false;
  }
  
  public boolean isTransportControlEnabled()
    throws RemoteException
  {
    return false;
  }
  
  public void next()
    throws RemoteException
  {}
  
  public void pause()
    throws RemoteException
  {}
  
  public void play()
    throws RemoteException
  {}
  
  public void playFromMediaId(String paramString, Bundle paramBundle)
    throws RemoteException
  {}
  
  public void playFromSearch(String paramString, Bundle paramBundle)
    throws RemoteException
  {}
  
  public void playFromUri(Uri paramUri, Bundle paramBundle)
    throws RemoteException
  {}
  
  public void prepare()
    throws RemoteException
  {}
  
  public void prepareFromMediaId(String paramString, Bundle paramBundle)
    throws RemoteException
  {}
  
  public void prepareFromSearch(String paramString, Bundle paramBundle)
    throws RemoteException
  {}
  
  public void prepareFromUri(Uri paramUri, Bundle paramBundle)
    throws RemoteException
  {}
  
  public void previous()
    throws RemoteException
  {}
  
  public void rate(RatingCompat paramRatingCompat)
    throws RemoteException
  {}
  
  public void rateWithExtras(RatingCompat paramRatingCompat, Bundle paramBundle)
    throws RemoteException
  {}
  
  public void registerCallbackListener(IMediaControllerCallback paramIMediaControllerCallback)
    throws RemoteException
  {}
  
  public void removeQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
    throws RemoteException
  {}
  
  public void removeQueueItemAt(int paramInt)
    throws RemoteException
  {}
  
  public void rewind()
    throws RemoteException
  {}
  
  public void seekTo(long paramLong)
    throws RemoteException
  {}
  
  public void sendCommand(String paramString, Bundle paramBundle, MediaSessionCompat.ResultReceiverWrapper paramResultReceiverWrapper)
    throws RemoteException
  {}
  
  public void sendCustomAction(String paramString, Bundle paramBundle)
    throws RemoteException
  {}
  
  public boolean sendMediaButton(KeyEvent paramKeyEvent)
    throws RemoteException
  {
    return false;
  }
  
  public void setCaptioningEnabled(boolean paramBoolean)
    throws RemoteException
  {}
  
  public void setPlaybackSpeed(float paramFloat)
    throws RemoteException
  {}
  
  public void setRepeatMode(int paramInt)
    throws RemoteException
  {}
  
  public void setShuffleMode(int paramInt)
    throws RemoteException
  {}
  
  public void setShuffleModeEnabledRemoved(boolean paramBoolean)
    throws RemoteException
  {}
  
  public void setVolumeTo(int paramInt1, int paramInt2, String paramString)
    throws RemoteException
  {}
  
  public void skipToQueueItem(long paramLong)
    throws RemoteException
  {}
  
  public void stop()
    throws RemoteException
  {}
  
  public void unregisterCallbackListener(IMediaControllerCallback paramIMediaControllerCallback)
    throws RemoteException
  {}
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.IMediaSession.Default
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */