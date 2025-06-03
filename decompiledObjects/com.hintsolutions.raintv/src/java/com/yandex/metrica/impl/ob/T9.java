/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.core.api.ProtobufConverter
 *  com.yandex.metrica.impl.ob.ja
 *  com.yandex.metrica.impl.ob.xf$e
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.ja;
import com.yandex.metrica.impl.ob.xf;

public class t9
implements ProtobufConverter {
    @NonNull
    public ja a(@NonNull xf.e e8) {
        return new ja(e8.a, e8.b);
    }

    @NonNull
    public Object fromModel(@NonNull Object object) {
        ja ja2 = (ja)object;
        object = new xf.e();
        ((xf.e)object).a = ja2.a;
        ((xf.e)object).b = ja2.b;
        return object;
    }
}

