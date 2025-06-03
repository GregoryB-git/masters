/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.m3;
import com.yandex.metrica.impl.ob.n3;
import com.yandex.metrica.impl.ob.q3;
import com.yandex.metrica.impl.ob.r1;

class s1
implements m3<q3> {
    public final r1 a;

    public s1(r1 r12) {
        this.a = r12;
    }

    @Override
    public boolean a(n3 n32) {
        n32 = (q3)n32;
        return r1.a(this.a).getPackageName().equals((Object)((q3)n32).a) ^ true;
    }
}

