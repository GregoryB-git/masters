/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Map
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.billing_interface.a;
import com.yandex.metrica.impl.ob.l;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class g {
    @NotNull
    public static final g a = new g();

    private g() {
    }

    public static void a(g object, Map map, Map map2, String string, l l5, com.yandex.metrica.billing_interface.g object22, int n4) {
        object = (n4 & 0x10) != 0 ? new com.yandex.metrica.billing_interface.g() : null;
        Intrinsics.checkNotNullParameter((Object)map, (String)"history");
        Intrinsics.checkNotNullParameter((Object)map2, (String)"newBillingInfo");
        Intrinsics.checkNotNullParameter((Object)string, (String)"type");
        Intrinsics.checkNotNullParameter((Object)l5, (String)"billingInfoManager");
        Intrinsics.checkNotNullParameter((Object)object, (String)"systemTimeProvider");
        object.getClass();
        long l8 = System.currentTimeMillis();
        for (Object object22 : map.values()) {
            if (map2.containsKey((Object)((a)object22).b)) {
                ((a)object22).e = l8;
                continue;
            }
            object = l5.a(((a)object22).b);
            if (object == null) continue;
            ((a)object22).e = ((a)object).e;
        }
        l5.a((Map<String, a>)map);
        if (!l5.a() && Intrinsics.areEqual((Object)"inapp", (Object)string)) {
            l5.b();
        }
    }
}

