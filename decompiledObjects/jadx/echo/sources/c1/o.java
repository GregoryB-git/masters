package c1;

import F0.AbstractC0372q;
import F0.H;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.L;
import F0.T;
import c1.t;
import d0.C1162A;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.InterfaceC1303g;
import g0.M;
import g0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class o implements F0.r {

    /* renamed from: a, reason: collision with root package name */
    public final t f10029a;

    /* renamed from: c, reason: collision with root package name */
    public final C1194q f10031c;

    /* renamed from: g, reason: collision with root package name */
    public T f10035g;

    /* renamed from: h, reason: collision with root package name */
    public int f10036h;

    /* renamed from: b, reason: collision with root package name */
    public final C0815d f10030b = new C0815d();

    /* renamed from: f, reason: collision with root package name */
    public byte[] f10034f = M.f14266f;

    /* renamed from: e, reason: collision with root package name */
    public final z f10033e = new z();

    /* renamed from: d, reason: collision with root package name */
    public final List f10032d = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f10037i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long[] f10038j = M.f14267g;

    /* renamed from: k, reason: collision with root package name */
    public long f10039k = -9223372036854775807L;

    public static class b implements Comparable {

        /* renamed from: o, reason: collision with root package name */
        public final long f10040o;

        /* renamed from: p, reason: collision with root package name */
        public final byte[] f10041p;

        public b(long j7, byte[] bArr) {
            this.f10040o = j7;
            this.f10041p = bArr;
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f10040o, bVar.f10040o);
        }
    }

    public o(t tVar, C1194q c1194q) {
        this.f10029a = tVar;
        this.f10031c = c1194q.a().o0("application/x-media3-cues").O(c1194q.f12726n).S(tVar.d()).K();
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        int i7 = this.f10037i;
        AbstractC1297a.f((i7 == 0 || i7 == 5) ? false : true);
        this.f10039k = j8;
        if (this.f10037i == 2) {
            this.f10037i = 1;
        }
        if (this.f10037i == 4) {
            this.f10037i = 3;
        }
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        AbstractC1297a.f(this.f10037i == 0);
        T a7 = interfaceC0374t.a(0, 3);
        this.f10035g = a7;
        a7.d(this.f10031c);
        interfaceC0374t.j();
        interfaceC0374t.e(new H(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f10037i = 1;
    }

    @Override // F0.r
    public /* synthetic */ F0.r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        return true;
    }

    public final /* synthetic */ void f(C0816e c0816e) {
        b bVar = new b(c0816e.f10020b, this.f10030b.a(c0816e.f10019a, c0816e.f10021c));
        this.f10032d.add(bVar);
        long j7 = this.f10039k;
        if (j7 == -9223372036854775807L || c0816e.f10020b >= j7) {
            m(bVar);
        }
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    public final void h() {
        try {
            long j7 = this.f10039k;
            this.f10029a.c(this.f10034f, 0, this.f10036h, j7 != -9223372036854775807L ? t.b.c(j7) : t.b.b(), new InterfaceC1303g() { // from class: c1.n
                @Override // g0.InterfaceC1303g
                public final void accept(Object obj) {
                    o.this.f((C0816e) obj);
                }
            });
            Collections.sort(this.f10032d);
            this.f10038j = new long[this.f10032d.size()];
            for (int i7 = 0; i7 < this.f10032d.size(); i7++) {
                this.f10038j[i7] = ((b) this.f10032d.get(i7)).f10040o;
            }
            this.f10034f = M.f14266f;
        } catch (RuntimeException e7) {
            throw C1162A.a("SubtitleParser failed.", e7);
        }
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        int i7 = this.f10037i;
        AbstractC1297a.f((i7 == 0 || i7 == 5) ? false : true);
        if (this.f10037i == 1) {
            int d7 = interfaceC0373s.a() != -1 ? a3.f.d(interfaceC0373s.a()) : 1024;
            if (d7 > this.f10034f.length) {
                this.f10034f = new byte[d7];
            }
            this.f10036h = 0;
            this.f10037i = 2;
        }
        if (this.f10037i == 2 && j(interfaceC0373s)) {
            h();
            this.f10037i = 4;
        }
        if (this.f10037i == 3 && k(interfaceC0373s)) {
            l();
            this.f10037i = 4;
        }
        return this.f10037i == 4 ? -1 : 0;
    }

    public final boolean j(InterfaceC0373s interfaceC0373s) {
        byte[] bArr = this.f10034f;
        if (bArr.length == this.f10036h) {
            this.f10034f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f10034f;
        int i7 = this.f10036h;
        int read = interfaceC0373s.read(bArr2, i7, bArr2.length - i7);
        if (read != -1) {
            this.f10036h += read;
        }
        long a7 = interfaceC0373s.a();
        return (a7 != -1 && ((long) this.f10036h) == a7) || read == -1;
    }

    public final boolean k(InterfaceC0373s interfaceC0373s) {
        return interfaceC0373s.b((interfaceC0373s.a() > (-1L) ? 1 : (interfaceC0373s.a() == (-1L) ? 0 : -1)) != 0 ? a3.f.d(interfaceC0373s.a()) : 1024) == -1;
    }

    public final void l() {
        long j7 = this.f10039k;
        for (int h7 = j7 == -9223372036854775807L ? 0 : M.h(this.f10038j, j7, true, true); h7 < this.f10032d.size(); h7++) {
            m((b) this.f10032d.get(h7));
        }
    }

    public final void m(b bVar) {
        AbstractC1297a.h(this.f10035g);
        int length = bVar.f10041p.length;
        this.f10033e.Q(bVar.f10041p);
        this.f10035g.e(this.f10033e, length);
        this.f10035g.b(bVar.f10040o, 1, length, 0, null);
    }

    @Override // F0.r
    public void release() {
        if (this.f10037i == 5) {
            return;
        }
        this.f10029a.b();
        this.f10037i = 5;
    }
}
