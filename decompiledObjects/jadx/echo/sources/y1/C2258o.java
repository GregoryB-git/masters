package y1;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: y1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2258o {

    /* renamed from: a, reason: collision with root package name */
    public static final C2258o f21391a = new C2258o();

    /* renamed from: b, reason: collision with root package name */
    public static final String f21392b = C2258o.class.getName();

    public static final synchronized void a(C2244a accessTokenAppIdPair, C2239H appEvents) {
        synchronized (C2258o.class) {
            if (T1.a.d(C2258o.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
                Intrinsics.checkNotNullParameter(appEvents, "appEvents");
                G1.g.b();
                C2238G a7 = C2250g.a();
                a7.a(accessTokenAppIdPair, appEvents.d());
                C2250g.b(a7);
            } catch (Throwable th) {
                T1.a.b(th, C2258o.class);
            }
        }
    }

    public static final synchronized void b(C2249f eventsToPersist) {
        synchronized (C2258o.class) {
            if (T1.a.d(C2258o.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(eventsToPersist, "eventsToPersist");
                G1.g.b();
                C2238G a7 = C2250g.a();
                for (C2244a c2244a : eventsToPersist.f()) {
                    C2239H c7 = eventsToPersist.c(c2244a);
                    if (c7 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    a7.a(c2244a, c7.d());
                }
                C2250g.b(a7);
            } catch (Throwable th) {
                T1.a.b(th, C2258o.class);
            }
        }
    }
}
