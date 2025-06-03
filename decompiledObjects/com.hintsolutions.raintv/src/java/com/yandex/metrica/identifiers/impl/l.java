/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.identifiers.impl;

import org.jetbrains.annotations.NotNull;

public final class l
extends Enum {
    public static final /* enum */ l b = new l("OK", 0, "OK");
    public static final /* enum */ l c = new l("IDENTIFIER_PROVIDER_UNAVAILABLE", 1, "IDENTIFIER_PROVIDER_UNAVAILABLE");
    public static final /* enum */ l d = new l("UNKNOWN", 5, "UNKNOWN");
    @NotNull
    private final String a;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private l() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.a = var3_2;
    }

    @NotNull
    public final String a() {
        return this.a;
    }
}

