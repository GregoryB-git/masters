package A2;

/* renamed from: A2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329o {

    /* renamed from: b, reason: collision with root package name */
    public static C0329o f523b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0330p f524c = new C0330p(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public C0330p f525a;

    public static synchronized C0329o b() {
        C0329o c0329o;
        synchronized (C0329o.class) {
            try {
                if (f523b == null) {
                    f523b = new C0329o();
                }
                c0329o = f523b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0329o;
    }

    public C0330p a() {
        return this.f525a;
    }

    public final synchronized void c(C0330p c0330p) {
        if (c0330p == null) {
            this.f525a = f524c;
            return;
        }
        C0330p c0330p2 = this.f525a;
        if (c0330p2 == null || c0330p2.i() < c0330p.i()) {
            this.f525a = c0330p;
        }
    }
}
