/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package O1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;

public final class z {
    public static final z a = new z();
    public static volatile String b;

    public static final String a() {
        return b;
    }

    public static final boolean b() {
        String string2 = b;
        Boolean bl = null;
        if (string2 != null) {
            bl = i.s(string2, "Unity.", false, 2, null);
        }
        return Intrinsics.a((Object)bl, (Object)Boolean.TRUE);
    }
}

