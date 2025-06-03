/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.core.api.ProtobufConverter
 *  com.yandex.metrica.impl.ob.Al
 *  com.yandex.metrica.impl.ob.Bl
 *  com.yandex.metrica.impl.ob.ef$e
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.math.BigDecimal
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Al;
import com.yandex.metrica.impl.ob.Bl;
import com.yandex.metrica.impl.ob.ef;
import java.math.BigDecimal;

public class xa
implements ProtobufConverter {
    @NonNull
    public ef.e a(@NonNull BigDecimal bigDecimal) {
        bigDecimal = Bl.a((BigDecimal)bigDecimal);
        Al al = new Al(((Number)bigDecimal.getFirst()).longValue(), ((Number)bigDecimal.getSecond()).intValue());
        bigDecimal = new ef.e();
        bigDecimal.a = al.b();
        bigDecimal.b = al.a();
        return bigDecimal;
    }

    @NonNull
    public Object toModel(@NonNull Object object) {
        object = (ef.e)object;
        throw new UnsupportedOperationException();
    }
}

