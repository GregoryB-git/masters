/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.Y8
 *  java.lang.Object
 *  java.lang.Override
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Y1;
import com.yandex.metrica.impl.ob.Y8;
import org.jetbrains.annotations.NotNull;

public final class Vd
implements Y1 {
    private final Y8 a;

    @VisibleForTesting
    public Vd(@NotNull Y8 y8) {
        this.a = y8;
    }

    @Override
    public boolean a() {
        return this.a.k();
    }

    @Override
    public void b() {
        this.a.i();
    }
}

