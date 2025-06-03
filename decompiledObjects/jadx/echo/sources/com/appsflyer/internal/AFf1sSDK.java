package com.appsflyer.internal;

import W5.F;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes.dex */
public final class AFf1sSDK implements AFf1tSDK {

    @NotNull
    private PluginInfo AFInAppEventParameterName = new PluginInfo(Plugin.NATIVE, "6.12.2", null, 4, null);

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void AFInAppEventParameterName(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.AFInAppEventParameterName = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    @NotNull
    public final Map<String, Object> AFKeystoreWrapper() {
        Map<String, Object> g7;
        g7 = F.g(V5.q.a("platform", this.AFInAppEventParameterName.getPlugin().getPluginName()), V5.q.a("version", this.AFInAppEventParameterName.getVersion()));
        if (true ^ this.AFInAppEventParameterName.getAdditionalParams().isEmpty()) {
            g7.put("extras", this.AFInAppEventParameterName.getAdditionalParams());
        }
        return g7;
    }
}
