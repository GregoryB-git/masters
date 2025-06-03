/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

public final class u0
extends Enum<u0> {
    public static final /* enum */ u0 b;
    public static final /* enum */ u0 c;
    public static final /* enum */ u0 d;
    public static final /* enum */ u0 e;
    private static final u0[] f;
    @NotNull
    public static final a g;
    @NotNull
    private final String a;

    static {
        u0 u02;
        u0 u03;
        u0 u04;
        u0 u05;
        b = u05 = new u0("UNDEFINED");
        c = u04 = new u0("APP");
        d = u03 = new u0("SATELLITE");
        e = u02 = new u0("RETAIL");
        f = new u0[]{u05, u04, u03, u02};
        g = new a(null);
    }

    private u0(String string2) {
        this.a = string2;
    }

    public static u0 valueOf(String string) {
        return (u0)Enum.valueOf(u0.class, (String)string);
    }

    public static u0[] values() {
        return (u0[])f.clone();
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

