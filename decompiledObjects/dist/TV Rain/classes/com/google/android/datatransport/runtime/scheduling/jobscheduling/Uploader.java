package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.EventInternal.Builder;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendRequest.Builder;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.BackendResponse.Status;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import s4;
import u4;
import w4;
import x4;
import y4;
import z4;

public class Uploader
{
  private static final String CLIENT_HEALTH_METRICS_LOG_SOURCE = "GDT_CLIENT_METRICS";
  private static final String LOG_TAG = "Uploader";
  private final BackendRegistry backendRegistry;
  private final ClientHealthMetricsStore clientHealthMetricsStore;
  private final Clock clock;
  private final Context context;
  private final EventStore eventStore;
  private final Executor executor;
  private final SynchronizationGuard guard;
  private final Clock uptimeClock;
  private final WorkScheduler workScheduler;
  
  @Inject
  public Uploader(Context paramContext, BackendRegistry paramBackendRegistry, EventStore paramEventStore, WorkScheduler paramWorkScheduler, Executor paramExecutor, SynchronizationGuard paramSynchronizationGuard, @WallTime Clock paramClock1, @Monotonic Clock paramClock2, ClientHealthMetricsStore paramClientHealthMetricsStore)
  {
    context = paramContext;
    backendRegistry = paramBackendRegistry;
    eventStore = paramEventStore;
    workScheduler = paramWorkScheduler;
    executor = paramExecutor;
    guard = paramSynchronizationGuard;
    clock = paramClock1;
    uptimeClock = paramClock2;
    clientHealthMetricsStore = paramClientHealthMetricsStore;
  }
  
  @VisibleForTesting
  public EventInternal createMetricsEvent(TransportBackend paramTransportBackend)
  {
    SynchronizationGuard localSynchronizationGuard = guard;
    Object localObject = clientHealthMetricsStore;
    Objects.requireNonNull(localObject);
    localObject = (ClientMetrics)localSynchronizationGuard.runCriticalSection(new s4(localObject, 2));
    return paramTransportBackend.decorate(EventInternal.builder().setEventMillis(clock.getTime()).setUptimeMillis(uptimeClock.getTime()).setTransportName("GDT_CLIENT_METRICS").setEncodedPayload(new EncodedPayload(Encoding.of("proto"), ((ClientMetrics)localObject).toByteArray())).build());
  }
  
  public boolean isNetworkAvailable()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
    boolean bool;
    if ((localNetworkInfo != null) && (localNetworkInfo.isConnected())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public BackendResponse logAndUpdateState(TransportContext paramTransportContext, int paramInt)
  {
    TransportBackend localTransportBackend = backendRegistry.get(paramTransportContext.getBackendName());
    long l1 = 0L;
    Object localObject1 = BackendResponse.ok(0L);
    while (((Boolean)guard.runCriticalSection(new w4(this, paramTransportContext, 0))).booleanValue())
    {
      Object localObject2 = (Iterable)guard.runCriticalSection(new w4(this, paramTransportContext, 1));
      if (!((Iterable)localObject2).iterator().hasNext()) {
        return (BackendResponse)localObject1;
      }
      if (localTransportBackend == null) {
        Logging.d("Uploader", "Unknown backend for %s, deleting event batch for it...", paramTransportContext);
      }
      for (Object localObject3 = BackendResponse.fatalError();; localObject3 = localTransportBackend.send(BackendRequest.builder().setEvents((Iterable)localObject3).setExtras(paramTransportContext.getExtras()).build()))
      {
        break;
        localObject3 = new ArrayList();
        localObject1 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((ArrayList)localObject3).add(((PersistedEvent)((Iterator)localObject1).next()).getEvent());
        }
        if (paramTransportContext.shouldUploadClientHealthMetrics()) {
          ((ArrayList)localObject3).add(createMetricsEvent(localTransportBackend));
        }
      }
      if (((BackendResponse)localObject3).getStatus() == BackendResponse.Status.TRANSIENT_ERROR)
      {
        guard.runCriticalSection(new x4(this, (Iterable)localObject2, paramTransportContext, l1));
        workScheduler.schedule(paramTransportContext, paramInt + 1, true);
        return (BackendResponse)localObject3;
      }
      guard.runCriticalSection(new y4(this, localObject2, 0));
      if (((BackendResponse)localObject3).getStatus() == BackendResponse.Status.OK)
      {
        long l2 = Math.max(l1, ((BackendResponse)localObject3).getNextRequestWaitMillis());
        l1 = l2;
        localObject1 = localObject3;
        if (paramTransportContext.shouldUploadClientHealthMetrics())
        {
          guard.runCriticalSection(new s4(this, 4));
          l1 = l2;
          localObject1 = localObject3;
        }
      }
      else
      {
        localObject1 = localObject3;
        if (((BackendResponse)localObject3).getStatus() == BackendResponse.Status.INVALID_PAYLOAD)
        {
          localObject1 = new HashMap();
          localObject2 = ((Iterable)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            String str = ((PersistedEvent)((Iterator)localObject2).next()).getEvent().getTransportName();
            if (!((HashMap)localObject1).containsKey(str)) {
              ((HashMap)localObject1).put(str, Integer.valueOf(1));
            } else {
              ((HashMap)localObject1).put(str, Integer.valueOf(((Integer)((HashMap)localObject1).get(str)).intValue() + 1));
            }
          }
          guard.runCriticalSection(new y4(this, localObject1, 1));
          localObject1 = localObject3;
        }
      }
    }
    guard.runCriticalSection(new z4(this, paramTransportContext, l1));
    return (BackendResponse)localObject1;
  }
  
  public void upload(TransportContext paramTransportContext, int paramInt, Runnable paramRunnable)
  {
    executor.execute(new u4(this, paramTransportContext, paramInt, paramRunnable));
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */