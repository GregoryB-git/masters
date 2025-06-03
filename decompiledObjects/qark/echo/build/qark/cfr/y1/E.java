/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package y1;

import kotlin.jvm.internal.Intrinsics;
import y1.D;

public final class E {
    public int a;
    public D b = D.o;

    public final int a() {
        return this.a;
    }

    public final D b() {
        return this.b;
    }

    public final void c(int n8) {
        this.a = n8;
    }

    public final void d(D d8) {
        Intrinsics.checkNotNullParameter((Object)d8, "<set-?>");
        this.b = d8;
    }
}

