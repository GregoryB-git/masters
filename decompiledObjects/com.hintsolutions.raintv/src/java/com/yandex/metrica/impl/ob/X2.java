/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;

public class x2 {
    @NonNull
    private final TimeProvider a;

    public x2() {
        this(new SystemTimeProvider());
    }

    @VisibleForTesting
    public x2(@NonNull TimeProvider timeProvider) {
        this.a = timeProvider;
    }

    private boolean a(long l8, long l9, long l10) {
        boolean bl = true;
        if (l8 < l9) {
            return true;
        }
        if (l8 - l9 < l10) {
            bl = false;
        }
        return bl;
    }

    public boolean a(long l8, long l9, @NonNull String string) {
        return this.a(this.a.currentTimeMillis(), l8, l9);
    }

    public boolean b(long l8, long l9, @NonNull String string) {
        return this.a(this.a.currentTimeSeconds(), l8, l9);
    }
}

