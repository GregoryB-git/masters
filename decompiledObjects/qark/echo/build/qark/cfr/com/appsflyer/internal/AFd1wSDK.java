/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  java.util.Set
 */
package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFc1gSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1pSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1zSDK;
import java.util.Map;
import java.util.Set;

public final class AFd1wSDK
extends AFd1pSDK {
    public AFd1wSDK(@NonNull Map<String, Object> object, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFc1xSDK aFc1xSDK) {
        super(AFd1vSDK.AppsFlyer2dXConversionCallback, new AFd1vSDK[]{AFd1vSDK.values}, aFc1xSDK, null, (Map<String, Object>)object, purchaseValidationCallback);
        object = AFd1vSDK.AFInAppEventParameterName;
        this.AFKeystoreWrapper.add(object);
    }

    @Override
    public final boolean AFInAppEventParameterName() {
        AFc1gSDK aFc1gSDK = this.afErrorLog;
        if (aFc1gSDK != null && aFc1gSDK.getStatusCode() == 424) {
            return true;
        }
        return super.AFInAppEventParameterName();
    }

    @Override
    public final AFc1qSDK<String> values(@NonNull String aFc1qSDK) {
        aFc1qSDK = this.AFLogger.values(this.afWarnLog(), (String)((Object)aFc1qSDK), this.afErrorLogForExcManagerOnly());
        if (aFc1qSDK != null) {
            this.AFInAppEventType(aFc1qSDK.valueOf.valueOf);
        }
        return aFc1qSDK;
    }
}

