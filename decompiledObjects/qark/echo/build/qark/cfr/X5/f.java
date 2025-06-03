/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package X5;

import V5.n;
import V5.t;
import X5.d;
import Y5.b;
import g6.p;
import kotlin.jvm.internal.Intrinsics;

public abstract class f {
    public static final void a(p object, Object object2, d d8) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(d8, "completion");
        object = b.b(b.a((p)object, object2, d8));
        object2 = n.o;
        object.resumeWith(n.a(t.a));
    }
}

