// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import androidx.annotation.NonNull;
import java.util.Map;

public final class AFd1wSDK extends AFd1pSDK
{
    public AFd1wSDK(@NonNull final Map<String, Object> map, final PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull final AFc1xSDK aFc1xSDK) {
        super(AFd1vSDK.AppsFlyer2dXConversionCallback, new AFd1vSDK[] { AFd1vSDK.values }, aFc1xSDK, null, map, purchaseValidationCallback);
        super.AFKeystoreWrapper.add(AFd1vSDK.AFInAppEventParameterName);
    }
    
    @Override
    public final boolean AFInAppEventParameterName() {
        final AFc1gSDK<Result> afErrorLog = (AFc1gSDK<Result>)super.afErrorLog;
        return (afErrorLog != null && afErrorLog.getStatusCode() == 424) || super.AFInAppEventParameterName();
    }
    
    @Override
    public final AFc1qSDK<String> values(@NonNull final String s) {
        final AFc1qSDK<String> values = super.AFLogger.values(this.afWarnLog(), s, this.afErrorLogForExcManagerOnly());
        if (values != null) {
            this.AFInAppEventType(values.valueOf.valueOf);
        }
        return values;
    }
}
