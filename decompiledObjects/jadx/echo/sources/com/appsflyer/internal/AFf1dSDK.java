package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes.dex */
public final class AFf1dSDK implements AFf1eSDK {
    @Override // com.appsflyer.internal.AFf1eSDK
    @NotNull
    public final String valueOf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String format = String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
