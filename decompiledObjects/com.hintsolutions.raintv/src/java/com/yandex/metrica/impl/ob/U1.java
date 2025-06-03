/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Zl;
import com.yandex.metrica.impl.ob.r1;

class u1
implements Zl<String> {
    public final r1 a;

    public u1(r1 r12) {
        this.a = r12;
    }

    @Override
    public void b(@NonNull Object object) {
        object = (String)object;
        r1.b(this.a).a(object);
    }
}

