/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  java.lang.Object
 *  java.lang.String
 *  java.util.LinkedHashMap
 *  java.util.Map
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.appsflyer.internal.AFa1iSDK;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFa1jSDK
implements AFa1iSDK {
    @NotNull
    private Map<String, String> valueOf = new LinkedHashMap();

    @NotNull
    @Override
    public final Map<String, String> valueOf(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, "");
        if (this.valueOf.isEmpty()) {
            context = context.getResources();
            DisplayMetrics displayMetrics = context.getDisplayMetrics();
            int n8 = context.getConfiguration().screenLayout;
            this.valueOf.put((Object)"xdp", (Object)String.valueOf((float)displayMetrics.xdpi));
            this.valueOf.put((Object)"ydp", (Object)String.valueOf((float)displayMetrics.ydpi));
            this.valueOf.put((Object)"x_px", (Object)String.valueOf((int)displayMetrics.widthPixels));
            this.valueOf.put((Object)"y_px", (Object)String.valueOf((int)displayMetrics.heightPixels));
            this.valueOf.put((Object)"d_dpi", (Object)String.valueOf((int)displayMetrics.densityDpi));
            this.valueOf.put((Object)"size", (Object)String.valueOf((int)(n8 & 15)));
        }
        return this.valueOf;
    }
}

