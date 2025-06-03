package a5;

import android.net.Uri;
import defpackage.f;
import e0.d;
import java.util.Arrays;
import r3.j;
import v3.g;
import v5.e0;
import x6.b;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: o, reason: collision with root package name */
    public static final a f208o = new a(new C0006a[0], 0, -9223372036854775807L, 0);

    /* renamed from: p, reason: collision with root package name */
    public static final C0006a f209p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f210q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f211r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f212s;
    public static final String t;

    /* renamed from: u, reason: collision with root package name */
    public static final j f213u;

    /* renamed from: a, reason: collision with root package name */
    public final Object f214a = null;

    /* renamed from: b, reason: collision with root package name */
    public final int f215b;

    /* renamed from: c, reason: collision with root package name */
    public final long f216c;

    /* renamed from: d, reason: collision with root package name */
    public final long f217d;

    /* renamed from: e, reason: collision with root package name */
    public final int f218e;
    public final C0006a[] f;

    /* renamed from: a5.a$a, reason: collision with other inner class name */
    public static final class C0006a implements g {

        /* renamed from: q, reason: collision with root package name */
        public static final String f219q = e0.E(0);

        /* renamed from: r, reason: collision with root package name */
        public static final String f220r = e0.E(1);

        /* renamed from: s, reason: collision with root package name */
        public static final String f221s = e0.E(2);
        public static final String t = e0.E(3);

        /* renamed from: u, reason: collision with root package name */
        public static final String f222u = e0.E(4);

        /* renamed from: v, reason: collision with root package name */
        public static final String f223v = e0.E(5);

        /* renamed from: w, reason: collision with root package name */
        public static final String f224w = e0.E(6);

        /* renamed from: x, reason: collision with root package name */
        public static final String f225x = e0.E(7);

        /* renamed from: y, reason: collision with root package name */
        public static final d f226y = new d(16);

        /* renamed from: a, reason: collision with root package name */
        public final long f227a;

        /* renamed from: b, reason: collision with root package name */
        public final int f228b;

        /* renamed from: c, reason: collision with root package name */
        public final int f229c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri[] f230d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f231e;
        public final long[] f;

        /* renamed from: o, reason: collision with root package name */
        public final long f232o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f233p;

        public C0006a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            b.q(iArr.length == uriArr.length);
            this.f227a = j10;
            this.f228b = i10;
            this.f229c = i11;
            this.f231e = iArr;
            this.f230d = uriArr;
            this.f = jArr;
            this.f232o = j11;
            this.f233p = z10;
        }

        public final int a(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f231e;
                if (i12 >= iArr.length || this.f233p || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0006a.class != obj.getClass()) {
                return false;
            }
            C0006a c0006a = (C0006a) obj;
            return this.f227a == c0006a.f227a && this.f228b == c0006a.f228b && this.f229c == c0006a.f229c && Arrays.equals(this.f230d, c0006a.f230d) && Arrays.equals(this.f231e, c0006a.f231e) && Arrays.equals(this.f, c0006a.f) && this.f232o == c0006a.f232o && this.f233p == c0006a.f233p;
        }

        public final int hashCode() {
            int i10 = ((this.f228b * 31) + this.f229c) * 31;
            long j10 = this.f227a;
            int hashCode = (Arrays.hashCode(this.f) + ((Arrays.hashCode(this.f231e) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f230d)) * 31)) * 31)) * 31;
            long j11 = this.f232o;
            return ((hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f233p ? 1 : 0);
        }
    }

    static {
        C0006a c0006a = new C0006a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = c0006a.f231e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c0006a.f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f209p = new C0006a(c0006a.f227a, 0, c0006a.f229c, copyOf, (Uri[]) Arrays.copyOf(c0006a.f230d, 0), copyOf2, c0006a.f232o, c0006a.f233p);
        f210q = e0.E(1);
        f211r = e0.E(2);
        f212s = e0.E(3);
        t = e0.E(4);
        f213u = new j(13);
    }

    public a(C0006a[] c0006aArr, long j10, long j11, int i10) {
        this.f216c = j10;
        this.f217d = j11;
        this.f215b = c0006aArr.length + i10;
        this.f = c0006aArr;
        this.f218e = i10;
    }

    public final C0006a a(int i10) {
        int i11 = this.f218e;
        return i10 < i11 ? f209p : this.f[i10 - i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return e0.a(this.f214a, aVar.f214a) && this.f215b == aVar.f215b && this.f216c == aVar.f216c && this.f217d == aVar.f217d && this.f218e == aVar.f218e && Arrays.equals(this.f, aVar.f);
    }

    public final int hashCode() {
        int i10 = this.f215b * 31;
        Object obj = this.f214a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f216c)) * 31) + ((int) this.f217d)) * 31) + this.f218e) * 31) + Arrays.hashCode(this.f);
    }

    public final String toString() {
        StringBuilder l10 = f.l("AdPlaybackState(adsId=");
        l10.append(this.f214a);
        l10.append(", adResumePositionUs=");
        l10.append(this.f216c);
        l10.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f.length; i10++) {
            l10.append("adGroup(timeUs=");
            l10.append(this.f[i10].f227a);
            l10.append(", ads=[");
            for (int i11 = 0; i11 < this.f[i10].f231e.length; i11++) {
                l10.append("ad(state=");
                int i12 = this.f[i10].f231e[i11];
                l10.append(i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? '?' : '!' : 'P' : 'S' : 'R' : '_');
                l10.append(", durationUs=");
                l10.append(this.f[i10].f[i11]);
                l10.append(')');
                if (i11 < this.f[i10].f231e.length - 1) {
                    l10.append(", ");
                }
            }
            l10.append("])");
            if (i10 < this.f.length - 1) {
                l10.append(", ");
            }
        }
        l10.append("])");
        return l10.toString();
    }
}
