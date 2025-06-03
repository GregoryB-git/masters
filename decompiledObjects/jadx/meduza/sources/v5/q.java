package v5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f15932a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f15933b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f15934c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f15935d = new int[10];

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f15936a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15937b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15938c;

        /* renamed from: d, reason: collision with root package name */
        public final int f15939d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f15940e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f15941g;

        /* renamed from: h, reason: collision with root package name */
        public final int f15942h;

        /* renamed from: i, reason: collision with root package name */
        public final float f15943i;

        /* renamed from: j, reason: collision with root package name */
        public final int f15944j;

        /* renamed from: k, reason: collision with root package name */
        public final int f15945k;

        /* renamed from: l, reason: collision with root package name */
        public final int f15946l;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, float f, int i16, int i17, int i18) {
            this.f15936a = i10;
            this.f15937b = z10;
            this.f15938c = i11;
            this.f15939d = i12;
            this.f15940e = iArr;
            this.f = i13;
            this.f15941g = i14;
            this.f15942h = i15;
            this.f15943i = f;
            this.f15944j = i16;
            this.f15945k = i17;
            this.f15946l = i18;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f15947a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15948b;

        public b(int i10, int i11, boolean z10) {
            this.f15947a = i11;
            this.f15948b = z10;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f15949a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15950b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15951c;

        /* renamed from: d, reason: collision with root package name */
        public final int f15952d;

        /* renamed from: e, reason: collision with root package name */
        public final int f15953e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final float f15954g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f15955h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f15956i;

        /* renamed from: j, reason: collision with root package name */
        public final int f15957j;

        /* renamed from: k, reason: collision with root package name */
        public final int f15958k;

        /* renamed from: l, reason: collision with root package name */
        public final int f15959l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f15960m;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, float f, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f15949a = i10;
            this.f15950b = i11;
            this.f15951c = i12;
            this.f15952d = i13;
            this.f15953e = i14;
            this.f = i15;
            this.f15954g = f;
            this.f15955h = z10;
            this.f15956i = z11;
            this.f15957j = i16;
            this.f15958k = i17;
            this.f15959l = i18;
            this.f15960m = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        x6.b.H(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0334  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static v5.q.a c(byte[] r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.q.c(byte[], int, int):v5.q$a");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static v5.q.c d(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.q.d(byte[], int, int):v5.q$c");
    }

    public static int e(byte[] bArr, int i10) {
        int i11;
        synchronized (f15934c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                        break;
                    }
                    i12++;
                }
                if (i12 < i10) {
                    int[] iArr = f15935d;
                    if (iArr.length <= i13) {
                        f15935d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f15935d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f15935d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
