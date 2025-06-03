// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;
import java.io.Serializable;

public abstract class l implements h, Serializable
{
    private final int arity;
    
    public l(final int arity) {
        this.arity = arity;
    }
    
    @Override
    public int getArity() {
        return this.arity;
    }
    
    @NotNull
    @Override
    public String toString() {
        final String g = v.g(this);
        Intrinsics.checkNotNullExpressionValue(g, "renderLambdaToString(...)");
        return g;
    }
}
