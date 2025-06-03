package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TransportRuntime
  implements TransportInternal
{
  private static volatile TransportRuntimeComponent instance;
  private final Clock eventClock;
  private final Scheduler scheduler;
  private final Uploader uploader;
  private final Clock uptimeClock;
  
  @Inject
  public TransportRuntime(@WallTime Clock paramClock1, @Monotonic Clock paramClock2, Scheduler paramScheduler, Uploader paramUploader, WorkInitializer paramWorkInitializer)
  {
    eventClock = paramClock1;
    uptimeClock = paramClock2;
    scheduler = paramScheduler;
    uploader = paramUploader;
    paramWorkInitializer.ensureContextsScheduled();
  }
  
  private EventInternal convert(SendRequest paramSendRequest)
  {
    return EventInternal.builder().setEventMillis(eventClock.getTime()).setUptimeMillis(uptimeClock.getTime()).setTransportName(paramSendRequest.getTransportName()).setEncodedPayload(new EncodedPayload(paramSendRequest.getEncoding(), paramSendRequest.getPayload())).setCode(paramSendRequest.getEvent().getCode()).build();
  }
  
  public static TransportRuntime getInstance()
  {
    TransportRuntimeComponent localTransportRuntimeComponent = instance;
    if (localTransportRuntimeComponent != null) {
      return localTransportRuntimeComponent.getTransportRuntime();
    }
    throw new IllegalStateException("Not initialized!");
  }
  
  private static Set<Encoding> getSupportedEncodings(Destination paramDestination)
  {
    if ((paramDestination instanceof EncodedDestination)) {
      return Collections.unmodifiableSet(((EncodedDestination)paramDestination).getSupportedEncodings());
    }
    return Collections.singleton(Encoding.of("proto"));
  }
  
  public static void initialize(Context paramContext)
  {
    if (instance == null) {
      try
      {
        if (instance == null) {
          instance = DaggerTransportRuntimeComponent.builder().setApplicationContext(paramContext).build();
        }
      }
      finally {}
    }
  }
  
  /* Error */
  @RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
  @androidx.annotation.VisibleForTesting
  public static void withInstance(TransportRuntimeComponent paramTransportRuntimeComponent, java.util.concurrent.Callable<Void> paramCallable)
    throws java.lang.Throwable
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 112	com/google/android/datatransport/runtime/TransportRuntime:instance	Lcom/google/android/datatransport/runtime/TransportRuntimeComponent;
    //   6: astore_2
    //   7: aload_0
    //   8: putstatic 112	com/google/android/datatransport/runtime/TransportRuntime:instance	Lcom/google/android/datatransport/runtime/TransportRuntimeComponent;
    //   11: ldc 2
    //   13: monitorexit
    //   14: aload_1
    //   15: invokeinterface 182 1 0
    //   20: pop
    //   21: ldc 2
    //   23: monitorenter
    //   24: aload_2
    //   25: putstatic 112	com/google/android/datatransport/runtime/TransportRuntime:instance	Lcom/google/android/datatransport/runtime/TransportRuntimeComponent;
    //   28: ldc 2
    //   30: monitorexit
    //   31: return
    //   32: astore_0
    //   33: ldc 2
    //   35: monitorexit
    //   36: aload_0
    //   37: athrow
    //   38: astore_0
    //   39: ldc 2
    //   41: monitorenter
    //   42: aload_2
    //   43: putstatic 112	com/google/android/datatransport/runtime/TransportRuntime:instance	Lcom/google/android/datatransport/runtime/TransportRuntimeComponent;
    //   46: ldc 2
    //   48: monitorexit
    //   49: aload_0
    //   50: athrow
    //   51: astore_0
    //   52: ldc 2
    //   54: monitorexit
    //   55: aload_0
    //   56: athrow
    //   57: astore_0
    //   58: ldc 2
    //   60: monitorexit
    //   61: aload_0
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	paramTransportRuntimeComponent	TransportRuntimeComponent
    //   0	63	1	paramCallable	java.util.concurrent.Callable<Void>
    //   6	37	2	localTransportRuntimeComponent	TransportRuntimeComponent
    // Exception table:
    //   from	to	target	type
    //   24	31	32	finally
    //   33	36	32	finally
    //   14	21	38	finally
    //   42	49	51	finally
    //   52	55	51	finally
    //   3	14	57	finally
    //   58	61	57	finally
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public Uploader getUploader()
  {
    return uploader;
  }
  
  public TransportFactory newFactory(Destination paramDestination)
  {
    return new TransportFactoryImpl(getSupportedEncodings(paramDestination), TransportContext.builder().setBackendName(paramDestination.getName()).setExtras(paramDestination.getExtras()).build(), this);
  }
  
  @Deprecated
  public TransportFactory newFactory(String paramString)
  {
    return new TransportFactoryImpl(getSupportedEncodings(null), TransportContext.builder().setBackendName(paramString).build(), this);
  }
  
  public void send(SendRequest paramSendRequest, TransportScheduleCallback paramTransportScheduleCallback)
  {
    scheduler.schedule(paramSendRequest.getTransportContext().withPriority(paramSendRequest.getEvent().getPriority()), convert(paramSendRequest), paramTransportScheduleCallback);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.TransportRuntime
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */