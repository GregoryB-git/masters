/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.el;
import com.yandex.metrica.impl.ob.pl;

class Wj
implements pl {
    @NonNull
    private final String a;

    public Wj(@NonNull String string2) {
        this.a = string2;
    }

    @Override
    @NonNull
    public el.b a() {
        return el.b.g;
    }

    public boolean a(@NonNull Object object) {
        return ((String)object).contains((CharSequence)this.a);
    }
}

