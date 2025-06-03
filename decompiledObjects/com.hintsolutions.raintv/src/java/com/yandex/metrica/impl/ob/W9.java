/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.metrica.core.api.ProtobufConverter
 *  com.yandex.metrica.impl.ob.Hh
 *  com.yandex.metrica.impl.ob.xf$h
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Hh;
import com.yandex.metrica.impl.ob.xf;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class w9
implements ProtobufConverter {
    @NotNull
    public Hh a(@NotNull xf.h h3) {
        String string = h3.a;
        Intrinsics.checkNotNullExpressionValue((Object)string, (String)"nano.url");
        return new Hh(string, h3.b, h3.c, h3.d, h3.e);
    }

    @NotNull
    public xf.h a(@NotNull Hh hh) {
        xf.h h3 = new xf.h();
        h3.a = hh.c();
        h3.b = hh.b();
        h3.c = hh.a();
        h3.e = hh.e();
        h3.d = hh.d();
        return h3;
    }
}

