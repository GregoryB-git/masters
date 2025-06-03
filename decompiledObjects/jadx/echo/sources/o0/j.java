package o0;

import X2.AbstractC0703v;
import android.net.Uri;
import d0.C1194q;
import g0.AbstractC1297a;
import java.util.Collections;
import java.util.List;
import o0.k;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f18131a;

    /* renamed from: b, reason: collision with root package name */
    public final C1194q f18132b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0703v f18133c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18134d;

    /* renamed from: e, reason: collision with root package name */
    public final List f18135e;

    /* renamed from: f, reason: collision with root package name */
    public final List f18136f;

    /* renamed from: g, reason: collision with root package name */
    public final List f18137g;

    /* renamed from: h, reason: collision with root package name */
    public final i f18138h;

    public static class c extends j {

        /* renamed from: i, reason: collision with root package name */
        public final Uri f18140i;

        /* renamed from: j, reason: collision with root package name */
        public final long f18141j;

        /* renamed from: k, reason: collision with root package name */
        public final String f18142k;

        /* renamed from: l, reason: collision with root package name */
        public final i f18143l;

        /* renamed from: m, reason: collision with root package name */
        public final m f18144m;

        public c(long j7, C1194q c1194q, List list, k.e eVar, List list2, List list3, List list4, String str, long j8) {
            super(j7, c1194q, list, eVar, list2, list3, list4);
            this.f18140i = Uri.parse(((C1751b) list.get(0)).f18078a);
            i c7 = eVar.c();
            this.f18143l = c7;
            this.f18142k = str;
            this.f18141j = j8;
            this.f18144m = c7 != null ? null : new m(new i(null, 0L, j8));
        }

        @Override // o0.j
        public String k() {
            return this.f18142k;
        }

        @Override // o0.j
        public n0.g l() {
            return this.f18144m;
        }

        @Override // o0.j
        public i m() {
            return this.f18143l;
        }
    }

    public j(long j7, C1194q c1194q, List list, k kVar, List list2, List list3, List list4) {
        AbstractC1297a.a(!list.isEmpty());
        this.f18131a = j7;
        this.f18132b = c1194q;
        this.f18133c = AbstractC0703v.U(list);
        this.f18135e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f18136f = list3;
        this.f18137g = list4;
        this.f18138h = kVar.a(this);
        this.f18134d = kVar.b();
    }

    public static j o(long j7, C1194q c1194q, List list, k kVar, List list2, List list3, List list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j7, c1194q, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j7, c1194q, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String k();

    public abstract n0.g l();

    public abstract i m();

    public i n() {
        return this.f18138h;
    }

    public static class b extends j implements n0.g {

        /* renamed from: i, reason: collision with root package name */
        public final k.a f18139i;

        public b(long j7, C1194q c1194q, List list, k.a aVar, List list2, List list3, List list4) {
            super(j7, c1194q, list, aVar, list2, list3, list4);
            this.f18139i = aVar;
        }

        @Override // n0.g
        public long a(long j7, long j8) {
            return this.f18139i.i(j7, j8);
        }

        @Override // n0.g
        public long b(long j7, long j8) {
            return this.f18139i.h(j7, j8);
        }

        @Override // n0.g
        public long c(long j7) {
            return this.f18139i.j(j7);
        }

        @Override // n0.g
        public long d(long j7, long j8) {
            return this.f18139i.d(j7, j8);
        }

        @Override // n0.g
        public long e(long j7, long j8) {
            return this.f18139i.f(j7, j8);
        }

        @Override // n0.g
        public i f(long j7) {
            return this.f18139i.k(this, j7);
        }

        @Override // n0.g
        public boolean g() {
            return this.f18139i.l();
        }

        @Override // n0.g
        public long h() {
            return this.f18139i.e();
        }

        @Override // n0.g
        public long i(long j7) {
            return this.f18139i.g(j7);
        }

        @Override // n0.g
        public long j(long j7, long j8) {
            return this.f18139i.c(j7, j8);
        }

        @Override // o0.j
        public String k() {
            return null;
        }

        @Override // o0.j
        public i m() {
            return null;
        }

        @Override // o0.j
        public n0.g l() {
            return this;
        }
    }
}
