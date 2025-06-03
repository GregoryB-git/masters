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

import com.yandex.metrica.appsetid.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class tb {
    @Nullable
    private final String a;
    @NotNull
    private final c b;

    public tb(@Nullable String string, @NotNull c c3) {
        this.a = string;
        this.b = c3;
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    @NotNull
    public final c b() {
        return this.b;
    }

    public boolean equals(@Nullable Object object) {
        block2: {
            block3: {
                if (this == object) break block2;
                if (!(object instanceof tb)) break block3;
                object = (tb)object;
                if (Intrinsics.areEqual((Object)this.a, (Object)((tb)object).a) && Intrinsics.areEqual((Object)((Object)this.b), (Object)((Object)((tb)object).b))) break block2;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object object = this.a;
        int n7 = 0;
        int n8 = object != null ? object.hashCode() : 0;
        object = this.b;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n8 * 31 + n7;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("AppSetId(id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", scope=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

