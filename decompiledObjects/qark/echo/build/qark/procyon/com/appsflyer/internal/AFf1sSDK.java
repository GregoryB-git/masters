// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import W5.C;
import V5.q;
import V5.m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import java.util.Map;
import com.appsflyer.internal.platform_extension.Plugin;
import org.jetbrains.annotations.NotNull;
import com.appsflyer.internal.platform_extension.PluginInfo;
import kotlin.Metadata;

@Metadata
public final class AFf1sSDK implements AFf1tSDK
{
    @NotNull
    private PluginInfo AFInAppEventParameterName;
    
    public AFf1sSDK() {
        this.AFInAppEventParameterName = new PluginInfo(Plugin.NATIVE, "6.12.2", null, 4, null);
    }
    
    @Override
    public final void AFInAppEventParameterName(@NotNull final PluginInfo afInAppEventParameterName) {
        Intrinsics.checkNotNullParameter(afInAppEventParameterName, "");
        this.AFInAppEventParameterName = afInAppEventParameterName;
    }
    
    @NotNull
    @Override
    public final Map<String, Object> AFKeystoreWrapper() {
        final Map g = C.g(q.a("platform", this.AFInAppEventParameterName.getPlugin().getPluginName()), q.a("version", this.AFInAppEventParameterName.getVersion()));
        if (true ^ this.AFInAppEventParameterName.getAdditionalParams().isEmpty()) {
            g.put("extras", this.AFInAppEventParameterName.getAdditionalParams());
        }
        return (Map<String, Object>)g;
    }
}
