/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.browser.customtabs.CustomTabsClient
 *  androidx.browser.customtabs.CustomTabsServiceConnection
 *  java.lang.Object
 *  java.lang.String
 */
package com.onesignal;

import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import com.onesignal.OneSignal;

class OneSignalChromeTab {
    private static boolean hasChromeTabLibrary() {
        return true;
    }

    public static boolean open(String string2, boolean bl) {
        if (!OneSignalChromeTab.hasChromeTabLibrary()) {
            return false;
        }
        string2 = new /* Unavailable Anonymous Inner Class!! */;
        return CustomTabsClient.bindCustomTabsService((Context)OneSignal.appContext, (String)"com.android.chrome", (CustomTabsServiceConnection)string2);
    }
}

