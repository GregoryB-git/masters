// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z5;

import V5.o;
import V5.n;
import Y5.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.io.Serializable;
import X5.d;

public abstract class a implements d, e, Serializable
{
    private final d completion;
    
    public a(final d completion) {
        this.completion = completion;
    }
    
    @NotNull
    public d create(@NotNull final d d) {
        Intrinsics.checkNotNullParameter(d, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }
    
    public d create(final Object o, final d d) {
        Intrinsics.checkNotNullParameter(d, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
    
    @Override
    public e getCallerFrame() {
        final d completion = this.completion;
        if (completion instanceof e) {
            return (e)completion;
        }
        return null;
    }
    
    public final d getCompletion() {
        return this.completion;
    }
    
    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }
    
    public abstract Object invokeSuspend(final Object p0);
    
    public void releaseIntercepted() {
    }
    
    @Override
    public final void resumeWith(@NotNull Object o) {
        d completion = this;
        do {
            h.b(completion);
            final a a = (a)completion;
            completion = a.completion;
            Intrinsics.b(completion);
            try {
                o = a.invokeSuspend(o);
                if (o == b.c()) {
                    return;
                }
                o = n.a(o);
            }
            finally {
                final n.a o2 = n.o;
                final Throwable t;
                o = n.a(o.a(t));
            }
            a.releaseIntercepted();
        } while (completion instanceof a);
        completion.resumeWith(o);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Serializable obj = this.getStackTraceElement();
        if (obj == null) {
            obj = this.getClass().getName();
        }
        sb.append(obj);
        return sb.toString();
    }
}
