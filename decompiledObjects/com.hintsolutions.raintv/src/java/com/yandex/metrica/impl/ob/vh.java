/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import com.yandex.metrica.impl.ob.Lh;
import com.yandex.metrica.impl.ob.Uh;
import com.yandex.metrica.impl.ob.f0;

class Vh
implements f0.a {
    public final Lh a;
    public final Uh b;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public Vh(Uh uh, Lh lh) {
        this.b = uh;
        this.a = lh;
    }

    @Override
    public void a(int n3, Bundle bundle) {
        this.b.a(bundle, this.a);
    }
}

