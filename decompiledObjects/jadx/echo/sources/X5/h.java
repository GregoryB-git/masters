package X5;

import X5.g;
import g6.p;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements g, Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final h f7293o = new h();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return f7293o;
    }

    @Override // X5.g
    public g.b b(g.c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // X5.g
    public g k(g context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // X5.g
    public Object u(Object obj, p operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return obj;
    }

    @Override // X5.g
    public g x(g.c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this;
    }
}
