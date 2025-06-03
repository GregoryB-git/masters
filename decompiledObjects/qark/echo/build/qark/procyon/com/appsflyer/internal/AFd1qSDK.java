// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import androidx.annotation.NonNull;
import java.util.Map;

public final class AFd1qSDK extends AFd1pSDK
{
    public AFd1qSDK(@NonNull final Map<String, Object> map, final PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull final AFc1xSDK aFc1xSDK) {
        super(AFd1vSDK.getLevel, new AFd1vSDK[] { AFd1vSDK.values }, aFc1xSDK, null, map, purchaseValidationCallback);
        super.AFKeystoreWrapper.add(AFd1vSDK.AFInAppEventParameterName);
    }
    
    @Override
    public final AFc1qSDK<String> values(@NonNull final String s) {
        final AFc1qSDK<String> afInAppEventParameterName = super.AFLogger.AFInAppEventParameterName(this.afWarnLog(), s, this.afErrorLogForExcManagerOnly());
        if (afInAppEventParameterName != null) {
            this.AFInAppEventType(afInAppEventParameterName.valueOf.valueOf);
        }
        return afInAppEventParameterName;
    }
}
