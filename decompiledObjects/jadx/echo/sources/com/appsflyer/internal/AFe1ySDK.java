package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFc1bSDK.AnonymousClass4;
import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes.dex */
public final class AFe1ySDK {
    public static String valueOf;
    public final AFb1dSDK values;

    static {
        StringBuilder sb = new StringBuilder("https://%sregister.%s/api/v");
        sb.append(AFa1eSDK.AFInAppEventType);
        valueOf = sb.toString();
    }

    public AFe1ySDK(@NonNull Context context) {
        this.values = AFa1eSDK.valueOf().values(context);
    }

    public static boolean AFInAppEventType(@NonNull AFb1dSDK aFb1dSDK) {
        return aFb1dSDK.valueOf("sentRegisterRequestToAF");
    }

    public static void valueOf(String str) {
        AFc1xSDK AFInAppEventType = AFa1eSDK.valueOf().AFInAppEventType();
        AFd1eSDK aFd1eSDK = new AFd1eSDK(str, AFInAppEventType);
        AFc1bSDK AFVersionDeclaration = AFInAppEventType.AFVersionDeclaration();
        AFVersionDeclaration.AFKeystoreWrapper.execute(AFVersionDeclaration.new AnonymousClass4(aFd1eSDK));
    }

    public static boolean values(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th);
        }
        return AFa1fSDK.values(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
    }

    public final AFb1uSDK AFInAppEventParameterName() {
        String string;
        String string2;
        String values = this.values.values("afUninstallToken", (String) null);
        long valueOf2 = this.values.valueOf("afUninstallToken_received_time", 0L);
        boolean valueOf3 = this.values.valueOf("afUninstallToken_queued");
        this.values.values("afUninstallToken_queued", false);
        if (values == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            values = string2.split(",")[r0.length - 1];
        }
        if (valueOf2 == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split = string.split(",");
            if (split.length >= 2) {
                try {
                    valueOf2 = Long.parseLong(split[split.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (values != null) {
            return new AFb1uSDK(values, valueOf2, valueOf3);
        }
        return null;
    }
}
