package com.facebook;

import android.util.Pair;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class GraphRequest$5
  implements Runnable
{
  public GraphRequest$5(ArrayList paramArrayList, GraphRequestBatch paramGraphRequestBatch) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Iterator localIterator = val$callbacks.iterator();
      while (localIterator.hasNext())
      {
        localObject = (Pair)localIterator.next();
        ((GraphRequest.Callback)first).onCompleted((GraphResponse)second);
      }
      Object localObject = val$requests.getCallbacks().iterator();
      while (((Iterator)localObject).hasNext()) {
        ((GraphRequestBatch.Callback)((Iterator)localObject).next()).onBatchCompleted(val$requests);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.GraphRequest.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */