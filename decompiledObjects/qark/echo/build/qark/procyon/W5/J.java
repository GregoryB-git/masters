// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import kotlin.jvm.internal.Intrinsics;
import java.util.Collections;
import java.util.Set;

public class J
{
    public static Set a(final Object o) {
        final Set<Object> singleton = Collections.singleton(o);
        Intrinsics.checkNotNullExpressionValue(singleton, "singleton(...)");
        return singleton;
    }
}
