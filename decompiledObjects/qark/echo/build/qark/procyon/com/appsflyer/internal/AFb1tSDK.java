// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public interface AFb1tSDK
{
    void AFInAppEventParameterName();
    
    void AFInAppEventParameterName(final String p0);
    
    void AFInAppEventParameterName(@NotNull final String p0, final int p1, @NotNull final String p2);
    
    void AFInAppEventParameterName(@NotNull final String p0, @NotNull final String p1);
    
    void AFInAppEventParameterName(@NotNull final String p0, @NotNull final String... p1);
    
    void AFInAppEventType();
    
    void AFInAppEventType(@NotNull final Throwable p0);
    
    void AFKeystoreWrapper();
    
    boolean afInfoLog();
    
    void valueOf();
    
    void valueOf(final String p0, final PackageManager p1, final AFc1xSDK p2);
    
    void valueOf(@NotNull final String p0, @NotNull final String p1);
    
    void values();
}
