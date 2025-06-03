package androidx.media;

import android.media.VolumeProvider;

class VolumeProviderCompat$1
  extends VolumeProvider
{
  public VolumeProviderCompat$1(VolumeProviderCompat paramVolumeProviderCompat, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    super(paramInt1, paramInt2, paramInt3, paramString);
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
 * Qualified Name:     androidx.media.VolumeProviderCompat.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */