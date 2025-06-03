package X5;

import V5.n;
import V5.t;
import g6.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f {
    public static final void a(p pVar, Object obj, d completion) {
        d a7;
        d b7;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        a7 = Y5.c.a(pVar, obj, completion);
        b7 = Y5.c.b(a7);
        n.a aVar = n.f6797o;
        b7.resumeWith(n.a(t.f6803a));
    }
}
