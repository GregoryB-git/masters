/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Pl;
import com.yandex.metrica.impl.ob.U3;
import com.yandex.metrica.impl.ob.a7;
import com.yandex.metrica.impl.ob.z0;

@Deprecated
public class g7
implements a7<String> {
    @NonNull
    private final U3 a;

    public g7(@NonNull U3 u3) {
        this.a = u3;
    }

    @Override
    public void a(@NonNull Object object) {
        object = (String)object;
        this.a.a(z0.b((String)object, Pl.a()));
    }

    @Override
    public void b(@NonNull Object object) {
        object = (String)object;
        this.a.a(z0.a((String)object, Pl.a()));
    }
}

