package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;

public abstract class BaseDataSource
  implements DataSource
{
  @Nullable
  private DataSpec dataSpec;
  private final boolean isNetwork;
  private int listenerCount;
  private final ArrayList<TransferListener> listeners;
  
  public BaseDataSource(boolean paramBoolean)
  {
    isNetwork = paramBoolean;
    listeners = new ArrayList(1);
  }
  
  public final void addTransferListener(TransferListener paramTransferListener)
  {
    if (!listeners.contains(paramTransferListener))
    {
      listeners.add(paramTransferListener);
      listenerCount += 1;
    }
  }
  
  public final void bytesTransferred(int paramInt)
  {
    DataSpec localDataSpec = (DataSpec)Util.castNonNull(dataSpec);
    for (int i = 0; i < listenerCount; i++) {
      ((TransferListener)listeners.get(i)).onBytesTransferred(this, localDataSpec, isNetwork, paramInt);
    }
  }
  
  public final void transferEnded()
  {
    DataSpec localDataSpec = (DataSpec)Util.castNonNull(dataSpec);
    for (int i = 0; i < listenerCount; i++) {
      ((TransferListener)listeners.get(i)).onTransferEnd(this, localDataSpec, isNetwork);
    }
    dataSpec = null;
  }
  
  public final void transferInitializing(DataSpec paramDataSpec)
  {
    for (int i = 0; i < listenerCount; i++) {
      ((TransferListener)listeners.get(i)).onTransferInitializing(this, paramDataSpec, isNetwork);
    }
  }
  
  public final void transferStarted(DataSpec paramDataSpec)
  {
    dataSpec = paramDataSpec;
    for (int i = 0; i < listenerCount; i++) {
      ((TransferListener)listeners.get(i)).onTransferStart(this, paramDataSpec, isNetwork);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.BaseDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */