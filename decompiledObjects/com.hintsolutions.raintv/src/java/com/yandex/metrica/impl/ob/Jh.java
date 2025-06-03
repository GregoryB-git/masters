/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.Y8
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Kd;
import com.yandex.metrica.impl.ob.Y8;

public class jh {
    @NonNull
    private final String a;
    @NonNull
    private final String b;
    @NonNull
    private final Y8 c;

    public jh(@NonNull String string, @NonNull String string2) {
        this(string, string2, F0.g().s());
    }

    @VisibleForTesting
    public jh(@NonNull String string, @NonNull String string2, @NonNull Y8 y8) {
        this.a = string;
        this.b = string2;
        this.c = y8;
    }

    @Nullable
    public String a() {
        Y8 y8 = this.c;
        String string = this.a;
        String string2 = this.b;
        y8.getClass();
        return y8.a(new Kd(a.m("LAST_SOCKET_REPORT_TIMES_", string, "_", string2), null).a(), (String)null);
    }

    public void a(@Nullable String string) {
        this.c.a(this.a, this.b, string);
    }
}

