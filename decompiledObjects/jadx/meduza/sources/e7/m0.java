package e7;

/* loaded from: classes.dex */
public final class m0<V> {
    public static final Object f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f4477a;

    /* renamed from: b, reason: collision with root package name */
    public final l0<V> f4478b;

    /* renamed from: c, reason: collision with root package name */
    public final V f4479c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4480d;

    /* renamed from: e, reason: collision with root package name */
    public volatile V f4481e;

    public m0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m0(String str, Object obj, l0 l0Var) {
        this.f4480d = new Object();
        this.f4481e = null;
        this.f4477a = str;
        this.f4479c = obj;
        this.f4478b = l0Var;
    }

    public final V a(V v10) {
        synchronized (this.f4480d) {
        }
        if (v10 != null) {
            return v10;
        }
        if (x6.b.f17193c == null) {
            return this.f4479c;
        }
        synchronized (f) {
            if (nc.g0.d()) {
                return this.f4481e == null ? this.f4479c : this.f4481e;
            }
            try {
                for (m0<?> m0Var : h0.f4230a) {
                    if (nc.g0.d()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V v11 = null;
                    try {
                        l0<?> l0Var = m0Var.f4478b;
                        if (l0Var != null) {
                            v11 = (V) l0Var.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f) {
                        m0Var.f4481e = v11;
                    }
                }
            } catch (SecurityException unused2) {
            }
            l0<V> l0Var2 = this.f4478b;
            if (l0Var2 == null) {
                return this.f4479c;
            }
            try {
                return l0Var2.zza();
            } catch (IllegalStateException unused3) {
                return this.f4479c;
            } catch (SecurityException unused4) {
                return this.f4479c;
            }
        }
    }
}
