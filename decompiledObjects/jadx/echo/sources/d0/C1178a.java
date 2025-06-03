package d0;

import android.net.Uri;
import d0.C1198u;
import g0.AbstractC1297a;
import java.util.Arrays;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1178a {

    /* renamed from: g, reason: collision with root package name */
    public static final C1178a f12564g = new C1178a(null, new C0186a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final C0186a f12565h = new C0186a(0).i(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String f12566i = g0.M.w0(1);

    /* renamed from: j, reason: collision with root package name */
    public static final String f12567j = g0.M.w0(2);

    /* renamed from: k, reason: collision with root package name */
    public static final String f12568k = g0.M.w0(3);

    /* renamed from: l, reason: collision with root package name */
    public static final String f12569l = g0.M.w0(4);

    /* renamed from: a, reason: collision with root package name */
    public final Object f12570a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12571b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12572c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12573d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12574e;

    /* renamed from: f, reason: collision with root package name */
    public final C0186a[] f12575f;

    /* renamed from: d0.a$a, reason: collision with other inner class name */
    public static final class C0186a {

        /* renamed from: j, reason: collision with root package name */
        public static final String f12576j = g0.M.w0(0);

        /* renamed from: k, reason: collision with root package name */
        public static final String f12577k = g0.M.w0(1);

        /* renamed from: l, reason: collision with root package name */
        public static final String f12578l = g0.M.w0(2);

        /* renamed from: m, reason: collision with root package name */
        public static final String f12579m = g0.M.w0(3);

        /* renamed from: n, reason: collision with root package name */
        public static final String f12580n = g0.M.w0(4);

        /* renamed from: o, reason: collision with root package name */
        public static final String f12581o = g0.M.w0(5);

        /* renamed from: p, reason: collision with root package name */
        public static final String f12582p = g0.M.w0(6);

        /* renamed from: q, reason: collision with root package name */
        public static final String f12583q = g0.M.w0(7);

        /* renamed from: r, reason: collision with root package name */
        public static final String f12584r = g0.M.w0(8);

        /* renamed from: a, reason: collision with root package name */
        public final long f12585a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12586b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12587c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri[] f12588d;

        /* renamed from: e, reason: collision with root package name */
        public final C1198u[] f12589e;

        /* renamed from: f, reason: collision with root package name */
        public final int[] f12590f;

        /* renamed from: g, reason: collision with root package name */
        public final long[] f12591g;

        /* renamed from: h, reason: collision with root package name */
        public final long f12592h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f12593i;

        public C0186a(long j7) {
            this(j7, -1, -1, new int[0], new C1198u[0], new long[0], 0L, false);
        }

        public static long[] b(long[] jArr, int i7) {
            int length = jArr.length;
            int max = Math.max(i7, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        public static int[] c(int[] iArr, int i7) {
            int length = iArr.length;
            int max = Math.max(i7, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public int d() {
            return e(-1);
        }

        public int e(int i7) {
            int i8;
            int i9 = i7 + 1;
            while (true) {
                int[] iArr = this.f12590f;
                if (i9 >= iArr.length || this.f12593i || (i8 = iArr[i9]) == 0 || i8 == 1) {
                    break;
                }
                i9++;
            }
            return i9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0186a.class != obj.getClass()) {
                return false;
            }
            C0186a c0186a = (C0186a) obj;
            return this.f12585a == c0186a.f12585a && this.f12586b == c0186a.f12586b && this.f12587c == c0186a.f12587c && Arrays.equals(this.f12589e, c0186a.f12589e) && Arrays.equals(this.f12590f, c0186a.f12590f) && Arrays.equals(this.f12591g, c0186a.f12591g) && this.f12592h == c0186a.f12592h && this.f12593i == c0186a.f12593i;
        }

        public boolean f() {
            if (this.f12586b == -1) {
                return true;
            }
            for (int i7 = 0; i7 < this.f12586b; i7++) {
                int i8 = this.f12590f[i7];
                if (i8 == 0 || i8 == 1) {
                    return true;
                }
            }
            return false;
        }

        public final boolean g() {
            return this.f12593i && this.f12585a == Long.MIN_VALUE && this.f12586b == -1;
        }

        public boolean h() {
            return this.f12586b == -1 || d() < this.f12586b;
        }

        public int hashCode() {
            int i7 = ((this.f12586b * 31) + this.f12587c) * 31;
            long j7 = this.f12585a;
            int hashCode = (((((((i7 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + Arrays.hashCode(this.f12589e)) * 31) + Arrays.hashCode(this.f12590f)) * 31) + Arrays.hashCode(this.f12591g)) * 31;
            long j8 = this.f12592h;
            return ((hashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f12593i ? 1 : 0);
        }

        public C0186a i(int i7) {
            int[] c7 = c(this.f12590f, i7);
            long[] b7 = b(this.f12591g, i7);
            return new C0186a(this.f12585a, i7, this.f12587c, c7, (C1198u[]) Arrays.copyOf(this.f12589e, i7), b7, this.f12592h, this.f12593i);
        }

        public C0186a(long j7, int i7, int i8, int[] iArr, C1198u[] c1198uArr, long[] jArr, long j8, boolean z7) {
            int i9 = 0;
            AbstractC1297a.a(iArr.length == c1198uArr.length);
            this.f12585a = j7;
            this.f12586b = i7;
            this.f12587c = i8;
            this.f12590f = iArr;
            this.f12589e = c1198uArr;
            this.f12591g = jArr;
            this.f12592h = j8;
            this.f12593i = z7;
            this.f12588d = new Uri[c1198uArr.length];
            while (true) {
                Uri[] uriArr = this.f12588d;
                if (i9 >= uriArr.length) {
                    return;
                }
                C1198u c1198u = c1198uArr[i9];
                uriArr[i9] = c1198u == null ? null : ((C1198u.h) AbstractC1297a.e(c1198u.f12800b)).f12892a;
                i9++;
            }
        }
    }

    public C1178a(Object obj, C0186a[] c0186aArr, long j7, long j8, int i7) {
        this.f12570a = obj;
        this.f12572c = j7;
        this.f12573d = j8;
        this.f12571b = c0186aArr.length + i7;
        this.f12575f = c0186aArr;
        this.f12574e = i7;
    }

    public C0186a a(int i7) {
        int i8 = this.f12574e;
        return i7 < i8 ? f12565h : this.f12575f[i7 - i8];
    }

    public int b(long j7, long j8) {
        if (j7 == Long.MIN_VALUE) {
            return -1;
        }
        if (j8 != -9223372036854775807L && j7 >= j8) {
            return -1;
        }
        int i7 = this.f12574e;
        while (i7 < this.f12571b && ((a(i7).f12585a != Long.MIN_VALUE && a(i7).f12585a <= j7) || !a(i7).h())) {
            i7++;
        }
        if (i7 < this.f12571b) {
            return i7;
        }
        return -1;
    }

    public int c(long j7, long j8) {
        int i7 = this.f12571b - 1;
        int i8 = i7 - (d(i7) ? 1 : 0);
        while (i8 >= 0 && e(j7, j8, i8)) {
            i8--;
        }
        if (i8 < 0 || !a(i8).f()) {
            return -1;
        }
        return i8;
    }

    public boolean d(int i7) {
        return i7 == this.f12571b - 1 && a(i7).g();
    }

    public final boolean e(long j7, long j8, int i7) {
        if (j7 == Long.MIN_VALUE) {
            return false;
        }
        C0186a a7 = a(i7);
        long j9 = a7.f12585a;
        return j9 == Long.MIN_VALUE ? j8 == -9223372036854775807L || (a7.f12593i && a7.f12586b == -1) || j7 < j8 : j7 < j9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1178a.class != obj.getClass()) {
            return false;
        }
        C1178a c1178a = (C1178a) obj;
        return g0.M.c(this.f12570a, c1178a.f12570a) && this.f12571b == c1178a.f12571b && this.f12572c == c1178a.f12572c && this.f12573d == c1178a.f12573d && this.f12574e == c1178a.f12574e && Arrays.equals(this.f12575f, c1178a.f12575f);
    }

    public int hashCode() {
        int i7 = this.f12571b * 31;
        Object obj = this.f12570a;
        return ((((((((i7 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f12572c)) * 31) + ((int) this.f12573d)) * 31) + this.f12574e) * 31) + Arrays.hashCode(this.f12575f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f12570a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f12572c);
        sb.append(", adGroups=[");
        for (int i7 = 0; i7 < this.f12575f.length; i7++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f12575f[i7].f12585a);
            sb.append(", ads=[");
            for (int i8 = 0; i8 < this.f12575f[i7].f12590f.length; i8++) {
                sb.append("ad(state=");
                int i9 = this.f12575f[i7].f12590f[i8];
                sb.append(i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? '?' : '!' : 'P' : 'S' : 'R' : '_');
                sb.append(", durationUs=");
                sb.append(this.f12575f[i7].f12591g[i8]);
                sb.append(')');
                if (i8 < this.f12575f[i7].f12590f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i7 < this.f12575f.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
