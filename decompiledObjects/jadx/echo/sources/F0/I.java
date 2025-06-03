package F0;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f1774a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1775b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1776c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1777d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1778e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1779f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1780g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f1781a;

        /* renamed from: b, reason: collision with root package name */
        public String f1782b;

        /* renamed from: c, reason: collision with root package name */
        public int f1783c;

        /* renamed from: d, reason: collision with root package name */
        public int f1784d;

        /* renamed from: e, reason: collision with root package name */
        public int f1785e;

        /* renamed from: f, reason: collision with root package name */
        public int f1786f;

        /* renamed from: g, reason: collision with root package name */
        public int f1787g;

        public a() {
        }

        public a(a aVar) {
            this.f1781a = aVar.f1781a;
            this.f1782b = aVar.f1782b;
            this.f1783c = aVar.f1783c;
            this.f1784d = aVar.f1784d;
            this.f1785e = aVar.f1785e;
            this.f1786f = aVar.f1786f;
            this.f1787g = aVar.f1787g;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(int r9) {
            /*
                r8 = this;
                boolean r0 = F0.I.a(r9)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                int r0 = r9 >>> 19
                r2 = 3
                r0 = r0 & r2
                r3 = 1
                if (r0 != r3) goto L10
                return r1
            L10:
                int r4 = r9 >>> 17
                r4 = r4 & r2
                if (r4 != 0) goto L16
                return r1
            L16:
                int r5 = r9 >>> 12
                r6 = 15
                r5 = r5 & r6
                if (r5 == 0) goto Laa
                if (r5 != r6) goto L21
                goto Laa
            L21:
                int r6 = r9 >>> 10
                r6 = r6 & r2
                if (r6 != r2) goto L27
                return r1
            L27:
                r8.f1781a = r0
                java.lang.String[] r1 = F0.I.b()
                int r7 = 3 - r4
                r1 = r1[r7]
                r8.f1782b = r1
                int[] r1 = F0.I.c()
                r1 = r1[r6]
                r8.f1784d = r1
                r6 = 2
                if (r0 != r6) goto L42
                int r1 = r1 / r6
            L3f:
                r8.f1784d = r1
                goto L47
            L42:
                if (r0 != 0) goto L47
                int r1 = r1 / 4
                goto L3f
            L47:
                int r1 = r9 >>> 9
                r1 = r1 & r3
                int r7 = F0.I.d(r0, r4)
                r8.f1787g = r7
                if (r4 != r2) goto L70
                if (r0 != r2) goto L5c
                int[] r0 = F0.I.e()
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L63
            L5c:
                int[] r0 = F0.I.f()
                int r5 = r5 - r3
                r0 = r0[r5]
            L63:
                r8.f1786f = r0
                int r0 = r0 * 12
                int r4 = r8.f1784d
                int r0 = r0 / r4
                int r0 = r0 + r1
                int r0 = r0 * 4
            L6d:
                r8.f1783c = r0
                goto La1
            L70:
                r7 = 144(0x90, float:2.02E-43)
                if (r0 != r2) goto L8d
                if (r4 != r6) goto L7e
                int[] r0 = F0.I.g()
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L85
            L7e:
                int[] r0 = F0.I.h()
                int r5 = r5 - r3
                r0 = r0[r5]
            L85:
                r8.f1786f = r0
                int r0 = r0 * r7
                int r4 = r8.f1784d
                int r0 = r0 / r4
                int r0 = r0 + r1
                goto L6d
            L8d:
                int[] r0 = F0.I.i()
                int r5 = r5 - r3
                r0 = r0[r5]
                r8.f1786f = r0
                if (r4 != r3) goto L9a
                r7 = 72
            L9a:
                int r7 = r7 * r0
                int r0 = r8.f1784d
                int r7 = r7 / r0
                int r7 = r7 + r1
                r8.f1783c = r7
            La1:
                int r9 = r9 >> 6
                r9 = r9 & r2
                if (r9 != r2) goto La7
                r6 = r3
            La7:
                r8.f1785e = r6
                return r3
            Laa:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: F0.I.a.a(int):boolean");
        }
    }

    public static int j(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (!l(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return -1;
        }
        int i12 = f1775b[i11];
        if (i8 == 2) {
            i12 /= 2;
        } else if (i8 == 0) {
            i12 /= 4;
        }
        int i13 = (i7 >>> 9) & 1;
        if (i9 == 3) {
            return ((((i8 == 3 ? f1776c[i10 - 1] : f1777d[i10 - 1]) * 12) / i12) + i13) * 4;
        }
        int i14 = i8 == 3 ? i9 == 2 ? f1778e[i10 - 1] : f1779f[i10 - 1] : f1780g[i10 - 1];
        if (i8 == 3) {
            return ((i14 * 144) / i12) + i13;
        }
        return (((i9 == 1 ? 72 : 144) * i14) / i12) + i13;
    }

    public static int k(int i7, int i8) {
        if (i8 == 1) {
            return i7 == 3 ? 1152 : 576;
        }
        if (i8 == 2) {
            return 1152;
        }
        if (i8 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean l(int i7) {
        return (i7 & (-2097152)) == -2097152;
    }

    public static int m(int i7) {
        int i8;
        int i9;
        if (!l(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0) {
            return -1;
        }
        int i10 = (i7 >>> 12) & 15;
        int i11 = (i7 >>> 10) & 3;
        if (i10 == 0 || i10 == 15 || i11 == 3) {
            return -1;
        }
        return k(i8, i9);
    }
}
