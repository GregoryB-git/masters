/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.metrica.core.api.ProtobufConverter
 *  com.yandex.metrica.impl.ob.qf
 *  com.yandex.metrica.impl.ob.qf$a
 *  com.yandex.metrica.impl.ob.qf$b
 *  com.yandex.metrica.impl.ob.qf$b$a
 *  com.yandex.metrica.impl.ob.u0
 *  com.yandex.metrica.impl.ob.v3
 *  com.yandex.metrica.impl.ob.v3$a
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  kotlin.TuplesKt
 *  kotlin.collections.MapsKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.ranges.RangesKt
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.qf;
import com.yandex.metrica.impl.ob.u0;
import com.yandex.metrica.impl.ob.v3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

public final class r9
implements ProtobufConverter {
    private final qf.a a(v3.a a8) {
        int n2;
        qf.a a10 = new qf.a();
        Object object = a8.b();
        int n3 = 0;
        if (object != null) {
            qf.b b3 = new qf.b();
            int n4 = object.size();
            Iterator iterator = new qf.b.a[n4];
            for (n2 = 0; n2 < n4; ++n2) {
                iterator[n2] = new qf.b.a();
            }
            b3.a = iterator;
            iterator = object.entrySet().iterator();
            n2 = 0;
            while (true) {
                object = b3;
                if (iterator.hasNext()) {
                    Map.Entry entry = (Map.Entry)iterator.next();
                    object = (String)entry.getKey();
                    String string = (String)entry.getValue();
                    entry = b3.a[n2];
                    entry.a = object;
                    entry.b = string;
                    ++n2;
                    continue;
                }
                break;
            }
        } else {
            object = null;
        }
        a10.a = object;
        n2 = a8.a().ordinal();
        n2 = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? n3 : 3) : 2) : 1;
        a10.b = n2;
        return a10;
    }

    private final v3.a a(qf.a a8) {
        Object object = a8.a;
        object = object != null ? this.a((qf.b)object) : null;
        int n2 = a8.b;
        a8 = n2 != 0 ? (n2 != 1 ? (n2 != 2 ? (n2 != 3 ? u0.b : u0.e) : u0.d) : u0.c) : u0.b;
        return new v3.a(object, (u0)a8);
    }

    private final Map<String, String> a(qf.b b3) {
        qf.b.a[] aArray = b3.a;
        Intrinsics.checkNotNullExpressionValue((Object)aArray, (String)"proto.pairs");
        b3 = new LinkedHashMap(RangesKt.coerceAtLeast((int)MapsKt.mapCapacity((int)aArray.length), (int)16));
        for (qf.b.a a8 : aArray) {
            a8 = TuplesKt.to((Object)a8.a, (Object)a8.b);
            b3.put(a8.getFirst(), a8.getSecond());
        }
        return b3;
    }

    public Object fromModel(Object object) {
        object = (v3)object;
        qf qf2 = new qf();
        qf2.a = this.a(object.c());
        int n2 = object.a().size();
        qf.a[] aArray = new qf.a[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            aArray[i2] = this.a((v3.a)object.a().get(i2));
        }
        qf2.b = aArray;
        return qf2;
    }

    public Object toModel(Object object) {
        qf qf22 = (qf)object;
        object = qf22.a;
        if (object == null) {
            object = new qf.a();
        }
        object = this.a((qf.a)object);
        qf.a[] aArray = qf22.b;
        Intrinsics.checkNotNullExpressionValue((Object)aArray, (String)"nano.candidates");
        ArrayList arrayList = new ArrayList(aArray.length);
        for (qf.a a8 : aArray) {
            Intrinsics.checkNotNullExpressionValue((Object)a8, (String)"it");
            arrayList.add((Object)this.a(a8));
        }
        return new v3((v3.a)object, (List)arrayList);
    }
}

