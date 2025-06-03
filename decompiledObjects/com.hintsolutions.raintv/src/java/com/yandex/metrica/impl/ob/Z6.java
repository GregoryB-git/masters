/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import java.util.Collections;
import java.util.List;

public class z6 {
    @NonNull
    public final String a;
    public final int b;
    public final long c;
    @NonNull
    public final String d;
    @Nullable
    public final Integer e;
    @NonNull
    public final List<StackTraceElement> f;

    public z6(@NonNull String object, int n7, long l8, @NonNull String string, @Nullable Integer n8, @Nullable List<StackTraceElement> list) {
        this.a = object;
        this.b = n7;
        this.c = l8;
        this.d = string;
        this.e = n8;
        object = list == null ? Collections.emptyList() : A2.c(list);
        this.f = object;
    }
}

