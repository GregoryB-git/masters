package androidx.media;

import android.media.AudioManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class AudioManagerCompat$Api21Impl
{
  @DoNotInline
  public static boolean isVolumeFixed(AudioManager paramAudioManager)
  {
    return paramAudioManager.isVolumeFixed();
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioManagerCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */