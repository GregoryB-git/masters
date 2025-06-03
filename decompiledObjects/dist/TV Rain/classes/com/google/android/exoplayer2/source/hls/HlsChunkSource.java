package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.DataChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

class HlsChunkSource
{
  private final DataSource encryptionDataSource;
  private byte[] encryptionIv;
  private String encryptionIvString;
  private byte[] encryptionKey;
  private Uri encryptionKeyUri;
  private HlsMasterPlaylist.HlsUrl expectedPlaylistUrl;
  private final HlsExtractorFactory extractorFactory;
  private IOException fatalError;
  private boolean independentSegments;
  private boolean isTimestampMaster;
  private long liveEdgeInPeriodTimeUs;
  private final DataSource mediaDataSource;
  private final List<Format> muxedCaptionFormats;
  private final HlsPlaylistTracker playlistTracker;
  private byte[] scratchSpace;
  private boolean seenExpectedPlaylistError;
  private final TimestampAdjusterProvider timestampAdjusterProvider;
  private final TrackGroup trackGroup;
  private TrackSelection trackSelection;
  private final HlsMasterPlaylist.HlsUrl[] variants;
  
  public HlsChunkSource(HlsExtractorFactory paramHlsExtractorFactory, HlsPlaylistTracker paramHlsPlaylistTracker, HlsMasterPlaylist.HlsUrl[] paramArrayOfHlsUrl, HlsDataSourceFactory paramHlsDataSourceFactory, @Nullable TransferListener paramTransferListener, TimestampAdjusterProvider paramTimestampAdjusterProvider, List<Format> paramList)
  {
    extractorFactory = paramHlsExtractorFactory;
    playlistTracker = paramHlsPlaylistTracker;
    variants = paramArrayOfHlsUrl;
    timestampAdjusterProvider = paramTimestampAdjusterProvider;
    muxedCaptionFormats = paramList;
    liveEdgeInPeriodTimeUs = -9223372036854775807L;
    paramHlsPlaylistTracker = new Format[paramArrayOfHlsUrl.length];
    paramHlsExtractorFactory = new int[paramArrayOfHlsUrl.length];
    for (int i = 0; i < paramArrayOfHlsUrl.length; i++)
    {
      paramHlsPlaylistTracker[i] = format;
      paramHlsExtractorFactory[i] = i;
    }
    paramArrayOfHlsUrl = paramHlsDataSourceFactory.createDataSource(1);
    mediaDataSource = paramArrayOfHlsUrl;
    if (paramTransferListener != null) {
      paramArrayOfHlsUrl.addTransferListener(paramTransferListener);
    }
    encryptionDataSource = paramHlsDataSourceFactory.createDataSource(3);
    paramHlsPlaylistTracker = new TrackGroup(paramHlsPlaylistTracker);
    trackGroup = paramHlsPlaylistTracker;
    trackSelection = new InitializationTrackSelection(paramHlsPlaylistTracker, paramHlsExtractorFactory);
  }
  
  private void clearEncryptionData()
  {
    encryptionKeyUri = null;
    encryptionKey = null;
    encryptionIvString = null;
    encryptionIv = null;
  }
  
  private long getChunkMediaSequence(@Nullable HlsMediaChunk paramHlsMediaChunk, boolean paramBoolean, HlsMediaPlaylist paramHlsMediaPlaylist, long paramLong1, long paramLong2)
  {
    if ((paramHlsMediaChunk != null) && (!paramBoolean)) {
      return paramHlsMediaChunk.getNextChunkIndex();
    }
    long l1 = durationUs;
    long l2 = paramLong2;
    if (paramHlsMediaChunk != null) {
      if (independentSegments) {
        l2 = paramLong2;
      } else {
        l2 = startTimeUs;
      }
    }
    if ((!hasEndTag) && (l2 >= l1 + paramLong1)) {
      paramLong2 = mediaSequence;
    }
    for (paramLong1 = segments.size();; paramLong1 = mediaSequence)
    {
      return paramLong2 + paramLong1;
      List localList = segments;
      if ((playlistTracker.isLive()) && (paramHlsMediaChunk != null)) {
        paramBoolean = false;
      } else {
        paramBoolean = true;
      }
      paramLong2 = Util.binarySearchFloor(localList, Long.valueOf(l2 - paramLong1), true, paramBoolean);
    }
  }
  
