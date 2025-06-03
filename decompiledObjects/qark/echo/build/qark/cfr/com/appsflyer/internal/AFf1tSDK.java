/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public interface AFf1tSDK {
    public void AFInAppEventParameterName(@NotNull PluginInfo var1);

    @NotNull
    public Map<String, Object> AFKeystoreWrapper();
}

