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

public final class fi {
    private final int a;

    public fi(int n4) {
        this.a = n4;
    }

    public final int a() {
        return this.a;
    }

    public boolean equals(@Nullable Object object) {
        block2: {
            block3: {
                if (this == object) break block2;
                if (!(object instanceof fi)) break block3;
                object = (fi)object;
                if (this.a == ((fi)object).a) break block2;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return z2.q(z2.t("StartupUpdateConfig(intervalSeconds="), this.a, ")");
    }
}

