package X5;

import X5.g;
import g6.l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b implements g.c {

    /* renamed from: o, reason: collision with root package name */
    public final l f7281o;

    /* renamed from: p, reason: collision with root package name */
    public final g.c f7282p;

    public b(g.c baseKey, l safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f7281o = safeCast;
        this.f7282p = baseKey instanceof b ? ((b) baseKey).f7282p : baseKey;
    }

    public final boolean a(g.c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this || this.f7282p == key;
    }

    public final g.b b(g.b element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (g.b) this.f7281o.invoke(element);
    }
}
