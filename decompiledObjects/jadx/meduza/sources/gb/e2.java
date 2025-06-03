package gb;

import eb.w0;
import hb.e;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class e2 extends eb.o0<e2> {
    public static final Method F;

    /* renamed from: a, reason: collision with root package name */
    public j3 f6303a;

    /* renamed from: b, reason: collision with root package name */
    public j3 f6304b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6305c;

    /* renamed from: d, reason: collision with root package name */
    public eb.w0 f6306d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f6307e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final eb.b f6308g;

    /* renamed from: h, reason: collision with root package name */
    public String f6309h;

    /* renamed from: i, reason: collision with root package name */
    public eb.s f6310i;

    /* renamed from: j, reason: collision with root package name */
    public eb.m f6311j;

    /* renamed from: k, reason: collision with root package name */
    public long f6312k;

    /* renamed from: l, reason: collision with root package name */
    public int f6313l;

    /* renamed from: m, reason: collision with root package name */
    public int f6314m;

    /* renamed from: n, reason: collision with root package name */
    public long f6315n;

    /* renamed from: o, reason: collision with root package name */
    public long f6316o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6317p;

    /* renamed from: q, reason: collision with root package name */
    public eb.c0 f6318q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6319r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6320s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6321u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6322v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6323w;

    /* renamed from: x, reason: collision with root package name */
    public final b f6324x;

    /* renamed from: y, reason: collision with root package name */
    public final a f6325y;

    /* renamed from: z, reason: collision with root package name */
    public static final Logger f6302z = Logger.getLogger(e2.class.getName());
    public static final long A = TimeUnit.MINUTES.toMillis(30);
    public static final long B = TimeUnit.SECONDS.toMillis(1);
    public static final j3 C = new j3(v0.f6842p);
    public static final eb.s D = eb.s.f5200d;
    public static final eb.m E = eb.m.f5172b;

    public interface a {
        int a();
    }

    public interface b {
        e.d a();
    }

    static {
        Method method;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class<?> cls2 = Boolean.TYPE;
            method = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            f6302z.log(Level.FINE, "Unable to apply census stats", e10);
            method = null;
        }
        F = method;
    }

    public e2(String str, e.c cVar, e.b bVar) {
        eb.w0 w0Var;
        j3 j3Var = C;
        this.f6303a = j3Var;
        this.f6304b = j3Var;
        this.f6305c = new ArrayList();
        Logger logger = eb.w0.f5249d;
        synchronized (eb.w0.class) {
            if (eb.w0.f5250e == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    boolean z10 = j0.f6531a;
                    arrayList.add(j0.class);
                } catch (ClassNotFoundException e10) {
                    eb.w0.f5249d.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e10);
                }
                List<eb.v0> a10 = eb.d1.a(eb.v0.class, Collections.unmodifiableList(arrayList), eb.v0.class.getClassLoader(), new w0.a());
                if (a10.isEmpty()) {
                    eb.w0.f5249d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                eb.w0.f5250e = new eb.w0();
                for (eb.v0 v0Var : a10) {
                    eb.w0.f5249d.fine("Service loader found " + v0Var);
                    eb.w0 w0Var2 = eb.w0.f5250e;
                    synchronized (w0Var2) {
                        x6.b.s("isAvailable() returned false", v0Var.d());
                        w0Var2.f5252b.add(v0Var);
                    }
                }
                eb.w0.f5250e.a();
            }
            w0Var = eb.w0.f5250e;
        }
        this.f6306d = w0Var;
        this.f6307e = new ArrayList();
        this.f6309h = "pick_first";
        this.f6310i = D;
        this.f6311j = E;
        this.f6312k = A;
        this.f6313l = 5;
        this.f6314m = 5;
        this.f6315n = 16777216L;
        this.f6316o = 1048576L;
        this.f6317p = true;
        this.f6318q = eb.c0.f5055e;
        this.f6319r = true;
        this.f6320s = true;
        this.t = true;
        this.f6321u = true;
        this.f6322v = true;
        this.f6323w = true;
        x6.b.y(str, "target");
        this.f = str;
        this.f6308g = null;
        this.f6324x = cVar;
        this.f6325y = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    @Override // eb.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final eb.n0 a() {
        /*
            r13 = this;
            gb.f2 r0 = new gb.f2
            gb.r1 r8 = new gb.r1
            gb.e2$b r1 = r13.f6324x
            hb.e$d r3 = r1.a()
            gb.k0$a r4 = new gb.k0$a
            r4.<init>()
            gb.v0$b r1 = gb.v0.f6842p
            gb.j3 r5 = new gb.j3
            r5.<init>(r1)
            gb.v0$d r6 = gb.v0.f6844r
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.ArrayList r1 = r13.f6305c
            r7.<init>(r1)
            java.lang.Class<eb.y> r1 = eb.y.class
            monitor-enter(r1)
            monitor-exit(r1)
            boolean r1 = r13.f6320s
            r2 = 0
            r9 = 0
            if (r1 == 0) goto L68
            java.lang.reflect.Method r1 = gb.e2.F
            if (r1 == 0) goto L62
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58
            boolean r11 = r13.t     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58
            r10[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58
            r11 = 1
            boolean r12 = r13.f6321u     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58
            r10[r11] = r12     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58
            r11 = 2
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58
            r10[r11] = r12     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58
            r11 = 3
            boolean r12 = r13.f6322v     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58
            r10[r11] = r12     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58
            java.lang.Object r1 = r1.invoke(r2, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58
            eb.f r1 = (eb.f) r1     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58
            goto L63
        L56:
            r1 = move-exception
            goto L59
        L58:
            r1 = move-exception
        L59:
            java.util.logging.Logger r10 = gb.e2.f6302z
            java.util.logging.Level r11 = java.util.logging.Level.FINE
            java.lang.String r12 = "Unable to apply census stats"
            r10.log(r11, r12, r1)
        L62:
            r1 = r2
        L63:
            if (r1 == 0) goto L68
            r7.add(r9, r1)
        L68:
            boolean r1 = r13.f6323w
            if (r1 == 0) goto L99
            java.lang.String r1 = "io.grpc.census.InternalCensusTracingAccessor"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L84 java.lang.IllegalAccessException -> L86 java.lang.NoSuchMethodException -> L88 java.lang.ClassNotFoundException -> L8a
            java.lang.String r10 = "getClientInterceptor"
            java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch: java.lang.reflect.InvocationTargetException -> L84 java.lang.IllegalAccessException -> L86 java.lang.NoSuchMethodException -> L88 java.lang.ClassNotFoundException -> L8a
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r10, r11)     // Catch: java.lang.reflect.InvocationTargetException -> L84 java.lang.IllegalAccessException -> L86 java.lang.NoSuchMethodException -> L88 java.lang.ClassNotFoundException -> L8a
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch: java.lang.reflect.InvocationTargetException -> L84 java.lang.IllegalAccessException -> L86 java.lang.NoSuchMethodException -> L88 java.lang.ClassNotFoundException -> L8a
            java.lang.Object r1 = r1.invoke(r2, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L84 java.lang.IllegalAccessException -> L86 java.lang.NoSuchMethodException -> L88 java.lang.ClassNotFoundException -> L8a
            eb.f r1 = (eb.f) r1     // Catch: java.lang.reflect.InvocationTargetException -> L84 java.lang.IllegalAccessException -> L86 java.lang.NoSuchMethodException -> L88 java.lang.ClassNotFoundException -> L8a
            r2 = r1
            goto L94
        L84:
            r1 = move-exception
            goto L8b
        L86:
            r1 = move-exception
            goto L8b
        L88:
            r1 = move-exception
            goto L8b
        L8a:
            r1 = move-exception
        L8b:
            java.util.logging.Logger r10 = gb.e2.f6302z
            java.util.logging.Level r11 = java.util.logging.Level.FINE
            java.lang.String r12 = "Unable to apply census stats"
            r10.log(r11, r12, r1)
        L94:
            if (r2 == 0) goto L99
            r7.add(r9, r2)
        L99:
            r1 = r8
            r2 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.e2.a():eb.n0");
    }
}
