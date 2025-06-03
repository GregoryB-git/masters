/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.profile;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Be;
import com.yandex.metrica.impl.ob.Ce;
import com.yandex.metrica.impl.ob.Ee;
import com.yandex.metrica.impl.ob.He;
import com.yandex.metrica.impl.ob.Ie;
import com.yandex.metrica.impl.ob.Je;
import com.yandex.metrica.impl.ob.Jm;
import com.yandex.metrica.impl.ob.Le;
import com.yandex.metrica.impl.ob.Ne;
import com.yandex.metrica.impl.ob.Oe;
import com.yandex.metrica.impl.ob.Te;
import com.yandex.metrica.impl.ob.xn;
import com.yandex.metrica.profile.UserProfileUpdate;

public final class NumberAttribute {
    private final He a;

    public NumberAttribute(@NonNull String string2, @NonNull xn<String> xn2, @NonNull Be be2) {
        this.a = new He(string2, xn2, be2);
    }

    @NonNull
    public UserProfileUpdate<? extends Te> withValue(double d2) {
        return new UserProfileUpdate<Le>(new Le(this.a.a(), d2, (xn<String>)new Ie(), (Ce)new Ee(new Je(new Jm(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends Te> withValueIfUndefined(double d2) {
        return new UserProfileUpdate<Le>(new Le(this.a.a(), d2, (xn<String>)new Ie(), (Ce)new Oe(new Je(new Jm(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends Te> withValueReset() {
        return new UserProfileUpdate<Ne>(new Ne(1, this.a.a(), (xn<String>)new Ie(), new Je(new Jm(100))));
    }
}

