package com.google.android.exoplayer2.util;

import a;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.Timeline.Window;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import z2;

public class EventLogger
  implements AnalyticsListener
{
  private static final String DEFAULT_TAG = "EventLogger";
  private static final int MAX_TIMELINE_ITEM_LINES = 3;
  private static final NumberFormat TIME_FORMAT;
  private final Timeline.Period period;
  private final long startTimeMs;
  private final String tag;
  @Nullable
  private final MappingTrackSelector trackSelector;
  private final Timeline.Window window;
  
  static
  {
    NumberFormat localNumberFormat = NumberFormat.getInstance(Locale.US);
    TIME_FORMAT = localNumberFormat;
    localNumberFormat.setMinimumFractionDigits(2);
    localNumberFormat.setMaximumFractionDigits(2);
    localNumberFormat.setGroupingUsed(false);
  }
  
  public EventLogger(@Nullable MappingTrackSelector paramMappingTrackSelector)
  {
    this(paramMappingTrackSelector, "EventLogger");
  }
  
  public EventLogger(@Nullable MappingTrackSelector paramMappingTrackSelector, String paramString)
  {
    trackSelector = paramMappingTrackSelector;
    tag = paramString;
    window = new Timeline.Window();
    period = new Timeline.Period();
    startTimeMs = SystemClock.elapsedRealtime();
  }
  
  private static String getAdaptiveSupportString(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 2) {
      return "N/A";
    }
    if (paramInt2 != 0)
    {
      if (paramInt2 != 8)
      {
        if (paramInt2 != 16) {
          return "?";
        }
        return "YES";
      }
      return "YES_NOT_SEAMLESS";
    }
    return "NO";
  }
  
  private static String getDiscontinuityReasonString(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4) {
              return "?";
            }
            return "INTERNAL";
          }
          return "AD_INSERTION";
        }
        return "SEEK_ADJUSTMENT";
      }
      return "SEEK";
    }
    return "PERIOD_TRANSITION";
  }
  
  private String getEventString(AnalyticsListener.EventTime paramEventTime, String paramString)
  {
    return z2.s(z2.u(paramString, " ["), getEventTimeString(paramEventTime), "]");
  }
  
  private String getEventString(AnalyticsListener.EventTime paramEventTime, String paramString1, String paramString2)
  {
    paramString1 = z2.u(paramString1, " [");
    paramString1.append(getEventTimeString(paramEventTime));
    paramString1.append(", ");
    paramString1.append(paramString2);
    paramString1.append("]");
    return paramString1.toString();
  }
  
  private String getEventTimeString(AnalyticsListener.EventTime paramEventTime)
  {
    Object localObject1 = z2.t("window=");
    ((StringBuilder)localObject1).append(windowIndex);
    Object localObject2 = ((StringBuilder)localObject1).toString();
    localObject1 = localObject2;
    if (mediaPeriodId != null)
    {
      localObject1 = z2.u((String)localObject2, ", period=");
      ((StringBuilder)localObject1).append(timeline.getIndexOfPeriod(mediaPeriodId.periodUid));
      localObject2 = ((StringBuilder)localObject1).toString();
      localObject1 = localObject2;
      if (mediaPeriodId.isAd())
      {
        localObject1 = z2.u((String)localObject2, ", adGroup=");
        ((StringBuilder)localObject1).append(mediaPeriodId.adGroupIndex);
        localObject1 = z2.u(((StringBuilder)localObject1).toString(), ", ad=");
        ((StringBuilder)localObject1).append(mediaPeriodId.adIndexInAdGroup);
        localObject1 = ((StringBuilder)localObject1).toString();
      }
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(getTimeString(realtimeMs - startTimeMs));
    ((StringBuilder)localObject2).append(", ");
    return a.p((StringBuilder)localObject2, getTimeString(currentPlaybackPositionMs), ", ", (String)localObject1);
  }
  
  private static String getFormatSupportString(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4) {
              return "?";
            }
            return "YES";
          }
          return "NO_EXCEEDS_CAPABILITIES";
        }
        return "NO_UNSUPPORTED_DRM";
      }
      return "NO_UNSUPPORTED_TYPE";
    }
    return "NO";
  }
  
  private static String getRepeatModeString(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return "?";
        }
        return "ALL";
      }
      return "ONE";
    }
    return "OFF";
  }
  
  private static String getStateString(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 4) {
            return "?";
          }
          return "ENDED";
        }
        return "READY";
      }
      return "BUFFERING";
    }
    return "IDLE";
  }
  
  private static String getTimeString(long paramLong)
  {
    String str;
    if (paramLong == -9223372036854775807L) {
      str = "?";
    } else {
      str = TIME_FORMAT.format((float)paramLong / 1000.0F);
    }
    return str;
  }
  
  private static String getTimelineChangeReasonString(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return "?";
        }
        return "DYNAMIC";
      }
      return "RESET";
    }
    return "PREPARED";
  }
  
  private static String getTrackStatusString(@Nullable TrackSelection paramTrackSelection, TrackGroup paramTrackGroup, int paramInt)
  {
    boolean bool;
    if ((paramTrackSelection != null) && (paramTrackSelection.getTrackGroup() == paramTrackGroup) && (paramTrackSelection.indexOf(paramInt) != -1)) {
      bool = true;
    } else {
      bool = false;
    }
    return getTrackStatusString(bool);
  }
  
  private static String getTrackStatusString(boolean paramBoolean)
  {
    String str;
    if (paramBoolean) {
      str = "[X]";
    } else {
      str = "[ ]";
    }
    return str;
  }
  
  private static String getTrackTypeString(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      if (paramInt >= 10000) {
        str = a.g("custom (", paramInt, ")");
      }
      break;
    case 6: 
      return "none";
    case 5: 
      return "camera motion";
    case 4: 
      return "metadata";
    case 3: 
      return "text";
    case 2: 
      return "video";
    case 1: 
      return "audio";
    case 0: 
      return "default";
    }
    String str = "?";
    return str;
  }
  
  private void logd(AnalyticsListener.EventTime paramEventTime, String paramString)
  {
    logd(getEventString(paramEventTime, paramString));
  }
  
  private void logd(AnalyticsListener.EventTime paramEventTime, String paramString1, String paramString2)
  {
    logd(getEventString(paramEventTime, paramString1, paramString2));
  }
  
  private void loge(AnalyticsListener.EventTime paramEventTime, String paramString1, String paramString2, @Nullable Throwable paramThrowable)
  {
    loge(getEventString(paramEventTime, paramString1, paramString2), paramThrowable);
  }
  
  private void loge(AnalyticsListener.EventTime paramEventTime, String paramString, @Nullable Throwable paramThrowable)
  {
    loge(getEventString(paramEventTime, paramString), paramThrowable);
  }
  
  private void printInternalError(AnalyticsListener.EventTime paramEventTime, String paramString, Exception paramException)
  {
    loge(paramEventTime, "internalError", paramString, paramException);
  }
  
  private void printMetadata(Metadata paramMetadata, String paramString)
  {
    for (int i = 0; i < paramMetadata.length(); i++)
    {
      StringBuilder localStringBuilder = z2.t(paramString);
      localStringBuilder.append(paramMetadata.get(i));
      logd(localStringBuilder.toString());
    }
  }
  
  public void logd(String paramString)
  {
    Log.d(tag, paramString);
  }
  
  public void loge(String paramString, @Nullable Throwable paramThrowable)
  {
    Log.e(tag, paramString, paramThrowable);
  }
  
  public void onAudioSessionId(AnalyticsListener.EventTime paramEventTime, int paramInt)
  {
    logd(paramEventTime, "audioSessionId", Integer.toString(paramInt));
  }
  
  public void onAudioUnderrun(AnalyticsListener.EventTime paramEventTime, int paramInt, long paramLong1, long paramLong2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", ");
    localStringBuilder.append(paramLong1);
    localStringBuilder.append(", ");
    loge(paramEventTime, "audioTrackUnderrun", z2.r(localStringBuilder, paramLong2, "]"), null);
  }
  
  public void onBandwidthEstimate(AnalyticsListener.EventTime paramEventTime, int paramInt, long paramLong1, long paramLong2) {}
  
  public void onDecoderDisabled(AnalyticsListener.EventTime paramEventTime, int paramInt, DecoderCounters paramDecoderCounters)
  {
    logd(paramEventTime, "decoderDisabled", getTrackTypeString(paramInt));
  }
  
  public void onDecoderEnabled(AnalyticsListener.EventTime paramEventTime, int paramInt, DecoderCounters paramDecoderCounters)
  {
    logd(paramEventTime, "decoderEnabled", getTrackTypeString(paramInt));
  }
  
  public void onDecoderInitialized(AnalyticsListener.EventTime paramEventTime, int paramInt, String paramString, long paramLong)
  {
    logd(paramEventTime, "decoderInitialized", a.p(new StringBuilder(), getTrackTypeString(paramInt), ", ", paramString));
  }
  
  public void onDecoderInputFormatChanged(AnalyticsListener.EventTime paramEventTime, int paramInt, Format paramFormat)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getTrackTypeString(paramInt));
    localStringBuilder.append(", ");
    localStringBuilder.append(Format.toLogString(paramFormat));
    logd(paramEventTime, "decoderInputFormatChanged", localStringBuilder.toString());
  }
  
  public void onDownstreamFormatChanged(AnalyticsListener.EventTime paramEventTime, MediaSourceEventListener.MediaLoadData paramMediaLoadData)
  {
    logd(paramEventTime, "downstreamFormatChanged", Format.toLogString(trackFormat));
  }
  
  public void onDrmKeysLoaded(AnalyticsListener.EventTime paramEventTime)
  {
    logd(paramEventTime, "drmKeysLoaded");
  }
  
  public void onDrmKeysRemoved(AnalyticsListener.EventTime paramEventTime)
  {
    logd(paramEventTime, "drmKeysRemoved");
  }
  
  public void onDrmKeysRestored(AnalyticsListener.EventTime paramEventTime)
  {
    logd(paramEventTime, "drmKeysRestored");
  }
  
  public void onDrmSessionAcquired(AnalyticsListener.EventTime paramEventTime)
  {
    logd(paramEventTime, "drmSessionAcquired");
  }
  
  public void onDrmSessionManagerError(AnalyticsListener.EventTime paramEventTime, Exception paramException)
  {
    printInternalError(paramEventTime, "drmSessionManagerError", paramException);
  }
  
  public void onDrmSessionReleased(AnalyticsListener.EventTime paramEventTime)
  {
    logd(paramEventTime, "drmSessionReleased");
  }
  
  public void onDroppedVideoFrames(AnalyticsListener.EventTime paramEventTime, int paramInt, long paramLong)
  {
    logd(paramEventTime, "droppedFrames", Integer.toString(paramInt));
  }
  
  public void onLoadCanceled(AnalyticsListener.EventTime paramEventTime, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData) {}
  
  public void onLoadCompleted(AnalyticsListener.EventTime paramEventTime, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData) {}
  
  public void onLoadError(AnalyticsListener.EventTime paramEventTime, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData, IOException paramIOException, boolean paramBoolean)
  {
    printInternalError(paramEventTime, "loadError", paramIOException);
  }
  
  public void onLoadStarted(AnalyticsListener.EventTime paramEventTime, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData) {}
  
  public void onLoadingChanged(AnalyticsListener.EventTime paramEventTime, boolean paramBoolean)
  {
    logd(paramEventTime, "loading", Boolean.toString(paramBoolean));
  }
  
  public void onMediaPeriodCreated(AnalyticsListener.EventTime paramEventTime)
  {
    logd(paramEventTime, "mediaPeriodCreated");
  }
  
  public void onMediaPeriodReleased(AnalyticsListener.EventTime paramEventTime)
  {
    logd(paramEventTime, "mediaPeriodReleased");
  }
  
  public void onMetadata(AnalyticsListener.EventTime paramEventTime, Metadata paramMetadata)
  {
    StringBuilder localStringBuilder = z2.t("metadata [");
    localStringBuilder.append(getEventTimeString(paramEventTime));
    localStringBuilder.append(", ");
    logd(localStringBuilder.toString());
    printMetadata(paramMetadata, "  ");
    logd("]");
  }
  
  public void onPlaybackParametersChanged(AnalyticsListener.EventTime paramEventTime, PlaybackParameters paramPlaybackParameters)
  {
    logd(paramEventTime, "playbackParameters", Util.formatInvariant("speed=%.2f, pitch=%.2f, skipSilence=%s", new Object[] { Float.valueOf(speed), Float.valueOf(pitch), Boolean.valueOf(skipSilence) }));
  }
  
  public void onPlayerError(AnalyticsListener.EventTime paramEventTime, ExoPlaybackException paramExoPlaybackException)
  {
    loge(paramEventTime, "playerFailed", paramExoPlaybackException);
  }
  
  public void onPlayerStateChanged(AnalyticsListener.EventTime paramEventTime, boolean paramBoolean, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramBoolean);
    localStringBuilder.append(", ");
    localStringBuilder.append(getStateString(paramInt));
    logd(paramEventTime, "state", localStringBuilder.toString());
  }
  
  public void onPositionDiscontinuity(AnalyticsListener.EventTime paramEventTime, int paramInt)
  {
    logd(paramEventTime, "positionDiscontinuity", getDiscontinuityReasonString(paramInt));
  }
  
  public void onReadingStarted(AnalyticsListener.EventTime paramEventTime)
  {
    logd(paramEventTime, "mediaPeriodReadingStarted");
  }
  
  public void onRenderedFirstFrame(AnalyticsListener.EventTime paramEventTime, @Nullable Surface paramSurface)
  {
    logd(paramEventTime, "renderedFirstFrame", String.valueOf(paramSurface));
  }
  
  public void onRepeatModeChanged(AnalyticsListener.EventTime paramEventTime, int paramInt)
  {
    logd(paramEventTime, "repeatMode", getRepeatModeString(paramInt));
  }
  
  public void onSeekProcessed(AnalyticsListener.EventTime paramEventTime)
  {
    logd(paramEventTime, "seekProcessed");
  }
  
  public void onSeekStarted(AnalyticsListener.EventTime paramEventTime)
  {
    logd(paramEventTime, "seekStarted");
  }
  
  public void onShuffleModeChanged(AnalyticsListener.EventTime paramEventTime, boolean paramBoolean)
  {
    logd(paramEventTime, "shuffleModeEnabled", Boolean.toString(paramBoolean));
  }
  
  public void onSurfaceSizeChanged(AnalyticsListener.EventTime paramEventTime, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(", ");
    localStringBuilder.append(paramInt2);
    logd(paramEventTime, "surfaceSizeChanged", localStringBuilder.toString());
  }
  
  public void onTimelineChanged(AnalyticsListener.EventTime paramEventTime, int paramInt)
  {
    int i = timeline.getPeriodCount();
    int j = timeline.getWindowCount();
    StringBuilder localStringBuilder = z2.t("timelineChanged [");
    localStringBuilder.append(getEventTimeString(paramEventTime));
    localStringBuilder.append(", periodCount=");
    localStringBuilder.append(i);
    localStringBuilder.append(", windowCount=");
    localStringBuilder.append(j);
    localStringBuilder.append(", reason=");
    localStringBuilder.append(getTimelineChangeReasonString(paramInt));
    logd(localStringBuilder.toString());
    int k = 0;
    for (paramInt = 0; paramInt < Math.min(i, 3); paramInt++)
    {
      timeline.getPeriod(paramInt, period);
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("  period [");
      localStringBuilder.append(getTimeString(period.getDurationMs()));
      localStringBuilder.append("]");
      logd(localStringBuilder.toString());
    }
    paramInt = k;
    if (i > 3) {
      logd("  ...");
    }
    for (paramInt = k; paramInt < Math.min(j, 3); paramInt++)
    {
      timeline.getWindow(paramInt, window);
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("  window [");
      localStringBuilder.append(getTimeString(window.getDurationMs()));
      localStringBuilder.append(", ");
      localStringBuilder.append(window.isSeekable);
      localStringBuilder.append(", ");
      localStringBuilder.append(window.isDynamic);
      localStringBuilder.append("]");
      logd(localStringBuilder.toString());
    }
    if (j > 3) {
      logd("  ...");
    }
    logd("]");
  }
  
  public void onTracksChanged(AnalyticsListener.EventTime paramEventTime, TrackGroupArray paramTrackGroupArray, TrackSelectionArray paramTrackSelectionArray)
  {
    paramTrackGroupArray = trackSelector;
    if (paramTrackGroupArray != null) {
      paramTrackGroupArray = paramTrackGroupArray.getCurrentMappedTrackInfo();
    } else {
      paramTrackGroupArray = null;
    }
    if (paramTrackGroupArray == null)
    {
      logd(paramEventTime, "tracksChanged", "[]");
      return;
    }
    Object localObject1 = z2.t("tracksChanged [");
    ((StringBuilder)localObject1).append(getEventTimeString(paramEventTime));
    ((StringBuilder)localObject1).append(", ");
    logd(((StringBuilder)localObject1).toString());
    int i = paramTrackGroupArray.getRendererCount();
    Object localObject2;
    Object localObject3;
    Object localObject4;
    for (int j = 0;; j++)
    {
      localObject1 = "    Group:";
      localObject2 = " [";
      if (j >= i) {
        break;
      }
      paramEventTime = paramTrackGroupArray.getTrackGroups(j);
      localObject3 = paramTrackSelectionArray.get(j);
      if (length > 0)
      {
        localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append("  Renderer:");
        ((StringBuilder)localObject4).append(j);
        ((StringBuilder)localObject4).append(" [");
        logd(((StringBuilder)localObject4).toString());
        for (int k = 0; k < length; k++)
        {
          localObject4 = paramEventTime.get(k);
          Object localObject5 = getAdaptiveSupportString(length, paramTrackGroupArray.getAdaptiveSupport(j, k, false));
          Object localObject6 = new StringBuilder();
          ((StringBuilder)localObject6).append((String)localObject1);
          ((StringBuilder)localObject6).append(k);
          ((StringBuilder)localObject6).append(", adaptive_supported=");
          ((StringBuilder)localObject6).append((String)localObject5);
          ((StringBuilder)localObject6).append((String)localObject2);
          logd(((StringBuilder)localObject6).toString());
          for (int m = 0; m < length; m++)
          {
            localObject6 = getTrackStatusString((TrackSelection)localObject3, (TrackGroup)localObject4, m);
            String str = getFormatSupportString(paramTrackGroupArray.getTrackSupport(j, k, m));
            localObject5 = new StringBuilder();
            ((StringBuilder)localObject5).append("      ");
            ((StringBuilder)localObject5).append((String)localObject6);
            ((StringBuilder)localObject5).append(" Track:");
            ((StringBuilder)localObject5).append(m);
            ((StringBuilder)localObject5).append(", ");
            ((StringBuilder)localObject5).append(Format.toLogString(((TrackGroup)localObject4).getFormat(m)));
            ((StringBuilder)localObject5).append(", supported=");
            ((StringBuilder)localObject5).append(str);
            logd(((StringBuilder)localObject5).toString());
          }
          logd("    ]");
        }
        if (localObject3 != null) {
          for (k = 0; k < ((TrackSelection)localObject3).length(); k++)
          {
            paramEventTime = getFormatmetadata;
            if (paramEventTime != null)
            {
              logd("    Metadata [");
              printMetadata(paramEventTime, "      ");
              logd("    ]");
              break;
            }
          }
        }
        logd("  ]");
      }
    }
    paramTrackSelectionArray = "    Group:";
    paramEventTime = " [";
    localObject1 = paramTrackGroupArray.getUnmappedTrackGroups();
    if (length > 0)
    {
      logd("  Renderer:None [");
      j = 0;
      paramTrackGroupArray = paramTrackSelectionArray;
      while (j < length)
      {
        paramTrackSelectionArray = new StringBuilder();
        paramTrackSelectionArray.append(paramTrackGroupArray);
        paramTrackSelectionArray.append(j);
        paramTrackSelectionArray.append(paramEventTime);
        logd(paramTrackSelectionArray.toString());
        localObject2 = ((TrackGroupArray)localObject1).get(j);
        for (i = 0; i < length; i++)
        {
          localObject3 = getTrackStatusString(false);
          paramTrackSelectionArray = getFormatSupportString(0);
          localObject4 = new StringBuilder();
          ((StringBuilder)localObject4).append("      ");
          ((StringBuilder)localObject4).append((String)localObject3);
          ((StringBuilder)localObject4).append(" Track:");
          ((StringBuilder)localObject4).append(i);
          ((StringBuilder)localObject4).append(", ");
          ((StringBuilder)localObject4).append(Format.toLogString(((TrackGroup)localObject2).getFormat(i)));
          ((StringBuilder)localObject4).append(", supported=");
          ((StringBuilder)localObject4).append(paramTrackSelectionArray);
          logd(((StringBuilder)localObject4).toString());
        }
        logd("    ]");
        j++;
      }
      logd("  ]");
    }
    logd("]");
  }
  
  public void onUpstreamDiscarded(AnalyticsListener.EventTime paramEventTime, MediaSourceEventListener.MediaLoadData paramMediaLoadData)
  {
    logd(paramEventTime, "upstreamDiscarded", Format.toLogString(trackFormat));
  }
  
  public void onVideoSizeChanged(AnalyticsListener.EventTime paramEventTime, int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(", ");
    localStringBuilder.append(paramInt2);
    logd(paramEventTime, "videoSizeChanged", localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.EventLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */