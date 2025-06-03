package android.support.v4.media.session;

import androidx.media.VolumeProviderCompat;
import androidx.media.VolumeProviderCompat.Callback;

class MediaSessionCompat$MediaSessionImplBase$1
  extends VolumeProviderCompat.Callback
{
  public MediaSessionCompat$MediaSessionImplBase$1(MediaSessionCompat.MediaSessionImplBase paramMediaSessionImplBase) {}
  
  public void onVolumeChanged(VolumeProviderCompat paramVolumeProviderCompat)
  {
    if (this$0.mVolumeProvider != paramVolumeProviderCompat) {
      return;
    }
    MediaSessionCompat.MediaSessionImplBase localMediaSessionImplBase = this$0;
    paramVolumeProviderCompat = new ParcelableVolumeInfo(mVolumeType, mLocalStream, paramVolumeProviderCompat.getVolumeControl(), paramVolumeProviderCompat.getMaxVolume(), paramVolumeProviderCompat.getCurrentVolume());
    this$0.sendVolumeInfoChanged(paramVolumeProviderCompat);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */