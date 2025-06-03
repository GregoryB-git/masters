/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.impl.ob;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class w0 {
    private final long a;

    public w0(long l8) {
        this.a = l8;
    }

    public final long a() {
        return this.a;
    }

    public boolean equals(@Nullable Object object) {
        block2: {
            block3: {
                if (this == object) break block2;
                if (!(object instanceof w0)) break block3;
                object = (w0)object;
                if (this.a == ((w0)object).a) break block2;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long l8 = this.a;
        return (int)(l8 ^ l8 >>> 32);
    }

    @NotNull
    public String toString() {
        return z2.r(z2.t("EasyCollectingConfig(firstLaunchDelaySeconds="), this.a, ")");
    }
}

