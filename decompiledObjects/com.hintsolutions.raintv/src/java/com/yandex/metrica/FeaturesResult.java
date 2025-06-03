/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  java.lang.Boolean
 *  java.lang.Object
 */
package com.yandex.metrica;

import androidx.annotation.Nullable;

public class FeaturesResult {
    @Nullable
    private final Boolean libSslEnabled;

    public FeaturesResult(@Nullable Boolean bl) {
        this.libSslEnabled = bl;
    }

    @Nullable
    public Boolean getLibSslEnabled() {
        return this.libSslEnabled;
    }
}

