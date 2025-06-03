package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract interface DataSource
{
  public abstract void addTransferListener(TransferListener paramTransferListener);
  
  public abstract void close()
    throws IOException;
  
  public Map<String, List<String>> getResponseHeaders()
  {
    return Collections.emptyMap();
  }
  
  @Nullable
  public abstract Uri getUri();
  
  public abstract long open(DataSpec paramDataSpec)
    throws IOException;
  
  public abstract int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException;
  
  public static abstract interface Factory
  {
    public abstract DataSource createDataSource();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.DataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */