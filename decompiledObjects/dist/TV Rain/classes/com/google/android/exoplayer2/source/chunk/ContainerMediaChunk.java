package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;

public class ContainerMediaChunk
  extends BaseMediaChunk
{
  private static final PositionHolder DUMMY_POSITION_HOLDER = new PositionHolder();
  private final int chunkCount;
  private final ChunkExtractorWrapper extractorWrapper;
  private volatile boolean loadCanceled;
  private boolean loadCompleted;
  private long nextLoadPosition;
  private final long sampleOffsetUs;
  
  public ContainerMediaChunk(DataSource paramDataSource, DataSpec paramDataSpec, Format paramFormat, int paramInt1, Object paramObject, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, int paramInt2, long paramLong6, ChunkExtractorWrapper paramChunkExtractorWrapper)
  {
    super(paramDataSource, paramDataSpec, paramFormat, paramInt1, paramObject, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5);
    chunkCount = paramInt2;
    sampleOffsetUs = paramLong6;
    extractorWrapper = paramChunkExtractorWrapper;
  }
  
  public final void cancelLoad()
  {
    loadCanceled = true;
  }
  
  public long getNextChunkIndex()
  {
    return chunkIndex + chunkCount;
  }
  
  public boolean isLoadCompleted()
  {
    return loadCompleted;
  }
  
  /* Error */
  public final void load()
    throws java.io.IOException, java.lang.InterruptedException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 61	com/google/android/exoplayer2/source/chunk/Chunk:dataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   4: aload_0
    //   5: getfield 63	com/google/android/exoplayer2/source/chunk/ContainerMediaChunk:nextLoadPosition	J
    //   8: invokevirtual 69	com/google/android/exoplayer2/upstream/DataSpec:subrange	(J)Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   11: astore_1
    //   12: new 71	com/google/android/exoplayer2/extractor/DefaultExtractorInput
    //   15: astore_2
    //   16: aload_0
    //   17: getfield 75	com/google/android/exoplayer2/source/chunk/Chunk:dataSource	Lcom/google/android/exoplayer2/upstream/StatsDataSource;
    //   20: astore_3
    //   21: aload_2
    //   22: aload_3
    //   23: aload_1
    //   24: getfield 78	com/google/android/exoplayer2/upstream/DataSpec:absoluteStreamPosition	J
    //   27: aload_3
    //   28: aload_1
    //   29: invokevirtual 84	com/google/android/exoplayer2/upstream/StatsDataSource:open	(Lcom/google/android/exoplayer2/upstream/DataSpec;)J
    //   32: invokespecial 87	com/google/android/exoplayer2/extractor/DefaultExtractorInput:<init>	(Lcom/google/android/exoplayer2/upstream/DataSource;JJ)V
    //   35: aload_0
    //   36: getfield 63	com/google/android/exoplayer2/source/chunk/ContainerMediaChunk:nextLoadPosition	J
    //   39: lconst_0
    //   40: lcmp
    //   41: ifne +94 -> 135
    //   44: aload_0
    //   45: invokevirtual 91	com/google/android/exoplayer2/source/chunk/BaseMediaChunk:getOutput	()Lcom/google/android/exoplayer2/source/chunk/BaseMediaChunkOutput;
    //   48: astore_3
    //   49: aload_3
    //   50: aload_0
    //   51: getfield 34	com/google/android/exoplayer2/source/chunk/ContainerMediaChunk:sampleOffsetUs	J
    //   54: invokevirtual 97	com/google/android/exoplayer2/source/chunk/BaseMediaChunkOutput:setSampleOffsetUs	(J)V
    //   57: aload_0
    //   58: getfield 36	com/google/android/exoplayer2/source/chunk/ContainerMediaChunk:extractorWrapper	Lcom/google/android/exoplayer2/source/chunk/ChunkExtractorWrapper;
    //   61: astore_1
    //   62: aload_0
    //   63: getfield 100	com/google/android/exoplayer2/source/chunk/BaseMediaChunk:clippedStartTimeUs	J
    //   66: lstore 4
    //   68: ldc2_w 101
    //   71: lstore 6
    //   73: lload 4
    //   75: ldc2_w 101
    //   78: lcmp
    //   79: ifne +11 -> 90
    //   82: ldc2_w 101
    //   85: lstore 4
    //   87: goto +12 -> 99
    //   90: lload 4
    //   92: aload_0
    //   93: getfield 34	com/google/android/exoplayer2/source/chunk/ContainerMediaChunk:sampleOffsetUs	J
    //   96: lsub
    //   97: lstore 4
    //   99: aload_0
    //   100: getfield 105	com/google/android/exoplayer2/source/chunk/BaseMediaChunk:clippedEndTimeUs	J
    //   103: lstore 8
    //   105: lload 8
    //   107: ldc2_w 101
    //   110: lcmp
    //   111: ifne +6 -> 117
    //   114: goto +12 -> 126
    //   117: lload 8
    //   119: aload_0
    //   120: getfield 34	com/google/android/exoplayer2/source/chunk/ContainerMediaChunk:sampleOffsetUs	J
    //   123: lsub
    //   124: lstore 6
    //   126: aload_1
    //   127: aload_3
    //   128: lload 4
    //   130: lload 6
    //   132: invokevirtual 111	com/google/android/exoplayer2/source/chunk/ChunkExtractorWrapper:init	(Lcom/google/android/exoplayer2/source/chunk/ChunkExtractorWrapper$TrackOutputProvider;JJ)V
    //   135: aload_0
    //   136: getfield 36	com/google/android/exoplayer2/source/chunk/ContainerMediaChunk:extractorWrapper	Lcom/google/android/exoplayer2/source/chunk/ChunkExtractorWrapper;
    //   139: getfield 115	com/google/android/exoplayer2/source/chunk/ChunkExtractorWrapper:extractor	Lcom/google/android/exoplayer2/extractor/Extractor;
    //   142: astore_1
    //   143: iconst_0
    //   144: istore 10
    //   146: iconst_0
    //   147: istore 11
    //   149: iload 11
    //   151: ifne +25 -> 176
    //   154: aload_0
    //   155: getfield 39	com/google/android/exoplayer2/source/chunk/ContainerMediaChunk:loadCanceled	Z
    //   158: ifne +18 -> 176
    //   161: aload_1
    //   162: aload_2
    //   163: getstatic 25	com/google/android/exoplayer2/source/chunk/ContainerMediaChunk:DUMMY_POSITION_HOLDER	Lcom/google/android/exoplayer2/extractor/PositionHolder;
    //   166: invokeinterface 121 3 0
    //   171: istore 11
    //   173: goto -24 -> 149
    //   176: iload 11
    //   178: iconst_1
    //   179: if_icmpeq +6 -> 185
    //   182: iconst_1
    //   183: istore 10
    //   185: iload 10
    //   187: invokestatic 127	com/google/android/exoplayer2/util/Assertions:checkState	(Z)V
    //   190: aload_0
    //   191: aload_2
    //   192: invokeinterface 132 1 0
    //   197: aload_0
    //   198: getfield 61	com/google/android/exoplayer2/source/chunk/Chunk:dataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   201: getfield 78	com/google/android/exoplayer2/upstream/DataSpec:absoluteStreamPosition	J
    //   204: lsub
    //   205: putfield 63	com/google/android/exoplayer2/source/chunk/ContainerMediaChunk:nextLoadPosition	J
    //   208: aload_0
    //   209: getfield 75	com/google/android/exoplayer2/source/chunk/Chunk:dataSource	Lcom/google/android/exoplayer2/upstream/StatsDataSource;
    //   212: invokestatic 138	com/google/android/exoplayer2/util/Util:closeQuietly	(Lcom/google/android/exoplayer2/upstream/DataSource;)V
    //   215: aload_0
    //   216: iconst_1
    //   217: putfield 50	com/google/android/exoplayer2/source/chunk/ContainerMediaChunk:loadCompleted	Z
    //   220: return
    //   221: astore_1
    //   222: aload_0
    //   223: aload_2
    //   224: invokeinterface 132 1 0
    //   229: aload_0
    //   230: getfield 61	com/google/android/exoplayer2/source/chunk/Chunk:dataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   233: getfield 78	com/google/android/exoplayer2/upstream/DataSpec:absoluteStreamPosition	J
    //   236: lsub
    //   237: putfield 63	com/google/android/exoplayer2/source/chunk/ContainerMediaChunk:nextLoadPosition	J
    //   240: aload_1
    //   241: athrow
    //   242: astore_2
    //   243: aload_0
    //   244: getfield 75	com/google/android/exoplayer2/source/chunk/Chunk:dataSource	Lcom/google/android/exoplayer2/upstream/StatsDataSource;
    //   247: invokestatic 138	com/google/android/exoplayer2/util/Util:closeQuietly	(Lcom/google/android/exoplayer2/upstream/DataSource;)V
    //   250: aload_2
    //   251: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	252	0	this	ContainerMediaChunk
    //   11	151	1	localObject1	Object
    //   221	20	1	localObject2	Object
    //   15	209	2	localDefaultExtractorInput	com.google.android.exoplayer2.extractor.DefaultExtractorInput
    //   242	9	2	localObject3	Object
    //   20	108	3	localObject4	Object
    //   66	63	4	l1	long
    //   71	60	6	l2	long
    //   103	15	8	l3	long
    //   144	42	10	bool	boolean
    //   147	33	11	i	int
    // Exception table:
    //   from	to	target	type
    //   135	143	221	finally
    //   154	173	221	finally
    //   185	190	221	finally
    //   12	68	242	finally
    //   90	99	242	finally
    //   99	105	242	finally
    //   117	126	242	finally
    //   126	135	242	finally
    //   190	208	242	finally
    //   222	242	242	finally
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.chunk.ContainerMediaChunk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */