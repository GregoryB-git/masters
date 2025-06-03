package com.google.android.exoplayer2.offline;

import java.io.IOException;

public abstract interface DownloadHelper$Callback
{
  public abstract void onPrepareError(DownloadHelper paramDownloadHelper, IOException paramIOException);
  
  public abstract void onPrepared(DownloadHelper paramDownloadHelper);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.DownloadHelper.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */