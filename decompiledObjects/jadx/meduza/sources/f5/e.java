package f5;

import android.net.Uri;
import java.util.List;
import o7.l0;
import o7.t;
import o7.u;

/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: d, reason: collision with root package name */
    public final int f5373d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5374e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5375g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5376h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5377i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5378j;

    /* renamed from: k, reason: collision with root package name */
    public final long f5379k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5380l;

    /* renamed from: m, reason: collision with root package name */
    public final long f5381m;

    /* renamed from: n, reason: collision with root package name */
    public final long f5382n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f5383o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5384p;

    /* renamed from: q, reason: collision with root package name */
    public final a4.d f5385q;

    /* renamed from: r, reason: collision with root package name */
    public final t f5386r;

    /* renamed from: s, reason: collision with root package name */
    public final t f5387s;
    public final u t;

    /* renamed from: u, reason: collision with root package name */
    public final long f5388u;

    /* renamed from: v, reason: collision with root package name */
    public final C0082e f5389v;

    public static final class a extends d {
        public final boolean t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f5390u;

        public a(String str, c cVar, long j10, int i10, long j11, a4.d dVar, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, cVar, j10, i10, j11, dVar, str2, str3, j12, j13, z10);
            this.t = z11;
            this.f5390u = z12;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f5391a;

        /* renamed from: b, reason: collision with root package name */
        public final long f5392b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5393c;

        public b(Uri uri, long j10, int i10) {
            this.f5391a = uri;
            this.f5392b = j10;
            this.f5393c = i10;
        }
    }

    public static final class c extends d {
        public final String t;

        /* renamed from: u, reason: collision with root package name */
        public final t f5394u;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(long j10, long j11, String str, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, l0.f12009e);
            t.b bVar = t.f12050b;
        }

        public c(String str, c cVar, String str2, long j10, int i10, long j11, a4.d dVar, String str3, String str4, long j12, long j13, boolean z10, List<a> list) {
            super(str, cVar, j10, i10, j11, dVar, str3, str4, j12, j13, z10);
            this.t = str2;
            this.f5394u = t.p(list);
        }
    }

    public static class d implements Comparable<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final String f5395a;

        /* renamed from: b, reason: collision with root package name */
        public final c f5396b;

        /* renamed from: c, reason: collision with root package name */
        public final long f5397c;

        /* renamed from: d, reason: collision with root package name */
        public final int f5398d;

        /* renamed from: e, reason: collision with root package name */
        public final long f5399e;
        public final a4.d f;

        /* renamed from: o, reason: collision with root package name */
        public final String f5400o;

        /* renamed from: p, reason: collision with root package name */
        public final String f5401p;

        /* renamed from: q, reason: collision with root package name */
        public final long f5402q;

        /* renamed from: r, reason: collision with root package name */
        public final long f5403r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f5404s;

        public d(String str, c cVar, long j10, int i10, long j11, a4.d dVar, String str2, String str3, long j12, long j13, boolean z10) {
            this.f5395a = str;
            this.f5396b = cVar;
            this.f5397c = j10;
            this.f5398d = i10;
            this.f5399e = j11;
            this.f = dVar;
            this.f5400o = str2;
            this.f5401p = str3;
            this.f5402q = j12;
            this.f5403r = j13;
            this.f5404s = z10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Long l10) {
            Long l11 = l10;
            if (this.f5399e > l11.longValue()) {
                return 1;
            }
            return this.f5399e < l11.longValue() ? -1 : 0;
        }
    }

    /* renamed from: f5.e$e, reason: collision with other inner class name */
    public static final class C0082e {

        /* renamed from: a, reason: collision with root package name */
        public final long f5405a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f5406b;

        /* renamed from: c, reason: collision with root package name */
        public final long f5407c;

        /* renamed from: d, reason: collision with root package name */
        public final long f5408d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f5409e;

        public C0082e(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f5405a = j10;
            this.f5406b = z10;
            this.f5407c = j11;
            this.f5408d = j12;
            this.f5409e = z11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(int r11, java.lang.String r12, java.util.List<java.lang.String> r13, long r14, boolean r16, long r17, boolean r19, int r20, long r21, int r23, long r24, long r26, boolean r28, boolean r29, boolean r30, a4.d r31, java.util.List<f5.e.c> r32, java.util.List<f5.e.a> r33, f5.e.C0082e r34, java.util.Map<android.net.Uri, f5.e.b> r35) {
        /*
            r10 = this;
            r0 = r10
            r1 = r14
            r3 = r12
            r4 = r13
            r5 = r28
            r10.<init>(r12, r13, r5)
            r3 = r11
            r0.f5373d = r3
            r3 = r17
            r0.f5376h = r3
            r3 = r16
            r0.f5375g = r3
            r3 = r19
            r0.f5377i = r3
            r3 = r20
            r0.f5378j = r3
            r3 = r21
            r0.f5379k = r3
            r3 = r23
            r0.f5380l = r3
            r3 = r24
            r0.f5381m = r3
            r3 = r26
            r0.f5382n = r3
            r3 = r29
            r0.f5383o = r3
            r3 = r30
            r0.f5384p = r3
            r3 = r31
            r0.f5385q = r3
            o7.t r3 = o7.t.p(r32)
            r0.f5386r = r3
            o7.t r3 = o7.t.p(r33)
            r0.f5387s = r3
            o7.u r3 = o7.u.b(r35)
            r0.t = r3
            boolean r3 = r33.isEmpty()
            r4 = 0
            if (r3 != 0) goto L59
            java.lang.Object r3 = p2.m0.K(r33)
            f5.e$a r3 = (f5.e.a) r3
            goto L65
        L59:
            boolean r3 = r32.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = p2.m0.K(r32)
            f5.e$c r3 = (f5.e.c) r3
        L65:
            long r6 = r3.f5399e
            long r8 = r3.f5397c
            long r6 = r6 + r8
            r0.f5388u = r6
            goto L6f
        L6d:
            r0.f5388u = r4
        L6f:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L79
            goto L89
        L79:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            long r6 = r0.f5388u
            if (r3 < 0) goto L84
            long r6 = java.lang.Math.min(r6, r14)
            goto L89
        L84:
            long r6 = r6 + r1
            long r6 = java.lang.Math.max(r4, r6)
        L89:
            r0.f5374e = r6
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L91
            r1 = 1
            goto L92
        L91:
            r1 = 0
        L92:
            r0.f = r1
            r1 = r34
            r0.f5389v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.e.<init>(int, java.lang.String, java.util.List, long, boolean, long, boolean, int, long, int, long, long, boolean, boolean, boolean, a4.d, java.util.List, java.util.List, f5.e$e, java.util.Map):void");
    }

    @Override // y4.a
    public final g a(List list) {
        return this;
    }
}
