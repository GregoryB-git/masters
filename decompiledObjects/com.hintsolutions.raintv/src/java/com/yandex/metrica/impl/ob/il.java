/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Locale
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.coreutils.logger.BaseLogger;
import com.yandex.metrica.impl.ob.A2;
import java.util.Locale;

public abstract class Il
extends BaseLogger {
    private static String b = "";
    @NonNull
    private final String a;

    public Il(@Nullable String string2) {
        super(false);
        StringBuilder stringBuilder = z2.t("[");
        stringBuilder.append(A2.a(string2));
        stringBuilder.append("] ");
        this.a = stringBuilder.toString();
    }

    public static void a(Context context) {
        StringBuilder stringBuilder = z2.t("[");
        stringBuilder.append(context.getPackageName());
        stringBuilder.append("] : ");
        b = stringBuilder.toString();
    }

    @Override
    public String formatMessage(String string2, Object[] objectArray) {
        return String.format((Locale)Locale.US, (String)string2, (Object[])objectArray);
    }

    @Override
    @NonNull
    public String getPrefix() {
        String string2 = b;
        String string3 = "";
        String string4 = string2;
        if (string2 == null) {
            string4 = "";
        }
        if ((string2 = this.a) != null) {
            string3 = string2;
        }
        return z2.o(string4, string3);
    }
}

