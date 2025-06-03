/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package Z5;

import V5.n;
import V5.o;
import X5.d;
import Y5.b;
import Z5.e;
import Z5.g;
import Z5.h;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class a
implements d,
e,
Serializable {
    private final d completion;

    public a(d d8) {
        this.completion = d8;
    }

    @NotNull
    public d create(@NotNull d d8) {
        Intrinsics.checkNotNullParameter(d8, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d create(Object object, d d8) {
        Intrinsics.checkNotNullParameter(d8, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override
    public e getCallerFrame() {
        d d8 = this.completion;
        if (d8 instanceof e) {
            return (e)((Object)d8);
        }
        return null;
    }

    public final d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    public abstract Object invokeSuspend(Object var1);

    public void releaseIntercepted() {
    }

    @Override
    public final void resumeWith(@NotNull Object object) {
        d d8 = this;
        do {
            h.b(d8);
            a a8 = d8;
            d8 = a8.completion;
            Intrinsics.b(d8);
            try {
                object = a8.invokeSuspend(object);
                if (object == b.c()) {
                    return;
                }
                object = n.a(object);
            }
            catch (Throwable throwable) {
                n.a a9 = n.o;
                object = n.a(o.a(throwable));
            }
            a8.releaseIntercepted();
        } while (d8 instanceof a);
        d8.resumeWith(object);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Continuation at ");
        Object object = this.getStackTraceElement();
        if (object == null) {
            object = this.getClass().getName();
        }
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

