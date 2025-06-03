/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.Pe;
import com.yandex.metrica.impl.ob.Qm;
import com.yandex.metrica.impl.ob.qn;
import com.yandex.metrica.profile.StringAttribute;

public class NameAttribute
extends StringAttribute {
    public NameAttribute() {
        super("appmetrica_name", new Qm(100, "Name attribute"), new qn<String>(), new Pe());
    }
}

