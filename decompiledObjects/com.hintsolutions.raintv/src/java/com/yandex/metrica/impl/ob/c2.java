/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.logger.BaseLogger;
import com.yandex.metrica.impl.ob.D2;
import com.yandex.metrica.impl.ob.Pl;
import com.yandex.metrica.impl.ob.Zl;

class C2
implements Zl<Pl> {
    public final String a;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public C2(D2 d2, String string2) {
        this.a = string2;
    }

    @Override
    public void b(Object object) {
        if (((BaseLogger)(object = (Pl)object)).isEnabled()) {
            ((BaseLogger)object).i(this.a);
        }
    }
}

