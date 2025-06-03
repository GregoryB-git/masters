/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package Y5;

import V5.o;
import X5.g;
import Z5.a;
import Z5.d;
import Z5.h;
import Z5.j;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;

public abstract class c {
    public static X5.d a(final p p8, final Object object, X5.d d8) {
        Intrinsics.checkNotNullParameter(p8, "<this>");
        Intrinsics.checkNotNullParameter(d8, "completion");
        d8 = h.a(d8);
        if (p8 instanceof a) {
            return ((a)((Object)p8)).create(object, d8);
        }
        g g8 = d8.getContext();
        if (g8 == X5.h.o) {
            return new j(d8){
                public int o;
                {
                    Intrinsics.c(d8, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                    super(d8);
                }

                @Override
                public Object invokeSuspend(Object object2) {
                    int n8 = this.o;
                    if (n8 != 0) {
                        if (n8 == 1) {
                            this.o = 2;
                            o.b(object2);
                            return object2;
                        }
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.o = 1;
                    o.b(object2);
                    Intrinsics.c(p8, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                    return ((p)y.b(p8, 2)).invoke(object, this);
                }
            };
        }
        return new d(d8, g8){
            public int o;
            {
                Intrinsics.c(d8, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super(d8, g8);
            }

            @Override
            public Object invokeSuspend(Object object2) {
                int n8 = this.o;
                if (n8 != 0) {
                    if (n8 == 1) {
                        this.o = 2;
                        o.b(object2);
                        return object2;
                    }
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.o = 1;
                o.b(object2);
                Intrinsics.c(p8, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p)y.b(p8, 2)).invoke(object, this);
            }
        };
    }

    public static X5.d b(X5.d d8) {
        Intrinsics.checkNotNullParameter(d8, "<this>");
        d d9 = d8 instanceof d ? (d)d8 : null;
        X5.d d10 = d8;
        if (d9 != null && (d10 = d9.intercepted()) == null) {
            return d8;
        }
        return d10;
    }

}

