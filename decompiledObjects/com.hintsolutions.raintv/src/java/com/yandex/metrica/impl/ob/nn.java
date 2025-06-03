/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.F2;
import com.yandex.metrica.impl.ob.gn;
import com.yandex.metrica.impl.ob.on;

class nn
extends gn<F2> {
    public nn(on on2, F2 f22) {
        super(f22);
    }

    @Override
    public boolean a(gn<F2> gn2) {
        String string = ((F2)this.a).a;
        boolean bl2 = false;
        if (string != null ? !string.equals((Object)((F2)gn2.a).a) : ((F2)gn2.a).a != null) {
            return false;
        }
        string = ((F2)this.a).b;
        if (string != null) {
            bl2 = string.equals((Object)((F2)gn2.a).b);
        } else if (((F2)gn2.a).b == null) {
            bl2 = true;
        }
        return bl2;
    }

    public int hashCode() {
        String string = ((F2)this.a).a;
        int n2 = 0;
        int n3 = string != null ? string.hashCode() : 0;
        string = ((F2)this.a).b;
        if (string != null) {
            n2 = string.hashCode();
        }
        return n3 * 31 + n2;
    }
}

