/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.metrica.impl.ob.cd
 *  java.lang.Object
 *  java.lang.String
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.Hi;
import com.yandex.metrica.impl.ob.ad;
import com.yandex.metrica.impl.ob.cd;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class zi {
    private final cd a;

    public zi() {
        F0 f02 = F0.g();
        Intrinsics.checkNotNullExpressionValue((Object)f02, (String)"GlobalServiceLocator.getInstance()");
        f02 = f02.j();
        Intrinsics.checkNotNullExpressionValue((Object)f02, (String)"GlobalServiceLocator.get\u2026tance().modulesController");
        this.a = f02;
    }

    public final void a(@NotNull Hi hi2, @NotNull Gl.a object) {
        Map map2 = this.a.c();
        object = new Function1<Map.Entry<? extends String, ? extends ad>, Object>((Gl.a)((Object)object)){
            public final Gl.a a;
            {
                this.a = a2;
                super(1);
            }

            public Object invoke(Object object) {
                return ((ad)((Map.Entry)object).getValue()).a(this.a);
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map map2 : map2.entrySet()) {
            Object object2 = object.invoke(map2);
            if (object2 == null) continue;
            linkedHashMap.put(map2.getKey(), object2);
        }
        hi2.b((Map<String, Object>)linkedHashMap);
    }
}

