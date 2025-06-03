package d5;

import android.net.Uri;
import d2.h0;
import d5.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o7.t;
import v3.i0;
import v5.e0;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f3496a;

    /* renamed from: b, reason: collision with root package name */
    public final t<d5.b> f3497b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3498c;

    /* renamed from: d, reason: collision with root package name */
    public final List<e> f3499d;

    /* renamed from: e, reason: collision with root package name */
    public final List<e> f3500e;
    public final List<e> f;

    /* renamed from: o, reason: collision with root package name */
    public final i f3501o;

    public static class a extends j implements c5.c {

        /* renamed from: p, reason: collision with root package name */
        public final k.a f3502p;

        public a(long j10, i0 i0Var, t tVar, k.a aVar, ArrayList arrayList, List list, List list2) {
            super(i0Var, tVar, aVar, arrayList, list, list2);
            this.f3502p = aVar;
        }

        @Override // c5.c
        public final long a(long j10) {
            return this.f3502p.g(j10);
        }

        @Override // c5.c
        public final long b(long j10, long j11) {
            return this.f3502p.e(j10, j11);
        }

        @Override // d5.j
        public final String c() {
            return null;
        }

        @Override // c5.c
        public final long d(long j10, long j11) {
            return this.f3502p.c(j10, j11);
        }

        @Override // c5.c
        public final long e(long j10, long j11) {
            k.a aVar = this.f3502p;
            if (aVar.f != null) {
                return -9223372036854775807L;
            }
            long b10 = aVar.b(j10, j11) + aVar.c(j10, j11);
            return (aVar.e(b10, j10) + aVar.g(b10)) - aVar.f3513i;
        }

        @Override // c5.c
        public final i f(long j10) {
            return this.f3502p.h(j10, this);
        }

        @Override // c5.c
        public final long g(long j10, long j11) {
            return this.f3502p.f(j10, j11);
        }

        @Override // c5.c
        public final boolean h() {
            return this.f3502p.i();
        }

        @Override // c5.c
        public final long i() {
            return this.f3502p.f3509d;
        }

        @Override // c5.c
        public final long j(long j10) {
            return this.f3502p.d(j10);
        }

        @Override // c5.c
        public final long k(long j10, long j11) {
            return this.f3502p.b(j10, j11);
        }

        @Override // d5.j
        public final c5.c l() {
            return this;
        }

        @Override // d5.j
        public final i m() {
            return null;
        }
    }

    public static class b extends j {

        /* renamed from: p, reason: collision with root package name */
        public final String f3503p;

        /* renamed from: q, reason: collision with root package name */
        public final i f3504q;

        /* renamed from: r, reason: collision with root package name */
        public final h0 f3505r;

        /* JADX WARN: Multi-variable type inference failed */
        public b(long j10, i0 i0Var, t tVar, k.e eVar, ArrayList arrayList, List list, List list2) {
            super(i0Var, tVar, eVar, arrayList, list, list2);
            Uri.parse(((d5.b) tVar.get(0)).f3447a);
            long j11 = eVar.f3521e;
            i iVar = j11 <= 0 ? null : new i(eVar.f3520d, j11, null);
            this.f3504q = iVar;
            this.f3503p = null;
            this.f3505r = iVar == null ? new h0(new i(0L, -1L, null), 2) : null;
        }

        @Override // d5.j
        public final String c() {
            return this.f3503p;
        }

        @Override // d5.j
        public final c5.c l() {
            return this.f3505r;
        }

        @Override // d5.j
        public final i m() {
            return this.f3504q;
        }
    }

    public j() {
        throw null;
    }

    public j(i0 i0Var, t tVar, k kVar, ArrayList arrayList, List list, List list2) {
        x6.b.q(!tVar.isEmpty());
        this.f3496a = i0Var;
        this.f3497b = t.p(tVar);
        this.f3499d = Collections.unmodifiableList(arrayList);
        this.f3500e = list;
        this.f = list2;
        this.f3501o = kVar.a(this);
        this.f3498c = e0.O(kVar.f3508c, 1000000L, kVar.f3507b);
    }

    public abstract String c();

    public abstract c5.c l();

    public abstract i m();
}
