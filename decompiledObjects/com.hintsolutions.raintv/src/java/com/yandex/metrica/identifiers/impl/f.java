/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.identifiers.impl;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class f {
    @NotNull
    private final String a;
    @Nullable
    private final String b;
    @Nullable
    private final Boolean c;

    public f(@NotNull String string2, @Nullable String string3, @Nullable Boolean bl) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"provider");
        this.a = string2;
        this.b = string3;
        this.c = bl;
    }

    @NotNull
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("com.yandex.metrica.identifiers.extra.PROVIDER", this.a);
        bundle.putString("com.yandex.metrica.identifiers.extra.ID", this.b);
        Boolean bl = this.c;
        if (bl != null) {
            bundle.putBoolean("com.yandex.metrica.identifiers.extra.LIMITED", bl.booleanValue());
        }
        return bundle;
    }

    public boolean equals(@Nullable Object object) {
        block2: {
            block3: {
                if (this == object) break block2;
                if (!(object instanceof f)) break block3;
                object = (f)object;
                if (Intrinsics.areEqual((Object)this.a, (Object)((f)object).a) && Intrinsics.areEqual((Object)this.b, (Object)((f)object).b) && Intrinsics.areEqual((Object)this.c, (Object)((f)object).c)) break block2;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String string2 = this.a;
        int n = 0;
        int n3 = string2 != null ? string2.hashCode() : 0;
        string2 = this.b;
        int n4 = string2 != null ? string2.hashCode() : 0;
        string2 = this.c;
        if (string2 != null) {
            n = string2.hashCode();
        }
        return (n3 * 31 + n4) * 31 + n;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("AdsIdInfo(provider=");
        stringBuilder.append(this.a);
        stringBuilder.append(", advId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", limitedAdTracking=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

