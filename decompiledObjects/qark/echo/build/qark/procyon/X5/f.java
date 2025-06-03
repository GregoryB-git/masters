// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X5;

import V5.t;
import V5.n;
import Y5.b;
import kotlin.jvm.internal.Intrinsics;
import g6.p;

public abstract class f
{
    public static final void a(final p p3, final Object o, final d d) {
        Intrinsics.checkNotNullParameter(p3, "<this>");
        Intrinsics.checkNotNullParameter(d, "completion");
        final d b = Y5.b.b(Y5.b.a(p3, o, d));
        final n.a o2 = n.o;
        b.resumeWith(n.a(t.a));
    }
}
