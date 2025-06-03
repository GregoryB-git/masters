/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.b7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class X6 {
    @NotNull
    private final b7 a;
    @Nullable
    private final String b;

    public X6() {
        this(null, null, 3);
    }

    public X6(@NotNull b7 b72, @Nullable String string) {
        this.a = b72;
        this.b = string;
    }

    public /* synthetic */ X6(b7 b72, String string, int n2) {
        b72 = (n2 & 1) != 0 ? b7.a : null;
        this(b72, null);
    }

    @Nullable
    public final String a() {
        return this.b;
    }

    @NotNull
    public final b7 b() {
        return this.a;
    }

    public boolean equals(@Nullable Object object) {
        block2: {
            block3: {
                if (this == object) break block2;
                if (!(object instanceof X6)) break block3;
                object = (X6)object;
                if (Intrinsics.areEqual((Object)((Object)this.a), (Object)((Object)((X6)object).a)) && Intrinsics.areEqual((Object)this.b, (Object)((X6)object).b)) break block2;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object object = this.a;
        int n2 = 0;
        int n3 = object != null ? object.hashCode() : 0;
        object = this.b;
        if (object != null) {
            n2 = object.hashCode();
        }
        return n3 * 31 + n2;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("NativeCrashHandlerDescription(source=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", handlerVersion=");
        return z2.s(stringBuilder, this.b, ")");
    }
}

