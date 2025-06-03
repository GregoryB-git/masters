/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.core.api.ProtobufConverter
 *  com.yandex.metrica.impl.ob.Ch
 *  com.yandex.metrica.impl.ob.xf$c
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Ch;
import com.yandex.metrica.impl.ob.xf;

public class q9
implements ProtobufConverter {
    @NonNull
    public Ch a(@NonNull xf.c c2) {
        return new Ch(c2.a, c2.b, c2.c, c2.d);
    }

    @NonNull
    public xf.c a(@NonNull Ch ch) {
        xf.c c2 = new xf.c();
        c2.a = ch.a;
        c2.b = ch.b;
        c2.c = ch.c;
        c2.d = ch.d;
        return c2;
    }
}

