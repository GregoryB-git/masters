/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.Ee
 *  com.yandex.metrica.impl.ob.Oe
 *  com.yandex.metrica.profile.UserProfileUpdate
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.profile;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Be;
import com.yandex.metrica.impl.ob.Ce;
import com.yandex.metrica.impl.ob.De;
import com.yandex.metrica.impl.ob.Ee;
import com.yandex.metrica.impl.ob.He;
import com.yandex.metrica.impl.ob.Ne;
import com.yandex.metrica.impl.ob.Oe;
import com.yandex.metrica.impl.ob.Te;
import com.yandex.metrica.impl.ob.xn;
import com.yandex.metrica.profile.UserProfileUpdate;

public class BooleanAttribute {
    private final He a;

    public BooleanAttribute(@NonNull String string, @NonNull xn<String> xn2, @NonNull Be be2) {
        this.a = new He(string, xn2, be2);
    }

    @NonNull
    public UserProfileUpdate<? extends Te> withValue(boolean bl) {
        return new UserProfileUpdate((Te)((Object)new De(this.a.a(), bl, this.a.b(), (Ce)new Ee(this.a.c()))));
    }

    @NonNull
    public UserProfileUpdate<? extends Te> withValueIfUndefined(boolean bl) {
        return new UserProfileUpdate((Te)((Object)new De(this.a.a(), bl, this.a.b(), (Ce)new Oe(this.a.c()))));
    }

    @NonNull
    public UserProfileUpdate<? extends Te> withValueReset() {
        return new UserProfileUpdate((Te)((Object)new Ne(3, this.a.a(), this.a.b(), this.a.c())));
    }
}

