/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.appsflyer.internal;

import V5.q;
import W5.C;
import com.appsflyer.internal.AFf1tSDK;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFf1sSDK
implements AFf1tSDK {
    @NotNull
    private PluginInfo AFInAppEventParameterName = new PluginInfo(Plugin.NATIVE, "6.12.2", null, 4, null);

    @Override
    public final void AFInAppEventParameterName(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.AFInAppEventParameterName = pluginInfo;
    }

    @NotNull
    @Override
    public final Map<String, Object> AFKeystoreWrapper() {
        Map map = C.g(q.a("platform", this.AFInAppEventParameterName.getPlugin().getPluginName()), q.a("version", this.AFInAppEventParameterName.getVersion()));
        if (true ^ this.AFInAppEventParameterName.getAdditionalParams().isEmpty()) {
            map.put((Object)"extras", this.AFInAppEventParameterName.getAdditionalParams());
        }
        return map;
    }
}

