/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.metrica.core.api.ProtobufConverter
 *  com.yandex.metrica.impl.ob.w0
 *  com.yandex.metrica.impl.ob.xf$g
 *  java.lang.Object
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.w0;
import com.yandex.metrica.impl.ob.xf;
import org.jetbrains.annotations.NotNull;

public final class v9
implements ProtobufConverter {
    @NotNull
    public w0 a(@NotNull xf.g g2) {
        return new w0(g2.a);
    }

    public Object fromModel(Object object) {
        object = (w0)object;
        xf.g g2 = new xf.g();
        g2.a = object.a();
        return g2;
    }
}

