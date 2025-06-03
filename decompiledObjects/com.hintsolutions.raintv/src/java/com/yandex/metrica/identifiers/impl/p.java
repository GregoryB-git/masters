/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.internal.Intrinsics
 */
package com.yandex.metrica.identifiers.impl;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

public final class p {
    private static final Intent a;

    static {
        Intent intent = new Intent("com.yandex.android.advid.IDENTIFIER_SERVICE").setPackage("com.yandex.android.advid");
        Intrinsics.checkNotNullExpressionValue((Object)intent, (String)"Intent(\"com.yandex.andro\u2026om.yandex.android.advid\")");
        a = intent;
    }

    public static final /* synthetic */ Intent a() {
        return a;
    }
}

