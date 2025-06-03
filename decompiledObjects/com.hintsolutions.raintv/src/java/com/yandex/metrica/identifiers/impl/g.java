/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.identifiers.impl;

import android.os.Bundle;
import com.yandex.metrica.identifiers.impl.f;
import com.yandex.metrica.identifiers.impl.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class g {
    @NotNull
    private final l a;
    @Nullable
    private final f b;
    @Nullable
    private final String c;

    public g(@NotNull l l2, @Nullable f f2, @Nullable String string2) {
        Intrinsics.checkNotNullParameter((Object)((Object)l2), (String)"status");
        this.a = l2;
        this.b = f2;
        this.c = string2;
    }

    public /* synthetic */ g(l l2, f f2, String string2, int n) {
        if ((n & 2) != 0) {
            f2 = null;
        }
        if ((n & 4) != 0) {
            string2 = null;
        }
        this(l2, f2, string2);
    }

    @NotNull
    public final Bundle a() {
        Bundle bundle = new Bundle();
        f f2 = this.b;
        if (f2 != null) {
            bundle.putBundle("com.yandex.metrica.identifiers.extra.TRACKING_INFO", f2.a());
        }
        bundle.putString("com.yandex.metrica.identifiers.extra.STATUS", this.a.a());
        bundle.putString("com.yandex.metrica.identifiers.extra.ERROR_MESSAGE", this.c);
        return bundle;
    }

    public boolean equals(@Nullable Object object) {
        block2: {
            block3: {
                if (this == object) break block2;
                if (!(object instanceof g)) break block3;
                object = (g)object;
                if (Intrinsics.areEqual((Object)((Object)this.a), (Object)((Object)((g)object).a)) && Intrinsics.areEqual((Object)this.b, (Object)((g)object).b) && Intrinsics.areEqual((Object)this.c, (Object)((g)object).c)) break block2;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object object = this.a;
        int n = 0;
        int n3 = object != null ? object.hashCode() : 0;
        object = this.b;
        int n4 = object != null ? ((f)object).hashCode() : 0;
        object = this.c;
        if (object != null) {
            n = object.hashCode();
        }
        return (n3 * 31 + n4) * 31 + n;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("AdsIdResult(status=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", adsIdInfo=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", errorExplanation=");
        return z2.s(stringBuilder, this.c, ")");
    }
}

