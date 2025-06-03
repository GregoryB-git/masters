package x3;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f17104a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f17105b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f17106c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f17107d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f17108e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f17109g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f17110a;

        /* renamed from: b, reason: collision with root package name */
        public String f17111b;

        /* renamed from: c, reason: collision with root package name */
        public int f17112c;

        /* renamed from: d, reason: collision with root package name */
        public int f17113d;

        /* renamed from: e, reason: collision with root package name */
        public int f17114e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f17115g;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x005b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(int r9) {
            /*
                Method dump skipped, instructions count: 179
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: x3.y.a.a(int):boolean");
        }
    }

    public static int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!((i10 & (-2097152)) == -2097152) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f17105b[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f17106c[i13 - 1] : f17107d[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f17108e[i13 - 1] : f[i13 - 1] : f17109g[i13 - 1];
        if (i11 == 3) {
            return a0.j.d(i17, 144, i15, i16);
        }
        return a0.j.d(i12 == 1 ? 72 : 144, i17, i15, i16);
    }

    public static int b(int i10) {
        int i11;
        int i12;
        if (!((i10 & (-2097152)) == -2097152) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        if (i12 == 1) {
            return i11 == 3 ? 1152 : 576;
        }
        if (i12 == 2) {
            return 1152;
        }
        if (i12 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
