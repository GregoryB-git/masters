/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.I2;
import com.yandex.metrica.impl.ob.V;
import java.util.List;

public class Pc
extends V {
    @NonNull
    private final I2 b;

    public Pc(@Nullable V v2, @NonNull I2 i2) {
        super(null);
        this.b = i2;
    }

    @Override
    public void b(@Nullable Object object) {
        if ((object = (List)object) != null) {
            this.b.b(object);
        }
    }
}

