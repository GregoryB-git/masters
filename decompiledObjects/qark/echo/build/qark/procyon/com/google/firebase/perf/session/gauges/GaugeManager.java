// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.perf.session.gauges;

import com.google.protobuf.r;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import N4.e;
import K4.c;
import K4.l;
import android.annotation.SuppressLint;
import K4.h;
import K4.g;
import r4.b;
import K4.f;
import L4.k;
import K4.i;
import java.util.concurrent.ScheduledFuture;
import B3.x;
import N4.d;
import F4.a;
import androidx.annotation.Keep;

@Keep
public class GaugeManager
{
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20L;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1L;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20L;
    private static final GaugeManager instance;
    private static final a logger;
    private d applicationProcessState;
    private final C4.a configResolver;
    private final x cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final x gaugeManagerExecutor;
    private i gaugeMetadataManager;
    private final x memoryGaugeCollector;
    private String sessionId;
    private final k transportManager;
    
    static {
        logger = a.e();
        instance = new GaugeManager();
    }
    
    @SuppressLint({ "ThreadPoolCreation" })
    private GaugeManager() {
        this(new x(new f()), k.l(), C4.a.g(), null, new x(new g()), new x(new h()));
    }
    
    public GaugeManager(final x gaugeManagerExecutor, final k transportManager, final C4.a configResolver, final i gaugeMetadataManager, final x cpuGaugeCollector, final x memoryGaugeCollector) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = d.p;
        this.gaugeManagerExecutor = gaugeManagerExecutor;
        this.transportManager = transportManager;
        this.configResolver = configResolver;
        this.gaugeMetadataManager = gaugeMetadataManager;
        this.cpuGaugeCollector = cpuGaugeCollector;
        this.memoryGaugeCollector = memoryGaugeCollector;
    }
    
    private static void collectGaugeMetricOnce(final c c, final l l, final M4.l i) {
        c.c(i);
        l.c(i);
    }
    
    private long getCpuGaugeCollectionFrequencyMs(final d d) {
        final int n = GaugeManager$a.a[d.ordinal()];
        long n2;
        if (n != 1) {
            if (n != 2) {
                n2 = -1L;
            }
            else {
                n2 = this.configResolver.z();
            }
        }
        else {
            n2 = this.configResolver.y();
        }
        if (c.f(n2)) {
            return -1L;
        }
        return n2;
    }
    
    private N4.f getGaugeMetadata() {
        return (N4.f)((r.a)N4.f.Z().D(this.gaugeMetadataManager.a()).E(this.gaugeMetadataManager.b()).F(this.gaugeMetadataManager.c())).v();
    }
    
    public static GaugeManager getInstance() {
        synchronized (GaugeManager.class) {
            return GaugeManager.instance;
        }
    }
    
    private long getMemoryGaugeCollectionFrequencyMs(final d d) {
        final int n = GaugeManager$a.a[d.ordinal()];
        long n2;
        if (n != 1) {
            if (n != 2) {
                n2 = -1L;
            }
            else {
                n2 = this.configResolver.C();
            }
        }
        else {
            n2 = this.configResolver.B();
        }
        if (l.e(n2)) {
            return -1L;
        }
        return n2;
    }
    
    private boolean startCollectingCpuMetrics(final long n, final M4.l l) {
        if (n == -1L) {
            GaugeManager.logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((c)this.cpuGaugeCollector.get()).k(n, l);
        return true;
    }
    
    private long startCollectingGauges(final d d, final M4.l l) {
        long cpuGaugeCollectionFrequencyMs = this.getCpuGaugeCollectionFrequencyMs(d);
        if (!this.startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, l)) {
            cpuGaugeCollectionFrequencyMs = -1L;
        }
        final long memoryGaugeCollectionFrequencyMs = this.getMemoryGaugeCollectionFrequencyMs(d);
        long min = cpuGaugeCollectionFrequencyMs;
        if (this.startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, l)) {
            if (cpuGaugeCollectionFrequencyMs == -1L) {
                return memoryGaugeCollectionFrequencyMs;
            }
            min = Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return min;
    }
    
    private boolean startCollectingMemoryMetrics(final long n, final M4.l l) {
        if (n == -1L) {
            GaugeManager.logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((l)this.memoryGaugeCollector.get()).j(n, l);
        return true;
    }
    
    private void syncFlush(final String s, final d d) {
        final N4.g.b i0 = N4.g.i0();
        while (!((c)this.cpuGaugeCollector.get()).a.isEmpty()) {
            i0.E(((c)this.cpuGaugeCollector.get()).a.poll());
        }
        while (!((l)this.memoryGaugeCollector.get()).b.isEmpty()) {
            i0.D(((l)this.memoryGaugeCollector.get()).b.poll());
        }
        i0.G(s);
        this.transportManager.B((N4.g)((r.a)i0).v(), d);
    }
    
    public void collectGaugeMetricOnce(final M4.l l) {
        collectGaugeMetricOnce((c)this.cpuGaugeCollector.get(), (l)this.memoryGaugeCollector.get(), l);
    }
    
    public void initializeGaugeMetadataManager(final Context context) {
        this.gaugeMetadataManager = new i(context);
    }
    
    public boolean logGaugeMetadata(final String s, final d d) {
        if (this.gaugeMetadataManager != null) {
            this.transportManager.B((N4.g)((r.a)N4.g.i0().G(s).F(this.getGaugeMetadata())).v(), d);
            return true;
        }
        return false;
    }
    
    public void startCollectingGauges(final J4.a a, final d applicationProcessState) {
        if (this.sessionId != null) {
            this.stopCollectingGauges();
        }
        final long startCollectingGauges = this.startCollectingGauges(applicationProcessState, a.d());
        if (startCollectingGauges == -1L) {
            GaugeManager.logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String h = a.h();
        this.sessionId = h;
        this.applicationProcessState = applicationProcessState;
        try {
            final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)this.gaugeManagerExecutor.get();
            final K4.e e = new K4.e(this, h, applicationProcessState);
            final long n = startCollectingGauges * 20L;
            this.gaugeManagerDataCollectionJob = scheduledExecutorService.scheduleAtFixedRate(e, n, n, TimeUnit.MILLISECONDS);
        }
        catch (RejectedExecutionException ex) {
            final a logger = GaugeManager.logger;
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to start collecting Gauges: ");
            sb.append(ex.getMessage());
            logger.j(sb.toString());
        }
    }
    
    public void stopCollectingGauges() {
        final String sessionId = this.sessionId;
        if (sessionId == null) {
            return;
        }
        final d applicationProcessState = this.applicationProcessState;
        ((c)this.cpuGaugeCollector.get()).l();
        ((l)this.memoryGaugeCollector.get()).k();
        final ScheduledFuture gaugeManagerDataCollectionJob = this.gaugeManagerDataCollectionJob;
        if (gaugeManagerDataCollectionJob != null) {
            gaugeManagerDataCollectionJob.cancel(false);
        }
        ((ScheduledExecutorService)this.gaugeManagerExecutor.get()).schedule(new K4.d(this, sessionId, applicationProcessState), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = d.p;
    }
}
