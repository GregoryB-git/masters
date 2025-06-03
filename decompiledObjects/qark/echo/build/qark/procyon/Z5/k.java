// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z5;

import org.jetbrains.annotations.NotNull;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.h;

public abstract class k extends d implements h
{
    private final int arity;
    
    public k(final int arity, final X5.d d) {
        super(d);
        this.arity = arity;
    }
    
    @Override
    public int getArity() {
        return this.arity;
    }
    
    @NotNull
    @Override
    public String toString() {
        if (this.getCompletion() == null) {
            final String f = v.f(this);
            Intrinsics.checkNotNullExpressionValue(f, "renderLambdaToString(...)");
            return f;
        }
        return super.toString();
    }
}
