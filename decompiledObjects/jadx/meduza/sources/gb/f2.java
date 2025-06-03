package gb;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class f2 extends r0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ReferenceQueue<f2> f6364d = new ReferenceQueue<>();

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f6365e = new ConcurrentHashMap();
    public static final Logger f = Logger.getLogger(f2.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public final a f6366c;

    public static final class a extends WeakReference<f2> {
        public static final boolean f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* renamed from: g, reason: collision with root package name */
        public static final RuntimeException f6367g;

        /* renamed from: a, reason: collision with root package name */
        public final ReferenceQueue<f2> f6368a;

        /* renamed from: b, reason: collision with root package name */
        public final ConcurrentMap<a, a> f6369b;

        /* renamed from: c, reason: collision with root package name */
        public final String f6370c;

        /* renamed from: d, reason: collision with root package name */
        public final SoftReference f6371d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f6372e;

        static {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            f6367g = runtimeException;
        }

        public a(f2 f2Var, r1 r1Var, ReferenceQueue referenceQueue, ConcurrentHashMap concurrentHashMap) {
            super(f2Var, referenceQueue);
            this.f6372e = new AtomicBoolean();
            this.f6371d = new SoftReference(f ? new RuntimeException("ManagedChannel allocation site") : f6367g);
            this.f6370c = r1Var.toString();
            this.f6368a = referenceQueue;
            this.f6369b = concurrentHashMap;
            concurrentHashMap.put(this, this);
            a(referenceQueue);
        }

        public static void a(ReferenceQueue referenceQueue) {
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return;
                }
                RuntimeException runtimeException = (RuntimeException) aVar.f6371d.get();
                super.clear();
                aVar.f6369b.remove(aVar);
                aVar.f6371d.clear();
                if (!aVar.f6372e.get()) {
                    Level level = Level.SEVERE;
                    Logger logger = f2.f;
                    if (logger.isLoggable(level)) {
                        StringBuilder l10 = defpackage.f.l("*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*");
                        l10.append(System.getProperty("line.separator"));
                        l10.append("    Make sure to call shutdown()/shutdownNow()");
                        LogRecord logRecord = new LogRecord(level, l10.toString());
                        logRecord.setLoggerName(logger.getName());
                        logRecord.setParameters(new Object[]{aVar.f6370c});
                        logRecord.setThrown(runtimeException);
                        logger.log(logRecord);
                    }
                }
            }
        }

        @Override // java.lang.ref.Reference
        public final void clear() {
            super.clear();
            this.f6369b.remove(this);
            this.f6371d.clear();
            a(this.f6368a);
        }
    }

    public f2() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(r1 r1Var) {
        super(r1Var);
        ReferenceQueue<f2> referenceQueue = f6364d;
        ConcurrentHashMap concurrentHashMap = f6365e;
        this.f6366c = new a(this, r1Var, referenceQueue, concurrentHashMap);
    }

    @Override // eb.n0
    public final eb.n0 G() {
        a aVar = this.f6366c;
        if (!aVar.f6372e.getAndSet(true)) {
            aVar.clear();
        }
        return this.f6701b.G();
    }

    @Override // eb.n0
    public final eb.n0 H() {
        a aVar = this.f6366c;
        if (!aVar.f6372e.getAndSet(true)) {
            aVar.clear();
        }
        return this.f6701b.H();
    }
}
