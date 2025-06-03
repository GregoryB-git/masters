package com.google.firebase.perf.session.gauges;

import B3.x;
import K4.c;
import K4.h;
import K4.i;
import L4.k;
import N4.b;
import N4.f.b;
import N4.g.b;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.protobuf.r.a;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Keep
public class GaugeManager
{
  private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20L;
  private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1L;
  private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20L;
  private static final GaugeManager instance = new GaugeManager();
  private static final F4.a logger = ;
  private N4.d applicationProcessState = N4.d.p;
  private final C4.a configResolver;
  private final x cpuGaugeCollector;
  private ScheduledFuture gaugeManagerDataCollectionJob = null;
  private final x gaugeManagerExecutor;
  private i gaugeMetadataManager;
  private final x memoryGaugeCollector;
  private String sessionId = null;
  private final k transportManager;
  
  @SuppressLint({"ThreadPoolCreation"})
  private GaugeManager()
  {
    this(new x(new K4.f()), k.l(), C4.a.g(), null, new x(new K4.g()), new x(new h()));
  }
  
  public GaugeManager(x paramx1, k paramk, C4.a parama, i parami, x paramx2, x paramx3)
  {
    gaugeManagerExecutor = paramx1;
    transportManager = paramk;
    configResolver = parama;
    gaugeMetadataManager = parami;
    cpuGaugeCollector = paramx2;
    memoryGaugeCollector = paramx3;
  }
  
  private static void collectGaugeMetricOnce(c paramc, K4.l paraml, M4.l paraml1)
  {
    paramc.c(paraml1);
    paraml.c(paraml1);
  }
  
  private long getCpuGaugeCollectionFrequencyMs(N4.d paramd)
  {
    int i = a.a[paramd.ordinal()];
    long l;
    if (i != 1)
    {
      if (i != 2) {
        l = -1L;
      } else {
        l = configResolver.z();
      }
    }
    else {
      l = configResolver.y();
    }
    if (c.f(l)) {
      return -1L;
    }
    return l;
  }
  
  private N4.f getGaugeMetadata()
  {
    return (N4.f)N4.f.Z().D(gaugeMetadataManager.a()).E(gaugeMetadataManager.b()).F(gaugeMetadataManager.c()).v();
  }
  
  public static GaugeManager getInstance()
  {
    try
    {
      GaugeManager localGaugeManager = instance;
      return localGaugeManager;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private long getMemoryGaugeCollectionFrequencyMs(N4.d paramd)
  {
    int i = a.a[paramd.ordinal()];
    long l;
    if (i != 1)
    {
      if (i != 2) {
        l = -1L;
      } else {
        l = configResolver.C();
      }
    }
    else {
      l = configResolver.B();
    }
    if (K4.l.e(l)) {
      return -1L;
    }
    return l;
  }
  
  private boolean startCollectingCpuMetrics(long paramLong, M4.l paraml)
  {
    if (paramLong == -1L)
    {
      logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
      return false;
    }
    ((c)cpuGaugeCollector.get()).k(paramLong, paraml);
    return true;
  }
  
  private long startCollectingGauges(N4.d paramd, M4.l paraml)
  {
    long l1 = getCpuGaugeCollectionFrequencyMs(paramd);
    if (!startCollectingCpuMetrics(l1, paraml)) {
      l1 = -1L;
    }
    long l2 = getMemoryGaugeCollectionFrequencyMs(paramd);
    long l3 = l1;
    if (startCollectingMemoryMetrics(l2, paraml)) {
      if (l1 == -1L) {
        l3 = l2;
      } else {
        l3 = Math.min(l1, l2);
      }
    }
    return l3;
  }
  
  private boolean startCollectingMemoryMetrics(long paramLong, M4.l paraml)
  {
    if (paramLong == -1L)
    {
      logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
      return false;
    }
    ((K4.l)memoryGaugeCollector.get()).j(paramLong, paraml);
    return true;
  }
  
  private void syncFlush(String paramString, N4.d paramd)
  {
    g.b localb = N4.g.i0();
    while (!cpuGaugeCollector.get()).a.isEmpty()) {
      localb.E((N4.e)cpuGaugeCollector.get()).a.poll());
    }
    while (!memoryGaugeCollector.get()).b.isEmpty()) {
      localb.D((b)memoryGaugeCollector.get()).b.poll());
    }
    localb.G(paramString);
    transportManager.B((N4.g)localb.v(), paramd);
  }
  
  public void collectGaugeMetricOnce(M4.l paraml)
  {
    collectGaugeMetricOnce((c)cpuGaugeCollector.get(), (K4.l)memoryGaugeCollector.get(), paraml);
  }
  
  public void initializeGaugeMetadataManager(Context paramContext)
  {
    gaugeMetadataManager = new i(paramContext);
  }
  
  public boolean logGaugeMetadata(String paramString, N4.d paramd)
  {
    if (gaugeMetadataManager != null)
    {
      paramString = (N4.g)N4.g.i0().G(paramString).F(getGaugeMetadata()).v();
      transportManager.B(paramString, paramd);
      return true;
    }
    return false;
  }
  
  public void startCollectingGauges(J4.a parama, N4.d paramd)
  {
    if (sessionId != null) {
      stopCollectingGauges();
    }
    long l = startCollectingGauges(paramd, parama.d());
    if (l == -1L)
    {
      logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
      return;
    }
    Object localObject = parama.h();
    sessionId = ((String)localObject);
    applicationProcessState = paramd;
    try
    {
      ScheduledExecutorService localScheduledExecutorService = (ScheduledExecutorService)gaugeManagerExecutor.get();
      parama = new K4/e;
      parama.<init>(this, (String)localObject, paramd);
      l *= 20L;
      gaugeManagerDataCollectionJob = localScheduledExecutorService.scheduleAtFixedRate(parama, l, l, TimeUnit.MILLISECONDS);
    }
    catch (RejectedExecutionException parama)
    {
      localObject = logger;
      paramd = new StringBuilder();
      paramd.append("Unable to start collecting Gauges: ");
      paramd.append(parama.getMessage());
      ((F4.a)localObject).j(paramd.toString());
    }
  }
  
  public void stopCollectingGauges()
  {
    String str = sessionId;
    if (str == null) {
      return;
    }
    N4.d locald = applicationProcessState;
    ((c)cpuGaugeCollector.get()).l();
    ((K4.l)memoryGaugeCollector.get()).k();
    ScheduledFuture localScheduledFuture = gaugeManagerDataCollectionJob;
    if (localScheduledFuture != null) {
      localScheduledFuture.cancel(false);
    }
    ((ScheduledExecutorService)gaugeManagerExecutor.get()).schedule(new K4.d(this, str, locald), 20L, TimeUnit.MILLISECONDS);
    sessionId = null;
    applicationProcessState = N4.d.p;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.perf.session.gauges.GaugeManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */