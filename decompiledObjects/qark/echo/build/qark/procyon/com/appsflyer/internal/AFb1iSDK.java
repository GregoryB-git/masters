// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.app.Activity;
import android.content.Context;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public interface AFb1iSDK
{
    @NotNull
    public static final AFa1vSDK valueOf = AFa1vSDK.AFInAppEventType;
    
    void AFInAppEventType(@NotNull final Context p0);
    
    boolean AFInAppEventType();
    
    void AFKeystoreWrapper(@NotNull final Context p0, @NotNull final AFa1wSDK p1);
    
    @Metadata
    public static final class AFa1vSDK
    {
        static final /* synthetic */ AFa1vSDK AFInAppEventType;
        private static long values;
        
        static {
            AFInAppEventType = new AFa1vSDK();
            AFa1vSDK.values = 500L;
        }
        
        private AFa1vSDK() {
        }
        
        public static long AFInAppEventType() {
            return AFa1vSDK.values;
        }
    }
    
    @Metadata
    public interface AFa1wSDK
    {
        void AFInAppEventType(@NotNull final Context p0);
        
        void values(@NotNull final Activity p0);
    }
}
