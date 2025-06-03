// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.text.SimpleDateFormat;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public interface AFe1vSDK
{
    @NotNull
    String AFInAppEventParameterName();
    
    void AFInAppEventParameterName(@NotNull final Map<String, Object> p0);
    
    String AFInAppEventType();
    
    void AFInAppEventType(@NotNull final Map<String, Object> p0);
    
    void AFInAppEventType(final boolean p0, @NotNull final Map<String, Object> p1, final int p2);
    
    String AFKeystoreWrapper();
    
    void AFKeystoreWrapper(@NotNull final Map<String, Object> p0, final boolean p1);
    
    String AFLogger();
    
    boolean afDebugLog();
    
    boolean afErrorLog();
    
    String afInfoLog();
    
    boolean afRDLog();
    
    long valueOf();
    
    void valueOf(@NotNull final Map<String, ?> p0);
    
    void valueOf(@NotNull final Map<String, Object> p0, @NotNull final String p1);
    
    long values();
    
    String values(@NotNull final SimpleDateFormat p0);
    
    void values(@NotNull final Map<String, Object> p0);
    
    void values(@NotNull final Map<String, Object> p0, final String p1);
}
