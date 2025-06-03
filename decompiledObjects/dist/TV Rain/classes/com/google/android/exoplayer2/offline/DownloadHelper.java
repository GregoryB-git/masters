package com.google.android.exoplayer2.offline;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.List;

public abstract class DownloadHelper
{
  public abstract DownloadAction getDownloadAction(@Nullable byte[] paramArrayOfByte, List<TrackKey> paramList);
  
  public abstract int getPeriodCount();
  
  public abstract DownloadAction getRemoveAction(@Nullable byte[] paramArrayOfByte);
  
  public abstract TrackGroupArray getTrackGroups(int paramInt);
  
  public void prepare(final Callback paramCallback)
  {
    Looper localLooper;
    if (Looper.myLooper() != null) {
      localLooper = Looper.myLooper();
    } else {
      localLooper = Looper.getMainLooper();
    }
    new Thread()
    {
      public void run()
      {
        try
        {
          prepareInternal();
          Handler localHandler = val$handler;
          DownloadHelper.Callback localCallback = paramCallback;
          a locala = new com/google/android/exoplayer2/offline/a;
          locala.<init>(0, localCallback, this);
          localHandler.post(locala);
        }
        catch (IOException localIOException)
        {
          val$handler.post(new b(this, paramCallback, localIOException));
        }
      }
    }.start();
  }
  
  public abstract void prepareInternal()
    throws IOException;
  
  public static abstract interface Callback
  {
    public abstract void onPrepareError(DownloadHelper paramDownloadHelper, IOException paramIOException);
    
    public abstract void onPrepared(DownloadHelper paramDownloadHelper);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.DownloadHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */