/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 */
package kotlin.jvm.internal;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;

public abstract class b {
    public static final Iterator a(Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "array");
        return new a(arrobject);
    }
}

