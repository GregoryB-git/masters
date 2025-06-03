/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.L5
 *  com.yandex.metrica.impl.ob.X4
 *  com.yandex.metrica.impl.ob.c0
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.L5;
import com.yandex.metrica.impl.ob.X4;
import com.yandex.metrica.impl.ob.c0;

public class b5
extends X4 {
    @NonNull
    private final L5 b;

    public b5(@NonNull L3 l32) {
        this(l32, l32.j());
    }

    @VisibleForTesting
    public b5(@NonNull L3 l32, @NonNull L5 l52) {
        super(l32);
        this.b = l52;
    }

    public boolean a(@NonNull c0 c02) {
        if (!TextUtils.isEmpty((CharSequence)c02.g())) {
            c02.a(this.b.a(c02.g()));
        }
        return false;
    }
}

