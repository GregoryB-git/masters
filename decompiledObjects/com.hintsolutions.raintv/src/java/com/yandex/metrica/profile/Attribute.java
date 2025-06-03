/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.Ie
 *  com.yandex.metrica.impl.ob.Je
 *  com.yandex.metrica.profile.NameAttribute
 *  com.yandex.metrica.profile.NotificationsEnabledAttribute
 *  com.yandex.metrica.profile.NumberAttribute
 *  com.yandex.metrica.profile.StringAttribute
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.profile;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Be;
import com.yandex.metrica.impl.ob.Ie;
import com.yandex.metrica.impl.ob.Je;
import com.yandex.metrica.impl.ob.Jm;
import com.yandex.metrica.impl.ob.Pl;
import com.yandex.metrica.impl.ob.Qm;
import com.yandex.metrica.impl.ob.Sm;
import com.yandex.metrica.impl.ob.xn;
import com.yandex.metrica.profile.BirthDateAttribute;
import com.yandex.metrica.profile.BooleanAttribute;
import com.yandex.metrica.profile.CounterAttribute;
import com.yandex.metrica.profile.GenderAttribute;
import com.yandex.metrica.profile.NameAttribute;
import com.yandex.metrica.profile.NotificationsEnabledAttribute;
import com.yandex.metrica.profile.NumberAttribute;
import com.yandex.metrica.profile.StringAttribute;

public class Attribute {
    @NonNull
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    @NonNull
    public static BooleanAttribute customBoolean(@NonNull String string) {
        return new BooleanAttribute(string, (xn<String>)new Ie(), (Be)new Je(new Jm(100)));
    }

    @NonNull
    public static CounterAttribute customCounter(@NonNull String string) {
        return new CounterAttribute(string, (xn<String>)new Ie(), (Be)new Je(new Jm(100)));
    }

    @NonNull
    public static NumberAttribute customNumber(@NonNull String string) {
        return new NumberAttribute(string, (xn)new Ie(), (Be)new Je(new Jm(100)));
    }

    @NonNull
    public static StringAttribute customString(@NonNull String string) {
        return new StringAttribute(string, (Sm)((Object)new Qm(200, z2.p("String attribute \"", string, "\""), Pl.a())), (xn)new Ie(), (Be)new Je(new Jm(100)));
    }

    @NonNull
    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    @NonNull
    public static NameAttribute name() {
        return new NameAttribute();
    }

    @NonNull
    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }
}

