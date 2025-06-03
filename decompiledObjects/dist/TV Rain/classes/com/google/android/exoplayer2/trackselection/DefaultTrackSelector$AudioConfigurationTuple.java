package com.google.android.exoplayer2.trackselection;

import android.text.TextUtils;
import androidx.annotation.Nullable;

final class DefaultTrackSelector$AudioConfigurationTuple
{
  public final int channelCount;
  @Nullable
  public final String mimeType;
  public final int sampleRate;
  
  public DefaultTrackSelector$AudioConfigurationTuple(int paramInt1, int paramInt2, @Nullable String paramString)
  {
    channelCount = paramInt1;
    sampleRate = paramInt2;
    mimeType = paramString;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (AudioConfigurationTuple.class == paramObject.getClass()))
    {
      paramObject = (AudioConfigurationTuple)paramObject;
      if ((channelCount != channelCount) || (sampleRate != sampleRate) || (!TextUtils.equals(mimeType, mimeType))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = channelCount;
    int j = sampleRate;
    String str = mimeType;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    return (i * 31 + j) * 31 + k;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioConfigurationTuple
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */