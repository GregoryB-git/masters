package D0;

import D0.C0352d;
import D0.F;
import D0.t;
import X2.AbstractC0703v;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import d0.C1174M;
import d0.C1177P;
import d0.C1185h;
import d0.C1194q;
import d0.C1195r;
import d0.InterfaceC1167F;
import d0.InterfaceC1175N;
import d0.InterfaceC1176O;
import d0.InterfaceC1188k;
import d0.InterfaceC1191n;
import g0.AbstractC1297a;
import g0.C1295A;
import g0.InterfaceC1299c;
import g0.InterfaceC1307k;
import g0.M;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import k0.C1438u;

/* renamed from: D0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0352d implements G, InterfaceC1176O {

    /* renamed from: n, reason: collision with root package name */
    public static final Executor f1059n = new Executor() { // from class: D0.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C0352d.D(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Context f1060a;

    /* renamed from: b, reason: collision with root package name */
    public final h f1061b;

    /* renamed from: c, reason: collision with root package name */
    public final q f1062c;

    /* renamed from: d, reason: collision with root package name */
    public final t f1063d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1167F.a f1064e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1299c f1065f;

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f1066g;

    /* renamed from: h, reason: collision with root package name */
    public C1194q f1067h;

    /* renamed from: i, reason: collision with root package name */
    public p f1068i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC1307k f1069j;

    /* renamed from: k, reason: collision with root package name */
    public Pair f1070k;

    /* renamed from: l, reason: collision with root package name */
    public int f1071l;

    /* renamed from: m, reason: collision with root package name */
    public int f1072m;

    /* renamed from: D0.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f1073a;

        /* renamed from: b, reason: collision with root package name */
        public final q f1074b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC1175N.a f1075c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC1167F.a f1076d;

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC1299c f1077e = InterfaceC1299c.f14278a;

        /* renamed from: f, reason: collision with root package name */
        public boolean f1078f;

        public b(Context context, q qVar) {
            this.f1073a = context.getApplicationContext();
            this.f1074b = qVar;
        }

        public C0352d e() {
            AbstractC1297a.f(!this.f1078f);
            if (this.f1076d == null) {
                if (this.f1075c == null) {
                    this.f1075c = new e();
                }
                this.f1076d = new f(this.f1075c);
            }
            C0352d c0352d = new C0352d(this);
            this.f1078f = true;
            return c0352d;
        }

        public b f(InterfaceC1299c interfaceC1299c) {
            this.f1077e = interfaceC1299c;
            return this;
        }
    }

    /* renamed from: D0.d$c */
    public final class c implements t.a {
        public c() {
        }

        @Override // D0.t.a
        public void b(C1177P c1177p) {
            C0352d.this.f1067h = new C1194q.b().v0(c1177p.f12560a).Y(c1177p.f12561b).o0("video/raw").K();
            Iterator it = C0352d.this.f1066g.iterator();
            while (it.hasNext()) {
                ((InterfaceC0015d) it.next()).b(C0352d.this, c1177p);
            }
        }

        @Override // D0.t.a
        public void c(long j7, long j8, long j9, boolean z7) {
            if (z7 && C0352d.this.f1070k != null) {
                Iterator it = C0352d.this.f1066g.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0015d) it.next()).d(C0352d.this);
                }
            }
            if (C0352d.this.f1068i != null) {
                C0352d.this.f1068i.k(j8, C0352d.this.f1065f.c(), C0352d.this.f1067h == null ? new C1194q.b().K() : C0352d.this.f1067h, null);
            }
            C0352d.q(C0352d.this);
            android.support.v4.media.a.a(AbstractC1297a.h(null));
            throw null;
        }

        @Override // D0.t.a
        public void d() {
            Iterator it = C0352d.this.f1066g.iterator();
            while (it.hasNext()) {
                ((InterfaceC0015d) it.next()).a(C0352d.this);
            }
            C0352d.q(C0352d.this);
            android.support.v4.media.a.a(AbstractC1297a.h(null));
            throw null;
        }
    }

    /* renamed from: D0.d$d, reason: collision with other inner class name */
    public interface InterfaceC0015d {
        void a(C0352d c0352d);

        void b(C0352d c0352d, C1177P c1177p);

        void d(C0352d c0352d);
    }

    /* renamed from: D0.d$e */
    public static final class e implements InterfaceC1175N.a {

        /* renamed from: a, reason: collision with root package name */
        public static final W2.s f1080a = W2.t.a(new W2.s() { // from class: D0.e
            @Override // W2.s
            public final Object get() {
                InterfaceC1175N.a b7;
                b7 = C0352d.e.b();
                return b7;
            }
        });

        public e() {
        }

        public static /* synthetic */ InterfaceC1175N.a b() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (InterfaceC1175N.a) AbstractC1297a.e(cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]));
            } catch (Exception e7) {
                throw new IllegalStateException(e7);
            }
        }
    }

    /* renamed from: D0.d$f */
    public static final class f implements InterfaceC1167F.a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1175N.a f1081a;

        public f(InterfaceC1175N.a aVar) {
            this.f1081a = aVar;
        }

        @Override // d0.InterfaceC1167F.a
        public InterfaceC1167F a(Context context, C1185h c1185h, InterfaceC1188k interfaceC1188k, InterfaceC1176O interfaceC1176O, Executor executor, List list, long j7) {
            Constructor<?> constructor;
            Object[] objArr;
            try {
                constructor = Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(InterfaceC1175N.a.class);
                objArr = new Object[1];
            } catch (Exception e7) {
                e = e7;
            }
            try {
                objArr[0] = this.f1081a;
                ((InterfaceC1167F.a) constructor.newInstance(objArr)).a(context, c1185h, interfaceC1188k, interfaceC1176O, executor, list, j7);
                return null;
            } catch (Exception e8) {
                e = e8;
                throw C1174M.a(e);
            }
        }
    }

    /* renamed from: D0.d$g */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public static Constructor f1082a;

        /* renamed from: b, reason: collision with root package name */
        public static Method f1083b;

        /* renamed from: c, reason: collision with root package name */
        public static Method f1084c;

        public static InterfaceC1191n a(float f7) {
            try {
                b();
                Object newInstance = f1082a.newInstance(new Object[0]);
                f1083b.invoke(newInstance, Float.valueOf(f7));
                android.support.v4.media.a.a(AbstractC1297a.e(f1084c.invoke(newInstance, new Object[0])));
                return null;
            } catch (Exception e7) {
                throw new IllegalStateException(e7);
            }
        }

        public static void b() {
            if (f1082a == null || f1083b == null || f1084c == null) {
                Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                f1082a = cls.getConstructor(new Class[0]);
                f1083b = cls.getMethod("setRotationDegrees", Float.TYPE);
                f1084c = cls.getMethod("build", new Class[0]);
            }
        }
    }

    /* renamed from: D0.d$h */
    public final class h implements F, InterfaceC0015d {

        /* renamed from: a, reason: collision with root package name */
        public final Context f1085a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1086b;

        /* renamed from: d, reason: collision with root package name */
        public C1194q f1088d;

        /* renamed from: e, reason: collision with root package name */
        public int f1089e;

        /* renamed from: f, reason: collision with root package name */
        public long f1090f;

        /* renamed from: g, reason: collision with root package name */
        public long f1091g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f1092h;

        /* renamed from: k, reason: collision with root package name */
        public boolean f1095k;

        /* renamed from: l, reason: collision with root package name */
        public long f1096l;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f1087c = new ArrayList();

        /* renamed from: i, reason: collision with root package name */
        public long f1093i = -9223372036854775807L;

        /* renamed from: j, reason: collision with root package name */
        public long f1094j = -9223372036854775807L;

        /* renamed from: m, reason: collision with root package name */
        public F.a f1097m = F.a.f1055a;

        /* renamed from: n, reason: collision with root package name */
        public Executor f1098n = C0352d.f1059n;

        public h(Context context) {
            this.f1085a = context;
            this.f1086b = M.b0(context);
        }

        @Override // D0.F
        public void A(boolean z7) {
            if (J()) {
                throw null;
            }
            this.f1095k = false;
            this.f1093i = -9223372036854775807L;
            this.f1094j = -9223372036854775807L;
            C0352d.this.w();
            if (z7) {
                C0352d.this.f1062c.m();
            }
        }

        @Override // D0.F
        public void B() {
            C0352d.this.f1062c.l();
        }

        @Override // D0.F
        public void C(List list) {
            if (this.f1087c.equals(list)) {
                return;
            }
            o(list);
            n();
        }

        @Override // D0.F
        public void D(long j7, long j8) {
            this.f1092h |= (this.f1090f == j7 && this.f1091g == j8) ? false : true;
            this.f1090f = j7;
            this.f1091g = j8;
        }

        @Override // D0.F
        public boolean E() {
            return M.B0(this.f1085a);
        }

        @Override // D0.F
        public void F(F.a aVar, Executor executor) {
            this.f1097m = aVar;
            this.f1098n = executor;
        }

        @Override // D0.F
        public void G(int i7, C1194q c1194q) {
            int i8;
            AbstractC1297a.f(J());
            if (i7 != 1 && i7 != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i7);
            }
            C0352d.this.f1062c.p(c1194q.f12734v);
            if (i7 == 1 && M.f14261a < 21 && (i8 = c1194q.f12735w) != -1 && i8 != 0) {
                g.a(i8);
            }
            this.f1089e = i7;
            this.f1088d = c1194q;
            if (this.f1095k) {
                AbstractC1297a.f(this.f1094j != -9223372036854775807L);
                this.f1096l = this.f1094j;
            } else {
                n();
                this.f1095k = true;
                this.f1096l = -9223372036854775807L;
            }
        }

        @Override // D0.F
        public void H(C1194q c1194q) {
            AbstractC1297a.f(!J());
            C0352d.t(C0352d.this, c1194q);
        }

        @Override // D0.F
        public void I(Surface surface, C1295A c1295a) {
            C0352d.this.H(surface, c1295a);
        }

        @Override // D0.F
        public boolean J() {
            return false;
        }

        @Override // D0.F
        public void K(boolean z7) {
            C0352d.this.f1062c.h(z7);
        }

        @Override // D0.F
        public void L() {
            C0352d.this.f1062c.g();
        }

        @Override // D0.C0352d.InterfaceC0015d
        public void a(C0352d c0352d) {
            final F.a aVar = this.f1097m;
            this.f1098n.execute(new Runnable() { // from class: D0.g
                @Override // java.lang.Runnable
                public final void run() {
                    C0352d.h.this.l(aVar);
                }
            });
        }

        @Override // D0.C0352d.InterfaceC0015d
        public void b(C0352d c0352d, final C1177P c1177p) {
            final F.a aVar = this.f1097m;
            this.f1098n.execute(new Runnable() { // from class: D0.f
                @Override // java.lang.Runnable
                public final void run() {
                    C0352d.h.this.m(aVar, c1177p);
                }
            });
        }

        @Override // D0.F
        public boolean c() {
            if (J()) {
                long j7 = this.f1093i;
                if (j7 != -9223372036854775807L && C0352d.this.z(j7)) {
                    return true;
                }
            }
            return false;
        }

        @Override // D0.C0352d.InterfaceC0015d
        public void d(C0352d c0352d) {
            final F.a aVar = this.f1097m;
            this.f1098n.execute(new Runnable() { // from class: D0.h
                @Override // java.lang.Runnable
                public final void run() {
                    C0352d.h.this.k(aVar);
                }
            });
        }

        @Override // D0.F
        public boolean e() {
            return J() && C0352d.this.C();
        }

        @Override // D0.F
        public void f(long j7, long j8) {
            try {
                C0352d.this.G(j7, j8);
            } catch (C1438u e7) {
                C1194q c1194q = this.f1088d;
                if (c1194q == null) {
                    c1194q = new C1194q.b().K();
                }
                throw new F.b(e7, c1194q);
            }
        }

        @Override // D0.F
        public void j() {
            C0352d.this.f1062c.a();
        }

        public final /* synthetic */ void k(F.a aVar) {
            aVar.a(this);
        }

        public final /* synthetic */ void l(F.a aVar) {
            aVar.b((F) AbstractC1297a.h(this));
        }

        public final /* synthetic */ void m(F.a aVar, C1177P c1177p) {
            aVar.c(this, c1177p);
        }

        public final void n() {
            if (this.f1088d == null) {
                return;
            }
            new ArrayList().addAll(this.f1087c);
            C1194q c1194q = (C1194q) AbstractC1297a.e(this.f1088d);
            android.support.v4.media.a.a(AbstractC1297a.h(null));
            new C1195r.b(C0352d.y(c1194q.f12701A), c1194q.f12732t, c1194q.f12733u).b(c1194q.f12736x).a();
            throw null;
        }

        public void o(List list) {
            this.f1087c.clear();
            this.f1087c.addAll(list);
        }

        @Override // D0.F
        public void release() {
            C0352d.this.F();
        }

        @Override // D0.F
        public void u(float f7) {
            C0352d.this.I(f7);
        }

        @Override // D0.F
        public void v() {
            C0352d.this.v();
        }

        @Override // D0.F
        public long w(long j7, boolean z7) {
            AbstractC1297a.f(J());
            AbstractC1297a.f(this.f1086b != -1);
            long j8 = this.f1096l;
            if (j8 != -9223372036854775807L) {
                if (!C0352d.this.z(j8)) {
                    return -9223372036854775807L;
                }
                n();
                this.f1096l = -9223372036854775807L;
            }
            android.support.v4.media.a.a(AbstractC1297a.h(null));
            throw null;
        }

        @Override // D0.F
        public Surface x() {
            AbstractC1297a.f(J());
            android.support.v4.media.a.a(AbstractC1297a.h(null));
            throw null;
        }

        @Override // D0.F
        public void y() {
            C0352d.this.f1062c.k();
        }

        @Override // D0.F
        public void z(p pVar) {
            C0352d.this.J(pVar);
        }
    }

    public C0352d(b bVar) {
        Context context = bVar.f1073a;
        this.f1060a = context;
        h hVar = new h(context);
        this.f1061b = hVar;
        InterfaceC1299c interfaceC1299c = bVar.f1077e;
        this.f1065f = interfaceC1299c;
        q qVar = bVar.f1074b;
        this.f1062c = qVar;
        qVar.o(interfaceC1299c);
        this.f1063d = new t(new c(), qVar);
        this.f1064e = (InterfaceC1167F.a) AbstractC1297a.h(bVar.f1076d);
        this.f1066g = new CopyOnWriteArraySet();
        this.f1072m = 0;
        u(hVar);
    }

    public static /* synthetic */ InterfaceC1167F q(C0352d c0352d) {
        c0352d.getClass();
        return null;
    }

    public static /* synthetic */ InterfaceC1175N t(C0352d c0352d, C1194q c1194q) {
        c0352d.A(c1194q);
        return null;
    }

    public static C1185h y(C1185h c1185h) {
        return (c1185h == null || !c1185h.g()) ? C1185h.f12620h : c1185h;
    }

    public final InterfaceC1175N A(C1194q c1194q) {
        AbstractC1297a.f(this.f1072m == 0);
        C1185h y7 = y(c1194q.f12701A);
        if (y7.f12630c == 7 && M.f14261a < 34) {
            y7 = y7.a().e(6).a();
        }
        C1185h c1185h = y7;
        final InterfaceC1307k e7 = this.f1065f.e((Looper) AbstractC1297a.h(Looper.myLooper()), null);
        this.f1069j = e7;
        try {
            InterfaceC1167F.a aVar = this.f1064e;
            Context context = this.f1060a;
            InterfaceC1188k interfaceC1188k = InterfaceC1188k.f12641a;
            Objects.requireNonNull(e7);
            aVar.a(context, c1185h, interfaceC1188k, this, new Executor() { // from class: D0.a
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    InterfaceC1307k.this.j(runnable);
                }
            }, AbstractC0703v.Y(), 0L);
            Pair pair = this.f1070k;
            if (pair == null) {
                throw null;
            }
            Surface surface = (Surface) pair.first;
            C1295A c1295a = (C1295A) pair.second;
            E(surface, c1295a.b(), c1295a.a());
            throw null;
        } catch (C1174M e8) {
            throw new F.b(e8, c1194q);
        }
    }

    public final boolean B() {
        return this.f1072m == 1;
    }

    public final boolean C() {
        return this.f1071l == 0 && this.f1063d.e();
    }

    public void F() {
        if (this.f1072m == 2) {
            return;
        }
        InterfaceC1307k interfaceC1307k = this.f1069j;
        if (interfaceC1307k != null) {
            interfaceC1307k.h(null);
        }
        this.f1070k = null;
        this.f1072m = 2;
    }

    public void G(long j7, long j8) {
        if (this.f1071l == 0) {
            this.f1063d.h(j7, j8);
        }
    }

    public void H(Surface surface, C1295A c1295a) {
        Pair pair = this.f1070k;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C1295A) this.f1070k.second).equals(c1295a)) {
            return;
        }
        this.f1070k = Pair.create(surface, c1295a);
        E(surface, c1295a.b(), c1295a.a());
    }

    public final void I(float f7) {
        this.f1063d.j(f7);
    }

    public final void J(p pVar) {
        this.f1068i = pVar;
    }

    @Override // D0.G
    public q a() {
        return this.f1062c;
    }

    @Override // D0.G
    public F b() {
        return this.f1061b;
    }

    public void u(InterfaceC0015d interfaceC0015d) {
        this.f1066g.add(interfaceC0015d);
    }

    public void v() {
        C1295A c1295a = C1295A.f14244c;
        E(null, c1295a.b(), c1295a.a());
        this.f1070k = null;
    }

    public final void w() {
        if (B()) {
            this.f1071l++;
            this.f1063d.b();
            ((InterfaceC1307k) AbstractC1297a.h(this.f1069j)).j(new Runnable() { // from class: D0.c
                @Override // java.lang.Runnable
                public final void run() {
                    C0352d.this.x();
                }
            });
        }
    }

    public final void x() {
        int i7 = this.f1071l - 1;
        this.f1071l = i7;
        if (i7 > 0) {
            return;
        }
        if (i7 < 0) {
            throw new IllegalStateException(String.valueOf(this.f1071l));
        }
        this.f1063d.b();
    }

    public final boolean z(long j7) {
        return this.f1071l == 0 && this.f1063d.d(j7);
    }

    public static /* synthetic */ void D(Runnable runnable) {
    }

    public final void E(Surface surface, int i7, int i8) {
    }
}
