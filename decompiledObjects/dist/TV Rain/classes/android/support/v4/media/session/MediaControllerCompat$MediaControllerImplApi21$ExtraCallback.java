package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback
  extends MediaControllerCompat.Callback.StubCompat
{
  public MediaControllerCompat$MediaControllerImplApi21$ExtraCallback(MediaControllerCompat.Callback paramCallback)
  {
    super(paramCallback);
  }
  
  public void onExtrasChanged(Bundle paramBundle)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void onMetadataChanged(MediaMetadataCompat paramMediaMetadataCompat)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void onQueueChanged(List<MediaSessionCompat.QueueItem> paramList)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void onQueueTitleChanged(CharSequence paramCharSequence)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void onSessionDestroyed()
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void onVolumeInfoChanged(ParcelableVolumeInfo paramParcelableVolumeInfo)
    throws RemoteException
  {
    throw new AssertionError();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.ExtraCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */