/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.A1;
import com.yandex.metrica.impl.ob.r1;

class w1
implements A1.e {
    public final r1 a;

    public w1(r1 r12) {
        this.a = r12;
    }

    @Override
    public void a(@NonNull Intent intent) {
        r1.a(this.a, intent);
    }
}

