/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.Executor
 */
package z6;

import V2.e;
import V2.j;
import V5.n;
import V5.o;
import X5.d;
import Z5.h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p6.l;
import p6.m;
import z6.a;

public abstract class b {
    public static final Object a(j j8, d d8) {
        return b.b(j8, null, d8);
    }

    public static final Object b(j object, V2.a object2, d d8) {
        if (object.m()) {
            object2 = object.i();
            if (object2 == null) {
                if (!object.l()) {
                    return object.j();
                }
                object2 = new StringBuilder();
                object2.append("Task ");
                object2.append(object);
                object2.append(" was cancelled normally.");
                throw new CancellationException(object2.toString());
            }
            throw object2;
        }
        object2 = new m(Y5.b.b(d8), 1);
        object2.z();
        object.c(a.o, new e((l)object2){
            public final /* synthetic */ l a;
            {
                this.a = l8;
            }

            @Override
            public final void a(j object) {
                Object object2 = object.i();
                if (object2 == null) {
                    if (object.l()) {
                        l.a.a(this.a, null, 1, null);
                        return;
                    }
                    object2 = this.a;
                    n.a a8 = n.o;
                    object2.resumeWith(n.a(object.j()));
                    return;
                }
                object = this.a;
                n.a a9 = n.o;
                object.resumeWith(n.a(o.a((Throwable)object2)));
            }
        });
        object = object2.w();
        if (object == Y5.b.c()) {
            h.c(d8);
        }
        return object;
    }

}

