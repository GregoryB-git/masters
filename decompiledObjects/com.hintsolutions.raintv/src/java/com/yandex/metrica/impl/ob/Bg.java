/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Tf;
import com.yandex.metrica.impl.ob.U3;
import com.yandex.metrica.impl.ob.Yf;
import com.yandex.metrica.impl.ob.Zf;

public class bg
implements Zf {
    @NonNull
    private final Yf a;

    public bg(@NonNull Yf yf2) {
        this.a = yf2;
    }

    @Override
    public boolean a(@Nullable Tf tf2) {
        boolean bl2 = tf2 != null && !((U3)this.a).w().f();
        return bl2;
    }
}

