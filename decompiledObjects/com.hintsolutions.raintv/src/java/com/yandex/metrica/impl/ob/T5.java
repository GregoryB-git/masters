/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.F3
 *  com.yandex.metrica.impl.ob.O4
 *  com.yandex.metrica.impl.ob.P4
 *  com.yandex.metrica.impl.ob.Q4
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.F3;
import com.yandex.metrica.impl.ob.H2;
import com.yandex.metrica.impl.ob.M4;
import com.yandex.metrica.impl.ob.O4;
import com.yandex.metrica.impl.ob.Oc;
import com.yandex.metrica.impl.ob.P4;
import com.yandex.metrica.impl.ob.Q4;
import com.yandex.metrica.impl.ob.oc;

public class t5 {
    private final O4 a;
    @NonNull
    private final P4 b;
    private final Q4 c;

    public t5(F3 f32) {
        this.a = new O4(f32);
        this.b = new P4(f32);
        this.c = new Q4(f32, F0.g().u(), new Oc(oc.a(f32.b()), H2.a(f32.b()), F0.g().s()));
    }

    public O4 a() {
        return this.a;
    }

    @NonNull
    public P4 b() {
        return this.b;
    }

    public M4 c() {
        return this.c;
    }
}

