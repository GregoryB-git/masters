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

class v1
implements A1.e {
    public final r1 a;

    public v1(r1 r12) {
        this.a = r12;
    }

    @Override
    public void a(@NonNull Intent object) {
        if (r1.c(this.a) != null) {
            object = this.a;
            r1.b((r1)object, r1.c((r1)object));
            r1.d(this.a);
            r1.e(this.a).a(r1.c(this.a));
        }
    }
}

