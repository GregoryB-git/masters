// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal.platform_extension;

import W5.C;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class PluginInfo
{
    @NotNull
    private final String AFKeystoreWrapper;
    @NotNull
    private final Map<String, String> valueOf;
    @NotNull
    private final Plugin values;
    
    public PluginInfo(@NotNull final Plugin plugin, @NotNull final String s) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(s, "");
        this(plugin, s, null, 4, null);
    }
    
    public PluginInfo(@NotNull final Plugin values, @NotNull final String afKeystoreWrapper, @NotNull final Map<String, String> valueOf) {
        Intrinsics.checkNotNullParameter(values, "");
        Intrinsics.checkNotNullParameter(afKeystoreWrapper, "");
        Intrinsics.checkNotNullParameter(valueOf, "");
        this.values = values;
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.valueOf = valueOf;
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
    public final PluginInfo copy(@NotNull final Plugin plugin, @NotNull final String s, @NotNull final Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(s, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new PluginInfo(plugin, s, map);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PluginInfo)) {
            return false;
        }
        final PluginInfo pluginInfo = (PluginInfo)o;
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
    
    @Override
    public final int hashCode() {
        return (this.values.hashCode() * 31 + this.AFKeystoreWrapper.hashCode()) * 31 + this.valueOf.hashCode();
    }
    
    @NotNull
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("PluginInfo(plugin=");
        sb.append(this.values);
        sb.append(", version=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", additionalParams=");
        sb.append(this.valueOf);
        sb.append(')');
        return sb.toString();
    }
}
