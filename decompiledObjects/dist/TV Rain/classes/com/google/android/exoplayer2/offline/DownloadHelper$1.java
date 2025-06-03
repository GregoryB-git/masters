package com.google.android.exoplayer2.offline;

import android.os.Handler;
import java.io.IOException;

class DownloadHelper$1
  extends Thread
{
  public DownloadHelper$1(DownloadHelper paramDownloadHelper, Handler paramHandler, DownloadHelper.Callback paramCallback) {}
  
  public void run()
  {
    try
    {
      this$0.prepareInternal();
      Handler localHandler = val$handler;
      DownloadHelper.Callback localCallback = val$callback;
      a locala = new com/google/android/exoplayer2/offline/a;
      locala.<init>(0, localCallback, this);
      localHandler.post(locala);
    }
    catch (IOException localIOException)
    {
      val$handler.post(new b(this, val$callback, localIOException));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.DownloadHelper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */