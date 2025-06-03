/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.rg;

public class ug
extends rg {
    @NonNull
    private String m;
    @NonNull
    private String n;

    public String A() {
        return this.n;
    }

    public void f(@NonNull String string) {
        this.m = string;
    }

    public void g(@NonNull String string) {
        this.n = string;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = z2.t("CoreRequestConfig{mAppDebuggable='");
        a.B(stringBuilder, this.m, '\'', ", mAppSystem='");
        a.B(stringBuilder, this.n, '\'', "} ");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }

    @NonNull
    public String z() {
        return this.m;
    }
}

