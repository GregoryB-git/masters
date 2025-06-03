package com.google.android.exoplayer2.source.dash;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

public final class DefaultDashChunkSource$RepresentationHolder
{
  @Nullable
  public final ChunkExtractorWrapper extractorWrapper;
  private final long periodDurationUs;
  public final Representation representation;
  @Nullable
  public final DashSegmentIndex segmentIndex;
  private final long segmentNumShift;
  
  public DefaultDashChunkSource$RepresentationHolder(long paramLong, int paramInt, Representation paramRepresentation, boolean paramBoolean1, boolean paramBoolean2, TrackOutput paramTrackOutput)
  {
    this(paramLong, paramRepresentation, createExtractorWrapper(paramInt, paramRepresentation, paramBoolean1, paramBoolean2, paramTrackOutput), 0L, paramRepresentation.getIndex());
  }
  
  private DefaultDashChunkSource$RepresentationHolder(long paramLong1, Representation paramRepresentation, @Nullable ChunkExtractorWrapper paramChunkExtractorWrapper, long paramLong2, @Nullable DashSegmentIndex paramDashSegmentIndex)
  {
    periodDurationUs = paramLong1;
    representation = paramRepresentation;
    segmentNumShift = paramLong2;
    extractorWrapper = paramChunkExtractorWrapper;
    segmentIndex = paramDashSegmentIndex;
  }
  
  @Nullable
  private static ChunkExtractorWrapper createExtractorWrapper(int paramInt, Representation paramRepresentation, boolean paramBoolean1, boolean paramBoolean2, TrackOutput paramTrackOutput)
  {
    Object localObject = format.containerMimeType;
    if (mimeTypeIsRawText((String)localObject)) {
      return null;
    }
    if ("application/x-rawcc".equals(localObject))
    {
      paramTrackOutput = new RawCcExtractor(format);
    }
    else if (mimeTypeIsWebm((String)localObject))
    {
      paramTrackOutput = new MatroskaExtractor(1);
    }
    else
    {
      int i;
      if (paramBoolean1) {
        i = 4;
      } else {
        i = 0;
      }
      if (paramBoolean2) {
        localObject = Collections.singletonList(Format.createTextSampleFormat(null, "application/cea-608", 0, null));
      } else {
        localObject = Collections.emptyList();
      }
      paramTrackOutput = new FragmentedMp4Extractor(i, null, null, null, (List)localObject, paramTrackOutput);
    }
    return new ChunkExtractorWrapper(paramTrackOutput, paramInt, format);
  }
  
  private static boolean mimeTypeIsRawText(String paramString)
  {
    boolean bool;
    if ((!MimeTypes.isText(paramString)) && (!"application/ttml+xml".equals(paramString))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private static boolean mimeTypeIsWebm(String paramString)
  {
    boolean bool;
    if ((!paramString.startsWith("video/webm")) && (!paramString.startsWith("audio/webm")) && (!paramString.startsWith("application/webm"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  @CheckResult
  public RepresentationHolder copyWithNewRepresentation(long paramLong, Representation paramRepresentation)
    throws BehindLiveWindowException
  {
    DashSegmentIndex localDashSegmentIndex1 = representation.getIndex();
    DashSegmentIndex localDashSegmentIndex2 = paramRepresentation.getIndex();
    if (localDashSegmentIndex1 == null) {
      return new RepresentationHolder(paramLong, paramRepresentation, extractorWrapper, segmentNumShift, localDashSegmentIndex1);
    }
    if (!localDashSegmentIndex1.isExplicit()) {
      return new RepresentationHolder(paramLong, paramRepresentation, extractorWrapper, segmentNumShift, localDashSegmentIndex2);
    }
    int i = localDashSegmentIndex1.getSegmentCount(paramLong);
    if (i == 0) {
      return new RepresentationHolder(paramLong, paramRepresentation, extractorWrapper, segmentNumShift, localDashSegmentIndex2);
    }
    long l1 = localDashSegmentIndex1.getFirstSegmentNum() + i - 1L;
    long l2 = localDashSegmentIndex1.getTimeUs(l1);
    long l3 = localDashSegmentIndex1.getDurationUs(l1, paramLong);
    long l4 = localDashSegmentIndex2.getFirstSegmentNum();
    long l5 = localDashSegmentIndex2.getTimeUs(l4);
    long l6 = segmentNumShift;
    boolean bool = l3 + l2 < l5;
    if (!bool) {}
    for (l5 = l1 + 1L;; l5 = localDashSegmentIndex1.getSegmentNum(l5, paramLong))
    {
      break;
      if (bool) {
        break label237;
      }
    }
    return new RepresentationHolder(paramLong, paramRepresentation, extractorWrapper, l5 - l4 + l6, localDashSegmentIndex2);
    label237:
    throw new BehindLiveWindowException();
  }
  
  @CheckResult
  public RepresentationHolder copyWithNewSegmentIndex(DashSegmentIndex paramDashSegmentIndex)
  {
    return new RepresentationHolder(periodDurationUs, representation, extractorWrapper, segmentNumShift, paramDashSegmentIndex);
  }
  
  public long getFirstAvailableSegmentNum(DashManifest paramDashManifest, int paramInt, long paramLong)
  {
    if ((getSegmentCount() == -1) && (timeShiftBufferDepthMs != -9223372036854775807L))
    {
      long l1 = C.msToUs(availabilityStartTimeMs);
      long l2 = C.msToUs(getPeriodstartMs);
      long l3 = C.msToUs(timeShiftBufferDepthMs);
      return Math.max(getFirstSegmentNum(), getSegmentNum(paramLong - l1 - l2 - l3));
    }
    return getFirstSegmentNum();
  }
  
  public long getFirstSegmentNum()
  {
    return segmentIndex.getFirstSegmentNum() + segmentNumShift;
  }
  
  public long getLastAvailableSegmentNum(DashManifest paramDashManifest, int paramInt, long paramLong)
  {
    int i = getSegmentCount();
    if (i == -1) {}
    for (paramLong = getSegmentNum(paramLong - C.msToUs(availabilityStartTimeMs) - C.msToUs(getPeriodstartMs));; paramLong = getFirstSegmentNum() + i) {
      return paramLong - 1L;
    }
  }
  
  public int getSegmentCount()
  {
    return segmentIndex.getSegmentCount(periodDurationUs);
  }
  
  public long getSegmentEndTimeUs(long paramLong)
  {
    long l = getSegmentStartTimeUs(paramLong);
    return segmentIndex.getDurationUs(paramLong - segmentNumShift, periodDurationUs) + l;
  }
  
  public long getSegmentNum(long paramLong)
  {
    return segmentIndex.getSegmentNum(paramLong, periodDurationUs) + segmentNumShift;
  }
  
  public long getSegmentStartTimeUs(long paramLong)
  {
    return segmentIndex.getTimeUs(paramLong - segmentNumShift);
  }
  
  public RangedUri getSegmentUrl(long paramLong)
  {
    return segmentIndex.getSegmentUrl(paramLong - segmentNumShift);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */