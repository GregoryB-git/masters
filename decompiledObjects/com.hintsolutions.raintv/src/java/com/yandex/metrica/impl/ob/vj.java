/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.el$b
 *  com.yandex.metrica.impl.ob.pl
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.el;
import com.yandex.metrica.impl.ob.pl;
import java.util.List;

class Vj {
    @NonNull
    private final List<Object> a;

    public Vj(@NonNull List<Object> list) {
        this.a = list;
    }

    @Nullable
    public el.b a(@NonNull String string) {
        for (pl pl2 : this.a) {
            if (!pl2.a((Object)string)) continue;
            return pl2.a();
        }
        return null;
    }
}

