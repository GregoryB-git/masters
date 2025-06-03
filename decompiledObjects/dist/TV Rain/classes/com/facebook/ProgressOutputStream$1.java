package com.facebook;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class ProgressOutputStream$1
  implements Runnable
{
  public ProgressOutputStream$1(ProgressOutputStream paramProgressOutputStream, GraphRequestBatch.OnProgressCallback paramOnProgressCallback) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      val$progressCallback.onBatchProgress(ProgressOutputStream.access$000(this$0), ProgressOutputStream.access$100(this$0), ProgressOutputStream.access$200(this$0));
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.ProgressOutputStream.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */