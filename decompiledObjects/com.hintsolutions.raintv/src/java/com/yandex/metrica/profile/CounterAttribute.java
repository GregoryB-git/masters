/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.profile.UserProfileUpdate
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.profile;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Be;
import com.yandex.metrica.impl.ob.Ge;
import com.yandex.metrica.impl.ob.He;
import com.yandex.metrica.impl.ob.Te;
import com.yandex.metrica.impl.ob.xn;
import com.yandex.metrica.profile.UserProfileUpdate;

public final class CounterAttribute {
    private final He a;

    public CounterAttribute(@NonNull String string, @NonNull xn<String> xn2, @NonNull Be be2) {
        this.a = new He(string, xn2, be2);
    }

    @NonNull
    public UserProfileUpdate<? extends Te> withDelta(double d4) {
        return new UserProfileUpdate((Te)((Object)new Ge(this.a.a(), d4)));
    }
}

