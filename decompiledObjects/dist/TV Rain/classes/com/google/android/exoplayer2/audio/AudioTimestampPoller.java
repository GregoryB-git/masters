package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;

final class AudioTimestampPoller
{
  private static final int ERROR_POLL_INTERVAL_US = 500000;
  private static final int FAST_POLL_INTERVAL_US = 5000;
  private static final int INITIALIZING_DURATION_US = 500000;
  private static final int SLOW_POLL_INTERVAL_US = 10000000;
  private static final int STATE_ERROR = 4;
  private static final int STATE_INITIALIZING = 0;
  private static final int STATE_NO_TIMESTAMP = 3;
  private static final int STATE_TIMESTAMP = 1;
  private static final int STATE_TIMESTAMP_ADVANCING = 2;
  @Nullable
  private final AudioTimestampV19 audioTimestamp;
  private long initialTimestampPositionFrames;
  private long initializeSystemTimeUs;
  private long lastTimestampSampleTimeUs;
  private long sampleIntervalUs;
  private int state;
  
  public AudioTimestampPoller(AudioTrack paramAudioTrack)
  {
    if (Util.SDK_INT >= 19)
    {
      audioTimestamp = new AudioTimestampV19(paramAudioTrack);
      reset();
    }
    else
    {
      audioTimestamp = null;
      updateState(3);
    }
  }
  
  private void updateState(int paramInt)
  {
    state = paramInt;
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if ((paramInt != 2) && (paramInt != 3))
        {
          if (paramInt == 4) {
            sampleIntervalUs = 500000L;
          } else {
            throw new IllegalStateException();
          }
        }
        else {
          sampleIntervalUs = 10000000L;
        }
      }
      else {
        sampleIntervalUs = 5000L;
      }
    }
    else
    {
      lastTimestampSampleTimeUs = 0L;
      initialTimestampPositionFrames = -1L;
      initializeSystemTimeUs = (System.nanoTime() / 1000L);
      sampleIntervalUs = 5000L;
    }
  }
  
  public void acceptTimestamp()
  {
    if (state == 4) {
      reset();
    }
  }
  
  public long getTimestampPositionFrames()
  {
    AudioTimestampV19 localAudioTimestampV19 = audioTimestamp;
    long l;
    if (localAudioTimestampV19 != null) {
      l = localAudioTimestampV19.getTimestampPositionFrames();
    } else {
      l = -1L;
    }
    return l;
  }
  
  public long getTimestampSystemTimeUs()
  {
    AudioTimestampV19 localAudioTimestampV19 = audioTimestamp;
    long l;
    if (localAudioTimestampV19 != null) {
      l = localAudioTimestampV19.getTimestampSystemTimeUs();
    } else {
      l = -9223372036854775807L;
    }
    return l;
  }
  
  public boolean hasTimestamp()
  {
    int i = state;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i != 1) {
      if (i == 2) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public boolean isTimestampAdvancing()
  {
    boolean bool;
    if (state == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean maybePollTimestamp(long paramLong)
  {
    AudioTimestampV19 localAudioTimestampV19 = audioTimestamp;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localAudioTimestampV19 != null) {
      if (paramLong - lastTimestampSampleTimeUs < sampleIntervalUs)
      {
        bool2 = bool1;
      }
      else
      {
        lastTimestampSampleTimeUs = paramLong;
        boolean bool3 = localAudioTimestampV19.maybeUpdateTimestamp();
        int i = state;
        if (i != 0)
        {
          if (i != 1)
          {
            if (i != 2)
            {
              if (i != 3)
              {
                if (i != 4) {
                  throw new IllegalStateException();
                }
              }
              else if (bool3) {
                reset();
              }
            }
            else if (!bool3) {
              reset();
            }
          }
          else if (bool3)
          {
            if (audioTimestamp.getTimestampPositionFrames() > initialTimestampPositionFrames) {
              updateState(2);
            }
          }
          else {
            reset();
          }
        }
        else if (bool3)
        {
          bool2 = bool1;
          if (audioTimestamp.getTimestampSystemTimeUs() < initializeSystemTimeUs) {
            break label218;
          }
          initialTimestampPositionFrames = audioTimestamp.getTimestampPositionFrames();
          updateState(1);
        }
        else if (paramLong - initializeSystemTimeUs > 500000L)
        {
          updateState(3);
        }
        bool2 = bool3;
      }
    }
    label218:
    return bool2;
  }
  
  public void rejectTimestamp()
  {
    updateState(4);
  }
  
  public void reset()
  {
    if (audioTimestamp != null) {
      updateState(0);
    }
  }
  
  @TargetApi(19)
  public static final class AudioTimestampV19
  {
    private final AudioTimestamp audioTimestamp;
    private final AudioTrack audioTrack;
    private long lastTimestampPositionFrames;
    private long lastTimestampRawPositionFrames;
    private long rawTimestampFramePositionWrapCount;
    
    public AudioTimestampV19(AudioTrack paramAudioTrack)
    {
      audioTrack = paramAudioTrack;
      audioTimestamp = new AudioTimestamp();
    }
    
    public long getTimestampPositionFrames()
    {
      return lastTimestampPositionFrames;
    }
    
    public long getTimestampSystemTimeUs()
    {
      return audioTimestamp.nanoTime / 1000L;
    }
    
    public boolean maybeUpdateTimestamp()
    {
      boolean bool = audioTrack.getTimestamp(audioTimestamp);
      if (bool)
      {
        long l = audioTimestamp.framePosition;
        if (lastTimestampRawPositionFrames > l) {
          rawTimestampFramePositionWrapCount += 1L;
        }
        lastTimestampRawPositionFrames = l;
        lastTimestampPositionFrames = (l + (rawTimestampFramePositionWrapCount << 32));
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioTimestampPoller
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */