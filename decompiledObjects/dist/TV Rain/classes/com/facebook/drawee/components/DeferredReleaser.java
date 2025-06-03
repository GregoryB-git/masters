package com.facebook.drawee.components;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.internal.Preconditions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DeferredReleaser
{
  private static DeferredReleaser sInstance;
  private final Set<Releasable> mPendingReleasables = new HashSet();
  private final Handler mUiHandler = new Handler(Looper.getMainLooper());
  private final Runnable releaseRunnable = new Runnable()
  {
    public void run()
    {
      DeferredReleaser.access$000();
      Iterator localIterator = DeferredReleaser.access$100(DeferredReleaser.this).iterator();
      while (localIterator.hasNext()) {
        ((DeferredReleaser.Releasable)localIterator.next()).release();
      }
      DeferredReleaser.access$100(DeferredReleaser.this).clear();
    }
  };
  
  private static void ensureOnUiThread()
  {
    boolean bool;
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool);
  }
  
  public static DeferredReleaser getInstance()
  {
    try
    {
      if (sInstance == null)
      {
        localDeferredReleaser = new com/facebook/drawee/components/DeferredReleaser;
        localDeferredReleaser.<init>();
        sInstance = localDeferredReleaser;
      }
      DeferredReleaser localDeferredReleaser = sInstance;
      return localDeferredReleaser;
    }
    finally {}
  }
  
  public void cancelDeferredRelease(Releasable paramReleasable)
  {
    ensureOnUiThread();
    mPendingReleasables.remove(paramReleasable);
  }
  
  public void scheduleDeferredRelease(Releasable paramReleasable)
  {
    
    if (!mPendingReleasables.add(paramReleasable)) {
      return;
    }
    if (mPendingReleasables.size() == 1) {
      mUiHandler.post(releaseRunnable);
    }
  }
  
  public static abstract interface Releasable
  {
    public abstract void release();
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.components.DeferredReleaser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */