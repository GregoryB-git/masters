package u6;

import java.util.Collection;
import java.util.List;
import java.util.ServiceLoader;

/* renamed from: u6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2037g {

    /* renamed from: a, reason: collision with root package name */
    public static final Collection f19979a;

    static {
        n6.b a7;
        List e7;
        a7 = n6.f.a(ServiceLoader.load(p6.G.class, p6.G.class.getClassLoader()).iterator());
        e7 = n6.h.e(a7);
        f19979a = e7;
    }

    public static final Collection a() {
        return f19979a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
