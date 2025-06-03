package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class l implements h, Serializable {
    private final int arity;

    public l(int i7) {
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String g7 = v.g(this);
        Intrinsics.checkNotNullExpressionValue(g7, "renderLambdaToString(...)");
        return g7;
    }
}
