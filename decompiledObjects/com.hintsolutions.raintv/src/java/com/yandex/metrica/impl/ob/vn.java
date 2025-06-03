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
import com.yandex.metrica.impl.ob.xn;

public final class vn {
    private final boolean a;
    private final String b;

    private vn(@NonNull xn<?> xn2, boolean bl, @NonNull String string) {
        xn2.getClass();
        this.a = bl;
        this.b = string;
    }

    public static final vn a(@NonNull xn<?> xn2) {
        return new vn(xn2, true, "");
    }

    public static final vn a(@NonNull xn<?> xn2, @NonNull String string) {
        return new vn(xn2, false, string);
    }

    @NonNull
    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }
}

