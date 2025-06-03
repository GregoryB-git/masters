/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.t0;
import com.yandex.metrica.impl.ob.u0;
import com.yandex.metrica.impl.ob.v3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class w3
extends t0<v3.a> {
    @Override
    public boolean a(@NotNull v3.a a2, @NotNull v3.a a3) {
        boolean bl2;
        block6: {
            block4: {
                block5: {
                    boolean bl3 = A2.b(a3.b());
                    bl2 = false;
                    if (bl3) break block4;
                    if (A2.b(a2.b())) {
                        return false;
                    }
                    if (a2.a() != u0.c) break block5;
                    int n2 = ((Number)this.a().a(a2.a())).intValue();
                    a2 = this.a().a(a3.a());
                    Intrinsics.checkNotNullExpressionValue((Object)a2, (String)"priorities[oldData.source]");
                    if (Intrinsics.compare((int)n2, (int)((Number)a2).intValue()) < 0) break block6;
                    break block4;
                }
                int n6 = ((Number)this.a().a(a2.a())).intValue();
                a2 = this.a().a(a3.a());
                Intrinsics.checkNotNullExpressionValue((Object)a2, (String)"priorities[oldData.source]");
                if (Intrinsics.compare((int)n6, (int)((Number)a2).intValue()) <= 0) break block6;
            }
            bl2 = true;
        }
        return bl2;
    }
}

