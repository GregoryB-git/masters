package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class StatsDataSource
  implements DataSource
{
  private long bytesRead;
  private final DataSource dataSource;
  private Uri lastOpenedUri;
  private Map<String, List<String>> lastResponseHeaders;
  
  public StatsDataSource(DataSource paramDataSource)
  {
    dataSource = ((DataSource)Assertions.checkNotNull(paramDataSource));
    lastOpenedUri = Uri.EMPTY;
    lastResponseHeaders = Collections.emptyMap();
  }
  
  public void addTransferListener(TransferListener paramTransferListener)
  {
    dataSource.addTransferListener(paramTransferListener);
  }
  
  public void close()
    throws IOException
  {
    dataSource.close();
  }
  
  public long getBytesRead()
  {
    return bytesRead;
  }
  
  public Uri getLastOpenedUri()
  {
    return lastOpenedUri;
  }
  
  public Map<String, List<String>> getLastResponseHeaders()
  {
    return lastResponseHeaders;
  }
  
  public Map<String, List<String>> getResponseHeaders()
  {
    return dataSource.getResponseHeaders();
  }
  
  @Nullable
  public Uri getUri()
  {
    return dataSource.getUri();
  }
  
  public long open(DataSpec paramDataSpec)
    throws IOException
  {
    lastOpenedUri = uri;
    lastResponseHeaders = Collections.emptyMap();
    long l = dataSource.open(paramDataSpec);
    lastOpenedUri = ((Uri)Assertions.checkNotNull(getUri()));
    lastResponseHeaders = getResponseHeaders();
    return l;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    paramInt1 = dataSource.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 != -1) {
      bytesRead += paramInt1;
    }
    return paramInt1;
  }
  
  public void resetBytesRead()
  {
    bytesRead = 0L;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.StatsDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */