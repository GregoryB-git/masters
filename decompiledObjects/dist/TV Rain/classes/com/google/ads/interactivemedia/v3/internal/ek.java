package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;
import android.os.ConditionVariable;

final class ek
  extends Thread
{
  public ek(eh parameh, AudioTrack paramAudioTrack) {}
  
  public final void run()
  {
    try
    {
      a.flush();
      a.release();
      return;
    }
    finally
    {
      eh.a(b).open();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ek
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */