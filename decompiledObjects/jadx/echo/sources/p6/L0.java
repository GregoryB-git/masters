package p6;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public static final L0 f18501a = new L0();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f18502b = u6.K.a(new u6.F("ThreadLocalEventLoop"));

    public final AbstractC1837a0 a() {
        return (AbstractC1837a0) f18502b.get();
    }

    public final AbstractC1837a0 b() {
        ThreadLocal threadLocal = f18502b;
        AbstractC1837a0 abstractC1837a0 = (AbstractC1837a0) threadLocal.get();
        if (abstractC1837a0 != null) {
            return abstractC1837a0;
        }
        AbstractC1837a0 a7 = AbstractC1843d0.a();
        threadLocal.set(a7);
        return a7;
    }

    public final void c() {
        f18502b.set(null);
    }

    public final void d(AbstractC1837a0 abstractC1837a0) {
        f18502b.set(abstractC1837a0);
    }
}
