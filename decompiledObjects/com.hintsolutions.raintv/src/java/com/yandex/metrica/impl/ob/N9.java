/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.core.api.ProtobufConverter
 *  com.yandex.metrica.impl.ob.i
 *  com.yandex.metrica.impl.ob.xf$b
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.i;
import com.yandex.metrica.impl.ob.xf;

public class n9
implements ProtobufConverter {
    @NonNull
    public i a(@NonNull xf.b b3) {
        return new i(b3.a, b3.b);
    }

    @NonNull
    public Object fromModel(@NonNull Object object) {
        object = (i)object;
        xf.b b3 = new xf.b();
        b3.a = ((i)object).a;
        b3.b = ((i)object).b;
        return b3;
    }
}

