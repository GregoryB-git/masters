// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import android.content.Context;
import kotlin.Metadata;

@Metadata
public interface AFa1iSDK
{
    @NotNull
    Map<String, String> valueOf(@NotNull final Context p0);
    
    @Metadata
    public static final class AFa1ySDK
    {
        static {
            valueOf = new AFa1ySDK();
        }
        
        private AFa1ySDK() {
        }
    }
}
