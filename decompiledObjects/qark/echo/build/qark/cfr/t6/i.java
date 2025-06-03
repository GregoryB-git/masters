/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package t6;

import V5.n;
import V5.t;
import X5.g;
import Y5.b;
import Z5.d;
import Z5.h;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import p6.u0;
import s6.c;
import t6.e;
import t6.g;
import t6.j;
import t6.k;

public final class i
extends d
implements c,
Z5.e {
    public final c o;
    public final X5.g p;
    public final int q;
    public X5.g r;
    public X5.d s;

    public i(c c8, X5.g g8) {
        super(g.o, X5.h.o);
        this.o = c8;
        this.p = g8;
        this.q = ((Number)g8.u(0, .o)).intValue();
    }

    public final void a(X5.g g8, X5.g g9, Object object) {
        if (g9 instanceof e) {
            this.h((e)g9, object);
        }
        k.a(this, g8);
    }

    public final Object b(X5.d object, Object object2) {
        Object object3 = object.getContext();
        u0.d((X5.g)object3);
        X5.g g8 = this.r;
        if (g8 != object3) {
            this.a((X5.g)object3, g8, object2);
            this.r = object3;
        }
        this.s = object;
        object = j.a();
        object3 = this.o;
        Intrinsics.c(object3, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        object = object.c(object3, object2, this);
        if (!Intrinsics.a(object, b.c())) {
            this.s = null;
        }
        return object;
    }

    @Override
    public Object emit(Object object, X5.d d8) {
        try {
            object = this.b(d8, object);
        }
        catch (Throwable throwable) {
            this.r = new e(throwable, d8.getContext());
            throw throwable;
        }
        if (object == b.c()) {
            h.c(d8);
        }
        if (object == b.c()) {
            return object;
        }
        return t.a;
    }

    @Override
    public Z5.e getCallerFrame() {
        X5.d d8 = this.s;
        if (d8 instanceof Z5.e) {
            return (Z5.e)((Object)d8);
        }
        return null;
    }

    @Override
    public X5.g getContext() {
        X5.g g8;
        X5.g g9 = g8 = this.r;
        if (g8 == null) {
            g9 = X5.h.o;
        }
        return g9;
    }

    @Override
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void h(e e8, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
        stringBuilder.append((Object)e8.o);
        stringBuilder.append(", but then emission attempt of value '");
        stringBuilder.append(object);
        stringBuilder.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(kotlin.text.i.e(stringBuilder.toString()).toString());
    }

    @Override
    public Object invokeSuspend(Object object) {
        Object object2 = n.b(object);
        if (object2 != null) {
            this.r = new e((Throwable)object2, this.getContext());
        }
        if ((object2 = this.s) != null) {
            object2.resumeWith(object);
        }
        return b.c();
    }

    @Override
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

}

