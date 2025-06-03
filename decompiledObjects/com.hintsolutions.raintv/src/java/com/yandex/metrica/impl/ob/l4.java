/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.F4;
import com.yandex.metrica.impl.ob.K4;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.S4;
import com.yandex.metrica.impl.ob.c0;

public class L4<T extends S4, C extends L3>
extends F4<T, C> {
    public L4(K4<T> k42, C c3) {
        super(k42, c3);
    }

    public boolean a(c0 c02) {
        return this.a(c02, new F4.a<T>(this){

            @Override
            public boolean a(Object object, c0 c02) {
                return ((S4)object).a(c02);
            }
        });
    }
}

