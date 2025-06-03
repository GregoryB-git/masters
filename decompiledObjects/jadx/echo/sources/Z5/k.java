package Z5;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class k extends d implements kotlin.jvm.internal.h {
    private final int arity;

    public k(int i7, X5.d dVar) {
        super(dVar);
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // Z5.a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String f7 = v.f(this);
        Intrinsics.checkNotNullExpressionValue(f7, "renderLambdaToString(...)");
        return f7;
    }
}
