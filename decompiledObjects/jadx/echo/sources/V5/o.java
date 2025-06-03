package V5;

import V5.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class o {
    public static final Object a(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new n.b(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof n.b) {
            throw ((n.b) obj).f6798o;
        }
    }
}
