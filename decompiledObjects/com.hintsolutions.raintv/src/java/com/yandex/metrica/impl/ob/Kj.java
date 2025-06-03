/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.hj;

public class kj {
    private boolean a(@Nullable Integer n4) {
        boolean bl = n4 != null && n4 != Integer.MAX_VALUE;
        return bl;
    }

    @NonNull
    public hj a(@NonNull hj hj2) {
        hj.a a2 = new hj.a();
        a2.a(hj2.c());
        if (this.a(hj2.p())) {
            a2.l(hj2.p());
        }
        if (this.a(hj2.k())) {
            a2.i(hj2.k());
        }
        if (this.a(hj2.l())) {
            a2.j(hj2.l());
        }
        if (this.a(hj2.e())) {
            a2.c(hj2.e());
        }
        if (this.a(hj2.b())) {
            a2.b(hj2.b());
        }
        if (!TextUtils.isEmpty((CharSequence)hj2.n())) {
            a2.b(hj2.n());
        }
        if (!TextUtils.isEmpty((CharSequence)hj2.m())) {
            a2.a(hj2.m());
        }
        a2.a(hj2.q());
        if (this.a(hj2.o())) {
            a2.k(hj2.o());
        }
        a2.a(hj2.d());
        if (this.a(hj2.h())) {
            a2.f(hj2.h());
        }
        if (this.a(hj2.j())) {
            a2.h(hj2.j());
        }
        if (this.a(hj2.a())) {
            a2.a(hj2.a());
        }
        if (this.a(hj2.i())) {
            a2.g(hj2.i());
        }
        if (this.a(hj2.f())) {
            a2.d(hj2.f());
        }
        if (this.a(hj2.g())) {
            a2.e(hj2.g());
        }
        return new hj(a2);
    }
}

