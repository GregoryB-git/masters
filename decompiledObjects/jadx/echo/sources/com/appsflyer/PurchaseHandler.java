package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1nSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* loaded from: classes.dex */
public final class PurchaseHandler {

    @NonNull
    private final AFb1gSDK AFInAppEventParameterName;

    @NonNull
    public final AFc1bSDK valueOf;

    @NonNull
    public final AFc1xSDK values;

    public interface PurchaseValidationCallback {
        void onFailure(@NonNull Throwable th);

        void onResponse(@NonNull ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(@NonNull AFc1xSDK aFc1xSDK) {
        this.values = aFc1xSDK;
        this.AFInAppEventParameterName = aFc1xSDK.AFInAppEventParameterName();
        this.valueOf = aFc1xSDK.AFVersionDeclaration();
    }

    public final boolean AFInAppEventParameterName(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean AFKeystoreWrapper = AFc1nSDK.AFKeystoreWrapper(map, strArr, this.AFInAppEventParameterName);
        if (!AFKeystoreWrapper && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return AFKeystoreWrapper;
    }
}
