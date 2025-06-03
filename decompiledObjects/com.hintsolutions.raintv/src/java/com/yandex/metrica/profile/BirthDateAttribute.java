/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.Ee
 *  com.yandex.metrica.impl.ob.Lm
 *  com.yandex.metrica.impl.ob.Oe
 *  com.yandex.metrica.impl.ob.Pe
 *  com.yandex.metrica.impl.ob.qn
 *  com.yandex.metrica.profile.UserProfileUpdate
 *  java.lang.Object
 *  java.lang.String
 *  java.text.SimpleDateFormat
 *  java.util.Calendar
 *  java.util.GregorianCalendar
 *  java.util.Locale
 */
package com.yandex.metrica.profile;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class BirthDateAttribute {
    private final He a = new He("appmetrica_birth_date", (xn<String>)new qn(), (Be)new Pe());

    private Calendar a(int n7) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, n7);
        return gregorianCalendar;
    }

    private Calendar a(int n7, int n8) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, n7);
        gregorianCalendar.set(2, n8 - 1);
        gregorianCalendar.set(5, 1);
        return gregorianCalendar;
    }

    private Calendar a(int n7, int n8, int n10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, n7);
        gregorianCalendar.set(2, n8 - 1);
        gregorianCalendar.set(5, n10);
        return gregorianCalendar;
    }

    @SuppressLint(value={"SimpleDateFormat"})
    @VisibleForTesting
    public UserProfileUpdate<? extends Te> a(@NonNull Calendar calendar, @NonNull String string, @NonNull Ce ce) {
        return new UserProfileUpdate((Te)((Object)new Qe(this.a.a(), new SimpleDateFormat(string).format(calendar.getTime()), (Sm<String>)new Lm(), (xn<String>)new qn(), ce)));
    }

    public UserProfileUpdate<? extends Te> withAge(int n7) {
        return this.a(this.a(Calendar.getInstance((Locale)Locale.US).get(1) - n7), "yyyy", (Ce)new Ee(this.a.c()));
    }

    public UserProfileUpdate<? extends Te> withAgeIfUndefined(int n7) {
        return this.a(this.a(Calendar.getInstance((Locale)Locale.US).get(1) - n7), "yyyy", (Ce)new Oe(this.a.c()));
    }

    public UserProfileUpdate<? extends Te> withBirthDate(int n7) {
        return this.a(this.a(n7), "yyyy", (Ce)new Ee(this.a.c()));
    }

    public UserProfileUpdate<? extends Te> withBirthDate(int n7, int n8) {
        return this.a(this.a(n7, n8), "yyyy-MM", (Ce)new Ee(this.a.c()));
    }

    public UserProfileUpdate<? extends Te> withBirthDate(int n7, int n8, int n10) {
        return this.a(this.a(n7, n8, n10), "yyyy-MM-dd", (Ce)new Ee(this.a.c()));
    }

    public UserProfileUpdate<? extends Te> withBirthDate(@NonNull Calendar calendar) {
        return this.a(calendar, "yyyy-MM-dd", (Ce)new Ee(this.a.c()));
    }

    public UserProfileUpdate<? extends Te> withBirthDateIfUndefined(int n7) {
        return this.a(this.a(n7), "yyyy", (Ce)new Oe(this.a.c()));
    }

    public UserProfileUpdate<? extends Te> withBirthDateIfUndefined(int n7, int n8) {
        return this.a(this.a(n7, n8), "yyyy-MM", (Ce)new Oe(this.a.c()));
    }

    public UserProfileUpdate<? extends Te> withBirthDateIfUndefined(int n7, int n8, int n10) {
        return this.a(this.a(n7, n8, n10), "yyyy-MM-dd", (Ce)new Oe(this.a.c()));
    }

    public UserProfileUpdate<? extends Te> withBirthDateIfUndefined(@NonNull Calendar calendar) {
        return this.a(calendar, "yyyy-MM-dd", (Ce)new Oe(this.a.c()));
    }

    public UserProfileUpdate<? extends Te> withValueReset() {
        return new UserProfileUpdate((Te)((Object)new Ne(0, this.a.a(), (xn<String>)new qn(), (Be)new Pe())));
    }
}

