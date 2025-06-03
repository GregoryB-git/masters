package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

public class IMediaControllerCallback$Default
  implements IMediaControllerCallback
{
  public IBinder asBinder()
  {
    return null;
  }
  
  public void onCaptioningEnabledChanged(boolean paramBoolean)
    throws RemoteException
  {}
  
  public void onEvent(String paramString, Bundle paramBundle)
    throws RemoteException
  {}
  
  public void onExtrasChanged(Bundle paramBundle)
    throws RemoteException
  {}
  
  public void onMetadataChanged(MediaMetadataCompat paramMediaMetadataCompat)
    throws RemoteException
  {}
  
  public void onPlaybackStateChanged(PlaybackStateCompat paramPlaybackStateCompat)
    throws RemoteException
  {}
  
  public void onQueueChanged(List<MediaSessionCompat.QueueItem> paramList)
    throws RemoteException
  {}
  
  public void onQueueTitleChanged(CharSequence paramCharSequence)
    throws RemoteException
  {}
  
  public void onRepeatModeChanged(int paramInt)
    throws RemoteException
  {}
  
  public void onSessionDestroyed()
    throws RemoteException
  {}
  
  public void onSessionReady()
    throws RemoteException
  {}
  
  public void onShuffleModeChanged(int paramInt)
    throws RemoteException
  {}
  
  public void onShuffleModeChangedRemoved(boolean paramBoolean)
    throws RemoteException
  {}
  
  public void onVolumeInfoChanged(ParcelableVolumeInfo paramParcelableVolumeInfo)
    throws RemoteException
  {}
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.IMediaControllerCallback.Default
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */