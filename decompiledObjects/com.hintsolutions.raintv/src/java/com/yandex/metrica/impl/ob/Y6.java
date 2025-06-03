/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.impl.ob;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class y6 {
    @Nullable
    private final String a;
    @Nullable
    private final String b;
    @Nullable
    private final Integer c;
    @Nullable
    private final Integer d;
    @Nullable
    private final String e;
    @Nullable
    private final Boolean f;

    public y6(@NotNull StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), null, stackTraceElement.getMethodName(), stackTraceElement.isNativeMethod());
    }

    public y6(@Nullable String string, @Nullable String string2, @Nullable Integer n7, @Nullable Integer n8, @Nullable String string3, @Nullable Boolean bl) {
        this.a = string;
        this.b = string2;
        this.c = n7;
        this.d = n8;
        this.e = string3;
        this.f = bl;
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    @Nullable
    public final Integer b() {
        return this.d;
    }

    @Nullable
    public final String c() {
        return this.b;
    }

    @Nullable
    public final Integer d() {
        return this.c;
    }

    @Nullable
    public final String e() {
        return this.e;
    }

    @Nullable
    public final Boolean f() {
        return this.f;
    }
}

