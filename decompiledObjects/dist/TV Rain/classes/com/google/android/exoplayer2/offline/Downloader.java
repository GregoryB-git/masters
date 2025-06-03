package com.google.android.exoplayer2.offline;

import java.io.IOException;

public abstract interface Downloader
{
  public abstract void cancel();
  
  public abstract void download()
    throws InterruptedException, IOException;
  
  public abstract float getDownloadPercentage();
  
  public abstract long getDownloadedBytes();
  
  public abstract void remove()
    throws InterruptedException;
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.Downloader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */