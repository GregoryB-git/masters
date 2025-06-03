// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import java.util.Map;
import V5.m;

public class E extends D
{
    public static int a(final int n) {
        if (n < 0) {
            return n;
        }
        if (n < 3) {
            return n + 1;
        }
        if (n < 1073741824) {
            return (int)(n / 0.75f + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
    
    public static Map b(final m m) {
        Intrinsics.checkNotNullParameter(m, "pair");
        final Map<Object, Object> singletonMap = Collections.singletonMap(m.c(), m.d());
        Intrinsics.checkNotNullExpressionValue(singletonMap, "singletonMap(...)");
        return singletonMap;
    }
    
    public static final Map c(Map singletonMap) {
        Intrinsics.checkNotNullParameter(singletonMap, "<this>");
        final Map.Entry<K, V> entry = singletonMap.entrySet().iterator().next();
        singletonMap = Collections.singletonMap((Object)entry.getKey(), entry.getValue());
        Intrinsics.checkNotNullExpressionValue(singletonMap, "with(...)");
        return singletonMap;
    }
}
