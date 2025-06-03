/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package u6;

import kotlin.jvm.internal.Intrinsics;
import u6.F;
import u6.q;
import u6.z;

public abstract class p {
    public static final Object a = new F("CONDITION_FALSE");

    public static final Object a() {
        return a;
    }

    public static final q b(Object object) {
        Object object2;
        block3 : {
            block2 : {
                object2 = object instanceof z ? (z)object : null;
                if (object2 == null) break block2;
                q q8 = object2.a;
                object2 = q8;
                if (q8 != null) break block3;
            }
            Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            object2 = (q)object;
        }
        return object2;
    }
}

