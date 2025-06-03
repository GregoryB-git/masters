/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.ConfigProvider;
import org.jetbrains.annotations.NotNull;

public final class C0
implements ConfigProvider {
    private final Object a;

    public C0(@NotNull Object object) {
        this.a = object;
    }

    @Override
    @NotNull
    public Object getConfig() {
        return this.a;
    }
}

