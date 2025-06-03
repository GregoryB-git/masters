/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Mj;
import com.yandex.metrica.impl.ob.Nj;
import com.yandex.metrica.impl.ob.hj;
import com.yandex.metrica.impl.ob.i0;

class g0
implements Nj {
    public final i0 a;

    public g0(i0 i02) {
        this.a = i02;
    }

    @Override
    public void a(Mj mj) {
        hj hj2 = mj.b();
        if (hj2 != null) {
            i0.a(this.a).put("cellular_connection_type", hj2.m());
        }
        i0.a(this.a).put("call_state", Integer.valueOf((int)mj.a()));
    }
}

