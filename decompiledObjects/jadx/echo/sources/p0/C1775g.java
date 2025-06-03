package p0;

import B0.m;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import d0.AbstractC1184g;
import g0.AbstractC1297a;
import g0.C1304h;
import g0.InterfaceC1303g;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l0.y1;
import p0.F;
import p0.InterfaceC1782n;
import p0.v;
import x0.C2139u;

/* renamed from: p0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1775g implements InterfaceC1782n {

    /* renamed from: a, reason: collision with root package name */
    public final List f18243a;

    /* renamed from: b, reason: collision with root package name */
    public final F f18244b;

    /* renamed from: c, reason: collision with root package name */
    public final a f18245c;

    /* renamed from: d, reason: collision with root package name */
    public final b f18246d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18247e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18248f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18249g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f18250h;

    /* renamed from: i, reason: collision with root package name */
    public final C1304h f18251i;

    /* renamed from: j, reason: collision with root package name */
    public final B0.m f18252j;

    /* renamed from: k, reason: collision with root package name */
    public final y1 f18253k;

    /* renamed from: l, reason: collision with root package name */
    public final Q f18254l;

    /* renamed from: m, reason: collision with root package name */
    public final UUID f18255m;

    /* renamed from: n, reason: collision with root package name */
    public final Looper f18256n;

    /* renamed from: o, reason: collision with root package name */
    public final e f18257o;

    /* renamed from: p, reason: collision with root package name */
    public int f18258p;

    /* renamed from: q, reason: collision with root package name */
    public int f18259q;

    /* renamed from: r, reason: collision with root package name */
    public HandlerThread f18260r;

    /* renamed from: s, reason: collision with root package name */
    public c f18261s;

    /* renamed from: t, reason: collision with root package name */
    public j0.b f18262t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC1782n.a f18263u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f18264v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f18265w;

    /* renamed from: x, reason: collision with root package name */
    public F.a f18266x;

    /* renamed from: y, reason: collision with root package name */
    public F.d f18267y;

    /* renamed from: p0.g$a */
    public interface a {
        void a(C1775g c1775g);

        void b();

        void c(Exception exc, boolean z7);
    }

    /* renamed from: p0.g$b */
    public interface b {
        void a(C1775g c1775g, int i7);

        void b(C1775g c1775g, int i7);
    }

    /* renamed from: p0.g$c */
    public class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f18268a;

        public c(Looper looper) {
            super(looper);
        }

        public final boolean a(Message message, S s7) {
            d dVar = (d) message.obj;
            if (!dVar.f18271b) {
                return false;
            }
            int i7 = dVar.f18274e + 1;
            dVar.f18274e = i7;
            if (i7 > C1775g.this.f18252j.d(3)) {
                return false;
            }
            long c7 = C1775g.this.f18252j.c(new m.c(new x0.r(dVar.f18270a, s7.f18236o, s7.f18237p, s7.f18238q, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f18272c, s7.f18239r), new C2139u(3), s7.getCause() instanceof IOException ? (IOException) s7.getCause() : new f(s7.getCause()), dVar.f18274e));
            if (c7 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f18268a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), c7);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b(int i7, Object obj, boolean z7) {
            obtainMessage(i7, new d(x0.r.a(), z7, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f18268a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable th;
            d dVar = (d) message.obj;
            try {
                int i7 = message.what;
                if (i7 == 1) {
                    th = C1775g.this.f18254l.a(C1775g.this.f18255m, (F.d) dVar.f18273d);
                } else {
                    if (i7 != 2) {
                        throw new RuntimeException();
                    }
                    th = C1775g.this.f18254l.b(C1775g.this.f18255m, (F.a) dVar.f18273d);
                }
            } catch (S e7) {
                boolean a7 = a(message, e7);
                th = e7;
                if (a7) {
                    return;
                }
            } catch (Exception e8) {
                g0.o.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e8);
                th = e8;
            }
            C1775g.this.f18252j.a(dVar.f18270a);
            synchronized (this) {
                try {
                    if (!this.f18268a) {
                        C1775g.this.f18257o.obtainMessage(message.what, Pair.create(dVar.f18273d, th)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: p0.g$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f18270a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f18271b;

        /* renamed from: c, reason: collision with root package name */
        public final long f18272c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f18273d;

        /* renamed from: e, reason: collision with root package name */
        public int f18274e;

        public d(long j7, boolean z7, long j8, Object obj) {
            this.f18270a = j7;
            this.f18271b = z7;
            this.f18272c = j8;
            this.f18273d = obj;
        }
    }

    /* renamed from: p0.g$e */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i7 = message.what;
            if (i7 == 1) {
                C1775g.this.E(obj, obj2);
            } else {
                if (i7 != 2) {
                    return;
                }
                C1775g.this.y(obj, obj2);
            }
        }
    }

    /* renamed from: p0.g$f */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public C1775g(UUID uuid, F f7, a aVar, b bVar, List list, int i7, boolean z7, boolean z8, byte[] bArr, HashMap hashMap, Q q7, Looper looper, B0.m mVar, y1 y1Var) {
        List unmodifiableList;
        if (i7 == 1 || i7 == 3) {
            AbstractC1297a.e(bArr);
        }
        this.f18255m = uuid;
        this.f18245c = aVar;
        this.f18246d = bVar;
        this.f18244b = f7;
        this.f18247e = i7;
        this.f18248f = z7;
        this.f18249g = z8;
        if (bArr != null) {
            this.f18265w = bArr;
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList((List) AbstractC1297a.e(list));
        }
        this.f18243a = unmodifiableList;
        this.f18250h = hashMap;
        this.f18254l = q7;
        this.f18251i = new C1304h();
        this.f18252j = mVar;
        this.f18253k = y1Var;
        this.f18258p = 2;
        this.f18256n = looper;
        this.f18257o = new e(looper);
    }

    public static /* synthetic */ void v(Throwable th, v.a aVar) {
        aVar.l((Exception) th);
    }

    public final void A() {
        if (this.f18247e == 0 && this.f18258p == 4) {
            g0.M.i(this.f18264v);
            r(false);
        }
    }

    public void B(int i7) {
        if (i7 != 2) {
            return;
        }
        A();
    }

    public void C() {
        if (F()) {
            r(true);
        }
    }

    public void D(Exception exc, boolean z7) {
        x(exc, z7 ? 1 : 3);
    }

    public final void E(Object obj, Object obj2) {
        if (obj == this.f18267y) {
            if (this.f18258p == 2 || u()) {
                this.f18267y = null;
                if (obj2 instanceof Exception) {
                    this.f18245c.c((Exception) obj2, false);
                    return;
                }
                try {
                    this.f18244b.i((byte[]) obj2);
                    this.f18245c.b();
                } catch (Exception e7) {
                    this.f18245c.c(e7, true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F() {
        /*
            r4 = this;
            boolean r0 = r4.u()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            p0.F r0 = r4.f18244b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            byte[] r0 = r0.m()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            r4.f18264v = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            p0.F r2 = r4.f18244b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            l0.y1 r3 = r4.f18253k     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            r2.f(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            p0.F r0 = r4.f18244b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            byte[] r2 = r4.f18264v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            j0.b r0 = r0.l(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            r4.f18262t = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            r0 = 3
            r4.f18258p = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            p0.b r2 = new p0.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            r2.<init>()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            r4.q(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            byte[] r0 = r4.f18264v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            g0.AbstractC1297a.e(r0)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L3b
            return r1
        L32:
            r0 = move-exception
            goto L35
        L34:
            r0 = move-exception
        L35:
            boolean r2 = p0.AbstractC1768B.b(r0)
            if (r2 == 0) goto L41
        L3b:
            p0.g$a r0 = r4.f18245c
            r0.a(r4)
            goto L44
        L41:
            r4.x(r0, r1)
        L44:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C1775g.F():boolean");
    }

    public final void G(byte[] bArr, int i7, boolean z7) {
        try {
            this.f18266x = this.f18244b.j(bArr, this.f18243a, i7, this.f18250h);
            ((c) g0.M.i(this.f18261s)).b(2, AbstractC1297a.e(this.f18266x), z7);
        } catch (Exception | NoSuchMethodError e7) {
            z(e7, true);
        }
    }

    public void H() {
        this.f18267y = this.f18244b.h();
        ((c) g0.M.i(this.f18261s)).b(1, AbstractC1297a.e(this.f18267y), true);
    }

    public final boolean I() {
        try {
            this.f18244b.c(this.f18264v, this.f18265w);
            return true;
        } catch (Exception | NoSuchMethodError e7) {
            x(e7, 1);
            return false;
        }
    }

    public final void J() {
        if (Thread.currentThread() != this.f18256n.getThread()) {
            g0.o.i("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f18256n.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p0.InterfaceC1782n
    public void a(v.a aVar) {
        J();
        if (this.f18259q < 0) {
            g0.o.c("DefaultDrmSession", "Session reference count less than zero: " + this.f18259q);
            this.f18259q = 0;
        }
        if (aVar != null) {
            this.f18251i.a(aVar);
        }
        int i7 = this.f18259q + 1;
        this.f18259q = i7;
        if (i7 == 1) {
            AbstractC1297a.f(this.f18258p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f18260r = handlerThread;
            handlerThread.start();
            this.f18261s = new c(this.f18260r.getLooper());
            if (F()) {
                r(true);
            }
        } else if (aVar != null && u() && this.f18251i.d(aVar) == 1) {
            aVar.k(this.f18258p);
        }
        this.f18246d.a(this, this.f18259q);
    }

    @Override // p0.InterfaceC1782n
    public boolean b() {
        J();
        return this.f18248f;
    }

    @Override // p0.InterfaceC1782n
    public Map c() {
        J();
        byte[] bArr = this.f18264v;
        if (bArr == null) {
            return null;
        }
        return this.f18244b.d(bArr);
    }

    @Override // p0.InterfaceC1782n
    public final UUID d() {
        J();
        return this.f18255m;
    }

    @Override // p0.InterfaceC1782n
    public void e(v.a aVar) {
        J();
        int i7 = this.f18259q;
        if (i7 <= 0) {
            g0.o.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i8 = i7 - 1;
        this.f18259q = i8;
        if (i8 == 0) {
            this.f18258p = 0;
            ((e) g0.M.i(this.f18257o)).removeCallbacksAndMessages(null);
            ((c) g0.M.i(this.f18261s)).c();
            this.f18261s = null;
            ((HandlerThread) g0.M.i(this.f18260r)).quit();
            this.f18260r = null;
            this.f18262t = null;
            this.f18263u = null;
            this.f18266x = null;
            this.f18267y = null;
            byte[] bArr = this.f18264v;
            if (bArr != null) {
                this.f18244b.e(bArr);
                this.f18264v = null;
            }
        }
        if (aVar != null) {
            this.f18251i.f(aVar);
            if (this.f18251i.d(aVar) == 0) {
                aVar.m();
            }
        }
        this.f18246d.b(this, this.f18259q);
    }

    @Override // p0.InterfaceC1782n
    public boolean f(String str) {
        J();
        return this.f18244b.b((byte[]) AbstractC1297a.h(this.f18264v), str);
    }

    @Override // p0.InterfaceC1782n
    public final InterfaceC1782n.a g() {
        J();
        if (this.f18258p == 1) {
            return this.f18263u;
        }
        return null;
    }

    @Override // p0.InterfaceC1782n
    public final int getState() {
        J();
        return this.f18258p;
    }

    @Override // p0.InterfaceC1782n
    public final j0.b h() {
        J();
        return this.f18262t;
    }

    public final void q(InterfaceC1303g interfaceC1303g) {
        Iterator it = this.f18251i.u().iterator();
        while (it.hasNext()) {
            interfaceC1303g.accept((v.a) it.next());
        }
    }

    public final void r(boolean z7) {
        if (this.f18249g) {
            return;
        }
        byte[] bArr = (byte[]) g0.M.i(this.f18264v);
        int i7 = this.f18247e;
        if (i7 == 0 || i7 == 1) {
            if (this.f18265w == null) {
                G(bArr, 1, z7);
                return;
            }
            if (this.f18258p != 4 && !I()) {
                return;
            }
            long s7 = s();
            if (this.f18247e != 0 || s7 > 60) {
                if (s7 <= 0) {
                    x(new P(), 2);
                    return;
                } else {
                    this.f18258p = 4;
                    q(new InterfaceC1303g() { // from class: p0.f
                        @Override // g0.InterfaceC1303g
                        public final void accept(Object obj) {
                            ((v.a) obj).j();
                        }
                    });
                    return;
                }
            }
            g0.o.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + s7);
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                AbstractC1297a.e(this.f18265w);
                AbstractC1297a.e(this.f18264v);
                G(this.f18265w, 3, z7);
                return;
            }
            if (this.f18265w != null && !I()) {
                return;
            }
        }
        G(bArr, 2, z7);
    }

    public final long s() {
        if (!AbstractC1184g.f12618d.equals(this.f18255m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) AbstractC1297a.e(U.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    public boolean t(byte[] bArr) {
        J();
        return Arrays.equals(this.f18264v, bArr);
    }

    public final boolean u() {
        int i7 = this.f18258p;
        return i7 == 3 || i7 == 4;
    }

    public final void x(final Throwable th, int i7) {
        this.f18263u = new InterfaceC1782n.a(th, AbstractC1768B.a(th, i7));
        g0.o.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            q(new InterfaceC1303g() { // from class: p0.e
                @Override // g0.InterfaceC1303g
                public final void accept(Object obj) {
                    C1775g.v(th, (v.a) obj);
                }
            });
        } else {
            if (!(th instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!AbstractC1768B.c(th) && !AbstractC1768B.b(th)) {
                throw ((Error) th);
            }
        }
        if (this.f18258p != 4) {
            this.f18258p = 1;
        }
    }

    public final void y(Object obj, Object obj2) {
        InterfaceC1303g interfaceC1303g;
        if (obj == this.f18266x && u()) {
            this.f18266x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                z((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f18247e == 3) {
                    this.f18244b.g((byte[]) g0.M.i(this.f18265w), bArr);
                    interfaceC1303g = new InterfaceC1303g() { // from class: p0.c
                        @Override // g0.InterfaceC1303g
                        public final void accept(Object obj3) {
                            ((v.a) obj3).i();
                        }
                    };
                } else {
                    byte[] g7 = this.f18244b.g(this.f18264v, bArr);
                    int i7 = this.f18247e;
                    if ((i7 == 2 || (i7 == 0 && this.f18265w != null)) && g7 != null && g7.length != 0) {
                        this.f18265w = g7;
                    }
                    this.f18258p = 4;
                    interfaceC1303g = new InterfaceC1303g() { // from class: p0.d
                        @Override // g0.InterfaceC1303g
                        public final void accept(Object obj3) {
                            ((v.a) obj3).h();
                        }
                    };
                }
                q(interfaceC1303g);
            } catch (Exception e7) {
                e = e7;
                z(e, true);
            } catch (NoSuchMethodError e8) {
                e = e8;
                z(e, true);
            }
        }
    }

    public final void z(Throwable th, boolean z7) {
        if ((th instanceof NotProvisionedException) || AbstractC1768B.b(th)) {
            this.f18245c.a(this);
        } else {
            x(th, z7 ? 1 : 2);
        }
    }
}
