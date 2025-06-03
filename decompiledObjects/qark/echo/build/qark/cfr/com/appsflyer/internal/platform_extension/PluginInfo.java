/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package com.appsflyer.internal.platform_extension;

import W5.C;
import com.appsflyer.internal.platform_extension.Plugin;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class PluginInfo {
    @NotNull
    private final String AFKeystoreWrapper;
    @NotNull
    private final Map<String, String> valueOf;
    @NotNull
    private final Plugin values;

    public PluginInfo(@NotNull Plugin plugin, @NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)plugin, "");
        Intrinsics.checkNotNullParameter(string2, "");
        this(plugin, string2, null, 4, null);
    }

    public PluginInfo(@NotNull Plugin plugin, @NotNull String string2, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter((Object)plugin, "");
        Intrinsics.checkNotNullParameter(string2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.values = plugin;
        this.AFKeystoreWrapper = string2;
        this.valueOf = map;
    }

    public /* synthetic */ PluginInfo(Plugin plugin, String string2, Map map, int n8, g g8) {
        if ((n8 & 4) != 0) {
            map = C.d();
        }
        this(plugin, string2, map);
    }

    public static /* synthetic */ PluginInfo copy$default(PluginInfo pluginInfo, Plugin plugin, String string2, Map map, int n8, Object object) {
        if ((n8 & 1) != 0) {
            plugin = pluginInfo.values;
        }
        if ((n8 & 2) != 0) {
            string2 = pluginInfo.AFKeystoreWrapper;
        }
        if ((n8 & 4) != 0) {
            map = pluginInfo.valueOf;
        }
        return pluginInfo.copy(plugin, string2, map);
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
    public final PluginInfo copy(@NotNull Plugin plugin, @NotNull String string2, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter((Object)plugin, "");
        Intrinsics.checkNotNullParameter(string2, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new PluginInfo(plugin, string2, map);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof PluginInfo)) {
            return false;
        }
        object = (PluginInfo)object;
        if (this.values != object.values) {
            return false;
        }
        if (!Intrinsics.a(this.AFKeystoreWrapper, object.AFKeystoreWrapper)) {
            return false;
        }
        if (!Intrinsics.a(this.valueOf, object.valueOf)) {
            return false;
        }
        return true;
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
        return (this.values.hashCode() * 31 + this.AFKeystoreWrapper.hashCode()) * 31 + this.valueOf.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PluginInfo(plugin=");
        stringBuilder.append((Object)this.values);
        stringBuilder.append(", version=");
        stringBuilder.append(this.AFKeystoreWrapper);
        stringBuilder.append(", additionalParams=");
        stringBuilder.append(this.valueOf);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

