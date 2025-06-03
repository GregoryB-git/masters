package com.appsflyer.internal.platform_extension;

import W5.F;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes.dex */
public final class PluginInfo {

    @NotNull
    private final String AFKeystoreWrapper;

    @NotNull
    private final Map<String, String> valueOf;

    @NotNull
    private final Plugin values;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PluginInfo(@NotNull Plugin plugin, @NotNull String str) {
        this(plugin, str, null, 4, null);
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PluginInfo copy$default(PluginInfo pluginInfo, Plugin plugin, String str, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            plugin = pluginInfo.values;
        }
        if ((i7 & 2) != 0) {
            str = pluginInfo.AFKeystoreWrapper;
        }
        if ((i7 & 4) != 0) {
            map = pluginInfo.valueOf;
        }
        return pluginInfo.copy(plugin, str, map);
    }

    @NotNull
    public final Plugin component1() {
        return this.values;
    }

    @NotNull
    public final String component2() {
        return this.AFKeystoreWrapper;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.valueOf;
    }

    @NotNull
    public final PluginInfo copy(@NotNull Plugin plugin, @NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new PluginInfo(plugin, str, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginInfo)) {
            return false;
        }
        PluginInfo pluginInfo = (PluginInfo) obj;
        return this.values == pluginInfo.values && Intrinsics.a(this.AFKeystoreWrapper, pluginInfo.AFKeystoreWrapper) && Intrinsics.a(this.valueOf, pluginInfo.valueOf);
    }

    @NotNull
    public final Map<String, String> getAdditionalParams() {
        return this.valueOf;
    }

    @NotNull
    public final Plugin getPlugin() {
        return this.values;
    }

    @NotNull
    public final String getVersion() {
        return this.AFKeystoreWrapper;
    }

    public final int hashCode() {
        return (((this.values.hashCode() * 31) + this.AFKeystoreWrapper.hashCode()) * 31) + this.valueOf.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PluginInfo(plugin=");
        sb.append(this.values);
        sb.append(", version=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", additionalParams=");
        sb.append(this.valueOf);
        sb.append(')');
        return sb.toString();
    }

    public PluginInfo(@NotNull Plugin plugin, @NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.values = plugin;
        this.AFKeystoreWrapper = str;
        this.valueOf = map;
    }

    public /* synthetic */ PluginInfo(Plugin plugin, String str, Map map, int i7, g gVar) {
        this(plugin, str, (i7 & 4) != 0 ? F.d() : map);
    }
}
