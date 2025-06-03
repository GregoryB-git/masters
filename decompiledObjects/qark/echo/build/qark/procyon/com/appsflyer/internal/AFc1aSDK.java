// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public enum AFc1aSDK
{
    AFInAppEventType("api"), 
    AFKeystoreWrapper(""), 
    values("rc");
    
    @NotNull
    public final String valueOf;
    
    private AFc1aSDK(final String valueOf) {
        this.valueOf = valueOf;
    }
}
