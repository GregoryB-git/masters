// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class AFf1dSDK implements AFf1eSDK
{
    @NotNull
    @Override
    public final String valueOf(@NotNull String format) {
        Intrinsics.checkNotNullParameter(format, "");
        format = String.format(format, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
