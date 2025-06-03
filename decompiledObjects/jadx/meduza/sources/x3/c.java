package x3;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f16929a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f16930a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16931b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16932c;

        public a(int i10, int i11, int i12) {
            this.f16930a = i10;
            this.f16931b = i11;
            this.f16932c = i12;
        }
    }

    public static void a(int i10, v5.u uVar) {
        uVar.D(7);
        byte[] bArr = uVar.f15974a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        if (r9 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static x3.c.a b(v5.t r9) {
        /*
            r0 = 16
            int r1 = r9.g(r0)
            int r0 = r9.g(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r9.g(r0)
            r3 = 7
            goto L19
        L18:
            r3 = r2
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r3 = r9.g(r1)
            r4 = 0
            r5 = 3
            if (r3 != r5) goto L33
        L2a:
            r9.g(r1)
            boolean r3 = r9.f()
            if (r3 != 0) goto L2a
        L33:
            r3 = 10
            int r3 = r9.g(r3)
            boolean r6 = r9.f()
            if (r6 == 0) goto L48
            int r6 = r9.g(r5)
            if (r6 <= 0) goto L48
            r9.m(r1)
        L48:
            boolean r6 = r9.f()
            r7 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r6 == 0) goto L56
            r6 = r7
            goto L57
        L56:
            r6 = r8
        L57:
            int r9 = r9.g(r2)
            if (r6 != r8) goto L66
            r8 = 13
            if (r9 != r8) goto L66
            int[] r1 = x3.c.f16929a
            r9 = r1[r9]
            goto L93
        L66:
            if (r6 != r7) goto L92
            int[] r7 = x3.c.f16929a
            r8 = 14
            if (r9 >= r8) goto L92
            r4 = r7[r9]
            int r3 = r3 % 5
            r7 = 8
            r8 = 1
            if (r3 == r8) goto L8c
            r8 = 11
            if (r3 == r1) goto L87
            if (r3 == r5) goto L8c
            if (r3 == r2) goto L80
            goto L92
        L80:
            if (r9 == r5) goto L90
            if (r9 == r7) goto L90
            if (r9 != r8) goto L92
            goto L90
        L87:
            if (r9 == r7) goto L90
            if (r9 != r8) goto L92
            goto L90
        L8c:
            if (r9 == r5) goto L90
            if (r9 != r7) goto L92
        L90:
            int r4 = r4 + 1
        L92:
            r9 = r4
        L93:
            x3.c$a r1 = new x3.c$a
            r1.<init>(r6, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.c.b(v5.t):x3.c$a");
    }
}
