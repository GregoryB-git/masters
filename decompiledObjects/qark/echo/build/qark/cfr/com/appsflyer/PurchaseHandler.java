/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 */
package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1nSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

public final class PurchaseHandler {
    @NonNull
    private final AFb1gSDK AFInAppEventParameterName;
    @NonNull
    public final AFc1bSDK valueOf;
    @NonNull
    public final AFc1xSDK values;

    public PurchaseHandler(@NonNull AFc1xSDK aFc1xSDK) {
        this.values = aFc1xSDK;
        this.AFInAppEventParameterName = aFc1xSDK.AFInAppEventParameterName();
        this.valueOf = aFc1xSDK.AFVersionDeclaration();
    }

    public final /* varargs */ boolean AFInAppEventParameterName(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String ... arrstring) {
        boolean bl = AFc1nSDK.AFKeystoreWrapper(map, arrstring, this.AFInAppEventParameterName);
        if (!bl && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure((Throwable)new IllegalArgumentException("Invalid Request Data"));
        }
        return bl;
    }

    public static interface PurchaseValidationCallback {
        public void onFailure(@NonNull Throwable var1);

        public void onResponse(@NonNull ResponseNetwork<String> var1);
    }

}

