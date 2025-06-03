package com.google.android.exoplayer2.source.hls;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class HlsMediaChunk
  extends MediaChunk
{
  private static final String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
  private static final AtomicInteger uidSource = new AtomicInteger();
  public final int discontinuitySequenceNumber;
  private final DrmInitData drmInitData;
  private Extractor extractor;
  private final HlsExtractorFactory extractorFactory;
  private final boolean hasGapTag;
  public final HlsMasterPlaylist.HlsUrl hlsUrl;
  private final ParsableByteArray id3Data;
  private final Id3Decoder id3Decoder;
  private final DataSource initDataSource;
  private final DataSpec initDataSpec;
  private boolean initLoadCompleted;
  private int initSegmentBytesLoaded;
  private final boolean isEncrypted;
  private final boolean isMasterTimestampSource;
  private volatile boolean loadCanceled;
  private boolean loadCompleted;
  private final List<Format> muxedCaptionFormats;
  private int nextLoadPosition;
  private HlsSampleStreamWrapper output;
  private final Extractor previousExtractor;
  private final boolean shouldSpliceIn;
  private final TimestampAdjuster timestampAdjuster;
  public final int uid;
  
  public HlsMediaChunk(HlsExtractorFactory paramHlsExtractorFactory, DataSource paramDataSource, DataSpec paramDataSpec1, DataSpec paramDataSpec2, HlsMasterPlaylist.HlsUrl paramHlsUrl, List<Format> paramList, int paramInt1, Object paramObject, long paramLong1, long paramLong2, long paramLong3, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, TimestampAdjuster paramTimestampAdjuster, HlsMediaChunk paramHlsMediaChunk, DrmInitData paramDrmInitData, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    super(buildDataSource(paramDataSource, paramArrayOfByte1, paramArrayOfByte2), paramDataSpec1, format, paramInt1, paramObject, paramLong1, paramLong2, paramLong3);
    discontinuitySequenceNumber = paramInt2;
    initDataSpec = paramDataSpec2;
    hlsUrl = paramHlsUrl;
    isMasterTimestampSource = paramBoolean2;
    timestampAdjuster = paramTimestampAdjuster;
    boolean bool = true;
    if (paramArrayOfByte1 != null) {
      paramBoolean2 = true;
    } else {
      paramBoolean2 = false;
    }
    isEncrypted = paramBoolean2;
    hasGapTag = paramBoolean1;
    extractorFactory = paramHlsExtractorFactory;
    muxedCaptionFormats = paramList;
    drmInitData = paramDrmInitData;
    paramDataSpec1 = null;
    if (paramHlsMediaChunk != null)
    {
      id3Decoder = id3Decoder;
      id3Data = id3Data;
      paramBoolean1 = bool;
      if (hlsUrl == paramHlsUrl) {
        if (!loadCompleted) {
          paramBoolean1 = bool;
        } else {
          paramBoolean1 = false;
        }
      }
      shouldSpliceIn = paramBoolean1;
      paramHlsExtractorFactory = paramDataSpec1;
      if (discontinuitySequenceNumber == paramInt2) {
        if (paramBoolean1) {
          paramHlsExtractorFactory = paramDataSpec1;
        } else {
          paramHlsExtractorFactory = extractor;
        }
      }
    }
    else
    {
      id3Decoder = new Id3Decoder();
      id3Data = new ParsableByteArray(10);
      shouldSpliceIn = false;
      paramHlsExtractorFactory = paramDataSpec1;
    }
    previousExtractor = paramHlsExtractorFactory;
    initDataSource = paramDataSource;
    uid = uidSource.getAndIncrement();
  }
  
  private static DataSource buildDataSource(DataSource paramDataSource, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 != null) {
      return new Aes128DataSource(paramDataSource, paramArrayOfByte1, paramArrayOfByte2);
    }
    return paramDataSource;
  }
  
  /* Error */
  private void loadMedia()
    throws IOException, InterruptedException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 83	com/google/android/exoplayer2/source/hls/HlsMediaChunk:isEncrypted	Z
    //   4: istore_1
    //   5: iconst_0
    //   6: istore_2
    //   7: iload_1
    //   8: ifeq +27 -> 35
    //   11: aload_0
    //   12: getfield 136	com/google/android/exoplayer2/source/chunk/Chunk:dataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   15: astore_3
    //   16: aload_3
    //   17: astore 4
    //   19: aload_0
    //   20: getfield 138	com/google/android/exoplayer2/source/hls/HlsMediaChunk:nextLoadPosition	I
    //   23: ifeq +26 -> 49
    //   26: iconst_1
    //   27: istore 5
    //   29: aload_3
    //   30: astore 4
    //   32: goto +20 -> 52
    //   35: aload_0
    //   36: getfield 136	com/google/android/exoplayer2/source/chunk/Chunk:dataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   39: aload_0
    //   40: getfield 138	com/google/android/exoplayer2/source/hls/HlsMediaChunk:nextLoadPosition	I
    //   43: i2l
    //   44: invokevirtual 144	com/google/android/exoplayer2/upstream/DataSpec:subrange	(J)Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   47: astore 4
    //   49: iconst_0
    //   50: istore 5
    //   52: aload_0
    //   53: getfield 79	com/google/android/exoplayer2/source/hls/HlsMediaChunk:isMasterTimestampSource	Z
    //   56: ifne +13 -> 69
    //   59: aload_0
    //   60: getfield 81	com/google/android/exoplayer2/source/hls/HlsMediaChunk:timestampAdjuster	Lcom/google/android/exoplayer2/util/TimestampAdjuster;
    //   63: invokevirtual 149	com/google/android/exoplayer2/util/TimestampAdjuster:waitUntilInitialized	()V
    //   66: goto +28 -> 94
    //   69: aload_0
    //   70: getfield 81	com/google/android/exoplayer2/source/hls/HlsMediaChunk:timestampAdjuster	Lcom/google/android/exoplayer2/util/TimestampAdjuster;
    //   73: invokevirtual 153	com/google/android/exoplayer2/util/TimestampAdjuster:getFirstSampleTimestampUs	()J
    //   76: ldc2_w 154
    //   79: lcmp
    //   80: ifne +14 -> 94
    //   83: aload_0
    //   84: getfield 81	com/google/android/exoplayer2/source/hls/HlsMediaChunk:timestampAdjuster	Lcom/google/android/exoplayer2/util/TimestampAdjuster;
    //   87: aload_0
    //   88: getfield 159	com/google/android/exoplayer2/source/chunk/Chunk:startTimeUs	J
    //   91: invokevirtual 163	com/google/android/exoplayer2/util/TimestampAdjuster:setFirstSampleTimestampUs	(J)V
    //   94: aload_0
    //   95: aload_0
    //   96: getfield 167	com/google/android/exoplayer2/source/chunk/Chunk:dataSource	Lcom/google/android/exoplayer2/upstream/StatsDataSource;
    //   99: aload 4
    //   101: invokespecial 171	com/google/android/exoplayer2/source/hls/HlsMediaChunk:prepareExtraction	(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSpec;)Lcom/google/android/exoplayer2/extractor/DefaultExtractorInput;
    //   104: astore 4
    //   106: iload_2
    //   107: istore 6
    //   109: iload 5
    //   111: ifeq +17 -> 128
    //   114: aload 4
    //   116: aload_0
    //   117: getfield 138	com/google/android/exoplayer2/source/hls/HlsMediaChunk:nextLoadPosition	I
    //   120: invokeinterface 176 2 0
    //   125: iload_2
    //   126: istore 6
    //   128: iload 6
    //   130: ifne +50 -> 180
    //   133: aload_0
    //   134: getfield 178	com/google/android/exoplayer2/source/hls/HlsMediaChunk:loadCanceled	Z
    //   137: ifne +43 -> 180
    //   140: aload_0
    //   141: getfield 101	com/google/android/exoplayer2/source/hls/HlsMediaChunk:extractor	Lcom/google/android/exoplayer2/extractor/Extractor;
    //   144: aload 4
    //   146: aconst_null
    //   147: invokeinterface 184 3 0
    //   152: istore 6
    //   154: goto -26 -> 128
    //   157: astore_3
    //   158: aload_0
    //   159: aload 4
    //   161: invokeinterface 187 1 0
    //   166: aload_0
    //   167: getfield 136	com/google/android/exoplayer2/source/chunk/Chunk:dataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   170: getfield 190	com/google/android/exoplayer2/upstream/DataSpec:absoluteStreamPosition	J
    //   173: lsub
    //   174: l2i
    //   175: putfield 138	com/google/android/exoplayer2/source/hls/HlsMediaChunk:nextLoadPosition	I
    //   178: aload_3
    //   179: athrow
    //   180: aload_0
    //   181: aload 4
    //   183: invokeinterface 187 1 0
    //   188: aload_0
    //   189: getfield 136	com/google/android/exoplayer2/source/chunk/Chunk:dataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   192: getfield 190	com/google/android/exoplayer2/upstream/DataSpec:absoluteStreamPosition	J
    //   195: lsub
    //   196: l2i
    //   197: putfield 138	com/google/android/exoplayer2/source/hls/HlsMediaChunk:nextLoadPosition	I
    //   200: aload_0
    //   201: getfield 167	com/google/android/exoplayer2/source/chunk/Chunk:dataSource	Lcom/google/android/exoplayer2/upstream/StatsDataSource;
    //   204: invokestatic 196	com/google/android/exoplayer2/util/Util:closeQuietly	(Lcom/google/android/exoplayer2/upstream/DataSource;)V
    //   207: return
    //   208: astore 4
    //   210: aload_0
    //   211: getfield 167	com/google/android/exoplayer2/source/chunk/Chunk:dataSource	Lcom/google/android/exoplayer2/upstream/StatsDataSource;
    //   214: invokestatic 196	com/google/android/exoplayer2/util/Util:closeQuietly	(Lcom/google/android/exoplayer2/upstream/DataSource;)V
    //   217: aload 4
    //   219: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	220	0	this	HlsMediaChunk
    //   4	4	1	bool	boolean
    //   6	120	2	i	int
    //   15	15	3	localDataSpec	DataSpec
    //   157	22	3	localObject1	Object
    //   17	165	4	localObject2	Object
    //   208	10	4	localObject3	Object
    //   27	83	5	j	int
    //   107	46	6	k	int
    // Exception table:
    //   from	to	target	type
    //   133	154	157	finally
    //   94	106	208	finally
    //   114	125	208	finally
    //   158	180	208	finally
    //   180	200	208	finally
  }
  
  /* Error */
  private void maybeLoadInitData()
    throws IOException, InterruptedException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 200	com/google/android/exoplayer2/source/hls/HlsMediaChunk:initLoadCompleted	Z
    //   4: ifne +123 -> 127
    //   7: aload_0
    //   8: getfield 75	com/google/android/exoplayer2/source/hls/HlsMediaChunk:initDataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnonnull +6 -> 19
    //   16: goto +111 -> 127
    //   19: aload_1
    //   20: aload_0
    //   21: getfield 202	com/google/android/exoplayer2/source/hls/HlsMediaChunk:initSegmentBytesLoaded	I
    //   24: i2l
    //   25: invokevirtual 144	com/google/android/exoplayer2/upstream/DataSpec:subrange	(J)Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   28: astore_1
    //   29: aload_0
    //   30: aload_0
    //   31: getfield 113	com/google/android/exoplayer2/source/hls/HlsMediaChunk:initDataSource	Lcom/google/android/exoplayer2/upstream/DataSource;
    //   34: aload_1
    //   35: invokespecial 171	com/google/android/exoplayer2/source/hls/HlsMediaChunk:prepareExtraction	(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSpec;)Lcom/google/android/exoplayer2/extractor/DefaultExtractorInput;
    //   38: astore_1
    //   39: iconst_0
    //   40: istore_2
    //   41: iload_2
    //   42: ifne +45 -> 87
    //   45: aload_0
    //   46: getfield 178	com/google/android/exoplayer2/source/hls/HlsMediaChunk:loadCanceled	Z
    //   49: ifne +38 -> 87
    //   52: aload_0
    //   53: getfield 101	com/google/android/exoplayer2/source/hls/HlsMediaChunk:extractor	Lcom/google/android/exoplayer2/extractor/Extractor;
    //   56: aload_1
    //   57: aconst_null
    //   58: invokeinterface 184 3 0
    //   63: istore_2
    //   64: goto -23 -> 41
    //   67: astore_3
    //   68: aload_0
    //   69: aload_1
    //   70: invokevirtual 205	com/google/android/exoplayer2/extractor/DefaultExtractorInput:getPosition	()J
    //   73: aload_0
    //   74: getfield 75	com/google/android/exoplayer2/source/hls/HlsMediaChunk:initDataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   77: getfield 190	com/google/android/exoplayer2/upstream/DataSpec:absoluteStreamPosition	J
    //   80: lsub
    //   81: l2i
    //   82: putfield 202	com/google/android/exoplayer2/source/hls/HlsMediaChunk:initSegmentBytesLoaded	I
    //   85: aload_3
    //   86: athrow
    //   87: aload_0
    //   88: aload_1
    //   89: invokevirtual 205	com/google/android/exoplayer2/extractor/DefaultExtractorInput:getPosition	()J
    //   92: aload_0
    //   93: getfield 75	com/google/android/exoplayer2/source/hls/HlsMediaChunk:initDataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   96: getfield 190	com/google/android/exoplayer2/upstream/DataSpec:absoluteStreamPosition	J
    //   99: lsub
    //   100: l2i
    //   101: putfield 202	com/google/android/exoplayer2/source/hls/HlsMediaChunk:initSegmentBytesLoaded	I
    //   104: aload_0
    //   105: getfield 113	com/google/android/exoplayer2/source/hls/HlsMediaChunk:initDataSource	Lcom/google/android/exoplayer2/upstream/DataSource;
    //   108: invokestatic 196	com/google/android/exoplayer2/util/Util:closeQuietly	(Lcom/google/android/exoplayer2/upstream/DataSource;)V
    //   111: aload_0
    //   112: iconst_1
    //   113: putfield 200	com/google/android/exoplayer2/source/hls/HlsMediaChunk:initLoadCompleted	Z
    //   116: return
    //   117: astore_1
    //   118: aload_0
    //   119: getfield 113	com/google/android/exoplayer2/source/hls/HlsMediaChunk:initDataSource	Lcom/google/android/exoplayer2/upstream/DataSource;
    //   122: invokestatic 196	com/google/android/exoplayer2/util/Util:closeQuietly	(Lcom/google/android/exoplayer2/upstream/DataSource;)V
    //   125: aload_1
    //   126: athrow
    //   127: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	this	HlsMediaChunk
    //   11	78	1	localObject1	Object
    //   117	9	1	localObject2	Object
    //   40	24	2	i	int
    //   67	19	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   45	64	67	finally
    //   29	39	117	finally
    //   68	87	117	finally
    //   87	104	117	finally
  }
  
  private long peekId3PrivTimestamp(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    paramExtractorInput.resetPeekPosition();
    if ((paramExtractorInput.getLength() >= 10L) && (paramExtractorInput.peekFully(id3Data.data, 0, 10, true)))
    {
      id3Data.reset(10);
      if (id3Data.readUnsignedInt24() != Id3Decoder.ID3_TAG) {
        return -9223372036854775807L;
      }
      id3Data.skipBytes(3);
      int i = id3Data.readSynchSafeInt();
      int j = i + 10;
      Object localObject;
      if (j > id3Data.capacity())
      {
        localObject = id3Data;
        byte[] arrayOfByte = data;
        ((ParsableByteArray)localObject).reset(j);
        System.arraycopy(arrayOfByte, 0, id3Data.data, 0, 10);
      }
      if (!paramExtractorInput.peekFully(id3Data.data, 10, i, true)) {
        return -9223372036854775807L;
      }
      paramExtractorInput = id3Decoder.decode(id3Data.data, i);
      if (paramExtractorInput == null) {
        return -9223372036854775807L;
      }
      i = paramExtractorInput.length();
      for (j = 0; j < i; j++)
      {
        localObject = paramExtractorInput.get(j);
        if ((localObject instanceof PrivFrame))
        {
          localObject = (PrivFrame)localObject;
          if ("com.apple.streaming.transportStreamTimestamp".equals(owner))
          {
            System.arraycopy(privateData, 0, id3Data.data, 0, 8);
            id3Data.reset(8);
            return id3Data.readLong() & 0x1FFFFFFFF;
          }
        }
      }
    }
    return -9223372036854775807L;
  }
  
  private DefaultExtractorInput prepareExtraction(DataSource paramDataSource, DataSpec paramDataSpec)
    throws IOException, InterruptedException
  {
    long l = paramDataSource.open(paramDataSpec);
    DefaultExtractorInput localDefaultExtractorInput = new DefaultExtractorInput(paramDataSource, absoluteStreamPosition, l);
    if (extractor == null)
    {
      l = peekId3PrivTimestamp(localDefaultExtractorInput);
      localDefaultExtractorInput.resetPeekPosition();
      paramDataSpec = extractorFactory.createExtractor(previousExtractor, uri, trackFormat, muxedCaptionFormats, drmInitData, timestampAdjuster, paramDataSource.getResponseHeaders(), localDefaultExtractorInput);
      Extractor localExtractor = (Extractor)first;
      extractor = localExtractor;
      paramDataSource = previousExtractor;
      boolean bool1 = true;
      boolean bool2;
      if (localExtractor == paramDataSource) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      if (((Boolean)second).booleanValue())
      {
        paramDataSource = output;
        if (l != -9223372036854775807L) {
          l = timestampAdjuster.adjustTsTimestamp(l);
        } else {
          l = startTimeUs;
        }
        paramDataSource.setSampleOffsetUs(l);
      }
      if ((!bool2) || (initDataSpec == null)) {
        bool1 = false;
      }
      initLoadCompleted = bool1;
      output.init(uid, shouldSpliceIn, bool2);
      if (!bool2) {
        extractor.init(output);
      }
    }
    return localDefaultExtractorInput;
  }
  
  public void cancelLoad()
  {
    loadCanceled = true;
  }
  
  public void init(HlsSampleStreamWrapper paramHlsSampleStreamWrapper)
  {
    output = paramHlsSampleStreamWrapper;
  }
  
  public boolean isLoadCompleted()
  {
    return loadCompleted;
  }
  
  public void load()
    throws IOException, InterruptedException
  {
    maybeLoadInitData();
    if (!loadCanceled)
    {
      if (!hasGapTag) {
        loadMedia();
      }
      loadCompleted = true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsMediaChunk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */