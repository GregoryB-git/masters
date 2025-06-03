/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.ob.A3;

public class z3 {
    @Nullable
    private final A3 a;
    @NonNull
    private final CounterConfiguration b;

    public z3(@NonNull Bundle bundle) {
        this.a = A3.a(bundle);
        this.b = CounterConfiguration.a(bundle);
    }

    public z3(@NonNull A3 a3, @NonNull CounterConfiguration counterConfiguration) {
        this.a = a3;
        this.b = counterConfiguration;
    }

    public static boolean a(@Nullable z3 z32, @NonNull Context context) {
        boolean bl = z32.a == null || !context.getPackageName().equals((Object)z32.a.f()) || z32.a.i() != YandexMetrica.getLibraryApiLevel();
        return bl;
    }

    @NonNull
    public A3 a() {
        return this.a;
    }

    @NonNull
    public CounterConfiguration b() {
        return this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("ClientConfiguration{mProcessConfiguration=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", mCounterConfiguration=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

