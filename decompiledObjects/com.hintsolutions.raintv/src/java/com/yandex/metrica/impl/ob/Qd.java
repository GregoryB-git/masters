/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.pd;

class qd
implements pd {
    private final boolean a;

    public qd(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public boolean a(@NonNull String string) {
        if (!"android.permission.ACCESS_FINE_LOCATION".equals((Object)string) && !"android.permission.ACCESS_COARSE_LOCATION".equals((Object)string)) {
            return true;
        }
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("LocationFlagStrategy{mEnabled=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

