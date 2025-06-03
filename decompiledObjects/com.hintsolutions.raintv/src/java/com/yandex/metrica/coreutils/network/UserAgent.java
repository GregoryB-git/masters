/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Locale
 *  kotlin.Metadata
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.coreutils.network;

import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2={"Lcom/yandex/metrica/coreutils/network/UserAgent;", "", "()V", "formDeviceName", "", "getFor", "sdkName", "versionName", "buildNumber", "core-utils_release"}, k=1, mv={1, 4, 2})
public final class UserAgent {
    @NotNull
    public static final UserAgent INSTANCE = new UserAgent();

    private UserAgent() {
    }

    private final String formDeviceName() {
        String string2 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"Build.MODEL");
        String string3 = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue((Object)string3, (String)"Build.MANUFACTURER");
        if (!StringsKt.z((String)string2, (String)string3)) {
            string2 = z2.p(string3, " ", string2);
        }
        Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"if (Build.MODEL.startsWi\u2026\" + Build.MODEL\n        }");
        string3 = Locale.US;
        Intrinsics.checkNotNullExpressionValue((Object)string3, (String)"Locale.US");
        return StringsKt.capitalize((String)string2, (Locale)string3);
    }

    @JvmStatic
    @NotNull
    public static final String getFor(@NotNull String string2, @NotNull String string3, @NotNull String string4) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"sdkName");
        Intrinsics.checkNotNullParameter((Object)string3, (String)"versionName");
        Intrinsics.checkNotNullParameter((Object)string4, (String)"buildNumber");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append('/');
        stringBuilder.append(string3);
        stringBuilder.append('.');
        stringBuilder.append(string4);
        stringBuilder.append(" (");
        stringBuilder.append(INSTANCE.formDeviceName());
        stringBuilder.append("; Android ");
        stringBuilder.append(Build.VERSION.RELEASE);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

