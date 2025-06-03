package androidx.asynclayoutinflater.view;

import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import androidx.core.util.Pools.SynchronizedPool;
import java.util.concurrent.ArrayBlockingQueue;

class AsyncLayoutInflater$InflateThread
  extends Thread
{
  private static final InflateThread sInstance;
  private ArrayBlockingQueue<AsyncLayoutInflater.InflateRequest> mQueue = new ArrayBlockingQueue(10);
  private Pools.SynchronizedPool<AsyncLayoutInflater.InflateRequest> mRequestPool = new Pools.SynchronizedPool(10);
  
  static
  {
    InflateThread localInflateThread = new InflateThread();
    sInstance = localInflateThread;
    localInflateThread.start();
  }
  
  public static InflateThread getInstance()
  {
    return sInstance;
  }
  
  public void enqueue(AsyncLayoutInflater.InflateRequest paramInflateRequest)
  {
    try
    {
      mQueue.put(paramInflateRequest);
      return;
    }
    catch (InterruptedException paramInflateRequest)
    {
      throw new RuntimeException("Failed to enqueue async inflate request", paramInflateRequest);
    }
  }
  
  public AsyncLayoutInflater.InflateRequest obtainRequest()
  {
    AsyncLayoutInflater.InflateRequest localInflateRequest1 = (AsyncLayoutInflater.InflateRequest)mRequestPool.acquire();
    AsyncLayoutInflater.InflateRequest localInflateRequest2 = localInflateRequest1;
    if (localInflateRequest1 == null) {
      localInflateRequest2 = new AsyncLayoutInflater.InflateRequest();
    }
    return localInflateRequest2;
  }
  
  public void releaseRequest(AsyncLayoutInflater.InflateRequest paramInflateRequest)
  {
    callback = null;
    inflater = null;
    parent = null;
    resid = 0;
    view = null;
    mRequestPool.release(paramInflateRequest);
  }
  
  public void run()
  {
    for (;;)
    {
      runInner();
    }
  }
  
  public void runInner()
  {
    try
    {
      AsyncLayoutInflater.InflateRequest localInflateRequest = (AsyncLayoutInflater.InflateRequest)mQueue.take();
      try
      {
        view = inflater.mInflater.inflate(resid, parent, false);
      }
      catch (RuntimeException localRuntimeException)
      {
        Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", localRuntimeException);
      }
      Message.obtain(inflater.mHandler, 0, localInflateRequest).sendToTarget();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.w("AsyncLayoutInflater", localInterruptedException);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.asynclayoutinflater.view.AsyncLayoutInflater.InflateThread
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */