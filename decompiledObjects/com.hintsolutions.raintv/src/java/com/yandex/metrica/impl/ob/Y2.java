/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.e;
import com.yandex.metrica.impl.ob.O0;
import com.yandex.metrica.impl.ob.R0;

public class y2 {
    @NonNull
    public final String a;
    @NonNull
    public final O0 b;

    public y2(@NonNull O0 o02, @NonNull String string) {
        this.b = o02;
        this.a = string;
    }

    @NonNull
    public R0 a() {
        return this.b.b().b(new e.a(this.a).a());
    }
}

