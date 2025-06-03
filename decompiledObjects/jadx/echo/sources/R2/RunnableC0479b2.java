package R2;

/* renamed from: R2.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0479b2 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5204o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5205p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f5206q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f5207r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5208s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y1 f5209t;

    public RunnableC0479b2(Y1 y12, int i7, String str, Object obj, Object obj2, Object obj3) {
        this.f5209t = y12;
        this.f5204o = i7;
        this.f5205p = str;
        this.f5206q = obj;
        this.f5207r = obj2;
        this.f5208s = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c7;
        long j7;
        char c8;
        long j8;
        Y1 y12;
        char c9;
        C0549l2 F6 = this.f5209t.f5424a.F();
        if (!F6.r()) {
            this.f5209t.y(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c7 = this.f5209t.f5147c;
        if (c7 == 0) {
            if (this.f5209t.f().T()) {
                y12 = this.f5209t;
                c9 = 'C';
            } else {
                y12 = this.f5209t;
                c9 = 'c';
            }
            y12.f5147c = c9;
        }
        j7 = this.f5209t.f5148d;
        if (j7 < 0) {
            this.f5209t.f5148d = 82001L;
        }
        char charAt = "01VDIWEA?".charAt(this.f5204o);
        c8 = this.f5209t.f5147c;
        j8 = this.f5209t.f5148d;
        String str = "2" + charAt + c8 + j8 + ":" + Y1.x(true, this.f5205p, this.f5206q, this.f5207r, this.f5208s);
        if (str.length() > 1024) {
            str = this.f5205p.substring(0, 1024);
        }
        C0577p2 c0577p2 = F6.f5387d;
        if (c0577p2 != null) {
            c0577p2.b(str, 1L);
        }
    }
}
