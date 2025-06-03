// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer;

import com.appsflyer.internal.AFc1tSDK;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import com.appsflyer.internal.AFc1vSDK;
import kotlin.Metadata;
import com.appsflyer.internal.AFc1uSDK;

@Metadata
public final class CreateOneLinkHttpTask implements AFc1uSDK
{
    @NotNull
    private final AFc1vSDK valueOf;
    
    public CreateOneLinkHttpTask() {
    }
    
    public CreateOneLinkHttpTask(final AFc1vSDK valueOf) {
        Intrinsics.checkNotNullParameter(valueOf, "");
        this.valueOf = valueOf;
    }
    
    @Override
    public final void valueOf(final byte[] array, final Map<String, String> map, final int n) {
        Intrinsics.checkNotNullParameter(array, "");
        Intrinsics.checkNotNullParameter(array, "");
        if (new AFc1tSDK(array, map, 2000).AFInAppEventParameterName()) {
            this.valueOf.values();
        }
    }
    
    @Deprecated
    public interface ResponseListener
    {
        void onResponse(final String p0);
        
        void onResponseError(final String p0);
    }
}