  private EncryptionKeyChunk newEncryptionKeyChunk(Uri paramUri, String paramString, int paramInt1, int paramInt2, Object paramObject)
  {
    paramUri = new DataSpec(paramUri, 0L, -1L, null, 1);
    return new EncryptionKeyChunk(encryptionDataSource, paramUri, variants[paramInt1].format, paramInt2, paramObject, scratchSpace, paramString);
  }
  
  private long resolveTimeToLiveEdgeUs(long paramLong)
  {
    long l1 = liveEdgeInPeriodTimeUs;
    long l2 = -9223372036854775807L;
    int i;
    if (l1 != -9223372036854775807L) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      l2 = l1 - paramLong;
    }
    return l2;
  }
  
  private void setEncryptionData(Uri paramUri, String paramString, byte[] paramArrayOfByte)
  {
    if (Util.toLowerInvariant(paramString).startsWith("0x")) {
      localObject = paramString.substring(2);
    } else {
      localObject = paramString;
    }
    Object localObject = new BigInteger((String)localObject, 16).toByteArray();
    byte[] arrayOfByte = new byte[16];
    int i;
    if (localObject.length > 16) {
      i = localObject.length - 16;
    } else {
      i = 0;
    }
    System.arraycopy(localObject, i, arrayOfByte, 16 - localObject.length + i, localObject.length - i);
    encryptionKeyUri = paramUri;
    encryptionKey = paramArrayOfByte;
    encryptionIvString = paramString;
    encryptionIv = arrayOfByte;
  }
  
  private void updateLiveEdgeTimeUs(HlsMediaPlaylist paramHlsMediaPlaylist)
  {
    long l;
    if (hasEndTag) {
      l = -9223372036854775807L;
    } else {
      l = paramHlsMediaPlaylist.getEndTimeUs() - playlistTracker.getInitialStartTimeUs();
    }
    liveEdgeInPeriodTimeUs = l;
  }
  
  public MediaChunkIterator[] createMediaChunkIterators(@Nullable HlsMediaChunk paramHlsMediaChunk, long paramLong)
  {
    int i;
    if (paramHlsMediaChunk == null) {
      i = -1;
    } else {
      i = trackGroup.indexOf(trackFormat);
    }
    int j = trackSelection.length();
    MediaChunkIterator[] arrayOfMediaChunkIterator = new MediaChunkIterator[j];
    for (int k = 0; k < j; k++)
    {
      int m = trackSelection.getIndexInTrackGroup(k);
      Object localObject = variants[m];
      if (!playlistTracker.isSnapshotValid((HlsMasterPlaylist.HlsUrl)localObject))
      {
        arrayOfMediaChunkIterator[k] = MediaChunkIterator.EMPTY;
      }
      else
      {
        localObject = playlistTracker.getPlaylistSnapshot((HlsMasterPlaylist.HlsUrl)localObject);
        long l1 = startTimeUs - playlistTracker.getInitialStartTimeUs();
        boolean bool;
        if (m != i) {
          bool = true;
        } else {
          bool = false;
        }
        long l2 = getChunkMediaSequence(paramHlsMediaChunk, bool, (HlsMediaPlaylist)localObject, l1, paramLong);
        long l3 = mediaSequence;
        if (l2 < l3) {
          arrayOfMediaChunkIterator[k] = MediaChunkIterator.EMPTY;
        } else {
          arrayOfMediaChunkIterator[k] = new HlsMediaPlaylistSegmentIterator((HlsMediaPlaylist)localObject, l1, (int)(l2 - l3));
        }
      }
    }
    return arrayOfMediaChunkIterator;
  }
  
  public void getNextChunk(long paramLong1, long paramLong2, List<HlsMediaChunk> paramList, HlsChunkHolder paramHlsChunkHolder)
  {
    HlsMediaChunk localHlsMediaChunk;
    if (paramList.isEmpty()) {
      localHlsMediaChunk = null;
    } else {
      localHlsMediaChunk = (HlsMediaChunk)paramList.get(paramList.size() - 1);
    }
    if (localHlsMediaChunk == null) {
      i = -1;
    } else {
      i = trackGroup.indexOf(trackFormat);
    }
    long l1 = paramLong2 - paramLong1;
    long l2 = resolveTimeToLiveEdgeUs(paramLong1);
    long l3 = l1;
    long l4 = l2;
    if (localHlsMediaChunk != null)
    {
      l3 = l1;
      l4 = l2;
      if (!independentSegments)
      {
        long l5 = localHlsMediaChunk.getDurationUs();
        l1 = Math.max(0L, l1 - l5);
        l3 = l1;
        l4 = l2;
        if (l2 != -9223372036854775807L)
        {
          l4 = Math.max(0L, l2 - l5);
          l3 = l1;
        }
      }
    }
    Object localObject1 = createMediaChunkIterators(localHlsMediaChunk, paramLong2);
    trackSelection.updateSelectedTrack(paramLong1, l3, l4, paramList, (MediaChunkIterator[])localObject1);
    int j = trackSelection.getSelectedIndexInTrackGroup();
    int k = 0;
    int m = 0;
    int n;
    if (i != j) {
      n = 1;
    } else {
      n = 0;
    }
    paramList = variants[j];
    if (!playlistTracker.isSnapshotValid(paramList))
    {
      playlist = paramList;
      n = seenExpectedPlaylistError;
      i = m;
      if (expectedPlaylistUrl == paramList) {
        i = 1;
      }
      seenExpectedPlaylistError = (n & i);
      expectedPlaylistUrl = paramList;
      return;
    }
    localObject1 = playlistTracker.getPlaylistSnapshot(paramList);
    independentSegments = hasIndependentSegments;
    updateLiveEdgeTimeUs((HlsMediaPlaylist)localObject1);
    l3 = startTimeUs - playlistTracker.getInitialStartTimeUs();
    paramLong1 = getChunkMediaSequence(localHlsMediaChunk, n, (HlsMediaPlaylist)localObject1, l3, paramLong2);
    if (paramLong1 < mediaSequence)
    {
      if ((localHlsMediaChunk != null) && (n != 0))
      {
        paramList = variants[i];
        localObject1 = playlistTracker.getPlaylistSnapshot(paramList);
        l3 = startTimeUs;
        paramLong2 = playlistTracker.getInitialStartTimeUs();
        paramLong1 = localHlsMediaChunk.getNextChunkIndex();
        paramLong2 = l3 - paramLong2;
      }
      else
      {
        fatalError = new BehindLiveWindowException();
      }
    }
    else
    {
      i = j;
      paramLong2 = l3;
    }
    m = (int)(paramLong1 - mediaSequence);
    if (m >= segments.size())
    {
      if (hasEndTag)
      {
        endOfStream = true;
      }
      else
      {
        playlist = paramList;
        int i1 = seenExpectedPlaylistError;
        i = k;
        if (expectedPlaylistUrl == paramList) {
          i = 1;
        }
        seenExpectedPlaylistError = (i1 & i);
        expectedPlaylistUrl = paramList;
      }
      return;
    }
    seenExpectedPlaylistError = false;
    DataSpec localDataSpec = null;
    expectedPlaylistUrl = null;
    HlsMediaPlaylist.Segment localSegment = (HlsMediaPlaylist.Segment)segments.get(m);
    Object localObject2 = fullSegmentEncryptionKeyUri;
    if (localObject2 != null)
    {
      localObject2 = UriUtil.resolveToUri(baseUri, (String)localObject2);
      if (!((Uri)localObject2).equals(encryptionKeyUri))
      {
        chunk = newEncryptionKeyChunk((Uri)localObject2, encryptionIV, i, trackSelection.getSelectionReason(), trackSelection.getSelectionData());
        return;
      }
      if (!Util.areEqual(encryptionIV, encryptionIvString)) {
        setEncryptionData((Uri)localObject2, encryptionIV, encryptionKey);
      }
    }
    else
    {
      clearEncryptionData();
    }
    localObject2 = initializationSegment;
    if (localObject2 != null) {
      localDataSpec = new DataSpec(UriUtil.resolveToUri(baseUri, url), byterangeOffset, byterangeLength, null);
    }
    paramLong2 = relativeStartTimeUs + paramLong2;
    int i = discontinuitySequence + relativeDiscontinuitySequence;
    localObject2 = timestampAdjusterProvider.getAdjuster(i);
    localObject1 = new DataSpec(UriUtil.resolveToUri(baseUri, url), byterangeOffset, byterangeLength, null);
    chunk = new HlsMediaChunk(extractorFactory, mediaDataSource, (DataSpec)localObject1, localDataSpec, paramList, muxedCaptionFormats, trackSelection.getSelectionReason(), trackSelection.getSelectionData(), paramLong2, paramLong2 + durationUs, paramLong1, i, hasGapTag, isTimestampMaster, (TimestampAdjuster)localObject2, localHlsMediaChunk, drmInitData, encryptionKey, encryptionIv);
  }
  
  public TrackGroup getTrackGroup()
  {
    return trackGroup;
  }
  
  public TrackSelection getTrackSelection()
  {
    return trackSelection;
  }
  
  public boolean maybeBlacklistTrack(Chunk paramChunk, long paramLong)
  {
    TrackSelection localTrackSelection = trackSelection;
    return localTrackSelection.blacklist(localTrackSelection.indexOf(trackGroup.indexOf(trackFormat)), paramLong);
  }
  
  public void maybeThrowError()
    throws IOException
  {
    Object localObject = fatalError;
    if (localObject == null)
    {
      localObject = expectedPlaylistUrl;
      if ((localObject != null) && (seenExpectedPlaylistError)) {
        playlistTracker.maybeThrowPlaylistRefreshError((HlsMasterPlaylist.HlsUrl)localObject);
      }
      return;
    }
    throw ((Throwable)localObject);
  }
  
  public void onChunkLoadCompleted(Chunk paramChunk)
  {
    if ((paramChunk instanceof EncryptionKeyChunk))
    {
      paramChunk = (EncryptionKeyChunk)paramChunk;
      scratchSpace = paramChunk.getDataHolder();
      setEncryptionData(dataSpec.uri, iv, paramChunk.getResult());
    }
  }
  
  public boolean onPlaylistError(HlsMasterPlaylist.HlsUrl paramHlsUrl, long paramLong)
  {
    int i = trackGroup.indexOf(format);
    int j = 1;
    if (i == -1) {
      return true;
    }
    int k = trackSelection.indexOf(i);
    if (k == -1) {
      return true;
    }
    int m = seenExpectedPlaylistError;
    if (expectedPlaylistUrl == paramHlsUrl) {
      i = 1;
    } else {
      i = 0;
    }
    seenExpectedPlaylistError = (i | m);
    m = j;
    boolean bool;
    if (paramLong != -9223372036854775807L) {
      if (trackSelection.blacklist(k, paramLong)) {
        m = j;
      } else {
        bool = false;
      }
    }
    return bool;
  }
  
  public void reset()
  {
    fatalError = null;
  }
  
  public void selectTracks(TrackSelection paramTrackSelection)
  {
    trackSelection = paramTrackSelection;
  }
  
  public void setIsTimestampMaster(boolean paramBoolean)
  {
    isTimestampMaster = paramBoolean;
  }
  
  public static final class EncryptionKeyChunk
    extends DataChunk
  {
    public final String iv;
    private byte[] result;
    
    public EncryptionKeyChunk(DataSource paramDataSource, DataSpec paramDataSpec, Format paramFormat, int paramInt, Object paramObject, byte[] paramArrayOfByte, String paramString)
    {
      super(paramDataSpec, 3, paramFormat, paramInt, paramObject, paramArrayOfByte);
      iv = paramString;
    }
    
    public void consume(byte[] paramArrayOfByte, int paramInt)
      throws IOException
    {
      result = Arrays.copyOf(paramArrayOfByte, paramInt);
    }
    
    public byte[] getResult()
    {
      return result;
    }
  }
  
  public static final class HlsChunkHolder
  {
    public Chunk chunk;
    public boolean endOfStream;
    public HlsMasterPlaylist.HlsUrl playlist;
    
    public HlsChunkHolder()
    {
      clear();
    }
    
    public void clear()
    {
      chunk = null;
      endOfStream = false;
      playlist = null;
    }
  }
  
  public static final class HlsMediaPlaylistSegmentIterator
    extends BaseMediaChunkIterator
  {
    private final HlsMediaPlaylist playlist;
    private final long startOfPlaylistInPeriodUs;
    
    public HlsMediaPlaylistSegmentIterator(HlsMediaPlaylist paramHlsMediaPlaylist, long paramLong, int paramInt)
    {
      super(segments.size() - 1);
      playlist = paramHlsMediaPlaylist;
      startOfPlaylistInPeriodUs = paramLong;
    }
    
    public long getChunkEndTimeUs()
    {
      checkInBounds();
      HlsMediaPlaylist.Segment localSegment = (HlsMediaPlaylist.Segment)playlist.segments.get((int)getCurrentIndex());
      return startOfPlaylistInPeriodUs + relativeStartTimeUs + durationUs;
    }
    
    public long getChunkStartTimeUs()
    {
      checkInBounds();
      HlsMediaPlaylist.Segment localSegment = (HlsMediaPlaylist.Segment)playlist.segments.get((int)getCurrentIndex());
      return startOfPlaylistInPeriodUs + relativeStartTimeUs;
    }
    
    public DataSpec getDataSpec()
    {
      checkInBounds();
      HlsMediaPlaylist.Segment localSegment = (HlsMediaPlaylist.Segment)playlist.segments.get((int)getCurrentIndex());
      return new DataSpec(UriUtil.resolveToUri(playlist.baseUri, url), byterangeOffset, byterangeLength, null);
    }
  }
  
  public static final class InitializationTrackSelection
    extends BaseTrackSelection
  {
    private int selectedIndex = indexOf(paramTrackGroup.getFormat(0));
    
    public InitializationTrackSelection(TrackGroup paramTrackGroup, int[] paramArrayOfInt)
    {
      super(paramArrayOfInt);
    }
    
    public int getSelectedIndex()
    {
      return selectedIndex;
    }
    
    public Object getSelectionData()
    {
      return null;
    }
    
    public int getSelectionReason()
    {
      return 0;
    }
    
    public void updateSelectedTrack(long paramLong1, long paramLong2, long paramLong3, List<? extends MediaChunk> paramList, MediaChunkIterator[] paramArrayOfMediaChunkIterator)
    {
      paramLong1 = SystemClock.elapsedRealtime();
      if (!isBlacklisted(selectedIndex, paramLong1)) {
        return;
      }
      for (int i = length - 1; i >= 0; i--) {
        if (!isBlacklisted(i, paramLong1))
        {
          selectedIndex = i;
          return;
        }
      }
      throw new IllegalStateException();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsChunkSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */