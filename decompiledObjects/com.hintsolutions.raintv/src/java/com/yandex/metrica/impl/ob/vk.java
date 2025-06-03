/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Uk;
import com.yandex.metrica.impl.ob.ik;
import com.yandex.metrica.impl.ob.lk;
import java.util.List;

class Vk
extends lk<Uk> {
    public Vk(@Nullable Uk uk2) {
        this(uk2, new ik(102400, 200));
    }

    @VisibleForTesting
    public Vk(@Nullable Uk uk2, @NonNull ik ik2) {
        super(uk2, ik2);
    }

    @Override
    public List a(@NonNull Object object) {
        return ((Uk)object).p;
    }

    @Override
    public int b(@NonNull Object object) {
        return ((Uk)object).k;
    }
}

