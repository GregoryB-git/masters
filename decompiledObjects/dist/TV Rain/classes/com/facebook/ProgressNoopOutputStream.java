package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

class ProgressNoopOutputStream
  extends OutputStream
  implements RequestOutputStream
{
  private int batchMax;
  private final Handler callbackHandler;
  private GraphRequest currentRequest;
  private RequestProgress currentRequestProgress;
  private final Map<GraphRequest, RequestProgress> progressMap = new HashMap();
  
  public ProgressNoopOutputStream(Handler paramHandler)
  {
    callbackHandler = paramHandler;
  }
  
  public void addProgress(long paramLong)
  {
    if (currentRequestProgress == null)
    {
      RequestProgress localRequestProgress = new RequestProgress(callbackHandler, currentRequest);
      currentRequestProgress = localRequestProgress;
      progressMap.put(currentRequest, localRequestProgress);
    }
    currentRequestProgress.addToMax(paramLong);
    batchMax = ((int)(batchMax + paramLong));
  }
  
  public int getMaxProgress()
  {
    return batchMax;
  }
  
  public Map<GraphRequest, RequestProgress> getProgressMap()
  {
    return progressMap;
  }
  
  public void setCurrentRequest(GraphRequest paramGraphRequest)
  {
    currentRequest = paramGraphRequest;
    if (paramGraphRequest != null) {
      paramGraphRequest = (RequestProgress)progressMap.get(paramGraphRequest);
    } else {
      paramGraphRequest = null;
    }
    currentRequestProgress = paramGraphRequest;
  }
  
  public void write(int paramInt)
  {
    addProgress(1L);
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    addProgress(paramArrayOfByte.length);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    addProgress(paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.facebook.ProgressNoopOutputStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */