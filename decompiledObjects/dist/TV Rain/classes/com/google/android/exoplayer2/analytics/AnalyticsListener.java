package com.google.android.exoplayer2.analytics;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.io.IOException;

public abstract interface AnalyticsListener
{
  public void onAudioAttributesChanged(EventTime paramEventTime, AudioAttributes paramAudioAttributes) {}
  
  public void onAudioSessionId(EventTime paramEventTime, int paramInt) {}
  
  public void onAudioUnderrun(EventTime paramEventTime, int paramInt, long paramLong1, long paramLong2) {}
  
  public void onBandwidthEstimate(EventTime paramEventTime, int paramInt, long paramLong1, long paramLong2) {}
  
  public void onDecoderDisabled(EventTime paramEventTime, int paramInt, DecoderCounters paramDecoderCounters) {}
  
  public void onDecoderEnabled(EventTime paramEventTime, int paramInt, DecoderCounters paramDecoderCounters) {}
  
  public void onDecoderInitialized(EventTime paramEventTime, int paramInt, String paramString, long paramLong) {}
  
  public void onDecoderInputFormatChanged(EventTime paramEventTime, int paramInt, Format paramFormat) {}
  
  public void onDownstreamFormatChanged(EventTime paramEventTime, MediaSourceEventListener.MediaLoadData paramMediaLoadData) {}
  
  public void onDrmKeysLoaded(EventTime paramEventTime) {}
  
  public void onDrmKeysRemoved(EventTime paramEventTime) {}
  
  public void onDrmKeysRestored(EventTime paramEventTime) {}
  
  public void onDrmSessionAcquired(EventTime paramEventTime) {}
  
  public void onDrmSessionManagerError(EventTime paramEventTime, Exception paramException) {}
  
  public void onDrmSessionReleased(EventTime paramEventTime) {}
  
  public void onDroppedVideoFrames(EventTime paramEventTime, int paramInt, long paramLong) {}
  
  public void onLoadCanceled(EventTime paramEventTime, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData) {}
  
  public void onLoadCompleted(EventTime paramEventTime, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData) {}
  
  public void onLoadError(EventTime paramEventTime, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData, IOException paramIOException, boolean paramBoolean) {}
  
  public void onLoadStarted(EventTime paramEventTime, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData) {}
  
  public void onLoadingChanged(EventTime paramEventTime, boolean paramBoolean) {}
  
  public void onMediaPeriodCreated(EventTime paramEventTime) {}
  
  public void onMediaPeriodReleased(EventTime paramEventTime) {}
  
  public void onMetadata(EventTime paramEventTime, Metadata paramMetadata) {}
  
  public void onPlaybackParametersChanged(EventTime paramEventTime, PlaybackParameters paramPlaybackParameters) {}
  
  public void onPlayerError(EventTime paramEventTime, ExoPlaybackException paramExoPlaybackException) {}
  
  public void onPlayerStateChanged(EventTime paramEventTime, boolean paramBoolean, int paramInt) {}
  
  public void onPositionDiscontinuity(EventTime paramEventTime, int paramInt) {}
  
  public void onReadingStarted(EventTime paramEventTime) {}
  
  public void onRenderedFirstFrame(EventTime paramEventTime, @Nullable Surface paramSurface) {}
  
  public void onRepeatModeChanged(EventTime paramEventTime, int paramInt) {}
  
  public void onSeekProcessed(EventTime paramEventTime) {}
  
  public void onSeekStarted(EventTime paramEventTime) {}
  
  public void onShuffleModeChanged(EventTime paramEventTime, boolean paramBoolean) {}
  
  public void onSurfaceSizeChanged(EventTime paramEventTime, int paramInt1, int paramInt2) {}
  
  public void onTimelineChanged(EventTime paramEventTime, int paramInt) {}
  
  public void onTracksChanged(EventTime paramEventTime, TrackGroupArray paramTrackGroupArray, TrackSelectionArray paramTrackSelectionArray) {}
  
  public void onUpstreamDiscarded(EventTime paramEventTime, MediaSourceEventListener.MediaLoadData paramMediaLoadData) {}
  
  public void onVideoSizeChanged(EventTime paramEventTime, int paramInt1, int paramInt2, int paramInt3, float paramFloat) {}
  
  public void onVolumeChanged(EventTime paramEventTime, float paramFloat) {}
  
  public static final class EventTime
  {
    public final long currentPlaybackPositionMs;
    public final long eventPlaybackPositionMs;
    @Nullable
    public final MediaSource.MediaPeriodId mediaPeriodId;
    public final long realtimeMs;
    public final Timeline timeline;
    public final long totalBufferedDurationMs;
    public final int windowIndex;
    
    public EventTime(long paramLong1, Timeline paramTimeline, int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, long paramLong2, long paramLong3, long paramLong4)
    {
      realtimeMs = paramLong1;
      timeline = paramTimeline;
      windowIndex = paramInt;
      mediaPeriodId = paramMediaPeriodId;
      eventPlaybackPositionMs = paramLong2;
      currentPlaybackPositionMs = paramLong3;
      totalBufferedDurationMs = paramLong4;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.analytics.AnalyticsListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */