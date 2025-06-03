/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.metrica.impl.ob.cd
 *  com.yandex.metrica.impl.ob.xf$l
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 *  kotlin.TuplesKt
 *  kotlin.collections.MapsKt
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.ad;
import com.yandex.metrica.impl.ob.cd;
import com.yandex.metrica.impl.ob.xf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class G9
implements Converter {
    private final cd a;

    public G9() {
        F0 f02 = F0.g();
        Intrinsics.checkNotNullExpressionValue((Object)f02, (String)"GlobalServiceLocator.getInstance()");
        f02 = f02.j();
        Intrinsics.checkNotNullExpressionValue((Object)f02, (String)"GlobalServiceLocator.get\u2026tance().modulesController");
        this.a = f02;
    }

    @NotNull
    public Map<String, Object> a(@NotNull xf.l[] lArray) {
        Map map = this.a.c();
        ArrayList arrayList = new ArrayList();
        for (xf.l l4 : lArray) {
            ad ad2 = (ad)map.get((Object)l4.a);
            ad2 = ad2 != null ? TuplesKt.to((Object)l4.a, (Object)ad2.a(l4.b)) : null;
            if (ad2 == null) continue;
            arrayList.add((Object)ad2);
        }
        return MapsKt.a((List)arrayList);
    }

    @NotNull
    public xf.l[] a(@NotNull Map<String, ? extends Object> l42) {
        Map map = this.a.c();
        ArrayList arrayList = new ArrayList();
        for (xf.l l42 : l42.entrySet()) {
            String string2 = (String)l42.getKey();
            Object object = l42.getValue();
            ad ad2 = (ad)map.get((Object)string2);
            if (ad2 != null && object != null) {
                l42 = new xf.l();
                l42.a = string2;
                l42.b = ad2.a(object);
            } else {
                l42 = null;
            }
            if (l42 == null) continue;
            arrayList.add((Object)l42);
        }
        l42 = arrayList.toArray((Object[])new xf.l[0]);
        if (l42 != null) {
            return (xf.l[])l42;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}

