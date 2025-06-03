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
import com.yandex.metrica.impl.ob.Ok;
import com.yandex.metrica.impl.ob.dk;

public class Nk
implements dk {
    private final int a;

    public Nk(int n2) {
        this.a = n2;
    }

    @Override
    public void a(@NonNull Ok ok) {
        if (ok.h.length() > this.a) {
            String string2;
            int n2 = ok.h.length();
            int n3 = this.a;
            ok.h = string2 = ok.h.substring(0, n3);
            ok.j = string2.length() + (n2 - n3);
        }
    }
}

