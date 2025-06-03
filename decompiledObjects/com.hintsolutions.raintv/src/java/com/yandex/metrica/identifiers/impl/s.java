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

public final class s {
    private static final Intent a;

    static {
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE").setPackage("com.huawei.hwid");
        Intrinsics.checkNotNullExpressionValue((Object)intent, (String)"Intent(\"com.uodis.opende\u2026ackage(\"com.huawei.hwid\")");
        a = intent;
    }

    public static final /* synthetic */ Intent a() {
        return a;
    }
}

