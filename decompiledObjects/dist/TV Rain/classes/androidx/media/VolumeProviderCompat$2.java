package androidx.media;

import android.media.VolumeProvider;

class VolumeProviderCompat$2
  extends VolumeProvider
{
  public VolumeProviderCompat$2(VolumeProviderCompat paramVolumeProviderCompat, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramInt2, paramInt3);
  }
  
  public void onAdjustVolume(int paramInt)
  {
    this$0.onAdjustVolume(paramInt);
  }
  
  public void onSetVolumeTo(int paramInt)
  {
    this$0.onSetVolumeTo(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.media.VolumeProviderCompat.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */