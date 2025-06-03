package com.google.android.exoplayer2.audio;

final class MediaCodecAudioRenderer$AudioSinkListener
  implements AudioSink.Listener
{
  private MediaCodecAudioRenderer$AudioSinkListener(MediaCodecAudioRenderer paramMediaCodecAudioRenderer) {}
  
  public void onAudioSessionId(int paramInt)
  {
    MediaCodecAudioRenderer.access$100(this$0).audioSessionId(paramInt);
    this$0.onAudioSessionId(paramInt);
  }
  
  public void onPositionDiscontinuity()
  {
    this$0.onAudioTrackPositionDiscontinuity();
    MediaCodecAudioRenderer.access$202(this$0, true);
  }
  
  public void onUnderrun(int paramInt, long paramLong1, long paramLong2)
  {
    MediaCodecAudioRenderer.access$100(this$0).audioTrackUnderrun(paramInt, paramLong1, paramLong2);
    this$0.onAudioTrackUnderrun(paramInt, paramLong1, paramLong2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.MediaCodecAudioRenderer.AudioSinkListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */