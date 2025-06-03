package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper;
import com.google.android.exoplayer2.source.chunk.ChunkHolder;
import com.google.android.exoplayer2.source.chunk.ContainerMediaChunk;
import com.google.android.exoplayer2.source.chunk.InitializationChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.SingleSampleMediaChunk;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DefaultDashChunkSource
  implements DashChunkSource
{
  private final int[] adaptationSetIndices;
  private final DataSource dataSource;
  private final long elapsedRealtimeOffsetMs;
  private IOException fatalError;
  private long liveEdgeTimeUs;
  private DashManifest manifest;
  private final LoaderErrorThrower manifestLoaderErrorThrower;
  private final int maxSegmentsPerLoad;
  private boolean missingLastSegment;
  private int periodIndex;
  @Nullable
  private final PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
  public final RepresentationHolder[] representationHolders;
  private final TrackSelection trackSelection;
  private final int trackType;
  
  public DefaultDashChunkSource(LoaderErrorThrower paramLoaderErrorThrower, DashManifest paramDashManifest, int paramInt1, int[] paramArrayOfInt, TrackSelection paramTrackSelection, int paramInt2, DataSource paramDataSource, long paramLong, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler paramPlayerTrackEmsgHandler)
  {
    manifestLoaderErrorThrower = paramLoaderErrorThrower;
    manifest = paramDashManifest;
    adaptationSetIndices = paramArrayOfInt;
    trackSelection = paramTrackSelection;
    trackType = paramInt2;
    dataSource = paramDataSource;
    periodIndex = paramInt1;
    elapsedRealtimeOffsetMs = paramLong;
    maxSegmentsPerLoad = paramInt3;
    playerTrackEmsgHandler = paramPlayerTrackEmsgHandler;
    paramLong = paramDashManifest.getPeriodDurationUs(paramInt1);
    liveEdgeTimeUs = -9223372036854775807L;
    paramLoaderErrorThrower = getRepresentations();
    representationHolders = new RepresentationHolder[paramTrackSelection.length()];
    for (paramInt1 = 0; paramInt1 < representationHolders.length; paramInt1++)
    {
      paramDashManifest = (Representation)paramLoaderErrorThrower.get(paramTrackSelection.getIndexInTrackGroup(paramInt1));
      representationHolders[paramInt1] = new RepresentationHolder(paramLong, paramInt2, paramDashManifest, paramBoolean1, paramBoolean2, paramPlayerTrackEmsgHandler);
    }
  }
  
  private long getNowUnixTimeUs()
  {
    if (elapsedRealtimeOffsetMs != 0L) {}
    for (long l = SystemClock.elapsedRealtime() + elapsedRealtimeOffsetMs;; l = System.currentTimeMillis()) {
      return l * 1000L;
    }
  }
  
  private ArrayList<Representation> getRepresentations()
  {
    List localList = manifest.getPeriod(periodIndex).adaptationSets;
    ArrayList localArrayList = new ArrayList();
    int[] arrayOfInt = adaptationSetIndices;
    int i = arrayOfInt.length;
    for (int j = 0; j < i; j++) {
      localArrayList.addAll(getrepresentations);
    }
    return localArrayList;
  }
  
  private long getSegmentNum(RepresentationHolder paramRepresentationHolder, @Nullable MediaChunk paramMediaChunk, long paramLong1, long paramLong2, long paramLong3)
  {
    if (paramMediaChunk != null) {
      paramLong1 = paramMediaChunk.getNextChunkIndex();
    } else {
      paramLong1 = Util.constrainValue(paramRepresentationHolder.getSegmentNum(paramLong1), paramLong2, paramLong3);
    }
    return paramLong1;
  }
  
  private long resolveTimeToLiveEdgeUs(long paramLong)
  {
    boolean bool = manifest.dynamic;
    long l = -9223372036854775807L;
    int i;
    if ((bool) && (liveEdgeTimeUs != -9223372036854775807L)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      l = liveEdgeTimeUs - paramLong;
    }
    return l;
  }
  
  private void updateLiveEdgeTimeUs(RepresentationHolder paramRepresentationHolder, long paramLong)
  {
    if (manifest.dynamic) {
      paramLong = paramRepresentationHolder.getSegmentEndTimeUs(paramLong);
    } else {
      paramLong = -9223372036854775807L;
    }
    liveEdgeTimeUs = paramLong;
  }
  
  public long getAdjustedSeekPositionUs(long paramLong, SeekParameters paramSeekParameters)
  {
    for (RepresentationHolder localRepresentationHolder : representationHolders) {
      if (segmentIndex != null)
      {
        long l1 = localRepresentationHolder.getSegmentNum(paramLong);
        long l2 = localRepresentationHolder.getSegmentStartTimeUs(l1);
        if ((l2 < paramLong) && (l1 < localRepresentationHolder.getSegmentCount() - 1)) {
          l1 = localRepresentationHolder.getSegmentStartTimeUs(l1 + 1L);
        } else {
          l1 = l2;
        }
        return Util.resolveSeekPositionUs(paramLong, paramSeekParameters, l2, l1);
      }
    }
    return paramLong;
  }
  
  public void getNextChunk(long paramLong1, long paramLong2, List<? extends MediaChunk> paramList, ChunkHolder paramChunkHolder)
  {
    if (fatalError != null) {
      return;
    }
    long l1 = resolveTimeToLiveEdgeUs(paramLong1);
    long l2 = C.msToUs(manifest.availabilityStartTimeMs);
    long l3 = C.msToUs(manifest.getPeriod(periodIndex).startMs);
    Object localObject1 = playerTrackEmsgHandler;
    if ((localObject1 != null) && (((PlayerEmsgHandler.PlayerTrackEmsgHandler)localObject1).maybeRefreshManifestBeforeLoadingNextChunk(l3 + l2 + paramLong2))) {
      return;
    }
    l2 = getNowUnixTimeUs();
    MediaChunk localMediaChunk;
    if (paramList.isEmpty()) {
      localMediaChunk = null;
    } else {
      localMediaChunk = (MediaChunk)paramList.get(paramList.size() - 1);
    }
    int i = trackSelection.length();
    localObject1 = new MediaChunkIterator[i];
    int j = 1;
    Object localObject2;
    for (int m = 0; m < i; m++)
    {
      localRepresentationHolder = representationHolders[m];
      if (segmentIndex == null)
      {
        localObject1[m] = MediaChunkIterator.EMPTY;
      }
      else
      {
        long l4 = localRepresentationHolder.getFirstAvailableSegmentNum(manifest, periodIndex, l2);
        long l5 = localRepresentationHolder.getLastAvailableSegmentNum(manifest, periodIndex, l2);
        j = m;
        localObject2 = localObject1;
        l3 = getSegmentNum(localRepresentationHolder, localMediaChunk, paramLong2, l4, l5);
        if (l3 < l4) {
          localObject2[j] = MediaChunkIterator.EMPTY;
        } else {
          localObject2[j] = new RepresentationSegmentIterator(localRepresentationHolder, l3, l5);
        }
        j = 1;
      }
    }
    trackSelection.updateSelectedTrack(paramLong1, paramLong2 - paramLong1, l1, paramList, (MediaChunkIterator[])localObject1);
    RepresentationHolder localRepresentationHolder = representationHolders[trackSelection.getSelectedIndex()];
    localObject1 = extractorWrapper;
    if (localObject1 != null)
    {
      localObject2 = representation;
      if (((ChunkExtractorWrapper)localObject1).getSampleFormats() == null) {
        localObject1 = ((Representation)localObject2).getInitializationUri();
      } else {
        localObject1 = null;
      }
      if (segmentIndex == null) {
        localObject2 = ((Representation)localObject2).getIndexUri();
      } else {
        localObject2 = null;
      }
      if ((localObject1 != null) || (localObject2 != null))
      {
        chunk = newInitializationChunk(localRepresentationHolder, dataSource, trackSelection.getSelectedFormat(), trackSelection.getSelectionReason(), trackSelection.getSelectionData(), (RangedUri)localObject1, (RangedUri)localObject2);
        return;
      }
    }
    if (localRepresentationHolder.getSegmentCount() == 0)
    {
      paramList = manifest;
      m = j;
      if (dynamic) {
        if (periodIndex < paramList.getPeriodCount() - j) {
          m = j;
        } else {
          m = 0;
        }
      }
      endOfStream = m;
      return;
    }
    l1 = localRepresentationHolder.getFirstAvailableSegmentNum(manifest, periodIndex, l2);
    l2 = localRepresentationHolder.getLastAvailableSegmentNum(manifest, periodIndex, l2);
    updateLiveEdgeTimeUs(localRepresentationHolder, l2);
    m = j;
    paramLong1 = getSegmentNum(localRepresentationHolder, localMediaChunk, paramLong2, l1, l2);
    if (paramLong1 < l1)
    {
      fatalError = new BehindLiveWindowException();
      return;
    }
    boolean bool1 = paramLong1 < l2;
    if ((!bool1) && ((!missingLastSegment) || (bool1)))
    {
      l1 = RepresentationHolder.access$000(localRepresentationHolder);
      boolean bool2 = l1 < -9223372036854775807L;
      if ((bool2) && (localRepresentationHolder.getSegmentStartTimeUs(paramLong1) >= l1))
      {
        endOfStream = m;
        return;
      }
      k = (int)Math.min(maxSegmentsPerLoad, l2 - paramLong1 + 1L);
      i = k;
      if (bool2) {
        for (;;)
        {
          i = k;
          if (k <= m) {
            break;
          }
          i = k;
          if (localRepresentationHolder.getSegmentStartTimeUs(k + paramLong1 - 1L) < l1) {
            break;
          }
          k--;
        }
      }
      if (!paramList.isEmpty()) {
        paramLong2 = -9223372036854775807L;
      }
      chunk = newMediaChunk(localRepresentationHolder, dataSource, trackType, trackSelection.getSelectedFormat(), trackSelection.getSelectionReason(), trackSelection.getSelectionData(), paramLong1, i, paramLong2);
      return;
    }
    paramList = manifest;
    int k = m;
    if (dynamic) {
      if (periodIndex < paramList.getPeriodCount() - m) {
        k = m;
      } else {
        k = 0;
      }
    }
    endOfStream = k;
  }
  
  public int getPreferredQueueSize(long paramLong, List<? extends MediaChunk> paramList)
  {
    if ((fatalError == null) && (trackSelection.length() >= 2)) {
      return trackSelection.evaluateQueueSize(paramLong, paramList);
    }
    return paramList.size();
  }
  
  public void maybeThrowError()
    throws IOException
  {
    IOException localIOException = fatalError;
    if (localIOException == null)
    {
      manifestLoaderErrorThrower.maybeThrowError();
      return;
    }
    throw localIOException;
  }
  
  public Chunk newInitializationChunk(RepresentationHolder paramRepresentationHolder, DataSource paramDataSource, Format paramFormat, int paramInt, Object paramObject, RangedUri paramRangedUri1, RangedUri paramRangedUri2)
  {
    String str = representation.baseUrl;
    RangedUri localRangedUri = paramRangedUri2;
    if (paramRangedUri1 != null)
    {
      paramRangedUri2 = paramRangedUri1.attemptMerge(paramRangedUri2, str);
      localRangedUri = paramRangedUri2;
      if (paramRangedUri2 == null) {}
    }
    else
    {
      paramRangedUri1 = localRangedUri;
    }
    return new InitializationChunk(paramDataSource, new DataSpec(paramRangedUri1.resolveUri(str), start, length, representation.getCacheKey()), paramFormat, paramInt, paramObject, extractorWrapper);
  }
  
  public Chunk newMediaChunk(RepresentationHolder paramRepresentationHolder, DataSource paramDataSource, int paramInt1, Format paramFormat, int paramInt2, Object paramObject, long paramLong1, int paramInt3, long paramLong2)
  {
    Representation localRepresentation = representation;
    long l1 = paramRepresentationHolder.getSegmentStartTimeUs(paramLong1);
    Object localObject = paramRepresentationHolder.getSegmentUrl(paramLong1);
    String str = baseUrl;
    if (extractorWrapper == null)
    {
      paramLong2 = paramRepresentationHolder.getSegmentEndTimeUs(paramLong1);
      return new SingleSampleMediaChunk(paramDataSource, new DataSpec(((RangedUri)localObject).resolveUri(str), start, length, localRepresentation.getCacheKey()), paramFormat, paramInt2, paramObject, l1, paramLong2, paramLong1, paramInt1, paramFormat);
    }
    int i = 1;
    paramInt1 = 1;
    while (i < paramInt3)
    {
      RangedUri localRangedUri = ((RangedUri)localObject).attemptMerge(paramRepresentationHolder.getSegmentUrl(i + paramLong1), str);
      if (localRangedUri == null) {
        break;
      }
      paramInt1++;
      i++;
      localObject = localRangedUri;
    }
    long l2 = paramRepresentationHolder.getSegmentEndTimeUs(paramInt1 + paramLong1 - 1L);
    long l3 = RepresentationHolder.access$000(paramRepresentationHolder);
    if ((l3 == -9223372036854775807L) || (l3 > l2)) {
      l3 = -9223372036854775807L;
    }
    return new ContainerMediaChunk(paramDataSource, new DataSpec(((RangedUri)localObject).resolveUri(str), start, length, localRepresentation.getCacheKey()), paramFormat, paramInt2, paramObject, l1, l2, paramLong2, l3, paramLong1, paramInt1, -presentationTimeOffsetUs, extractorWrapper);
  }
  
  public void onChunkLoadCompleted(Chunk paramChunk)
  {
    if ((paramChunk instanceof InitializationChunk))
    {
      localObject = (InitializationChunk)paramChunk;
      int i = trackSelection.indexOf(trackFormat);
      RepresentationHolder localRepresentationHolder = representationHolders[i];
      if (segmentIndex == null)
      {
        localObject = extractorWrapper.getSeekMap();
        if (localObject != null) {
          representationHolders[i] = localRepresentationHolder.copyWithNewSegmentIndex(new DashWrappingSegmentIndex((ChunkIndex)localObject, representation.presentationTimeOffsetUs));
        }
      }
    }
    Object localObject = playerTrackEmsgHandler;
    if (localObject != null) {
      ((PlayerEmsgHandler.PlayerTrackEmsgHandler)localObject).onChunkLoadCompleted(paramChunk);
    }
  }
  
  public boolean onChunkLoadError(Chunk paramChunk, boolean paramBoolean, Exception paramException, long paramLong)
  {
    boolean bool = false;
    if (!paramBoolean) {
      return false;
    }
    PlayerEmsgHandler.PlayerTrackEmsgHandler localPlayerTrackEmsgHandler = playerTrackEmsgHandler;
    if ((localPlayerTrackEmsgHandler != null) && (localPlayerTrackEmsgHandler.maybeRefreshManifestOnLoadingError(paramChunk))) {
      return true;
    }
    if ((!manifest.dynamic) && ((paramChunk instanceof MediaChunk)) && ((paramException instanceof HttpDataSource.InvalidResponseCodeException)) && (responseCode == 404))
    {
      paramException = representationHolders[trackSelection.indexOf(trackFormat)];
      int i = paramException.getSegmentCount();
      if ((i != -1) && (i != 0))
      {
        long l1 = paramException.getFirstSegmentNum();
        long l2 = i;
        if (((MediaChunk)paramChunk).getNextChunkIndex() > l1 + l2 - 1L)
        {
          missingLastSegment = true;
          return true;
        }
      }
    }
    paramBoolean = bool;
    if (paramLong != -9223372036854775807L)
    {
      paramException = trackSelection;
      paramBoolean = bool;
      if (paramException.blacklist(paramException.indexOf(trackFormat), paramLong)) {
        paramBoolean = true;
      }
    }
    return paramBoolean;
  }
  
  public void updateManifest(DashManifest paramDashManifest, int paramInt)
  {
    try
    {
      manifest = paramDashManifest;
      periodIndex = paramInt;
      long l = paramDashManifest.getPeriodDurationUs(paramInt);
      ArrayList localArrayList = getRepresentations();
      for (paramInt = 0; paramInt < representationHolders.length; paramInt++)
      {
        Representation localRepresentation = (Representation)localArrayList.get(trackSelection.getIndexInTrackGroup(paramInt));
        paramDashManifest = representationHolders;
        paramDashManifest[paramInt] = paramDashManifest[paramInt].copyWithNewRepresentation(l, localRepresentation);
      }
      return;
    }
    catch (BehindLiveWindowException paramDashManifest)
    {
      fatalError = paramDashManifest;
    }
  }
  
  public static final class Factory
    implements DashChunkSource.Factory
  {
    private final DataSource.Factory dataSourceFactory;
    private final int maxSegmentsPerLoad;
    
    public Factory(DataSource.Factory paramFactory)
    {
      this(paramFactory, 1);
    }
    
    public Factory(DataSource.Factory paramFactory, int paramInt)
    {
      dataSourceFactory = paramFactory;
      maxSegmentsPerLoad = paramInt;
    }
    
    public DashChunkSource createDashChunkSource(LoaderErrorThrower paramLoaderErrorThrower, DashManifest paramDashManifest, int paramInt1, int[] paramArrayOfInt, TrackSelection paramTrackSelection, int paramInt2, long paramLong, boolean paramBoolean1, boolean paramBoolean2, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler paramPlayerTrackEmsgHandler, @Nullable TransferListener paramTransferListener)
    {
      DataSource localDataSource = dataSourceFactory.createDataSource();
      if (paramTransferListener != null) {
        localDataSource.addTransferListener(paramTransferListener);
      }
      return new DefaultDashChunkSource(paramLoaderErrorThrower, paramDashManifest, paramInt1, paramArrayOfInt, paramTrackSelection, paramInt2, localDataSource, paramLong, maxSegmentsPerLoad, paramBoolean1, paramBoolean2, paramPlayerTrackEmsgHandler);
    }
  }
  
  public static final class RepresentationHolder
  {
    @Nullable
    public final ChunkExtractorWrapper extractorWrapper;
    private final long periodDurationUs;
    public final Representation representation;
    @Nullable
    public final DashSegmentIndex segmentIndex;
    private final long segmentNumShift;
    
    public RepresentationHolder(long paramLong, int paramInt, Representation paramRepresentation, boolean paramBoolean1, boolean paramBoolean2, TrackOutput paramTrackOutput)
    {
      this(paramLong, paramRepresentation, createExtractorWrapper(paramInt, paramRepresentation, paramBoolean1, paramBoolean2, paramTrackOutput), 0L, paramRepresentation.getIndex());
    }
    
    private RepresentationHolder(long paramLong1, Representation paramRepresentation, @Nullable ChunkExtractorWrapper paramChunkExtractorWrapper, long paramLong2, @Nullable DashSegmentIndex paramDashSegmentIndex)
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
  
  public static final class RepresentationSegmentIterator
    extends BaseMediaChunkIterator
  {
    private final DefaultDashChunkSource.RepresentationHolder representationHolder;
    
    public RepresentationSegmentIterator(DefaultDashChunkSource.RepresentationHolder paramRepresentationHolder, long paramLong1, long paramLong2)
    {
      super(paramLong2);
      representationHolder = paramRepresentationHolder;
    }
    
    public long getChunkEndTimeUs()
    {
      checkInBounds();
      return representationHolder.getSegmentEndTimeUs(getCurrentIndex());
    }
    
    public long getChunkStartTimeUs()
    {
      checkInBounds();
      return representationHolder.getSegmentStartTimeUs(getCurrentIndex());
    }
    
    public DataSpec getDataSpec()
    {
      checkInBounds();
      Object localObject1 = representationHolder;
      Object localObject2 = representation;
      RangedUri localRangedUri = ((DefaultDashChunkSource.RepresentationHolder)localObject1).getSegmentUrl(getCurrentIndex());
      localObject1 = localRangedUri.resolveUri(baseUrl);
      localObject2 = ((Representation)localObject2).getCacheKey();
      return new DataSpec((Uri)localObject1, start, length, (String)localObject2);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DefaultDashChunkSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */