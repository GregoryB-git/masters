package k3;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class o implements m3.b<Executor> {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final o f8909a = new o();
    }

    @Override // qb.a
    public final Object get() {
        return new q(Executors.newSingleThreadExecutor());
    }
}
