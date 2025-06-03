package com.google.firebase.perf.session.gauges;

import B3.x;
import K4.c;
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
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import r4.InterfaceC1922b;

@Keep
/* loaded from: classes.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private d applicationProcessState;
    private final C4.a configResolver;
    private final x cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final x gaugeManagerExecutor;
    private i gaugeMetadataManager;
    private final x memoryGaugeCollector;
    private String sessionId;
    private final k transportManager;
    private static final F4.a logger = F4.a.e();
    private static final GaugeManager instance = new GaugeManager();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11872a;

        static {
            int[] iArr = new int[d.values().length];
            f11872a = iArr;
            try {
                iArr[d.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11872a[d.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new x(new InterfaceC1922b() { // from class: K4.f
            @Override // r4.InterfaceC1922b
            public final Object get() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), k.l(), C4.a.g(), null, new x(new InterfaceC1922b() { // from class: K4.g
            @Override // r4.InterfaceC1922b
            public final Object get() {
                c lambda$new$0;
                lambda$new$0 = GaugeManager.lambda$new$0();
                return lambda$new$0;
            }
        }), new x(new InterfaceC1922b() { // from class: K4.h
            @Override // r4.InterfaceC1922b
            public final Object get() {
                l lambda$new$1;
                lambda$new$1 = GaugeManager.lambda$new$1();
                return lambda$new$1;
            }
        }));
    }

    private static void collectGaugeMetricOnce(c cVar, l lVar, M4.l lVar2) {
        cVar.c(lVar2);
        lVar.c(lVar2);
    }

    private long getCpuGaugeCollectionFrequencyMs(d dVar) {
        int i7 = a.f11872a[dVar.ordinal()];
        long z7 = i7 != 1 ? i7 != 2 ? -1L : this.configResolver.z() : this.configResolver.y();
        return c.f(z7) ? INVALID_GAUGE_COLLECTION_FREQUENCY : z7;
    }

    private f getGaugeMetadata() {
        return (f) f.Z().D(this.gaugeMetadataManager.a()).E(this.gaugeMetadataManager.b()).F(this.gaugeMetadataManager.c()).v();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(d dVar) {
        int i7 = a.f11872a[dVar.ordinal()];
        long C7 = i7 != 1 ? i7 != 2 ? -1L : this.configResolver.C() : this.configResolver.B();
        return l.e(C7) ? INVALID_GAUGE_COLLECTION_FREQUENCY : C7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c lambda$new$0() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l lambda$new$1() {
        return new l();
    }

    private boolean startCollectingCpuMetrics(long j7, M4.l lVar) {
        if (j7 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((c) this.cpuGaugeCollector.get()).k(j7, lVar);
        return true;
    }

    private long startCollectingGauges(d dVar, M4.l lVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(dVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, lVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(dVar);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, lVar) ? cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }

    private boolean startCollectingMemoryMetrics(long j7, M4.l lVar) {
        if (j7 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((l) this.memoryGaugeCollector.get()).j(j7, lVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, d dVar) {
        g.b i02 = g.i0();
        while (!((c) this.cpuGaugeCollector.get()).f3196a.isEmpty()) {
            i02.E((e) ((c) this.cpuGaugeCollector.get()).f3196a.poll());
        }
        while (!((l) this.memoryGaugeCollector.get()).f3219b.isEmpty()) {
            i02.D((b) ((l) this.memoryGaugeCollector.get()).f3219b.poll());
        }
        i02.G(str);
        this.transportManager.B((g) i02.v(), dVar);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new i(context);
    }

    public boolean logGaugeMetadata(String str, d dVar) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.B((g) g.i0().G(str).F(getGaugeMetadata()).v(), dVar);
        return true;
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final d dVar = this.applicationProcessState;
        ((c) this.cpuGaugeCollector.get()).l();
        ((l) this.memoryGaugeCollector.get()).k();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new Runnable() { // from class: K4.d
            @Override // java.lang.Runnable
            public final void run() {
                GaugeManager.this.lambda$stopCollectingGauges$3(str, dVar);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = d.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public GaugeManager(x xVar, k kVar, C4.a aVar, i iVar, x xVar2, x xVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = xVar;
        this.transportManager = kVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = iVar;
        this.cpuGaugeCollector = xVar2;
        this.memoryGaugeCollector = xVar3;
    }

    public void collectGaugeMetricOnce(M4.l lVar) {
        collectGaugeMetricOnce((c) this.cpuGaugeCollector.get(), (l) this.memoryGaugeCollector.get(), lVar);
    }

    public void startCollectingGauges(J4.a aVar, final d dVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(dVar, aVar.d());
        if (startCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String h7 = aVar.h();
        this.sessionId = h7;
        this.applicationProcessState = dVar;
        try {
            long j7 = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new Runnable() { // from class: K4.e
                @Override // java.lang.Runnable
                public final void run() {
                    GaugeManager.this.lambda$startCollectingGauges$2(h7, dVar);
                }
            }, j7, j7, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e7) {
            logger.j("Unable to start collecting Gauges: " + e7.getMessage());
        }
    }
}
