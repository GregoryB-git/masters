package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.ConditionVariable;

class DefaultAudioSink$1
  extends Thread
{
  public DefaultAudioSink$1(DefaultAudioSink paramDefaultAudioSink, AudioTrack paramAudioTrack) {}
  
  public void run()
  {
    try
    {
      val$toRelease.flush();
      val$toRelease.release();
      return;
    }
    finally
    {
      DefaultAudioSink.access$300(this$0).open();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.DefaultAudioSink.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */