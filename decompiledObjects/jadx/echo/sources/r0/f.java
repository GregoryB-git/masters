package r0;

import X2.AbstractC0703v;
import android.net.Uri;
import d0.C1190m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends h {

    /* renamed from: d, reason: collision with root package name */
    public final int f18950d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18951e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18952f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18953g;

    /* renamed from: h, reason: collision with root package name */
    public final long f18954h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18955i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18956j;

    /* renamed from: k, reason: collision with root package name */
    public final long f18957k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18958l;

    /* renamed from: m, reason: collision with root package name */
    public final long f18959m;

    /* renamed from: n, reason: collision with root package name */
    public final long f18960n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f18961o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f18962p;

    /* renamed from: q, reason: collision with root package name */
    public final C1190m f18963q;

    /* renamed from: r, reason: collision with root package name */
    public final List f18964r;

    /* renamed from: s, reason: collision with root package name */
    public final List f18965s;

    /* renamed from: t, reason: collision with root package name */
    public final Map f18966t;

    /* renamed from: u, reason: collision with root package name */
    public final long f18967u;

    /* renamed from: v, reason: collision with root package name */
    public final C0257f f18968v;

    public static final class b extends e {

        /* renamed from: A, reason: collision with root package name */
        public final boolean f18969A;

        /* renamed from: z, reason: collision with root package name */
        public final boolean f18970z;

        public b(String str, d dVar, long j7, int i7, long j8, C1190m c1190m, String str2, String str3, long j9, long j10, boolean z7, boolean z8, boolean z9) {
            super(str, dVar, j7, i7, j8, c1190m, str2, str3, j9, j10, z7);
            this.f18970z = z8;
            this.f18969A = z9;
        }

        public b e(long j7, int i7) {
            return new b(this.f18976o, this.f18977p, this.f18978q, i7, j7, this.f18981t, this.f18982u, this.f18983v, this.f18984w, this.f18985x, this.f18986y, this.f18970z, this.f18969A);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f18971a;

        /* renamed from: b, reason: collision with root package name */
        public final long f18972b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18973c;

        public c(Uri uri, long j7, int i7) {
            this.f18971a = uri;
            this.f18972b = j7;
            this.f18973c = i7;
        }
    }

    public static final class d extends e {

        /* renamed from: A, reason: collision with root package name */
        public final List f18974A;

        /* renamed from: z, reason: collision with root package name */
        public final String f18975z;

        public d(String str, long j7, long j8, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j7, j8, false, AbstractC0703v.Y());
        }

        public d e(long j7, int i7) {
            ArrayList arrayList = new ArrayList();
            long j8 = j7;
            for (int i8 = 0; i8 < this.f18974A.size(); i8++) {
                b bVar = (b) this.f18974A.get(i8);
                arrayList.add(bVar.e(j8, i7));
                j8 += bVar.f18978q;
            }
            return new d(this.f18976o, this.f18977p, this.f18975z, this.f18978q, i7, j7, this.f18981t, this.f18982u, this.f18983v, this.f18984w, this.f18985x, this.f18986y, arrayList);
        }

        public d(String str, d dVar, String str2, long j7, int i7, long j8, C1190m c1190m, String str3, String str4, long j9, long j10, boolean z7, List list) {
            super(str, dVar, j7, i7, j8, c1190m, str3, str4, j9, j10, z7);
            this.f18975z = str2;
            this.f18974A = AbstractC0703v.U(list);
        }
    }

    public static class e implements Comparable {

        /* renamed from: o, reason: collision with root package name */
        public final String f18976o;

        /* renamed from: p, reason: collision with root package name */
        public final d f18977p;

        /* renamed from: q, reason: collision with root package name */
        public final long f18978q;

        /* renamed from: r, reason: collision with root package name */
        public final int f18979r;

        /* renamed from: s, reason: collision with root package name */
        public final long f18980s;

        /* renamed from: t, reason: collision with root package name */
        public final C1190m f18981t;

        /* renamed from: u, reason: collision with root package name */
        public final String f18982u;

        /* renamed from: v, reason: collision with root package name */
        public final String f18983v;

        /* renamed from: w, reason: collision with root package name */
        public final long f18984w;

        /* renamed from: x, reason: collision with root package name */
        public final long f18985x;

        /* renamed from: y, reason: collision with root package name */
        public final boolean f18986y;

        public e(String str, d dVar, long j7, int i7, long j8, C1190m c1190m, String str2, String str3, long j9, long j10, boolean z7) {
            this.f18976o = str;
            this.f18977p = dVar;
            this.f18978q = j7;
            this.f18979r = i7;
            this.f18980s = j8;
            this.f18981t = c1190m;
            this.f18982u = str2;
            this.f18983v = str3;
            this.f18984w = j9;
            this.f18985x = j10;
            this.f18986y = z7;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l7) {
            if (this.f18980s > l7.longValue()) {
                return 1;
            }
            return this.f18980s < l7.longValue() ? -1 : 0;
        }
    }

    /* renamed from: r0.f$f, reason: collision with other inner class name */
    public static final class C0257f {

        /* renamed from: a, reason: collision with root package name */
        public final long f18987a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f18988b;

        /* renamed from: c, reason: collision with root package name */
        public final long f18989c;

        /* renamed from: d, reason: collision with root package name */
        public final long f18990d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f18991e;

        public C0257f(long j7, boolean z7, long j8, long j9, boolean z8) {
            this.f18987a = j7;
            this.f18988b = z7;
            this.f18989c = j8;
            this.f18990d = j9;
            this.f18991e = z8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(int r11, java.lang.String r12, java.util.List r13, long r14, boolean r16, long r17, boolean r19, int r20, long r21, int r23, long r24, long r26, boolean r28, boolean r29, boolean r30, d0.C1190m r31, java.util.List r32, java.util.List r33, r0.f.C0257f r34, java.util.Map r35) {
        /*
            r10 = this;
            r0 = r10
            r1 = r14
            r3 = r12
            r4 = r13
            r5 = r28
            r10.<init>(r12, r13, r5)
            r3 = r11
            r0.f18950d = r3
            r3 = r17
            r0.f18954h = r3
            r3 = r16
            r0.f18953g = r3
            r3 = r19
            r0.f18955i = r3
            r3 = r20
            r0.f18956j = r3
            r3 = r21
            r0.f18957k = r3
            r3 = r23
            r0.f18958l = r3
            r3 = r24
            r0.f18959m = r3
            r3 = r26
            r0.f18960n = r3
            r3 = r29
            r0.f18961o = r3
            r3 = r30
            r0.f18962p = r3
            r3 = r31
            r0.f18963q = r3
            X2.v r3 = X2.AbstractC0703v.U(r32)
            r0.f18964r = r3
            X2.v r3 = X2.AbstractC0703v.U(r33)
            r0.f18965s = r3
            X2.w r3 = X2.AbstractC0704w.c(r35)
            r0.f18966t = r3
            boolean r3 = r33.isEmpty()
            r4 = 0
            if (r3 != 0) goto L60
            java.lang.Object r3 = X2.B.d(r33)
            r0.f$b r3 = (r0.f.b) r3
        L58:
            long r6 = r3.f18980s
            long r8 = r3.f18978q
            long r6 = r6 + r8
            r0.f18967u = r6
            goto L6f
        L60:
            boolean r3 = r32.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = X2.B.d(r32)
            r0.f$d r3 = (r0.f.d) r3
            goto L58
        L6d:
            r0.f18967u = r4
        L6f:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L79
            goto L89
        L79:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            long r6 = r0.f18967u
            if (r3 < 0) goto L84
            long r6 = java.lang.Math.min(r6, r14)
            goto L89
        L84:
            long r6 = r6 + r1
            long r6 = java.lang.Math.max(r4, r6)
        L89:
            r0.f18951e = r6
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L91
            r1 = 1
            goto L92
        L91:
            r1 = 0
        L92:
            r0.f18952f = r1
            r1 = r34
            r0.f18968v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.f.<init>(int, java.lang.String, java.util.List, long, boolean, long, boolean, int, long, int, long, long, boolean, boolean, boolean, d0.m, java.util.List, java.util.List, r0.f$f, java.util.Map):void");
    }

    public f c(long j7, int i7) {
        return new f(this.f18950d, this.f19013a, this.f19014b, this.f18951e, this.f18953g, j7, true, i7, this.f18957k, this.f18958l, this.f18959m, this.f18960n, this.f19015c, this.f18961o, this.f18962p, this.f18963q, this.f18964r, this.f18965s, this.f18968v, this.f18966t);
    }

    public f d() {
        return this.f18961o ? this : new f(this.f18950d, this.f19013a, this.f19014b, this.f18951e, this.f18953g, this.f18954h, this.f18955i, this.f18956j, this.f18957k, this.f18958l, this.f18959m, this.f18960n, this.f19015c, true, this.f18962p, this.f18963q, this.f18964r, this.f18965s, this.f18968v, this.f18966t);
    }

    public long e() {
        return this.f18954h + this.f18967u;
    }

    public boolean f(f fVar) {
        if (fVar == null) {
            return true;
        }
        long j7 = this.f18957k;
        long j8 = fVar.f18957k;
        if (j7 > j8) {
            return true;
        }
        if (j7 < j8) {
            return false;
        }
        int size = this.f18964r.size() - fVar.f18964r.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.f18965s.size();
        int size3 = fVar.f18965s.size();
        if (size2 <= size3) {
            return size2 == size3 && this.f18961o && !fVar.f18961o;
        }
        return true;
    }

    @Override // v0.InterfaceC2047a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(List list) {
        return this;
    }
}
