/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 */
package p1;

import V5.t;
import b3.e;
import g6.l;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import p1.a;
import p6.P;
import p6.X;
import u.c;

public abstract class b {
    public static /* synthetic */ Object a(P p8, Object object, c.a a8) {
        return b.d(p8, object, a8);
    }

    public static final e b(P object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = c.a(new a((P)object, object2));
        Intrinsics.checkNotNullExpressionValue(object, "getFuture { completer ->\u2026        }\n    }\n    tag\n}");
        return object;
    }

    public static /* synthetic */ e c(P p8, Object object, int n8, Object object2) {
        if ((n8 & 1) != 0) {
            object = "Deferred.asListenableFuture";
        }
        return b.b(p8, object);
    }

    public static final Object d(final P p8, Object object, final c.a a8) {
        Intrinsics.checkNotNullParameter(p8, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(a8, "completer");
        p8.e(new l(){

            public final void a(Throwable throwable) {
                if (throwable != null) {
                    if (throwable instanceof CancellationException) {
                        a8.c();
                        return;
                    }
                    a8.e(throwable);
                    return;
                }
                a8.b(p8.c());
            }
        });
        return object;
    }

}

