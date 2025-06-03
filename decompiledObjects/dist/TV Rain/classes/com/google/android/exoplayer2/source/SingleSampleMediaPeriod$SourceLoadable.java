package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader.Loadable;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;

final class SingleSampleMediaPeriod$SourceLoadable
  implements Loader.Loadable
{
  private final StatsDataSource dataSource;
  public final DataSpec dataSpec;
  private byte[] sampleData;
  
  public SingleSampleMediaPeriod$SourceLoadable(DataSpec paramDataSpec, DataSource paramDataSource)
  {
    dataSpec = paramDataSpec;
    dataSource = new StatsDataSource(paramDataSource);
  }
  
  public void cancelLoad() {}
  
  public void load()
    throws IOException, InterruptedException
  {
    dataSource.resetBytesRead();
    try
    {
      dataSource.open(dataSpec);
      byte[] arrayOfByte;
      StatsDataSource localStatsDataSource;
      for (int i = 0; i != -1; i = localStatsDataSource.read(arrayOfByte, i, arrayOfByte.length - i))
      {
        i = (int)dataSource.getBytesRead();
        arrayOfByte = sampleData;
        if (arrayOfByte == null) {
          sampleData = new byte['Ѐ'];
        } else if (i == arrayOfByte.length) {
          sampleData = Arrays.copyOf(arrayOfByte, arrayOfByte.length * 2);
        }
        localStatsDataSource = dataSource;
        arrayOfByte = sampleData;
      }
      return;
    }
    finally
    {
      Util.closeQuietly(dataSource);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */