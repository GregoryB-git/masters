package com.facebook;

import android.os.Handler;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class ProgressOutputStream
  extends FilterOutputStream
  implements RequestOutputStream
{
  private long batchProgress;
  private RequestProgress currentRequestProgress;
  private long lastReportedProgress;
  private long maxProgress;
  private final Map<GraphRequest, RequestProgress> progressMap;
  private final GraphRequestBatch requests;
  private final long threshold;
  
  public ProgressOutputStream(OutputStream paramOutputStream, GraphRequestBatch paramGraphRequestBatch, Map<GraphRequest, RequestProgress> paramMap, long paramLong)
  {
    super(paramOutputStream);
    requests = paramGraphRequestBatch;
    progressMap = paramMap;
    maxProgress = paramLong;
    threshold = FacebookSdk.getOnProgressThreshold();
  }
  
  private void addProgress(long paramLong)
  {
    RequestProgress localRequestProgress = currentRequestProgress;
    if (localRequestProgress != null) {
      localRequestProgress.addProgress(paramLong);
    }
    paramLong = batchProgress + paramLong;
    batchProgress = paramLong;
    if ((paramLong >= lastReportedProgress + threshold) || (paramLong >= maxProgress)) {
      reportBatchProgress();
    }
  }
  
  private void reportBatchProgress()
  {
    if (batchProgress > lastReportedProgress)
    {
      Iterator localIterator = requests.getCallbacks().iterator();
      while (localIterator.hasNext())
      {
        final Object localObject = (GraphRequestBatch.Callback)localIterator.next();
        if ((localObject instanceof GraphRequestBatch.OnProgressCallback))
        {
          Handler localHandler = requests.getCallbackHandler();
          localObject = (GraphRequestBatch.OnProgressCallback)localObject;
          if (localHandler == null) {
            ((GraphRequestBatch.OnProgressCallback)localObject).onBatchProgress(requests, batchProgress, maxProgress);
          } else {
            localHandler.post(new Runnable()
            {
              public void run()
              {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                  return;
                }
                try
                {
                  localObject.onBatchProgress(ProgressOutputStream.access$000(ProgressOutputStream.this), ProgressOutputStream.access$100(ProgressOutputStream.this), ProgressOutputStream.access$200(ProgressOutputStream.this));
                  return;
                }
                finally
                {
                  CrashShieldHandler.handleThrowable(localThrowable, this);
                }
              }
            });
          }
        }
      }
      lastReportedProgress = batchProgress;
    }
  }
  
  public void close()
    throws IOException
  {
    super.close();
    Iterator localIterator = progressMap.values().iterator();
    while (localIterator.hasNext()) {
      ((RequestProgress)localIterator.next()).reportProgress();
    }
    reportBatchProgress();
  }
  
  public long getBatchProgress()
  {
    return batchProgress;
  }
  
  public long getMaxProgress()
  {
    return maxProgress;
  }
  
  public void setCurrentRequest(GraphRequest paramGraphRequest)
  {
    if (paramGraphRequest != null) {
      paramGraphRequest = (RequestProgress)progressMap.get(paramGraphRequest);
    } else {
      paramGraphRequest = null;
    }
    currentRequestProgress = paramGraphRequest;
  }
  
  public void write(int paramInt)
    throws IOException
  {
    out.write(paramInt);
    addProgress(1L);
  }
  
  public void write(byte[] paramArrayOfByte)
    throws IOException
  {
    out.write(paramArrayOfByte);
    addProgress(paramArrayOfByte.length);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    out.write(paramArrayOfByte, paramInt1, paramInt2);
    addProgress(paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.facebook.ProgressOutputStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */