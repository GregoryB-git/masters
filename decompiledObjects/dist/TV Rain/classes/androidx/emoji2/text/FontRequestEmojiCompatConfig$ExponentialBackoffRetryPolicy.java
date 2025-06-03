package androidx.emoji2.text;

import android.os.SystemClock;

public class FontRequestEmojiCompatConfig$ExponentialBackoffRetryPolicy
  extends FontRequestEmojiCompatConfig.RetryPolicy
{
  private long mRetryOrigin;
  private final long mTotalMs;
  
  public FontRequestEmojiCompatConfig$ExponentialBackoffRetryPolicy(long paramLong)
  {
    mTotalMs = paramLong;
  }
  
  public long getRetryDelay()
  {
    if (mRetryOrigin == 0L)
    {
      mRetryOrigin = SystemClock.uptimeMillis();
      return 0L;
    }
    long l = SystemClock.uptimeMillis() - mRetryOrigin;
    if (l > mTotalMs) {
      return -1L;
    }
    return Math.min(Math.max(l, 1000L), mTotalMs - l);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.FontRequestEmojiCompatConfig.ExponentialBackoffRetryPolicy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */