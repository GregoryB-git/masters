/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.n4
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.F3;
import com.yandex.metrica.impl.ob.M4;
import com.yandex.metrica.impl.ob.V0;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.n4;

public class O4
extends M4 {
    public O4(F3 f3) {
        super(f3);
    }

    @Override
    public boolean a(@NonNull c0 object, @NonNull n4 n42) {
        object = (object = object.k()) != null ? (V0)object.getParcelable("com.yandex.metrica.impl.IdentifiersData") : null;
        this.a().a((V0)object);
        return false;
    }
}

