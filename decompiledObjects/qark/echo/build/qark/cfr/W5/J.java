/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.Set
 */
package W5;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public class J {
    public static Set a(Object object) {
        object = Collections.singleton((Object)object);
        Intrinsics.checkNotNullExpressionValue(object, "singleton(...)");
        return object;
    }
}

