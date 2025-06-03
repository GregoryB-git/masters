package com.google.android.datatransport.runtime;

import android.annotation.SuppressLint;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;

public final class ForcedSender
{
  private static final String LOG_TAG = "ForcedSender";
  
  @SuppressLint({"DiscouragedApi"})
  @WorkerThread
  public static void sendBlocking(Transport<?> paramTransport, Priority paramPriority)
  {
    if ((paramTransport instanceof TransportImpl))
    {
      paramTransport = ((TransportImpl)paramTransport).getTransportContext().withPriority(paramPriority);
      TransportRuntime.getInstance().getUploader().logAndUpdateState(paramTransport, 1);
    }
    else
    {
      Logging.w("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", paramTransport);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.ForcedSender
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */