/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.internal.Intrinsics
 */
package com.yandex.metrica.networktasks.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class b {
    private final String a;

    public b(String string) {
        this.a = this.a(string);
    }

    private final String a(String string) {
        boolean bl = string == null || string.length() == 0;
        String string2 = string;
        if (!bl) {
            Uri uri = Uri.parse((String)string);
            Intrinsics.checkNotNullExpressionValue((Object)uri, (String)"uri");
            string2 = string;
            if (Intrinsics.areEqual((Object)"http", (Object)uri.getScheme())) {
                string2 = uri.buildUpon().scheme("https").build().toString();
            }
        }
        return string2;
    }

    public final String a() {
        return this.a;
    }
}

