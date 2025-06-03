/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.Dd;
import com.yandex.metrica.impl.ob.Kd;

@Deprecated
public class Jd
extends Dd {
    private Kd f = new Kd("LOCATION_TRACKING_ENABLED");

    public Jd(Context context, String string2) {
        super(context, null);
    }

    @Override
    public String d() {
        return "_serviceproviderspreferences";
    }

    public boolean f() {
        return this.b.getBoolean(this.f.a(), false);
    }

    public void g() {
        ((Dd)this.a(this.f.a())).b();
    }
}

