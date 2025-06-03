/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  com.yandex.metrica.identifiers.impl.k
 *  com.yandex.metrica.identifiers.impl.o
 *  com.yandex.metrica.identifiers.impl.r
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.collections.MapsKt
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.identifiers.impl.g;
import com.yandex.metrica.identifiers.impl.i;
import com.yandex.metrica.identifiers.impl.k;
import com.yandex.metrica.identifiers.impl.o;
import com.yandex.metrica.identifiers.impl.r;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class h {
    private final Map a;

    public h(@NotNull Map map) {
        Intrinsics.checkNotNullParameter((Object)map, (String)"providers");
        this.a = map;
    }

    public /* synthetic */ h(Map object, int n) {
        object = (n & 1) != 0 ? MapsKt.mapOf((Pair[])new Pair[]{TuplesKt.to((Object)"google", (Object)new k()), TuplesKt.to((Object)"huawei", (Object)new r()), TuplesKt.to((Object)"yandex", (Object)new o())}) : null;
        this((Map)object);
    }

    @Nullable
    public final Bundle a(@NotNull Context object, @Nullable String object2) {
        Intrinsics.checkNotNullParameter((Object)object, (String)"context");
        object2 = (i)this.a.get(object2);
        object = object2 != null && (object = object2.a((Context)object)) != null ? ((g)object).a() : null;
        return object;
    }
}

