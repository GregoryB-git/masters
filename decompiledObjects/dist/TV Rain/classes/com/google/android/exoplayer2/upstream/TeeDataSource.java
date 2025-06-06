package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class TeeDataSource
  implements DataSource
{
  private long bytesRemaining;
  private final DataSink dataSink;
  private boolean dataSinkNeedsClosing;
  private final DataSource upstream;
  
  public TeeDataSource(DataSource paramDataSource, DataSink paramDataSink)
  {
    upstream = ((DataSource)Assertions.checkNotNull(paramDataSource));
    dataSink = ((DataSink)Assertions.checkNotNull(paramDataSink));
  }
  
  public void addTransferListener(TransferListener paramTransferListener)
  {
    upstream.addTransferListener(paramTransferListener);
  }
  
  public void close()
    throws IOException
  {
    try
    {
      upstream.close();
      return;
    }
    finally
    {
      if (dataSinkNeedsClosing)
      {
        dataSinkNeedsClosing = false;
        dataSink.close();
      }
    }
  }
  
  public Map<String, List<String>> getResponseHeaders()
  {
    return upstream.getResponseHeaders();
  }
  
  @Nullable
  public Uri getUri()
  {
    return upstream.getUri();
  }
  
  public long open(DataSpec paramDataSpec)
    throws IOException
  {
    long l = upstream.open(paramDataSpec);
    bytesRemaining = l;
    if (l == 0L) {
      return 0L;
    }
    DataSpec localDataSpec = paramDataSpec;
    if (length == -1L)
    {
      localDataSpec = paramDataSpec;
      if (l != -1L) {
        localDataSpec = paramDataSpec.subrange(0L, l);
      }
    }
    dataSinkNeedsClosing = true;
    dataSink.open(localDataSpec);
    return bytesRemaining;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (bytesRemaining == 0L) {
      return -1;
    }
    paramInt2 = upstream.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt2 > 0)
    {
      dataSink.write(paramArrayOfByte, paramInt1, paramInt2);
      long l = bytesRemaining;
      if (l != -1L) {
        bytesRemaining = (l - paramInt2);
      }
    }
    return paramInt2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.TeeDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */