/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package com.google.firebase.perf.session.gauges;

import B3.x;
import J4.a;
import K4.c;
import K4.f;
import K4.g;
import K4.h;
import K4.i;
import K4.l;
import L4.k;
import N4.b;
import N4.d;
import N4.e;
import N4.f;
import N4.g;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.protobuf.r;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20L;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1L;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20L;
    private static final GaugeManager instance;
    private static final F4.a logger;
    private d applicationProcessState = d.p;
    private final C4.a configResolver;
    private final x cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob = null;
    private final x gaugeManagerExecutor;
    private i gaugeMetadataManager;
    private final x memoryGaugeCollector;
    private String sessionId = null;
    private final k transportManager;

    static {
        logger = F4.a.e();
        instance = new GaugeManager();
    }

    @SuppressLint(value={"ThreadPoolCreation"})
    private GaugeManager() {
        this(new x(new f()), k.l(), C4.a.g(), null, new x(new g()), new x(new h()));
    }

    public GaugeManager(x x8, k k8, C4.a a8, i i8, x x9, x x10) {
        this.gaugeManagerExecutor = x8;
        this.transportManager = k8;
        this.configResolver = a8;
        this.gaugeMetadataManager = i8;
        this.cpuGaugeCollector = x9;
        this.memoryGaugeCollector = x10;
    }

    public static /* synthetic */ void a(GaugeManager gaugeManager, String string2, d d8) {
        gaugeManager.lambda$startCollectingGauges$2(string2, d8);
    }

    public static /* synthetic */ l b() {
        return GaugeManager.lambda$new$1();
    }

    public static /* synthetic */ c c() {
        return GaugeManager.lambda$new$0();
    }

    private static void collectGaugeMetricOnce(c c8, l l8, M4.l l9) {
        c8.c(l9);
        l8.c(l9);
    }

    public static /* synthetic */ void d(GaugeManager gaugeManager, String string2, d d8) {
        gaugeManager.lambda$stopCollectingGauges$3(string2, d8);
    }

    private long getCpuGaugeCollectionFrequencyMs(d d8) {
        int n8 = .a[d8.ordinal()];
        long l8 = n8 != 1 ? (n8 != 2 ? -1L : this.configResolver.z()) : this.configResolver.y();
        if (c.f(l8)) {
            return -1L;
        }
        return l8;
    }

    private N4.f getGaugeMetadata() {
        return (N4.f)N4.f.Z().D(this.gaugeMetadataManager.a()).E(this.gaugeMetadataManager.b()).F(this.gaugeMetadataManager.c()).v();
    }

    public static GaugeManager getInstance() {
        synchronized (GaugeManager.class) {
            GaugeManager gaugeManager = instance;
            return gaugeManager;
        }
    }

    private long getMemoryGaugeCollectionFrequencyMs(d d8) {
        int n8 = .a[d8.ordinal()];
        long l8 = n8 != 1 ? (n8 != 2 ? -1L : this.configResolver.C()) : this.configResolver.B();
        if (l.e(l8)) {
            return -1L;
        }
        return l8;
    }

    private static /* synthetic */ c lambda$new$0() {
        return new c();
    }

    private static /* synthetic */ l lambda$new$1() {
        return new l();
    }

    private /* synthetic */ void lambda$startCollectingGauges$2(String string2, d d8) {
        this.syncFlush(string2, d8);
    }

    private /* synthetic */ void lambda$stopCollectingGauges$3(String string2, d d8) {
        this.syncFlush(string2, d8);
    }

    private boolean startCollectingCpuMetrics(long l8, M4.l l9) {
        if (l8 == -1L) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((c)this.cpuGaugeCollector.get()).k(l8, l9);
        return true;
    }

    private long startCollectingGauges(d d8, M4.l l8) {
        long l9 = this.getCpuGaugeCollectionFrequencyMs(d8);
        if (!this.startCollectingCpuMetrics(l9, l8)) {
            l9 = -1L;
        }
        long l10 = this.getMemoryGaugeCollectionFrequencyMs(d8);
        long l11 = l9;
        if (this.startCollectingMemoryMetrics(l10, l8)) {
            if (l9 == -1L) {
                return l10;
            }
            l11 = Math.min((long)l9, (long)l10);
        }
        return l11;
    }

    private boolean startCollectingMemoryMetrics(long l8, M4.l l9) {
        if (l8 == -1L) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((l)this.memoryGaugeCollector.get()).j(l8, l9);
        return true;
    }

    private void syncFlush(String string2, d d8) {
        g.b b8 = N4.g.i0();
        while (!((c)this.cpuGaugeCollector.get()).a.isEmpty()) {
            b8.E((e)((c)this.cpuGaugeCollector.get()).a.poll());
        }
        while (!((l)this.memoryGaugeCollector.get()).b.isEmpty()) {
            b8.D((b)((l)this.memoryGaugeCollector.get()).b.poll());
        }
        b8.G(string2);
        this.transportManager.B((N4.g)b8.v(), d8);
    }

    public void collectGaugeMetricOnce(M4.l l8) {
        GaugeManager.collectGaugeMetricOnce((c)this.cpuGaugeCollector.get(), (l)this.memoryGaugeCollector.get(), l8);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new i(context);
    }

    public boolean logGaugeMetadata(String object, d d8) {
        if (this.gaugeMetadataManager != null) {
            object = (N4.g)N4.g.i0().G((String)object).F(this.getGaugeMetadata()).v();
            this.transportManager.B((N4.g)object, d8);
            return true;
        }
        return false;
    }

    public void startCollectingGauges(a a8, d object) {
        long l8;
        String string2;
        if (this.sessionId != null) {
            this.stopCollectingGauges();
        }
        if ((l8 = this.startCollectingGauges((d)object, a8.d())) == -1L) {
            logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        this.sessionId = string2 = a8.h();
        this.applicationProcessState = object;
        try {
            a8 = (ScheduledExecutorService)this.gaugeManagerExecutor.get();
            object = new K4.e(this, string2, (d)object);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            object = logger;
            string2 = new StringBuilder();
            string2.append("Unable to start collecting Gauges: ");
            string2.append(rejectedExecutionException.getMessage());
            object.j(string2.toString());
            return;
        }
        l8 *= 20L;
        this.gaugeManagerDataCollectionJob = a8.scheduleAtFixedRate((Runnable)object, l8, l8, TimeUnit.MILLISECONDS);
    }

    public void stopCollectingGauges() {
        String string2 = this.sessionId;
        if (string2 == null) {
            return;
        }
        d d8 = this.applicationProcessState;
        ((c)this.cpuGaugeCollector.get()).l();
        ((l)this.memoryGaugeCollector.get()).k();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ((ScheduledExecutorService)this.gaugeManagerExecutor.get()).schedule((Runnable)new K4.d(this, string2, d8), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = d.p;
    }

}

