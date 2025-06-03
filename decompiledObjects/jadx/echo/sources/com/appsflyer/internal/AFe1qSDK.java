package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFe1qSDK {
    public final AFd1aSDK AFInAppEventParameterName;

    @NonNull
    public final String AFInAppEventType;
    private final boolean AFKeystoreWrapper;

    @NonNull
    public final String valueOf;

    @NonNull
    public final AFe1aSDK values;

    public AFe1qSDK() {
    }

    public AFe1qSDK(String str) {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.valueOf = string;
            this.AFKeystoreWrapper = jSONObject.optBoolean("test_mode");
            this.AFInAppEventType = str;
            this.values = string.startsWith("default") ? AFe1aSDK.DEFAULT : AFe1aSDK.CUSTOM;
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            this.AFInAppEventParameterName = optJSONObject != null ? new AFd1aSDK(optJSONObject) : null;
        } catch (JSONException e7) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e7);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public static boolean AFKeystoreWrapper(Context context) {
        boolean isInstantApp;
        if (Build.VERSION.SDK_INT >= 26) {
            isInstantApp = context.getPackageManager().isInstantApp();
            return isInstantApp;
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        } catch (ClassNotFoundException e7) {
            AFLogger.afErrorLogForExcManagerOnly("InstantAppsRuntime not found", e7, true);
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFe1qSDK.class != obj.getClass()) {
            return false;
        }
        AFe1qSDK aFe1qSDK = (AFe1qSDK) obj;
        if (this.AFKeystoreWrapper == aFe1qSDK.AFKeystoreWrapper && this.valueOf.equals(aFe1qSDK.valueOf)) {
            return this.AFInAppEventType.equals(aFe1qSDK.AFInAppEventType);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.AFKeystoreWrapper ? 1 : 0) * 31) + this.valueOf.hashCode()) * 31) + this.AFInAppEventType.hashCode();
        AFd1aSDK aFd1aSDK = this.AFInAppEventParameterName;
        return aFd1aSDK != null ? (hashCode * 31) + aFd1aSDK.hashCode() : hashCode;
    }
}
