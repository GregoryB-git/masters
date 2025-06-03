/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.od;
import com.yandex.metrica.impl.ob.pd;

public class rd {
    @NonNull
    private pd a;

    public rd(@NonNull pd pd2) {
        this.a = pd2;
    }

    public void a(@NonNull pd pd2) {
        this.a = pd2;
    }

    public boolean a(@NonNull Context context) {
        boolean bl = !this.a.a("android.permission.ACCESS_COARSE_LOCATION") ? false : od.a(context, "android.permission.ACCESS_COARSE_LOCATION");
        return bl;
    }

    public boolean b(@NonNull Context context) {
        boolean bl = !this.a.a("android.permission.READ_PHONE_STATE") ? false : od.a(context, "android.permission.READ_PHONE_STATE");
        return bl;
    }

    public boolean c(@NonNull Context context) {
        boolean bl = !this.a.a("android.permission.ACCESS_WIFI_STATE") ? false : od.a(context, "android.permission.ACCESS_WIFI_STATE");
        return bl;
    }
}

