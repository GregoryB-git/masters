/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.Ee
 *  com.yandex.metrica.impl.ob.Lm
 *  com.yandex.metrica.impl.ob.Oe
 *  com.yandex.metrica.impl.ob.Pe
 *  com.yandex.metrica.impl.ob.qn
 *  com.yandex.metrica.profile.UserProfileUpdate
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.profile;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Be;
import com.yandex.metrica.impl.ob.Ce;
import com.yandex.metrica.impl.ob.Ee;
import com.yandex.metrica.impl.ob.He;
import com.yandex.metrica.impl.ob.Lm;
import com.yandex.metrica.impl.ob.Ne;
import com.yandex.metrica.impl.ob.Oe;
import com.yandex.metrica.impl.ob.Pe;
import com.yandex.metrica.impl.ob.Qe;
import com.yandex.metrica.impl.ob.Sm;
import com.yandex.metrica.impl.ob.Te;
import com.yandex.metrica.impl.ob.qn;
import com.yandex.metrica.impl.ob.xn;
import com.yandex.metrica.profile.UserProfileUpdate;

public class GenderAttribute {
    private final He a = new He("appmetrica_gender", (xn<String>)new qn(), (Be)new Pe());

    @NonNull
    public UserProfileUpdate<? extends Te> withValue(@NonNull Gender gender) {
        return new UserProfileUpdate((Te)((Object)new Qe(this.a.a(), gender.getStringValue(), (Sm<String>)new Lm(), this.a.b(), (Ce)new Ee(this.a.c()))));
    }

    @NonNull
    public UserProfileUpdate<? extends Te> withValueIfUndefined(@NonNull Gender gender) {
        return new UserProfileUpdate((Te)((Object)new Qe(this.a.a(), gender.getStringValue(), (Sm<String>)new Lm(), this.a.b(), (Ce)new Oe(this.a.c()))));
    }

    @NonNull
    public UserProfileUpdate<? extends Te> withValueReset() {
        return new UserProfileUpdate((Te)((Object)new Ne(0, this.a.a(), this.a.b(), this.a.c())));
    }

    public static enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");

        private final String mStringValue;

        private Gender(String string2) {
            this.mStringValue = string2;
        }

        public String getStringValue() {
            return this.mStringValue;
        }
    }
}

