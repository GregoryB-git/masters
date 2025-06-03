/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package S;

import P.f;
import S.a;
import S.d;
import V5.o;
import V5.t;
import Z5.k;
import g6.p;
import kotlin.jvm.internal.Intrinsics;

public final class b
implements f {
    public final f a;

    public b(f f8) {
        Intrinsics.checkNotNullParameter(f8, "delegate");
        this.a = f8;
    }

    @Override
    public Object a(p p8, X5.d d8) {
        return this.a.a(new p(p8, null){
            public int o;
            public /* synthetic */ Object p;
            public final /* synthetic */ p q;
            {
                this.q = p8;
                super(2, d8);
            }

            public final Object a(d d8, X5.d d9) {
                return (this.create(d8, d9)).invokeSuspend(t.a);
            }

            @Override
            public final X5.d create(Object object, X5.d d8) {
                d8 = new ;
                d8.p = object;
                return d8;
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final Object invokeSuspend(Object object) {
                Object object2 = Y5.b.c();
                int n8 = this.o;
                if (n8 != 0) {
                    if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    o.b(object);
                } else {
                    o.b(object);
                    object = (d)this.p;
                    Object object3 = this.q;
                    this.o = 1;
                    object = object3 = object3.invoke(object, this);
                    if (object3 == object2) {
                        return object2;
                    }
                }
                object = (d)object;
                ((a)object).f();
                return object;
            }
        }, d8);
    }

    @Override
    public s6.b b() {
        return this.a.b();
    }

}

