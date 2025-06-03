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
import Y5.b;
import Z5.k;
import g6.p;

public abstract class g {
    public static final Object a(f f8, p p8, X5.d d8) {
        return f8.a(new p(p8, null){
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

            @Override
            public final Object invokeSuspend(Object object) {
                Object object2 = b.c();
                int n8 = this.o;
                if (n8 != 0) {
                    if (n8 == 1) {
                        object2 = (a)this.p;
                        o.b(object);
                        return object2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(object);
                object = ((d)this.p).c();
                p p8 = this.q;
                this.p = object;
                this.o = 1;
                if (p8.invoke(object, this) == object2) {
                    return object2;
                }
                return object;
            }
        }, d8);
    }

}

