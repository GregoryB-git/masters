// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public interface AFf1iSDK
{
    void AFInAppEventParameterName();
    
    void AFInAppEventType();
    
    @NotNull
    Map<String, Object> valueOf();
    
    @NotNull
    Map<String, Object> values();
    
    @Metadata
    public static final class AFa1ySDK
    {
        static {
            AFInAppEventParameterName = new AFa1ySDK();
        }
        
        private AFa1ySDK() {
        }
    }
}
