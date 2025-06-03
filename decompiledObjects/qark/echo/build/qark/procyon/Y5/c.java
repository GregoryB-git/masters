// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y5;

import X5.g;
import kotlin.jvm.internal.y;
import V5.o;
import Z5.j;
import Z5.a;
import Z5.h;
import kotlin.jvm.internal.Intrinsics;
import X5.d;
import g6.p;

public abstract class c
{
    public static d a(final p p3, final Object o, d a) {
        Intrinsics.checkNotNullParameter(p3, "<this>");
        Intrinsics.checkNotNullParameter(a, "completion");
        a = h.a(a);
        if (p3 instanceof a) {
            return ((a)p3).create(o, a);
        }
        final g context = a.getContext();
        if (context == X5.h.o) {
            return new j(a) {
                public int o;
                
                @Override
                public Object invokeSuspend(final Object o) {
                    final int o2 = this.o;
                    if (o2 == 0) {
                        this.o = 1;
                        o.b(o);
                        Intrinsics.c(p3, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                        return ((p)y.b(p3, 2)).invoke(o, this);
                    }
                    if (o2 == 1) {
                        this.o = 2;
                        o.b(o);
                        return o;
                    }
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
            };
        }
        return new Z5.d(a, context) {
            public int o;
            
            @Override
            public Object invokeSuspend(final Object o) {
                final int o2 = this.o;
                if (o2 == 0) {
                    this.o = 1;
                    o.b(o);
                    Intrinsics.c(p3, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                    return ((p)y.b(p3, 2)).invoke(o, this);
                }
                if (o2 == 1) {
                    this.o = 2;
                    o.b(o);
                    return o;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        };
    }
    
    public static d b(final d d) {
        Intrinsics.checkNotNullParameter(d, "<this>");
        Z5.d d2;
        if (d instanceof Z5.d) {
            d2 = (Z5.d)d;
        }
        else {
            d2 = null;
        }
        d intercepted = d;
        if (d2 != null) {
            intercepted = d2.intercepted();
            if (intercepted == null) {
                return d;
            }
        }
        return intercepted;
    }
}
