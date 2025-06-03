package com.google.android.exoplayer2.upstream;

public abstract interface TransferListener
{
  public abstract void onBytesTransferred(DataSource paramDataSource, DataSpec paramDataSpec, boolean paramBoolean, int paramInt);
  
  public abstract void onTransferEnd(DataSource paramDataSource, DataSpec paramDataSpec, boolean paramBoolean);
  
  public abstract void onTransferInitializing(DataSource paramDataSource, DataSpec paramDataSpec, boolean paramBoolean);
  
  public abstract void onTransferStart(DataSource paramDataSource, DataSpec paramDataSpec, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.TransferListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */