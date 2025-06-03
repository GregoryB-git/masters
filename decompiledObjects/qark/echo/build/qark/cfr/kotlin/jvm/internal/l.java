/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.v;
import org.jetbrains.annotations.NotNull;

public abstract class l
implements h,
Serializable {
    private final int arity;

    public l(int n8) {
        this.arity = n8;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String string2 = v.g(this);
        Intrinsics.checkNotNullExpressionValue(string2, "renderLambdaToString(...)");
        return string2;
    }
}

