package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.offline.SegmentDownloader.Segment;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.DashUtil;
import com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class DashDownloader
  extends SegmentDownloader<DashManifest>
{
  public DashDownloader(Uri paramUri, List<StreamKey> paramList, DownloaderConstructorHelper paramDownloaderConstructorHelper)
  {
    super(paramUri, paramList, paramDownloaderConstructorHelper);
  }
  
  private static void addSegment(long paramLong, String paramString, RangedUri paramRangedUri, ArrayList<SegmentDownloader.Segment> paramArrayList)
  {
    paramArrayList.add(new SegmentDownloader.Segment(paramLong, new DataSpec(paramRangedUri.resolveUri(paramString), start, length, null)));
  }
  
  /* Error */
  private static void addSegmentsForAdaptationSet(DataSource paramDataSource, AdaptationSet paramAdaptationSet, long paramLong1, long paramLong2, boolean paramBoolean, ArrayList<SegmentDownloader.Segment> paramArrayList)
    throws IOException, InterruptedException
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 8
    //   3: aload_1
    //   4: astore 9
    //   6: iload 8
    //   8: aload 9
    //   10: getfield 56	com/google/android/exoplayer2/source/dash/manifest/AdaptationSet:representations	Ljava/util/List;
    //   13: invokeinterface 62 1 0
    //   18: if_icmpge +228 -> 246
    //   21: aload 9
    //   23: getfield 56	com/google/android/exoplayer2/source/dash/manifest/AdaptationSet:representations	Ljava/util/List;
    //   26: iload 8
    //   28: invokeinterface 66 2 0
    //   33: checkcast 68	com/google/android/exoplayer2/source/dash/manifest/Representation
    //   36: astore 10
    //   38: aload 9
    //   40: getfield 72	com/google/android/exoplayer2/source/dash/manifest/AdaptationSet:type	I
    //   43: istore 11
    //   45: aload_0
    //   46: iload 11
    //   48: aload 10
    //   50: invokestatic 76	com/google/android/exoplayer2/source/dash/offline/DashDownloader:getSegmentIndex	(Lcom/google/android/exoplayer2/upstream/DataSource;ILcom/google/android/exoplayer2/source/dash/manifest/Representation;)Lcom/google/android/exoplayer2/source/dash/DashSegmentIndex;
    //   53: astore 12
    //   55: aload 12
    //   57: ifnull +148 -> 205
    //   60: aload 12
    //   62: lload 4
    //   64: invokeinterface 82 3 0
    //   69: istore 11
    //   71: iload 11
    //   73: iconst_m1
    //   74: if_icmpeq +121 -> 195
    //   77: aload 10
    //   79: getfield 86	com/google/android/exoplayer2/source/dash/manifest/Representation:baseUrl	Ljava/lang/String;
    //   82: astore 9
    //   84: aload 10
    //   86: invokevirtual 90	com/google/android/exoplayer2/source/dash/manifest/Representation:getInitializationUri	()Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;
    //   89: astore 13
    //   91: aload 13
    //   93: ifnull +13 -> 106
    //   96: lload_2
    //   97: aload 9
    //   99: aload 13
    //   101: aload 7
    //   103: invokestatic 92	com/google/android/exoplayer2/source/dash/offline/DashDownloader:addSegment	(JLjava/lang/String;Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;Ljava/util/ArrayList;)V
    //   106: aload 10
    //   108: invokevirtual 95	com/google/android/exoplayer2/source/dash/manifest/Representation:getIndexUri	()Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;
    //   111: astore 10
    //   113: aload 10
    //   115: ifnull +13 -> 128
    //   118: lload_2
    //   119: aload 9
    //   121: aload 10
    //   123: aload 7
    //   125: invokestatic 92	com/google/android/exoplayer2/source/dash/offline/DashDownloader:addSegment	(JLjava/lang/String;Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;Ljava/util/ArrayList;)V
    //   128: aload 12
    //   130: invokeinterface 99 1 0
    //   135: lstore 14
    //   137: iload 11
    //   139: i2l
    //   140: lstore 16
    //   142: lload 14
    //   144: lstore 18
    //   146: lload 18
    //   148: lload 16
    //   150: lload 14
    //   152: ladd
    //   153: lconst_1
    //   154: lsub
    //   155: lcmp
    //   156: ifgt +81 -> 237
    //   159: aload 12
    //   161: lload 18
    //   163: invokeinterface 103 3 0
    //   168: lload_2
    //   169: ladd
    //   170: aload 9
    //   172: aload 12
    //   174: lload 18
    //   176: invokeinterface 107 3 0
    //   181: aload 7
    //   183: invokestatic 92	com/google/android/exoplayer2/source/dash/offline/DashDownloader:addSegment	(JLjava/lang/String;Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;Ljava/util/ArrayList;)V
    //   186: lload 18
    //   188: lconst_1
    //   189: ladd
    //   190: lstore 18
    //   192: goto -46 -> 146
    //   195: new 109	com/google/android/exoplayer2/offline/DownloadException
    //   198: dup
    //   199: ldc 111
    //   201: invokespecial 114	com/google/android/exoplayer2/offline/DownloadException:<init>	(Ljava/lang/String;)V
    //   204: athrow
    //   205: new 109	com/google/android/exoplayer2/offline/DownloadException
    //   208: astore 9
    //   210: aload 9
    //   212: ldc 116
    //   214: invokespecial 114	com/google/android/exoplayer2/offline/DownloadException:<init>	(Ljava/lang/String;)V
    //   217: aload 9
    //   219: athrow
    //   220: astore 9
    //   222: goto +10 -> 232
    //   225: astore 9
    //   227: goto +5 -> 232
    //   230: astore 9
    //   232: iload 6
    //   234: ifeq +9 -> 243
    //   237: iinc 8 1
    //   240: goto -237 -> 3
    //   243: aload 9
    //   245: athrow
    //   246: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	247	0	paramDataSource	DataSource
    //   0	247	1	paramAdaptationSet	AdaptationSet
    //   0	247	2	paramLong1	long
    //   0	247	4	paramLong2	long
    //   0	247	6	paramBoolean	boolean
    //   0	247	7	paramArrayList	ArrayList<SegmentDownloader.Segment>
    //   1	237	8	i	int
    //   4	214	9	localObject1	Object
    //   220	1	9	localIOException1	IOException
    //   225	1	9	localIOException2	IOException
    //   230	14	9	localIOException3	IOException
    //   36	86	10	localObject2	Object
    //   43	95	11	j	int
    //   53	120	12	localDashSegmentIndex	DashSegmentIndex
    //   89	11	13	localRangedUri	RangedUri
    //   135	16	14	l1	long
    //   140	9	16	l2	long
    //   144	47	18	l3	long
    // Exception table:
    //   from	to	target	type
    //   205	220	220	java/io/IOException
    //   45	55	225	java/io/IOException
    //   38	45	230	java/io/IOException
  }
  
  @Nullable
  private static DashSegmentIndex getSegmentIndex(DataSource paramDataSource, int paramInt, Representation paramRepresentation)
    throws IOException, InterruptedException
  {
    DashSegmentIndex localDashSegmentIndex = paramRepresentation.getIndex();
    if (localDashSegmentIndex != null) {
      return localDashSegmentIndex;
    }
    paramDataSource = DashUtil.loadChunkIndex(paramDataSource, paramInt, paramRepresentation);
    if (paramDataSource == null) {
      paramDataSource = null;
    } else {
      paramDataSource = new DashWrappingSegmentIndex(paramDataSource, presentationTimeOffsetUs);
    }
    return paramDataSource;
  }
  
  public DashManifest getManifest(DataSource paramDataSource, Uri paramUri)
    throws IOException
  {
    return DashUtil.loadManifest(paramDataSource, paramUri);
  }
  
  public List<SegmentDownloader.Segment> getSegments(DataSource paramDataSource, DashManifest paramDashManifest, boolean paramBoolean)
    throws InterruptedException, IOException
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramDashManifest.getPeriodCount(); i++)
    {
      Object localObject = paramDashManifest.getPeriod(i);
      long l1 = C.msToUs(startMs);
      long l2 = paramDashManifest.getPeriodDurationUs(i);
      localObject = adaptationSets;
      for (int j = 0; j < ((List)localObject).size(); j++) {
        addSegmentsForAdaptationSet(paramDataSource, (AdaptationSet)((List)localObject).get(j), l1, l2, paramBoolean, localArrayList);
      }
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.offline.DashDownloader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */