package androidx.media3.exoplayer.dash;

import B0.k;
import B0.m;
import B0.n;
import B0.o;
import B0.p;
import C0.a;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.c;
import androidx.media3.exoplayer.dash.d;
import d0.AbstractC1170I;
import d0.AbstractC1199v;
import d0.C1162A;
import d0.C1198u;
import g0.AbstractC1297a;
import g0.M;
import i0.g;
import i0.y;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n0.C1689b;
import n0.C1690c;
import o0.C1750a;
import o0.C1752c;
import o0.j;
import p0.C1780l;
import p0.InterfaceC1767A;
import p0.x;
import v0.C2048b;
import x0.AbstractC2120a;
import x0.C2132m;
import x0.C2139u;
import x0.InterfaceC2117E;
import x0.InterfaceC2129j;
import x0.InterfaceC2140v;
import x0.InterfaceC2142x;
import x0.r;

/* loaded from: classes.dex */
public final class DashMediaSource extends AbstractC2120a {

    /* renamed from: A, reason: collision with root package name */
    public n f9755A;

    /* renamed from: B, reason: collision with root package name */
    public y f9756B;

    /* renamed from: C, reason: collision with root package name */
    public IOException f9757C;

    /* renamed from: D, reason: collision with root package name */
    public Handler f9758D;

    /* renamed from: E, reason: collision with root package name */
    public C1198u.g f9759E;

    /* renamed from: F, reason: collision with root package name */
    public Uri f9760F;

    /* renamed from: G, reason: collision with root package name */
    public Uri f9761G;

    /* renamed from: H, reason: collision with root package name */
    public C1752c f9762H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f9763I;

    /* renamed from: J, reason: collision with root package name */
    public long f9764J;

    /* renamed from: K, reason: collision with root package name */
    public long f9765K;

    /* renamed from: L, reason: collision with root package name */
    public long f9766L;

    /* renamed from: M, reason: collision with root package name */
    public int f9767M;

    /* renamed from: N, reason: collision with root package name */
    public long f9768N;

    /* renamed from: O, reason: collision with root package name */
    public int f9769O;

    /* renamed from: P, reason: collision with root package name */
    public C1198u f9770P;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f9771h;

    /* renamed from: i, reason: collision with root package name */
    public final g.a f9772i;

    /* renamed from: j, reason: collision with root package name */
    public final a.InterfaceC0163a f9773j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2129j f9774k;

    /* renamed from: l, reason: collision with root package name */
    public final x f9775l;

    /* renamed from: m, reason: collision with root package name */
    public final m f9776m;

    /* renamed from: n, reason: collision with root package name */
    public final C1689b f9777n;

    /* renamed from: o, reason: collision with root package name */
    public final long f9778o;

    /* renamed from: p, reason: collision with root package name */
    public final long f9779p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC2117E.a f9780q;

    /* renamed from: r, reason: collision with root package name */
    public final p.a f9781r;

    /* renamed from: s, reason: collision with root package name */
    public final e f9782s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f9783t;

    /* renamed from: u, reason: collision with root package name */
    public final SparseArray f9784u;

    /* renamed from: v, reason: collision with root package name */
    public final Runnable f9785v;

    /* renamed from: w, reason: collision with root package name */
    public final Runnable f9786w;

    /* renamed from: x, reason: collision with root package name */
    public final d.b f9787x;

    /* renamed from: y, reason: collision with root package name */
    public final o f9788y;

    /* renamed from: z, reason: collision with root package name */
    public i0.g f9789z;

    public static final class Factory implements InterfaceC2142x.a {

        /* renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0163a f9790a;

        /* renamed from: b, reason: collision with root package name */
        public final g.a f9791b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC1767A f9792c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC2129j f9793d;

        /* renamed from: e, reason: collision with root package name */
        public m f9794e;

        /* renamed from: f, reason: collision with root package name */
        public long f9795f;

        /* renamed from: g, reason: collision with root package name */
        public long f9796g;

        /* renamed from: h, reason: collision with root package name */
        public p.a f9797h;

        public Factory(a.InterfaceC0163a interfaceC0163a, g.a aVar) {
            this.f9790a = (a.InterfaceC0163a) AbstractC1297a.e(interfaceC0163a);
            this.f9791b = aVar;
            this.f9792c = new C1780l();
            this.f9794e = new k();
            this.f9795f = 30000L;
            this.f9796g = 5000000L;
            this.f9793d = new C2132m();
            b(true);
        }

        public DashMediaSource a(C1198u c1198u) {
            AbstractC1297a.e(c1198u.f12800b);
            p.a aVar = this.f9797h;
            if (aVar == null) {
                aVar = new o0.d();
            }
            List list = c1198u.f12800b.f12895d;
            return new DashMediaSource(c1198u, null, this.f9791b, !list.isEmpty() ? new C2048b(aVar, list) : aVar, this.f9790a, this.f9793d, null, this.f9792c.a(c1198u), this.f9794e, this.f9795f, this.f9796g, null);
        }

        public Factory b(boolean z7) {
            this.f9790a.a(z7);
            return this;
        }

        public Factory(g.a aVar) {
            this(new c.a(aVar), aVar);
        }
    }

    public class a implements a.b {
        public a() {
        }

        @Override // C0.a.b
        public void a() {
            DashMediaSource.this.Y(C0.a.h());
        }

        @Override // C0.a.b
        public void b(IOException iOException) {
            DashMediaSource.this.X(iOException);
        }
    }

    public static final class b extends AbstractC1170I {

        /* renamed from: e, reason: collision with root package name */
        public final long f9799e;

        /* renamed from: f, reason: collision with root package name */
        public final long f9800f;

        /* renamed from: g, reason: collision with root package name */
        public final long f9801g;

        /* renamed from: h, reason: collision with root package name */
        public final int f9802h;

        /* renamed from: i, reason: collision with root package name */
        public final long f9803i;

        /* renamed from: j, reason: collision with root package name */
        public final long f9804j;

        /* renamed from: k, reason: collision with root package name */
        public final long f9805k;

        /* renamed from: l, reason: collision with root package name */
        public final C1752c f9806l;

        /* renamed from: m, reason: collision with root package name */
        public final C1198u f9807m;

        /* renamed from: n, reason: collision with root package name */
        public final C1198u.g f9808n;

        public b(long j7, long j8, long j9, int i7, long j10, long j11, long j12, C1752c c1752c, C1198u c1198u, C1198u.g gVar) {
            AbstractC1297a.f(c1752c.f18085d == (gVar != null));
            this.f9799e = j7;
            this.f9800f = j8;
            this.f9801g = j9;
            this.f9802h = i7;
            this.f9803i = j10;
            this.f9804j = j11;
            this.f9805k = j12;
            this.f9806l = c1752c;
            this.f9807m = c1198u;
            this.f9808n = gVar;
        }

        public static boolean t(C1752c c1752c) {
            return c1752c.f18085d && c1752c.f18086e != -9223372036854775807L && c1752c.f18083b == -9223372036854775807L;
        }

        @Override // d0.AbstractC1170I
        public int b(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f9802h) >= 0 && intValue < i()) {
                return intValue;
            }
            return -1;
        }

        @Override // d0.AbstractC1170I
        public AbstractC1170I.b g(int i7, AbstractC1170I.b bVar, boolean z7) {
            AbstractC1297a.c(i7, 0, i());
            return bVar.s(z7 ? this.f9806l.d(i7).f18117a : null, z7 ? Integer.valueOf(this.f9802h + i7) : null, 0, this.f9806l.g(i7), M.J0(this.f9806l.d(i7).f18118b - this.f9806l.d(0).f18118b) - this.f9803i);
        }

        @Override // d0.AbstractC1170I
        public int i() {
            return this.f9806l.e();
        }

        @Override // d0.AbstractC1170I
        public Object m(int i7) {
            AbstractC1297a.c(i7, 0, i());
            return Integer.valueOf(this.f9802h + i7);
        }

        @Override // d0.AbstractC1170I
        public AbstractC1170I.c o(int i7, AbstractC1170I.c cVar, long j7) {
            AbstractC1297a.c(i7, 0, 1);
            long s7 = s(j7);
            Object obj = AbstractC1170I.c.f12410q;
            C1198u c1198u = this.f9807m;
            C1752c c1752c = this.f9806l;
            return cVar.g(obj, c1198u, c1752c, this.f9799e, this.f9800f, this.f9801g, true, t(c1752c), this.f9808n, s7, this.f9804j, 0, i() - 1, this.f9803i);
        }

        @Override // d0.AbstractC1170I
        public int p() {
            return 1;
        }

        public final long s(long j7) {
            n0.g l7;
            long j8 = this.f9805k;
            if (!t(this.f9806l)) {
                return j8;
            }
            if (j7 > 0) {
                j8 += j7;
                if (j8 > this.f9804j) {
                    return -9223372036854775807L;
                }
            }
            long j9 = this.f9803i + j8;
            long g7 = this.f9806l.g(0);
            int i7 = 0;
            while (i7 < this.f9806l.e() - 1 && j9 >= g7) {
                j9 -= g7;
                i7++;
                g7 = this.f9806l.g(i7);
            }
            o0.g d7 = this.f9806l.d(i7);
            int a7 = d7.a(2);
            return (a7 == -1 || (l7 = ((j) ((C1750a) d7.f18119c.get(a7)).f18074c.get(0)).l()) == null || l7.i(g7) == 0) ? j8 : (j8 + l7.c(l7.a(j9, g7))) - j9;
        }
    }

    public final class c implements d.b {
        public c() {
        }

        @Override // androidx.media3.exoplayer.dash.d.b
        public void a() {
            DashMediaSource.this.R();
        }

        @Override // androidx.media3.exoplayer.dash.d.b
        public void b(long j7) {
            DashMediaSource.this.Q(j7);
        }

        public /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    public static final class d implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final Pattern f9810a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // B0.p.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, W2.e.f6821c)).readLine();
            try {
                Matcher matcher = f9810a.matcher(readLine);
                if (!matcher.matches()) {
                    throw C1162A.c("Couldn't parse timestamp: " + readLine, null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j7 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j7 * (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e7) {
                throw C1162A.c(null, e7);
            }
        }
    }

    public final class e implements n.b {
        public e() {
        }

        @Override // B0.n.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void t(p pVar, long j7, long j8, boolean z7) {
            DashMediaSource.this.S(pVar, j7, j8);
        }

        @Override // B0.n.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void o(p pVar, long j7, long j8) {
            DashMediaSource.this.T(pVar, j7, j8);
        }

        @Override // B0.n.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public n.c r(p pVar, long j7, long j8, IOException iOException, int i7) {
            return DashMediaSource.this.U(pVar, j7, j8, iOException, i7);
        }

        public /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    public final class f implements o {
        public f() {
        }

        @Override // B0.o
        public void a() {
            DashMediaSource.this.f9755A.a();
            b();
        }

        public final void b() {
            if (DashMediaSource.this.f9757C != null) {
                throw DashMediaSource.this.f9757C;
            }
        }
    }

    public final class g implements n.b {
        public g() {
        }

        @Override // B0.n.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void t(p pVar, long j7, long j8, boolean z7) {
            DashMediaSource.this.S(pVar, j7, j8);
        }

        @Override // B0.n.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void o(p pVar, long j7, long j8) {
            DashMediaSource.this.V(pVar, j7, j8);
        }

        @Override // B0.n.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public n.c r(p pVar, long j7, long j8, IOException iOException, int i7) {
            return DashMediaSource.this.W(pVar, j7, j8, iOException);
        }

        public /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    public static final class h implements p.a {
        public h() {
        }

        public /* synthetic */ h(a aVar) {
            this();
        }

        @Override // B0.p.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(M.Q0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        AbstractC1199v.a("media3.exoplayer.dash");
    }

    public DashMediaSource(C1198u c1198u, C1752c c1752c, g.a aVar, p.a aVar2, a.InterfaceC0163a interfaceC0163a, InterfaceC2129j interfaceC2129j, B0.f fVar, x xVar, m mVar, long j7, long j8) {
        this.f9770P = c1198u;
        this.f9759E = c1198u.f12802d;
        this.f9760F = ((C1198u.h) AbstractC1297a.e(c1198u.f12800b)).f12892a;
        this.f9761G = c1198u.f12800b.f12892a;
        this.f9762H = c1752c;
        this.f9772i = aVar;
        this.f9781r = aVar2;
        this.f9773j = interfaceC0163a;
        this.f9775l = xVar;
        this.f9776m = mVar;
        this.f9778o = j7;
        this.f9779p = j8;
        this.f9774k = interfaceC2129j;
        this.f9777n = new C1689b();
        boolean z7 = c1752c != null;
        this.f9771h = z7;
        a aVar3 = null;
        this.f9780q = u(null);
        this.f9783t = new Object();
        this.f9784u = new SparseArray();
        this.f9787x = new c(this, aVar3);
        this.f9768N = -9223372036854775807L;
        this.f9766L = -9223372036854775807L;
        if (!z7) {
            this.f9782s = new e(this, aVar3);
            this.f9788y = new f();
            this.f9785v = new Runnable() { // from class: n0.e
                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.f0();
                }
            };
            this.f9786w = new Runnable() { // from class: n0.f
                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.O();
                }
            };
            return;
        }
        AbstractC1297a.f(true ^ c1752c.f18085d);
        this.f9782s = null;
        this.f9785v = null;
        this.f9786w = null;
        this.f9788y = new o.a();
    }

    public static long I(o0.g gVar, long j7, long j8) {
        long J02 = M.J0(gVar.f18118b);
        boolean M6 = M(gVar);
        long j9 = Long.MAX_VALUE;
        for (int i7 = 0; i7 < gVar.f18119c.size(); i7++) {
            C1750a c1750a = (C1750a) gVar.f18119c.get(i7);
            List list = c1750a.f18074c;
            int i8 = c1750a.f18073b;
            boolean z7 = (i8 == 1 || i8 == 2) ? false : true;
            if ((!M6 || !z7) && !list.isEmpty()) {
                n0.g l7 = ((j) list.get(0)).l();
                if (l7 == null) {
                    return J02 + j7;
                }
                long j10 = l7.j(j7, j8);
                if (j10 == 0) {
                    return J02;
                }
                long d7 = (l7.d(j7, j8) + j10) - 1;
                j9 = Math.min(j9, l7.b(d7, j7) + l7.c(d7) + J02);
            }
        }
        return j9;
    }

    public static long J(o0.g gVar, long j7, long j8) {
        long J02 = M.J0(gVar.f18118b);
        boolean M6 = M(gVar);
        long j9 = J02;
        for (int i7 = 0; i7 < gVar.f18119c.size(); i7++) {
            C1750a c1750a = (C1750a) gVar.f18119c.get(i7);
            List list = c1750a.f18074c;
            int i8 = c1750a.f18073b;
            boolean z7 = (i8 == 1 || i8 == 2) ? false : true;
            if ((!M6 || !z7) && !list.isEmpty()) {
                n0.g l7 = ((j) list.get(0)).l();
                if (l7 == null) {
                    return J02;
                }
                if (l7.j(j7, j8) == 0) {
                    return J02;
                }
                j9 = Math.max(j9, l7.c(l7.d(j7, j8)) + J02);
            }
        }
        return j9;
    }

    public static long K(C1752c c1752c, long j7) {
        n0.g l7;
        int e7 = c1752c.e() - 1;
        o0.g d7 = c1752c.d(e7);
        long J02 = M.J0(d7.f18118b);
        long g7 = c1752c.g(e7);
        long J03 = M.J0(j7);
        long J04 = M.J0(c1752c.f18082a);
        long J05 = M.J0(5000L);
        for (int i7 = 0; i7 < d7.f18119c.size(); i7++) {
            List list = ((C1750a) d7.f18119c.get(i7)).f18074c;
            if (!list.isEmpty() && (l7 = ((j) list.get(0)).l()) != null) {
                long e8 = ((J04 + J02) + l7.e(g7, J03)) - J03;
                if (e8 < J05 - 100000 || (e8 > J05 && e8 < J05 + 100000)) {
                    J05 = e8;
                }
            }
        }
        return Z2.e.b(J05, 1000L, RoundingMode.CEILING);
    }

    public static boolean M(o0.g gVar) {
        for (int i7 = 0; i7 < gVar.f18119c.size(); i7++) {
            int i8 = ((C1750a) gVar.f18119c.get(i7)).f18073b;
            if (i8 == 1 || i8 == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(o0.g gVar) {
        for (int i7 = 0; i7 < gVar.f18119c.size(); i7++) {
            n0.g l7 = ((j) ((C1750a) gVar.f18119c.get(i7)).f18074c.get(0)).l();
            if (l7 == null || l7.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // x0.AbstractC2120a
    public void B() {
        this.f9763I = false;
        this.f9789z = null;
        n nVar = this.f9755A;
        if (nVar != null) {
            nVar.l();
            this.f9755A = null;
        }
        this.f9764J = 0L;
        this.f9765K = 0L;
        this.f9760F = this.f9761G;
        this.f9757C = null;
        Handler handler = this.f9758D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f9758D = null;
        }
        this.f9766L = -9223372036854775807L;
        this.f9767M = 0;
        this.f9768N = -9223372036854775807L;
        this.f9784u.clear();
        this.f9777n.i();
        this.f9775l.release();
    }

    public final long L() {
        return Math.min((this.f9767M - 1) * 1000, 5000);
    }

    public final /* synthetic */ void O() {
        Z(false);
    }

    public final void P() {
        C0.a.j(this.f9755A, new a());
    }

    public void Q(long j7) {
        long j8 = this.f9768N;
        if (j8 == -9223372036854775807L || j8 < j7) {
            this.f9768N = j7;
        }
    }

    public void R() {
        this.f9758D.removeCallbacks(this.f9786w);
        f0();
    }

    public void S(p pVar, long j7, long j8) {
        r rVar = new r(pVar.f651a, pVar.f652b, pVar.f(), pVar.d(), j7, j8, pVar.a());
        this.f9776m.a(pVar.f651a);
        this.f9780q.p(rVar, pVar.f653c);
    }

    public void T(p pVar, long j7, long j8) {
        r rVar = new r(pVar.f651a, pVar.f652b, pVar.f(), pVar.d(), j7, j8, pVar.a());
        this.f9776m.a(pVar.f651a);
        this.f9780q.s(rVar, pVar.f653c);
        C1752c c1752c = (C1752c) pVar.e();
        C1752c c1752c2 = this.f9762H;
        int e7 = c1752c2 == null ? 0 : c1752c2.e();
        long j9 = c1752c.d(0).f18118b;
        int i7 = 0;
        while (i7 < e7 && this.f9762H.d(i7).f18118b < j9) {
            i7++;
        }
        if (c1752c.f18085d) {
            if (e7 - i7 > c1752c.e()) {
                g0.o.h("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j10 = this.f9768N;
                if (j10 == -9223372036854775807L || c1752c.f18089h * 1000 > j10) {
                    this.f9767M = 0;
                } else {
                    g0.o.h("DashMediaSource", "Loaded stale dynamic manifest: " + c1752c.f18089h + ", " + this.f9768N);
                }
            }
            int i8 = this.f9767M;
            this.f9767M = i8 + 1;
            if (i8 < this.f9776m.d(pVar.f653c)) {
                d0(L());
                return;
            } else {
                this.f9757C = new C1690c();
                return;
            }
        }
        this.f9762H = c1752c;
        this.f9763I = c1752c.f18085d & this.f9763I;
        this.f9764J = j7 - j8;
        this.f9765K = j7;
        this.f9769O += i7;
        synchronized (this.f9783t) {
            try {
                if (pVar.f652b.f14652a == this.f9760F) {
                    Uri uri = this.f9762H.f18092k;
                    if (uri == null) {
                        uri = pVar.f();
                    }
                    this.f9760F = uri;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1752c c1752c3 = this.f9762H;
        if (!c1752c3.f18085d || this.f9766L != -9223372036854775807L) {
            Z(true);
            return;
        }
        o0.o oVar = c1752c3.f18090i;
        if (oVar != null) {
            a0(oVar);
        } else {
            P();
        }
    }

    public n.c U(p pVar, long j7, long j8, IOException iOException, int i7) {
        r rVar = new r(pVar.f651a, pVar.f652b, pVar.f(), pVar.d(), j7, j8, pVar.a());
        long c7 = this.f9776m.c(new m.c(rVar, new C2139u(pVar.f653c), iOException, i7));
        n.c h7 = c7 == -9223372036854775807L ? n.f634g : n.h(false, c7);
        boolean z7 = !h7.c();
        this.f9780q.w(rVar, pVar.f653c, iOException, z7);
        if (z7) {
            this.f9776m.a(pVar.f651a);
        }
        return h7;
    }

    public void V(p pVar, long j7, long j8) {
        r rVar = new r(pVar.f651a, pVar.f652b, pVar.f(), pVar.d(), j7, j8, pVar.a());
        this.f9776m.a(pVar.f651a);
        this.f9780q.s(rVar, pVar.f653c);
        Y(((Long) pVar.e()).longValue() - j7);
    }

    public n.c W(p pVar, long j7, long j8, IOException iOException) {
        this.f9780q.w(new r(pVar.f651a, pVar.f652b, pVar.f(), pVar.d(), j7, j8, pVar.a()), pVar.f653c, iOException, true);
        this.f9776m.a(pVar.f651a);
        X(iOException);
        return n.f633f;
    }

    public final void X(IOException iOException) {
        g0.o.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f9766L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        Z(true);
    }

    public final void Y(long j7) {
        this.f9766L = j7;
        Z(true);
    }

    public final void Z(boolean z7) {
        o0.g gVar;
        long j7;
        long j8;
        for (int i7 = 0; i7 < this.f9784u.size(); i7++) {
            int keyAt = this.f9784u.keyAt(i7);
            if (keyAt >= this.f9769O) {
                ((androidx.media3.exoplayer.dash.b) this.f9784u.valueAt(i7)).P(this.f9762H, keyAt - this.f9769O);
            }
        }
        o0.g d7 = this.f9762H.d(0);
        int e7 = this.f9762H.e() - 1;
        o0.g d8 = this.f9762H.d(e7);
        long g7 = this.f9762H.g(e7);
        long J02 = M.J0(M.d0(this.f9766L));
        long J6 = J(d7, this.f9762H.g(0), J02);
        long I6 = I(d8, g7, J02);
        boolean z8 = this.f9762H.f18085d && !N(d8);
        if (z8) {
            long j9 = this.f9762H.f18087f;
            if (j9 != -9223372036854775807L) {
                J6 = Math.max(J6, I6 - M.J0(j9));
            }
        }
        long j10 = I6 - J6;
        C1752c c1752c = this.f9762H;
        if (c1752c.f18085d) {
            AbstractC1297a.f(c1752c.f18082a != -9223372036854775807L);
            long J03 = (J02 - M.J0(this.f9762H.f18082a)) - J6;
            g0(J03, j10);
            long i12 = this.f9762H.f18082a + M.i1(J6);
            long J04 = J03 - M.J0(this.f9759E.f12874a);
            long min = Math.min(this.f9779p, j10 / 2);
            j7 = i12;
            j8 = J04 < min ? min : J04;
            gVar = d7;
        } else {
            gVar = d7;
            j7 = -9223372036854775807L;
            j8 = 0;
        }
        long J05 = J6 - M.J0(gVar.f18118b);
        C1752c c1752c2 = this.f9762H;
        A(new b(c1752c2.f18082a, j7, this.f9766L, this.f9769O, J05, j10, j8, c1752c2, a(), this.f9762H.f18085d ? this.f9759E : null));
        if (this.f9771h) {
            return;
        }
        this.f9758D.removeCallbacks(this.f9786w);
        if (z8) {
            this.f9758D.postDelayed(this.f9786w, K(this.f9762H, M.d0(this.f9766L)));
        }
        if (this.f9763I) {
            f0();
            return;
        }
        if (z7) {
            C1752c c1752c3 = this.f9762H;
            if (c1752c3.f18085d) {
                long j11 = c1752c3.f18086e;
                if (j11 != -9223372036854775807L) {
                    if (j11 == 0) {
                        j11 = 5000;
                    }
                    d0(Math.max(0L, (this.f9764J + j11) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    @Override // x0.InterfaceC2142x
    public synchronized C1198u a() {
        return this.f9770P;
    }

    public final void a0(o0.o oVar) {
        p.a dVar;
        String str = oVar.f18171a;
        if (M.c(str, "urn:mpeg:dash:utc:direct:2014") || M.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            b0(oVar);
            return;
        }
        if (M.c(str, "urn:mpeg:dash:utc:http-iso:2014") || M.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            dVar = new d();
        } else {
            if (!M.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !M.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                if (M.c(str, "urn:mpeg:dash:utc:ntp:2014") || M.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
                    P();
                    return;
                } else {
                    X(new IOException("Unsupported UTC timing scheme"));
                    return;
                }
            }
            dVar = new h(null);
        }
        c0(oVar, dVar);
    }

    public final void b0(o0.o oVar) {
        try {
            Y(M.Q0(oVar.f18172b) - this.f9765K);
        } catch (C1162A e7) {
            X(e7);
        }
    }

    public final void c0(o0.o oVar, p.a aVar) {
        e0(new p(this.f9789z, Uri.parse(oVar.f18172b), 5, aVar), new g(this, null), 1);
    }

    public final void d0(long j7) {
        this.f9758D.postDelayed(this.f9785v, j7);
    }

    @Override // x0.InterfaceC2142x
    public void e(InterfaceC2140v interfaceC2140v) {
        androidx.media3.exoplayer.dash.b bVar = (androidx.media3.exoplayer.dash.b) interfaceC2140v;
        bVar.L();
        this.f9784u.remove(bVar.f9828o);
    }

    public final void e0(p pVar, n.b bVar, int i7) {
        this.f9780q.y(new r(pVar.f651a, pVar.f652b, this.f9755A.n(pVar, bVar, i7)), pVar.f653c);
    }

    @Override // x0.InterfaceC2142x
    public InterfaceC2140v f(InterfaceC2142x.b bVar, B0.b bVar2, long j7) {
        int intValue = ((Integer) bVar.f20848a).intValue() - this.f9769O;
        InterfaceC2117E.a u7 = u(bVar);
        androidx.media3.exoplayer.dash.b bVar3 = new androidx.media3.exoplayer.dash.b(intValue + this.f9769O, this.f9762H, this.f9777n, intValue, this.f9773j, this.f9756B, null, this.f9775l, s(bVar), this.f9776m, u7, this.f9766L, this.f9788y, bVar2, this.f9774k, this.f9787x, x());
        this.f9784u.put(bVar3.f9828o, bVar3);
        return bVar3;
    }

    public final void f0() {
        Uri uri;
        this.f9758D.removeCallbacks(this.f9785v);
        if (this.f9755A.i()) {
            return;
        }
        if (this.f9755A.j()) {
            this.f9763I = true;
            return;
        }
        synchronized (this.f9783t) {
            uri = this.f9760F;
        }
        this.f9763I = false;
        e0(new p(this.f9789z, uri, 4, this.f9781r), this.f9782s, this.f9776m.d(4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x005f, code lost:
    
        if (r2 != (-9223372036854775807L)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0027, code lost:
    
        if (r2 != (-9223372036854775807L)) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g0(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.g0(long, long):void");
    }

    @Override // x0.InterfaceC2142x
    public void h() {
        this.f9788y.a();
    }

    @Override // x0.AbstractC2120a, x0.InterfaceC2142x
    public synchronized void l(C1198u c1198u) {
        this.f9770P = c1198u;
    }

    @Override // x0.AbstractC2120a
    public void z(y yVar) {
        this.f9756B = yVar;
        this.f9775l.a(Looper.myLooper(), x());
        this.f9775l.g();
        if (this.f9771h) {
            Z(false);
            return;
        }
        this.f9789z = this.f9772i.a();
        this.f9755A = new n("DashMediaSource");
        this.f9758D = M.A();
        f0();
    }

    public /* synthetic */ DashMediaSource(C1198u c1198u, C1752c c1752c, g.a aVar, p.a aVar2, a.InterfaceC0163a interfaceC0163a, InterfaceC2129j interfaceC2129j, B0.f fVar, x xVar, m mVar, long j7, long j8, a aVar3) {
        this(c1198u, c1752c, aVar, aVar2, interfaceC0163a, interfaceC2129j, fVar, xVar, mVar, j7, j8);
    }
}
