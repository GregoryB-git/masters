package d0;

import g0.AbstractC1297a;
import java.util.Arrays;

/* renamed from: d0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1171J {

    /* renamed from: f, reason: collision with root package name */
    public static final String f12436f = g0.M.w0(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f12437g = g0.M.w0(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f12438a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12439b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12440c;

    /* renamed from: d, reason: collision with root package name */
    public final C1194q[] f12441d;

    /* renamed from: e, reason: collision with root package name */
    public int f12442e;

    public C1171J(String str, C1194q... c1194qArr) {
        AbstractC1297a.a(c1194qArr.length > 0);
        this.f12439b = str;
        this.f12441d = c1194qArr;
        this.f12438a = c1194qArr.length;
        int k7 = AbstractC1203z.k(c1194qArr[0].f12726n);
        this.f12440c = k7 == -1 ? AbstractC1203z.k(c1194qArr[0].f12725m) : k7;
        f();
    }

    public static void c(String str, String str2, String str3, int i7) {
        g0.o.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i7 + ")"));
    }

    public static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public static int e(int i7) {
        return i7 | 16384;
    }

    public C1194q a(int i7) {
        return this.f12441d[i7];
    }

    public int b(C1194q c1194q) {
        int i7 = 0;
        while (true) {
            C1194q[] c1194qArr = this.f12441d;
            if (i7 >= c1194qArr.length) {
                return -1;
            }
            if (c1194q == c1194qArr[i7]) {
                return i7;
            }
            i7++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1171J.class != obj.getClass()) {
            return false;
        }
        C1171J c1171j = (C1171J) obj;
        return this.f12439b.equals(c1171j.f12439b) && Arrays.equals(this.f12441d, c1171j.f12441d);
    }

    public final void f() {
        String d7 = d(this.f12441d[0].f12716d);
        int e7 = e(this.f12441d[0].f12718f);
        int i7 = 1;
        while (true) {
            C1194q[] c1194qArr = this.f12441d;
            if (i7 >= c1194qArr.length) {
                return;
            }
            if (!d7.equals(d(c1194qArr[i7].f12716d))) {
                C1194q[] c1194qArr2 = this.f12441d;
                c("languages", c1194qArr2[0].f12716d, c1194qArr2[i7].f12716d, i7);
                return;
            } else {
                if (e7 != e(this.f12441d[i7].f12718f)) {
                    c("role flags", Integer.toBinaryString(this.f12441d[0].f12718f), Integer.toBinaryString(this.f12441d[i7].f12718f), i7);
                    return;
                }
                i7++;
            }
        }
    }

    public int hashCode() {
        if (this.f12442e == 0) {
            this.f12442e = ((527 + this.f12439b.hashCode()) * 31) + Arrays.hashCode(this.f12441d);
        }
        return this.f12442e;
    }

    public C1171J(C1194q... c1194qArr) {
        this("", c1194qArr);
    }
}
