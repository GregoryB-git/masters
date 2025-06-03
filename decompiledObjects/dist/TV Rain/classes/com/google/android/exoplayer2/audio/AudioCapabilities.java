package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import java.util.Arrays;
import z2;

@TargetApi(21)
public final class AudioCapabilities
{
  public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(new int[] { 2 }, 2);
  private final int maxChannelCount;
  private final int[] supportedEncodings;
  
  public AudioCapabilities(@Nullable int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt != null)
    {
      paramArrayOfInt = Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length);
      supportedEncodings = paramArrayOfInt;
      Arrays.sort(paramArrayOfInt);
    }
    else
    {
      supportedEncodings = new int[0];
    }
    maxChannelCount = paramInt;
  }
  
  public static AudioCapabilities getCapabilities(Context paramContext)
  {
    return getCapabilities(paramContext.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
  }
  
  @SuppressLint({"InlinedApi"})
  public static AudioCapabilities getCapabilities(@Nullable Intent paramIntent)
  {
    if ((paramIntent != null) && (paramIntent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0)) {
      return new AudioCapabilities(paramIntent.getIntArrayExtra("android.media.extra.ENCODINGS"), paramIntent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
    }
    return DEFAULT_AUDIO_CAPABILITIES;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof AudioCapabilities)) {
      return false;
    }
    paramObject = (AudioCapabilities)paramObject;
    if ((!Arrays.equals(supportedEncodings, supportedEncodings)) || (maxChannelCount != maxChannelCount)) {
      bool = false;
    }
    return bool;
  }
  
  public int getMaxChannelCount()
  {
    return maxChannelCount;
  }
  
  public int hashCode()
  {
    int i = maxChannelCount;
    return Arrays.hashCode(supportedEncodings) * 31 + i;
  }
  
  public boolean supportsEncoding(int paramInt)
  {
    boolean bool;
    if (Arrays.binarySearch(supportedEncodings, paramInt) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("AudioCapabilities[maxChannelCount=");
    localStringBuilder.append(maxChannelCount);
    localStringBuilder.append(", supportedEncodings=");
    localStringBuilder.append(Arrays.toString(supportedEncodings));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioCapabilities
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */