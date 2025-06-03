package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import b;
import c;

public final class AudioManagerCompat
{
  public static final int AUDIOFOCUS_GAIN = 1;
  public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
  public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
  public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
  private static final String TAG = "AudioManCompat";
  
  public static int abandonAudioFocusRequest(@NonNull AudioManager paramAudioManager, @NonNull AudioFocusRequestCompat paramAudioFocusRequestCompat)
  {
    if (paramAudioManager != null)
    {
      if (paramAudioFocusRequestCompat != null)
      {
        if (Build.VERSION.SDK_INT >= 26) {
          return Api26Impl.abandonAudioFocusRequest(paramAudioManager, paramAudioFocusRequestCompat.getAudioFocusRequest());
        }
        return paramAudioManager.abandonAudioFocus(paramAudioFocusRequestCompat.getOnAudioFocusChangeListener());
      }
      throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }
    throw new IllegalArgumentException("AudioManager must not be null");
  }
  
  @IntRange(from=0L)
  public static int getStreamMaxVolume(@NonNull AudioManager paramAudioManager, int paramInt)
  {
    return paramAudioManager.getStreamMaxVolume(paramInt);
  }
  
  @IntRange(from=0L)
  public static int getStreamMinVolume(@NonNull AudioManager paramAudioManager, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getStreamMinVolume(paramAudioManager, paramInt);
    }
    return 0;
  }
  
  public static boolean isVolumeFixed(@NonNull AudioManager paramAudioManager)
  {
    return Api21Impl.isVolumeFixed(paramAudioManager);
  }
  
  public static int requestAudioFocus(@NonNull AudioManager paramAudioManager, @NonNull AudioFocusRequestCompat paramAudioFocusRequestCompat)
  {
    if (paramAudioManager != null)
    {
      if (paramAudioFocusRequestCompat != null)
      {
        if (Build.VERSION.SDK_INT >= 26) {
          return Api26Impl.requestAudioFocus(paramAudioManager, paramAudioFocusRequestCompat.getAudioFocusRequest());
        }
        return paramAudioManager.requestAudioFocus(paramAudioFocusRequestCompat.getOnAudioFocusChangeListener(), paramAudioFocusRequestCompat.getAudioAttributesCompat().getLegacyStreamType(), paramAudioFocusRequestCompat.getFocusGain());
      }
      throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }
    throw new IllegalArgumentException("AudioManager must not be null");
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static boolean isVolumeFixed(AudioManager paramAudioManager)
    {
      return paramAudioManager.isVolumeFixed();
    }
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static int abandonAudioFocusRequest(AudioManager paramAudioManager, AudioFocusRequest paramAudioFocusRequest)
    {
      return b.z(paramAudioManager, paramAudioFocusRequest);
    }
    
    @DoNotInline
    public static int requestAudioFocus(AudioManager paramAudioManager, AudioFocusRequest paramAudioFocusRequest)
    {
      return b.f(paramAudioManager, paramAudioFocusRequest);
    }
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static int getStreamMinVolume(AudioManager paramAudioManager, int paramInt)
    {
      return c.c(paramAudioManager, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioManagerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */