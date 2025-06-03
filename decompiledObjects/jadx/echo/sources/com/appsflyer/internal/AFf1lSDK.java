package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public final class AFf1lSDK extends AFf1pSDK {
    final ProviderInfo AFInAppEventType;
    private final AFc1xSDK valueOf;

    public AFf1lSDK(ProviderInfo providerInfo, Runnable runnable, AFc1xSDK aFc1xSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.valueOf = aFc1xSDK;
        this.AFInAppEventType = providerInfo;
    }

    public static ContentProviderClient valueOf(Context context, Uri uri) {
        String str;
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e7) {
            e = e7;
            str = "[Preinstall]: Failed to acquire unstable content providerClient due to SecurityException";
            AFLogger.afErrorLog(str, e, false);
            return null;
        } catch (Throwable th) {
            e = th;
            str = "[Preinstall]: Failed to acquire unstable content providerClient due to unexpected throwable";
            AFLogger.afErrorLog(str, e, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    public final void valueOf(final Context context) {
        this.valueOf.AFInAppEventType().execute(new Runnable() { // from class: com.appsflyer.internal.AFf1lSDK.2
            /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 262
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1lSDK.AnonymousClass2.run():void");
            }
        });
    }
}
