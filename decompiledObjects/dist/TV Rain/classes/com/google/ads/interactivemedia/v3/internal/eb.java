package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
final class eb
{
  private final AudioTrack a;
  private final AudioTimestamp b;
  private long c;
  private long d;
  private long e;
  
  public eb(AudioTrack paramAudioTrack)
  {
    a = paramAudioTrack;
    b = new AudioTimestamp();
  }
  
  public final boolean a()
  {
    boolean bool = a.getTimestamp(b);
    if (bool)
    {
      long l = b.framePosition;
      if (d > l) {
        c += 1L;
      }
      d = l;
      e = (l + (c << 32));
    }
    return bool;
  }
  
  public final long b()
  {
    return b.nanoTime / 1000L;
  }
  
  public final long c()
  {
    return e;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.eb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */