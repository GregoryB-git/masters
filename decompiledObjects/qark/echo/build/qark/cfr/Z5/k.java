/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 */
package Z5;

import Z5.a;
import Z5.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.v;
import org.jetbrains.annotations.NotNull;

public abstract class k
extends d
implements h {
    private final int arity;

    public k(int n8, X5.d d8) {
        super(d8);
        this.arity = n8;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @NotNull
    @Override
    public String toString() {
        if (this.getCompletion() == null) {
            String string2 = v.f(this);
            Intrinsics.checkNotNullExpressionValue(string2, "renderLambdaToString(...)");
            return string2;
        }
        return a.super.toString();
    }
}

