/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFf1eSDK;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFf1dSDK
implements AFf1eSDK {
    @NotNull
    @Override
    public final String valueOf(@NotNull String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        string2 = String.format((String)string2, (Object[])new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()});
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }
}

