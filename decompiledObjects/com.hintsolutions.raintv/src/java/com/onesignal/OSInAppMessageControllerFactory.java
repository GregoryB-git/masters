/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSInAppMessageController
 *  com.onesignal.OneSignalDbHelper
 *  com.onesignal.language.LanguageContext
 *  java.lang.Object
 */
package com.onesignal;

import com.onesignal.OSInAppMessageController;
import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OSTaskController;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.language.LanguageContext;

class OSInAppMessageControllerFactory {
    private static final Object LOCK = new Object();
    private OSInAppMessageController controller;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public OSInAppMessageController getController(OneSignalDbHelper oneSignalDbHelper, OSTaskController oSTaskController, OSLogger oSLogger, OSSharedPreferences oSSharedPreferences, LanguageContext languageContext) {
        Object object;
        if (this.controller != null) return this.controller;
        Object object2 = object = LOCK;
        synchronized (object2) {
            OSInAppMessageController oSInAppMessageController;
            if (this.controller != null) return this.controller;
            this.controller = oSInAppMessageController = new OSInAppMessageController(oneSignalDbHelper, oSTaskController, oSLogger, oSSharedPreferences, languageContext);
            return this.controller;
        }
    }
}

