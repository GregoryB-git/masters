package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;

public final class FileDataSourceFactory
  implements DataSource.Factory
{
  @Nullable
  private final TransferListener listener;
  
  public FileDataSourceFactory()
  {
    this(null);
  }
  
  public FileDataSourceFactory(@Nullable TransferListener paramTransferListener)
  {
    listener = paramTransferListener;
  }
  
  public DataSource createDataSource()
  {
    FileDataSource localFileDataSource = new FileDataSource();
    TransferListener localTransferListener = listener;
    if (localTransferListener != null) {
      localFileDataSource.addTransferListener(localTransferListener);
    }
    return localFileDataSource;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.FileDataSourceFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */