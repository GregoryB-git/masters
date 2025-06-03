/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.metrica.impl.ob.F0
 *  com.yandex.metrica.impl.ob.u0
 *  com.yandex.metrica.impl.ob.v0
 *  com.yandex.metrica.impl.ob.v3$a
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  kotlin.jvm.internal.Intrinsics
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.X;
import com.yandex.metrica.impl.ob.u0;
import com.yandex.metrica.impl.ob.v0;
import com.yandex.metrica.impl.ob.v3;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class u3
implements X<Map<String, ? extends String>> {
    public Object invoke(Object object) {
        Map map = (Map)object;
        object = F0.g();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"GlobalServiceLocator.getInstance()");
        return object.d().b((v0)new v3.a(map, u0.e));
    }
}

