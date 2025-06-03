/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.M0;
import com.yandex.metrica.impl.ob.bh;
import java.util.Map;

public class h1 {
    @NonNull
    private final M0 a;

    public h1() {
        this(bh.a());
    }

    @VisibleForTesting
    public h1(@NonNull M0 m02) {
        this.a = m02;
    }

    public void a(@Nullable Map<String, Object> map) {
        this.a.reportEvent("login_sdk", map);
    }
}

