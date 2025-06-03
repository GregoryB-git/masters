package Z0;

import F0.InterfaceC0373s;
import g0.z;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public d f7801a;

    /* renamed from: b, reason: collision with root package name */
    public long f7802b;

    /* renamed from: c, reason: collision with root package name */
    public long f7803c;

    /* renamed from: d, reason: collision with root package name */
    public long f7804d;

    /* renamed from: e, reason: collision with root package name */
    public int f7805e;

    /* renamed from: f, reason: collision with root package name */
    public int f7806f;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7812l;

    /* renamed from: n, reason: collision with root package name */
    public t f7814n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7816p;

    /* renamed from: q, reason: collision with root package name */
    public long f7817q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7818r;

    /* renamed from: g, reason: collision with root package name */
    public long[] f7807g = new long[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f7808h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public int[] f7809i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public long[] f7810j = new long[0];

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f7811k = new boolean[0];

    /* renamed from: m, reason: collision with root package name */
    public boolean[] f7813m = new boolean[0];

    /* renamed from: o, reason: collision with root package name */
    public final z f7815o = new z();

    public void a(InterfaceC0373s interfaceC0373s) {
        interfaceC0373s.readFully(this.f7815o.e(), 0, this.f7815o.g());
        this.f7815o.T(0);
        this.f7816p = false;
    }

    public void b(z zVar) {
        zVar.l(this.f7815o.e(), 0, this.f7815o.g());
        this.f7815o.T(0);
        this.f7816p = false;
    }

    public long c(int i7) {
        return this.f7810j[i7];
    }

    public void d(int i7) {
        this.f7815o.P(i7);
        this.f7812l = true;
        this.f7816p = true;
    }

    public void e(int i7, int i8) {
        this.f7805e = i7;
        this.f7806f = i8;
        if (this.f7808h.length < i7) {
            this.f7807g = new long[i7];
            this.f7808h = new int[i7];
        }
        if (this.f7809i.length < i8) {
            int i9 = (i8 * 125) / 100;
            this.f7809i = new int[i9];
            this.f7810j = new long[i9];
            this.f7811k = new boolean[i9];
            this.f7813m = new boolean[i9];
        }
    }

    public void f() {
        this.f7805e = 0;
        this.f7817q = 0L;
        this.f7818r = false;
        this.f7812l = false;
        this.f7816p = false;
        this.f7814n = null;
    }

    public boolean g(int i7) {
        return this.f7812l && this.f7813m[i7];
    }
}
