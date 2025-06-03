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
import com.yandex.metrica.impl.ob.Ne;
import com.yandex.metrica.impl.ob.Oe;
import com.yandex.metrica.impl.ob.Qe;
import com.yandex.metrica.impl.ob.Sm;
import com.yandex.metrica.impl.ob.Te;
import com.yandex.metrica.impl.ob.xn;
import com.yandex.metrica.profile.UserProfileUpdate;

public class StringAttribute {
    private final Sm<String> a;
    private final He b;

    public StringAttribute(@NonNull String string2, @NonNull Sm<String> sm, @NonNull xn<String> xn2, @NonNull Be be2) {
        this.b = new He(string2, xn2, be2);
        this.a = sm;
    }

    @NonNull
    public UserProfileUpdate<? extends Te> withValue(@NonNull String string2) {
        return new UserProfileUpdate<Qe>(new Qe(this.b.a(), string2, this.a, this.b.b(), (Ce)new Ee(this.b.c())));
    }

    @NonNull
    public UserProfileUpdate<? extends Te> withValueIfUndefined(@NonNull String string2) {
        return new UserProfileUpdate<Qe>(new Qe(this.b.a(), string2, this.a, this.b.b(), (Ce)new Oe(this.b.c())));
    }

    @NonNull
    public UserProfileUpdate<? extends Te> withValueReset() {
        return new UserProfileUpdate<Ne>(new Ne(0, this.b.a(), this.b.b(), this.b.c()));
    }
}

