package Z0;

import g0.M;

/* loaded from: classes.dex */
public abstract class e {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f7674a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f7675b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7676c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f7677d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f7678e;

        /* renamed from: f, reason: collision with root package name */
        public final long f7679f;

        public b(long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j7) {
            this.f7674a = jArr;
            this.f7675b = iArr;
            this.f7676c = i7;
            this.f7677d = jArr2;
            this.f7678e = iArr2;
            this.f7679f = j7;
        }
    }

    public static b a(int i7, long[] jArr, int[] iArr, long j7) {
        int i8 = 8192 / i7;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += M.k(i10, i8);
        }
        long[] jArr2 = new long[i9];
        int[] iArr2 = new int[i9];
        long[] jArr3 = new long[i9];
        int[] iArr3 = new int[i9];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            long j8 = jArr[i14];
            while (i15 > 0) {
                int min = Math.min(i8, i15);
                jArr2[i12] = j8;
                int i16 = i7 * min;
                iArr2[i12] = i16;
                i13 = Math.max(i13, i16);
                jArr3[i12] = i11 * j7;
                iArr3[i12] = 1;
                j8 += iArr2[i12];
                i11 += min;
                i15 -= min;
                i12++;
            }
        }
        return new b(jArr2, iArr2, i13, jArr3, iArr3, j7 * i11);
    }
}
