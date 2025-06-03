package com.google.android.exoplayer2.audio;

final class SimpleDecoderAudioRenderer$AudioSinkListener
  implements AudioSink.Listener
{
  private SimpleDecoderAudioRenderer$AudioSinkListener(SimpleDecoderAudioRenderer paramSimpleDecoderAudioRenderer) {}
  
  public void onAudioSessionId(int paramInt)
  {
    SimpleDecoderAudioRenderer.access$100(this$0).audioSessionId(paramInt);
    this$0.onAudioSessionId(paramInt);
  }
  
  public void onPositionDiscontinuity()
  {
    this$0.onAudioTrackPositionDiscontinuity();
    SimpleDecoderAudioRenderer.access$202(this$0, true);
  }
  
  public void onUnderrun(int paramInt, long paramLong1, long paramLong2)
  {
    SimpleDecoderAudioRenderer.access$100(this$0).audioTrackUnderrun(paramInt, paramLong1, paramLong2);
    this$0.onAudioTrackUnderrun(paramInt, paramLong1, paramLong2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.SimpleDecoderAudioRenderer.AudioSinkListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */