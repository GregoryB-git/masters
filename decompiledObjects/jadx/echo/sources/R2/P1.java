package R2;

import java.util.List;

/* loaded from: classes.dex */
public final class P1 {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f4959h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f4960a;

    /* renamed from: b, reason: collision with root package name */
    public final N1 f4961b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4962c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4963d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4964e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f4965f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f4966g;

    public P1(String str, Object obj, Object obj2, N1 n12) {
        this.f4964e = new Object();
        this.f4965f = null;
        this.f4966g = null;
        this.f4960a = str;
        this.f4962c = obj;
        this.f4963d = obj2;
        this.f4961b = n12;
    }

    public final Object a(Object obj) {
        List<P1> list;
        synchronized (this.f4964e) {
        }
        if (obj != null) {
            return obj;
        }
        if (M1.f4896a == null) {
            return this.f4962c;
        }
        synchronized (f4959h) {
            try {
                if (C0504f.a()) {
                    return this.f4966g == null ? this.f4962c : this.f4966g;
                }
                try {
                    list = K.f4818a;
                    for (P1 p12 : list) {
                        if (C0504f.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            N1 n12 = p12.f4961b;
                            if (n12 != null) {
                                obj2 = n12.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f4959h) {
                            p12.f4966g = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                N1 n13 = this.f4961b;
                if (n13 == null) {
                    return this.f4962c;
                }
                try {
                    return n13.a();
                } catch (IllegalStateException unused3) {
                    return this.f4962c;
                } catch (SecurityException unused4) {
                    return this.f4962c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.f4960a;
    }
}
