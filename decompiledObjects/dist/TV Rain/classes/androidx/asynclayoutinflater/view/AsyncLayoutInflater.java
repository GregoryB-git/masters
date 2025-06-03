package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.core.util.Pools.SynchronizedPool;
import java.util.concurrent.ArrayBlockingQueue;

public final class AsyncLayoutInflater
{
  private static final String TAG = "AsyncLayoutInflater";
  public Handler mHandler;
  private Handler.Callback mHandlerCallback = new Handler.Callback()
  {
    public boolean handleMessage(Message paramAnonymousMessage)
    {
      paramAnonymousMessage = (AsyncLayoutInflater.InflateRequest)obj;
      if (view == null) {
        view = mInflater.inflate(resid, parent, false);
      }
      callback.onInflateFinished(view, resid, parent);
      mInflateThread.releaseRequest(paramAnonymousMessage);
      return true;
    }
  };
  public InflateThread mInflateThread;
  public LayoutInflater mInflater;
  
  public AsyncLayoutInflater(@NonNull Context paramContext)
  {
    mInflater = new BasicInflater(paramContext);
    mHandler = new Handler(mHandlerCallback);
    mInflateThread = InflateThread.getInstance();
  }
  
  @UiThread
  public void inflate(@LayoutRes int paramInt, @Nullable ViewGroup paramViewGroup, @NonNull OnInflateFinishedListener paramOnInflateFinishedListener)
  {
    if (paramOnInflateFinishedListener != null)
    {
      InflateRequest localInflateRequest = mInflateThread.obtainRequest();
      inflater = this;
      resid = paramInt;
      parent = paramViewGroup;
      callback = paramOnInflateFinishedListener;
      mInflateThread.enqueue(localInflateRequest);
      return;
    }
    throw new NullPointerException("callback argument may not be null!");
  }
  
  public static class BasicInflater
    extends LayoutInflater
  {
    private static final String[] sClassPrefixList = { "android.widget.", "android.webkit.", "android.app." };
    
    public BasicInflater(Context paramContext)
    {
      super();
    }
    
    public LayoutInflater cloneInContext(Context paramContext)
    {
      return new BasicInflater(paramContext);
    }
    
    public View onCreateView(String paramString, AttributeSet paramAttributeSet)
      throws ClassNotFoundException
    {
      for (Object localObject : sClassPrefixList) {
        try
        {
          localObject = createView(paramString, (String)localObject, paramAttributeSet);
          if (localObject != null) {
            return (View)localObject;
          }
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          for (;;) {}
        }
      }
      return super.onCreateView(paramString, paramAttributeSet);
    }
  }
  
  public static class InflateRequest
  {
    public AsyncLayoutInflater.OnInflateFinishedListener callback;
    public AsyncLayoutInflater inflater;
    public ViewGroup parent;
    public int resid;
    public View view;
  }
  
  public static class InflateThread
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
  
  public static abstract interface OnInflateFinishedListener
  {
    public abstract void onInflateFinished(@NonNull View paramView, @LayoutRes int paramInt, @Nullable ViewGroup paramViewGroup);
  }
}

/* Location:
 * Qualified Name:     androidx.asynclayoutinflater.view.AsyncLayoutInflater
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */