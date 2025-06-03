/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.X4
 *  java.lang.Object
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.D5;
import com.yandex.metrica.impl.ob.X4;
import com.yandex.metrica.impl.ob.a1;
import com.yandex.metrica.impl.ob.z0;
import java.util.List;

public class s5 {
    private final D5 a;

    public s5(@NonNull D5 d5) {
        this.a = d5;
    }

    public void a(@NonNull a1 a12, @NonNull List<X4> list) {
        if (z0.b(a12)) {
            list.add((Object)this.a.v());
        }
        if (z0.a(a12)) {
            list.add((Object)this.a.p());
        }
    }
}

