package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.List;
import z2;

public class GraphRequestAsyncTask
  extends AsyncTask<Void, Void, List<GraphResponse>>
{
  private static final String TAG = GraphRequestAsyncTask.class.getCanonicalName();
  private final HttpURLConnection connection;
  private Exception exception;
  private final GraphRequestBatch requests;
  
  public GraphRequestAsyncTask(GraphRequestBatch paramGraphRequestBatch)
  {
    this(null, paramGraphRequestBatch);
  }
  
  public GraphRequestAsyncTask(HttpURLConnection paramHttpURLConnection, GraphRequestBatch paramGraphRequestBatch)
  {
    requests = paramGraphRequestBatch;
    connection = paramHttpURLConnection;
  }
  
  public GraphRequestAsyncTask(HttpURLConnection paramHttpURLConnection, Collection<GraphRequest> paramCollection)
  {
    this(paramHttpURLConnection, new GraphRequestBatch(paramCollection));
  }
  
  public GraphRequestAsyncTask(HttpURLConnection paramHttpURLConnection, GraphRequest... paramVarArgs)
  {
    this(paramHttpURLConnection, new GraphRequestBatch(paramVarArgs));
  }
  
  public GraphRequestAsyncTask(Collection<GraphRequest> paramCollection)
  {
    this(null, new GraphRequestBatch(paramCollection));
  }
  
  public GraphRequestAsyncTask(GraphRequest... paramVarArgs)
  {
    this(null, new GraphRequestBatch(paramVarArgs));
  }
  
  /* Error */
  public List<GraphResponse> doInBackground(Void... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 56	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: aload_0
    //   10: getfield 35	com/facebook/GraphRequestAsyncTask:connection	Ljava/net/HttpURLConnection;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnonnull +11 -> 26
    //   18: aload_0
    //   19: getfield 33	com/facebook/GraphRequestAsyncTask:requests	Lcom/facebook/GraphRequestBatch;
    //   22: invokevirtual 71	com/facebook/GraphRequestBatch:executeAndWait	()Ljava/util/List;
    //   25: areturn
    //   26: aload_1
    //   27: aload_0
    //   28: getfield 33	com/facebook/GraphRequestAsyncTask:requests	Lcom/facebook/GraphRequestBatch;
    //   31: invokestatic 77	com/facebook/GraphRequest:executeConnectionAndWait	(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)Ljava/util/List;
    //   34: astore_1
    //   35: aload_1
    //   36: areturn
    //   37: astore_1
    //   38: goto +11 -> 49
    //   41: astore_1
    //   42: aload_0
    //   43: aload_1
    //   44: putfield 79	com/facebook/GraphRequestAsyncTask:exception	Ljava/lang/Exception;
    //   47: aconst_null
    //   48: areturn
    //   49: aload_1
    //   50: aload_0
    //   51: invokestatic 65	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   54: aconst_null
    //   55: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	GraphRequestAsyncTask
    //   0	56	1	paramVarArgs	Void[]
    // Exception table:
    //   from	to	target	type
    //   9	14	37	finally
    //   18	26	37	finally
    //   26	35	37	finally
    //   42	47	37	finally
    //   9	14	41	java/lang/Exception
    //   18	26	41	java/lang/Exception
    //   26	35	41	java/lang/Exception
  }
  
  public final Exception getException()
  {
    return exception;
  }
  
  public final GraphRequestBatch getRequests()
  {
    return requests;
  }
  
  public void onPostExecute(List<GraphResponse> paramList)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      super.onPostExecute(paramList);
      paramList = exception;
      if (paramList != null) {
        Utility.logd(TAG, String.format("onPostExecute: exception encountered during request: %s", new Object[] { paramList.getMessage() }));
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramList, this);
    }
  }
  
  public void onPreExecute()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      super.onPreExecute();
      if (FacebookSdk.isDebugEnabled()) {
        Utility.logd(TAG, String.format("execute async task: %s", new Object[] { this }));
      }
      if (requests.getCallbackHandler() == null)
      {
        Handler localHandler;
        if ((Thread.currentThread() instanceof HandlerThread))
        {
          localHandler = new android/os/Handler;
          localHandler.<init>();
        }
        else
        {
          localHandler = new Handler(Looper.getMainLooper());
        }
        requests.setCallbackHandler(localHandler);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.u("{RequestAsyncTask: ", " connection: ");
    localStringBuilder.append(connection);
    localStringBuilder.append(", requests: ");
    localStringBuilder.append(requests);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.facebook.GraphRequestAsyncTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */