package a1;

import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.L;
import F0.M;
import F0.T;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.M;
import g0.z;

/* renamed from: a1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0741i {

    /* renamed from: b, reason: collision with root package name */
    public T f8046b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0374t f8047c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0739g f8048d;

    /* renamed from: e, reason: collision with root package name */
    public long f8049e;

    /* renamed from: f, reason: collision with root package name */
    public long f8050f;

    /* renamed from: g, reason: collision with root package name */
    public long f8051g;

    /* renamed from: h, reason: collision with root package name */
    public int f8052h;

    /* renamed from: i, reason: collision with root package name */
    public int f8053i;

    /* renamed from: k, reason: collision with root package name */
    public long f8055k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8056l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8057m;

    /* renamed from: a, reason: collision with root package name */
    public final C0737e f8045a = new C0737e();

    /* renamed from: j, reason: collision with root package name */
    public b f8054j = new b();

    /* renamed from: a1.i$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public C1194q f8058a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC0739g f8059b;
    }

    public final void a() {
        AbstractC1297a.h(this.f8046b);
        M.i(this.f8047c);
    }

    public long b(long j7) {
        return (j7 * 1000000) / this.f8053i;
    }

    public long c(long j7) {
        return (this.f8053i * j7) / 1000000;
    }

    public void d(InterfaceC0374t interfaceC0374t, T t7) {
        this.f8047c = interfaceC0374t;
        this.f8046b = t7;
        l(true);
    }

    public void e(long j7) {
        this.f8051g = j7;
    }

    public abstract long f(z zVar);

    public final int g(InterfaceC0373s interfaceC0373s, L l7) {
        a();
        int i7 = this.f8052h;
        if (i7 == 0) {
            return j(interfaceC0373s);
        }
        if (i7 == 1) {
            interfaceC0373s.i((int) this.f8050f);
            this.f8052h = 2;
            return 0;
        }
        if (i7 == 2) {
            M.i(this.f8048d);
            return k(interfaceC0373s, l7);
        }
        if (i7 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    public final boolean h(InterfaceC0373s interfaceC0373s) {
        while (this.f8045a.d(interfaceC0373s)) {
            this.f8055k = interfaceC0373s.p() - this.f8050f;
            if (!i(this.f8045a.c(), this.f8050f, this.f8054j)) {
                return true;
            }
            this.f8050f = interfaceC0373s.p();
        }
        this.f8052h = 3;
        return false;
    }

    public abstract boolean i(z zVar, long j7, b bVar);

    public final int j(InterfaceC0373s interfaceC0373s) {
        if (!h(interfaceC0373s)) {
            return -1;
        }
        C1194q c1194q = this.f8054j.f8058a;
        this.f8053i = c1194q.f12703C;
        if (!this.f8057m) {
            this.f8046b.d(c1194q);
            this.f8057m = true;
        }
        InterfaceC0739g interfaceC0739g = this.f8054j.f8059b;
        if (interfaceC0739g == null) {
            if (interfaceC0373s.a() != -1) {
                C0738f b7 = this.f8045a.b();
                this.f8048d = new C0733a(this, this.f8050f, interfaceC0373s.a(), b7.f8038h + b7.f8039i, b7.f8033c, (b7.f8032b & 4) != 0);
                this.f8052h = 2;
                this.f8045a.f();
                return 0;
            }
            interfaceC0739g = new c();
        }
        this.f8048d = interfaceC0739g;
        this.f8052h = 2;
        this.f8045a.f();
        return 0;
    }

    public final int k(InterfaceC0373s interfaceC0373s, L l7) {
        long c7 = this.f8048d.c(interfaceC0373s);
        if (c7 >= 0) {
            l7.f1788a = c7;
            return 1;
        }
        if (c7 < -1) {
            e(-(c7 + 2));
        }
        if (!this.f8056l) {
            this.f8047c.e((F0.M) AbstractC1297a.h(this.f8048d.a()));
            this.f8056l = true;
        }
        if (this.f8055k <= 0 && !this.f8045a.d(interfaceC0373s)) {
            this.f8052h = 3;
            return -1;
        }
        this.f8055k = 0L;
        z c8 = this.f8045a.c();
        long f7 = f(c8);
        if (f7 >= 0) {
            long j7 = this.f8051g;
            if (j7 + f7 >= this.f8049e) {
                long b7 = b(j7);
                this.f8046b.e(c8, c8.g());
                this.f8046b.b(b7, 1, c8.g(), 0, null);
                this.f8049e = -1L;
            }
        }
        this.f8051g += f7;
        return 0;
    }

    public void l(boolean z7) {
        int i7;
        if (z7) {
            this.f8054j = new b();
            this.f8050f = 0L;
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.f8052h = i7;
        this.f8049e = -1L;
        this.f8051g = 0L;
    }

    public final void m(long j7, long j8) {
        this.f8045a.e();
        if (j7 == 0) {
            l(!this.f8056l);
        } else if (this.f8052h != 0) {
            this.f8049e = c(j8);
            ((InterfaceC0739g) M.i(this.f8048d)).b(this.f8049e);
            this.f8052h = 2;
        }
    }

    /* renamed from: a1.i$c */
    public static final class c implements InterfaceC0739g {
        public c() {
        }

        @Override // a1.InterfaceC0739g
        public F0.M a() {
            return new M.b(-9223372036854775807L);
        }

        @Override // a1.InterfaceC0739g
        public long c(InterfaceC0373s interfaceC0373s) {
            return -1L;
        }

        @Override // a1.InterfaceC0739g
        public void b(long j7) {
        }
    }
}
