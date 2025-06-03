package gb;

import eb.u0;
import gb.h3;
import gb.l1;
import gb.v0;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class i0 extends eb.u0 {

    /* renamed from: s, reason: collision with root package name */
    public static final Logger f6472s;
    public static final Set<String> t;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f6473u;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f6474v;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f6475w;

    /* renamed from: x, reason: collision with root package name */
    public static final e f6476x;

    /* renamed from: y, reason: collision with root package name */
    public static String f6477y;

    /* renamed from: a, reason: collision with root package name */
    public final eb.z0 f6478a;

    /* renamed from: b, reason: collision with root package name */
    public final Random f6479b = new Random();

    /* renamed from: c, reason: collision with root package name */
    public volatile b f6480c = b.f6498a;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<d> f6481d = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    public final String f6482e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6483g;

    /* renamed from: h, reason: collision with root package name */
    public final h3.c<Executor> f6484h;

    /* renamed from: i, reason: collision with root package name */
    public final long f6485i;

    /* renamed from: j, reason: collision with root package name */
    public final eb.h1 f6486j;

    /* renamed from: k, reason: collision with root package name */
    public final n7.p f6487k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6488l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6489m;

    /* renamed from: n, reason: collision with root package name */
    public Executor f6490n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6491o;

    /* renamed from: p, reason: collision with root package name */
    public final u0.f f6492p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6493q;

    /* renamed from: r, reason: collision with root package name */
    public u0.d f6494r;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public eb.e1 f6495a;

        /* renamed from: b, reason: collision with root package name */
        public List<eb.u> f6496b;

        /* renamed from: c, reason: collision with root package name */
        public u0.b f6497c;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6498a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f6499b;

        static {
            b bVar = new b();
            f6498a = bVar;
            f6499b = new b[]{bVar};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f6499b.clone();
        }
    }

    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final u0.d f6500a;

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f6502a;

            public a(boolean z10) {
                this.f6502a = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (this.f6502a) {
                    i0 i0Var = i0.this;
                    i0Var.f6488l = true;
                    if (i0Var.f6485i > 0) {
                        n7.p pVar = i0Var.f6487k;
                        pVar.f11309b = false;
                        pVar.b();
                    }
                }
                i0.this.f6493q = false;
            }
        }

        public c(u0.d dVar) {
            x6.b.y(dVar, "savedListener");
            this.f6500a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar;
            Throwable th;
            a aVar2;
            IOException e10;
            boolean z10;
            eb.h1 h1Var;
            a aVar3;
            List<eb.u> list;
            Logger logger = i0.f6472s;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                StringBuilder l10 = defpackage.f.l("Attempting DNS resolution of ");
                l10.append(i0.this.f);
                logger.finer(l10.toString());
            }
            a aVar4 = null;
            u0.b bVar = null;
            try {
                try {
                    i0 i0Var = i0.this;
                    eb.y0 a10 = i0Var.f6478a.a(InetSocketAddress.createUnresolved(i0Var.f, i0Var.f6483g));
                    eb.u uVar = a10 != null ? new eb.u(a10) : null;
                    List<eb.u> emptyList = Collections.emptyList();
                    eb.a aVar5 = eb.a.f5012b;
                    if (uVar != null) {
                        if (logger.isLoggable(level)) {
                            logger.finer("Using proxy address " + uVar);
                        }
                        list = Collections.singletonList(uVar);
                        aVar = null;
                    } else {
                        aVar2 = i0.this.e();
                        try {
                            eb.e1 e1Var = aVar2.f6495a;
                            if (e1Var != null) {
                                this.f6500a.a(e1Var);
                                i0.this.f6486j.execute(new a(aVar2.f6495a == null));
                                return;
                            }
                            List<eb.u> list2 = aVar2.f6496b;
                            if (list2 != null) {
                                emptyList = list2;
                            }
                            u0.b bVar2 = aVar2.f6497c;
                            bVar = bVar2 != null ? bVar2 : null;
                            aVar = aVar2;
                            list = emptyList;
                        } catch (IOException e11) {
                            e10 = e11;
                            aVar4 = aVar2;
                            this.f6500a.a(eb.e1.f5078n.g("Unable to resolve host " + i0.this.f).f(e10));
                            z10 = aVar4 == null && aVar4.f6495a == null;
                            h1Var = i0.this.f6486j;
                            aVar3 = new a(z10);
                            h1Var.execute(aVar3);
                        } catch (Throwable th2) {
                            th = th2;
                            i0.this.f6486j.execute(new a(aVar2 == null && aVar2.f6495a == null));
                            throw th;
                        }
                    }
                    try {
                        this.f6500a.b(new u0.e(list, aVar5, bVar));
                        z10 = aVar != null && aVar.f6495a == null;
                        h1Var = i0.this.f6486j;
                        aVar3 = new a(z10);
                    } catch (IOException e12) {
                        e = e12;
                        aVar4 = aVar;
                        e10 = e;
                        this.f6500a.a(eb.e1.f5078n.g("Unable to resolve host " + i0.this.f).f(e10));
                        if (aVar4 == null) {
                        }
                        h1Var = i0.this.f6486j;
                        aVar3 = new a(z10);
                        h1Var.execute(aVar3);
                    } catch (Throwable th3) {
                        th = th3;
                        a aVar6 = aVar;
                        th = th;
                        aVar2 = aVar6;
                        i0.this.f6486j.execute(new a(aVar2 == null && aVar2.f6495a == null));
                        throw th;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
                h1Var.execute(aVar3);
            } catch (Throwable th4) {
                th = th4;
                aVar = null;
            }
        }
    }

    public interface d {
        List<String> a(String str);
    }

    public interface e {
        l1.b a();

        Throwable b();
    }

    static {
        Level level;
        String str;
        e eVar;
        Logger logger = Logger.getLogger(i0.class.getName());
        f6472s = logger;
        t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f6473u = Boolean.parseBoolean(property);
        f6474v = Boolean.parseBoolean(property2);
        f6475w = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    eVar = (e) Class.forName("gb.l1", true, i0.class.getClassLoader()).asSubclass(e.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    e = e10;
                    logger = f6472s;
                    level = Level.FINE;
                    str = "Can't construct JndiResourceResolverFactory, skipping.";
                }
            } catch (Exception e11) {
                e = e11;
                logger = f6472s;
                level = Level.FINE;
                str = "Can't find JndiResourceResolverFactory ctor, skipping.";
            }
        } catch (ClassCastException e12) {
            e = e12;
            logger = f6472s;
            level = Level.FINE;
            str = "Unable to cast JndiResourceResolverFactory, skipping.";
        } catch (ClassNotFoundException e13) {
            e = e13;
            logger = f6472s;
            level = Level.FINE;
            str = "Unable to find JndiResourceResolverFactory, skipping.";
        }
        if (eVar.b() != null) {
            level = Level.FINE;
            e = eVar.b();
            str = "JndiResourceResolverFactory not available, skipping.";
            logger.log(level, str, e);
            eVar = null;
        }
        f6476x = eVar;
    }

    public i0(String str, u0.a aVar, v0.b bVar, n7.p pVar, boolean z10) {
        x6.b.y(aVar, "args");
        this.f6484h = bVar;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("//");
        x6.b.y(str, "name");
        sb2.append(str);
        URI create = URI.create(sb2.toString());
        x6.b.n(str, "Invalid DNS name: %s", create.getHost() != null);
        String authority = create.getAuthority();
        x6.b.z("nameUri (%s) doesn't have an authority", authority, create);
        this.f6482e = authority;
        this.f = create.getHost();
        this.f6483g = create.getPort() == -1 ? aVar.f5237a : create.getPort();
        eb.z0 z0Var = aVar.f5238b;
        x6.b.y(z0Var, "proxyDetector");
        this.f6478a = z0Var;
        long j10 = 0;
        if (!z10) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j11 = 30;
            if (property != null) {
                try {
                    j11 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f6472s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            j10 = j11 > 0 ? TimeUnit.SECONDS.toNanos(j11) : j11;
        }
        this.f6485i = j10;
        this.f6487k = pVar;
        eb.h1 h1Var = aVar.f5239c;
        x6.b.y(h1Var, "syncContext");
        this.f6486j = h1Var;
        Executor executor = aVar.f5242g;
        this.f6490n = executor;
        this.f6491o = executor == null;
        u0.f fVar = aVar.f5240d;
        x6.b.y(fVar, "serviceConfigParser");
        this.f6492p = fVar;
    }

    public static Map<String, ?> f(Map<String, ?> map, Random random, String str) {
        boolean z10;
        boolean z11;
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            b.z.r(entry, "Bad key: %s", t.contains(entry.getKey()));
        }
        List d10 = n1.d("clientLanguage", map);
        if (d10 != null && !d10.isEmpty()) {
            Iterator it = d10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                if ("java".equalsIgnoreCase((String) it.next())) {
                    z11 = true;
                    break;
                }
            }
            if (!z11) {
                return null;
            }
        }
        Double e10 = n1.e("percentage", map);
        if (e10 != null) {
            int intValue = e10.intValue();
            b.z.r(e10, "Bad percentage: %s", intValue >= 0 && intValue <= 100);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List d11 = n1.d("clientHostname", map);
        if (d11 != null && !d11.isEmpty()) {
            Iterator it2 = d11.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z10 = false;
                    break;
                }
                if (((String) it2.next()).equals(str)) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                return null;
            }
        }
        Map<String, ?> g10 = n1.g("serviceConfig", map);
        if (g10 != null) {
            return g10;
        }
        throw new n7.w(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static ArrayList g(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                String substring = str.substring(12);
                Logger logger = m1.f6601a;
                la.a aVar = new la.a(new StringReader(substring));
                try {
                    Object a10 = m1.a(aVar);
                    if (!(a10 instanceof List)) {
                        throw new ClassCastException("wrong type " + a10);
                    }
                    List list2 = (List) a10;
                    n1.a(list2);
                    arrayList.addAll(list2);
                } finally {
                    try {
                        aVar.close();
                    } catch (IOException e10) {
                        m1.f6601a.log(Level.WARNING, "Failed to close", (Throwable) e10);
                    }
                }
            } else {
                f6472s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @Override // eb.u0
    public final String a() {
        return this.f6482e;
    }

    @Override // eb.u0
    public final void b() {
        x6.b.I(this.f6494r != null, "not started");
        h();
    }

    @Override // eb.u0
    public final void c() {
        if (this.f6489m) {
            return;
        }
        this.f6489m = true;
        Executor executor = this.f6490n;
        if (executor == null || !this.f6491o) {
            return;
        }
        h3.b(this.f6484h, executor);
        this.f6490n = null;
    }

    @Override // eb.u0
    public final void d(u0.d dVar) {
        x6.b.I(this.f6494r == null, "already started");
        if (this.f6491o) {
            this.f6490n = (Executor) h3.a(this.f6484h);
        }
        this.f6494r = dVar;
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final gb.i0.a e() {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.i0.e():gb.i0$a");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r6 = this;
            boolean r0 = r6.f6493q
            if (r0 != 0) goto L3a
            boolean r0 = r6.f6489m
            if (r0 != 0) goto L3a
            boolean r0 = r6.f6488l
            r1 = 1
            if (r0 == 0) goto L28
            long r2 = r6.f6485i
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L28
            if (r0 <= 0) goto L26
            n7.p r0 = r6.f6487k
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r2 = r0.a(r2)
            long r4 = r6.f6485i
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L26
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = r1
        L29:
            if (r0 != 0) goto L2c
            goto L3a
        L2c:
            r6.f6493q = r1
            java.util.concurrent.Executor r0 = r6.f6490n
            gb.i0$c r1 = new gb.i0$c
            eb.u0$d r2 = r6.f6494r
            r1.<init>(r2)
            r0.execute(r1)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.i0.h():void");
    }

    public final List<eb.u> i() {
        try {
            try {
                b bVar = this.f6480c;
                String str = this.f;
                bVar.getClass();
                List unmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(unmodifiableList.size());
                Iterator it = unmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new eb.u(new InetSocketAddress((InetAddress) it.next(), this.f6483g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e10) {
                Object obj = n7.u.f11319a;
                if (e10 instanceof RuntimeException) {
                    throw ((RuntimeException) e10);
                }
                if (e10 instanceof Error) {
                    throw ((Error) e10);
                }
                throw new RuntimeException(e10);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                f6472s.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th;
        }
    }
}
