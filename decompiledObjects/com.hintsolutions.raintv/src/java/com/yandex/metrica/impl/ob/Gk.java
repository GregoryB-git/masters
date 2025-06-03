/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.el;
import com.yandex.metrica.impl.ob.pl;

public class gk
implements pl {
    @NonNull
    private final String a;

    public gk(@NonNull String string) {
        this.a = string;
    }

    @Override
    @NonNull
    public el.b a() {
        return el.b.f;
    }

    public boolean a(@NonNull Object object) {
        return ((String)object).equals((Object)this.a);
    }
}

