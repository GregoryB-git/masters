package Z5;

import V5.n;
import V5.o;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class a implements X5.d, e, Serializable {
    private final X5.d completion;

    public a(X5.d dVar) {
        this.completion = dVar;
    }

    @NotNull
    public X5.d create(@NotNull X5.d completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // Z5.e
    public e getCallerFrame() {
        X5.d dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final X5.d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // X5.d
    public final void resumeWith(@NotNull Object obj) {
        Object invokeSuspend;
        Object c7;
        X5.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            X5.d dVar2 = aVar.completion;
            Intrinsics.b(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
                c7 = Y5.d.c();
            } catch (Throwable th) {
                n.a aVar2 = n.f6797o;
                obj = n.a(o.a(th));
            }
            if (invokeSuspend == c7) {
                return;
            }
            obj = n.a(invokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public X5.d create(Object obj, X5.d completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
