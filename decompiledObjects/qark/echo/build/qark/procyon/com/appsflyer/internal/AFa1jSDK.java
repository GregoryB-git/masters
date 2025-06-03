// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.util.DisplayMetrics;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public final class AFa1jSDK implements AFa1iSDK
{
    @NotNull
    private Map<String, String> valueOf;
    
    public AFa1jSDK() {
        this.valueOf = new LinkedHashMap<String, String>();
    }
    
    @NotNull
    @Override
    public final Map<String, String> valueOf(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (this.valueOf.isEmpty()) {
            final Resources resources = context.getResources();
            final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            final int screenLayout = resources.getConfiguration().screenLayout;
            this.valueOf.put("xdp", String.valueOf(displayMetrics.xdpi));
            this.valueOf.put("ydp", String.valueOf(displayMetrics.ydpi));
            this.valueOf.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.valueOf.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.valueOf.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.valueOf.put("size", String.valueOf(screenLayout & 0xF));
        }
        return this.valueOf;
    }
}
