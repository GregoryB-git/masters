// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import com.appsflyer.internal.platform_extension.PluginInfo;
import kotlin.Metadata;

@Metadata
public interface AFf1tSDK
{
    void AFInAppEventParameterName(@NotNull final PluginInfo p0);
    
    @NotNull
    Map<String, Object> AFKeystoreWrapper();
}
