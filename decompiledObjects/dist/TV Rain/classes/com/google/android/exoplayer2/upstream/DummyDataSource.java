package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import f1;
import java.io.IOException;

public final class DummyDataSource
  implements DataSource
{
  public static final DataSource.Factory FACTORY = new f1();
  public static final DummyDataSource INSTANCE = new DummyDataSource();
  
  public void addTransferListener(TransferListener paramTransferListener) {}
  
  public void close()
    throws IOException
  {}
  
  @Nullable
  public Uri getUri()
  {
    return null;
  }
  
  public long open(DataSpec paramDataSpec)
    throws IOException
  {
    throw new IOException("Dummy source");
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.DummyDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */