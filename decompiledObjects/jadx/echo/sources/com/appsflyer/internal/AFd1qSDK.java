package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFd1qSDK extends AFd1pSDK {
    public AFd1qSDK(@NonNull Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFc1xSDK aFc1xSDK) {
        super(AFd1vSDK.PURCHASE_VALIDATE, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1xSDK, null, map, purchaseValidationCallback);
        this.AFKeystoreWrapper.add(AFd1vSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AFc1qSDK<String> values(@NonNull String str) {
        AFc1qSDK<String> AFInAppEventParameterName = ((AFd1oSDK) this).AFLogger.AFInAppEventParameterName(afWarnLog(), str, afErrorLogForExcManagerOnly());
        if (AFInAppEventParameterName != null) {
            AFInAppEventType(AFInAppEventParameterName.valueOf.valueOf);
        }
        return AFInAppEventParameterName;
    }
}
