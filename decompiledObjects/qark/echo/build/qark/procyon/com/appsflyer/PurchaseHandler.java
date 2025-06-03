// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer;

import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.AFc1nSDK;
import java.util.Map;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFc1bSDK;
import androidx.annotation.NonNull;
import com.appsflyer.internal.AFb1gSDK;

public final class PurchaseHandler
{
    @NonNull
    private final AFb1gSDK AFInAppEventParameterName;
    @NonNull
    public final AFc1bSDK valueOf;
    @NonNull
    public final AFc1xSDK values;
    
    public PurchaseHandler(@NonNull final AFc1xSDK values) {
        this.values = values;
        this.AFInAppEventParameterName = values.AFInAppEventParameterName();
        this.valueOf = values.AFVersionDeclaration();
    }
    
    public final boolean AFInAppEventParameterName(final Map<String, Object> map, final PurchaseValidationCallback purchaseValidationCallback, final String... array) {
        final boolean afKeystoreWrapper = AFc1nSDK.AFKeystoreWrapper(map, array, this.AFInAppEventParameterName);
        if (!afKeystoreWrapper && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return afKeystoreWrapper;
    }
    
    public interface PurchaseValidationCallback
    {
        void onFailure(@NonNull final Throwable p0);
        
        void onResponse(@NonNull final ResponseNetwork<String> p0);
    }
}
