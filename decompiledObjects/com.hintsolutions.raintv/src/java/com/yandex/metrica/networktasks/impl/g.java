/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  kotlin.jvm.internal.Intrinsics
 */
package com.yandex.metrica.networktasks.impl;

import com.yandex.metrica.networktasks.impl.h;
import kotlin.jvm.internal.Intrinsics;

public final class g {
    private final h a;

    public g() {
        this(new h());
    }

    public g(h h5) {
        Intrinsics.checkNotNullParameter((Object)h5, (String)"timeProvider");
        this.a = h5;
    }

    public final boolean a(long l8, long l9, String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"tag");
        this.a.getClass();
        long l10 = System.currentTimeMillis() / (long)1000;
        boolean bl = l10 < l8 || l10 - l8 >= l9;
        return bl;
    }
}

