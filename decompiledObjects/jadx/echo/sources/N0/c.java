package N0;

import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f3591a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3592b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f3593a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3594b;

        /* renamed from: c, reason: collision with root package name */
        public final long f3595c;

        /* renamed from: d, reason: collision with root package name */
        public final long f3596d;

        public a(String str, String str2, long j7, long j8) {
            this.f3593a = str;
            this.f3594b = str2;
            this.f3595c = j7;
            this.f3596d = j8;
        }
    }

    public c(long j7, List list) {
        this.f3591a = j7;
        this.f3592b = list;
    }

    public U0.a a(long j7) {
        long j8;
        if (this.f3592b.size() < 2) {
            return null;
        }
        long j9 = j7;
        long j10 = -1;
        long j11 = -1;
        long j12 = -1;
        long j13 = -1;
        boolean z7 = false;
        for (int size = this.f3592b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f3592b.get(size);
            boolean equals = "video/mp4".equals(aVar.f3593a) | z7;
            if (size == 0) {
                j9 -= aVar.f3596d;
                j8 = 0;
            } else {
                j8 = j9 - aVar.f3595c;
            }
            long j14 = j9;
            j9 = j8;
            if (!equals || j9 == j14) {
                z7 = equals;
            } else {
                j13 = j14 - j9;
                j12 = j9;
                z7 = false;
            }
            if (size == 0) {
                j10 = j9;
                j11 = j14;
            }
        }
        if (j12 == -1 || j13 == -1 || j10 == -1 || j11 == -1) {
            return null;
        }
        return new U0.a(j10, j11, this.f3591a, j12, j13);
    }
}
