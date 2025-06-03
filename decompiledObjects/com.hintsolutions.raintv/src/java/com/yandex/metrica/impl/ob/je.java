/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.nf$a
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Be;
import com.yandex.metrica.impl.ob.Jm;
import com.yandex.metrica.impl.ob.Se;
import com.yandex.metrica.impl.ob.nf;

public class Je
implements Be {
    @NonNull
    private final Jm a;

    public Je(@NonNull Jm jm) {
        this.a = jm;
    }

    @Override
    @Nullable
    public nf.a a(@NonNull Se se, @NonNull nf.a a2) {
        if (se.a() == this.a.a()) {
            if (se.a(a2.b, new String(a2.a)) != null) {
                se.a(a2);
            }
        } else if (se.a() < this.a.a()) {
            se.a(a2);
            se.b();
        }
        return a2;
    }
}

