package com.facebook;

import android.os.Handler;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class RequestProgress
{
  private final Handler callbackHandler;
  private long lastReportedProgress;
  private long maxProgress;
  private long progress;
  private final GraphRequest request;
  private final long threshold;
  
  public RequestProgress(Handler paramHandler, GraphRequest paramGraphRequest)
  {
    request = paramGraphRequest;
    callbackHandler = paramHandler;
    threshold = FacebookSdk.getOnProgressThreshold();
  }
  
  public void addProgress(long paramLong)
  {
    paramLong = progress + paramLong;
    progress = paramLong;
    if ((paramLong >= lastReportedProgress + threshold) || (paramLong >= maxProgress)) {
      reportProgress();
    }
  }
  
  public void addToMax(long paramLong)
  {
    maxProgress += paramLong;
  }
  
  public long getMaxProgress()
  {
    return maxProgress;
  }
  
  public long getProgress()
  {
    return progress;
  }
  
  public void reportProgress()
  {
    if (progress > lastReportedProgress)
    {
      Object localObject = request.getCallback();
      long l1 = maxProgress;
      if ((l1 > 0L) && ((localObject instanceof GraphRequest.OnProgressCallback)))
      {
        final long l2 = progress;
        final GraphRequest.OnProgressCallback localOnProgressCallback = (GraphRequest.OnProgressCallback)localObject;
        localObject = callbackHandler;
        if (localObject == null) {
          localOnProgressCallback.onProgress(l2, l1);
        } else {
          ((Handler)localObject).post(new Runnable()
          {
            public void run()
            {
              if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
              }
              try
              {
                localOnProgressCallback.onProgress(l2, val$maxProgressCopy);
                return;
              }
              finally
              {
                CrashShieldHandler.handleThrowable(localThrowable, this);
              }
            }
          });
        }
        lastReportedProgress = progress;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.RequestProgress
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */