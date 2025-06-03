package v3;

import z4.t;

/* loaded from: classes.dex */
public final class n extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public final int f15519c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15520d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15521e;
    public final i0 f;

    /* renamed from: o, reason: collision with root package name */
    public final int f15522o;

    /* renamed from: p, reason: collision with root package name */
    public final z4.s f15523p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f15524q;

    static {
        v5.e0.E(1001);
        v5.e0.E(1002);
        v5.e0.E(1003);
        v5.e0.E(1004);
        v5.e0.E(1005);
        v5.e0.E(1006);
    }

    public n(int i10, int i11, Throwable th) {
        this(i10, th, i11, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, v3.i0 r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            r8 = r20
            if (r4 == 0) goto L64
            r0 = 3
            r1 = 1
            if (r4 == r1) goto L17
            if (r4 == r0) goto Le
            java.lang.String r0 = "Unexpected runtime error"
            goto L10
        Le:
            java.lang.String r0 = "Remote error"
        L10:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L6c
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r7 = r19
            r2.append(r7)
            java.lang.String r3 = ", format_supported="
            r2.append(r3)
            int r3 = v5.e0.f15881a
            if (r8 == 0) goto L5a
            if (r8 == r1) goto L57
            r1 = 2
            if (r8 == r1) goto L54
            if (r8 == r0) goto L51
            r0 = 4
            if (r8 != r0) goto L4b
            java.lang.String r0 = "YES"
            goto L5c
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L51:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L5c
        L54:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L5c
        L57:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L5c
        L5a:
            java.lang.String r0 = "NO"
        L5c:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L6c
        L64:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L6c:
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L79
            java.lang.String r2 = ": "
            java.lang.String r0 = defpackage.g.e(r0, r2, r1)
        L79:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.n.<init>(int, java.lang.Throwable, int, java.lang.String, int, v3.i0, int, boolean):void");
    }

    public n(String str, Throwable th, int i10, int i11, String str2, int i12, i0 i0Var, int i13, t.b bVar, long j10, boolean z10) {
        super(str, th, i10, j10);
        x6.b.q(!z10 || i11 == 1);
        x6.b.q(th != null || i11 == 3);
        this.f15519c = i11;
        this.f15520d = str2;
        this.f15521e = i12;
        this.f = i0Var;
        this.f15522o = i13;
        this.f15523p = bVar;
        this.f15524q = z10;
    }

    public final n a(t.b bVar) {
        return new n(getMessage(), getCause(), this.f15256a, this.f15519c, this.f15520d, this.f15521e, this.f, this.f15522o, bVar, this.f15257b, this.f15524q);
    }

    public final RuntimeException b() {
        x6.b.H(this.f15519c == 2);
        Throwable cause = getCause();
        cause.getClass();
        return (RuntimeException) cause;
    }
}
