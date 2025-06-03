package com.devbrackets.android.exomedia.core;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.core.exception.NativeMediaPlaybackException;
import com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer;
import com.devbrackets.android.exomedia.core.listener.ExoPlayerListener;
import com.devbrackets.android.exomedia.core.listener.MetadataListener;
import com.devbrackets.android.exomedia.core.video.ClearableSurface;
import com.devbrackets.android.exomedia.listener.OnBufferUpdateListener;
import com.devbrackets.android.exomedia.listener.OnCompletionListener;
import com.devbrackets.android.exomedia.listener.OnErrorListener;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.devbrackets.android.exomedia.listener.OnSeekCompletionListener;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class ListenerMux
  implements ExoPlayerListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnSeekCompleteListener, OnBufferUpdateListener, MetadataListener, AnalyticsListener
{
  private static final long COMPLETED_DURATION_LEEWAY = 1000L;
  @Nullable
  private AnalyticsListener analyticsListener;
  @Nullable
  private OnBufferUpdateListener bufferUpdateListener;
  private boolean clearRequested = false;
  @NonNull
  private WeakReference<ClearableSurface> clearableSurfaceRef = new WeakReference(null);
  @Nullable
  private OnCompletionListener completionListener;
  @NonNull
  private Handler delayedHandler = new Handler();
  @Nullable
  private OnErrorListener errorListener;
  @Nullable
  private MetadataListener metadataListener;
  @NonNull
  private Notifier muxNotifier;
  private boolean notifiedCompleted = false;
  private boolean notifiedPrepared = false;
  @Nullable
  private OnPreparedListener preparedListener;
  @Nullable
  private OnSeekCompletionListener seekCompletionListener;
  
  public ListenerMux(@NonNull Notifier paramNotifier)
  {
    muxNotifier = paramNotifier;
  }
  
  private void notifyCompletionListener()
  {
    if (!muxNotifier.shouldNotifyCompletion(1000L)) {
      return;
    }
    notifiedCompleted = true;
    delayedHandler.post(new Runnable()
    {
      public void run()
      {
        if (ListenerMux.access$100(ListenerMux.this) != null) {
          ListenerMux.access$100(ListenerMux.this).onCompletion();
        }
      }
    });
  }
  
  private boolean notifyErrorListener(Exception paramException)
  {
    OnErrorListener localOnErrorListener = errorListener;
    boolean bool;
    if ((localOnErrorListener != null) && (localOnErrorListener.onError(paramException))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void notifyPreparedListener()
  {
    notifiedPrepared = true;
    delayedHandler.post(new Runnable()
    {
      public void run()
      {
        ListenerMux.access$000(ListenerMux.this);
      }
    });
  }
  
  private void performPreparedHandlerNotification()
  {
    muxNotifier.onPrepared();
    OnPreparedListener localOnPreparedListener = preparedListener;
    if (localOnPreparedListener != null) {
      localOnPreparedListener.onPrepared();
    }
  }
  
  public void clearSurfaceWhenReady(@Nullable ClearableSurface paramClearableSurface)
  {
    clearRequested = true;
    clearableSurfaceRef = new WeakReference(paramClearableSurface);
  }
  
  public boolean isPrepared()
  {
    return notifiedPrepared;
  }
  
  public void onAudioAttributesChanged(AnalyticsListener.EventTime paramEventTime, AudioAttributes paramAudioAttributes)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onAudioAttributesChanged(paramEventTime, paramAudioAttributes);
    }
  }
  
  public void onAudioSessionId(AnalyticsListener.EventTime paramEventTime, int paramInt)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onAudioSessionId(paramEventTime, paramInt);
    }
  }
  
  public void onAudioUnderrun(AnalyticsListener.EventTime paramEventTime, int paramInt, long paramLong1, long paramLong2)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onAudioUnderrun(paramEventTime, paramInt, paramLong1, paramLong2);
    }
  }
  
  public void onBandwidthEstimate(AnalyticsListener.EventTime paramEventTime, int paramInt, long paramLong1, long paramLong2)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onBandwidthEstimate(paramEventTime, paramInt, paramLong1, paramLong2);
    }
  }
  
  public void onBufferingUpdate(@IntRange(from=0L, to=100L) int paramInt)
  {
    muxNotifier.onBufferUpdated(paramInt);
    OnBufferUpdateListener localOnBufferUpdateListener = bufferUpdateListener;
    if (localOnBufferUpdateListener != null) {
      localOnBufferUpdateListener.onBufferingUpdate(paramInt);
    }
  }
  
  public void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    onBufferingUpdate(paramInt);
  }
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    paramMediaPlayer = completionListener;
    if (paramMediaPlayer != null) {
      paramMediaPlayer.onCompletion();
    }
  }
  
  public void onDecoderDisabled(AnalyticsListener.EventTime paramEventTime, int paramInt, DecoderCounters paramDecoderCounters)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onDecoderDisabled(paramEventTime, paramInt, paramDecoderCounters);
    }
  }
  
  public void onDecoderEnabled(AnalyticsListener.EventTime paramEventTime, int paramInt, DecoderCounters paramDecoderCounters)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onDecoderEnabled(paramEventTime, paramInt, paramDecoderCounters);
    }
  }
  
  public void onDecoderInitialized(AnalyticsListener.EventTime paramEventTime, int paramInt, String paramString, long paramLong)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onDecoderInitialized(paramEventTime, paramInt, paramString, paramLong);
    }
  }
  
  public void onDecoderInputFormatChanged(AnalyticsListener.EventTime paramEventTime, int paramInt, Format paramFormat)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onDecoderInputFormatChanged(paramEventTime, paramInt, paramFormat);
    }
  }
  
  public void onDownstreamFormatChanged(AnalyticsListener.EventTime paramEventTime, MediaSourceEventListener.MediaLoadData paramMediaLoadData)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onDownstreamFormatChanged(paramEventTime, paramMediaLoadData);
    }
  }
  
  public void onDrmKeysLoaded(AnalyticsListener.EventTime paramEventTime)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onDrmKeysLoaded(paramEventTime);
    }
  }
  
  public void onDrmKeysRemoved(AnalyticsListener.EventTime paramEventTime)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onDrmKeysRemoved(paramEventTime);
    }
  }
  
  public void onDrmKeysRestored(AnalyticsListener.EventTime paramEventTime)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onDrmKeysRestored(paramEventTime);
    }
  }
  
  public void onDrmSessionAcquired(AnalyticsListener.EventTime paramEventTime)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onDrmSessionAcquired(paramEventTime);
    }
  }
  
  public void onDrmSessionManagerError(AnalyticsListener.EventTime paramEventTime, Exception paramException)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onDrmSessionManagerError(paramEventTime, paramException);
    }
  }
  
  public void onDrmSessionReleased(AnalyticsListener.EventTime paramEventTime)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onDrmSessionReleased(paramEventTime);
    }
  }
  
  public void onDroppedVideoFrames(AnalyticsListener.EventTime paramEventTime, int paramInt, long paramLong)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onDroppedVideoFrames(paramEventTime, paramInt, paramLong);
    }
  }
  
  public void onError(ExoMediaPlayer paramExoMediaPlayer, Exception paramException)
  {
    muxNotifier.onMediaPlaybackEnded();
    muxNotifier.onExoPlayerError(paramExoMediaPlayer, paramException);
    notifyErrorListener(paramException);
  }
  
  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    return notifyErrorListener(new NativeMediaPlaybackException(paramInt1, paramInt2));
  }
  
  public void onLoadCanceled(AnalyticsListener.EventTime paramEventTime, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onLoadCanceled(paramEventTime, paramLoadEventInfo, paramMediaLoadData);
    }
  }
  
  public void onLoadCompleted(AnalyticsListener.EventTime paramEventTime, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onLoadCompleted(paramEventTime, paramLoadEventInfo, paramMediaLoadData);
    }
  }
  
  public void onLoadError(AnalyticsListener.EventTime paramEventTime, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData, IOException paramIOException, boolean paramBoolean)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onLoadError(paramEventTime, paramLoadEventInfo, paramMediaLoadData, paramIOException, paramBoolean);
    }
  }
  
  public void onLoadStarted(AnalyticsListener.EventTime paramEventTime, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onLoadStarted(paramEventTime, paramLoadEventInfo, paramMediaLoadData);
    }
  }
  
  public void onLoadingChanged(AnalyticsListener.EventTime paramEventTime, boolean paramBoolean)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onLoadingChanged(paramEventTime, paramBoolean);
    }
  }
  
  public void onMediaPeriodCreated(AnalyticsListener.EventTime paramEventTime)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onMediaPeriodCreated(paramEventTime);
    }
  }
  
  public void onMediaPeriodReleased(AnalyticsListener.EventTime paramEventTime)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onMediaPeriodReleased(paramEventTime);
    }
  }
  
  public void onMetadata(AnalyticsListener.EventTime paramEventTime, Metadata paramMetadata)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onMetadata(paramEventTime, paramMetadata);
    }
  }
  
  public void onMetadata(Metadata paramMetadata)
  {
    MetadataListener localMetadataListener = metadataListener;
    if (localMetadataListener != null) {
      localMetadataListener.onMetadata(paramMetadata);
    }
  }
  
  public void onPlaybackParametersChanged(AnalyticsListener.EventTime paramEventTime, PlaybackParameters paramPlaybackParameters)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onPlaybackParametersChanged(paramEventTime, paramPlaybackParameters);
    }
  }
  
  public void onPlayerError(AnalyticsListener.EventTime paramEventTime, ExoPlaybackException paramExoPlaybackException)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onPlayerError(paramEventTime, paramExoPlaybackException);
    }
  }
  
  public void onPlayerStateChanged(AnalyticsListener.EventTime paramEventTime, boolean paramBoolean, int paramInt)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onPlayerStateChanged(paramEventTime, paramBoolean, paramInt);
    }
  }
  
  public void onPositionDiscontinuity(AnalyticsListener.EventTime paramEventTime, int paramInt)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onPositionDiscontinuity(paramEventTime, paramInt);
    }
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    notifyPreparedListener();
  }
  
  public void onReadingStarted(AnalyticsListener.EventTime paramEventTime)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onReadingStarted(paramEventTime);
    }
  }
  
  public void onRenderedFirstFrame(AnalyticsListener.EventTime paramEventTime, Surface paramSurface)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onRenderedFirstFrame(paramEventTime, paramSurface);
    }
  }
  
  public void onRepeatModeChanged(AnalyticsListener.EventTime paramEventTime, int paramInt)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onRepeatModeChanged(paramEventTime, paramInt);
    }
  }
  
  public void onSeekComplete()
  {
    muxNotifier.onSeekComplete();
    OnSeekCompletionListener localOnSeekCompletionListener = seekCompletionListener;
    if (localOnSeekCompletionListener != null) {
      localOnSeekCompletionListener.onSeekComplete();
    }
  }
  
  public void onSeekComplete(MediaPlayer paramMediaPlayer)
  {
    paramMediaPlayer = seekCompletionListener;
    if (paramMediaPlayer != null) {
      paramMediaPlayer.onSeekComplete();
    }
  }
  
  public void onSeekProcessed(AnalyticsListener.EventTime paramEventTime)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onSeekProcessed(paramEventTime);
    }
  }
  
  public void onSeekStarted(AnalyticsListener.EventTime paramEventTime)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onSeekStarted(paramEventTime);
    }
  }
  
  public void onShuffleModeChanged(AnalyticsListener.EventTime paramEventTime, boolean paramBoolean)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onShuffleModeChanged(paramEventTime, paramBoolean);
    }
  }
  
  public void onStateChanged(boolean paramBoolean, int paramInt)
  {
    if (paramInt == 4)
    {
      muxNotifier.onMediaPlaybackEnded();
      if (!notifiedCompleted) {
        notifyCompletionListener();
      }
    }
    else if ((paramInt == 3) && (!notifiedPrepared))
    {
      notifyPreparedListener();
    }
    if ((paramInt == 3) && (paramBoolean)) {
      muxNotifier.onPreviewImageStateChanged(false);
    }
    if ((paramInt == 1) && (clearRequested))
    {
      clearRequested = false;
      ClearableSurface localClearableSurface = (ClearableSurface)clearableSurfaceRef.get();
      if (localClearableSurface != null)
      {
        localClearableSurface.clearSurface();
        clearableSurfaceRef = new WeakReference(null);
      }
    }
  }
  
  public void onSurfaceSizeChanged(AnalyticsListener.EventTime paramEventTime, int paramInt1, int paramInt2)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onSurfaceSizeChanged(paramEventTime, paramInt1, paramInt2);
    }
  }
  
  public void onTimelineChanged(AnalyticsListener.EventTime paramEventTime, int paramInt)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onTimelineChanged(paramEventTime, paramInt);
    }
  }
  
  public void onTracksChanged(AnalyticsListener.EventTime paramEventTime, TrackGroupArray paramTrackGroupArray, TrackSelectionArray paramTrackSelectionArray)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onTracksChanged(paramEventTime, paramTrackGroupArray, paramTrackSelectionArray);
    }
  }
  
  public void onUpstreamDiscarded(AnalyticsListener.EventTime paramEventTime, MediaSourceEventListener.MediaLoadData paramMediaLoadData)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onUpstreamDiscarded(paramEventTime, paramMediaLoadData);
    }
  }
  
  public void onVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    muxNotifier.onVideoSizeChanged(paramInt1, paramInt2, paramInt3, paramFloat);
  }
  
  public void onVideoSizeChanged(AnalyticsListener.EventTime paramEventTime, int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onVideoSizeChanged(paramEventTime, paramInt1, paramInt2, paramInt3, paramFloat);
    }
  }
  
  public void onVolumeChanged(AnalyticsListener.EventTime paramEventTime, float paramFloat)
  {
    AnalyticsListener localAnalyticsListener = analyticsListener;
    if (localAnalyticsListener != null) {
      localAnalyticsListener.onVolumeChanged(paramEventTime, paramFloat);
    }
  }
  
  public void setAnalyticsListener(@Nullable AnalyticsListener paramAnalyticsListener)
  {
    analyticsListener = paramAnalyticsListener;
  }
  
  public void setMetadataListener(@Nullable MetadataListener paramMetadataListener)
  {
    metadataListener = paramMetadataListener;
  }
  
  public void setNotifiedCompleted(boolean paramBoolean)
  {
    notifiedCompleted = paramBoolean;
  }
  
  public void setNotifiedPrepared(boolean paramBoolean)
  {
    notifiedPrepared = paramBoolean;
    muxNotifier.onPreviewImageStateChanged(true);
  }
  
  public void setOnBufferUpdateListener(@Nullable OnBufferUpdateListener paramOnBufferUpdateListener)
  {
    bufferUpdateListener = paramOnBufferUpdateListener;
  }
  
  public void setOnCompletionListener(@Nullable OnCompletionListener paramOnCompletionListener)
  {
    completionListener = paramOnCompletionListener;
  }
  
  public void setOnErrorListener(@Nullable OnErrorListener paramOnErrorListener)
  {
    errorListener = paramOnErrorListener;
  }
  
  public void setOnPreparedListener(@Nullable OnPreparedListener paramOnPreparedListener)
  {
    preparedListener = paramOnPreparedListener;
  }
  
  public void setOnSeekCompletionListener(@Nullable OnSeekCompletionListener paramOnSeekCompletionListener)
  {
    seekCompletionListener = paramOnSeekCompletionListener;
  }
  
  public static abstract class Notifier
  {
    public void onBufferUpdated(int paramInt) {}
    
    public abstract void onExoPlayerError(ExoMediaPlayer paramExoMediaPlayer, Exception paramException);
    
    public abstract void onMediaPlaybackEnded();
    
    public void onPrepared() {}
    
    public void onPreviewImageStateChanged(boolean paramBoolean) {}
    
    public void onSeekComplete() {}
    
    public void onVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {}
    
    public abstract boolean shouldNotifyCompletion(long paramLong);
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.ListenerMux
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */