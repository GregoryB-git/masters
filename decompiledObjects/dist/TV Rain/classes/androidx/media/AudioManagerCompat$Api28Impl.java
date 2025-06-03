package androidx.media;

import android.media.AudioManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import c;

@RequiresApi(28)
class AudioManagerCompat$Api28Impl
{
  @DoNotInline
  public static int getStreamMinVolume(AudioManager paramAudioManager, int paramInt)
  {
    return c.c(paramAudioManager, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioManagerCompat.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */