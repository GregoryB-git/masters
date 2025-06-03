/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Arrays
 *  java.util.Map
 */
package S;

import S.a;
import S.d;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public abstract class e {
    public static final d a() {
        return new a(null, true, 1, null);
    }

    public static final /* varargs */ a b(d.b ... arrb) {
        Intrinsics.checkNotNullParameter(arrb, "pairs");
        a a8 = new a(null, false, 1, null);
        a8.g((d.b[])Arrays.copyOf((Object[])arrb, (int)arrb.length));
        return a8;
    }
}

