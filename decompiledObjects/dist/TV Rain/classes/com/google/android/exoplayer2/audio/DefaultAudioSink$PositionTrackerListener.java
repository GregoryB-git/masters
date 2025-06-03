package com.google.android.exoplayer2.audio;

import android.os.SystemClock;
import com.google.android.exoplayer2.util.Log;

final class DefaultAudioSink$PositionTrackerListener
  implements AudioTrackPositionTracker.Listener
{
  private DefaultAudioSink$PositionTrackerListener(DefaultAudioSink paramDefaultAudioSink) {}
  
  public void onInvalidLatency(long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Ignoring impossibly large audio latency: ");
    localStringBuilder.append(paramLong);
    Log.w("AudioTrack", localStringBuilder.toString());
  }
  
  public void onPositionFramesMismatch(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Spurious audio timestamp (frame position mismatch): ");
    ((StringBuilder)localObject).append(paramLong1);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(paramLong2);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(paramLong3);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(paramLong4);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(DefaultAudioSink.access$600(this$0));
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(DefaultAudioSink.access$700(this$0));
    localObject = ((StringBuilder)localObject).toString();
    if (!DefaultAudioSink.failOnSpuriousAudioTimestamp)
    {
      Log.w("AudioTrack", (String)localObject);
      return;
    }
    throw new DefaultAudioSink.InvalidAudioTrackTimestampException((String)localObject, null);
  }
  
  public void onSystemTimeUsMismatch(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Spurious audio timestamp (system clock mismatch): ");
    ((StringBuilder)localObject).append(paramLong1);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(paramLong2);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(paramLong3);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(paramLong4);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(DefaultAudioSink.access$600(this$0));
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(DefaultAudioSink.access$700(this$0));
    localObject = ((StringBuilder)localObject).toString();
    if (!DefaultAudioSink.failOnSpuriousAudioTimestamp)
    {
      Log.w("AudioTrack", (String)localObject);
      return;
    }
    throw new DefaultAudioSink.InvalidAudioTrackTimestampException((String)localObject, null);
  }
  
  public void onUnderrun(int paramInt, long paramLong)
  {
    if (DefaultAudioSink.access$900(this$0) != null)
    {
      long l1 = SystemClock.elapsedRealtime();
      long l2 = DefaultAudioSink.access$1000(this$0);
      DefaultAudioSink.access$900(this$0).onUnderrun(paramInt, paramLong, l1 - l2);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.DefaultAudioSink.PositionTrackerListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */