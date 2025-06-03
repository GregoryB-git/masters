package com.facebook.drawee.components;

public class RetryManager
{
  private static final int MAX_TAP_TO_RETRY_ATTEMPTS = 4;
  private int mMaxTapToRetryAttempts;
  private int mTapToRetryAttempts;
  private boolean mTapToRetryEnabled;
  
  public RetryManager()
  {
    init();
  }
  
  public static RetryManager newInstance()
  {
    return new RetryManager();
  }
  
  public void init()
  {
    mTapToRetryEnabled = false;
    mMaxTapToRetryAttempts = 4;
    reset();
  }
  
  public boolean isTapToRetryEnabled()
  {
    return mTapToRetryEnabled;
  }
  
  public void notifyTapToRetry()
  {
    mTapToRetryAttempts += 1;
  }
  
  public void reset()
  {
    mTapToRetryAttempts = 0;
  }
  
  public void setMaxTapToRetryAttemps(int paramInt)
  {
    mMaxTapToRetryAttempts = paramInt;
  }
  
  public void setTapToRetryEnabled(boolean paramBoolean)
  {
    mTapToRetryEnabled = paramBoolean;
  }
  
  public boolean shouldRetryOnTap()
  {
    boolean bool;
    if ((mTapToRetryEnabled) && (mTapToRetryAttempts < mMaxTapToRetryAttempts)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.components.RetryManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */