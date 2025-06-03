package com.google.android.exoplayer2;

import androidx.annotation.Nullable;

public final class RendererConfiguration
{
  public static final RendererConfiguration DEFAULT = new RendererConfiguration(0);
  public final int tunnelingAudioSessionId;
  
  public RendererConfiguration(int paramInt)
  {
    tunnelingAudioSessionId = paramInt;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (RendererConfiguration.class == paramObject.getClass()))
    {
      paramObject = (RendererConfiguration)paramObject;
      if (tunnelingAudioSessionId != tunnelingAudioSessionId) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return tunnelingAudioSessionId;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.RendererConfiguration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */