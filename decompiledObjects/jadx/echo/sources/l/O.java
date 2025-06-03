package l;

/* loaded from: classes.dex */
public class O {

    /* renamed from: a, reason: collision with root package name */
    public int f16357a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f16358b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f16359c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f16360d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f16361e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f16362f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16363g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16364h = false;

    public int a() {
        return this.f16363g ? this.f16357a : this.f16358b;
    }

    public int b() {
        return this.f16357a;
    }

    public int c() {
        return this.f16358b;
    }

    public int d() {
        return this.f16363g ? this.f16358b : this.f16357a;
    }

    public void e(int i7, int i8) {
        this.f16364h = false;
        if (i7 != Integer.MIN_VALUE) {
            this.f16361e = i7;
            this.f16357a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f16362f = i8;
            this.f16358b = i8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f16363g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f16363g = r2
            boolean r0 = r1.f16364h
            if (r0 == 0) goto L2d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1f
            int r2 = r1.f16360d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f16361e
        L16:
            r1.f16357a = r2
            int r2 = r1.f16359c
            if (r2 == r0) goto L31
        L1c:
            r1.f16358b = r2
            goto L34
        L1f:
            int r2 = r1.f16359c
            if (r2 == r0) goto L24
            goto L26
        L24:
            int r2 = r1.f16361e
        L26:
            r1.f16357a = r2
            int r2 = r1.f16360d
            if (r2 == r0) goto L31
            goto L1c
        L2d:
            int r2 = r1.f16361e
            r1.f16357a = r2
        L31:
            int r2 = r1.f16362f
            goto L1c
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.O.f(boolean):void");
    }

    public void g(int i7, int i8) {
        this.f16359c = i7;
        this.f16360d = i8;
        this.f16364h = true;
        if (this.f16363g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f16357a = i8;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f16358b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f16357a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f16358b = i8;
        }
    }
}
