package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader.Loadable;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

final class ExtractorMediaPeriod$ExtractingLoadable
  implements Loader.Loadable
{
  private final StatsDataSource dataSource;
  private DataSpec dataSpec;
  private final ExtractorMediaPeriod.ExtractorHolder extractorHolder;
  private final ExtractorOutput extractorOutput;
  private long length;
  private volatile boolean loadCanceled;
  private final ConditionVariable loadCondition;
  private boolean pendingExtractorSeek;
  private final PositionHolder positionHolder;
  private long seekTimeUs;
  private final Uri uri;
  
  public ExtractorMediaPeriod$ExtractingLoadable(ExtractorMediaPeriod paramExtractorMediaPeriod, Uri paramUri, DataSource paramDataSource, ExtractorMediaPeriod.ExtractorHolder paramExtractorHolder, ExtractorOutput paramExtractorOutput, ConditionVariable paramConditionVariable)
  {
    uri = paramUri;
    dataSource = new StatsDataSource(paramDataSource);
    extractorHolder = paramExtractorHolder;
    extractorOutput = paramExtractorOutput;
    loadCondition = paramConditionVariable;
    paramDataSource = new PositionHolder();
    positionHolder = paramDataSource;
    pendingExtractorSeek = true;
    length = -1L;
    dataSpec = new DataSpec(paramUri, position, -1L, ExtractorMediaPeriod.access$600(paramExtractorMediaPeriod));
  }
  
  private void setLoadPosition(long paramLong1, long paramLong2)
  {
    positionHolder.position = paramLong1;
    seekTimeUs = paramLong2;
    pendingExtractorSeek = true;
  }
  
  public void cancelLoad()
  {
    loadCanceled = true;
  }
  
  public void load()
    throws IOException, InterruptedException
  {
    int i = 0;
    Object localObject5;
    for (;;)
    {
      if ((i != 0) || (loadCanceled)) {
        return;
      }
      Object localObject1 = null;
      try
      {
        long l1 = positionHolder.position;
        Object localObject2 = new com/google/android/exoplayer2/upstream/DataSpec;
        ((DataSpec)localObject2).<init>(uri, l1, -1L, ExtractorMediaPeriod.access$600(this$0));
        dataSpec = ((DataSpec)localObject2);
        long l2 = dataSource.open((DataSpec)localObject2);
        length = l2;
        if (l2 != -1L) {
          length = (l2 + l1);
        }
        localObject2 = (Uri)Assertions.checkNotNull(dataSource.getUri());
        localObject5 = new com/google/android/exoplayer2/extractor/DefaultExtractorInput;
        ((DefaultExtractorInput)localObject5).<init>(dataSource, l1, length);
        int j = i;
        try
        {
          localObject2 = extractorHolder.selectExtractor((ExtractorInput)localObject5, extractorOutput, (Uri)localObject2);
          int k = i;
          l2 = l1;
          j = i;
          if (pendingExtractorSeek)
          {
            j = i;
            ((Extractor)localObject2).seek(l1, seekTimeUs);
            j = i;
            pendingExtractorSeek = false;
            l2 = l1;
            k = i;
          }
          while (k == 0)
          {
            j = k;
            if (loadCanceled) {
              break;
            }
            j = k;
            loadCondition.block();
            j = k;
            i = ((Extractor)localObject2).read((ExtractorInput)localObject5, positionHolder);
            k = i;
            j = i;
            if (((ExtractorInput)localObject5).getPosition() > ExtractorMediaPeriod.access$700(this$0) + l2)
            {
              j = i;
              l2 = ((ExtractorInput)localObject5).getPosition();
              j = i;
              loadCondition.close();
              j = i;
              ExtractorMediaPeriod.access$900(this$0).post(ExtractorMediaPeriod.access$800(this$0));
              k = i;
            }
          }
          if (k == 1)
          {
            i = 0;
          }
          else
          {
            positionHolder.position = ((ExtractorInput)localObject5).getPosition();
            i = k;
          }
          Util.closeQuietly(dataSource);
          continue;
        }
        finally
        {
          i = j;
        }
        if (i == 1) {
          break label384;
        }
      }
      finally
      {
        localObject5 = localObject1;
      }
    }
    if (localObject5 != null) {
      positionHolder.position = ((ExtractorInput)localObject5).getPosition();
    }
    label384:
    Util.closeQuietly(dataSource);
    throw ((Throwable)localObject4);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ExtractorMediaPeriod.ExtractingLoadable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */