/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.logger.BaseLogger;
import com.yandex.metrica.impl.ob.D2;
import com.yandex.metrica.impl.ob.Pl;
import com.yandex.metrica.impl.ob.Zl;

class E2
implements Zl<Pl> {
    public final Throwable a;
    public final String b;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public E2(D2 d2, Throwable throwable, String string2) {
        this.a = throwable;
        this.b = string2;
    }

    @Override
    public void b(Object object) {
        if (((BaseLogger)(object = (Pl)object)).isEnabled()) {
            ((BaseLogger)object).e(this.a, this.b);
        }
    }
}

