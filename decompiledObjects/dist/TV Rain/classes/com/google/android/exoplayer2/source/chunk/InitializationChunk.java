package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;

public final class InitializationChunk
  extends Chunk
{
  private static final PositionHolder DUMMY_POSITION_HOLDER = new PositionHolder();
  private final ChunkExtractorWrapper extractorWrapper;
  private volatile boolean loadCanceled;
  private long nextLoadPosition;
  
  public InitializationChunk(DataSource paramDataSource, DataSpec paramDataSpec, Format paramFormat, int paramInt, @Nullable Object paramObject, ChunkExtractorWrapper paramChunkExtractorWrapper)
  {
    super(paramDataSource, paramDataSpec, 2, paramFormat, paramInt, paramObject, -9223372036854775807L, -9223372036854775807L);
    extractorWrapper = paramChunkExtractorWrapper;
  }
  
  public void cancelLoad()
  {
    loadCanceled = true;
  }
  
  /* Error */
  public void load()
    throws java.io.IOException, java.lang.InterruptedException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 44	com/google/android/exoplayer2/source/chunk/Chunk:dataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   4: aload_0
    //   5: getfield 46	com/google/android/exoplayer2/source/chunk/InitializationChunk:nextLoadPosition	J
    //   8: invokevirtual 52	com/google/android/exoplayer2/upstream/DataSpec:subrange	(J)Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   11: astore_1
    //   12: new 54	com/google/android/exoplayer2/extractor/DefaultExtractorInput
    //   15: astore_2
    //   16: aload_0
    //   17: getfield 58	com/google/android/exoplayer2/source/chunk/Chunk:dataSource	Lcom/google/android/exoplayer2/upstream/StatsDataSource;
    //   20: astore_3
    //   21: aload_2
    //   22: aload_3
    //   23: aload_1
    //   24: getfield 61	com/google/android/exoplayer2/upstream/DataSpec:absoluteStreamPosition	J
    //   27: aload_3
    //   28: aload_1
    //   29: invokevirtual 67	com/google/android/exoplayer2/upstream/StatsDataSource:open	(Lcom/google/android/exoplayer2/upstream/DataSpec;)J
    //   32: invokespecial 70	com/google/android/exoplayer2/extractor/DefaultExtractorInput:<init>	(Lcom/google/android/exoplayer2/upstream/DataSource;JJ)V
    //   35: aload_0
    //   36: getfield 46	com/google/android/exoplayer2/source/chunk/InitializationChunk:nextLoadPosition	J
    //   39: lconst_0
    //   40: lcmp
    //   41: ifne +17 -> 58
    //   44: aload_0
    //   45: getfield 31	com/google/android/exoplayer2/source/chunk/InitializationChunk:extractorWrapper	Lcom/google/android/exoplayer2/source/chunk/ChunkExtractorWrapper;
    //   48: aconst_null
    //   49: ldc2_w 25
    //   52: ldc2_w 25
    //   55: invokevirtual 76	com/google/android/exoplayer2/source/chunk/ChunkExtractorWrapper:init	(Lcom/google/android/exoplayer2/source/chunk/ChunkExtractorWrapper$TrackOutputProvider;JJ)V
    //   58: aload_0
    //   59: getfield 31	com/google/android/exoplayer2/source/chunk/InitializationChunk:extractorWrapper	Lcom/google/android/exoplayer2/source/chunk/ChunkExtractorWrapper;
    //   62: getfield 80	com/google/android/exoplayer2/source/chunk/ChunkExtractorWrapper:extractor	Lcom/google/android/exoplayer2/extractor/Extractor;
    //   65: astore_3
    //   66: iconst_0
    //   67: istore 4
    //   69: iconst_0
    //   70: istore 5
    //   72: iload 5
    //   74: ifne +25 -> 99
    //   77: aload_0
    //   78: getfield 35	com/google/android/exoplayer2/source/chunk/InitializationChunk:loadCanceled	Z
    //   81: ifne +18 -> 99
    //   84: aload_3
    //   85: aload_2
    //   86: getstatic 21	com/google/android/exoplayer2/source/chunk/InitializationChunk:DUMMY_POSITION_HOLDER	Lcom/google/android/exoplayer2/extractor/PositionHolder;
    //   89: invokeinterface 86 3 0
    //   94: istore 5
    //   96: goto -24 -> 72
    //   99: iload 5
    //   101: iconst_1
    //   102: if_icmpeq +6 -> 108
    //   105: iconst_1
    //   106: istore 4
    //   108: iload 4
    //   110: invokestatic 92	com/google/android/exoplayer2/util/Assertions:checkState	(Z)V
    //   113: aload_0
    //   114: aload_2
    //   115: invokeinterface 98 1 0
    //   120: aload_0
    //   121: getfield 44	com/google/android/exoplayer2/source/chunk/Chunk:dataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   124: getfield 61	com/google/android/exoplayer2/upstream/DataSpec:absoluteStreamPosition	J
    //   127: lsub
    //   128: putfield 46	com/google/android/exoplayer2/source/chunk/InitializationChunk:nextLoadPosition	J
    //   131: aload_0
    //   132: getfield 58	com/google/android/exoplayer2/source/chunk/Chunk:dataSource	Lcom/google/android/exoplayer2/upstream/StatsDataSource;
    //   135: invokestatic 104	com/google/android/exoplayer2/util/Util:closeQuietly	(Lcom/google/android/exoplayer2/upstream/DataSource;)V
    //   138: return
    //   139: astore_3
    //   140: aload_0
    //   141: aload_2
    //   142: invokeinterface 98 1 0
    //   147: aload_0
    //   148: getfield 44	com/google/android/exoplayer2/source/chunk/Chunk:dataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   151: getfield 61	com/google/android/exoplayer2/upstream/DataSpec:absoluteStreamPosition	J
    //   154: lsub
    //   155: putfield 46	com/google/android/exoplayer2/source/chunk/InitializationChunk:nextLoadPosition	J
    //   158: aload_3
    //   159: athrow
    //   160: astore_2
    //   161: aload_0
    //   162: getfield 58	com/google/android/exoplayer2/source/chunk/Chunk:dataSource	Lcom/google/android/exoplayer2/upstream/StatsDataSource;
    //   165: invokestatic 104	com/google/android/exoplayer2/util/Util:closeQuietly	(Lcom/google/android/exoplayer2/upstream/DataSource;)V
    //   168: aload_2
    //   169: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	170	0	this	InitializationChunk
    //   11	18	1	localDataSpec	DataSpec
    //   15	127	2	localDefaultExtractorInput	com.google.android.exoplayer2.extractor.DefaultExtractorInput
    //   160	9	2	localObject1	Object
    //   20	65	3	localObject2	Object
    //   139	20	3	localObject3	Object
    //   67	42	4	bool	boolean
    //   70	33	5	i	int
    // Exception table:
    //   from	to	target	type
    //   58	66	139	finally
    //   77	96	139	finally
    //   108	113	139	finally
    //   12	58	160	finally
    //   113	131	160	finally
    //   140	160	160	finally
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.chunk.InitializationChunk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */