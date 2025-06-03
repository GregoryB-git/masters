package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aff
  implements Handler.Callback
{
  public final ContentProgressProvider a;
  private final long b;
  private boolean c = false;
  private final afi d;
  private List<afh> e = new ArrayList(1);
  
  public aff(long paramLong)
  {
    this(null, paramLong);
  }
  
  public aff(ContentProgressProvider paramContentProgressProvider, long paramLong)
  {
    this(paramLong);
    a = paramContentProgressProvider;
  }
  
  private aff(afi paramafi, long paramLong)
  {
    b = paramLong;
    d = new afi(new Handler(this));
  }
  
  public final void a()
  {
    if (c) {
      return;
    }
    c = true;
    d.b(0);
  }
  
  public final void a(afh paramafh)
  {
    e.add(paramafh);
  }
  
  public final void b()
  {
    if (c)
    {
      c = false;
      d.c(2);
    }
  }
  
  public final void b(afh paramafh)
  {
    e.remove(paramafh);
  }
  
  public VideoProgressUpdate c()
  {
    VideoProgressUpdate localVideoProgressUpdate1 = a.getContentProgress();
    VideoProgressUpdate localVideoProgressUpdate2 = localVideoProgressUpdate1;
    if (localVideoProgressUpdate1 == null)
    {
      Log.w("IMASDK", "ContentProgressProvider.getContentProgress() is null. Use VideoProgressUpdate.VIDEO_TIME_NOT_READY instead.");
      localVideoProgressUpdate2 = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }
    return localVideoProgressUpdate2;
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = what;
    if ((i != 0) && (i != 1))
    {
      if (i == 2) {
        d.a(1);
      }
    }
    else
    {
      paramMessage = c();
      Iterator localIterator = e.iterator();
      while (localIterator.hasNext()) {
        ((afh)localIterator.next()).a(paramMessage);
      }
      d.a(1, b);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aff
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */