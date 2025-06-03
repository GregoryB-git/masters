package hb;

import eb.a;
import eb.a0;
import eb.a1;
import eb.c0;
import eb.e1;
import eb.f0;
import eb.f1;
import eb.s0;
import eb.t0;
import gb.b1;
import gb.c1;
import gb.f3;
import gb.h2;
import gb.l3;
import gb.o1;
import gb.r3;
import gb.t;
import gb.u;
import gb.u0;
import gb.v0;
import gb.x;
import gb.z0;
import hb.a;
import hb.a.d;
import hb.b;
import hb.e;
import hb.h;
import hb.p;
import hb.p.b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import jb.b;
import jb.f;
import n7.g;
import p2.m0;
import xc.r;
import xc.s;
import xc.y;
import xc.z;

/* loaded from: classes.dex */
public final class i implements x, b.a, p.c {
    public static final Map<jb.a, e1> S;
    public static final Logger T;
    public final SocketFactory A;
    public SSLSocketFactory B;
    public HostnameVerifier C;
    public int D;
    public final LinkedList E;
    public final ib.b F;
    public o1 G;
    public boolean H;
    public long I;
    public long J;
    public boolean K;
    public final Runnable L;
    public final int M;
    public final boolean N;
    public final r3 O;
    public final a P;
    public final a0 Q;
    public int R;

    /* renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f7278a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7279b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7280c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f7281d;

    /* renamed from: e, reason: collision with root package name */
    public final n7.q<n7.p> f7282e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final jb.h f7283g;

    /* renamed from: h, reason: collision with root package name */
    public h2.a f7284h;

    /* renamed from: i, reason: collision with root package name */
    public hb.b f7285i;

    /* renamed from: j, reason: collision with root package name */
    public p f7286j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f7287k;

    /* renamed from: l, reason: collision with root package name */
    public final f0 f7288l;

    /* renamed from: m, reason: collision with root package name */
    public int f7289m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f7290n;

    /* renamed from: o, reason: collision with root package name */
    public final Executor f7291o;

    /* renamed from: p, reason: collision with root package name */
    public final f3 f7292p;

    /* renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f7293q;

    /* renamed from: r, reason: collision with root package name */
    public final int f7294r;

    /* renamed from: s, reason: collision with root package name */
    public int f7295s;
    public d t;

    /* renamed from: u, reason: collision with root package name */
    public eb.a f7296u;

    /* renamed from: v, reason: collision with root package name */
    public e1 f7297v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7298w;

    /* renamed from: x, reason: collision with root package name */
    public b1 f7299x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7300y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7301z;

    public class a extends c1<h> {
        public a() {
        }

        @Override // gb.c1
        public final void a() {
            i.this.f7284h.e(true);
        }

        @Override // gb.c1
        public final void b() {
            i.this.f7284h.e(false);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f7303a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ hb.a f7304b;

        public class a implements y {
            @Override // xc.y
            public final z c() {
                return z.f17297d;
            }

            @Override // xc.y, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // xc.y
            public final long e0(xc.f fVar, long j10) {
                return -1L;
            }
        }

        public b(CountDownLatch countDownLatch, hb.a aVar) {
            this.f7303a = countDownLatch;
            this.f7304b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i iVar;
            d dVar;
            Socket j10;
            try {
                this.f7303a.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            s sVar = new s(new a());
            SSLSession sSLSession = null;
            try {
                try {
                    i iVar2 = i.this;
                    a0 a0Var = iVar2.Q;
                    if (a0Var == null) {
                        j10 = iVar2.A.createSocket(iVar2.f7278a.getAddress(), i.this.f7278a.getPort());
                    } else {
                        SocketAddress socketAddress = a0Var.f5018a;
                        if (!(socketAddress instanceof InetSocketAddress)) {
                            throw new f1(e1.f5077m.g("Unsupported SocketAddress implementation " + i.this.Q.f5018a.getClass()));
                        }
                        j10 = i.j(iVar2, a0Var.f5019b, (InetSocketAddress) socketAddress, a0Var.f5020c, a0Var.f5021d);
                    }
                    Socket socket = j10;
                    i iVar3 = i.this;
                    SSLSocketFactory sSLSocketFactory = iVar3.B;
                    Socket socket2 = socket;
                    if (sSLSocketFactory != null) {
                        SSLSocket a10 = n.a(sSLSocketFactory, iVar3.C, socket, iVar3.m(), i.this.n(), i.this.F);
                        sSLSession = a10.getSession();
                        socket2 = a10;
                    }
                    socket2.setTcpNoDelay(true);
                    s sVar2 = new s(m0.b0(socket2));
                    try {
                        this.f7304b.f(m0.a0(socket2), socket2);
                        i iVar4 = i.this;
                        eb.a aVar = iVar4.f7296u;
                        aVar.getClass();
                        a.C0073a c0073a = new a.C0073a(aVar);
                        c0073a.c(eb.z.f5259a, socket2.getRemoteSocketAddress());
                        c0073a.c(eb.z.f5260b, socket2.getLocalSocketAddress());
                        c0073a.c(eb.z.f5261c, sSLSession);
                        c0073a.c(u0.f6819a, sSLSession == null ? a1.NONE : a1.PRIVACY_AND_INTEGRITY);
                        iVar4.f7296u = c0073a.a();
                        i iVar5 = i.this;
                        iVar5.t = iVar5.new d(iVar5.f7283g.b(sVar2));
                        synchronized (i.this.f7287k) {
                            i.this.getClass();
                            if (sSLSession != null) {
                                i iVar6 = i.this;
                                new c0.a(sSLSession);
                                iVar6.getClass();
                            }
                        }
                    } catch (f1 e10) {
                        e = e10;
                        sVar = sVar2;
                        i.this.t(0, jb.a.INTERNAL_ERROR, e.f5105a);
                        iVar = i.this;
                        dVar = iVar.new d(iVar.f7283g.b(sVar));
                        iVar.t = dVar;
                    } catch (Exception e11) {
                        e = e11;
                        sVar = sVar2;
                        i.this.a(e);
                        iVar = i.this;
                        dVar = iVar.new d(iVar.f7283g.b(sVar));
                        iVar.t = dVar;
                    } catch (Throwable th) {
                        th = th;
                        sVar = sVar2;
                        i iVar7 = i.this;
                        iVar7.t = iVar7.new d(iVar7.f7283g.b(sVar));
                        throw th;
                    }
                } catch (f1 e12) {
                    e = e12;
                } catch (Exception e13) {
                    e = e13;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.getClass();
            i iVar = i.this;
            iVar.f7291o.execute(iVar.t);
            synchronized (i.this.f7287k) {
                i iVar2 = i.this;
                iVar2.D = Integer.MAX_VALUE;
                iVar2.u();
            }
            i.this.getClass();
        }
    }

    public class d implements b.a, Runnable {

        /* renamed from: b, reason: collision with root package name */
        public jb.b f7308b;

        /* renamed from: a, reason: collision with root package name */
        public final j f7307a = new j(Level.FINE);

        /* renamed from: c, reason: collision with root package name */
        public boolean f7309c = true;

        public d(jb.b bVar) {
            this.f7308b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e1 e1Var;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (((f.c) this.f7308b).f(this)) {
                try {
                    o1 o1Var = i.this.G;
                    if (o1Var != null) {
                        o1Var.a();
                    }
                } catch (Throwable th) {
                    try {
                        i iVar = i.this;
                        jb.a aVar = jb.a.PROTOCOL_ERROR;
                        e1 f = e1.f5077m.g("error in frame handler").f(th);
                        Map<jb.a, e1> map = i.S;
                        iVar.t(0, aVar, f);
                        try {
                            ((f.c) this.f7308b).close();
                        } catch (IOException e10) {
                            e = e10;
                            i.T.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                        } catch (RuntimeException e11) {
                            if (!"bio == null".equals(e11.getMessage())) {
                                throw e11;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            ((f.c) this.f7308b).close();
                        } catch (IOException e12) {
                            i.T.log(Level.INFO, "Exception closing frame reader", (Throwable) e12);
                        } catch (RuntimeException e13) {
                            if (!"bio == null".equals(e13.getMessage())) {
                                throw e13;
                            }
                        }
                        i.this.f7284h.d();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            }
            synchronized (i.this.f7287k) {
                e1Var = i.this.f7297v;
            }
            if (e1Var == null) {
                e1Var = e1.f5078n.g("End of stream or IOException");
            }
            i.this.t(0, jb.a.INTERNAL_ERROR, e1Var);
            try {
                ((f.c) this.f7308b).close();
            } catch (IOException e14) {
                e = e14;
                i.T.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
            } catch (RuntimeException e15) {
                if (!"bio == null".equals(e15.getMessage())) {
                    throw e15;
                }
            }
            i.this.f7284h.d();
            Thread.currentThread().setName(name);
        }
    }

    static {
        EnumMap enumMap = new EnumMap(jb.a.class);
        jb.a aVar = jb.a.NO_ERROR;
        e1 e1Var = e1.f5077m;
        enumMap.put((EnumMap) aVar, (jb.a) e1Var.g("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) jb.a.PROTOCOL_ERROR, (jb.a) e1Var.g("Protocol error"));
        enumMap.put((EnumMap) jb.a.INTERNAL_ERROR, (jb.a) e1Var.g("Internal error"));
        enumMap.put((EnumMap) jb.a.FLOW_CONTROL_ERROR, (jb.a) e1Var.g("Flow control error"));
        enumMap.put((EnumMap) jb.a.STREAM_CLOSED, (jb.a) e1Var.g("Stream closed"));
        enumMap.put((EnumMap) jb.a.FRAME_TOO_LARGE, (jb.a) e1Var.g("Frame too large"));
        enumMap.put((EnumMap) jb.a.REFUSED_STREAM, (jb.a) e1.f5078n.g("Refused stream"));
        enumMap.put((EnumMap) jb.a.CANCEL, (jb.a) e1.f.g("Cancelled"));
        enumMap.put((EnumMap) jb.a.COMPRESSION_ERROR, (jb.a) e1Var.g("Compression error"));
        enumMap.put((EnumMap) jb.a.CONNECT_ERROR, (jb.a) e1Var.g("Connect error"));
        enumMap.put((EnumMap) jb.a.ENHANCE_YOUR_CALM, (jb.a) e1.f5075k.g("Enhance your calm"));
        enumMap.put((EnumMap) jb.a.INADEQUATE_SECURITY, (jb.a) e1.f5073i.g("Inadequate security"));
        S = Collections.unmodifiableMap(enumMap);
        T = Logger.getLogger(i.class.getName());
    }

    public i() {
        throw null;
    }

    public i(e.d dVar, InetSocketAddress inetSocketAddress, String str, String str2, eb.a aVar, a0 a0Var, f fVar) {
        v0.d dVar2 = v0.f6844r;
        jb.f fVar2 = new jb.f();
        this.f7281d = new Random();
        Object obj = new Object();
        this.f7287k = obj;
        this.f7290n = new HashMap();
        this.D = 0;
        this.E = new LinkedList();
        this.P = new a();
        this.R = 30000;
        x6.b.y(inetSocketAddress, "address");
        this.f7278a = inetSocketAddress;
        this.f7279b = str;
        this.f7294r = dVar.f7255r;
        this.f = dVar.f7258v;
        Executor executor = dVar.f7248b;
        x6.b.y(executor, "executor");
        this.f7291o = executor;
        this.f7292p = new f3(dVar.f7248b);
        ScheduledExecutorService scheduledExecutorService = dVar.f7250d;
        x6.b.y(scheduledExecutorService, "scheduledExecutorService");
        this.f7293q = scheduledExecutorService;
        this.f7289m = 3;
        SocketFactory socketFactory = dVar.f;
        this.A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.B = dVar.f7252o;
        this.C = dVar.f7253p;
        ib.b bVar = dVar.f7254q;
        x6.b.y(bVar, "connectionSpec");
        this.F = bVar;
        x6.b.y(dVar2, "stopwatchFactory");
        this.f7282e = dVar2;
        this.f7283g = fVar2;
        StringBuilder sb2 = new StringBuilder();
        if (str2 != null) {
            sb2.append(str2);
            sb2.append(' ');
        }
        sb2.append("grpc-java-");
        sb2.append("okhttp");
        sb2.append('/');
        sb2.append("1.62.2");
        this.f7280c = sb2.toString();
        this.Q = a0Var;
        this.L = fVar;
        this.M = dVar.f7260x;
        r3.a aVar2 = dVar.f7251e;
        aVar2.getClass();
        this.O = new r3(aVar2.f6802a);
        this.f7288l = f0.a(i.class, inetSocketAddress.toString());
        eb.a aVar3 = eb.a.f5012b;
        a.b<eb.a> bVar2 = u0.f6820b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(bVar2, aVar);
        for (Map.Entry<a.b<?>, Object> entry : aVar3.f5013a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f7296u = new eb.a(identityHashMap);
        this.N = dVar.f7261y;
        synchronized (obj) {
        }
    }

    public static void i(i iVar, String str) {
        jb.a aVar = jb.a.PROTOCOL_ERROR;
        iVar.getClass();
        iVar.t(0, aVar, x(aVar).a(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008d A[Catch: IOException -> 0x0121, TryCatch #3 {IOException -> 0x0121, blocks: (B:8:0x002a, B:10:0x006c, B:12:0x0072, B:16:0x007f, B:18:0x008d, B:23:0x009a, B:24:0x0093, B:26:0x0096, B:27:0x0078, B:28:0x007b, B:30:0x00a3, B:31:0x00b1, B:35:0x00be, B:39:0x00c8, B:42:0x00cc, B:48:0x00f6, B:49:0x0120, B:53:0x00db, B:44:0x00d1), top: B:7:0x002a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096 A[Catch: IOException -> 0x0121, TryCatch #3 {IOException -> 0x0121, blocks: (B:8:0x002a, B:10:0x006c, B:12:0x0072, B:16:0x007f, B:18:0x008d, B:23:0x009a, B:24:0x0093, B:26:0x0096, B:27:0x0078, B:28:0x007b, B:30:0x00a3, B:31:0x00b1, B:35:0x00be, B:39:0x00c8, B:42:0x00cc, B:48:0x00f6, B:49:0x0120, B:53:0x00db, B:44:0x00d1), top: B:7:0x002a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.Socket j(hb.i r9, java.net.InetSocketAddress r10, java.net.InetSocketAddress r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.i.j(hb.i, java.net.InetSocketAddress, java.net.InetSocketAddress, java.lang.String, java.lang.String):java.net.Socket");
    }

    public static String r(xc.e eVar) {
        xc.f fVar = new xc.f();
        while (eVar.e0(fVar, 1L) != -1) {
            if (fVar.I(fVar.f17252b - 1) == 10) {
                return fVar.f0();
            }
        }
        StringBuilder l10 = defpackage.f.l("\\n not found: ");
        l10.append(fVar.c0().l());
        throw new EOFException(l10.toString());
    }

    public static e1 x(jb.a aVar) {
        e1 e1Var = S.get(aVar);
        if (e1Var != null) {
            return e1Var;
        }
        e1 e1Var2 = e1.f5071g;
        StringBuilder l10 = defpackage.f.l("Unknown http2 error code: ");
        l10.append(aVar.f8738a);
        return e1Var2.g(l10.toString());
    }

    @Override // hb.b.a
    public final void a(Exception exc) {
        t(0, jb.a.INTERNAL_ERROR, e1.f5078n.f(exc));
    }

    @Override // hb.p.c
    public final p.b[] b() {
        p.b[] bVarArr;
        p.b bVar;
        synchronized (this.f7287k) {
            bVarArr = new p.b[this.f7290n.size()];
            int i10 = 0;
            Iterator it = this.f7290n.values().iterator();
            while (it.hasNext()) {
                int i11 = i10 + 1;
                h.b bVar2 = ((h) it.next()).f7269l;
                synchronized (bVar2.f7275x) {
                    bVar = bVar2.K;
                }
                bVarArr[i10] = bVar;
                i10 = i11;
            }
        }
        return bVarArr;
    }

    @Override // gb.h2
    public final void c(e1 e1Var) {
        synchronized (this.f7287k) {
            if (this.f7297v != null) {
                return;
            }
            this.f7297v = e1Var;
            this.f7284h.a(e1Var);
            w();
        }
    }

    @Override // gb.u
    public final gb.s d(t0 t0Var, s0 s0Var, eb.c cVar, eb.h[] hVarArr) {
        x6.b.y(t0Var, Constants.METHOD);
        x6.b.y(s0Var, "headers");
        eb.a aVar = this.f7296u;
        l3 l3Var = new l3(hVarArr);
        for (eb.h hVar : hVarArr) {
            hVar.z(aVar, s0Var);
        }
        synchronized (this.f7287k) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                return new h(t0Var, s0Var, this.f7285i, this, this.f7286j, this.f7287k, this.f7294r, this.f, this.f7279b, this.f7280c, l3Var, this.O, cVar, this.N);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // gb.u
    public final void e(o1.c.a aVar) {
        long nextLong;
        s7.c cVar = s7.c.f14261a;
        synchronized (this.f7287k) {
            try {
                boolean z10 = true;
                x6.b.J(this.f7285i != null);
                if (this.f7300y) {
                    f1 o10 = o();
                    Logger logger = b1.f6195g;
                    try {
                        cVar.execute(new gb.a1(aVar, o10));
                    } catch (Throwable th) {
                        b1.f6195g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                    }
                    return;
                }
                b1 b1Var = this.f7299x;
                if (b1Var != null) {
                    nextLong = 0;
                    z10 = false;
                } else {
                    nextLong = this.f7281d.nextLong();
                    n7.p pVar = this.f7282e.get();
                    pVar.b();
                    b1 b1Var2 = new b1(nextLong, pVar);
                    this.f7299x = b1Var2;
                    this.O.getClass();
                    b1Var = b1Var2;
                }
                if (z10) {
                    this.f7285i.e((int) (nextLong >>> 32), (int) nextLong, false);
                }
                synchronized (b1Var) {
                    if (!b1Var.f6199d) {
                        b1Var.f6198c.put(aVar, cVar);
                        return;
                    }
                    Throwable th2 = b1Var.f6200e;
                    Runnable a1Var = th2 != null ? new gb.a1(aVar, th2) : new z0(aVar, b1Var.f);
                    try {
                        cVar.execute(a1Var);
                    } catch (Throwable th3) {
                        b1.f6195g.log(Level.SEVERE, "Failed to execute PingCallback", th3);
                    }
                }
            } finally {
            }
        }
    }

    @Override // eb.e0
    public final f0 f() {
        return this.f7288l;
    }

    @Override // gb.h2
    public final Runnable g(h2.a aVar) {
        this.f7284h = aVar;
        if (this.H) {
            o1 o1Var = new o1(new o1.c(this), this.f7293q, this.I, this.J, this.K);
            this.G = o1Var;
            synchronized (o1Var) {
                if (o1Var.f6609d) {
                    o1Var.b();
                }
            }
        }
        hb.a aVar2 = new hb.a(this.f7292p, this);
        a.d dVar = aVar2.new d(this.f7283g.a(new r(aVar2)));
        synchronized (this.f7287k) {
            hb.b bVar = new hb.b(this, dVar);
            this.f7285i = bVar;
            this.f7286j = new p(this, bVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f7292p.execute(new b(countDownLatch, aVar2));
        try {
            s();
            countDownLatch.countDown();
            this.f7292p.execute(new c());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // gb.x
    public final eb.a getAttributes() {
        return this.f7296u;
    }

    @Override // gb.h2
    public final void h(e1 e1Var) {
        c(e1Var);
        synchronized (this.f7287k) {
            Iterator it = this.f7290n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((h) entry.getValue()).f7269l.i(new s0(), e1Var, false);
                q((h) entry.getValue());
            }
            for (h hVar : this.E) {
                hVar.f7269l.j(e1Var, t.a.MISCARRIED, true, new s0());
                q(hVar);
            }
            this.E.clear();
            w();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x0243, code lost:
    
        if (r6 != 0) goto L161;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kb.b k(java.net.InetSocketAddress r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.i.k(java.net.InetSocketAddress, java.lang.String, java.lang.String):kb.b");
    }

    public final void l(int i10, e1 e1Var, t.a aVar, boolean z10, jb.a aVar2, s0 s0Var) {
        synchronized (this.f7287k) {
            h hVar = (h) this.f7290n.remove(Integer.valueOf(i10));
            if (hVar != null) {
                if (aVar2 != null) {
                    this.f7285i.R(i10, jb.a.CANCEL);
                }
                if (e1Var != null) {
                    h.b bVar = hVar.f7269l;
                    if (s0Var == null) {
                        s0Var = new s0();
                    }
                    bVar.j(e1Var, aVar, z10, s0Var);
                }
                if (!u()) {
                    w();
                    q(hVar);
                }
            }
        }
    }

    public final String m() {
        URI a10 = v0.a(this.f7279b);
        return a10.getHost() != null ? a10.getHost() : this.f7279b;
    }

    public final int n() {
        URI a10 = v0.a(this.f7279b);
        return a10.getPort() != -1 ? a10.getPort() : this.f7278a.getPort();
    }

    public final f1 o() {
        synchronized (this.f7287k) {
            e1 e1Var = this.f7297v;
            if (e1Var != null) {
                return new f1(e1Var);
            }
            return new f1(e1.f5078n.g("Connection closed"));
        }
    }

    public final boolean p(int i10) {
        boolean z10;
        synchronized (this.f7287k) {
            z10 = true;
            if (i10 >= this.f7289m || (i10 & 1) != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public final void q(h hVar) {
        if (this.f7301z && this.E.isEmpty() && this.f7290n.isEmpty()) {
            this.f7301z = false;
            o1 o1Var = this.G;
            if (o1Var != null) {
                synchronized (o1Var) {
                    if (!o1Var.f6609d) {
                        int i10 = o1Var.f6610e;
                        if (i10 == 2 || i10 == 3) {
                            o1Var.f6610e = 1;
                        }
                        if (o1Var.f6610e == 4) {
                            o1Var.f6610e = 5;
                        }
                    }
                }
            }
        }
        if (hVar.f6166c) {
            this.P.c(hVar, false);
        }
    }

    public final void s() {
        synchronized (this.f7287k) {
            this.f7285i.w();
            c4.x xVar = new c4.x();
            xVar.d(7, this.f);
            this.f7285i.a0(xVar);
            if (this.f > 65535) {
                this.f7285i.d(0, r1 - 65535);
            }
        }
    }

    public final void t(int i10, jb.a aVar, e1 e1Var) {
        synchronized (this.f7287k) {
            if (this.f7297v == null) {
                this.f7297v = e1Var;
                this.f7284h.a(e1Var);
            }
            if (aVar != null && !this.f7298w) {
                this.f7298w = true;
                this.f7285i.o0(aVar, new byte[0]);
            }
            Iterator it = this.f7290n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i10) {
                    it.remove();
                    ((h) entry.getValue()).f7269l.j(e1Var, t.a.REFUSED, false, new s0());
                    q((h) entry.getValue());
                }
            }
            for (h hVar : this.E) {
                hVar.f7269l.j(e1Var, t.a.MISCARRIED, true, new s0());
                q(hVar);
            }
            this.E.clear();
            w();
        }
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.b("logId", this.f7288l.f5104c);
        b10.a(this.f7278a, "address");
        return b10.toString();
    }

    public final boolean u() {
        boolean z10 = false;
        while (!this.E.isEmpty() && this.f7290n.size() < this.D) {
            v((h) this.E.poll());
            z10 = true;
        }
        return z10;
    }

    public final void v(h hVar) {
        boolean z10 = true;
        x6.b.I(hVar.f7269l.L == -1, "StreamId already assigned");
        this.f7290n.put(Integer.valueOf(this.f7289m), hVar);
        if (!this.f7301z) {
            this.f7301z = true;
            o1 o1Var = this.G;
            if (o1Var != null) {
                o1Var.b();
            }
        }
        if (hVar.f6166c) {
            this.P.c(hVar, true);
        }
        h.b bVar = hVar.f7269l;
        int i10 = this.f7289m;
        if (!(bVar.L == -1)) {
            throw new IllegalStateException(m0.X("the stream has been started with id %s", Integer.valueOf(i10)));
        }
        bVar.L = i10;
        p pVar = bVar.G;
        bVar.K = pVar.new b(i10, pVar.f7338c, bVar);
        h.b bVar2 = h.this.f7269l;
        x6.b.J(bVar2.f6176j != null);
        synchronized (bVar2.f6217b) {
            x6.b.I(!bVar2.f, "Already allocated");
            bVar2.f = true;
        }
        synchronized (bVar2.f6217b) {
            synchronized (bVar2.f6217b) {
                if (!bVar2.f || bVar2.f6220e >= 32768 || bVar2.f6221g) {
                    z10 = false;
                }
            }
        }
        if (z10) {
            bVar2.f6176j.c();
        }
        r3 r3Var = bVar2.f6218c;
        r3Var.getClass();
        r3Var.f6800a.a();
        if (bVar.I) {
            bVar.F.A(h.this.f7272o, bVar.L, bVar.f7276y);
            for (m.e eVar : h.this.f7267j.f6593a) {
                ((eb.h) eVar).y();
            }
            bVar.f7276y = null;
            xc.f fVar = bVar.f7277z;
            if (fVar.f17252b > 0) {
                bVar.G.a(bVar.A, bVar.K, fVar, bVar.B);
            }
            bVar.I = false;
        }
        t0.c cVar = hVar.f7265h.f5216a;
        if ((cVar != t0.c.UNARY && cVar != t0.c.SERVER_STREAMING) || hVar.f7272o) {
            this.f7285i.flush();
        }
        int i11 = this.f7289m;
        if (i11 < 2147483645) {
            this.f7289m = i11 + 2;
        } else {
            this.f7289m = Integer.MAX_VALUE;
            t(Integer.MAX_VALUE, jb.a.NO_ERROR, e1.f5078n.g("Stream ids exhausted"));
        }
    }

    public final void w() {
        if (this.f7297v == null || !this.f7290n.isEmpty() || !this.E.isEmpty() || this.f7300y) {
            return;
        }
        this.f7300y = true;
        o1 o1Var = this.G;
        if (o1Var != null) {
            synchronized (o1Var) {
                if (o1Var.f6610e != 6) {
                    o1Var.f6610e = 6;
                    ScheduledFuture<?> scheduledFuture = o1Var.f;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    ScheduledFuture<?> scheduledFuture2 = o1Var.f6611g;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(false);
                        o1Var.f6611g = null;
                    }
                }
            }
        }
        b1 b1Var = this.f7299x;
        if (b1Var != null) {
            f1 o10 = o();
            synchronized (b1Var) {
                if (!b1Var.f6199d) {
                    b1Var.f6199d = true;
                    b1Var.f6200e = o10;
                    LinkedHashMap linkedHashMap = b1Var.f6198c;
                    b1Var.f6198c = null;
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        try {
                            ((Executor) entry.getValue()).execute(new gb.a1((u.a) entry.getKey(), o10));
                        } catch (Throwable th) {
                            b1.f6195g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                        }
                    }
                }
            }
            this.f7299x = null;
        }
        if (!this.f7298w) {
            this.f7298w = true;
            this.f7285i.o0(jb.a.NO_ERROR, new byte[0]);
        }
        this.f7285i.close();
    }
}
