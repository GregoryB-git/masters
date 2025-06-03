/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.in
 *  com.yandex.metrica.impl.ob.mn
 *  com.yandex.metrica.impl.ob.mn$a
 *  java.lang.Object
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.in;
import com.yandex.metrica.impl.ob.mn;
import java.util.Map;

public class en<T, R>
implements in<T, R> {
    @NonNull
    public mn<Map<T, R>> a(@NonNull Map<T, R> map) {
        return new mn(mn.a.a, map);
    }

    @NonNull
    public mn get(@NonNull Object object) {
        object = (Map)object;
        return new mn(mn.a.a, object);
    }
}

