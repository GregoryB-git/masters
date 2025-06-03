package l3;

import g3.AbstractC1318a;
import java.security.GeneralSecurityException;
import p3.J;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17224a = new k().d();

    /* renamed from: b, reason: collision with root package name */
    public static final J f17225b;

    /* renamed from: c, reason: collision with root package name */
    public static final J f17226c;

    /* renamed from: d, reason: collision with root package name */
    public static final J f17227d;

    static {
        J V6 = J.V();
        f17225b = V6;
        f17226c = V6;
        f17227d = V6;
        try {
            a();
        } catch (GeneralSecurityException e7) {
            throw new ExceptionInInitializerError(e7);
        }
    }

    public static void a() {
        b();
    }

    public static void b() {
        r.f();
        h.d();
        k.p(true);
        if (AbstractC1318a.a()) {
            return;
        }
        C1606c.o(true);
    }
}
