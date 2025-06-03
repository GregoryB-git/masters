package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.Buffer;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaClock;
import java.io.IOException;

public abstract class BaseRenderer
  implements Renderer, RendererCapabilities
{
  private RendererConfiguration configuration;
  private int index;
  private boolean readEndOfStream;
  private int state;
  private SampleStream stream;
  private Format[] streamFormats;
  private boolean streamIsFinal;
  private long streamOffsetUs;
  private final int trackType;
  
  public BaseRenderer(int paramInt)
  {
    trackType = paramInt;
    readEndOfStream = true;
  }
  
  public static boolean supportsFormatDrm(@Nullable DrmSessionManager<?> paramDrmSessionManager, @Nullable DrmInitData paramDrmInitData)
  {
    if (paramDrmInitData == null) {
      return true;
    }
    if (paramDrmSessionManager == null) {
      return false;
    }
    return paramDrmSessionManager.canAcquireSession(paramDrmInitData);
  }
  
  public final void disable()
  {
    int i = state;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Assertions.checkState(bool);
    state = 0;
    stream = null;
    streamFormats = null;
    streamIsFinal = false;
    onDisabled();
  }
  
  public final void enable(RendererConfiguration paramRendererConfiguration, Format[] paramArrayOfFormat, SampleStream paramSampleStream, long paramLong1, boolean paramBoolean, long paramLong2)
    throws ExoPlaybackException
  {
    boolean bool;
    if (state == 0) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    configuration = paramRendererConfiguration;
    state = 1;
    onEnabled(paramBoolean);
    replaceStream(paramArrayOfFormat, paramSampleStream, paramLong2);
    onPositionReset(paramLong1, paramBoolean);
  }
  
  public final RendererCapabilities getCapabilities()
  {
    return this;
  }
  
  public final RendererConfiguration getConfiguration()
  {
    return configuration;
  }
  
  public final int getIndex()
  {
    return index;
  }
  
  public MediaClock getMediaClock()
  {
    return null;
  }
  
  public final int getState()
  {
    return state;
  }
  
  public final SampleStream getStream()
  {
    return stream;
  }
  
  public final Format[] getStreamFormats()
  {
    return streamFormats;
  }
  
  public final int getTrackType()
  {
    return trackType;
  }
  
  public void handleMessage(int paramInt, @Nullable Object paramObject)
    throws ExoPlaybackException
  {}
  
  public final boolean hasReadStreamToEnd()
  {
    return readEndOfStream;
  }
  
  public final boolean isCurrentStreamFinal()
  {
    return streamIsFinal;
  }
  
  public final boolean isSourceReady()
  {
    boolean bool;
    if (readEndOfStream) {
      bool = streamIsFinal;
    } else {
      bool = stream.isReady();
    }
    return bool;
  }
  
  public final void maybeThrowStreamError()
    throws IOException
  {
    stream.maybeThrowError();
  }
  
  public void onDisabled() {}
  
  public void onEnabled(boolean paramBoolean)
    throws ExoPlaybackException
  {}
  
  public void onPositionReset(long paramLong, boolean paramBoolean)
    throws ExoPlaybackException
  {}
  
  public void onStarted()
    throws ExoPlaybackException
  {}
  
  public void onStopped()
    throws ExoPlaybackException
  {}
  
  public void onStreamChanged(Format[] paramArrayOfFormat, long paramLong)
    throws ExoPlaybackException
  {}
  
  public final int readSource(FormatHolder paramFormatHolder, DecoderInputBuffer paramDecoderInputBuffer, boolean paramBoolean)
  {
    int i = stream.readData(paramFormatHolder, paramDecoderInputBuffer, paramBoolean);
    int j = -4;
    if (i == -4)
    {
      if (paramDecoderInputBuffer.isEndOfStream())
      {
        readEndOfStream = true;
        if (!streamIsFinal) {
          j = -3;
        }
        return j;
      }
      timeUs += streamOffsetUs;
    }
    else if (i == -5)
    {
      paramDecoderInputBuffer = format;
      long l = subsampleOffsetUs;
      if (l != Long.MAX_VALUE) {
        format = paramDecoderInputBuffer.copyWithSubsampleOffsetUs(l + streamOffsetUs);
      }
    }
    return i;
  }
  
  public final void replaceStream(Format[] paramArrayOfFormat, SampleStream paramSampleStream, long paramLong)
    throws ExoPlaybackException
  {
    Assertions.checkState(streamIsFinal ^ true);
    stream = paramSampleStream;
    readEndOfStream = false;
    streamFormats = paramArrayOfFormat;
    streamOffsetUs = paramLong;
    onStreamChanged(paramArrayOfFormat, paramLong);
  }
  
  public final void resetPosition(long paramLong)
    throws ExoPlaybackException
  {
    streamIsFinal = false;
    readEndOfStream = false;
    onPositionReset(paramLong, false);
  }
  
  public final void setCurrentStreamFinal()
  {
    streamIsFinal = true;
  }
  
  public final void setIndex(int paramInt)
  {
    index = paramInt;
  }
  
  public int skipSource(long paramLong)
  {
    return stream.skipData(paramLong - streamOffsetUs);
  }
  
  public final void start()
    throws ExoPlaybackException
  {
    int i = state;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Assertions.checkState(bool);
    state = 2;
    onStarted();
  }
  
  public final void stop()
    throws ExoPlaybackException
  {
    boolean bool;
    if (state == 2) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    state = 1;
    onStopped();
  }
  
  public int supportsMixedMimeTypeAdaptation()
    throws ExoPlaybackException
  {
    return 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.BaseRenderer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */