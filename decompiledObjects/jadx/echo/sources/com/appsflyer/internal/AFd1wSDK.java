package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFd1wSDK extends AFd1pSDK {
    public AFd1wSDK(@NonNull Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFc1xSDK aFc1xSDK) {
        super(AFd1vSDK.ARS_VALIDATE, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1xSDK, null, map, purchaseValidationCallback);
        this.AFKeystoreWrapper.add(AFd1vSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFd1pSDK, com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    public final boolean AFInAppEventParameterName() {
        ResponseNetwork responseNetwork = ((AFd1oSDK) this).afErrorLog;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 424) {
            return super.AFInAppEventParameterName();
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AFc1qSDK<String> values(@NonNull String str) {
        AFc1qSDK<String> values = ((AFd1oSDK) this).AFLogger.values(afWarnLog(), str, afErrorLogForExcManagerOnly());
        if (values != null) {
            AFInAppEventType(values.valueOf.valueOf);
        }
        return values;
    }
}
