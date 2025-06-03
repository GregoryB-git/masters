/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.vn;
import com.yandex.metrica.impl.ob.xn;
import java.util.Map;

public class zn
implements xn<String> {
    private final Map<String, ?> a;

    public zn(@NonNull Map<String, ?> map) {
        this.a = map;
    }

    @Override
    public vn a(@Nullable Object object) {
        object = this.a.containsKey(object = (String)object) ? vn.a(this, String.format((String)"Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", (Object[])new Object[]{object})) : vn.a(this);
        return object;
    }
}

