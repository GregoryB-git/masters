/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.V1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class t2
extends V1<String[]> {
    public t2(@NotNull Context context, @NotNull String string) {
        super(context, string, "array");
    }

    @Override
    public Object a(int n2) {
        Context context = this.a;
        Intrinsics.checkNotNullExpressionValue((Object)context, (String)"mContext");
        return context.getResources().getStringArray(n2);
    }
}

