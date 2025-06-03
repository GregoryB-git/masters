/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.identifiers.impl.m
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.identifiers.impl.d;
import com.yandex.metrica.identifiers.impl.j;
import com.yandex.metrica.identifiers.impl.m;
import com.yandex.metrica.identifiers.impl.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class e {
    @NotNull
    private final d a;
    private final Function1 b;
    private final String c;
    private final w d;

    public e(@NotNull Intent intent, @NotNull Function1 function1, @NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)intent, (String)"intent");
        Intrinsics.checkNotNullParameter((Object)function1, (String)"converter");
        Intrinsics.checkNotNullParameter((Object)string2, (String)"serviceShortTag");
        d d2 = new d(intent, string2);
        intent = new StringBuilder();
        intent.append("[AdInServiceConnectionController-");
        intent.append(string2);
        intent.append(']');
        this(d2, function1, intent.toString(), string2, new w());
    }

    @VisibleForTesting
    public e(@NotNull d d2, @NotNull Function1 function1, @NotNull String string2, @NotNull String string3, @NotNull w w2) {
        Intrinsics.checkNotNullParameter((Object)d2, (String)"connection");
        Intrinsics.checkNotNullParameter((Object)function1, (String)"converter");
        Intrinsics.checkNotNullParameter((Object)string2, (String)"tag");
        Intrinsics.checkNotNullParameter((Object)string3, (String)"serviceShortTag");
        Intrinsics.checkNotNullParameter((Object)w2, (String)"safePackageManager");
        this.a = d2;
        this.b = function1;
        this.c = string3;
        this.d = w2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        Intent intent = this.a.a();
        Intrinsics.checkNotNullExpressionValue((Object)intent, (String)"connection.intent");
        this.d.getClass();
        Object var3_5 = null;
        try {
            intent = context.getPackageManager().resolveService(intent, 0);
        }
        catch (Throwable throwable) {
            intent = null;
        }
        if (intent == null) {
            throw new m(z2.s(z2.t("could not resolve "), this.c, " services"));
        }
        intent = var3_5;
        try {
            if (this.a.a(context)) {
                intent = this.a.a(3000L);
            }
        }
        catch (Throwable throwable) {
            intent = var3_5;
        }
        if (intent != null) {
            return this.b.invoke((Object)intent);
        }
        throw new j(z2.s(z2.t("could not bind to "), this.c, " services"));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        try {
            this.a.b(context);
            return;
        }
        catch (IllegalArgumentException | Throwable throwable) {
            return;
        }
    }
}

