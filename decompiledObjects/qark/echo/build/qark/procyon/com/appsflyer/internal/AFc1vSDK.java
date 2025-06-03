// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public interface AFc1vSDK
{
    boolean AFInAppEventParameterName(@NotNull final String... p0);
    
    int AFInAppEventType();
    
    @NotNull
    List<AFc1zSDK> AFKeystoreWrapper();
    
    String values(@NotNull final Throwable p0, @NotNull final String p1);
    
    boolean values();
}
