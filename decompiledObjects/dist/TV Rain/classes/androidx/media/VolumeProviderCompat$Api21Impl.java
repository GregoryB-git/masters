package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class VolumeProviderCompat$Api21Impl
{
  @DoNotInline
  public static void setCurrentVolume(VolumeProvider paramVolumeProvider, int paramInt)
  {
    paramVolumeProvider.setCurrentVolume(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.media.VolumeProviderCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */