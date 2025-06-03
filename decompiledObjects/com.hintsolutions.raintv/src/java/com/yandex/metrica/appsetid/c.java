/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.appsetid;

import org.jetbrains.annotations.NotNull;

public final class c
extends Enum<c> {
    public static final /* enum */ c b;
    public static final /* enum */ c c;
    public static final /* enum */ c d;
    private static final c[] e;
    @NotNull
    private final String a;

    static {
        c c2;
        c c5;
        c c6;
        b = c6 = new c("");
        c = c5 = new c("app");
        d = c2 = new c("developer");
        e = new c[]{c6, c5, c2};
    }

    private c(String string3) {
        this.a = string3;
    }

    public static c valueOf(String string2) {
        return (c)Enum.valueOf(c.class, (String)string2);
    }

    public static c[] values() {
        return (c[])e.clone();
    }

    @NotNull
    public final String a() {
        return this.a;
    }
}

