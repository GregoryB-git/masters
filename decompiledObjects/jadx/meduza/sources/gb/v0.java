package gb;

import eb.c;
import eb.e1;
import eb.h;
import eb.h0;
import eb.k0;
import eb.s0;
import gb.h3;
import gb.t;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.c;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f6828a = Logger.getLogger(v0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Set<e1.a> f6829b = Collections.unmodifiableSet(EnumSet.of(e1.a.OK, e1.a.INVALID_ARGUMENT, e1.a.NOT_FOUND, e1.a.ALREADY_EXISTS, e1.a.FAILED_PRECONDITION, e1.a.ABORTED, e1.a.OUT_OF_RANGE, e1.a.DATA_LOSS));

    /* renamed from: c, reason: collision with root package name */
    public static final s0.b f6830c;

    /* renamed from: d, reason: collision with root package name */
    public static final s0.b f6831d;

    /* renamed from: e, reason: collision with root package name */
    public static final s0.f f6832e;
    public static final s0.b f;

    /* renamed from: g, reason: collision with root package name */
    public static final s0.f f6833g;

    /* renamed from: h, reason: collision with root package name */
    public static final s0.b f6834h;

    /* renamed from: i, reason: collision with root package name */
    public static final s0.b f6835i;

    /* renamed from: j, reason: collision with root package name */
    public static final s0.b f6836j;

    /* renamed from: k, reason: collision with root package name */
    public static final s0.b f6837k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f6838l;

    /* renamed from: m, reason: collision with root package name */
    public static final t2 f6839m;

    /* renamed from: n, reason: collision with root package name */
    public static final c.b<Boolean> f6840n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f6841o;

    /* renamed from: p, reason: collision with root package name */
    public static final b f6842p;

    /* renamed from: q, reason: collision with root package name */
    public static final c f6843q;

    /* renamed from: r, reason: collision with root package name */
    public static final d f6844r;

    public class a extends eb.h {
    }

    public class b implements h3.c<Executor> {
        @Override // gb.h3.c
        public final Executor a() {
            return Executors.newCachedThreadPool(v0.d("grpc-default-executor-%d"));
        }

        @Override // gb.h3.c
        public final void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        public final String toString() {
            return "grpc-default-executor";
        }
    }

    public class c implements h3.c<ScheduledExecutorService> {
        @Override // gb.h3.c
        public final ScheduledExecutorService a() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, v0.d("grpc-timer-%d"));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
            return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }

        @Override // gb.h3.c
        public final void b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }
    }

    public class d implements n7.q<n7.p> {
        @Override // n7.q
        public final n7.p get() {
            return new n7.p();
        }
    }

    public class e implements u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h.a f6845a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f6846b;

        public e(h.a aVar, u uVar) {
            this.f6845a = aVar;
            this.f6846b = uVar;
        }

        @Override // gb.u
        public final s d(eb.t0<?, ?> t0Var, eb.s0 s0Var, eb.c cVar, eb.h[] hVarArr) {
            eb.c cVar2 = eb.c.f5034k;
            x6.b.y(cVar, "callOptions cannot be null");
            eb.h a10 = this.f6845a.a(new h.b(cVar, 0, false), s0Var);
            x6.b.I(hVarArr[hVarArr.length - 1] == v0.f6841o, "lb tracer already assigned");
            hVarArr[hVarArr.length - 1] = a10;
            return this.f6846b.d(t0Var, s0Var, cVar, hVarArr);
        }

        @Override // eb.e0
        public final eb.f0 f() {
            return this.f6846b.f();
        }
    }

    public static final class f implements h0.a<byte[]> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // eb.s0.g
        public final byte[] a(Serializable serializable) {
            return (byte[]) serializable;
        }

        @Override // eb.s0.g
        public final Object b(byte[] bArr) {
            return bArr;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class g {

        /* renamed from: c, reason: collision with root package name */
        public static final g f6847c;

        /* renamed from: d, reason: collision with root package name */
        public static final g[] f6848d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ g[] f6849e;

        /* renamed from: a, reason: collision with root package name */
        public final int f6850a;

        /* renamed from: b, reason: collision with root package name */
        public final eb.e1 f6851b;

        /* JADX INFO: Fake field, exist only in values array */
        g EF0;

        /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
            	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
            	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkArrayForEach(LoopRegionVisitor.java:230)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:144)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:81)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:65)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:55)
            */
        static {
            /*
                Method dump skipped, instructions count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: gb.v0.g.<clinit>():void");
        }

        public g(String str, int i10, int i11, eb.e1 e1Var) {
            this.f6850a = i11;
            StringBuilder l10 = defpackage.f.l("HTTP/2 error code: ");
            l10.append(name());
            String sb2 = l10.toString();
            this.f6851b = e1Var.g(e1Var.f5082b != null ? defpackage.g.f(defpackage.g.g(sb2, " ("), e1Var.f5082b, ")") : sb2);
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f6849e.clone();
        }
    }

    public static class h implements s0.c<Long> {
        @Override // eb.s0.c
        public final String a(Serializable serializable) {
            StringBuilder sb2;
            String str;
            Long l10 = (Long) serializable;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l10.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l10.longValue() < 100000000) {
                return l10 + "n";
            }
            if (l10.longValue() < 100000000000L) {
                sb2 = new StringBuilder();
                sb2.append(timeUnit.toMicros(l10.longValue()));
                str = "u";
            } else if (l10.longValue() < 100000000000000L) {
                sb2 = new StringBuilder();
                sb2.append(timeUnit.toMillis(l10.longValue()));
                str = "m";
            } else if (l10.longValue() < 100000000000000000L) {
                sb2 = new StringBuilder();
                sb2.append(timeUnit.toSeconds(l10.longValue()));
                str = "S";
            } else if (l10.longValue() < 6000000000000000000L) {
                sb2 = new StringBuilder();
                sb2.append(timeUnit.toMinutes(l10.longValue()));
                str = "M";
            } else {
                sb2 = new StringBuilder();
                sb2.append(timeUnit.toHours(l10.longValue()));
                str = "H";
            }
            sb2.append(str);
            return sb2.toString();
        }

        @Override // eb.s0.c
        public final Long b(String str) {
            TimeUnit timeUnit;
            x6.b.s("empty timeout", str.length() > 0);
            x6.b.s("bad timeout format", str.length() <= 9);
            long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
            char charAt = str.charAt(str.length() - 1);
            if (charAt == 'H') {
                timeUnit = TimeUnit.HOURS;
            } else if (charAt == 'M') {
                timeUnit = TimeUnit.MINUTES;
            } else if (charAt == 'S') {
                timeUnit = TimeUnit.SECONDS;
            } else if (charAt == 'u') {
                timeUnit = TimeUnit.MICROSECONDS;
            } else {
                if (charAt != 'm') {
                    if (charAt == 'n') {
                        return Long.valueOf(parseLong);
                    }
                    throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
                }
                timeUnit = TimeUnit.MILLISECONDS;
            }
            return Long.valueOf(timeUnit.toNanos(parseLong));
        }
    }

    static {
        Charset.forName("US-ASCII");
        f6830c = new s0.b("grpc-timeout", new h());
        s0.a aVar = eb.s0.f5206d;
        f6831d = new s0.b("grpc-encoding", aVar);
        f6832e = eb.h0.a("grpc-accept-encoding", new f());
        f = new s0.b("content-encoding", aVar);
        f6833g = eb.h0.a("accept-encoding", new f());
        f6834h = new s0.b("content-length", aVar);
        f6835i = new s0.b("content-type", aVar);
        f6836j = new s0.b("te", aVar);
        f6837k = new s0.b("user-agent", aVar);
        n7.o.a(',');
        c.e.f11281c.getClass();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f6838l = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        f6839m = new t2();
        f6840n = new c.b<>("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f6841o = new a();
        f6842p = new b();
        f6843q = new c();
        f6844r = new d();
    }

    public static URI a(String str) {
        x6.b.y(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException(defpackage.g.d("Invalid authority: ", str), e10);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            f6828a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e10);
        }
    }

    public static eb.h[] c(eb.c cVar, eb.s0 s0Var, int i10, boolean z10) {
        List<h.a> list = cVar.f5040g;
        int size = list.size() + 1;
        eb.h[] hVarArr = new eb.h[size];
        eb.c cVar2 = eb.c.f5034k;
        h.b bVar = new h.b(cVar, i10, z10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            hVarArr[i11] = list.get(i11).a(bVar, s0Var);
        }
        hVarArr[size - 1] = f6841o;
        return hVarArr;
    }

    public static s7.g d(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new s7.g(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool);
    }

    public static u e(k0.f fVar, boolean z10) {
        k0.i iVar = fVar.f5161a;
        h2 a10 = iVar != null ? ((q3) iVar.e()).a() : null;
        if (a10 != null) {
            h.a aVar = fVar.f5162b;
            return aVar == null ? a10 : new e(aVar, a10);
        }
        if (!fVar.f5163c.e()) {
            if (fVar.f5164d) {
                return new m0(g(fVar.f5163c), t.a.DROPPED);
            }
            if (!z10) {
                return new m0(g(fVar.f5163c), t.a.PROCESSED);
            }
        }
        return null;
    }

    public static eb.e1 f(int i10) {
        e1.a aVar;
        if ((i10 < 100 || i10 >= 200) && i10 != 400) {
            if (i10 == 401) {
                aVar = e1.a.UNAUTHENTICATED;
            } else if (i10 == 403) {
                aVar = e1.a.PERMISSION_DENIED;
            } else if (i10 != 404) {
                if (i10 != 429) {
                    if (i10 != 431) {
                        switch (i10) {
                            case 502:
                            case 503:
                            case 504:
                                break;
                            default:
                                aVar = e1.a.UNKNOWN;
                                break;
                        }
                    }
                }
                aVar = e1.a.UNAVAILABLE;
            } else {
                aVar = e1.a.UNIMPLEMENTED;
            }
            return aVar.f().g("HTTP status code " + i10);
        }
        aVar = e1.a.INTERNAL;
        return aVar.f().g("HTTP status code " + i10);
    }

    public static eb.e1 g(eb.e1 e1Var) {
        x6.b.t(e1Var != null);
        if (!f6829b.contains(e1Var.f5081a)) {
            return e1Var;
        }
        eb.e1 e1Var2 = eb.e1.f5077m;
        StringBuilder l10 = defpackage.f.l("Inappropriate status code from control plane: ");
        l10.append(e1Var.f5081a);
        l10.append(" ");
        l10.append(e1Var.f5082b);
        return e1Var2.g(l10.toString()).f(e1Var.f5083c);
    }
}
