package androidx.mediarouter.media;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

class MediaRouterActiveScanThrottlingHelper
{
  public static final long MAX_ACTIVE_SCAN_DURATION_MS = 30000L;
  private boolean mActiveScan;
  private long mCurrentTime;
  private final Handler mHandler = new Handler(Looper.getMainLooper());
  private long mSuppressActiveScanTimeout;
  private final Runnable mUpdateDiscoveryRequestRunnable;
  
  public MediaRouterActiveScanThrottlingHelper(Runnable paramRunnable)
  {
    mUpdateDiscoveryRequestRunnable = paramRunnable;
  }
  
  public boolean finalizeActiveScanAndScheduleSuppressActiveScanRunnable()
  {
    if (mActiveScan)
    {
      long l = mSuppressActiveScanTimeout;
      if (l > 0L) {
        mHandler.postDelayed(mUpdateDiscoveryRequestRunnable, l);
      }
    }
    return mActiveScan;
  }
  
  public void requestActiveScan(boolean paramBoolean, long paramLong)
  {
    if (!paramBoolean) {
      return;
    }
    long l = mCurrentTime;
    if (l - paramLong >= 30000L) {
      return;
    }
    mSuppressActiveScanTimeout = Math.max(mSuppressActiveScanTimeout, paramLong + 30000L - l);
    mActiveScan = true;
  }
  
  public void reset()
  {
    mSuppressActiveScanTimeout = 0L;
    mActiveScan = false;
    mCurrentTime = SystemClock.elapsedRealtime();
    mHandler.removeCallbacks(mUpdateDiscoveryRequestRunnable);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterActiveScanThrottlingHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */