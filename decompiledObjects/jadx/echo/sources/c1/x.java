package c1;

import F0.S;
import F0.T;
import c1.t;
import d0.AbstractC1203z;
import d0.C1194q;
import d0.InterfaceC1186i;
import g0.AbstractC1297a;
import g0.InterfaceC1303g;
import g0.M;
import g0.z;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class x implements T {

    /* renamed from: a, reason: collision with root package name */
    public final T f10059a;

    /* renamed from: b, reason: collision with root package name */
    public final t.a f10060b;

    /* renamed from: h, reason: collision with root package name */
    public t f10066h;

    /* renamed from: i, reason: collision with root package name */
    public C1194q f10067i;

    /* renamed from: c, reason: collision with root package name */
    public final C0815d f10061c = new C0815d();

    /* renamed from: e, reason: collision with root package name */
    public int f10063e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f10064f = 0;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f10065g = M.f14266f;

    /* renamed from: d, reason: collision with root package name */
    public final z f10062d = new z();

    public x(T t7, t.a aVar) {
        this.f10059a = t7;
        this.f10060b = aVar;
    }

    @Override // F0.T
    public void a(z zVar, int i7, int i8) {
        if (this.f10066h == null) {
            this.f10059a.a(zVar, i7, i8);
            return;
        }
        h(i7);
        zVar.l(this.f10065g, this.f10064f, i7);
        this.f10064f += i7;
    }

    @Override // F0.T
    public void b(final long j7, final int i7, int i8, int i9, T.a aVar) {
        if (this.f10066h == null) {
            this.f10059a.b(j7, i7, i8, i9, aVar);
            return;
        }
        AbstractC1297a.b(aVar == null, "DRM on subtitles is not supported");
        int i10 = (this.f10064f - i9) - i8;
        this.f10066h.c(this.f10065g, i10, i8, t.b.b(), new InterfaceC1303g() { // from class: c1.w
            @Override // g0.InterfaceC1303g
            public final void accept(Object obj) {
                x.this.i(j7, i7, (C0816e) obj);
            }
        });
        int i11 = i10 + i8;
        this.f10063e = i11;
        if (i11 == this.f10064f) {
            this.f10063e = 0;
            this.f10064f = 0;
        }
    }

    @Override // F0.T
    public int c(InterfaceC1186i interfaceC1186i, int i7, boolean z7, int i8) {
        if (this.f10066h == null) {
            return this.f10059a.c(interfaceC1186i, i7, z7, i8);
        }
        h(i7);
        int read = interfaceC1186i.read(this.f10065g, this.f10064f, i7);
        if (read != -1) {
            this.f10064f += read;
            return read;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // F0.T
    public void d(C1194q c1194q) {
        T t7;
        AbstractC1297a.e(c1194q.f12726n);
        AbstractC1297a.a(AbstractC1203z.k(c1194q.f12726n) == 3);
        if (!c1194q.equals(this.f10067i)) {
            this.f10067i = c1194q;
            this.f10066h = this.f10060b.a(c1194q) ? this.f10060b.b(c1194q) : null;
        }
        if (this.f10066h == null) {
            t7 = this.f10059a;
        } else {
            t7 = this.f10059a;
            c1194q = c1194q.a().o0("application/x-media3-cues").O(c1194q.f12726n).s0(Long.MAX_VALUE).S(this.f10060b.c(c1194q)).K();
        }
        t7.d(c1194q);
    }

    @Override // F0.T
    public /* synthetic */ void e(z zVar, int i7) {
        S.b(this, zVar, i7);
    }

    @Override // F0.T
    public /* synthetic */ int f(InterfaceC1186i interfaceC1186i, int i7, boolean z7) {
        return S.a(this, interfaceC1186i, i7, z7);
    }

    public final void h(int i7) {
        int length = this.f10065g.length;
        int i8 = this.f10064f;
        if (length - i8 >= i7) {
            return;
        }
        int i9 = i8 - this.f10063e;
        int max = Math.max(i9 * 2, i7 + i9);
        byte[] bArr = this.f10065g;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f10063e, bArr2, 0, i9);
        this.f10063e = 0;
        this.f10064f = i9;
        this.f10065g = bArr2;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void i(C0816e c0816e, long j7, int i7) {
        AbstractC1297a.h(this.f10067i);
        byte[] a7 = this.f10061c.a(c0816e.f10019a, c0816e.f10021c);
        this.f10062d.Q(a7);
        this.f10059a.e(this.f10062d, a7.length);
        long j8 = c0816e.f10020b;
        if (j8 == -9223372036854775807L) {
            AbstractC1297a.f(this.f10067i.f12731s == Long.MAX_VALUE);
        } else {
            long j9 = this.f10067i.f12731s;
            j7 = j9 == Long.MAX_VALUE ? j7 + j8 : j8 + j9;
        }
        this.f10059a.b(j7, i7, a7.length, 0, null);
    }

    public void k() {
        t tVar = this.f10066h;
        if (tVar != null) {
            tVar.b();
        }
    }
}
