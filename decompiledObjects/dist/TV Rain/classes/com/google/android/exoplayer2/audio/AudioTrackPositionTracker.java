package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.reflect.Method;

final class AudioTrackPositionTracker
{
  private static final long FORCE_RESET_WORKAROUND_TIMEOUT_MS = 200L;
  private static final long MAX_AUDIO_TIMESTAMP_OFFSET_US = 5000000L;
  private static final long MAX_LATENCY_US = 5000000L;
  private static final int MAX_PLAYHEAD_OFFSET_COUNT = 10;
  private static final int MIN_LATENCY_SAMPLE_INTERVAL_US = 500000;
  private static final int MIN_PLAYHEAD_OFFSET_SAMPLE_INTERVAL_US = 30000;
  private static final int PLAYSTATE_PAUSED = 2;
  private static final int PLAYSTATE_PLAYING = 3;
  private static final int PLAYSTATE_STOPPED = 1;
  @Nullable
  private AudioTimestampPoller audioTimestampPoller;
  @Nullable
  private AudioTrack audioTrack;
  private int bufferSize;
  private long bufferSizeUs;
  private long endPlaybackHeadPosition;
  private long forceResetWorkaroundTimeMs;
  @Nullable
  private Method getLatencyMethod;
  private boolean hasData;
  private boolean isOutputPcm;
  private long lastLatencySampleTimeUs;
  private long lastPlayheadSampleTimeUs;
  private long lastRawPlaybackHeadPosition;
  private long latencyUs;
  private final Listener listener;
  private boolean needsPassthroughWorkarounds;
  private int nextPlayheadOffsetIndex;
  private int outputPcmFrameSize;
  private int outputSampleRate;
  private long passthroughWorkaroundPauseOffset;
  private int playheadOffsetCount;
  private final long[] playheadOffsets;
  private long rawPlaybackHeadWrapCount;
  private long smoothedPlayheadOffsetUs;
  private long stopPlaybackHeadPosition;
  private long stopTimestampUs;
  
  public AudioTrackPositionTracker(Listener paramListener)
  {
    listener = ((Listener)Assertions.checkNotNull(paramListener));
    if (Util.SDK_INT >= 18) {}
    try
    {
      getLatencyMethod = AudioTrack.class.getMethod("getLatency", null);
      playheadOffsets = new long[10];
      return;
    }
    catch (NoSuchMethodException paramListener)
    {
      for (;;) {}
    }
  }
  
