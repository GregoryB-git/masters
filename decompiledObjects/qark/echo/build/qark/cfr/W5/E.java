/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package W5;

import V5.m;
import W5.D;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public class E
extends D {
    public static int a(int n8) {
        if (n8 < 0) {
            return n8;
        }
        if (n8 < 3) {
            return n8 + 1;
        }
        if (n8 < 1073741824) {
            return (int)((float)n8 / 0.75f + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map b(m m8) {
        Intrinsics.checkNotNullParameter(m8, "pair");
        m8 = Collections.singletonMap((Object)m8.c(), (Object)m8.d());
        Intrinsics.checkNotNullExpressionValue(m8, "singletonMap(...)");
        return m8;
    }

    public static final Map c(Map map) {
        Intrinsics.checkNotNullParameter((Object)map, "<this>");
        map = (Map.Entry)map.entrySet().iterator().next();
        map = Collections.singletonMap((Object)map.getKey(), (Object)map.getValue());
        Intrinsics.checkNotNullExpressionValue((Object)map, "with(...)");
        return map;
    }
}

