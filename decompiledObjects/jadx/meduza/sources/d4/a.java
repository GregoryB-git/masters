package d4;

import c4.d;
import c4.h;
import c4.i;
import c4.j;
import c4.t;
import c4.v;
import java.util.Arrays;
import v5.e0;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f3425q;
    public static final int t;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3428a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3429b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3430c;

    /* renamed from: d, reason: collision with root package name */
    public long f3431d;

    /* renamed from: e, reason: collision with root package name */
    public int f3432e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3433g;

    /* renamed from: h, reason: collision with root package name */
    public long f3434h;

    /* renamed from: i, reason: collision with root package name */
    public int f3435i;

    /* renamed from: j, reason: collision with root package name */
    public int f3436j;

    /* renamed from: k, reason: collision with root package name */
    public long f3437k;

    /* renamed from: l, reason: collision with root package name */
    public j f3438l;

    /* renamed from: m, reason: collision with root package name */
    public v f3439m;

    /* renamed from: n, reason: collision with root package name */
    public t f3440n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3441o;

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f3424p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f3426r = e0.B("#!AMR\n");

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f3427s = e0.B("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f3425q = iArr;
        t = iArr[8];
    }

    public a(int i10) {
        this.f3429b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f3428a = new byte[1];
        this.f3435i = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if ((!r0 && (r6 < 12 || r6 > 14)) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(c4.i r6) {
        /*
            r5 = this;
            r6.i()
            byte[] r0 = r5.f3428a
            r1 = 0
            r2 = 1
            r6.m(r0, r1, r2)
            byte[] r6 = r5.f3428a
            r6 = r6[r1]
            r0 = r6 & 131(0x83, float:1.84E-43)
            r3 = 0
            if (r0 > 0) goto L70
            int r6 = r6 >> 3
            r0 = 15
            r6 = r6 & r0
            if (r6 < 0) goto L3d
            if (r6 > r0) goto L3d
            boolean r0 = r5.f3430c
            if (r0 == 0) goto L2a
            r4 = 10
            if (r6 < r4) goto L28
            r4 = 13
            if (r6 <= r4) goto L2a
        L28:
            r4 = r2
            goto L2b
        L2a:
            r4 = r1
        L2b:
            if (r4 != 0) goto L3c
            if (r0 != 0) goto L39
            r0 = 12
            if (r6 < r0) goto L37
            r0 = 14
            if (r6 <= r0) goto L39
        L37:
            r0 = r2
            goto L3a
        L39:
            r0 = r1
        L3a:
            if (r0 == 0) goto L3d
        L3c:
            r1 = r2
        L3d:
            if (r1 != 0) goto L62
            java.lang.String r0 = "Illegal AMR "
            java.lang.StringBuilder r0 = defpackage.f.l(r0)
            boolean r1 = r5.f3430c
            if (r1 == 0) goto L4c
            java.lang.String r1 = "WB"
            goto L4e
        L4c:
            java.lang.String r1 = "NB"
        L4e:
            r0.append(r1)
            java.lang.String r1 = " frame type "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            v3.a1 r6 = v3.a1.a(r6, r3)
            throw r6
        L62:
            boolean r0 = r5.f3430c
            if (r0 == 0) goto L6b
            int[] r0 = d4.a.f3425q
            r6 = r0[r6]
            goto L6f
        L6b:
            int[] r0 = d4.a.f3424p
            r6 = r0[r6]
        L6f:
            return r6
        L70:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid padding bits for frame header "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            v3.a1 r6 = v3.a1.a(r6, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.a.a(c4.i):int");
    }

    @Override // c4.h
    public final void b(j jVar) {
        this.f3438l = jVar;
        this.f3439m = jVar.r(0, 1);
        jVar.m();
    }

    public final boolean c(i iVar) {
        int length;
        byte[] bArr = f3426r;
        iVar.i();
        byte[] bArr2 = new byte[bArr.length];
        iVar.m(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f3430c = false;
            length = bArr.length;
        } else {
            byte[] bArr3 = f3427s;
            iVar.i();
            byte[] bArr4 = new byte[bArr3.length];
            iVar.m(bArr4, 0, bArr3.length);
            if (!Arrays.equals(bArr4, bArr3)) {
                return false;
            }
            this.f3430c = true;
            length = bArr3.length;
        }
        iVar.j(length);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    @Override // c4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(c4.i r14, c4.s r15) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.a.d(c4.i, c4.s):int");
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        this.f3431d = 0L;
        this.f3432e = 0;
        this.f = 0;
        if (j10 != 0) {
            t tVar = this.f3440n;
            if (tVar instanceof d) {
                this.f3437k = ((Math.max(0L, j10 - ((d) tVar).f2268b) * 8) * 1000000) / r0.f2271e;
                return;
            }
        }
        this.f3437k = 0L;
    }

    @Override // c4.h
    public final boolean i(i iVar) {
        return c(iVar);
    }

    @Override // c4.h
    public final void release() {
    }
}