  private boolean forceHasPendingData()
  {
    boolean bool;
    if ((needsPassthroughWorkarounds) && (((AudioTrack)Assertions.checkNotNull(audioTrack)).getPlayState() == 2) && (getPlaybackHeadPosition() == 0L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private long framesToDurationUs(long paramLong)
  {
    return paramLong * 1000000L / outputSampleRate;
  }
  
  private long getPlaybackHeadPosition()
  {
    AudioTrack localAudioTrack = (AudioTrack)Assertions.checkNotNull(audioTrack);
    if (stopTimestampUs != -9223372036854775807L)
    {
      l1 = (SystemClock.elapsedRealtime() * 1000L - stopTimestampUs) * outputSampleRate / 1000000L;
      return Math.min(endPlaybackHeadPosition, stopPlaybackHeadPosition + l1);
    }
    int i = localAudioTrack.getPlayState();
    if (i == 1) {
      return 0L;
    }
    long l2 = 0xFFFFFFFF & localAudioTrack.getPlaybackHeadPosition();
    long l1 = l2;
    if (needsPassthroughWorkarounds)
    {
      if ((i == 2) && (l2 == 0L)) {
        passthroughWorkaroundPauseOffset = lastRawPlaybackHeadPosition;
      }
      l1 = l2 + passthroughWorkaroundPauseOffset;
    }
    if (Util.SDK_INT <= 28)
    {
      if ((l1 == 0L) && (lastRawPlaybackHeadPosition > 0L) && (i == 3))
      {
        if (forceResetWorkaroundTimeMs == -9223372036854775807L) {
          forceResetWorkaroundTimeMs = SystemClock.elapsedRealtime();
        }
        return lastRawPlaybackHeadPosition;
      }
      forceResetWorkaroundTimeMs = -9223372036854775807L;
    }
    if (lastRawPlaybackHeadPosition > l1) {
      rawPlaybackHeadWrapCount += 1L;
    }
    lastRawPlaybackHeadPosition = l1;
    return l1 + (rawPlaybackHeadWrapCount << 32);
  }
  
  private long getPlaybackHeadPositionUs()
  {
    return framesToDurationUs(getPlaybackHeadPosition());
  }
  
  private void maybePollAndCheckTimestamp(long paramLong1, long paramLong2)
  {
    AudioTimestampPoller localAudioTimestampPoller = (AudioTimestampPoller)Assertions.checkNotNull(audioTimestampPoller);
    if (!localAudioTimestampPoller.maybePollTimestamp(paramLong1)) {
      return;
    }
    long l1 = localAudioTimestampPoller.getTimestampSystemTimeUs();
    long l2 = localAudioTimestampPoller.getTimestampPositionFrames();
    if (Math.abs(l1 - paramLong1) > 5000000L)
    {
      listener.onSystemTimeUsMismatch(l2, l1, paramLong1, paramLong2);
      localAudioTimestampPoller.rejectTimestamp();
    }
    else if (Math.abs(framesToDurationUs(l2) - paramLong2) > 5000000L)
    {
      listener.onPositionFramesMismatch(l2, l1, paramLong1, paramLong2);
      localAudioTimestampPoller.rejectTimestamp();
    }
    else
    {
      localAudioTimestampPoller.acceptTimestamp();
    }
  }
  
  private void maybeSampleSyncParams()
  {
    long l1 = getPlaybackHeadPositionUs();
    if (l1 == 0L) {
      return;
    }
    long l2 = System.nanoTime() / 1000L;
    if (l2 - lastPlayheadSampleTimeUs >= 30000L)
    {
      long[] arrayOfLong = playheadOffsets;
      int i = nextPlayheadOffsetIndex;
      arrayOfLong[i] = (l1 - l2);
      nextPlayheadOffsetIndex = ((i + 1) % 10);
      i = playheadOffsetCount;
      if (i < 10) {
        playheadOffsetCount = (i + 1);
      }
      lastPlayheadSampleTimeUs = l2;
      smoothedPlayheadOffsetUs = 0L;
      for (i = 0;; i++)
      {
        int j = playheadOffsetCount;
        if (i >= j) {
          break;
        }
        long l3 = smoothedPlayheadOffsetUs;
        smoothedPlayheadOffsetUs = (playheadOffsets[i] / j + l3);
      }
    }
    if (needsPassthroughWorkarounds) {
      return;
    }
    maybePollAndCheckTimestamp(l2, l1);
    maybeUpdateLatency(l2);
  }
  
  private void maybeUpdateLatency(long paramLong)
  {
    if (isOutputPcm)
    {
      Method localMethod = getLatencyMethod;
      if ((localMethod != null) && (paramLong - lastLatencySampleTimeUs >= 500000L))
      {
        try
        {
          long l = ((Integer)Util.castNonNull((Integer)localMethod.invoke(Assertions.checkNotNull(audioTrack), new Object[0]))).intValue() * 1000L - bufferSizeUs;
          latencyUs = l;
          l = Math.max(l, 0L);
          latencyUs = l;
          if (l > 5000000L)
          {
            listener.onInvalidLatency(l);
            latencyUs = 0L;
          }
        }
        catch (Exception localException)
        {
          getLatencyMethod = null;
        }
        lastLatencySampleTimeUs = paramLong;
      }
    }
  }
  
  private static boolean needsPassthroughWorkarounds(int paramInt)
  {
    boolean bool;
    if ((Util.SDK_INT < 23) && ((paramInt == 5) || (paramInt == 6))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void resetSyncParams()
  {
    smoothedPlayheadOffsetUs = 0L;
    playheadOffsetCount = 0;
    nextPlayheadOffsetIndex = 0;
    lastPlayheadSampleTimeUs = 0L;
  }
  
  public int getAvailableBufferSize(long paramLong)
  {
    int i = (int)(paramLong - getPlaybackHeadPosition() * outputPcmFrameSize);
    return bufferSize - i;
  }
  
  public long getCurrentPositionUs(boolean paramBoolean)
  {
    if (((AudioTrack)Assertions.checkNotNull(audioTrack)).getPlayState() == 3) {
      maybeSampleSyncParams();
    }
    long l1 = System.nanoTime() / 1000L;
    AudioTimestampPoller localAudioTimestampPoller = (AudioTimestampPoller)Assertions.checkNotNull(audioTimestampPoller);
    long l2;
    if (localAudioTimestampPoller.hasTimestamp())
    {
      l2 = framesToDurationUs(localAudioTimestampPoller.getTimestampPositionFrames());
      if (!localAudioTimestampPoller.isTimestampAdvancing()) {
        return l2;
      }
      return l1 - localAudioTimestampPoller.getTimestampSystemTimeUs() + l2;
    }
    if (playheadOffsetCount == 0) {
      l2 = getPlaybackHeadPositionUs();
    } else {
      l2 = l1 + smoothedPlayheadOffsetUs;
    }
    l1 = l2;
    if (!paramBoolean) {
      l1 = l2 - latencyUs;
    }
    return l1;
  }
  
  public void handleEndOfStream(long paramLong)
  {
    stopPlaybackHeadPosition = getPlaybackHeadPosition();
    stopTimestampUs = (SystemClock.elapsedRealtime() * 1000L);
    endPlaybackHeadPosition = paramLong;
  }
  
  public boolean hasPendingData(long paramLong)
  {
    boolean bool;
    if ((paramLong <= getPlaybackHeadPosition()) && (!forceHasPendingData())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isPlaying()
  {
    boolean bool;
    if (((AudioTrack)Assertions.checkNotNull(audioTrack)).getPlayState() == 3) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isStalled(long paramLong)
  {
    boolean bool;
    if ((forceResetWorkaroundTimeMs != -9223372036854775807L) && (paramLong > 0L) && (SystemClock.elapsedRealtime() - forceResetWorkaroundTimeMs >= 200L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean mayHandleBuffer(long paramLong)
  {
    int i = ((AudioTrack)Assertions.checkNotNull(audioTrack)).getPlayState();
    if (needsPassthroughWorkarounds)
    {
      if (i == 2)
      {
        hasData = false;
        return false;
      }
      if ((i == 1) && (getPlaybackHeadPosition() == 0L)) {
        return false;
      }
    }
    boolean bool1 = hasData;
    boolean bool2 = hasPendingData(paramLong);
    hasData = bool2;
    if ((bool1) && (!bool2) && (i != 1))
    {
      Listener localListener = listener;
      if (localListener != null) {
        localListener.onUnderrun(bufferSize, C.usToMs(bufferSizeUs));
      }
    }
    return true;
  }
  
  public boolean pause()
  {
    resetSyncParams();
    if (stopTimestampUs == -9223372036854775807L)
    {
      ((AudioTimestampPoller)Assertions.checkNotNull(audioTimestampPoller)).reset();
      return true;
    }
    return false;
  }
  
  public void reset()
  {
    resetSyncParams();
    audioTrack = null;
    audioTimestampPoller = null;
  }
  
  public void setAudioTrack(AudioTrack paramAudioTrack, int paramInt1, int paramInt2, int paramInt3)
  {
    audioTrack = paramAudioTrack;
    outputPcmFrameSize = paramInt2;
    bufferSize = paramInt3;
    audioTimestampPoller = new AudioTimestampPoller(paramAudioTrack);
    outputSampleRate = paramAudioTrack.getSampleRate();
    needsPassthroughWorkarounds = needsPassthroughWorkarounds(paramInt1);
    boolean bool = Util.isEncodingLinearPcm(paramInt1);
    isOutputPcm = bool;
    long l;
    if (bool) {
      l = framesToDurationUs(paramInt3 / paramInt2);
    } else {
      l = -9223372036854775807L;
    }
    bufferSizeUs = l;
    lastRawPlaybackHeadPosition = 0L;
    rawPlaybackHeadWrapCount = 0L;
    passthroughWorkaroundPauseOffset = 0L;
    hasData = false;
    stopTimestampUs = -9223372036854775807L;
    forceResetWorkaroundTimeMs = -9223372036854775807L;
    latencyUs = 0L;
  }
  
  public void start()
  {
    ((AudioTimestampPoller)Assertions.checkNotNull(audioTimestampPoller)).reset();
  }
  
  public static abstract interface Listener
  {
    public abstract void onInvalidLatency(long paramLong);
    
    public abstract void onPositionFramesMismatch(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
    
    public abstract void onSystemTimeUsMismatch(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
    
    public abstract void onUnderrun(int paramInt, long paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioTrackPositionTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */