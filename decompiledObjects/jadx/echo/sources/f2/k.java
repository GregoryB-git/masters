package f2;

import h2.InterfaceC1333b;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements InterfaceC1333b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final k f14215a = new k();
    }

    public static k a() {
        return a.f14215a;
    }

    public static Executor b() {
        return (Executor) h2.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // U5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
