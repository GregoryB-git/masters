// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p1;

import V5.t;
import java.util.concurrent.CancellationException;
import g6.l;
import kotlin.jvm.internal.Intrinsics;
import b3.e;
import u.c;
import p6.P;

public abstract class b
{
    public static final e b(final P p2, final Object o) {
        Intrinsics.checkNotNullParameter(p2, "<this>");
        final e a = c.a((c.c)new a(p2, o));
        Intrinsics.checkNotNullExpressionValue(a, "getFuture { completer ->\u2026        }\n    }\n    tag\n}");
        return a;
    }
    
    public static final Object d(final P p3, final Object o, final c.a a) {
        Intrinsics.checkNotNullParameter(p3, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(a, "completer");
        p3.e(new l() {
            public final void a(final Throwable t) {
                if (t == null) {
                    a.b(p3.c());
                    return;
                }
                if (t instanceof CancellationException) {
                    a.c();
                    return;
                }
                a.e(t);
            }
        });
        return o;
    }
}
