package com.google.ads.interactivemedia.v3.internal;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class am
{
  private final BlockingQueue<Runnable> a;
  private final ThreadPoolExecutor b;
  private final ArrayDeque<an> c = new ArrayDeque();
  private an d = null;
  
  public am()
  {
    LinkedBlockingQueue localLinkedBlockingQueue = new LinkedBlockingQueue();
    a = localLinkedBlockingQueue;
    b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, localLinkedBlockingQueue);
  }
  
  private void b()
  {
    an localan = (an)c.poll();
    d = localan;
    if (localan != null) {
      localan.executeOnExecutor(b, new Object[0]);
    }
  }
  
  public void a()
  {
    d = null;
    b();
  }
  
  public void a(an paraman)
  {
    paraman.a(this);
    c.add(paraman);
    if (d == null) {
      b();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.am
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */