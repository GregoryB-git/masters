/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  kotlin.TuplesKt
 *  kotlin.collections.ArraysKt
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.MapsKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.ranges.RangesKt
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.xf;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

public final class s9
implements Converter {
    @NotNull
    public Map<String, List<String>> a(@NotNull xf.d[] dArray) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast((int)MapsKt.mapCapacity((int)dArray.length), (int)16));
        for (xf.d d3 : dArray) {
            String string = d3.a;
            Object[] objectArray = d3.b;
            Intrinsics.checkNotNullExpressionValue((Object)objectArray, (String)"it.hosts");
            string = TuplesKt.to((Object)string, (Object)ArraysKt.toList((Object[])objectArray));
            linkedHashMap.put(string.getFirst(), string.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public xf.d[] a(@NotNull Map<String, ? extends List<String>> iterator) {
        int n2;
        int n6 = iterator.size();
        xf.d[] dArray = new xf.d[n6];
        for (n2 = 0; n2 < n6; ++n2) {
            dArray[n2] = new xf.d();
        }
        iterator = iterator.entrySet().iterator();
        n2 = 0;
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (n2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Object[] objectArray = (Object[])object;
            dArray[n2].a = (String)objectArray.getKey();
            object = dArray[n2];
            if ((objectArray = ((Collection)objectArray.getValue()).toArray((Object[])new String[0])) != null) {
                ((xf.d)((Object)object)).b = (String[])objectArray;
                ++n2;
                continue;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        return dArray;
    }
}

