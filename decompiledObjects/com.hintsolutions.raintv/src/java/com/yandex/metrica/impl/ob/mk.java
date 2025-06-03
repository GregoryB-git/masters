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

public class Mk
implements pl {
    private final int a;

    public Mk(int n2) {
        this.a = n2;
    }

    @Override
    @NonNull
    public el.b a() {
        return el.b.b;
    }

    public boolean a(@NonNull Object object) {
        boolean bl = ((String)object).length() > this.a;
        return bl;
    }
}

